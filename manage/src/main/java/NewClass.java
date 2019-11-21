import MyPack.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
//This class takes input number of books and the indec of books
class Details extends NewClass2 implements NewInterface{
    public static Scanner s =  new Scanner(System.in);
    @Override
    public int number(){
       int q;
       System.out.println("Please enter the number of books you want to issue");
       q=s.nextInt();
        return q;
       };

    @Override
    public int []index(int m) {
        int []a = new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.println("Plaese enter the index of books you want to issue");
            a[i]=s.nextInt( );
        }
        return a;
        
        
        
    };
    
    void checked_out(int a[]){
        System.out.println("-----------------------------------------------");
          System.out.println("The books you have checked out are:-");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<books.length;j++)
            {
                if(a[i]==j)
                {
                    System.out.println(books[j-1]);
                }
            }
                
        }
        }
        
    }


//This class calculates the date of issue and date of return of books
class issue extends NewClass2 {
    public static Scanner n = new Scanner(System.in);
    
    void name(){
        System.out.println("The books avaliable are");
        display();
        
    }
    
    void calcuateReturn(){ //Display todays date with time and when to return 
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 15);
        System.out.println("Current date is" +date.toString());
        System.out.println("You will have to return the book in 15 days");
        System.out.print("The date you should return issued books is ");
        System.out.println("Date = "+ cal.getTime());
        
   }
    void enter(){
        
        details();
    }
};

class Return extends issue{
    
    void display1()
    {
        System.out.println("You have selected return option");
        
    }
    void select(){
        System.out.println("Please select the book you want to return");
        System.out.println("-----------------------------------------------");
        int q;
        System.out.println("Please enter the number of books you want to return");
        q=n.nextInt();
        int ret [] = new int[q];
        for(int k=0;k<q;k++)
        {
            System.out.println("Please enter the index of books you want to return");
            ret[k]=n.nextInt();

        }
        for(int i=0;i<ret.length;i++)
            {
                for(int j=0;j<books.length;j++)
                {
                    if(ret[i]==j)
                    {
                        System.out.println("The books you want to return are");
                        System.out.println(books[j-1]);
                    }
                }

            }  
        }
    public void calcuate() throws ParseException // Method to calculate fine based upon the return date and the current date
    {
        Date date2 = new Date();
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter date on which you were supposed to return the book in dd/mm/yyyy format");
        String s = x.nextLine();
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s); 
        long diff = date2.getTime()-date1.getTime();
        float daysbetween =  (diff / (1000*60*60*24));
        System.out.println("Number of Days between dates:"+daysbetween);
        if(daysbetween>15)
        {
            float fineAmt = 5*daysbetween;
            System.out.print("The fine amount is:" +fineAmt);
            
        }
        else{
            System.out.println("Thers is no fine on your book.");
        }
        }

    
}

public class NewClass { //Driver class
    
    public static void main(String []args)
    {   
        issue b = new issue();
        Details d =new Details();
        Return r = new Return();
        Scanner N = new Scanner(System.in);
        
        
        System.out.println("-----------------------------------");
        System.out.println("You are entering the library");
        System.out.println("1.ISSUE");
        System.out.println("2.RETURN");
        System.out.println("Please enter your choice for which you came to library");
        int choice  = N.nextInt();
        switch(choice){
            case 1: System.out.println("You are choosing to issue certain amount of books");
                    b.enter();
                    b.name();
                    int m =d.number();
                    int []x = d.index(m);
                    b.print();
                    d.checked_out(x);
                    b.calcuateReturn();
                    break;
                    
            case 2 : System.out.println("YOU ARE CHOOSING TO RETURN THE BOOKS");
                         r.display();
                        r.select();
                        try{
                              r.calcuate(); 
                            }
                        catch(Exception e){System.out.println("Exception caught");}
                      break;
            default : System.out.println("Invalid choice");
      }
   };
}
  
 




    


