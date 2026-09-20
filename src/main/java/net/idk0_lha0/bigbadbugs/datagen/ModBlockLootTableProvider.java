package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate(){
        this.dropSelf(ModFossilBlock.CALAMITES_LOG_FOSSIl.get());
        this.dropSelf(ModFossilBlock.CALAMITES_LEAVES_FOSSIL.get());

        this.add(ModFossilBlock.FOSSIL_BLOCK.get(),
                block -> createOreDrop(ModFossilBlock.FOSSIL_BLOCK.get(), ModItems.FOSSIL.get()));

        this.dropSelf(ModTreeBlock.CALAMITES_LOG.get());
        this.dropSelf(ModTreeBlock.CALAMITES_PLANKS.get());

        this.dropSelf(ModTreeBlock.LEPIDODENDRON_LOG.get());
        this.dropSelf(ModTreeBlock.LEPIDODENDRON_PLANKS.get());

        this.dropSelf(ModTreeBlock.CORDAITES_LOG.get());
        this.dropSelf(ModTreeBlock.CORDAITES_PLANKS.get());

        this.dropSelf(ModTreeBlock.PSARONIUS_LOG.get());
        this.dropSelf(ModTreeBlock.PSARONIUS_PLANKS.get());

        this.dropSelf(ModTreeBlock.PSARONIUS_LOG.get());
        this.dropSelf(ModTreeBlock.PSARONIUS_PLANKS.get());

        this.dropSelf(ModTreeBlock.SIGILLARIA_LOG.get());
        this.dropSelf(ModTreeBlock.SIGILLARIA_PLANKS.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item pItem, float minDrop, float maxDrop) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(pItem).apply(SetItemCountFunction.
                                setCount(UniformGenerator.between(1f, 2f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Stream.of(
                ModTreeBlock.BLOCKS,
                ModFossilBlock.BLOCKS
        )
                .flatMap(register -> register.getEntries().stream())
                .map(RegistryObject::get)
                ::iterator;
    }
}
