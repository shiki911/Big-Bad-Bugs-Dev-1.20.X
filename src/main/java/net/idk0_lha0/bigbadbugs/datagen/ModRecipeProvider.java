package net.idk0_lha0.bigbadbugs.datagen;

import net.idk0_lha0.bigbadbugs.block.ModTreeBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CALAMITES_PLANKS.get(),4)
                .requires(ModTreeBlock.CALAMITES_LOG.get())
                .unlockedBy("has_calamites_log",has(ModTreeBlock.CALAMITES_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.CORDAITES_PLANKS.get(),4)
                .requires(ModTreeBlock.CORDAITES_LOG.get())
                .unlockedBy("has_codites_log",has(ModTreeBlock.CORDAITES_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.LEPIDODENDRON_PLANKS.get(),4)
                .requires(ModTreeBlock.LEPIDODENDRON_LOG.get())
                .unlockedBy("has_lepidodendron_log",has(ModTreeBlock.LEPIDODENDRON_PLANKS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.SIGILLARIA_PLANKS.get(),4)
                .requires(ModTreeBlock.SIGILLARIA_LOG.get())
                .unlockedBy("has_sigillarius_log",has(ModTreeBlock.SIGILLARIA_LOG.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModTreeBlock.PSARONIUS_PLANKS.get(),2)
                .requires(ModTreeBlock.PSARONIUS_LOG.get())
                .unlockedBy("has_psaronius_log",has(ModTreeBlock.PSARONIUS_LOG.get()))
                .save(pWriter);
    }
}
