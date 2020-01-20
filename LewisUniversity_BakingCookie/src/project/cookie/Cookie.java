package project.cookie;

import java.util.Arrays;
/**
 * @author ATirmizi
 * This class serves as the bear bones structure for all cookies. It extends the AbstractCookie Class.
 */
public class Cookie extends AbstractCookie{
	String description ="A basic cookie made out of milk and cookie dough.";
	double cost = 0.50;
	public String []ingredients = {"1/2 cup", "1 tablespoon granulated sugar","1/3 cup brown sugar", "1/2 teaspoon salt", "1 teaspoon vanilla",
			"1/4 teaspoon baking soda", "1/2 teaspoon baking powder", "1 large egg", "2 tablespoons"};
	String name = "Simple Cookie";
	
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
		return "BasicCookie [description=" + description + ", cost=" + cost + ", ingredients="
				+ Arrays.toString(ingredients) + "]";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
