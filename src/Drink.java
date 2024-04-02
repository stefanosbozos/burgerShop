public class Drink
{
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size)
    {
        this.type = type;
        this.size = size;
        this.price = (size.equalsIgnoreCase("regular") ? 1.50f :
                (size.equalsIgnoreCase("small") ? 1.00f : 2.00f));
    }

    public double getPrice()
    {
        return price;
    }

    public void print()
    {
        System.out.printf("%nType: %s %s - £%.2f", size, type, price);
    }
}
