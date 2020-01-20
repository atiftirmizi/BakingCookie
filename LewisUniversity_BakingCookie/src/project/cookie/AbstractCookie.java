package project.cookie;
import java.util.Arrays;

public abstract class AbstractCookie {
	String description = "Unknown Cookie";
	double cost = 0.00;
	public String []ingredients = {null};


	public String getDescription() {
		return description;		
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}


	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients() {
		this.ingredients = ingredients;
	}


	@Override
	public String toString() {
		return "AbstractCookie [description=" + description + ", cost=" + cost + ", ingredients="
				+ Arrays.toString(ingredients) + "]";
	}

	public abstract String getName();	






}
