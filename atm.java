
import java.util.*;
class atm{
    static Scanner sc = new Scanner(System.in);
    static int x;
     static int balance=100000;
    static int ar[]={10,10,10,10};
    static int atmtotal=28000;
     static String username="Manjit";
    static int up=3102;
    static int customercount=0;
static List<String> mini=new ArrayList<>();
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        welcome();
        home();
    }
    public static void welcome(){
        System.out.println("\t\tATM");
        System.out.println("1.Admin");
        System.out.println("2.Customer");
        System.out.println("3.Exit");
        x=sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        home();
    }
    public static void home(){
        if(x>3 || x<1) welcome();
        switch(x){
            case 1:{
                admin();

            }
            case 2:{
                customer();
            }
            case 3:{
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Thank you for visting the atm");
            }
        }
    }
    public static void admin(){
        System.out.print("Enter UserName : ");
        sc.nextLine();
        String s = sc.nextLine();
        System.out.print("Enter Password : "); 
        int a = sc.nextInt();
        if((s.equals("admin") && a==12345) || ((s.equals("principle") && a==54321))){
            System.out.print("\033[H\033[2J");
        System.out.flush();
            trueAdmin();
        }
    }
    public static void trueAdmin(){
        System.out.println("\t\tWelcome admin");
            System.out.println("1. Add Money");
            System.out.println("2. Show Balance");
            System.out.println("3. Exit");
            int l=sc.nextInt();
            if(l==1){
                System.out.print("\033[H\033[2J");
        System.out.flush();
        add();}
            else if(l==2) {
                System.out.print("\033[H\033[2J");
        System.out.flush();
                show();
            }
            else{
                System.out.print("\033[H\033[2J");
        System.out.flush();
                 welcome();
            }
    }
    public static void add(){
        System.out.println("Enter number of notes to add");
        System.out.println("Enter number of 100");
        ar[0]+=sc.nextInt(); 
        System.out.println("Enter number of 200");
        ar[1]+=sc.nextInt();
        System.out.println("Enter number of 500");
        ar[2]+=sc.nextInt();
        System.out.println("Enter number of 2000");
        ar[3]+=sc.nextInt();
       
        atmtotal=((100*ar[0])+(200*ar[1])+(500*ar[2])+(2000*ar[3]));
        System.out.println("Available cash in ATM "+atmtotal);
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
        System.out.flush();
            trueAdmin();
        } 
    }
    public static void show(){
        System.out.println("100 --> "+ar[0]);
        System.out.println("200 --> "+ar[1]);
        System.out.println("500 --> "+ar[2]);
        System.out.println("2000 --> "+ar[3]);
        System.out.println();
        System.out.println("Available cash in ATM "+atmtotal);
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
        System.out.flush();
            trueAdmin();
        } 
    }
    public static void customer(){

         System.out.print("\033[H\033[2J");
        System.out.flush();
        sc.nextLine();
        System.out.print("Enter  Username: ");
        String n=sc.nextLine();
        System.out.print("Enter  password: ");
        int p=sc.nextInt();
        if(n.equals(username) && up==p && customercount<4){
            
            customerid();}
      
        else{
            customercount++;
            if(customercount<3)
                customer();
            else{
             
           
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                     System.out.println("Sorry! This account is deactivated for 24 hours.");
                     System.out.println("press ENTER to continue !!!");
                     sc.nextLine();
                     String s=sc.nextLine();
                     if(s.equals("")){
                         System.out.print("\033[H\033[2J");
                     System.out.flush();
                         welcome();
                
            }
            
            }}
       
       
    } 
    public static void customerid(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. PIN change");
        System.out.println("5. Transaction");
        System.out.println("6. Mini Statement");
        System.out.println("7. Exit");
        int g=sc.nextInt();
        if(g==1){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            withdraw();}
        else if(g==2){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            deposit();}
        else if(g==3){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            checkbalance();}
        else if(g==4){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            pinchange();}
        else if(g==5){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            transaction();}
        else if(g==6){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            ministatement();}
        else if(g==7){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            welcome();}

    }
    
    public static void withdraw(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the amount: ");
        int amount=sc.nextInt();
        if(amount<=balance && amount<=atmtotal){
            mini.add("Withdrawal  "+amount+" successfully");
         balance-=amount;
         atmtotal-=amount;
         System.out.println("Enter the denominations");
         System.out.println("Enter number of 100");
         ar[0]-=sc.nextInt(); 
         System.out.println("Enter number of 200");
         ar[1]-=sc.nextInt();
         System.out.println("Enter number of 500");
         ar[2]-=sc.nextInt();
         System.out.println("Enter number of 2000");
         ar[3]-=sc.nextInt();
   
       System.out.println("Availabe balance : "+balance);
       System.out.println();

      
       System.out.println("Press enter to continue");
       sc.nextLine();
       String back=sc.nextLine();
       if(back.equals(""))
            customerid();}
       else{
           System.out.println("Sorry, Insufficient balance");
       }
       System.out.println();
       System.out.println("Press enter to continue");
       sc.nextLine();
       String back=sc.nextLine();
       if(back.equals(""))
            customerid();
    }
public static void deposit(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    System.out.println("Enter the amount: ");
    int amount=sc.nextInt();
    System.out.println("Enter the denominations");
       System.out.println("Enter number of 100");
       ar[0]+=sc.nextInt(); 
       System.out.println("Enter number of 200");
       ar[1]+=sc.nextInt();
       System.out.println("Enter number of 500");
       ar[2]+=sc.nextInt();
       System.out.println("Enter number of 2000");
       ar[3]+=sc.nextInt();
      
  
      
   
   balance+=amount;
   atmtotal+=amount;
   System.out.println("Availabe balance : "+balance);
   System.out.println();
   mini.add("Deposit      "+amount+" successfully");

   
   System.out.println("Press enter to continue");
   sc.nextLine();
   String back=sc.nextLine();
   if(back.equals(""))
        customerid();

   }
   public static void  checkbalance(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(balance);
    System.out.println("Press enter to continue");
    sc.nextLine();
    String back=sc.nextLine();
    if(back.equals(""))
         customerid();
   }
   public static void  pinchange(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Enter the PIN");
    int pin=sc.nextInt();
    if(up==pin){
    System.out.println("Enter the new PIN");
    int np=sc.nextInt();
    up=np;
    }
    else    
        System.out.println("Incorrect PIN");
    System.out.println("Press enter to continue");
    sc.nextLine();
    String back=sc.nextLine();
    if(back.equals(""))
         customerid();

   }
   public static void transaction(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    sc.nextLine();
    System.out.println("Enter the account number");
    String newuser=sc.nextLine();
    System.out.println("Enter the money ");
    int transmoney=sc.nextInt();
    if(newuser.contains("rbi")==false){
        transmoney+=20;

    }
    mini.add("Transaction "+transmoney+" successfully");
    balance-=transmoney;
    System.out.println("Press enter to continue");
    sc.nextLine();
    String back=sc.nextLine();
    if(back.equals("")){
        
    System.out.println("Sent successfully");
    System.out.println("your availabe balance : "+balance);
System.out.println();}

    System.out.println("Press enter to continue");

    sc.nextLine();
    String backs=sc.nextLine();
    if(backs.equals("")){
        customerid();}
   }
public static void ministatement(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Type       Amount  Status");
    for(String ms:mini)
        System.out.println(ms);
    sc.nextLine();
    String backs=sc.nextLine();
    int minicount=0;
    while( minicount<7){
    if(backs.equals("")){
         customerid();
        minicount++;}}
}

}

