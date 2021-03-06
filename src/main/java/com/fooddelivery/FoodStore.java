package com.fooddelivery;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStore {
    public ArrayList<FoodItem> foodStore = new ArrayList<>();

    public void prepare(FoodItem foodItem) {
        foodStore.add(foodItem);
    }

    public void deliver(FoodItem foodItem) {
        foodStore.remove(foodItem);
    }


    public void printFood() {
        for(FoodItem foodItem : foodStore) {
            System.out.println(foodItem);
        }
    }

    public void printStarterItems() {
        for(FoodItem fooditem : foodStore) {
            if(fooditem.getFoodCategory() == (FoodCategory.STARTER)) {
                System.out.println(fooditem);
            }
        }



    }
    public void printMainCourseItems() {
        for (FoodItem fooditem : foodStore) {
            if (fooditem.getFoodCategory() == (FoodCategory.MAIN_COURSE)) {
                System.out.println(fooditem);
            }
        }
    }

    public void createSystemMenu() {
        System.out.println("1. Print Starters \n " +
                "2. Print Main Course \n " +
                "3. Print Drinks \n " +
                "4. Prepare Food \n " +
                "5. Deliver Food");
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printStarterItems();
                break;
            case 2:
                printMainCourseItems();
        }

    }

    public void AddAnotherItem() {
        System.out.println("1. Add Another Item \n " +
                           "2. Exit");
        System.out.println("Enter your Choice");
        Scanner sa = new Scanner(System.in);
        int choose = sa.nextInt();
        if(choose == 1){
            System.out.println("1. Print Starters \n " +
                    "2. Print Main Course \n " +
                    "3. Print Drinks \n " +
                    "4. Prepare Food \n " +
                    "5. Deliver Food");
            System.out.println("Enter your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    printStarterItems();
                    break;
                case 2:
                    printMainCourseItems();
            }
        } else {
            System.out.println("Thank You,Visit Again!");
        }
}
}
