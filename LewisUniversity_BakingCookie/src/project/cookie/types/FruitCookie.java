package project.cookie.types;
import java.util.Arrays;

import project.cookie.AbstractCookie;
import project.cookie.Cookie;
import project.cookie.CookieBuilderInterface;

public class FruitCookie extends Cookie implements CookieBuilderInterface{
	AbstractCookie basicCookie;
	String description = " Along with naturally-farmed organic chinks of sweet fruits";
	double cost = 1.00;
	String []ingredients = {"1 cup of randomized fruit chunks servings "};
	String name = "Fruit Cookie";
	
	public FruitCookie(AbstractCookie basicCookie) {
		super();
		this.basicCookie = basicCookie;
	}
	//Default Constructor:
	public FruitCookie() {
		
	}
	
	public double getCost() {
		return basicCookie.getCost() + this.cost;

	}
	public String getDescription() {
		return basicCookie.getDescription() + this.description;
	}
	
	public String getName() {
		return name;
	}

	public String getIngredientes() {
		return combineArrays(basicCookie.ingredients, this.ingredients).toString();
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

	@Override
	public String[] combineArrays(Object... arrays) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
