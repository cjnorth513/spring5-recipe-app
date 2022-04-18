package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public class IngredientServiceImpl implements IngredientService{
    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        return null;
    }

    @Override
    public IngredientCommand saveIngredientCommand(IngredientCommand command) {
        return null;
    }
}
