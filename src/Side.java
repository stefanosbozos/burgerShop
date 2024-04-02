public class Side
{
    private String type;
    private double price;

    public Side(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void print()
    {
        System.out.printf("%nSide: %s - £%.2f", type, price);
    }
}
