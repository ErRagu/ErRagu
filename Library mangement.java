import java.util.Scanner;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    ArrayList<String> staff = new ArrayList<String>();
	    ArrayList<String> student = new ArrayList<String>();
	    Map<String,String> bookDetails = new HashMap<>();
	    Map<String,String> takeBook = new HashMap<>();
	    ArrayList<String> studentNames = new ArrayList<String>();
	    
	    String check1 = "available to pick";
	    String check2 = "unavailable to pick";
	    
	    
	    //int bookCount = 0;
	    
        for(int i = 1;;){   
            
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation:");
		int task = sc.nextInt();
		
		if(task == 1)
		{
		    System.out.println("Enter staff Name:");
		    String name = sc.next();
		    
		    staff.add(name);
		}
		else if(task == 2)
		{
		    System.out.println(staff);
		}
		else if(task == 3)
		{
		   System.out.println("Add the book details(name, author):");
		   System.out.println("Enter book Name:");
		   String bookName = sc.next();
		   System.out.println("Enter author Name:");
		   String bookAuthor = sc.next();
		   
		   bookDetails.put(bookName,bookAuthor);
		   
		}
		else if(task == 4)
		{
		    if(bookDetails.size() >0)
		    {
		    ArrayList<String> sortedKeys = new ArrayList<String>(bookDetails.keySet());
            Collections.sort(sortedKeys);
 
            // Display the TreeMap which is naturally sorted
            for (String x : sortedKeys)
            System.out.println(x + " - " +  bookDetails.get(x) +" - " + check1);
		    }
		    if(takeBook.size() >0)
		    {
		    ArrayList<String> sortedKeys = new ArrayList<String>(takeBook.keySet());
            Collections.sort(sortedKeys);
 
            // Display the TreeMap which is naturally sorted
            for (String x : sortedKeys)
            System.out.println( x + " - " + takeBook.get(x)  +" - " + check2);
		    }
		    
		    
		}
		else if(task == 5)
		{
		    System.out.println("Enter student Name:");
		    String studentName = sc.next();
		    
		    student.add(studentName);   
		}
			else if(task == 6)
		{
		    System.out.println(student);
		}
		else if(task == 7)
		{
		    System.out.println("Enter student Name:");
		    String studentName = sc.next();
		    System.out.println("Enter book Name:");
		    String bookName = sc.next();
		    String a = bookDetails.get(bookName);
		    studentNames.add(studentName);
		    takeBook.put(bookName, a);
		    bookDetails.remove(bookName);
		
		}
		else if(task == 8)
		{
		    if(takeBook.size()> 0)
		    {
		        System.out.println("Enter student Name:");
		    String studentName2 = sc.next();
		    System.out.println("Enter book Name:");
		    String bookName = sc.next();
		      if(takeBook.containsKey(bookName) && studentNames.contains(studentName2))
		        {
		            System.out.println("Success");
		        }
		        else
		      {
		            System.out.println("Sorry the user is not holding this book");
		      }
		    }
		     else
		      {
		            System.out.println("No one take the books");
		      }
		}
		else if(task == 9)
		{
		
		}
		else
		{
		    break;
		}
        }
		
	}
}
