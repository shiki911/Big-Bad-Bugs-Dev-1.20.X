package net.idk0_lha0.bigbadbugs.block;

import net.idk0_lha0.bigbadbugs.BigBadBugs;
import net.idk0_lha0.bigbadbugs.block.costum.*;
import net.idk0_lha0.bigbadbugs.item.ModItems;
import net.idk0_lha0.bigbadbugs.worldgen.tree.ModTreeGrowers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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

    public static final RegistryObject<Block> CALAMITES_LEAVES = registerBlock("calamites_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CALAMITES_SAPLING = registerBlock("calamites_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CALAMITES, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> CALAMITES_PLANKS = registerBlock("calamites_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<StairBlock> CALAMITES_STAIRS = registerBlock("calamites_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.CALAMITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.CALAMITES_PLANKS.get())));

    public static final RegistryObject<SlabBlock> CALAMITES_SLAB = registerBlock("calamites_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.CALAMITES_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> CALAMITES_PRESSURE_PLATE = registerBlock("calamites_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> CALAMITES_BUTTON = registerBlock("calamites_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> CALAMITES_FENCE = registerBlock("calamites_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> CALAMITES_FENCE_GATE = registerBlock("calamites_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));



    // Cordaites related blocks
    public static final RegistryObject<Block> CORDAITES_LOG = registerBlock("cordaites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CORDAITES_WOOD = registerBlock("cordaites_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CORDAITES_LEAVES = registerBlock("cordaites_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CORDAITES_SAPLING = registerBlock("cordaites_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CORDAITES, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> CORDAITES_PLANKS = registerBlock("cordaites_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<StairBlock> CORDAITES_STAIRS = registerBlock("cordaites_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.CORDAITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.CORDAITES_PLANKS.get())));

    public static final RegistryObject<SlabBlock> CORDAITES_SLAB = registerBlock("cordaites_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.CORDAITES_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> CORDAITES_PRESSURE_PLATE = registerBlock("cordaites_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> CORDAITES_BUTTON = registerBlock("cordaites_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> CORDAITES_FENCE = registerBlock("cordaites_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> CORDAITES_FENCE_GATE = registerBlock("cordaites_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));



    // Lepidodendron related blocks
    public static final RegistryObject<Block> LEPIDODENDRON_LOG = registerBlock("lepidodendron_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> LEPIDODENDRON_WOOD = registerBlock("lepidodendron_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> LEPIDODENDRON_LEAVES = registerBlock("lepidodendron_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LEPIDODENDRON_SAPLING = registerBlock("lepidodendron_sapling",
            () -> new SaplingBlock(ModTreeGrowers.LEPIDODENDRON, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> LEPIDODENDRON_PLANKS = registerBlock("lepidodendron_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<StairBlock> LEPIDODENDRON_STAIRS = registerBlock("lepidodendron_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.LEPIDODENDRON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.LEPIDODENDRON_PLANKS.get())));

    public static final RegistryObject<SlabBlock> LEPIDODENDRON_SLAB = registerBlock("lepidodendron_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.LEPIDODENDRON_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> LEPIDODENDRON_PRESSURE_PLATE = registerBlock("lepidodendron_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> LEPIDODENDRON_BUTTON = registerBlock("lepidodendron_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> LEPIDODENDRON_FENCE = registerBlock("lepidodendron_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> LEPIDODENDRON_FENCE_GATE = registerBlock("lepidodendron_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));



    // Psaronius related blocks
    public static final RegistryObject<Block> PSARONIUS_LOG = registerBlock("psaronius_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PSARONIUS_WOOD = registerBlock("psaronius_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> PSARONIUS_LEAVES = registerBlock("psaronius_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PSARONIUS_SAPLING = registerBlock("psaronius_sapling",
            () -> new SaplingBlock(ModTreeGrowers.PSARONIUS, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> PSARONIUS_PLANKS = registerBlock("psaronius_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<StairBlock> PSARONIUS_STAIRS = registerBlock("psaronius_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.PSARONIUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.PSARONIUS_PLANKS.get())));

    public static final RegistryObject<SlabBlock> PSARONIUS_SLAB = registerBlock("psaronius_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.PSARONIUS_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> PSARONIUS_PRESSURE_PLATE = registerBlock("psaronius_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> PSARONIUS_BUTTON = registerBlock("psaronius_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> PSARONIUS_FENCE = registerBlock("psaronius_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> PSARONIUS_FENCE_GATE = registerBlock("psaronius_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));



    // Sigillaria related blocks
    public static final RegistryObject<Block> SIGILLARIA_LOG = registerBlock("sigillaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SIGILLARIA_WOOD = registerBlock("sigillaria_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SIGILLARIA_LEAVES = registerBlock("sigillaria_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> SIGILLARIA_SAPLING = registerBlock("sigillaria_sapling",
            () -> new SaplingBlock(ModTreeGrowers.SIGILLARIA, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> SIGILLARIA_PLANKS = registerBlock("sigillaria_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.of()
                    .strength(1f).sound(SoundType.WOOD)));

    public static final RegistryObject<StairBlock> SIGILLARIA_STAIRS = registerBlock("sigillaria_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.SIGILLARIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.SIGILLARIA_PLANKS.get())));

    public static final RegistryObject<SlabBlock> SIGILLARIA_SLAB = registerBlock("sigillaria_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.SIGILLARIA_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> SIGILLARIA_PRESSURE_PLATE = registerBlock("sigillaria_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> SIGILLARIA_BUTTON = registerBlock("sigillaria_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> SIGILLARIA_FENCE = registerBlock("sigillaria_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> SIGILLARIA_FENCE_GATE = registerBlock("sigillaria_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));



    // Medullosa related blocks
    public static final RegistryObject<Block> MEDULLOSA_LOG = registerBlock("medullosa_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> MEDULLOSA_WOOD = registerBlock("medullosa_wood",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> MEDULLOSA_LEAVES = registerBlock("medullosa_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MEDULLOSA_SAPLING = registerBlock("medullosa_sapling",
            () -> new SaplingBlock(ModTreeGrowers.MEDULLOSA, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<Block> MEDULLOSA_PLANKS = registerBlock("medullosa_planks",
            () -> new ModFlammableBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<StairBlock> MEDULLOSA_STAIRS = registerBlock("medullosa_stairs",
            () -> new ModFlammableStairBlock(() -> ModTreeBlock.MEDULLOSA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModTreeBlock.MEDULLOSA_PLANKS.get())));

    public static final RegistryObject<SlabBlock> MEDULLOSA_SLAB = registerBlock("medullosa_slab",
            () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(ModTreeBlock.MEDULLOSA_PLANKS.get())));

    public static final RegistryObject<PressurePlateBlock> MEDULLOSA_PRESSURE_PLATE = registerBlock("medullosa_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));

    public static final RegistryObject<ButtonBlock> MEDULLOSA_BUTTON = registerBlock("medullosa_button",
            () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),BlockSetType.OAK, 30, true));

    public static final RegistryObject<FenceBlock> MEDULLOSA_FENCE = registerBlock("medullosa_fence",
            () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<FenceGateBlock> MEDULLOSA_FENCE_GATE = registerBlock("medullosa_fence_gate",
            () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),WoodType.OAK));


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
