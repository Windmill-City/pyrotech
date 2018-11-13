package com.codetaylor.mc.pyrotech.modules.pyrotech.compat.jei;

import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.DryingRackRecipe;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JEIRecipeWrapperDryingRack
    extends JEIRecipeWrapperTimed {

  private final List<List<ItemStack>> inputs;
  private final ItemStack output;

  public JEIRecipeWrapperDryingRack(DryingRackRecipe recipe) {

    super(recipe);

    this.inputs = Collections.singletonList(Arrays.asList(recipe.getInput().getMatchingStacks()));
    this.output = recipe.getOutput();
  }

  @Override
  public void getIngredients(@Nonnull IIngredients ingredients) {

    ingredients.setInputLists(ItemStack.class, this.inputs);
    ingredients.setOutput(ItemStack.class, this.output);
  }
}