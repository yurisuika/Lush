package com.yurisuika.lush.block;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class StrippedTwigBlock extends ConnectingBlock implements Waterloggable {

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final BooleanProperty NORTHTWIG = BooleanProperty.of("northtwig");
    public static final BooleanProperty EASTTWIG = BooleanProperty.of("easttwig");
    public static final BooleanProperty SOUTHTWIG = BooleanProperty.of("southtwig");
    public static final BooleanProperty WESTTWIG = BooleanProperty.of("westtwig");
    public static final BooleanProperty UPTWIG = BooleanProperty.of("uptwig");
    public static final BooleanProperty DOWNTWIG = BooleanProperty.of("downtwig");

    protected StrippedTwigBlock(AbstractBlock.Settings settings) {
        super(0.125F, settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(NORTH, false)
                .with(EAST, false)
                .with(SOUTH, false)
                .with(WEST, false)
                .with(UP, false)
                .with(DOWN, false)
                .with(WATERLOGGED, false)
        );
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.withConnectionProperties(ctx.getWorld(), ctx.getBlockPos()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    public BlockState withConnectionProperties(BlockView world, BlockPos pos) {
        BlockState blockStateD = world.getBlockState(pos.down());
        BlockState blockStateU = world.getBlockState(pos.up());
        BlockState blockStateN = world.getBlockState(pos.north());
        BlockState blockStateE = world.getBlockState(pos.east());
        BlockState blockStateS = world.getBlockState(pos.south());
        BlockState blockStateW = world.getBlockState(pos.west());
        boolean dirt = blockStateD.isIn(BlockTags.DIRT);
        boolean logD = blockStateD.isIn(BlockTags.LOGS_THAT_BURN);
        boolean logU = blockStateU.isIn(BlockTags.LOGS_THAT_BURN);
        boolean logN = blockStateN.isIn(BlockTags.LOGS_THAT_BURN);
        boolean logE = blockStateE.isIn(BlockTags.LOGS_THAT_BURN);
        boolean logS = blockStateS.isIn(BlockTags.LOGS_THAT_BURN);
        boolean logW = blockStateW.isIn(BlockTags.LOGS_THAT_BURN);
        return this.getDefaultState()
                .with(DOWN, blockStateD.isOf(this) || logD || dirt)
                .with(UP, blockStateU.isOf(this) || logU)
                .with(NORTH, blockStateN.isOf(this) || logN)
                .with(EAST, blockStateE.isOf(this) || logE)
                .with(SOUTH, blockStateS.isOf(this) || logS)
                .with(WEST, blockStateW.isOf(this) || logW);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.canPlaceAt(world, pos)) {
            Block neighborBlock = neighborState.getBlock();
            boolean flag = neighborState.isIn(BlockTags.LOGS_THAT_BURN) || neighborBlock == this || direction == Direction.DOWN && neighborState.isIn(BlockTags.DIRT);
            return state.with(FACING_PROPERTIES.get(direction), flag);
        }
        else {
            if (!state.canPlaceAt(world, pos)) {
                world.createAndScheduleBlockTick(pos, this, 1);
                return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
            }
            else if (state.get(WATERLOGGED)) {
                world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
                return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
            }
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

}
