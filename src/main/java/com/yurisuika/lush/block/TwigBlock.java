package com.yurisuika.lush.block;

import com.yurisuika.lush.tag.ModBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
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

import java.util.Random;

public class TwigBlock extends ConnectingBlock implements Waterloggable {

    private final Block strippedBlock;

    public static final BooleanProperty BRANCHED = BooleanProperty.of("branched");

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public TwigBlock(Block strippedBlock, Settings settings) {
        super(0.125F, settings);
        this.strippedBlock = strippedBlock;
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(NORTH, false)
                .with(EAST, false)
                .with(SOUTH, false)
                .with(WEST, false)
                .with(UP, false)
                .with(DOWN, false)
                .with(WATERLOGGED, false)
                .with(BRANCHED, false)
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
        boolean leavesD = blockStateD.isIn(BlockTags.LEAVES);
        boolean leavesU = blockStateU.isIn(BlockTags.LEAVES);
        boolean leavesN = blockStateN.isIn(BlockTags.LEAVES);
        boolean leavesE = blockStateE.isIn(BlockTags.LEAVES);
        boolean leavesS = blockStateS.isIn(BlockTags.LEAVES);
        boolean leavesW = blockStateW.isIn(BlockTags.LEAVES);
        return this.getDefaultState()
                .with(DOWN, trunkD || branchD || twigD || leavesD || dirtD)
                .with(UP, trunkU || branchU || twigU || leavesU)
                .with(NORTH, trunkN || branchN || twigN || leavesN)
                .with(EAST, trunkE || branchE ||twigE || leavesE)
                .with(SOUTH, trunkS || branchS || twigS || leavesS)
                .with(WEST, trunkW || branchW || twigW || leavesW)
                .with(BRANCHED, leavesD || leavesU || leavesN || leavesE || leavesS || leavesW);
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
            boolean leavesD = blockStateD.isIn(BlockTags.LEAVES);
            boolean leavesU = blockStateU.isIn(BlockTags.LEAVES);
            boolean leavesN = blockStateN.isIn(BlockTags.LEAVES);
            boolean leavesE = blockStateE.isIn(BlockTags.LEAVES);
            boolean leavesS = blockStateS.isIn(BlockTags.LEAVES);
            boolean leavesW = blockStateW.isIn(BlockTags.LEAVES);
            return this.getDefaultState()
                    .with(DOWN, trunkD || branchD || twigD || leavesD || dirtD)
                    .with(UP, trunkU || branchU || twigU || leavesU)
                    .with(NORTH, trunkN || branchN || twigN || leavesN)
                    .with(EAST, trunkE || branchE ||twigE || leavesE)
                    .with(SOUTH, trunkS || branchS || twigS || leavesS)
                    .with(WEST, trunkW || branchW || twigW || leavesW)
                    .with(BRANCHED, leavesD || leavesU || leavesN || leavesE || leavesS || leavesW)
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
        boolean twigD = blockStateD.isIn(ModBlockTags.TWIGS);
        boolean twigU = blockStateU.isIn(ModBlockTags.TWIGS);
        boolean twigN = blockStateN.isIn(ModBlockTags.TWIGS);
        boolean twigE = blockStateE.isIn(ModBlockTags.TWIGS);
        boolean twigS = blockStateS.isIn(ModBlockTags.TWIGS);
        boolean twigW = blockStateW.isIn(ModBlockTags.TWIGS);

        return dirtD || trunkD || trunkU || trunkN || trunkE || trunkS || trunkW || branchD || branchU || branchN || branchE || branchS || branchW || twigD || twigU || twigN || twigE || twigS || twigW;
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, UP, DOWN, WATERLOGGED, BRANCHED);
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
                    .with(BRANCHED, state.get(BRANCHED))
            );

            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

}