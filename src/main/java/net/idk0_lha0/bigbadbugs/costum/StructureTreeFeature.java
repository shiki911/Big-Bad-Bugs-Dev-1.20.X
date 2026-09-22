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


public class StructureTreeFeature extends Feature<NoneFeatureConfiguration> {

    private final ResourceLocation structureId;
    private final BlockPos offset;

    public StructureTreeFeature(String structureName, BlockPos offset) {
        super(NoneFeatureConfiguration.CODEC);
        this.structureId = ResourceLocation.fromNamespaceAndPath(
                BigBadBugs.MOD_ID, structureName);
        this.offset = offset;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        try {

            BigBadBugs.LOGGER.info("A");

            var manager = context.level().getLevel().getStructureManager();
            BigBadBugs.LOGGER.info("B");

            StructureTemplate template = manager.get(structureId).orElse(null);
            BigBadBugs.LOGGER.info("C");

            if (template == null) {
                BigBadBugs.LOGGER.error("Couldn't find structure {}", structureId);
                return false;
            }

            BigBadBugs.LOGGER.info("Size: {}", template.getSize());

            StructurePlaceSettings settings = new StructurePlaceSettings()
                    .setIgnoreEntities(true)
                    .addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK)
                    .addProcessor(BlockIgnoreProcessor.AIR);
            BigBadBugs.LOGGER.info("E");

            BlockPos pos = context.origin().offset(offset);
            BigBadBugs.LOGGER.info("F");

            context.level().removeBlock(context.origin(), false);

            BigBadBugs.LOGGER.info("Origin: {}", context.origin());
            BigBadBugs.LOGGER.info("Paste : {}", pos);
            BigBadBugs.LOGGER.info("Size: {}", template.getSize());

            boolean placed = template.placeInWorld(
                    context.level(), pos, pos, settings, context.random(), 2
            );

            BigBadBugs.LOGGER.info("G: " + placed);
            return placed;
        } catch (Exception e){
            BigBadBugs.LOGGER.error("Failed to place " + this.structureId, e);
            return false;
        }
    }
}