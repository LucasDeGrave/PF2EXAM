import java.until.*;

class StartString {
    public static void main(String[] args) {
        String str = "Hello, welcome to my program !";
        System.out.print(str);
        System.out.print("In This program, you will have access to many statistics on your sport and beer activity");

    }
}

class InputUser
{  
    public static void main(String[] args)  
    {  
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the activity you done in order and separated by a coma (For Exemple: BeerDrinking, Biking, Running): ");  
    String str= sc.nextLine();//read input 
    
    String search1  = "BeerDrinking";
    String search2  = "Biking";
    String search3  = "Running";

    if ( str.toLowerCase().indexOf(search1.toLowerCase()) != -1 ) {

        Scanner q1= new Scanner(System.in);
        System.out.print("How much beers have you drunk ?");  
        int nuberofbeersdrunk= q1.nextInt();

        Scanner q2= new Scanner(System.in);
        System.out.print("How much time since your last beer drank ?");  
        int timeelapseddrinking= q2.nextInt();

        Scanner q3= new Scanner(System.in);
        System.out.print("What is your drinking cadance ? (beer/hours)");  
        int drinkingcadance= q3.nextInt();

     } if ( str.toLowerCase().indexOf(search2.toLowerCase()) != -1 ) {

        Scanner q4= new Scanner(System.in);
        System.out.print("How much kilometers you do by bike ?");  
        int nbeofkmbybike= q4.nextInt();

        Scanner q5= new Scanner(System.in);
        System.out.print("How much time since the last time you ride a bike (in minutes) ?");  
        int timeelapsedbike= q5.nextInt();

        Scanner q6= new Scanner(System.in);
        System.out.print("What is the distance of positive elevation gain you done by bike ?");  
        int poselevationgainbybike= q6.nextInt();

        Scanner q7= new Scanner(System.in);
        System.out.print("What is your average wattage");  
        int averagexattage= q7.nextInt();
     
     } if ( str.toLowerCase().indexOf(search3.toLowerCase()) != -1 ) {

        Scanner q8= new Scanner(System.in);
        System.out.print("How much kilometers you ran ?");  
        int nbeofkmran= q8.nextInt();

        Scanner q9= new Scanner(System.in);
        System.out.print("How much time since the last time you ran (in minutes) ?");  
        int timeelapsedran= q9.nextInt();

        Scanner q10= new Scanner(System.in);
        System.out.print("What is the distance of positive elevation gain you done ?");  
        int poselevationgainran= q10.nextInt();

        Scanner q10= new Scanner(System.in);
        System.out.print("What is your average number of steps by minute ?");  
        int nbeofstepsbymin= q10.nextInt();
     
     } else {
     
        System.out.println("You didn't enter valid answers");
     
     }

     


    }  
    }  

