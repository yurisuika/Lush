package com.yurisuika.lush.block;

import com.yurisuika.lush.tag.ModBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.*;

public class BranchBlock extends ConnectingBlock implements Waterloggable {

    private final Block strippedBlock;

    public static final BooleanProperty NORTHTWIG = BooleanProperty.of("northtwig");
    public static final BooleanProperty EASTTWIG = BooleanProperty.of("easttwig");
    public static final BooleanProperty SOUTHTWIG = BooleanProperty.of("southtwig");
    public static final BooleanProperty WESTTWIG = BooleanProperty.of("westtwig");
    public static final BooleanProperty UPTWIG = BooleanProperty.of("uptwig");
    public static final BooleanProperty DOWNTWIG = BooleanProperty.of("downtwig");

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    protected BranchBlock(Block strippedBlock, Settings settings) {
        super(0.25F, settings);
        this.strippedBlock = strippedBlock;
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(NORTH, false)
                .with(EAST, false)
                .with(SOUTH, false)
                .with(WEST, false)
                .with(UP, false)
                .with(DOWN, false)
                .with(WATERLOGGED, false)
                .with(NORTHTWIG, false)
                .with(EASTTWIG, false)
                .with(SOUTHTWIG, false)
                .with(WESTTWIG, false)
                .with(UPTWIG, false)
                .with(DOWNTWIG, false)
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
        boolean twigD = blockStateD.isIn(ModBlockTags.TWIGS);
        boolean twigU = blockStateU.isIn(ModBlockTags.TWIGS);
        boolean twigN = blockStateN.isIn(ModBlockTags.TWIGS);
        boolean twigE = blockStateE.isIn(ModBlockTags.TWIGS);
        boolean twigS = blockStateS.isIn(ModBlockTags.TWIGS);
        boolean twigW = blockStateW.isIn(ModBlockTags.TWIGS);
        return this.getDefaultState()
                .with(DOWN, blockStateD.isOf(this) || logD || dirt)
                .with(UP, blockStateU.isOf(this) || logU)
                .with(NORTH, blockStateN.isOf(this) || logN)
                .with(EAST, blockStateE.isOf(this) || logE)
                .with(SOUTH, blockStateS.isOf(this) || logS)
                .with(WEST, blockStateW.isOf(this) || logW)
                .with(DOWNTWIG, twigD)
                .with(UPTWIG, twigU)
                .with(NORTHTWIG, twigN)
                .with(EASTTWIG, twigE)
                .with(SOUTHTWIG, twigS)
                .with(WESTTWIG, twigW);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.NORTH) {
//            return state.with(NORTHTWIG, true);
//        }
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.SOUTH) {
//            return state.with(SOUTHTWIG, true);
//        }
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.EAST) {
//            return state.with(EASTTWIG, true);
//        }
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.WEST) {
//            return state.with(WESTTWIG, true);
//        }
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.UP) {
//            return state.with(UPTWIG, true);
//        }
//        if (neighborState.isIn(ModBlockTags.TWIGS) && direction == Direction.DOWN) {
//            return state.with(DOWNTWIG, true);
//        }
        if (state.canPlaceAt(world, pos)) {
//            Block neighborBlock = neighborState.getBlock();
//            boolean flag = neighborState.isIn(BlockTags.LOGS_THAT_BURN) || neighborBlock == this || direction == Direction.DOWN && neighborState.isIn(BlockTags.DIRT);
//            return state.with(FACING_PROPERTIES.get(direction), flag);
            BlockState blockStateD = world.getBlockState(pos.down());
            BlockState blockStateU = world.getBlockState(pos.up());
            BlockState blockStateN = world.getBlockState(pos.north());
            BlockState blockStateE = world.getBlockState(pos.east());
            BlockState blockStateS = world.getBlockState(pos.south());
            BlockState blockStateW = world.getBlockState(pos.west());
            FluidState fluidState = world.getFluidState(pos);
            boolean dirt = blockStateD.isIn(BlockTags.DIRT);
            boolean logD = blockStateD.isIn(BlockTags.LOGS_THAT_BURN);
            boolean logU = blockStateU.isIn(BlockTags.LOGS_THAT_BURN);
            boolean logN = blockStateN.isIn(BlockTags.LOGS_THAT_BURN);
            boolean logE = blockStateE.isIn(BlockTags.LOGS_THAT_BURN);
            boolean logS = blockStateS.isIn(BlockTags.LOGS_THAT_BURN);
            boolean logW = blockStateW.isIn(BlockTags.LOGS_THAT_BURN);
            boolean twigD = blockStateD.isIn(ModBlockTags.TWIGS);
            boolean twigU = blockStateU.isIn(ModBlockTags.TWIGS);
            boolean twigN = blockStateN.isIn(ModBlockTags.TWIGS);
            boolean twigE = blockStateE.isIn(ModBlockTags.TWIGS);
            boolean twigS = blockStateS.isIn(ModBlockTags.TWIGS);
            boolean twigW = blockStateW.isIn(ModBlockTags.TWIGS);
            boolean water = fluidState.isStill();
            return this.getDefaultState()
                    .with(DOWN, blockStateD.isOf(this) || logD || dirt)
                    .with(UP, blockStateU.isOf(this) || logU)
                    .with(NORTH, blockStateN.isOf(this) || logN)
                    .with(EAST, blockStateE.isOf(this) || logE)
                    .with(SOUTH, blockStateS.isOf(this) || logS)
                    .with(WEST, blockStateW.isOf(this) || logW)
                    .with(DOWNTWIG, twigD)
                    .with(UPTWIG, twigU)
                    .with(NORTHTWIG, twigN)
                    .with(EASTTWIG, twigE)
                    .with(SOUTHTWIG, twigS)
                    .with(WESTTWIG, twigW)
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

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

//    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
//        BlockState blockState = world.getBlockState(pos.down());
//        boolean bl = !world.getBlockState(pos.up()).isAir() && !blockState.isAir();
//        Iterator var6 = Type.HORIZONTAL.iterator();
//
//        BlockState blockState3;
//        do {
//            BlockPos blockPos;
//            BlockState blockState2;
//            do {
//                if (!var6.hasNext()) {
//                    return blockState.isOf(this) || blockState.isOf(Blocks.GRASS_BLOCK) || blockState.isOf(Blocks.OAK_LOG);
//                }
//
//                Direction direction = (Direction)var6.next();
//                blockPos = pos.offset(direction);
//                blockState2 = world.getBlockState(blockPos);
//            } while(!blockState2.isOf(this));
//
//            if (bl) {
//                return false;
//            }
//
//            blockState3 = world.getBlockState(blockPos.down());
//        } while(!blockState3.isOf(this) && !blockState3.isOf(Blocks.GRASS_BLOCK));
//
//        return true;
//    }

//    @Override
//    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
//        if (!state.canPlaceAt(world, pos)) {
//            world.breakBlock(pos, true);
//        }
//    }


    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED, NORTHTWIG, EASTTWIG, SOUTHTWIG, WESTTWIG, UPTWIG, DOWNTWIG);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem() instanceof AxeItem) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.setBlockState(pos, this.strippedBlock.getDefaultState()
                    .with(NORTH, state.get(NORTH))
                    .with(EAST, state.get(EAST))
                    .with(SOUTH, state.get(SOUTH))
                    .with(WEST, state.get(WEST))
                    .with(UP, state.get(UP))
                    .with(DOWN, state.get(DOWN))
                    .with(WATERLOGGED, state.get(WATERLOGGED))
                    .with(NORTHTWIG, state.get(NORTHTWIG))
                    .with(EASTTWIG, state.get(EASTTWIG))
                    .with(SOUTHTWIG, state.get(SOUTHTWIG))
                    .with(WESTTWIG, state.get(WESTTWIG))
                    .with(UPTWIG, state.get(UPTWIG))
                    .with(DOWNTWIG, state.get(DOWNTWIG))
            );

            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

}