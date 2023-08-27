public class Item {

    private int id;
    private double price;
    private String name;
    private int amount;
    private String color;

    public Item() {
    }

    public Item(int id, double price, String name, int amount, String color) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.amount = amount;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printAllFields(){
        System.out.println("This item's id is : " + id);
        System.out.println("This item's price is : " + price);
        System.out.println("This item's name is : " + name);
        System.out.println("This item's amount is : " + amount);
        System.out.println("This item's color is : " + color);
    }

}
