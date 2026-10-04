package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.idk0_lha0.bigbadbugs.costum.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CALAMITES_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.CALAMITES_LOG.get())
                .unlockedBy("has_calamites_log",has(ModTreeBlock.CALAMITES_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CORDAITES_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.CORDAITES_LOG.get())
                .unlockedBy("has_cordaites_log",has(ModTreeBlock.CORDAITES_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.LEPIDODENDRON_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.LEPIDODENDRON_LOG.get())
                .unlockedBy("has_lepidodendron_log",has(ModTreeBlock.LEPIDODENDRON_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.SIGILLARIA_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.SIGILLARIA_LOG.get())
                .unlockedBy("has_sigillaria_log",has(ModTreeBlock.SIGILLARIA_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.PSARONIUS_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.PSARONIUS_LOG.get())
                .unlockedBy("has_psaronius_log",has(ModTreeBlock.PSARONIUS_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.MEDULLOSA_WOOD.get(),3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTreeBlock.MEDULLOSA_LOG.get())
                .unlockedBy("has_medullosa_logs",has(ModTreeBlock.MEDULLOSA_LOG.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CALAMITES_PLANKS.get(),4)
                .requires(ModTags.Items.CALAMITES_LOGS)
                .unlockedBy("has_calamites_log",has(ModTreeBlock.CALAMITES_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CORDAITES_PLANKS.get(),4)
                .requires(ModTags.Items.CORDAITES_LOGS)
                .unlockedBy("has_codites_log",has(ModTreeBlock.CORDAITES_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.LEPIDODENDRON_PLANKS.get(),4)
                .requires(ModTags.Items.LEPIDODENDRON_LOGS)
                .unlockedBy("has_lepidodendron_log",has(ModTreeBlock.LEPIDODENDRON_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.SIGILLARIA_PLANKS.get(),4)
                .requires(ModTags.Items.SIGILLARIA_LOGS)
                .unlockedBy("has_sigillarius_log",has(ModTreeBlock.SIGILLARIA_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.PSARONIUS_PLANKS.get(),2)
                .requires(ModTags.Items.PSARONIUS_LOGS)
                .unlockedBy("has_psaronius_log",has(ModTreeBlock.PSARONIUS_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.MEDULLOSA_PLANKS.get(),4)
                .requires(ModTags.Items.MEDULLOSA_LOGS)
                .unlockedBy("has_medullosa_logs",has(ModTreeBlock.MEDULLOSA_LOG.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CALAMITES_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.CALAMITES_PLANKS.get())
                .unlockedBy("has_calamites_planks",has(ModTreeBlock.CALAMITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CORDAITES_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.CORDAITES_PLANKS.get())
                .unlockedBy("has_cordaites_planks",has(ModTreeBlock.CORDAITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.LEPIDODENDRON_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .unlockedBy("has_lepidodendron_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.PSARONIUS_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.PSARONIUS_PLANKS.get())
                .unlockedBy("has_psaronius_planks",has(ModTreeBlock.PSARONIUS_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.SIGILLARIA_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.SIGILLARIA_PLANKS.get())
                .unlockedBy("has_sigillaria_planks",has(ModTreeBlock.SIGILLARIA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.MEDULLOSA_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModTreeBlock.MEDULLOSA_PLANKS.get())
                .unlockedBy("has_medullosa_planks",has(ModTreeBlock.MEDULLOSA_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.CALAMITES_BUTTON.get(),1)
                .requires(ModTreeBlock.CALAMITES_PLANKS.get())
                .unlockedBy("has_calamites_planks",has(ModTreeBlock.CALAMITES_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.CORDAITES_BUTTON.get(),1)
                .requires(ModTreeBlock.CORDAITES_PLANKS.get())
                .unlockedBy("has_cordaites_planks",has(ModTreeBlock.CORDAITES_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.LEPIDODENDRON_BUTTON.get(),1)
                .requires(ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .unlockedBy("has_lepidodendron_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.PSARONIUS_BUTTON.get(),1)
                .requires(ModTreeBlock.PSARONIUS_PLANKS.get())
                .unlockedBy("has_psaronius_planks",has(ModTreeBlock.PSARONIUS_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.SIGILLARIA_BUTTON.get(),1)
                .requires(ModTreeBlock.SIGILLARIA_PLANKS.get())
                .unlockedBy("has_sigillaria_planks",has(ModTreeBlock.SIGILLARIA_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,ModTreeBlock.MEDULLOSA_BUTTON.get(),1)
                .requires(ModTreeBlock.MEDULLOSA_PLANKS.get())
                .unlockedBy("has_medullosa_planks",has(ModTreeBlock.MEDULLOSA_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.CALAMITES_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.CALAMITES_PLANKS.get())
                .unlockedBy("has_calamites_planks",has(ModTreeBlock.CALAMITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.CORDAITES_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.CORDAITES_PLANKS.get())
                .unlockedBy("has_cordaites_planks",has(ModTreeBlock.CORDAITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.LEPIDODENDRON_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .unlockedBy("has_lepidodendron_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.PSARONIUS_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.PSARONIUS_PLANKS.get())
                .unlockedBy("has_psaronius_planks",has(ModTreeBlock.PSARONIUS_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.SIGILLARIA_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.SIGILLARIA_PLANKS.get())
                .unlockedBy("has_sigillaria_planks",has(ModTreeBlock.SIGILLARIA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,ModTreeBlock.MEDULLOSA_PRESSURE_PLATE.get(),1)
                .pattern("AA")
                .define('A', ModTreeBlock.MEDULLOSA_PLANKS.get())
                .unlockedBy("has_medullosa_planks",has(ModTreeBlock.MEDULLOSA_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CALAMITES_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.CALAMITES_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_calamites_planks",has(ModTreeBlock.CALAMITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CORDAITES_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.CORDAITES_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_cordaites_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.LEPIDODENDRON_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_lepidodendron_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.PSARONIUS_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.PSARONIUS_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_psaronius_planks",has(ModTreeBlock.PSARONIUS_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.SIGILLARIA_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.SIGILLARIA_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_sigillaria_planks",has(ModTreeBlock.SIGILLARIA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.MEDULLOSA_FENCE.get(),3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModTreeBlock.MEDULLOSA_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_medullosa_planks",has(ModTreeBlock.MEDULLOSA_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CALAMITES_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.CALAMITES_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_calamites_planks",has(ModTreeBlock.CALAMITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.CORDAITES_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.CORDAITES_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_cordaites_planks",has(ModTreeBlock.CORDAITES_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.LEPIDODENDRON_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.LEPIDODENDRON_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_lepidodendron_planks",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.PSARONIUS_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.PSARONIUS_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_psaronius_planks",has(ModTreeBlock.PSARONIUS_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.SIGILLARIA_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.SIGILLARIA_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_sigillaria_planks",has(ModTreeBlock.SIGILLARIA_PLANKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ModTreeBlock.MEDULLOSA_FENCE_GATE.get(),1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModTreeBlock.MEDULLOSA_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_medullosa_planks",has(ModTreeBlock.MEDULLOSA_PLANKS.get()))
                .save(pWriter);
    }
}
