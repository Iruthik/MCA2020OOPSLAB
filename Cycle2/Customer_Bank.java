import java.util.*;
class Bank{
int accno;
String 	name,type;
float amount;
void details(int n,String nm,String t,float a)
{
accno=n;
name=nm;
type=t;
amount=a;
}
	
void show()
{
System.out.println("Account number of the customer:"+accno);
System.out.println("Customer Name:"+name);
System.out.println("Account Type:"+type);
System.out.println("Balance Amount:" +amount);
}
void deposit(float a)
{
amount=amount+a;
System.out.println("deposit amount:"+amount);
}
void withdraw(float a)
{
if(amount<a)
System.out.println("insufficentt balance");
else
amount=amount-a;
System.out.println("withdraw amount is:"+a);

}
void checkbalance()
{
System.out.println("balance is:"+amount);
}
}
class Customer_Bank{
public static void main(String args[])
{
Bank b =new Bank();
b.details(123456,"Iruthik","savings",2000);
b.show();
b.deposit(40000);
b.checkbalance();
b.withdraw(10000);
b.checkbalance();
}
}