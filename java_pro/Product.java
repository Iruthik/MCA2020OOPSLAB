import java.util.Scanner;
class Product {
  int pcode;
  String pname;
  float price;
    
   public Product(int code,String name,float pric){
      pcode = code;
      pname = name;
      price = pric;
  
  }
    
public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter code of first product:");
   int cd1 = input.nextInt();
   System.out.println("Enter name of first product:");
   String name1 = input.next();
   System.out.println("Enter price of first product:");
   float price1 = input.nextFloat();

   System.out.println("Enter code of second product:");
   int cd2 = input.nextInt();
   System.out.println("Enter name of second product:");
   String name2 = input.next();
   System.out.println("Enter price of second product:");
   float price2 = input.nextFloat();

   System.out.println("Enter code of third product:");
   int cd3 = input.nextInt();
   System.out.println("Enter name of third product:");
   String name3 = input.next();
   System.out.println("Enter price of third product:");
   float price3 = input.nextFloat();
   
    Product p1 = new Product(cd1,name1,price1);
    Product p2 = new Product(cd2,name2,price2);
    Product p3 = new Product(cd3,name3,price3);

    System.out.println("Lowest price item is:");
  if(p1.price < p2.price && p1.price < p3.price){
      System.out.println("product name: "+p1.pname + "  price: "+ p1.price);
     }
  else if(p2.price< p1.price && p2.price < p3.price){
      System.out.println("product name: "+p2.pname + "  price: "+ p2.price);
     }
  else if(p3.price < p2.price && p3.price < p1.price){
     System.out.println("product name: "+p3.pname + "  price: "+ p3.price);
     }
  else{
     System.out.println("all product have equal price");
    }
    
    }
 }