package project.cookie.types;
import java.util.ArrayList;
import java.util.List;

import project.cookie.AbstractCookie;
import project.cookie.CookieBuilderInterface;

public class MixAndMatchCookie extends AbstractCookie implements CookieBuilderInterface{
	AbstractCookie[] basicCookie;
	String description = " Mix and match from our assorted cookie types.";
	double cost = 2.50;
	String name = "Mix-and-match Cookie";
	//String []ingredients = {" "};

	public MixAndMatchCookie(AbstractCookie ...basicCookies ) {
		super();
		
		int i =0;
		basicCookie = new AbstractCookie[basicCookies.length];
		//Loop through the array of objects and insert them into instance array variable.
		for(AbstractCookie cookie : basicCookies) {
			this.basicCookie[i] = cookie;
			i++;
		}		 
	}
	public MixAndMatchCookie() {
		
		
	}	
	//Loop through the instance array variable of the Cookies Objects and obtain their costs:
	public double getCost() {
		List<Double> cookieCosts = new ArrayList<>();
		double total =0;
		for(AbstractCookie cookie: this.basicCookie) {
			
			cookieCosts.add((double) cookie.getCost());
		}
		for(double individualCosts : cookieCosts) {
			total += individualCosts;
		}
		return total + this.cost;

	}
	public String getDescription() {
		List<String> cookieDescriptions = new ArrayList<>();
		String finalStr = "";
		for(AbstractCookie cookie: this.basicCookie) {
			
			cookieDescriptions.add(cookie.getDescription());
		}
		for(String individualDesc : cookieDescriptions) {
			finalStr += individualDesc;
		}
		return finalStr + description;
	}

	public String getIngredientes() {
		List<String[]> cookieIngredients = new ArrayList<>();
		String finalStr = null;
		for(AbstractCookie cookie: this.basicCookie) {
			
			cookieIngredients.add(cookie.getIngredients());
		}
		for(String[] allIngredients : cookieIngredients) {
			for(String individualIngredients : allIngredients) {
				finalStr += individualIngredients;
			}			
		}
		
		return finalStr;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String[] combineArrays(Object... arrays) {
		
		return null;		
		
	}
	
	@Override
	public String combineArrays(String array1[], String array2[]){

		return null;
	}
	
}
