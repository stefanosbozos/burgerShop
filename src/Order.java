import java.util.Dictionary;

public class Order
{
    private static int orderCount = 0;
    private Burger burger;
    private Drink drink;
    private Side side;

    public Order(Burger burger, Drink drink, Side side)
    {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        orderCount++;
    }

    public void printTotal()
    {
        System.out.printf("=================== Order No. %06d =================%n", orderCount);
        burger.print();
        drink.print();
        side.print();
        System.out.printf("%nTotal: £%s ", (burger.getPrice() + drink.getPrice() + side.getPrice()));
        System.out.println("\n======================================================\n");
    }
}
