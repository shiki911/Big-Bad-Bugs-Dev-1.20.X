package net.idk0_lha0.bigbadbugs.worldgen.tree;

import net.idk0_lha0.bigbadbugs.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class ModTreeGrowers {
    public static final AbstractTreeGrower CALAMITES = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.CALAMITES_KEY;
        }
    };

    public static final AbstractTreeGrower CORDAITES = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.CORDAITES_KEY;
        }
    };

    public static final AbstractTreeGrower LEPIDODENDRON = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.LEPIDODENDRON_KEY;
        }
    };

    public static final AbstractTreeGrower SIGILLARIA = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.SIGILLARIA_KEY;
        }
    };

    public static final AbstractTreeGrower PSARONIUS = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.PSARONIUS_KEY;
        }
    };

    public static final AbstractTreeGrower MEDULLOSA = new AbstractTreeGrower() {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
            return ModConfiguredFeatures.MEDULLOSA_KEY;
        }
    };
}
