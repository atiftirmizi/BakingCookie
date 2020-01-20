package project.cookie.types;
import java.util.Arrays;

import project.cookie.AbstractCookie;
import project.cookie.Cookie;
import project.cookie.CookieBuilderInterface;

public class ButterCookie extends Cookie implements CookieBuilderInterface{
 
	AbstractCookie basicCookie;
	String description = " Buttery goodness with a sweet taste that melts in your mouth.";
	double cost = 0.70;
	String []ingredients = {"1 teaspoon sweet butter and milk"};
	String name = "Butter Cookie";

	public ButterCookie(AbstractCookie basicCookie) {
		super();
		this.basicCookie = basicCookie;
	}

	public ButterCookie() {

	}

	public double getCost() {
		return basicCookie.getCost() + this.cost;

	}
	public String getDescription() {
		return basicCookie.getDescription() + this.description;
	}

	public String getIngredientes() {
		String output = combineArrays(basicCookie.ingredients,this.ingredients);
		return output;
	}


	public String combineArrays(String array1[], String array2[]){

		String []finalArray = new String[array1.length + array2.length];

		int i =0;
		for(String item : array1) {
			finalArray[i] = item;
			i++;
		}

		for(String item : array2) {
			finalArray[i] = item;
			i++;
		}
		
		return Arrays.toString(finalArray);
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String[] combineArrays(Object... arrays) {
		// TODO Auto-generated method stub
		return null;
	}


}
