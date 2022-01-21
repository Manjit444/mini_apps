import java.util.*;
public class splitwise {
    static int current_user_index;
    static int home_choice;
    static   String where;
    static Scanner sc=new Scanner(System.in);
    static List<String> name=new ArrayList<>();
    static List<Integer> password=new ArrayList<>();
    static List<Integer> money=new ArrayList<>();
    //----------------------------------------------------
    static List<String>currently_in_shop=new ArrayList<>();
    static List<Integer>current_friends_balance=new ArrayList<>();
//----------------------------------------------------------
    static List<String> names=new ArrayList<>();
    static List<String> payments=new ArrayList<>();
    //--------------------------------------------
        public static void main(String[] args){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            name.add("manjit");
            password.add(12345);
            money.add(1000);
            //====================
            name.add("raju");
            password.add(12345);
            money.add(1200);
            //====================
            name.add("gopal");
            password.add(12345);
            money.add(900);
            //====================
            
            welcome();
    }
    public static void welcome(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("==================SPLITWISE====================");
            System.out.println();
         
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.println();
            System.out.println("========================");
            System.out.println("Enter your choice : ");
            int current_friend_choice=sc.nextInt();
            if(current_friend_choice==1)
                login();
            else    
                System.out.println("Thankyou for using splitwise !!!");;
    }
    public static void login(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("==================LOGIN====================");
        System.out.println();
        System.out.print("Enter your name : ");
        sc.nextLine();
        String current_user=sc.nextLine();
        if(name.contains(current_user)){
            current_user_index=name.indexOf(current_user);
            System.out.println();
            System.out.print("Enter your password : ");
            int user_password=sc.nextInt();
            System.out.println();
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                home();}

        }
        else{
            System.out.println("Sorry!! You are not in the friend's list");
            System.out.println();
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                welcome();}
        }
    }
    public static void home(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("===============Home Page=============");
        System.out.println();
        System.out.println("1. Shop");
        System.out.println("2. My Balance");
        System.out.println("3. Exit");
        System.out.println("============================");
        System.out.println("Enter your choice : ");
        int home_choice=sc.nextInt();
        if(home_choice==1){
            shop();
        }
        else if(home_choice==2){
            my_balance();
        }
        else 
            welcome();
    }
    public static void shop(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("===============Home Page=============");
        System.out.println();
        System.out.println("1. Tea Shop");
        System.out.println("2. Mall");
        System.out.println("3. Hotel");
        System.out.println("4. Exit");
        System.out.println("============================");
        System.out.println("Enter your choice : ");
         home_choice=sc.nextInt();
        if(home_choice==1 ||home_choice==2 || home_choice==3){
            all_in_one_shop();
            
        }
        
        else 
        home();
 }
 public static void all_in_one_shop(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("===============SHOP :)=============");
    System.out.println();
    int sino=0;
    for(int i=0;i<name.size();i++){
        if(i!=current_user_index){
        System.out.println((sino+1)+" "+name.get(i));
        sino++;}
    }
    names.add(name.get(current_user_index));
    System.out.println("==============================================");
    System.out.print("Enter the number of friend coming with you : ");
    int coming_friends=sc.nextInt();
    sc.nextLine();
  
    for(int i=0;i<coming_friends;i++){
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Enter the friends name : ");
        String friend_name=sc.nextLine();
        int friend_index=name.indexOf(friend_name);
        current_friends_balance.add(friend_index);
        names.add(friend_name);
    }
    System.out.println("----------------------------------------------");
    System.out.println();
    int bill=0;
   
    if(home_choice==1){
        System.out.println("Your total bill is Rs.30");
        bill=30;
        where="tea shop";
    }
    else if(home_choice==2){
        System.out.println("Your total bill is Rs.900");
        bill=900;
        where="mall";
    }
    else if(home_choice==3){
        System.out.println("Your total bill is Rs.600");
        bill=600;
        where="hotel";
    }

    System.out.println();
 
    System.out.println("Who is going to pay the bill??");

    int bill_payer=name.indexOf(sc.nextLine());
    int payer_balance=money.get(bill_payer)-bill;
    System.out.println();
    System.out.println(name.get(bill_payer)+"'s available balance is Rs."+payer_balance);
    money.set(bill_payer,payer_balance);
    int split_pay=(int)bill/(coming_friends+1);
for(int i=0;i<names.size();i++){
    if(i==bill_payer){
        
        payments.add(" paid Rs."+bill+" in "+where);
    }
    else{
        
        payments.add(" need to give Rs."+split_pay+" to "+name.get(bill_payer));
    }
}
System.out.println("press ENTER to continue !!!");
sc.nextLine();
String s=sc.nextLine();
if(s.equals("")){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    shop();}

 }
public static void my_balance(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-----------------------------------My Balance----------------------------------");
    System.out.println();
    int sino=1;
    boolean isthere=true;
    if(names.size()>0){
    for(int i=0;i<names.size();i++){
        if(names.get(i)==name.get(current_user_index)){
            System.out.println(sino+". "+"You "+payments.get(i));
            sino++;
        }
        else if((payments.get(i)).contains(name.get(current_user_index))){
            String edited=payments.get(i).replace(name.get(current_user_index),"you");
            System.out.println(sino+". "+names.get(i)+edited);
            sino++;
        }
        else{
            isthere=false;
        }
      
    }}
    else{
        System.out.println("Sorry!! No transactions found.");
    }
    if (isthere=false){
        System.out.println("Hola!! No debts ....");
    }
    System.out.println();
    System.out.println("press ENTER to continue !!!");
sc.nextLine();
String s=sc.nextLine();
if(s.equals("")){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    home();}
}
}
