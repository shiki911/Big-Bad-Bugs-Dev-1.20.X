package net.idk0_lha0.bigbadbugs.costum;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModLeavesProcessor extends StructureProcessor {

    @Override
    protected StructureProcessorType<?> getType() {
        return null;
    }

    @Override
    public StructureTemplate.StructureBlockInfo process(
        LevelReader level,
        BlockPos pos,
        BlockPos pivot,
        StructureTemplate.StructureBlockInfo originalInfo,
        StructureTemplate.StructureBlockInfo currentInfo,
        StructurePlaceSettings settings,
        StructureTemplate template) {

        BlockState state = currentInfo.state();

        if (state.getBlock() instanceof LeavesBlock) {
            state = state.setValue(LeavesBlock.PERSISTENT, false);

            return new StructureTemplate.StructureBlockInfo(
                    currentInfo.pos(),
                    state,
                    currentInfo.nbt()
            );
        }

        return currentInfo;
    }
}
