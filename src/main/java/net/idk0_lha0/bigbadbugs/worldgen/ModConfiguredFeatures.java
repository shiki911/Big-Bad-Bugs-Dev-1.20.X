package net.idk0_lha0.bigbadbugs.worldgen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.costum.ModFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CALAMITES_KEY = registerKey("calamites");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CORDAITES_KEY = registerKey("cordiates");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LEPIDODENDRON_KEY = registerKey("lepidodendron");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SIGILLARIA_KEY = registerKey("sigillaria");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PSARONIUS_KEY = registerKey("psaronius");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDULLOSA_KEY = registerKey("medullosa");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, CALAMITES_KEY, ModFeatures.CALAMITES_TREE.get(), NoneFeatureConfiguration.INSTANCE);
        register(context, CORDAITES_KEY, ModFeatures.CORDAITES_TREE.get(), NoneFeatureConfiguration.INSTANCE);
        register(context, LEPIDODENDRON_KEY, ModFeatures.LEPIDODENDRON_TREE.get(), NoneFeatureConfiguration.INSTANCE);
        register(context, SIGILLARIA_KEY, ModFeatures.SIGILLARIA_TREE.get(), NoneFeatureConfiguration.INSTANCE);
        register(context, PSARONIUS_KEY, ModFeatures.PSARONIUS_TREE.get(), NoneFeatureConfiguration.INSTANCE);
        register(context, MEDULLOSA_KEY, ModFeatures.MEDULLOSA_TREE.get(), NoneFeatureConfiguration.INSTANCE);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID, name));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}