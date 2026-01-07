package oop_7_HW2;

public class Drug {

    private double price;
    private char type;

    public Drug() {
        price = 5;
        type = 'p';
    }

    public Drug(double price, char type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 60) {
            this.price = price;
        } else {
            System.out.println("Price invalid");
        }
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'P' || type == 'p' || type == 'D' || type == 'd') {
            this.type = type;
        }
        System.out.println("Type invalid");

    }

    public double getDiscount() {
        double Discount = 0;
        switch (type) {
            case 'p': case 'P': Discount = price * 7 / 100; break;
            case 'd':case 'D': Discount = price * 10 / 100; break;
            default:
                System.out.println("type invaled");
        }
        return Discount;
    }

    public double getTotalPrice(){ 
        double TotalPrice=0;
        TotalPrice=getPrice()-getDiscount();
        return TotalPrice; 
    }

    @Override
    public String toString() {
        return "price=" + price
                + ", type=" + type
                + ", discount=" + getDiscount()
                + ", total price=" + getTotalPrice();
    }

}
