import java.util.ArrayList;

public class Burger
{
    protected String type;
    private double price;
    private double extraToppingsPrice = 0.50f;
    private ArrayList<String> extraToppings = new ArrayList<>();

    public Burger(String type, double price)
    {
        this.type = type;
        this.price = price;
    }

    public void addExtra(String extraTopping)
    {
        if(extraToppings.size() < 3)
        {
            extraToppings.add(extraTopping);
        }
        else
        {
            System.out.println("Maximum amount of extra toppings.");
        }
    }

    protected void setPrice(double price)
    {
        this.price += price;
    }

    public double getPrice()
    {
        return price + (extraToppings.size() * extraToppingsPrice);
    }

    public void print()
    {
        if(extraToppings.isEmpty())
        {
            System.out.printf("Type: %s %nPrice: £%.2f %n", type, price);
        }
        else
        {
            System.out.printf("Type: %s  %nExtras: %n",type);
            for(String topping : extraToppings)
            {
                System.out.printf("%s ", topping);
            }
            System.out.printf("%nPrice: £%.2f", getPrice());
        }
    }


}
