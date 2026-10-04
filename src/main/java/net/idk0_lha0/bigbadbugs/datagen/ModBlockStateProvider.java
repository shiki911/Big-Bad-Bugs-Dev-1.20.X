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
        simpleBlockWithItem(ModTreeBlock.CALAMITES_WOOD.get(),
                models().cubeAll(
                        "calamites_wood",
                        modLoc("block/calamites_log")
                ));

        blockWithItem(ModTreeBlock.CALAMITES_PLANKS);
        stairsBlock(ModTreeBlock.CALAMITES_STAIRS.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));
        slabBlock(ModTreeBlock.CALAMITES_SLAB.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));
        buttonBlock(ModTreeBlock.CALAMITES_BUTTON.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.CALAMITES_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));
        fenceBlock(ModTreeBlock.CALAMITES_FENCE.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.CALAMITES_FENCE_GATE.get(), blockTexture(ModTreeBlock.CALAMITES_PLANKS.get()));

        blockItem(ModTreeBlock.CALAMITES_STAIRS);
        blockItem(ModTreeBlock.CALAMITES_SLAB);
        blockItem(ModTreeBlock.CALAMITES_PRESSURE_PLATE);
        blockItem(ModTreeBlock.CALAMITES_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.CALAMITES_LEAVES.get(),
                models().singleTexture(
                        "calamites_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/calamites_leaves")
                ));
        saplingBlock(ModTreeBlock.CALAMITES_SAPLING);


        logBlock(((RotatedPillarBlock) ModTreeBlock.CORDAITES_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.CORDAITES_LOG.get(),
                models().getExistingFile(modLoc("block/cordaites_log"))
        );
        simpleBlockWithItem(ModTreeBlock.CORDAITES_WOOD.get(),
                models().cubeAll(
                        "cordaites_wood",
                        modLoc("block/cordaites_log")
                ));

        blockWithItem(ModTreeBlock.CORDAITES_PLANKS);
        stairsBlock(ModTreeBlock.CORDAITES_STAIRS.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));
        slabBlock(ModTreeBlock.CORDAITES_SLAB.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));
        buttonBlock(ModTreeBlock.CORDAITES_BUTTON.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.CORDAITES_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));
        fenceBlock(ModTreeBlock.CORDAITES_FENCE.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.CORDAITES_FENCE_GATE.get(), blockTexture(ModTreeBlock.CORDAITES_PLANKS.get()));

        blockItem(ModTreeBlock.CORDAITES_STAIRS);
        blockItem(ModTreeBlock.CORDAITES_SLAB);
        blockItem(ModTreeBlock.CORDAITES_PRESSURE_PLATE);
        blockItem(ModTreeBlock.CORDAITES_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.CORDAITES_LEAVES.get(),
                models().singleTexture(
                        "cordaites_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/cordiates_leaves")
                ));
        saplingBlock(ModTreeBlock.CORDAITES_SAPLING);


        logBlock(((RotatedPillarBlock) ModTreeBlock.LEPIDODENDRON_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.LEPIDODENDRON_LOG.get(),
                models().getExistingFile(modLoc("block/lepidodendron_log"))
        );
        simpleBlockWithItem(ModTreeBlock.LEPIDODENDRON_WOOD.get(),
                models().cubeAll(
                        "lepidodendron_wood",
                        modLoc("block/lepidodendron_log")
                ));

        blockWithItem(ModTreeBlock.LEPIDODENDRON_PLANKS);
        stairsBlock(ModTreeBlock.LEPIDODENDRON_STAIRS.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));
        slabBlock(ModTreeBlock.LEPIDODENDRON_SLAB.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));
        buttonBlock(ModTreeBlock.LEPIDODENDRON_BUTTON.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.LEPIDODENDRON_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));
        fenceBlock(ModTreeBlock.LEPIDODENDRON_FENCE.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.LEPIDODENDRON_FENCE_GATE.get(), blockTexture(ModTreeBlock.LEPIDODENDRON_PLANKS.get()));

        blockItem(ModTreeBlock.LEPIDODENDRON_STAIRS);
        blockItem(ModTreeBlock.LEPIDODENDRON_SLAB);
        blockItem(ModTreeBlock.LEPIDODENDRON_PRESSURE_PLATE);
        blockItem(ModTreeBlock.LEPIDODENDRON_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.LEPIDODENDRON_LEAVES.get(),
                models().singleTexture(
                        "lepidodendron_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/lepidodendron_leaves")
                ));
        saplingBlock(ModTreeBlock.LEPIDODENDRON_SAPLING);


        logBlock(((RotatedPillarBlock) ModTreeBlock.PSARONIUS_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.PSARONIUS_LOG.get(),
                models().getExistingFile(modLoc("block/psaronius_log"))
        );
        simpleBlockWithItem(ModTreeBlock.PSARONIUS_WOOD.get(),
                models().cubeAll(
                        "psaronius_wood",
                        modLoc("block/psaronius_log")
                ));

        blockWithItem(ModTreeBlock.PSARONIUS_PLANKS);
        stairsBlock(ModTreeBlock.PSARONIUS_STAIRS.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));
        slabBlock(ModTreeBlock.PSARONIUS_SLAB.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));
        buttonBlock(ModTreeBlock.PSARONIUS_BUTTON.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.PSARONIUS_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));
        fenceBlock(ModTreeBlock.PSARONIUS_FENCE.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.PSARONIUS_FENCE_GATE.get(), blockTexture(ModTreeBlock.PSARONIUS_PLANKS.get()));

        blockItem(ModTreeBlock.PSARONIUS_STAIRS);
        blockItem(ModTreeBlock.PSARONIUS_SLAB);
        blockItem(ModTreeBlock.PSARONIUS_PRESSURE_PLATE);
        blockItem(ModTreeBlock.PSARONIUS_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.PSARONIUS_LEAVES.get(),
                models().singleTexture(
                        "psaronius_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/psaronius_leaves")
                ));
        saplingBlock(ModTreeBlock.PSARONIUS_SAPLING);

        logBlock(((RotatedPillarBlock) ModTreeBlock.SIGILLARIA_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.SIGILLARIA_LOG.get(),
                models().getExistingFile(modLoc("block/sigillaria_log"))
        );
        simpleBlockWithItem(ModTreeBlock.SIGILLARIA_WOOD.get(),
                models().cubeAll(
                        "sigillaria_wood",
                        modLoc("block/sigillaria_log")
                ));

        blockWithItem(ModTreeBlock.SIGILLARIA_PLANKS);
        stairsBlock(ModTreeBlock.SIGILLARIA_STAIRS.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));
        slabBlock(ModTreeBlock.SIGILLARIA_SLAB.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));
        buttonBlock(ModTreeBlock.SIGILLARIA_BUTTON.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.SIGILLARIA_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));
        fenceBlock(ModTreeBlock.SIGILLARIA_FENCE.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.SIGILLARIA_FENCE_GATE.get(), blockTexture(ModTreeBlock.SIGILLARIA_PLANKS.get()));

        blockItem(ModTreeBlock.SIGILLARIA_STAIRS);
        blockItem(ModTreeBlock.SIGILLARIA_SLAB);
        blockItem(ModTreeBlock.SIGILLARIA_PRESSURE_PLATE);
        blockItem(ModTreeBlock.SIGILLARIA_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.SIGILLARIA_LEAVES.get(),
                models().singleTexture(
                        "sigillaria_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/sigillaria_leaves")
                ));
        saplingBlock(ModTreeBlock.SIGILLARIA_SAPLING);


        logBlock(((RotatedPillarBlock) ModTreeBlock.MEDULLOSA_LOG.get()));
        simpleBlockItem(
                ModTreeBlock.MEDULLOSA_LOG.get(),
                models().getExistingFile(modLoc("block/medullosa_log"))
        );

        simpleBlockWithItem(ModTreeBlock.MEDULLOSA_WOOD.get(),
                models().cubeAll(
                        "medullosa_wood",
                        modLoc("block/medullosa_log")
                ));

        blockWithItem(ModTreeBlock.MEDULLOSA_PLANKS);
        stairsBlock(ModTreeBlock.MEDULLOSA_STAIRS.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));
        slabBlock(ModTreeBlock.MEDULLOSA_SLAB.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));
        buttonBlock(ModTreeBlock.MEDULLOSA_BUTTON.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));
        pressurePlateBlock(ModTreeBlock.MEDULLOSA_PRESSURE_PLATE.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));
        fenceBlock(ModTreeBlock.MEDULLOSA_FENCE.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));
        fenceGateBlock(ModTreeBlock.MEDULLOSA_FENCE_GATE.get(), blockTexture(ModTreeBlock.MEDULLOSA_PLANKS.get()));

        blockItem(ModTreeBlock.MEDULLOSA_STAIRS);
        blockItem(ModTreeBlock.MEDULLOSA_SLAB);
        blockItem(ModTreeBlock.MEDULLOSA_PRESSURE_PLATE);
        blockItem(ModTreeBlock.MEDULLOSA_FENCE_GATE);

        simpleBlockWithItem(ModTreeBlock.MEDULLOSA_LEAVES.get(),
                models().singleTexture(
                        "medullosa_leaves",
                        mcLoc("block/leaves"),
                        "all",
                        modLoc("block/medullosa_leaves")
                ));
        saplingBlock(ModTreeBlock.MEDULLOSA_SAPLING);
    }

    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockTree(RegistryObject<RotatedPillarBlock> block) {
        logBlock(block.get());
        simpleBlockItem(
                block.get(),
                models().getExistingFile(modLoc("block/" + block.getId().getPath()))
        );
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("bigbadbugs:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("bigbadbugs:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()) + appendix));
    }
}
