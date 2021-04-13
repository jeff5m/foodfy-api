package br.com.foodfy.model.requests;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class RecipePostRequestBody {
    @NotEmpty
    private String title;
    @NotEmpty
    @URL
    private String avatarUrl;
    @NotEmpty
    private List<@NotEmpty String> ingredients;
    @NotEmpty
    private List<@NotEmpty String> preparationSteps;
    @NotEmpty
    private String information;

    public RecipePostRequestBody(@NotEmpty String title,
                                 @NotEmpty @URL String avatarUrl,
                                 @NotEmpty List<@NotEmpty String> ingredients,
                                 @NotEmpty List<@NotEmpty String> preparationSteps,
                                 @NotEmpty String information) {
        this.title = title;
        this.avatarUrl = avatarUrl;
        this.ingredients = ingredients;
        this.preparationSteps = preparationSteps;
        this.information = information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(List<String> preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
