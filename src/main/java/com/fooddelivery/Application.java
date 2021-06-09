package com.fooddelivery;

public class Application {

    public static void main(String[] args) {

        FoodStore foodStore = new FoodStore();

        System.out.println("************* Welcome to the FOOD DELIVERY SYSTEM ****************");

        ChickenTikka chickenTikka = new ChickenTikka();
        chickenTikka.setPrice(200);
        chickenTikka.setTaste(Taste.SPICY);

        Dal dal = new Dal();
        dal.setPrice(80);
        dal.setTaste(Taste.SALTY);

        MuttonCurry muttonCurry = new MuttonCurry();
        muttonCurry.setPrice(380);
        muttonCurry.setTaste(Taste.SPICY);

        PotatoFry potatoFry = new PotatoFry();
        potatoFry.setPrice(90);
        potatoFry.setTaste(Taste.SWEET);

        // adding the foods items
        foodStore.prepare(chickenTikka);
        foodStore.prepare(dal);
        foodStore.prepare(muttonCurry);
        foodStore.prepare(potatoFry);


//        //printing the food items
//        foodStore.printFood();
//
//        // delivering the food items
//        foodStore.deliver(paneerTikka);
//
//        System.out.println("Food Items after Delivery -------------------------------------------------------");
//
//        //printing food items after delivering
//        foodStore.printFood();
        foodStore.createSystemMenu();
        foodStore.AddAnotherItem();

    }
}
