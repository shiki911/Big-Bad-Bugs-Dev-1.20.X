package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
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

        tag(BlockTags.LOGS)
                .add(ModTreeBlock.CALAMITES_LOG.get())
                .add(ModTreeBlock.CORDAITES_LOG.get())
                .add(ModTreeBlock.LEPIDODENDRON_LOG.get())
                .add(ModTreeBlock.PSARONIUS_LOG.get())
                .add(ModTreeBlock.SIGILLARIA_LOG.get());

        tag(BlockTags.PLANKS)
        .add(ModTreeBlock.CALAMITES_PLANKS.get())
                .add(ModTreeBlock.CORDAITES_PLANKS.get())
                .add(ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .add(ModTreeBlock.PSARONIUS_PLANKS.get())
                .add(ModTreeBlock.SIGILLARIA_PLANKS.get());
    }
}
