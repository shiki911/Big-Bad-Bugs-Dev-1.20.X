package net.idk0_lha0.bigbadbugs.item;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.ModBlock;
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
                            pOutput.accept(ModBlock.FOSSIL_BLOCK.get());
                            pOutput.accept(ModBlock.CALAMITES_LEAVES_FOSSIL.get());
                            pOutput.accept(ModBlock.CALAMITES_LOG_FOSSIl.get());
                        }
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> PALEOZOIC = CREATIVE_MOD_TABS.register("paleozioc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlock.CALAMITES_WOOD.get()))
                    .title(Component.translatable("creativetab.bigbadbugs.paleozoic"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters pParameters, CreativeModeTab.@NotNull Output pOutput) {
                            pOutput.accept(ModBlock.CALAMITES_LOG.get());
                            pOutput.accept(ModBlock.CALAMITES_WOOD.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
