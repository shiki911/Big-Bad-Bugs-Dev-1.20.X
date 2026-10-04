package net.idk0_lha0.bigbadbugs.costum;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

import java.util.Objects;


public class StructureTreeFeature extends Feature<NoneFeatureConfiguration> {

    private final ResourceLocation structureId;
    private final BlockPos offset;

    public StructureTreeFeature(String structureName, BlockPos offset) {
        super(NoneFeatureConfiguration.CODEC);
        /* NeoForge
        this.structureId = ResourceLocation.fromNamespaceAndPath(
                BigBadBugs.MOD_ID, structureName);
        this.offset = offset;
         */
        //ForgeOptifine
        this.structureId = ResourceLocation.tryBuild(BigBadBugs.MOD_ID,structureName);
        this.offset = offset;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        var manager = context.level().getLevel().getStructureManager();

        StructureTemplate template = manager.get(structureId).orElse(null);

        StructurePlaceSettings settings = new StructurePlaceSettings()
                .setIgnoreEntities(true)
                .addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK)
                .addProcessor(BlockIgnoreProcessor.AIR)
                .addProcessor(new ModLeavesProcessor());

        BlockPos pos = context.origin().offset(offset);

        context.level().removeBlock(context.origin(), false);

        boolean placed = template.placeInWorld(
                context.level(), pos, pos, settings, context.random(), 2
        );

        return placed;
    }
}