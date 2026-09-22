package net.idk0_lha0.bigbadbugs;

import com.mojang.logging.LogUtils;
import net.idk0_lha0.bigbadbugs.block.ModFossilBlock;
import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.costum.ModFeatures;
import net.idk0_lha0.bigbadbugs.item.ModCreativeModTabs;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BigBadBugs.MOD_ID)
public class BigBadBugs
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bigbadbugs";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public BigBadBugs(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        modEventBus.addListener(this::registerBlockColors);
        modEventBus.addListener(this::registerItemColors);

        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModFossilBlock.register(modEventBus);
        ModTreeBlock.register(modEventBus);

        ModFeatures.FEATURES.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        /*
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.FOSSIL);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlock.FOSSIL_BLOCK);
            event.accept(ModBlock.CALAMITES_LEAVES_FOSSIL);
            event.accept(ModBlock.CALAMITES_LOG_FOSSIl);
        }
         */

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    public BigBadBugs(IEventBus modEventBus) {

        ModTreeBlock.register(modEventBus);
        ModItems.register(modEventBus);

        // Register the color events
        modEventBus.addListener(this::registerBlockColors);
        modEventBus.addListener(this::registerItemColors);
    }

    private void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register(
                (state, level, pos, tintIndex) ->
                        level != null && pos != null
                                ? BiomeColors.getAverageFoliageColor(level, pos)
                                : FoliageColor.getDefaultColor(),

                ModTreeBlock.CALAMITES_LEAVES.get(),
                ModTreeBlock.SIGILLARIA_LEAVES.get(),
                ModTreeBlock.PSARONIUS_LEAVES.get(),
                ModTreeBlock.LEPIDODENDRON_LEAVES.get(),
                ModTreeBlock.CORDAITES_LEAVES.get(),
                ModTreeBlock.MEDULLOSA_LEAVES.get()
        );
    }

    private void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
                (stack, tintIndex) -> FoliageColor.getDefaultColor(),
                ModTreeBlock.CALAMITES_LEAVES.get(),
                ModTreeBlock.SIGILLARIA_LEAVES.get(),
                ModTreeBlock.PSARONIUS_LEAVES.get(),
                ModTreeBlock.LEPIDODENDRON_LEAVES.get(),
                ModTreeBlock.CORDAITES_LEAVES.get(),
                ModTreeBlock.MEDULLOSA_LEAVES.get()
        );
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
