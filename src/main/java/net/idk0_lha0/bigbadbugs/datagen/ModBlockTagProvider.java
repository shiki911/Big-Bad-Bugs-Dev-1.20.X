package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.costum.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BigBadBugs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModFossilBlock.CALAMITES_LOG_FOSSIl.get())
                .add(ModFossilBlock.CALAMITES_LEAVES_FOSSIL.get())
                .add(ModFossilBlock.FOSSIL_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
        .add(ModFossilBlock.FOSSIL_BLOCK.get()).
                add(ModFossilBlock.CALAMITES_LEAVES_FOSSIL.get()).
                add(ModFossilBlock.CALAMITES_LOG_FOSSIl.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModTreeBlock.CALAMITES_LOG.get())
                .add(ModTreeBlock.CORDAITES_LOG.get())
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get())
                .add(ModTreeBlock.PSARONIUS_LOG.get())
                .add(ModTreeBlock.SIGILLARIA_LOG.get())
                .add(ModTreeBlock.MEDULLOSA_LOG.get())

                .add(ModTreeBlock.CALAMITES_WOOD.get())
                .add(ModTreeBlock.CORDAITES_WOOD.get())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get())
                .add(ModTreeBlock.PSARONIUS_WOOD.get())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get());

        this.tag(BlockTags.LOGS)
                .add(ModTreeBlock.CALAMITES_LOG.get())
                .add(ModTreeBlock.CORDAITES_LOG.get())
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get())
                .add(ModTreeBlock.PSARONIUS_LOG.get())
                .add(ModTreeBlock.SIGILLARIA_LOG.get())
                .add(ModTreeBlock.MEDULLOSA_LOG.get())

                .add(ModTreeBlock.CALAMITES_WOOD.get())
                .add(ModTreeBlock.CORDAITES_WOOD.get())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get())
                .add(ModTreeBlock.PSARONIUS_WOOD.get())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get());

        this.tag(ModTags.Blocks.CALAMITES_LOGS)
                .add(ModTreeBlock.CALAMITES_LOG.get())
                .add(ModTreeBlock.CALAMITES_WOOD.get());

        this.tag(ModTags.Blocks.CORDAITES_LOGS)
                .add(ModTreeBlock.CORDAITES_LOG.get())
                .add(ModTreeBlock.CORDAITES_WOOD.get());

        this.tag(ModTags.Blocks.LEPIDODENDRON_LOGS)
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get())
                .add(ModTreeBlock.LEPIDODENDRON_WOOD.get());

        this.tag(ModTags.Blocks.SIGILLARIA_LOGS)
                .add(ModTreeBlock.SIGILLARIA_LOG.get())
                .add(ModTreeBlock.SIGILLARIA_WOOD.get());

        this.tag(ModTags.Blocks.PSARONIUS_LOGS)
                .add(ModTreeBlock.PSARONIUS_LOG.get())
                .add(ModTreeBlock.PSARONIUS_WOOD.get());

        this.tag(ModTags.Blocks.MEDULLOSA_LOGS)
                .add(ModTreeBlock.MEDULLOSA_LOG.get())
                .add(ModTreeBlock.MEDULLOSA_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModTreeBlock.CALAMITES_PLANKS.get())
                .add(ModTreeBlock.CORDAITES_PLANKS.get())
                .add(ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .add(ModTreeBlock.PSARONIUS_PLANKS.get())
                .add(ModTreeBlock.SIGILLARIA_PLANKS.get())
                .add(ModTreeBlock.MEDULLOSA_PLANKS.get());

        this.tag(BlockTags.SAPLINGS)
                .add(ModTreeBlock.CALAMITES_SAPLING.get())
                .add(ModTreeBlock.CORDAITES_SAPLING.get())
                .add(ModTreeBlock.LEPIDODENDRON_SAPLING.get())
                .add(ModTreeBlock.PSARONIUS_SAPLING.get())
                .add(ModTreeBlock.SIGILLARIA_SAPLING.get())
                .add(ModTreeBlock.MEDULLOSA_SAPLING.get());
    }
}
