package net.idk0_lha0.bigbadbugs.block;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BigBadBugs.MOD_ID);

    public static final RegistryObject<Block> FOSSIL_BLOCK = registerBlock("fossil_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> CALAMITES_LOG_FOSSIl = registerBlock("calamites_log_fossil",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> CALAMITES_LEAVES_FOSSIL = registerBlock("calamites_leaves_fossil",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new Block(BlockBehaviour.Properties.of()
                .strength(1f).sound(SoundType.WOOD)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name,  toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItems(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
