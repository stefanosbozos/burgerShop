public class Main
{
    public static void main(String[] args)
    {
        Burger myBurger = new Burger("Hamburger", 3.00f);
        myBurger.addExtra("Tomato");
        myBurger.addExtra("Onion");
        myBurger.addExtra("Pickles");
        Drink myDrink = new Drink("Coke", "Large");
        Side mySide = new Side("Chips", 2.50);
        Order myOrder = new Order(myBurger, myDrink, mySide);
        myOrder.printTotal();

        Burger b2 = new Burger("Chicken Burger", 5.00);
        b2.addExtra("Pickles");
        Drink d2 = new Drink("Fanta", "Regular");
        Side s2 = new Side("Jalepeno Poppers", 3.00);
        Order o2 = new Order(b2, d2, s2);
        o2.printTotal();

        DeluxeBurger dB = new DeluxeBurger("Black Mamba", 5.00f, "Bacon", "Caramelized Onions", "Tomato Chutney");
        dB.addExtra("Egg");
        dB.addExtra("Lettuce");
        Order o3 = new Order(dB, d2, s2);
        o3.printTotal();

    }
}
