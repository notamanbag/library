
package MyPack;

import java.util.*;
class books
{
    public String[] books= new String [] {"Percy Jackson and The Lightning Thief","Percy Jackson and The Sea Of Monsters","Percy Jackson and The Titan’s Curse",
	"Percy Jackson and The Battle Of The Labyrinth","Percy Jackson and The Last Olympian","Inferno","Angels and Demons","Digital Fortress","The Lost Pyramid",
	"Da Vinci Code","Deception Code","Origin","Divergent"," Insurgent",""};
	public int[] id= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
	public void display()
	{
                int n = books.length;
		for(int i=0;i<books.length;i++)
		{
			System.out.println( " "+ id[i]+ " "+ books[i] );
		}
	}
}


public class NewClass2 extends books
{               
                int studentid;
                String name;
	public void details()
	{
		
                
		Scanner n= new Scanner(System.in);
		Scanner w= new Scanner(System.in);
		System.out.print("Enter Student Id");
		studentid= n.nextInt();
		System.out.print("Enter Your Name");
		name= w.nextLine();
	}
        public void print()
        {
          System.out.print(name);
          System.out.println(studentid);
            
        }
}


