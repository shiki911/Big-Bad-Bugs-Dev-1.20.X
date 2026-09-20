package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BigBadBugs.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModFossilBlock.FOSSIL_BLOCK);
        blockWithItem(ModFossilBlock.CALAMITES_LEAVES_FOSSIL);
        logBlock(((RotatedPillarBlock) ModFossilBlock.CALAMITES_LOG_FOSSIl.get()));
        simpleBlockItem(
                ModFossilBlock.CALAMITES_LOG_FOSSIl.get(),
                models().getExistingFile(modLoc("block/calamites_log_fossil"))
        );


        logBlock(((RotatedPillarBlock) ModTreeBlock.CALAMITES_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.CALAMITES_LOG.get(),
                models().getExistingFile(modLoc("block/calamites_log"))
        );

        blockWithItem(ModTreeBlock.CALAMITES_PLANKS);
        simpleBlockWithItem(ModTreeBlock.CALAMITES_LEAVES.get(),
                models().singleTexture(
                        "calamites_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/calamites_leaves")
                ));


        logBlock(((RotatedPillarBlock) ModTreeBlock.CORDAITES_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.CORDAITES_LOG.get(),
                models().getExistingFile(modLoc("block/cordaites_log"))
        );

        blockWithItem(ModTreeBlock.CORDAITES_PLANKS);
        simpleBlockWithItem(ModTreeBlock.CORDAITES_LEAVES.get(),
                models().singleTexture(
                        "cordaites_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/cordiates_leaves")
                ));


        logBlock(((RotatedPillarBlock) ModTreeBlock.LEPIDODENDRON_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.LEPIDODENDRON_LOG.get(),
                models().getExistingFile(modLoc("block/lepidodendron_log"))
        );

        blockWithItem(ModTreeBlock.LEPIDODENDRON_PLANKS);
        simpleBlockWithItem(ModTreeBlock.LEPIDODENDRON_LEAVES.get(),
                models().singleTexture(
                        "lepidodendron_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/lepidodendron_leaves")
                ));


        logBlock(((RotatedPillarBlock) ModTreeBlock.PSARONIUS_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.PSARONIUS_LOG.get(),
                models().getExistingFile(modLoc("block/psaronius_log"))
        );

        blockWithItem(ModTreeBlock.PSARONIUS_PLANKS);
        simpleBlockWithItem(ModTreeBlock.PSARONIUS_LEAVES.get(),
                models().singleTexture(
                        "psaronius_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/psaronius_leaves")
                ));

        logBlock(((RotatedPillarBlock) ModTreeBlock.SIGILLARIA_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.SIGILLARIA_LOG.get(),
                models().getExistingFile(modLoc("block/sigillaria_log"))
        );

        blockWithItem(ModTreeBlock.SIGILLARIA_PLANKS);
        simpleBlockWithItem(ModTreeBlock.SIGILLARIA_LEAVES.get(),
                models().singleTexture(
                        "sigillaria_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/sigillaria_leaves")
                ));
    }

    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }

    private void blockTree(RegistryObject<RotatedPillarBlock> block) {
        logBlock(block.get());
        simpleBlockItem(
                block.get(),
                models().getExistingFile(modLoc("block/" + block.getId().getPath()))
        );
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("bigbadbugs:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockWithItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("bigbadbugs:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()) + appendix));
    }
}
