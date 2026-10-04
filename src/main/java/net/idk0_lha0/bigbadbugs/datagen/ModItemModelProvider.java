package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, BigBadBugs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FOSSIL.get());

        saplingItem(ModTreeBlock.CALAMITES_SAPLING);
        saplingItem(ModTreeBlock.CORDAITES_SAPLING);
        saplingItem(ModTreeBlock.LEPIDODENDRON_SAPLING);
        saplingItem(ModTreeBlock.PSARONIUS_SAPLING);
        saplingItem(ModTreeBlock.SIGILLARIA_SAPLING);
        saplingItem(ModTreeBlock.MEDULLOSA_SAPLING);

        buttonItem(ModTreeBlock.CALAMITES_BUTTON, ModTreeBlock.CALAMITES_PLANKS);
        buttonItem(ModTreeBlock.CORDAITES_BUTTON, ModTreeBlock.CORDAITES_PLANKS);
        buttonItem(ModTreeBlock.LEPIDODENDRON_BUTTON, ModTreeBlock.LEPIDODENDRON_PLANKS);
        buttonItem(ModTreeBlock.PSARONIUS_BUTTON, ModTreeBlock.PSARONIUS_PLANKS);
        buttonItem(ModTreeBlock.SIGILLARIA_BUTTON, ModTreeBlock.SIGILLARIA_PLANKS);
        buttonItem(ModTreeBlock.MEDULLOSA_BUTTON, ModTreeBlock.MEDULLOSA_PLANKS);

        fenceItem(ModTreeBlock.CALAMITES_FENCE, ModTreeBlock.CALAMITES_PLANKS);
        fenceItem(ModTreeBlock.CORDAITES_FENCE, ModTreeBlock.CORDAITES_PLANKS);
        fenceItem(ModTreeBlock.LEPIDODENDRON_FENCE, ModTreeBlock.LEPIDODENDRON_PLANKS);
        fenceItem(ModTreeBlock.PSARONIUS_FENCE, ModTreeBlock.PSARONIUS_PLANKS);
        fenceItem(ModTreeBlock.SIGILLARIA_FENCE, ModTreeBlock.SIGILLARIA_PLANKS);
        fenceItem(ModTreeBlock.MEDULLOSA_FENCE, ModTreeBlock.MEDULLOSA_PLANKS);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID,"block/" + item.getId().getPath()));
    }

    private void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BigBadBugs.MOD_ID,"item/" + item.getId().getPath()));
    }
}
