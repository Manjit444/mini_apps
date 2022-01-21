import java.util.*;
public class vehicle {
    static String[] destinations={"Coimbatore","Trippur","Erode","Salem","Vellore"};
    static Scanner sc=new Scanner(System.in);
    static List<String>userid=new ArrayList<>();
    static List<Integer>password=new ArrayList<>();
    static List<String> username=new ArrayList<>();
    static List<Integer>userbookid=new ArrayList<>();
    static int[][] ticket=  new int[2][5];
    //-----------waiting list-----------------------------
    static List<Integer> waitinguserid=new ArrayList<>();
    static List<Integer>depaturearea=new ArrayList<>();
    static List<Integer>boardingarea=new ArrayList<>();
    static List<Integer>distancediff=new ArrayList<>();
    //int coimbatore=1;
    //int trippur=2;
   // int erode=3;
   // int salem=4;
   // int vellore=5;
   //-------------Booking History--------------------------
   static List<String>travellername=new ArrayList<>();
   static List<Integer>travellerbookid=new ArrayList<>();
   static List<String>travellerboarding=new ArrayList<>();
   static List<String>travellerdepature=new ArrayList<>();
   static List<String>ticketstatus=new ArrayList<>();
   static List<Integer>travellerseat=new ArrayList<>();
   //-------------------------------------------------------
    static int currentuser;
    static boolean possibility;
    static int  ticketbookingid;
    static  String usermailid;
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        userid.add("19ec061@kpriet.ac.in");
        password.add(12345);
        username.add("Manjit");
        userbookid.add(10000);
        userid.add("19cs061@kpriet.ac.in");
        password.add(12345);
        username.add("Sanjit");
        userbookid.add(10001);
        welcome();
    } 
    public static   void welcome(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("---------------------Indian Travels-------------------");
        System.out.println();
        System.out.println("1. Login");
        System.out.println("2. New User");
        System.out.println("3. Exit");
        System.out.println("");
        System.out.println("Enter your choice");
        int userchoice=sc.nextInt();
        if(userchoice==1)
            home();
        else if(userchoice==2)
            newuser();
        else if(userchoice==3)
            System.out.println("Thanks for using this portal");
        
    }
    public static void home(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------------------Login-----------------------");
        System.out.println("");
        System.out.println("Enter Your Mail Id: ");
        sc.nextLine();
        usermailid=sc.nextLine();
        if(userid.contains(usermailid)==false){
            System.out.println("Sorry! Please Sign Up.");
           
        }
        else {
        currentuser=userbookid.get(userid.indexOf(usermailid));
        System.out.println();
        System.out.println("Enter The Password: ");
        int userpassword=sc.nextInt();
        if(userid.contains(usermailid) && password.contains(userpassword))
            homenext();}
        
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            newuser();
        }}
    
    public static void newuser(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        sc.nextLine();
        System.out.println("------------------------New User-----------------------");
        System.out.println();
        
        int x=userbookid.get(userbookid.size()-1)+1;
        userbookid.add(x);
        System.out.println("Enter Your Name: ");
        username.add(sc.nextLine());
        System.out.println("Enter Your Mail Id: ");
        String newusermailid=sc.nextLine();
        currentuser=x;
        userid.add(newusermailid);
        System.out.println();
        System.out.println("Enter Your Password: ");
        password.add(sc.nextInt());
        
        System.out.println();
        System.out.println("Successfully Account Created");
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            home();
        }
    }
    public static void homenext(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------------------User Portal-------------------------");
        System.out.println("");
        System.out.println("1. Vehicle Booking");
        System.out.println("2. Cancel Vehicle");
        System.out.println("3. Booking History");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Enter Your Choice: ");
        int userhomenext=sc.nextInt();
        //if conditions
        if(userhomenext==1)
            ticketbooking();
        else if(userhomenext==2)
            cancelticket();
        else if(userhomenext==3)
            bookinghistory();

        else if(userhomenext==4)
            welcome();
    }
    public static void ticketbooking(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------------------Vehicle Booking---------------------");
        System.out.println();
        System.out.println("OUR BOARDING LOCATIONS");
        System.out.println("1. Coimbatore");
        System.out.println("2. Trippur");
        System.out.println("3. Erode");
        System.out.println("4. Salem");
        System.out.println("5. Vellore");
        System.out.println("Enter your boarding location: ");
        int boarding=sc.nextInt();
        boarding--;
  
        int b=boarding;
        System.out.println("Enter your depature location: ");
        int depature=sc.nextInt();
        depature--;
        
        int d=depature;
        int distance=d-b+1;
        for(int i=0;i<ticket.length;i++){
            int count=0;
            possibility=false;
            for(int j=b;j<=d;j++){
                if(ticket[i][j]==0){
                    count++;
                    possibility=true;
                }
            }
            if(count==distance && possibility==true)
               System.out.println("Available vehicle No: "+(i+1)); 
           
        }
        //-----------booking history----------
        int index=userid.indexOf(usermailid);
        travellername.add(username.get(index));
        travellerboarding.add(destinations[b]);
        travellerdepature.add(destinations[d]);
        if(possibility==false) {  
            System.out.println("Sorry! 0 vehicles available, Currently your request in waiting list");
        //waiting list
        waitinguserid.add(currentuser);
        depaturearea.add(d);
        boardingarea.add(b);
        distancediff.add(distance);
        travellerseat.add(0000);
        
        travellerbookid.add(currentuser);
        ticketstatus.add("Waiting List");
    }
       
        else {
        System.out.println();
        System.out.println("-----Enter the required vehicle no-----");
        int requiredseat=sc.nextInt();
        travellerseat.add(requiredseat);
        requiredseat--;
         ticketbookingid=Integer.parseInt(currentuser+""+(b+1)+""+(d+1)+""+(requiredseat+1));
         travellerbookid.add( ticketbookingid);
         ticketstatus.add("Booked");
        for(int j=b;j<=d;j++){
            ticket[requiredseat][j]=ticketbookingid;
           
        }
        System.out.println("Your Vehicle Confirmation Id: "+ticketbookingid);
        System.out.println("Successfully Booked");}
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            homenext();
        }
    }
public static void cancelticket(){
    System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------------------Ticket Cancelling---------------------");
        System.out.println();
        System.out.println("Enter Your Confirmation Id: ");
        int cancelid=sc.nextInt();
        
        if(ticketbookingid==cancelid){
            for(int i=0;i<ticket.length;i++){
                for(int j=0;j<ticket[0].length;j++){
                    if(ticket[i][j]==ticketbookingid){
                        ticket[i][j]=0;
                    }
                }
                int gh=travellerbookid.indexOf(cancelid);
                ticketstatus.set(gh,"Cancelled");
            }
            System.out.println();
            System.out.println("Successfully Cancelled");
            
            for(int h=0;h<waitinguserid.size();h++){
                int boardwait=boardingarea.get(h);
                int departwait=depaturearea.get(h);
                    for(int i=0;i<ticket.length;i++){
                        int countwait=0;
                        int availableseat;
                        for(int j=boardwait;j<=departwait;j++){
                            if(ticket[i][j]==0)
                                countwait++;
                        }
                        if(countwait==distancediff.get(h)){
                            availableseat=i;
                            int ijk=waitinguserid.get(h);
                            int hk=travellerbookid.indexOf(ijk);
                            ticketstatus.set(hk,"Booked");
                            ticketbookingid=Integer.parseInt(currentuser+""+(boardingarea.get(h)+1)+""+(depaturearea.get(h)+1)+""+(availableseat+1));
                            travellerbookid.set(hk,ticketbookingid);
                            for(int j=boardwait;j<=departwait;j++){
                                ticket[availableseat][j]=ticketbookingid;
                            }
                            waitinguserid.remove(h);
                            boardingarea.remove(h);
                            depaturearea.remove(h);
                            distancediff.remove(h);
                            
                        }
                    }
                
                 break;
            }
        }
        else {   
            System.out.println();
            System.out.println("Confirmation Id not found");}
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
             System.out.flush();
            homenext();
}}
public static void bookinghistory(){
    System.out.print("\033[H\033[2J");
        System.out.flush();
        sc.nextLine();
        System.out.println("-------------------Booking History---------------------");
        System.out.println();
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        for(int i=0;i<travellername.size();i++){
            if((travellername.get(i)).equals(name)){
                System.out.println("----------------------------------------------");
                System.out.println("Name            :"+travellername.get(i));
                System.out.println("Booking Id      :"+travellerbookid.get(i));
                System.out.println("Boarding City   :"+travellerboarding.get(i));
                System.out.println("Depature City   :"+travellerdepature.get(i));
                System.out.println("Status          :"+ticketstatus.get(i));
                System.out.println("----------------------------------------------");
            }
            System.out.println();
        }
        System.out.println("press ENTER to continue !!!");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("")){
            System.out.print("\033[H\033[2J");
             System.out.flush();
            homenext();
}
}}
