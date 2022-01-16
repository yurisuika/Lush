package com.yurisuika.lush.block;

import com.yurisuika.lush.tag.ModBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

public class StrippedBranchBlock extends BranchedConnectingBlock implements Waterloggable {

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public StrippedBranchBlock(AbstractBlock.Settings settings) {
        super(0.25F, settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(NORTH, false)
                .with(EAST, false)
                .with(SOUTH, false)
                .with(WEST, false)
                .with(UP, false)
                .with(DOWN, false)
                .with(WATERLOGGED, false)
                .with(BRANCHEDNORTH, false)
                .with(BRANCHEDEAST, false)
                .with(BRANCHEDSOUTH, false)
                .with(BRANCHEDWEST, false)
                .with(BRANCHEDUP, false)
                .with(BRANCHEDDOWN, false)
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
        boolean dirtD = blockStateD.isIn(BlockTags.DIRT);
        boolean trunkD = blockStateD.isIn(ModBlockTags.TRUNKS);
        boolean trunkU = blockStateU.isIn(ModBlockTags.TRUNKS);
        boolean trunkN = blockStateN.isIn(ModBlockTags.TRUNKS);
        boolean trunkE = blockStateE.isIn(ModBlockTags.TRUNKS);
        boolean trunkS = blockStateS.isIn(ModBlockTags.TRUNKS);
        boolean trunkW = blockStateW.isIn(ModBlockTags.TRUNKS);
        boolean branchD = blockStateD.isIn(ModBlockTags.BRANCHES);
        boolean branchU = blockStateU.isIn(ModBlockTags.BRANCHES);
        boolean branchN = blockStateN.isIn(ModBlockTags.BRANCHES);
        boolean branchE = blockStateE.isIn(ModBlockTags.BRANCHES);
        boolean branchS = blockStateS.isIn(ModBlockTags.BRANCHES);
        boolean branchW = blockStateW.isIn(ModBlockTags.BRANCHES);
        boolean twigD = blockStateD.isIn(ModBlockTags.TWIGS);
        boolean twigU = blockStateU.isIn(ModBlockTags.TWIGS);
        boolean twigN = blockStateN.isIn(ModBlockTags.TWIGS);
        boolean twigE = blockStateE.isIn(ModBlockTags.TWIGS);
        boolean twigS = blockStateS.isIn(ModBlockTags.TWIGS);
        boolean twigW = blockStateW.isIn(ModBlockTags.TWIGS);
        return this.getDefaultState()
                .with(DOWN, trunkD || branchD || dirtD)
                .with(UP, trunkU || branchU)
                .with(NORTH, trunkN || branchN)
                .with(EAST, trunkE || branchE)
                .with(SOUTH, trunkS || branchS)
                .with(WEST, trunkW || branchW)
                .with(BRANCHEDDOWN, twigD)
                .with(BRANCHEDUP, twigU)
                .with(BRANCHEDNORTH, twigN)
                .with(BRANCHEDEAST, twigE)
                .with(BRANCHEDSOUTH, twigS)
                .with(BRANCHEDWEST, twigW);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.canPlaceAt(world, pos)) {
            BlockState blockStateD = world.getBlockState(pos.down());
            BlockState blockStateU = world.getBlockState(pos.up());
            BlockState blockStateN = world.getBlockState(pos.north());
            BlockState blockStateE = world.getBlockState(pos.east());
            BlockState blockStateS = world.getBlockState(pos.south());
            BlockState blockStateW = world.getBlockState(pos.west());
            FluidState fluidState = world.getFluidState(pos);
            boolean water = fluidState.isStill();
            boolean dirtD = blockStateD.isIn(BlockTags.DIRT);
            boolean trunkD = blockStateD.isIn(ModBlockTags.TRUNKS);
            boolean trunkU = blockStateU.isIn(ModBlockTags.TRUNKS);
            boolean trunkN = blockStateN.isIn(ModBlockTags.TRUNKS);
            boolean trunkE = blockStateE.isIn(ModBlockTags.TRUNKS);
            boolean trunkS = blockStateS.isIn(ModBlockTags.TRUNKS);
            boolean trunkW = blockStateW.isIn(ModBlockTags.TRUNKS);
            boolean branchD = blockStateD.isIn(ModBlockTags.BRANCHES);
            boolean branchU = blockStateU.isIn(ModBlockTags.BRANCHES);
            boolean branchN = blockStateN.isIn(ModBlockTags.BRANCHES);
            boolean branchE = blockStateE.isIn(ModBlockTags.BRANCHES);
            boolean branchS = blockStateS.isIn(ModBlockTags.BRANCHES);
            boolean branchW = blockStateW.isIn(ModBlockTags.BRANCHES);
            boolean twigD = blockStateD.isIn(ModBlockTags.TWIGS);
            boolean twigU = blockStateU.isIn(ModBlockTags.TWIGS);
            boolean twigN = blockStateN.isIn(ModBlockTags.TWIGS);
            boolean twigE = blockStateE.isIn(ModBlockTags.TWIGS);
            boolean twigS = blockStateS.isIn(ModBlockTags.TWIGS);
            boolean twigW = blockStateW.isIn(ModBlockTags.TWIGS);
            return this.getDefaultState()
                    .with(DOWN, trunkD || branchD || dirtD)
                    .with(UP, trunkU || branchU)
                    .with(NORTH, trunkN || branchN)
                    .with(EAST, trunkE || branchE)
                    .with(SOUTH, trunkS || branchS)
                    .with(WEST, trunkW || branchW)
                    .with(BRANCHEDDOWN, twigD)
                    .with(BRANCHEDUP, twigU)
                    .with(BRANCHEDNORTH, twigN)
                    .with(BRANCHEDEAST, twigE)
                    .with(BRANCHEDSOUTH, twigS)
                    .with(BRANCHEDWEST, twigW)
                    .with(WATERLOGGED, water);
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

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockStateD = world.getBlockState(pos.down());
        BlockState blockStateU = world.getBlockState(pos.up());
        BlockState blockStateN = world.getBlockState(pos.north());
        BlockState blockStateE = world.getBlockState(pos.east());
        BlockState blockStateS = world.getBlockState(pos.south());
        BlockState blockStateW = world.getBlockState(pos.west());
        boolean dirtD = blockStateD.isIn(BlockTags.DIRT);
        boolean trunkD = blockStateD.isIn(ModBlockTags.TRUNKS);
        boolean trunkU = blockStateU.isIn(ModBlockTags.TRUNKS);
        boolean trunkN = blockStateN.isIn(ModBlockTags.TRUNKS);
        boolean trunkE = blockStateE.isIn(ModBlockTags.TRUNKS);
        boolean trunkS = blockStateS.isIn(ModBlockTags.TRUNKS);
        boolean trunkW = blockStateW.isIn(ModBlockTags.TRUNKS);
        boolean branchD = blockStateD.isIn(ModBlockTags.BRANCHES);
        boolean branchU = blockStateU.isIn(ModBlockTags.BRANCHES);
        boolean branchN = blockStateN.isIn(ModBlockTags.BRANCHES);
        boolean branchE = blockStateE.isIn(ModBlockTags.BRANCHES);
        boolean branchS = blockStateS.isIn(ModBlockTags.BRANCHES);
        boolean branchW = blockStateW.isIn(ModBlockTags.BRANCHES);

        return dirtD || trunkD || trunkU || trunkN || trunkE || trunkS || trunkW || branchD || branchU || branchN || branchE || branchS || branchW;
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED, BRANCHEDNORTH, BRANCHEDEAST, BRANCHEDSOUTH, BRANCHEDWEST, BRANCHEDUP, BRANCHEDDOWN);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

}
