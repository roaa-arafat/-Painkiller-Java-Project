
package oop_7_HW2;
import java.util.Scanner;

public class TestPainKiller{
    public static void main(String[]args){
      
         Painkiller p1=new Painkiller();
         Painkiller p2=new Painkiller();
         Painkiller p3=new Painkiller();

         DataFill(p1);
         DataFill(p2);
         DataFill(p3);
         
         DataPrint(p1);
         DataPrint(p2);
         DataPrint(p3);
        }
    
    
    public static void DataFill(Painkiller painkiller){
    Scanner s=new Scanner(System.in);
        System.out.print("Enter Name of drug : ");
        painkiller.setName(s.next());
        System.out.print("Enter Type of drug : ");
        painkiller.setType(s.next().charAt(0));
        System.out.print("Enter price of drug : ");
        painkiller.setPrice(s.nextDouble());
        System.out.print("Enter id of drug : ");
        painkiller.setId(s.nextInt());  
    }
    
    
    public static void DataPrint(Painkiller painkiller){
        if (painkiller.getTotalPrice()>20  &&  painkiller.getName().equalsIgnoreCase("Panda")) {
         System.out.println(painkiller.getPainKillerInfo());   
        }
    }
    
    }
