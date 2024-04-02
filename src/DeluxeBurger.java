import java.util.ArrayList;

public class DeluxeBurger extends Burger
{
    public double extraToppingsPrice = 0.50f;
    public ArrayList<String> extraToppings = new ArrayList<>();

    public DeluxeBurger(String type, double price, String extra1, String extra2, String extra3)
    {
        super(type, price);
        extraToppings.add(extra1);
        extraToppings.add(extra2);
        extraToppings.add(extra3);
    }

    @Override
    public void addExtra(String extraTopping)
    {
        if(extraToppings.size() < 5)
        {
            extraToppings.add(extraTopping);
        }
        else
        {
            System.out.println("Maximum amount of extra toppings.");
        }
    }

    @Override
    public void print()
    {
        super.setPrice(extraToppingsPrice * extraToppings.size());
        System.out.printf("Type: %s  %nExtras: %n", super.type);
        for(String topping : extraToppings)
        {
            System.out.printf("%s ", topping);
        }
        System.out.printf("%nPrice: £%.2f", super.getPrice());
    }


}
