package project.cookie.domain;

import project.cookie.AbstractCookie;
import project.cookie.Cookie;
import project.cookie.types.ButterCookie;
import project.cookie.types.ChocolateChipCookie;
import project.cookie.types.FruitCookie;
import project.cookie.types.MixAndMatchCookie;


public class CookieDomain {	
	
	
	public static void main(String[] args) {
		AbstractCookie cookie = new Cookie();
		AbstractCookie chocChipCookie = new ChocolateChipCookie(cookie);
		AbstractCookie butterCookie = new ButterCookie(cookie);
		AbstractCookie fruitCookie = new FruitCookie(cookie);
		AbstractCookie mixCookie = new MixAndMatchCookie(chocChipCookie, fruitCookie);
		
		System.out.println("The cost of the " + fruitCookie.getName() + " is: " + fruitCookie.getCost());
		System.out.println(chocChipCookie.getIngredients());
		System.out.println(butterCookie.getName());
		System.out.println(mixCookie.getDescription());

	}

}
