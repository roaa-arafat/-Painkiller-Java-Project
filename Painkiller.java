
package oop_7_HW2;


public class Painkiller extends Drug{
    
    private int id;
    private String name;

    public Painkiller() {
         super(5, 'p');
        this.id = 1;
        this.name = "Panda";
    }


    public Painkiller(int id, String name, double price, char type) {
        super(price, type);
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("Panda") || name.equalsIgnoreCase("Voltaren")) {
            this.name = name;
        } else {
            System.out.println("name invalid");
        }
    }
    
       @Override
    public double getTotalPrice() {
        double TotalPrice=0;
        if (name.equalsIgnoreCase("Panda")) {
            TotalPrice= getPrice() - getDiscount() + 1.5;
        } else if (name.equalsIgnoreCase("Voltaren")) {
               TotalPrice= getPrice() - getDiscount() + 2;
           }
        else 
        System.out.println("TotalPrice invalid");
        return TotalPrice;
    }

    
     public String getPainKillerInfo() {
        return getId() + " - " + getName()+ " - " + getType() + " - " +
               getPrice() + " - " + getDiscount() + " - " + getTotalPrice();
    }
    
}
