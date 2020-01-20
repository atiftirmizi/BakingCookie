package project.cookie.types;
import java.util.Arrays;

import project.cookie.AbstractCookie;
import project.cookie.Cookie;
import project.cookie.CookieBuilderInterface;

public class ChocolateChipCookie extends Cookie implements CookieBuilderInterface{
	AbstractCookie basicCookie;
	String description = " Along with Sweet chocolate-chip filled dough.";
	double cost = 0.50;
	String []ingredients = {"1 cup Chocolate Chips"};
	String name = "Chocolate-Chip Cookie";


	public ChocolateChipCookie(AbstractCookie basicCookie) {
		super();
		this.basicCookie = basicCookie;
	}

	public ChocolateChipCookie() {
	}
	
	public double getCost() {
		return basicCookie.getCost() + this.cost;

	}
	public String getDescription() {
		return basicCookie.getDescription() + this.description;
	}
	
	public String getIngredientes() {
		return combineArrays(basicCookie.ingredients,this.ingredients).toString();
	}
	
	public String getName() {
		return name;
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
