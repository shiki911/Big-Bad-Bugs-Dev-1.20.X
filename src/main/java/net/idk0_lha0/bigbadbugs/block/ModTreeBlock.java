package net.idk0_lha0.bigbadbugs.block;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.costum.ModFlammableLeaves;
import net.idk0_lha0.bigbadbugs.block.costum.ModFlammableBlocks;
import net.idk0_lha0.bigbadbugs.block.costum.ModFlammableRotatedPillarBlock;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.idk0_lha0.bigbadbugs.worldgen.tree.ModTreeGrowers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModTreeBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BigBadBugs.MOD_ID);

    // Calamites related blocks
    public static final RegistryObject<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CALAMITES_PLANKS = registerBlock("calamites_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CALAMITES_LEAVES = registerBlock("calamites_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CALAMITES_SAPLING = registerBlock("calamites_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CALAMITES, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    // Cordaites related blocks
    public static final RegistryObject<Block> CORDAITES_LOG = registerBlock("cordaites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CORDAITES_WOOD = registerBlock("cordaites_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CORDAITES_PLANKS = registerBlock("cordaites_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CORDAITES_LEAVES = registerBlock("cordaites_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CORDAITES_SAPLING = registerBlock("cordaites_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CORDAITES, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    // Lepidodendron related blocks
    public static final RegistryObject<Block> LEPIDODENDRON_LOG = registerBlock("lepidodendron_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> LEPIDODENDRON_WOOD = registerBlock("lepidodendron_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> LEPIDODENDRON_PLANKS = registerBlock("lepidodendron_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> LEPIDODENDRON_LEAVES = registerBlock("lepidodendron_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LEPIDODENDRON_SAPLING = registerBlock("lepidodendron_sapling",
            () -> new SaplingBlock(ModTreeGrowers.LEPIDODENDRON, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    // Psaronius related blocks
    public static final RegistryObject<Block> PSARONIUS_LOG = registerBlock("psaronius_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PSARONIUS_WOOD = registerBlock("psaronius_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PSARONIUS_PLANKS = registerBlock("psaronius_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PSARONIUS_LEAVES = registerBlock("psaronius_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PSARONIUS_SAPLING = registerBlock("psaronius_sapling",
            () -> new SaplingBlock(ModTreeGrowers.PSARONIUS, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    // Sigillaria related blocks
    public static final RegistryObject<Block> SIGILLARIA_LOG = registerBlock("sigillaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SIGILLARIA_WOOD = registerBlock("sigillaria_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SIGILLARIA_PLANKS = registerBlock("sigillaria_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SIGILLARIA_LEAVES = registerBlock("sigillaria_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> SIGILLARIA_SAPLING = registerBlock("sigillaria_sapling",
            () -> new SaplingBlock(ModTreeGrowers.SIGILLARIA, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));



    // Medullosa related blocks
    public static final RegistryObject<Block> MEDULLOSA_LOG = registerBlock("medullosa_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> MEDULLOSA_WOOD = registerBlock("medullosa_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> MEDULLOSA_PLANKS = registerBlock("medullosa_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> MEDULLOSA_LEAVES = registerBlock("medullosa_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MEDULLOSA_SAPLING = registerBlock("medullosa_sapling",
            () -> new SaplingBlock(ModTreeGrowers.MEDULLOSA, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));



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
