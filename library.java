import java.util.*;
import java.text.*;
import java.time.*;
public class library {
static   Scanner sc=new Scanner(System.in);
static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//------------------admins-----------------------------
static List<String>admin_mail_id=new ArrayList<>();
static List<Integer>admin_password=new ArrayList<>();
static int  current_admin_index;
//--------------------learners-------------------------
static List<Integer>learner_id=new ArrayList<>();
static List<String>learner_user_id=new ArrayList<>();
static List<Integer>learner_password=new ArrayList<>();
static List<Integer>learner_deposit=new ArrayList<>();
//-------------------books------------------------------
static List<String>book_name=new ArrayList<>();
static List<Integer>book_count=new ArrayList<>();
static List<String>book_type=new ArrayList<>();
static List<Integer>book_id=new ArrayList<>();
static List<Integer>book_price=new ArrayList<>();
//-------------------borrows------------------------------
static List<Integer>borrowid=new ArrayList<>();
static List<String>borrow_buy_date=new ArrayList<>();
static List<String>borrow_due_date=new ArrayList<>();
static List<String>borrow_book_name=new ArrayList<>();
static List<Integer>borrow_book_id=new ArrayList<>();
static List<String>borrowedid=new ArrayList<>(); 
//--------------------current users------------------------
static int current_user_index;
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //------admins-------
        admin_mail_id.add("manjit444manjit@gmail.com");
        admin_password.add(12345);
        admin_mail_id.add("19ec061@kpriet.ac.in");
        admin_password.add(12345);
        //----learner--------
        learner_id.add(10000);
        learner_user_id.add("manjit444");
        learner_deposit.add(1500);
        learner_password.add(12345);
        //-----books---------
        book_type.add("Nonfiction Books");
        book_name.add("The Diary of Anne Frank");
        book_id.add(100);
        book_count.add(10);
        book_price.add(1200);

        book_type.add("Fiction Books");
        book_name.add("The Sun Also Rises");
        book_id.add(101);
        book_count.add(15);
        book_price.add(900);        

        book_type.add("Food");
        book_name.add("Mastering the Art of French Cooking");
        book_id.add(102);
        book_count.add(9);
        book_price.add(850);     

        book_type.add("History");
        book_name.add("Killing England");
        book_id.add(103);
        book_count.add(13);
        book_price.add(1850);

        book_type.add("Memoir");
        book_name.add("Becoming");
        book_id.add(104);
        book_count.add(8);
        book_price.add(2000);

        book_type.add("Politics");
        book_name.add("A Promised Land");
        book_id.add(105);
        book_count.add(8);
        book_price.add(2700);
        welcome();
         }
        public static void welcome(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("--------------------------------Online Library Management System------------------------------------");
            System.out.println();
            System.out.println("1. Admin ");
            System.out.println("2. Learner");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("Enter your choice: ");
            int admin_choice=sc.nextInt();
            if(admin_choice==1)
                welcomeadmin();
            else if(admin_choice==2)
                learner();
            else if(admin_choice==3){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Thanks for using online library management system :)");   
    }}
    public static void welcomeadmin(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("--------------------------------Online Library Management System------------------------------------");
        System.out.println();
        System.out.println("1. Admin Login");
        System.out.println("2. Admin SignUp");
        System.out.println("3. Exit");
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Enter your choice: ");
        int admin_choice=sc.nextInt();
        if(admin_choice==1)
            admin_login();
        else if(admin_choice==2)
            admin_signup();
        else if(admin_choice==3)
            welcome();
            
    }
    public static void admin_login(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------------------------------Admin Login-----------------------------------");
        System.out.println();
        System.out.println("Enter your mail id : ");
        sc.nextLine();
        String mail_id=sc.nextLine();
        if(admin_mail_id.contains(mail_id)){
            current_admin_index=admin_mail_id.indexOf(mail_id);
            System.out.println();
            System.out.println("Enter your password :");
            int password=sc.nextInt();
            if(admin_password.get(current_admin_index)==password){
                admin_next();
            }
            else{
                System.out.println("Incorrect Password");
                System.out.println("press ENTER to continue !!!");
                sc.nextLine();
                String s=sc.nextLine();
                if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                admin_login();
            }

        }
    }
    else{
        System.out.println("Sorry! Account doesn't exist. Please SignUp");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        admin_signup();
    }
       

    }}
    public static void admin_signup(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("----------------------------Admin SignUp--------------------------");
        System.out.println();
        sc.nextLine();
        System.out.println("Enter your mail Id : ");
        String new_admin=sc.nextLine();
        admin_mail_id.add(new_admin);
        System.out.println();
        System.out.println("Enter your password : ");
        int new_password=sc.nextInt();
        System.out.println("Confirm your password : ");
        int confirm_password=sc.nextInt();
        if(new_password!=confirm_password){
            System.out.println("Password Incorrect");
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            admin_signup();
        }}
        else{
            System.out.println("Account created successfully");
            System.out.println();
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            admin_next();

        }}
    }
    public static void admin_next(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("----------------------Admin --------------------");
            System.out.println();
            System.out.println("1. Add new admin");
            System.out.println("2. Add new Learners");
            System.out.println("3. Edit  books");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("Enter your choice: ");
            int admin_choice=sc.nextInt();
            if(admin_choice==1)
                add_new_admin();
            else if(admin_choice==2)
                add_new_learner();
            else if(admin_choice==3)
                edit_book();
            else if(admin_choice==4)
                admin_next();
    }
    public static void add_new_admin(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("----------------------New Admin--------------------");
        System.out.println();
        sc.nextLine();
        System.out.println("Enter the name : ");
        String new_admin_name=sc.nextLine();
        System.out.println();
        System.out.println("Enter the mail Id : ");
        admin_mail_id.add(sc.nextLine());
        System.out.println();
        System.out.println("Enter the password : ");
        admin_password.add(sc.nextInt());
        System.out.println();
        System.out.println("Successfully new admin added");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        admin_next();}
    }
    public static void add_new_learner(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("----------------------New Learner--------------------");
        System.out.println();
        sc.nextLine();
        System.out.println("Enter the Mail Id : ");
        learner_user_id.add(sc.nextLine());
        System.out.println();
        System.out.println("Enter the password : ");
        learner_password.add(sc.nextInt());
        System.out.println();
        learner_id.add((learner_id.get(learner_id.size()-1))+1);
        System.out.println("Learner's Id : "+learner_id.get(learner_id.size()-1));
        System.out.println();
        System.out.println("Enter the deposit amount : ");
        System.out.println("* Minimum deposit amount is Rs.1500");
        learner_deposit.add(sc.nextInt());
        System.out.println();
        System.out.println("Successfully new learner added");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        admin_next();

    }}
    public static void edit_book(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("----------------------Edit Book--------------------");
        System.out.println();
        System.out.println("1. Add new books");
        System.out.println("2. Edit book name");
        System.out.println("3. Edit book count");
        System.out.println("4. Remove book");
        System.out.println("5. View book");
        System.out.println("6. Exit");
        System.out.println();
        System.out.println("===========================================");
            System.out.println("Enter your choice: ");
            int admin_choice=sc.nextInt();
            if(admin_choice==1)
                add_new_book();
            else if(admin_choice==2)
                edit_book_name();
            else if(admin_choice==3)
                edit_book_count();
            else if(admin_choice==4)
                remove_book();
            else if(admin_choice==5)
                view_book();
            else if(admin_choice==6)
                admin_next();
    }
    public static void add_new_book(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("----------------------Edit Book--------------------");
        System.out.println();
        sc.nextLine();
        System.out.println("Enter the book type :");
        book_type.add(sc.nextLine());
        System.out.println();
        System.out.println("Enter the book name : ");
        book_name.add(sc.nextLine());
        System.out.println();
        System.out.println("Enter the book count : ");
        book_count.add(sc.nextInt());
        System.out.println();
        System.out.println("Enter the book price : ");
        book_price.add(sc.nextInt());
        System.out.println();
        book_id.add((book_id.get(book_id.size()-1)+1));
        System.out.println();
        System.out.println();
        System.out.println("Successfully new book added");
        System.out.println("Recently added book Id : "+book_id.get(book_id.size()-1));
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        edit_book();}
    }
    public static void edit_book_name(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------------------------------Edit Book Name------------------------------");
        System.out.println();
        System.out.println("Enter the book Id");
       int rename_book_id=sc.nextInt();
        System.out.println();
        if(book_id.contains(rename_book_id)){
            int book_index=book_id.indexOf(rename_book_id);
            System.out.println("Current Name : "+book_name.get(book_index));
            System.out.println();
            sc.nextLine();
            System.out.println("Enter the new title : ");
            book_name.set(book_index,sc.nextLine());
            System.out.println();
            System.out.println("Successfully renamed");
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            edit_book();}

        }
        else{
            System.out.println("Sorry! This book Id doesn't exist");
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
            edit_book();}
        }
    }
    public static void edit_book_count(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------------------------------Edit Book Count------------------------------");
        System.out.println();
        System.out.println("Enter the book Id");
       int rename_book_id=sc.nextInt();
        System.out.println();
        if(book_id.contains(rename_book_id)){
            int book_index=book_id.indexOf(rename_book_id);
            System.out.println("Current book count : "+book_count.get(book_index));
            System.out.println();
            System.out.print("Edit the Book count : ");
            book_count.set(book_index,sc.nextInt());
            System.out.println();
            System.out.println("Successfully changed");
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            edit_book();}
        }
        else{
            System.out.println("Sorry! This book Id doesn't exist");
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
            edit_book();}
        }
    }
public static void remove_book(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Remove Books------------------------------");
    System.out.println();
    System.out.println("Enter the book Id");
   int remove_book_id=sc.nextInt();
    System.out.println();
    if(book_id.contains(remove_book_id)){
        int book_index=book_id.indexOf(remove_book_id);
        System.out.println("Book Type   : "+book_type.get(book_index));
        System.out.println("Book Name   : "+book_name.get(book_index));
        System.out.println("Book Id     : "+remove_book_id);
        System.out.println("Book Price  : Rs."+book_price.get(book_index));
        System.out.println("Book count  : "+book_count.get(book_index));
        System.out.println();
        book_type.remove(book_index);
        book_name.remove(book_index);
        book_id.remove(book_index);
        book_price.remove(book_index);
        book_count.remove(book_index);
        System.out.println();
        System.out.println("Successfully removed");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        edit_book();}
    }
    else{
        System.out.println("Sorry! This book Id doesn't exist");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        edit_book();}
    }

}
public static void view_book(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------View Books------------------------------");
    System.out.println();
    System.out.println("* Type ALL in search bar to view all books");
    sc.nextLine();
    System.out.println();
    System.out.print("Please enter the keyword : ");
    String book_keyword=sc.nextLine();
    System.out.println();
    if(book_keyword.equals("ALL")){
        for(int book_index=0;book_index<book_id.size();book_index++){
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println("Book Type   : "+book_type.get(book_index));
            System.out.println("Book Name   : "+book_name.get(book_index));
            System.out.println("Book Id     : "+book_id.get(book_index));
            System.out.println("Book Price  : Rs."+book_price.get(book_index));
            System.out.println("Book count  : "+book_count.get(book_index));
            System.out.println();
           
        }
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        edit_book();}
    }
    else{
        
         if(book_type.contains(book_keyword)){
            int book_index=book_type.indexOf(book_keyword);
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println("Book Type   : "+book_type.get(book_index));
            System.out.println("Book Name   : "+book_name.get(book_index));
            System.out.println("Book Id     : "+book_id.get(book_index));
            System.out.println("Book Price  : Rs."+book_price.get(book_index));
            System.out.println("Book count  : "+book_count.get(book_index));
            System.out.println();
            System.out.println("-------------------------------------------------------");
        }
        else if(book_name.contains(book_keyword)){
            int book_index=book_name.indexOf(book_keyword);
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println("Book Type   : "+book_type.get(book_index));
            System.out.println("Book Name   : "+book_name.get(book_index));
            System.out.println("Book Id     : "+book_id.get(book_index));
            System.out.println("Book Price  : Rs."+book_price.get(book_index));
            System.out.println("Book count  : "+book_count.get(book_index));
            System.out.println();
            System.out.println("-------------------------------------------------------");
        }
        else{
            System.out.println("Sorry! This book Id doesn't exist");
            
        }
        System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
            edit_book();}
    }
}
public static void learner(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Learner------------------------------");
    System.out.println();
    System.out.println("1.Login");
    System.out.println("2.Exit");
    System.out.println();
    System.out.println("===========================================");
    System.out.println("Enter your choice: ");
    int learner_choice=sc.nextInt();
    if(learner_choice==1)
        learner_login();
    else if(learner_choice==2)
        welcome();
}
public static void learner_login(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Learner's Login------------------------------");
    System.out.println();
    sc.nextLine();
    System.out.println("Enter your user Id : ");
    String Current_learner_userid=sc.nextLine();
    if(learner_user_id.contains(Current_learner_userid)){
        current_user_index=learner_user_id.indexOf(Current_learner_userid);
        System.out.println();
        System.out.println("Enter your password : ");
        int current_learner_password=sc.nextInt();
        learner_next();
    }
    else{
        System.out.println();
        System.out.println("Sorry! "+Current_learner_userid+" does not exist");

        System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                learner();}
    }
}
public static void learner_next(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Learner------------------------------");
    System.out.println();
    System.out.println("1. Search a book");
    System.out.println("2. Return a book");
    System.out.println("3. Deposit money");
    System.out.println("4. View my cart");
    System.out.println("5. Exit");
    System.out.println();
    System.out.println("===========================================");
    System.out.println("Enter your choice: ");
    int learner_choice=sc.nextInt();
    if(learner_choice==1)
        search_book();
    else if(learner_choice==2)
        return_book();
    else if(learner_choice==3)
        deposit_money();
    else if(learner_choice==4)
        view_cart();
    else if(learner_choice==5)
        learner();
}
public static void search_book(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Available Books------------------------------");
    System.out.println();
    for(int book_index=0;book_index<book_name.size();book_index++){

      
        if(borrow_book_id.contains(book_id.get(book_index))==false && book_count.get(book_index)>0){
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println("Book Type   : "+book_type.get(book_index));
        System.out.println("Book Name   : "+book_name.get(book_index));
        System.out.println("Book Id     : "+book_id.get(book_index));
        System.out.println("Book Price  : Rs."+book_price.get(book_index));
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }
    }
    System.out.print("Enter the book id to add into your cart : ");
    int x1=sc.nextInt();
    int x=book_id.indexOf(x1);
    borrow_book_id.add(book_id.get(x));
    book_count.set(x,(book_count.get(x)-1));
    borrow_book_name.add(book_name.get(x));
    borrowid.add(learner_id.get(current_user_index));
    borrowedid.add(learner_id.get(current_user_index)+""+book_id.get(x));
    System.out.println("Lend Id : "+borrowedid.get(borrowedid.size()-1));
    System.out.println();
    sc.nextLine();
    LocalDate buy_date =  LocalDate.now();
    borrow_buy_date.add(String.valueOf(buy_date));
    LocalDate due_date =  buy_date.plusDays(15);
    borrow_due_date.add(String.valueOf((due_date)));
    System.out.println("Successfully added");
    System.out.println("press ENTER to continue !!!");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals("")){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        learner_next();}
}
public static void return_book(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Book Return------------------------------");
    System.out.println();
    for(int i=0;i<borrowid.size();i++){
        if(borrowid.get(i)==learner_id.get(current_user_index)){
            System.out.println("-------------------------------------------");
            System.out.println();
            System.out.println("Lend Id     : "+borrowedid.get(i));
            System.out.println("Book Name   : "+borrow_book_name.get(i));
            System.out.println("Book Id     : "+borrow_book_id.get(i));
            System.out.println("Lended Date : "+borrow_buy_date.get(i));
            System.out.println("Due Date    : "+borrow_due_date.get(i));
            System.out.println();
            System.out.println("-------------------------------------------");}}
            System.out.println();
            System.out.print("Enter the Lend Id : ");
            sc.nextLine();
            String lendedid=sc.nextLine();
            System.out.println();
            if(borrowedid.contains(lendedid)){
                System.out.println("1. Return the book");
                System.out.println("2. Book is Missing");
                System.out.println("3. Exit");
                System.out.println();
                System.out.println("=============================");
                System.out.print("Enter your choice : ");
                int return_choice=sc.nextInt();
                int return_id_index=borrowedid.indexOf(lendedid);
                if(return_choice==1)
                   {    
                       
                       System.out.print("Enter today's date :");
                       sc.nextLine();
                       String return_today_date=sc.nextLine();
                       LocalDate rtd=LocalDate.parse(return_today_date);
                       String actual_return_date=borrow_due_date.get(return_id_index);
                       LocalDate ard=LocalDate.parse(actual_return_date);
                       int jj=book_id.indexOf((borrow_book_id.get(return_id_index)));
                       int reset=book_count.get(book_count.size()-1)+1;
                       book_count.set(jj,reset);
                       if(rtd.compareTo(ard)>0){
                        int fine=rtd.compareTo(ard);
                        System.out.println("Sorry!, Your due date was "+fine+" days ago");
                        System.out.println("So, Your fine amount Rs."+(fine*2)+" is reduced from your deposit money");
                        int balance=learner_deposit.get(current_user_index);
                        learner_deposit.set(current_user_index,balance-(fine*2));
                        System.out.println();
                        System.out.println("Your balance is : "+learner_deposit.get(current_user_index));
                        System.out.println();
                       }
                       else{
                           System.out.println("Thanks for returning the book on time");
                         }
                       borrow_book_id.remove(return_id_index);
                       borrow_book_name.remove(return_id_index);
                       borrow_buy_date.remove(return_id_index);
                       borrow_due_date.remove(return_id_index);
                       borrowedid.remove(return_id_index);
                       borrowid.remove(return_id_index);
                   }
            else if(return_choice==2){
                System.out.println("***  80% of book price will be reduced from your deposit money  ***");
                System.out.println();
                int kk=book_id.indexOf((borrow_book_id.get(return_id_index)));
                int price=book_price.get(kk);
                System.out.println();
                System.out.println("price of the book is "+price);
                int balance=learner_deposit.get(current_user_index);
                int newbalance=balance-(int)(price*0.8);
                learner_deposit.set(current_user_index,newbalance);
                System.out.println();
                System.out.println("Current balance in your deposit money is Rs."+learner_deposit.get(current_user_index));
                System.out.println();
                borrow_book_id.remove(return_id_index);
                borrow_book_name.remove(return_id_index);
                borrow_buy_date.remove(return_id_index);
                borrow_due_date.remove(return_id_index);
                borrowedid.remove(return_id_index);
                borrowid.remove(return_id_index);
            }
            else if(return_choice==3)
                learner_next();
            }
            else{
                System.out.println("Could not able to find this lend Id");}
           
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                learner_next();}
            }
public static void  deposit_money(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Depoit Money------------------------------");
    System.out.println();
    System.out.println("Available balance in your deposit money is Rs."+learner_deposit.get(current_user_index));
    System.out.println();
    System.out.print("Enter the amount to add in your available balance : ");
    int addcash=sc.nextInt();
    learner_deposit.set(current_user_index,addcash+learner_deposit.get(current_user_index));
    System.out.println();
    System.out.println("Successfully added");
    System.out.println("Current balance is Rs."+learner_deposit.get(current_user_index));
    System.out.println();
    System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                learner_next();}
}
public static void view_cart(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-------------------------------Your Cart------------------------------");
    System.out.println();
    int count=0;
    for(int i=0;i<borrowid.size();i++){
        if(borrowid.get(i)==learner_id.get(current_user_index)){
            System.out.println("-------------------------------------------");
            System.out.println();
            System.out.println("Lend Id     : "+borrowedid.get(i));
            System.out.println("Book Name   : "+borrow_book_name.get(i));
            System.out.println("Book Id     : "+borrow_book_id.get(i));
            System.out.println("Lended Date : "+borrow_buy_date.get(i));
            System.out.println("Due Date    : "+borrow_due_date.get(i));
            System.out.println();
            System.out.println("-------------------------------------------");
            count++;}}
            if(count==0){
                System.out.println("Sorry! Your cart is empty.");
            }
            System.out.println();
            System.out.println("press ENTER to continue !!!");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                learner_next();}
                        }
        }
        
    


