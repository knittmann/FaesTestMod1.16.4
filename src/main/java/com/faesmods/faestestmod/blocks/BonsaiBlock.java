package com.faesmods.faestestmod.blocks;

import com.faesmods.faestestmod.init.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class BonsaiBlock extends BushBlock implements IGrowable {

    public static final IntegerProperty BONSAI_AGE = BlockStateProperties.AGE_0_7;
    private static final VoxelShape GROWING_SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
//    private static final VoxelShape[] SHAPE = new VoxelShape[]{
//            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
//            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
//            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
//            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)};

    public BonsaiBlock() {
        super(AbstractBlock.Properties.create(Material.PLANTS)
                .doesNotBlockMovement().sound(SoundType.CROP)
                .zeroHardnessAndResistance()
                .tickRandomly());
    }

    public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return GROWING_SHAPE;
    }

//    @Override
//    public IntegerProperty getAgeProperty() {
//        return BONSAI_AGE;
//    }
//
//    public int getMaxAge() {
//        return 7;
//    }
//
//    @Override
//    protected IItemProvider getSeedsItem() {
//        return RegistryHandler.BONSAI_SEEDS.get();
//    }

//    @Override
//    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
//        if (random.nextInt(7) != 0) {
//            super.randomTick(state, worldIn, pos, random);
//        }
//    }

//    @Override
//    protected int getBonemealAgeIncrease(World worldIn) {
//        return super.getBonemealAgeIncrease(worldIn) / 7;
//    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BONSAI_AGE);
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {

    }
}
