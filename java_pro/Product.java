import java.util.Scanner;
 
class Product{
 int pcode;
 String pname;
 float price;
 void insertRecord(int cod,String nam,float prc){
    pcode = cod;
    pname = nam;
    price = prc;

  }
  void findLowest(float pr1,float pr2,float pr3,String nm1,String nm2,String nm3){
     System.out.println("Lowest price item is:");
  if(pr1 < pr2 && pr1<pr3){
      System.out.println("product name: "+nm1 + "  price: "+ pr1);
     }
  else if(pr2< pr1 && pr2 < pr3){
      System.out.println("product name: "+nm2 + "  price: "+ pr2);
     }
  else if(pr3 < pr2 && pr3 < pr1){
     System.out.println("product name: "+nm3 + "  price: "+ pr3);
     }
  else{
     System.out.println("all product have equal price");
    }
    
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
   
   Product p1 = new Product();
   Product p2 = new Product();
   Product p3 = new Product();
   
   p1.insertRecord(cd1,name1,price1);
   p2.insertRecord(cd2,name2,price2);
   p3.insertRecord(cd3,name3,price3);

   p1.findLowest(price1,price2,price3,name1,name2,name3);
  
  }
}