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
    }
}
