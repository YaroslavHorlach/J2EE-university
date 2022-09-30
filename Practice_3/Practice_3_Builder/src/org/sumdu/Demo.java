package org.sumdu;

public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal chickMeal = mealBuilder.prepareChickenMeal();
        System.out.println("\nChicken Meal");
        chickMeal.showItems();
        System.out.println("Total Cost: " + chickMeal.getCost());
    }
}
