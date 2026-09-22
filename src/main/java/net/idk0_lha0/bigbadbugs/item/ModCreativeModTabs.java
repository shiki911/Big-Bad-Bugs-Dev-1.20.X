package net.idk0_lha0.bigbadbugs.item;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BigBadBugs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOSSIL_ITEMS_TAB = CREATIVE_MOD_TABS.register("fossil_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOSSIL.get()))
                    .title(Component.translatable("creativetab.bigbadbugs.fossil_items"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters pParameters, CreativeModeTab.@NotNull Output pOutput) {
                            pOutput.accept(ModItems.FOSSIL.get());
                            pOutput.accept(ModFossilBlock.FOSSIL_BLOCK.get());
                            pOutput.accept(ModFossilBlock.CALAMITES_LEAVES_FOSSIL.get());
                            pOutput.accept(ModFossilBlock.CALAMITES_LOG_FOSSIl.get());
                        }
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> PALEOZOIC = CREATIVE_MOD_TABS.register("paleozoic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModTreeBlock.CALAMITES_SAPLING.get()))
                    .title(Component.translatable("creativetab.bigbadbugs.paleozoic"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters pParameters, CreativeModeTab.@NotNull Output pOutput) {
                            pOutput.accept(ModTreeBlock.CALAMITES_LOG.get());
                            pOutput.accept(ModTreeBlock.CORDAITES_LOG.get());
                            pOutput.accept(ModTreeBlock.LEPIDODENDRON_LOG.get());
                            pOutput.accept(ModTreeBlock.PSARONIUS_LOG.get());
                            pOutput.accept(ModTreeBlock.SIGILLARIA_LOG.get());
                            pOutput.accept(ModTreeBlock.MEDULLOSA_LOG.get());


                            pOutput.accept(ModTreeBlock.CALAMITES_WOOD.get());
                            pOutput.accept(ModTreeBlock.CORDAITES_WOOD.get());
                            pOutput.accept(ModTreeBlock.LEPIDODENDRON_WOOD.get());
                            pOutput.accept(ModTreeBlock.PSARONIUS_WOOD.get());
                            pOutput.accept(ModTreeBlock.SIGILLARIA_WOOD.get());
                            pOutput.accept(ModTreeBlock.MEDULLOSA_WOOD.get());


                            pOutput.accept(ModTreeBlock.CALAMITES_PLANKS.get());
                            pOutput.accept(ModTreeBlock.CORDAITES_PLANKS.get());
                            pOutput.accept(ModTreeBlock.LEPIDODENDRON_PLANKS.get());
                            pOutput.accept(ModTreeBlock.PSARONIUS_PLANKS.get());
                            pOutput.accept(ModTreeBlock.SIGILLARIA_PLANKS.get());
                            pOutput.accept(ModTreeBlock.MEDULLOSA_PLANKS.get());


                            pOutput.accept(ModTreeBlock.CALAMITES_SAPLING.get());
                            pOutput.accept(ModTreeBlock.CORDAITES_SAPLING.get());
                            pOutput.accept(ModTreeBlock.LEPIDODENDRON_SAPLING.get());
                            pOutput.accept(ModTreeBlock.PSARONIUS_SAPLING.get());
                            pOutput.accept(ModTreeBlock.SIGILLARIA_SAPLING.get());
                            pOutput.accept(ModTreeBlock.MEDULLOSA_SAPLING.get());


                            pOutput.accept(ModTreeBlock.CALAMITES_LEAVES.get());
                            pOutput.accept(ModTreeBlock.CORDAITES_LEAVES.get());
                            pOutput.accept(ModTreeBlock.LEPIDODENDRON_LEAVES.get());
                            pOutput.accept(ModTreeBlock.PSARONIUS_LEAVES.get());
                            pOutput.accept(ModTreeBlock.SIGILLARIA_LEAVES.get());
                            pOutput.accept(ModTreeBlock.MEDULLOSA_LEAVES.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
