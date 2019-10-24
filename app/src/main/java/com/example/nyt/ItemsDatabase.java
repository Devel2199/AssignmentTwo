package com.example.nyt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ItemsDatabase {

    public static MenuItems getMenuItemsById(int itemID) {
        return menuItems.get(itemID);
    }



    public static ArrayList<MenuItems> getAllMenuItems() {
        return new ArrayList<MenuItems>((List) Arrays.asList(menuItems.values().toArray()));
    }

    private static final HashMap<Integer, MenuItems> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new MenuItems(
                1,
                "Borger Classic Cheeseburger",
                "8",
                "The signature burger at Borger Kong made up of succulent bacon, lettuce, tomatoes, beef patty all layered in melted cheese.",
                R.drawable.article1_image
        ));
        menuItems.put(2, new MenuItems(
                2,
                "Chicken Crisp Cut Burger",
                "7",
                "Delicious chicken breast deep fried and perfected placed over cheese, tomatoes, lettuce, onions and sauced with garlic aioli.",
                R.drawable.article2_image
        ));

        menuItems.put(3, new MenuItems(
                3,
                "Chilli BBQ Burger",
                "8",
                "Melting beef patty coated in BBQ marinate served with onion, cheese and lettuce.",
                R.drawable.article3_image
        ));

        menuItems.put(4, new MenuItems(
                4,
                "The Borger Burger",
                "12",
                "One of our biggest burgers including a combination of double beef patties and a chicken fillet all cooked to perfection over a salad.",
                R.drawable.article4_image
        ));
        menuItems.put(5, new MenuItems(
                5,
                "The Western MeatLover Burger",
                "11",
                "For all the meatlovers - a mix of bacon, beef patty and chicken served with lettuce and tomato",
                R.drawable.article5_image
        ));
        menuItems.put(6, new MenuItems(
                6,
                "The Bulgogi Burger",
                "9",
                "Original marinated bulgogi beef served over onion, lettuce and tomato",
                R.drawable.article6_image
        ));
        menuItems.put(7, new MenuItems(
                7,
                "Philly Cheesesteak Burger",
                "9",
                "Mix of double beef patty served with a triple layer of cheese",
                R.drawable.article7_image
        ));
        menuItems.put(8, new MenuItems(
                8,
                "Hawaiin Burgerr",
                "11",
                "Mx of ham and pineapple all topped with cheese inside a layer of deliciousness",
                R.drawable.article8_image
        ));
        menuItems.put(9, new MenuItems(
                9,
                "The Famous Star Burger",
                "12",
                "Combination of the best patty and chicken served with a secret star sauce",
                R.drawable.article9_image
        ));
        menuItems.put(10, new MenuItems(
                10,
                "Wedge Fries",
                "5",
                "Hand-made and cut wedge fries",
                R.drawable.article10_image
        ));
        menuItems.put(11, new MenuItems(
                11,
                "Potato and Gravy",
                "5",
                "The good ol side perfect with any burger",
                R.drawable.article11_image
        ));
        menuItems.put(12, new MenuItems(
                12,
                "Onion Rings",
                "5",
                "Onion rings battered and deep fried",
                R.drawable.article12_image
        ));
        menuItems.put(13, new MenuItems(
                13,
                "Coleslaw",
                "5",
                "A little healthiness with the burger",
                R.drawable.article13_image
        ));
        menuItems.put(14, new MenuItems(
                14,
                "Coke",
                "3",
                "Coca Cola 600ml",
                R.drawable.article14_image
        ));
        menuItems.put(15, new MenuItems(
                15,
                "Water",
                "3",
                "Fresh Spring Water 600ml",
                R.drawable.article15_image
        ));

    }
}
