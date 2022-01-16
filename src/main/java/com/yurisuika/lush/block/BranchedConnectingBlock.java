package com.yurisuika.lush.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;

public class BranchedConnectingBlock extends Block {
    private static final Direction[] FACINGS = Direction.values();
    public static final BooleanProperty NORTH;
    public static final BooleanProperty EAST;
    public static final BooleanProperty SOUTH;
    public static final BooleanProperty WEST;
    public static final BooleanProperty UP;
    public static final BooleanProperty DOWN;
    public static final BooleanProperty BRANCHEDNORTH;
    public static final BooleanProperty BRANCHEDEAST;
    public static final BooleanProperty BRANCHEDSOUTH;
    public static final BooleanProperty BRANCHEDWEST;
    public static final BooleanProperty BRANCHEDUP;
    public static final BooleanProperty BRANCHEDDOWN;
    public static final Map<Direction, BooleanProperty> FACING_PROPERTIES;
    public static final Map<Direction, BooleanProperty> BRANCHED_FACING_PROPERTIES;
    protected final VoxelShape[] connectionsToShape;

    protected BranchedConnectingBlock(float radius, Settings settings) {
        super(settings);
        this.connectionsToShape = this.generateFacingsToShapeMap(radius);
    }

    private VoxelShape[] generateFacingsToShapeMap(float radius) {
        float f = 0.5F - radius;
        float g = 0.5F + radius;
        VoxelShape voxelShape = Block.createCuboidShape((double)(f * 16.0F), (double)(f * 16.0F), (double)(f * 16.0F), (double)(g * 16.0F), (double)(g * 16.0F), (double)(g * 16.0F));
        VoxelShape[] voxelShapes = new VoxelShape[FACINGS.length];

        for(int i = 0; i < FACINGS.length; ++i) {
            Direction direction = FACINGS[i];
            voxelShapes[i] = VoxelShapes.cuboid(0.5D + Math.min((double)(-radius), (double)direction.getOffsetX() * 0.5D), 0.5D + Math.min((double)(-radius), (double)direction.getOffsetY() * 0.5D), 0.5D + Math.min((double)(-radius), (double)direction.getOffsetZ() * 0.5D), 0.5D + Math.max((double)radius, (double)direction.getOffsetX() * 0.5D), 0.5D + Math.max((double)radius, (double)direction.getOffsetY() * 0.5D), 0.5D + Math.max((double)radius, (double)direction.getOffsetZ() * 0.5D));
        }

        VoxelShape[] i = new VoxelShape[64];

        for(int direction = 0; direction < 64; ++direction) {
            VoxelShape voxelShape2 = voxelShape;

            for(int j = 0; j < FACINGS.length; ++j) {
                if ((direction & 1 << j) != 0) {
                    voxelShape2 = VoxelShapes.union(voxelShape2, voxelShapes[j]);
                }
            }

            i[direction] = voxelShape2;
        }

        return i;
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.connectionsToShape[this.getConnectionMask(state)];
    }

    protected int getConnectionMask(BlockState state) {
        int i = 0;

        for(int j = 0; j < FACINGS.length; ++j) {
            if ((Boolean)state.get((Property)FACING_PROPERTIES.get(FACINGS[j])) || (Boolean)state.get((Property)BRANCHED_FACING_PROPERTIES.get(FACINGS[j]))) {
                i |= 1 << j;
            }
        }

        return i;
    }

    static {
        BRANCHEDUP = BooleanProperty.of("branchedup");
        BRANCHEDDOWN = BooleanProperty.of("brancheddown");
        BRANCHEDNORTH = BooleanProperty.of("branchednorth");
        BRANCHEDEAST = BooleanProperty.of("branchedeast");
        BRANCHEDSOUTH = BooleanProperty.of("branchedsouth");
        BRANCHEDWEST = BooleanProperty.of("branchedwest");

        NORTH = Properties.NORTH;
        EAST = Properties.EAST;
        SOUTH = Properties.SOUTH;
        WEST = Properties.WEST;
        UP = Properties.UP;
        DOWN = Properties.DOWN;

        FACING_PROPERTIES = ImmutableMap.copyOf((Map) Util.make(Maps.newEnumMap(Direction.class), (directions) -> {
            directions.put(Direction.NORTH, NORTH);
            directions.put(Direction.EAST, EAST);
            directions.put(Direction.SOUTH, SOUTH);
            directions.put(Direction.WEST, WEST);
            directions.put(Direction.UP, UP);
            directions.put(Direction.DOWN, DOWN);
        }));

        BRANCHED_FACING_PROPERTIES = ImmutableMap.copyOf((Map) Util.make(Maps.newEnumMap(Direction.class), (directions) -> {
            directions.put(Direction.NORTH, BRANCHEDNORTH);
            directions.put(Direction.EAST, BRANCHEDEAST);
            directions.put(Direction.SOUTH, BRANCHEDSOUTH);
            directions.put(Direction.WEST, BRANCHEDWEST);
            directions.put(Direction.UP, BRANCHEDUP);
            directions.put(Direction.DOWN, BRANCHEDDOWN);
        }));
    }
}
