package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.costum.ModTags;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, BigBadBugs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModTreeBlock.CALAMITES_LOG.get().asItem())
                .add(ModTreeBlock.CORDAITES_LOG.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get().asItem())
                .add(ModTreeBlock.PSARONIUS_LOG.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_LOG.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_LOG.get().asItem())

                .add(ModTreeBlock.CALAMITES_WOOD.get().asItem())
                .add(ModTreeBlock.CORDAITES_WOOD.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get().asItem())
                .add(ModTreeBlock.PSARONIUS_WOOD.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get().asItem());

        this.tag(ModTags.Items.CALAMITES_LOGS)
                .add(ModTreeBlock.CALAMITES_LOG.get().asItem())
                .add(ModTreeBlock.CALAMITES_WOOD.get().asItem());

        this.tag(ModTags.Items.CORDAITES_LOGS)
                .add(ModTreeBlock.CORDAITES_LOG.get().asItem())
                .add(ModTreeBlock.CORDAITES_WOOD.get().asItem());

        this.tag(ModTags.Items.LEPIDODENDRON_LOGS)
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get().asItem());

        this.tag(ModTags.Items.SIGILLARIA_LOGS)
                .add(ModTreeBlock.SIGILLARIA_LOG.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get().asItem());

        this.tag(ModTags.Items.PSARONIUS_LOGS)
                .add(ModTreeBlock.PSARONIUS_LOG.get().asItem())
                .add(ModTreeBlock.PSARONIUS_WOOD.get().asItem());

        this.tag(ModTags.Items.MEDULLOSA_LOGS)
                .add(ModTreeBlock.MEDULLOSA_LOG.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get().asItem());

        tag(ItemTags.LOGS)
                .add(ModTreeBlock.CALAMITES_LOG.get().asItem())
                .add(ModTreeBlock.CORDAITES_LOG.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get().asItem())
                .add(ModTreeBlock.PSARONIUS_LOG.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_LOG.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_LOG.get().asItem())

                .add(ModTreeBlock.CALAMITES_WOOD.get().asItem())
                .add(ModTreeBlock.CORDAITES_WOOD.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get().asItem())
                .add(ModTreeBlock.PSARONIUS_WOOD.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModTreeBlock.CALAMITES_PLANKS.get().asItem())
                .add(ModTreeBlock.CORDAITES_PLANKS.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_PLANKS.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_PLANKS.get().asItem())
                .add(ModTreeBlock.PSARONIUS_PLANKS.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_PLANKS.get().asItem());

        tag(ItemTags.SAPLINGS)
                .add(ModTreeBlock.CALAMITES_SAPLING.get().asItem())
                .add(ModTreeBlock.CORDAITES_SAPLING.get().asItem())
                .add(ModTreeBlock.SIGILLARIA_SAPLING.get().asItem())
                .add(ModTreeBlock.LEPIDODENDRON_SAPLING.get().asItem())
                .add(ModTreeBlock.PSARONIUS_SAPLING.get().asItem())
                .add(ModTreeBlock.MEDULLOSA_SAPLING.get().asItem());
    }
}
