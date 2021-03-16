package com.garygriffaw.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu italianMenu = new Menu();

        MenuItem toastedRavioli = new MenuItem("Toasted Ravioli",
                "6 crispy, fried raviolis", 7.99,
                Category.APPETIZER, false);
        MenuItem sideSalad = new MenuItem("Side Salad",
                "Small salad with choice of dressing", 4.99,
                Category.APPETIZER, false);
        MenuItem lasagna = new MenuItem("Baked Lasagna",
                "Layers of flat noodles, sauce, and cheese", 11.99,
                Category.MAIN_COURSE, true);
        MenuItem pizza = new MenuItem("Pizza",
                "12 Inch Pizza with choice of toppings", 12.99,
                Category.MAIN_COURSE, false);
        MenuItem cannoli = new MenuItem("Cannoli",
                "Deep fried pastry dough filled with a sweet and creamy filling", 7.99,
                Category.DESSERT, true);
        MenuItem tiramisu = new MenuItem("Tiramisu",
                "Espresso-dipped ladyfingers and a creamy lightly sweetened mascarpone cream", 6.99,
                Category.DESSERT, false);

        addMenuItem(italianMenu, toastedRavioli);
        addMenuItem(italianMenu, sideSalad);
        addMenuItem(italianMenu, lasagna);
        addMenuItem(italianMenu, pizza);
        addMenuItem(italianMenu, cannoli);
        addMenuItem(italianMenu, tiramisu);
        displayFullMenu(italianMenu);

        System.out.println();
        System.out.println("Pausing for 5 seconds...");
        try {
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        italianMenu.removeMenuItem(cannoli);
        MenuItem gelato = new MenuItem("Gelato",
                "Frozen dessert in vanilla, chocolate, or strawberry", 7.99,
                Category.DESSERT, true);
        addMenuItem(italianMenu, gelato);
        displayFullMenu(italianMenu);

        displayMenuItem(lasagna);

        System.out.println();
        System.out.println("Attempt to add a duplicate menu item");
        MenuItem cannoli2 = new MenuItem("Cannoli",
                "abc", 0,
                Category.MAIN_COURSE, false);
        addMenuItem(italianMenu, cannoli);
        addMenuItem(italianMenu, cannoli2);
        displayFullMenu(italianMenu);

        System.out.println();
        System.out.println("Check equality");
        System.out.println("cannoli equals cannoli2: " + cannoli.equals(cannoli2));
        System.out.println("cannoli equals gelato: " + cannoli.equals(gelato));

    }

    private static void addMenuItem(Menu menu, MenuItem menuItem) {
        boolean result = menu.addMenuItem(menuItem);
        if (!result) {
            System.out.println("Menu Item could not be added. (" + menuItem.displayMenuItem() + ")");
        }
    }

    private static void displayFullMenu(Menu menu) {
        System.out.println();
        System.out.println("Display full menu");

        for (String displayMenuItem : menu.displayMenu())
            System.out.println(displayMenuItem);
    }

    private static void displayMenuItem(MenuItem menuItem) {
        System.out.println();
        System.out.println("Display single menu item");

        System.out.println(menuItem.displayMenuItem());
    }
}
