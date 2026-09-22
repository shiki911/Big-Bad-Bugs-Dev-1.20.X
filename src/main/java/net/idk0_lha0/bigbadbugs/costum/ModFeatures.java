package net.idk0_lha0.bigbadbugs.costum;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(Registries.FEATURE, BigBadBugs.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            CALAMITES_TREE = FEATURES.register(
                    "calamites-tree",
                    () -> new StructureTreeFeature("calamites-tree", new BlockPos(-5, 0, -5)));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            CORDAITES_TREE = FEATURES.register(
                    "cordaites-tree",
                    () -> new StructureTreeFeature("cordaites-tree", new BlockPos(-4, 0, -5)));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            LEPIDODENDRON_TREE = FEATURES.register(
                    "lepidodendron-tree",
                    () -> new StructureTreeFeature("lepidodendron-tree", new BlockPos(-4, 0, -5)));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            SIGILLARIA_TREE = FEATURES.register(
                    "sigillaria-tree",
                    () -> new StructureTreeFeature("sigillaria-tree", new BlockPos(-6, 0, -4)));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            PSARONIUS_TREE = FEATURES.register(
                    "psaronius-tree",
                    () -> new StructureTreeFeature("psaronius-tree", new BlockPos(-4, 0, -4)));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>>
            MEDULLOSA_TREE = FEATURES.register(
                    "medullosa-tree",
                    () -> new StructureTreeFeature("medullosa-tree", new BlockPos(-4, 0, -5)));
}
