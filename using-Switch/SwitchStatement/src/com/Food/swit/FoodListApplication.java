package com.Food.swit;

public class FoodListApplication {
	public static void main(String[]args) {
		String Food = "Chicken Curry";
		System.out.println(Food +" "+listOfFoods(Food));
		
	}
	public static String listOfFoods(String Food) {
		switch(Food) {
		case "Chicken Curry":
		case "Beef Gravy":
		case "Mutton Chukka":
		  return "It's There in Non-Veg-List";
		case "dosa":
		case "idly":
		case "pongal":
			return "it is There in Pure-Veg-List";
		case "Noodles":
		case "tikka":
		case "Maggi":
			return "it's There in ChineseFood-List";
		}
		return "Your Need is Not There!!!";
		
		
	}

}
