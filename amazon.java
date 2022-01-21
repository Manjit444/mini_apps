
import java.util.*;
//import java.lang.NoClassDefFoundError;
public class amazon{
    static Scanner sc=new Scanner(System.in);
    static List<Integer>l1=new ArrayList<>();//merchantid
    static List<String>l2=new ArrayList<>();//merchantname
    static List<String>l3=new ArrayList<>();//product name
    static List<String>l4=new ArrayList<>();//product type
    static List<Integer>l5=new ArrayList<>();//productid
    static List<Integer> password=new ArrayList<>();//merchant password
    static List<Integer> prodcount=new ArrayList<>();//product count
    
    static List<Integer> prodprice=new ArrayList<>();//product prize
    static List<Integer> proddiscount=new ArrayList<>();//product discount
    static List<Integer> prodsold=new ArrayList<>();//product sold
    //-------------------------------------------------------------

 
    static List<Integer>l11=new ArrayList<>();//merchantid
    static List<String>l22=new ArrayList<>();//merchantname
    static List<String>l33=new ArrayList<>();//product name
    static List<String>l44=new ArrayList<>();//product type
    static List<Integer>l55=new ArrayList<>();//productid
    static List<Integer> newpassword=new ArrayList<>();//merchant password
    static List<Integer> tempprodcount=new ArrayList<>();//product count
    static List<Integer>tempprice=new ArrayList<>();//product price
    static int x,currentmerchant;
    static String adminname="admin";
    static int adminpassword=12345;
     //----------------------users--------------------------------------
     static List<Integer>userid=new ArrayList<Integer>();
     static List<Integer>userpassword=new ArrayList<>();
     static List<String>username=new ArrayList<>();
     static List<Integer>wallet=new ArrayList<>();
     static int currentuser,lol;
     static int count=0;
     //----------------------add to cart------------------------------
     static List<String>useraddtocart=new ArrayList<>();
     static List<Integer>useratcname=new ArrayList<>();
     static List<String>atcproductname=new ArrayList<>();
     static List<String>atcproducttype=new ArrayList<>();
     static List<Integer>atcprodcount=new ArrayList<>();
     static List<Integer>atcprodprice=new ArrayList<>();
     //-----------------------order------------------------------------
     static List<String>orderid=new ArrayList<>();
     static List<Integer>userorder=new ArrayList<>();
     static List<Integer>ordercount=new ArrayList<>();
     static List<String>orderprodname=new ArrayList<>();
     static List<String>orderprodtype=new ArrayList<>();
     static List<String>orderhistory=new ArrayList<>();
     static List<Integer>Orderprodprice=new ArrayList<>();
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
                System.out.flush();
                

                welcome();
                home();
               
    }
    public static void welcome(){
        System.out.print("\033[H\033[2J");
                System.out.flush();
                l1.add(0);
                l2.add("Manjit");
                l3.add("nike shoes");
                l4.add("shoes");
                l5.add(1001);
                password.add(3102);
                prodcount.add(10);
                prodprice.add(30);
                proddiscount.add(10);
                prodsold.add(0);
                l1.add(1);
                l2.add("sanjit");
                l3.add("adidas shoes");
                l4.add("shoes");
                l5.add(1002);
                password.add(0444);
                prodcount.add(20);
                prodprice.add(30);
                proddiscount.add(10);
                prodsold.add(10);
        //---------------------sample users-------------------------
                userid.add(10000);
                userpassword.add(1044);
                username.add("Supriya S");
                wallet.add(1000);
                userid.add(10001);
                userpassword.add(3939);
                username.add("Sharmal K");
                wallet.add(750);
        //--------------------order history headings-----------------
        System.out.println("-------AMAZON-------");
        System.out.println("1.Admin");
        System.out.println("2.Merchant");
        System.out.println("3.Customer");
        System.out.println("4.Exit");
        
        x=sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        home();
     }
     public static void home(){
        if(x>4 || x<1)
         {welcome();
          
           }
        switch(x){
            case 1:{
            
                admin();
            }
            case 2:{
                merchant();
            }
            case 3:
                user();
            case 4:{
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Thank you for visting the amazon");
            }
        }
    }
    public static void admin(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("----ADMIN LOGIN----");
        System.out.println("Enter the Username");
        sc.nextLine();
        String loginname=sc.nextLine();//adminname
        System.out.println("Enter the Password");
        int loginpass=sc.nextInt();//adminpassword
        if(adminname.equals(loginname) && adminpassword==loginpass ){
            adminnext();
        }
    else    
        System.out.println("Invalid user found.");
}
public static void adminnext(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1.Add Merchant");
    System.out.println("2.Approve Merchants");
    System.out.println("3.Remove Merchants");
    System.out.println("4.View Merchants"); 
    System.out.println("5.Exit");
    System.out.println();
    System.out.println("Enter your choice");
    int ao=sc.nextInt();
    if(ao==1)
        addnewmerchant();
    else if(ao==2)
        addmerchant();
    else if(ao==3)
       removemerchant();
    else if(ao==4)
        viewmerchant();
    else if(ao==5)
        welcome();
}
public static void addnewmerchant(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("----------------Add Merchants--------------");
    System.out.print("Merchant ID:    ");//int
    l1.add(l1.get(l1.size()-1)+1);
    System.out.println("Merchant Name:  ");//string
    sc.nextLine();
    l2.add(sc.nextLine());
   //int
    l5.add(l5.get(l5.size()-1)+1);
    System.out.println("Product Name:   ");//string
    l3.add(sc.nextLine());
    System.out.println("Product Type:   ");//string
    l4.add(sc.nextLine());
    password.add(0000);
    System.out.println("Product count:  ");//int
    prodcount.add(sc.nextInt());
    proddiscount.add(0);
        prodsold.add(0);
    System.out.println();
    System.out.println("Successfully added");
    System.out.println();
    System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            viewmerchant();
  

}
public static void addmerchant(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("------------------------------");
    System.out.println("Merchant ID:     "+l11.get(l11.size()-1));//int
    System.out.println("Merchant Name:   "+l22.get(l22.size()-1));//string
    System.out.println("Product ID:      "+l55.get(l55.size()-1));//int
    System.out.println("Product Name:    "+l33.get(l33.size()-1));//string
    System.out.println("Product Type:    "+l44.get(l44.size()-1));//string
    System.out.println("Product Count:   "+tempprodcount.get(tempprodcount.size()-1));//int
    System.out.println("Product Price:   "+tempprice.get(tempprice.size()-1));//int
    System.out.println("------------------------------");
    //System.out.println();
    System.out.println("press 1 to accept");
    System.out.println("press 0 to cancel");
    int op=sc.nextInt();
    if(op==1){
        l1.add(l11.get(l11.size()-1));
        l2.add(l22.get(l22.size()-1));
        l5.add(l55.get(l55.size()-1));
        l3.add(l33.get(l33.size()-1));
        l4.add(l44.get(l44.size()-1));
        password.add(newpassword.get(newpassword.size()-1));
        prodcount.add(tempprodcount.get(tempprodcount.size()-1));
        prodprice.add(tempprice.get(tempprice.size()-1));
        proddiscount.add(0);
        prodsold.add(0);

        System.out.println("Successfully Added !!!");
    }
    else   
         System.out.println("Successfully Rejected ");
    System.out.println();
    System.out.println("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        adminnext();
}
public static void removemerchant(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("Enter the Merchant ID to remove : ");
    int rm=sc.nextInt();
    if(l1.contains(rm)){
        int merid=rm-1;
        System.out.println("------------------------------");
        System.out.println("Merchant ID        "+l1.get(merid));
        System.out.println("Merchant Name      "+l2.get(merid));
        System.out.println("Product ID         "+l5.get(merid));
        System.out.println("Product Name       "+l3.get(merid));
        System.out.println("Product Type       "+l4.get(merid));
        System.out.println("Product prize      "+prodprice.get(merid));
        System.out.println("Product Count      "+prodcount.get(merid));
        System.out.println("Product Sold       "+prodsold.get(merid));
        System.out.println("Product Discount   "+proddiscount.get(merid));
        
        System.out.println("------------------------------");
        l1.remove(l1.get(merid));
        l2.remove(l2.get(merid));
        l3.remove(l3.get(merid));
        l4.remove(l4.get(merid));
        l5.remove(l5.get(merid));
        password.remove(password.get(merid));
        prodcount.remove(prodcount.get(merid));
        prodprice.remove(prodprice.get(merid));
        proddiscount.remove(proddiscount.get(merid));
        prodsold.remove(prodsold.get(merid));


        System.out.println("Merchant Account removed successfully.");
        System.out.println();
        System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        adminnext();
    }
    else {   
        System.out.println("Merchant account doesn't exist.");
        System.out.println();
        System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        adminnext();
    }
}
public static void viewmerchant(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("----View Merchants----");
    System.out.println();
    System.out.println("1. View all merchants");
    System.out.println("2. View a particular merchant");
    System.out.println("3. Exit");
    System.out.println();
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    if(choice==1){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for(int i=0;i<l1.size();i++){
            System.out.println("------------------------------------------");
            System.out.println("Merchant ID:    "+l1.get(i));//int
            System.out.println("Merchant Name:  "+l2.get(i));//string
            System.out.println("Product ID:     "+l5.get(i));//int
            System.out.println("Product Name:   "+l3.get(i));//string
            System.out.println("Product Type:   "+l4.get(i));//string

            System.out.println();
        }
        System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            viewmerchant();
    }
    else if(choice==2){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the merchant id:");
        int reqmer=sc.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Merchant ID:    "+l1.get(reqmer));//int
        System.out.println("Merchant Name:  "+l2.get(reqmer));//string
        System.out.println("Product ID:     "+l5.get(reqmer));//int
        System.out.println("Product Name:   "+l3.get(reqmer));//string
        System.out.println("Product Type:   "+l4.get(reqmer));//string
        System.out.println();
        System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            viewmerchant();
    }
    else if(choice==3){
        adminnext();
    }
    
}
public static void merchant(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("--------------Merchant----------------");
        System.out.println("1.Login");
        System.out.println("2.Sign Up");
        System.out.println("3.Exit");
        System.out.println();
        System.out.println("Enter your choice");
        int merchoice=sc.nextInt();
        if(merchoice==1)
            login();
        else if(merchoice==2)
            signup();
        else if(merchoice==3)
            welcome();
}
public static void login(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter your merchant ID");
        int merlog=sc.nextInt();
        System.out.println("Enter your password");
        int merpass=sc.nextInt();
        if(l1.contains(merlog) && password.contains(merpass)){
            currentmerchant=merlog;
            merchantnext();

        }
        else {
            System.out.println("Account doesn't exist. Please SignUp");
            System.out.println();
        System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            signup();
        }  

}
public static void signup(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        l11.add(l1.get(l1.size()-1)+1);
        System.out.println("Merchant Name:  ");//string
        sc.nextLine();
        l22.add(sc.nextLine());
       //int
        l55.add(l5.get(l5.size()-1)+1);
        System.out.println("Product Name:   ");//string
        l33.add(sc.nextLine());
        System.out.println("Product Type:   ");//string
        l44.add(sc.nextLine());
        System.out.println("Password:   ");//int
        newpassword.add(sc.nextInt());
        System.out.println("Product Count:   ");//int
        tempprodcount.add(sc.nextInt());
        System.out.println("Product Price:   ");//int
        tempprice.add(sc.nextInt());
        System.out.println();
        System.out.println("Please wait for a while to approved by admin");
        System.out.println();
        System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            merchant();
}
public static void merchantnext(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("1.Product Add");
    System.out.println("2.Product Availability");
    System.out.println("3.Product Sold");
    System.out.println("4.Product Edit");
    System.out.println("5.Logout");
    System.out.println();
    System.out.println("Enter your choice");
    int mernexchoice=sc.nextInt();
    if(mernexchoice==1)
        productadd();
   else if(mernexchoice==2)
       productavailability();
   else if(mernexchoice==3)
        productsold();
   else if(mernexchoice==4)
        productedit();
    else if(mernexchoice==5)
        welcome();
    

}
public static void productadd(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-----------------Product Add----------------------");
    System.out.println();
    System.out.println("Total no.of.available product : "+ prodcount.get(currentmerchant));
    System.out.println();
    int oldavail=prodcount.get(currentmerchant);
    System.out.println("Enter total count of product to add: ");
    int addpro=sc.nextInt();
    oldavail=oldavail+addpro;
    prodcount.set(currentmerchant,oldavail);
    System.out.println();
    System.out.println("Products added successfully....");
    System.out.println("Total no.of.available product : "+ prodcount.get(currentmerchant));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        merchantnext();
    }

public static void productavailability(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("-----------------Product Availability----------------------");
    System.out.println();
    System.out.println("Total no.of.available product : "+ prodcount.get(currentmerchant));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        merchantnext();
    }
public static void productsold(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("-----------------Product Availability----------------------");
    System.out.println();
    System.out.println("Total no.of.items sold : "+prodsold.get(currentmerchant));
    System.out.println();
    System.out.println("Total no.of.items left : "+(prodcount.get(currentmerchant)-prodsold.get(currentmerchant)));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        merchantnext();
    }
public static void productedit(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("-----------------Product Edit----------------------");
    System.out.println();
    System.out.println("1.Price Update");
    System.out.println("2.Price Discount");
    System.out.println("3.Product Name Change");
    System.out.println("4.Exit");
    System.out.println();
    int editchoice=sc.nextInt();
    if(editchoice==1)
        pricechange();
    else if(editchoice==2)
        pricediscount();
    else if(editchoice==3)
        productnamechange();
    else if(editchoice==4)
        merchantnext();
}
public static void pricechange(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("--------------------Price Update--------------------");
    System.out.println();
    System.out.println("Price of the product : "+ prodprice.get(currentmerchant));
    System.out.println();
    System.out.println("Enter new price of the product : ");
    System.out.println();
    int updprice=sc.nextInt();
    prodprice.set(currentmerchant,updprice);
    System.out.println("Updated prize of the product : "+prodprice.get(currentmerchant));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        productedit();
}
public static void pricediscount(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("--------------------Price Discount--------------------");
    System.out.println();
    System.out.println("Enter the percentage of discount");
    int pricediscount=sc.nextInt();
    proddiscount.set(currentmerchant,pricediscount);
    System.out.println("Updated price of the product : "+(prodprice.get(currentmerchant)*(int)(pricediscount/100)));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        productedit();

}
public static void productnamechange(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("--------------------Change product name--------------------");
    System.out.println();
    System.out.println("product name : "+l3.get(currentmerchant));
    System.out.println();
    sc.nextLine();
    String newname=sc.nextLine();
    l3.set(currentmerchant,newname);
    System.out.println("Updated product name : "+ l3.get(currentmerchant));
    System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        productedit();
}
public static void user(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("------------------------------user----------------------------");
    System.out.println();
    System.out.println("1.Login");
    System.out.println("2.Sign Up");
    System.out.println("3.Exit");
    System.out.println();
    System.out.println("Enter your choice");
    int userchoice=sc.nextInt();
    if(userchoice==1)
        userlogin();
    else if(userchoice==2)
        usersignup();
    else if(userchoice==3)
        welcome();
}
public static void userlogin(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("------------------------------User Login----------------------------");
    System.out.println();
    System.out.println("Enter User Id : ");
    int userloginid=sc.nextInt();
    currentuser=userloginid;
    System.out.println("Enter your password");
    int userloginpassword=sc.nextInt();
    if(userid.contains(userloginid) && userpassword.contains(userloginpassword))
        amazonhome();
    else{
        System.out.println("Please Sign Up");
        
        System.out.println();
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
     usersignup();

    }

}

public static void usersignup(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("------------------------------User Login----------------------------");
    System.out.println();
    System.out.println("Enter your name: ");
    sc.nextLine();
    username.add(sc.nextLine());
    System.out.println("Enter your password: ");
    userpassword.add(sc.nextInt());
    int newuserid=userid.get(userid.size()-1)+1;
    System.out.println("Your UserID is : "+newuserid);
    System.out.println();
    System.out.println("Account added successfully");
    System.out.println();
    wallet.add(0);
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        amazonhome();
}
public static void amazonhome(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("----------------------------Amazon Home-------------------------------");
    System.out.println();
    for(int i=0;i<l1.size();i++){
        System.out.println("------------------------------------------");
       // System.out.println("Merchant ID:    "+l1.get(i));//int
        System.out.println("Merchant Name:  "+l2.get(i));//string
        System.out.println("Product ID:     "+l5.get(i));//int
        System.out.println("Product Name:   "+l3.get(i));//string
        System.out.println("Product Type:   "+l4.get(i));//string
        System.out.println("Product Count:  "+prodcount.get(i));//int
        System.out.println("Product Price:  "+prodprice.get(i));//int
        System.out.println();
    }
    System.out.println("1. Add to cart");
    System.out.println("2. Order");
    System.out.println("3. View Cart");
    System.out.println("4. Order History");
    System.out.println("5. Add Wallet");
    System.out.println("6. Exit");
    System.out.println("Enter your option");
    int userbuyoption=sc.nextInt();
    if(userbuyoption==1)
        addtocart();
    else if(userbuyoption==2)
        order();
    else if(userbuyoption==3)
        editcart();
    else if(userbuyoption==4)
     userorderhistory();
    else if(userbuyoption==5)
        wallet();
    else if(userbuyoption==6)
        welcome();
}
public static void addtocart(){
    System.out.println("Enter the product Id");
    int addtocartid=sc.nextInt();
    int prodindex=l5.indexOf(addtocartid);
    String straddtocartid=currentuser+""+addtocartid+""+count;
    count++;
    if(useraddtocart.contains(straddtocartid)==false){
    useraddtocart.add(straddtocartid);
    useratcname.add(currentuser);
    atcproductname.add(l3.get(prodindex));
    atcproducttype.add(l4.get(prodindex));
    System.out.println("Enter the count: ");
    int jkkn=sc.nextInt();
    atcprodcount.add(jkkn);
    atcprodprice.add(jkkn*prodprice.get(prodindex));
    System.out.println("Successfully Added");
}
    else{
        int alreadyin=useraddtocart.indexOf(straddtocartid);
        int basecount=atcprodcount.get(alreadyin);
        int baseprice=atcprodprice.get(alreadyin);
        int trueprice=(int)baseprice/basecount;
        System.out.println("Enter the count: ");
        int yy=sc.nextInt();
        atcprodcount.set(alreadyin,yy);
        System.out.println("Successfully Added");
        atcprodprice.set(alreadyin,yy*trueprice);
    }
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true){
    System.out.print("\033[H\033[2J");
    System.out.flush();
        amazonhome();}
}
public static void order(){
    System.out.println("------------------order-------------------");
    System.out.println("Enter the product Id: ");
    int orderids=sc.nextInt();
    int prodorderindex=l5.indexOf(orderids);
    String strorderid=currentuser+""+orderids;
    orderid.add(strorderid);
    System.out.println("Enter the count: ");
    int ordercounts=sc.nextInt();
    ordercount.add(ordercounts);
    int remainingcount=prodcount.get(prodorderindex)-ordercounts;
    prodcount.set(prodorderindex,remainingcount);
    userorder.add(currentuser);
    orderprodname.add(l3.get(prodorderindex));
    orderprodtype.add(l4.get(prodorderindex));
    Orderprodprice.add(prodprice.get(prodorderindex));
    System.out.println();
    System.out.println("User Name:      "+userorder.get(userorder.size()-1));
    System.out.println("Order Id:       "+orderid.get(orderid.size()-1));
    System.out.println("Product count:  "+ordercount.get(ordercount.size()-1));
    System.out.println("Product Name:   "+orderprodname.get(orderprodname.size()-1));
    System.out.println("Product Type:   "+orderprodtype.get(orderprodtype.size()-1));
    System.out.println("Product price:  "+ordercount.get(ordercount.size()-1)*Orderprodprice.get(Orderprodprice.size()-1));
    orderhistory.add(userorder.get(userorder.size()-1)+"          "+orderid.get(orderid.size()-1)+"         "+ordercount.get(ordercount.size()-1)+"            "+orderprodname.get(orderprodname.size()-1)+"        "+orderprodtype.get(orderprodtype.size()-1)+"              "+ordercount.get(ordercount.size()-1)*Orderprodprice.get(Orderprodprice.size()-1));
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true){
    System.out.print("\033[H\033[2J");
    System.out.flush();
        amazonhome();}
}
public static void editcart(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("----------------Edit Your Cart----------------");
    System.out.println();

    System.out.println(currentuser);
    for(int k=0;k<useratcname.size();k++){
        if(useratcname.get(k)==(currentuser)){
            lol=k;
            System.out.println("Cart Id:        "+useraddtocart.get(k));
            System.out.println("Product Count:  "+atcprodcount.get(k));
            System.out.println("Product Name:   "+atcproductname.get(k));
            System.out.println("Product Type:   "+atcproducttype.get(k));
            System.out.println("Product Price:  "+atcprodprice.get(k));
            System.out.println("-------------------------------------");
        }

    }
    System.out.println();
    //System.out.println("1. Proceed to order");
    System.out.println("1. Remove from cart");
    System.out.println("2. Exit");
    System.out.println("");
    System.out.println("Enter your option : ");
    int cartoption=sc.nextInt();

 if(cartoption==1){
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("----------------Remove product from cart----------------");
        System.out.println();
        System.out.println("Enter the Cart Id");
        int removefromcart=sc.nextInt();
        if(useraddtocart.contains(removefromcart)){
            int removeindex=useratcname.indexOf(removefromcart);
            System.out.println("Cart Id:        "+useraddtocart.get(removeindex));
            System.out.println("Product Count:  "+atcprodcount.get(removeindex));
            System.out.println("Product Name:   "+atcproductname.get(removeindex));
            System.out.println("Product Type:   "+atcproducttype.get(removeindex));
            System.out.println("-------------------------------------");
            useraddtocart.remove(useraddtocart.get(removeindex));
            atcprodcount.remove(atcprodcount.get(removeindex));
            atcproductname.remove(atcproductname.get(removeindex));
            atcproducttype.remove(atcproducttype.get(removeindex));
            useraddtocart.remove(useraddtocart.get(removeindex));
        }
        else{
            System.out.println("Sorry! Could not able to find cart Id");
        }
        System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            amazonhome();

    }
    else if(cartoption==2)
        amazonhome();
}
public static void userorderhistory(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("----------------Order History----------------");
    System.out.println();
    System.out.println("User Id         Order Id      Order Count    Product Name    Product Type   Product Price");
    System.out.println();
    for(int jj=0;jj<orderhistory.size();jj++){
        String check=orderhistory.get(jj);
        if(check.contains(String.valueOf(currentuser))){
            System.out.println(check);
    }
 }
 System.out.print("press ENTER to continue");
        sc.nextLine();
        String em=sc.nextLine();
        if(em.equals("")==true)
            amazonhome();
}
public static void wallet(){
    System.out.print("\033[H\033[2J");
    System.out.flush(); 
    System.out.println("----------------Order History----------------");
    int currentuserindex=userid.indexOf(currentuser);
    System.out.println("Available Balance: "+wallet.get(currentuserindex));
    System.out.println("Enter the amount: ");
    int walletamount=sc.nextInt();
    int totalbalance=walletamount+wallet.get(currentuserindex);
    wallet.set(currentuserindex,totalbalance);
    System.out.println();
    System.out.println("Successfully Added");
    System.out.println("Current Balance: "+wallet.get(currentuserindex));
    wallet.set(currentuserindex,walletamount);
    System.out.print("press ENTER to continue");
    sc.nextLine();
    String em=sc.nextLine();
    if(em.equals("")==true)
        amazonhome();
}
}