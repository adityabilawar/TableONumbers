
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
         //this could be your default, but I'd prefer an overloaded constructor
	 // also, this only initializes the table of linked lists - you'll also need to initialize each linked list before adding to them!
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
	//because you are bringing in a object, you'll need to cast it to the object type you are working with before comparing it
	//using the object's hashcode, insert it into the linked list at the proper position in the table
        //as long as it doesn't already exist in that linked list
		if(table[((Number)obj).hashCode()] == null) {
			//System.out.println(((Number)obj).hashCode());
		LinkedList<Number> a = new LinkedList<Number>();
		a.add(((Number)obj));
		table[((Number)obj).hashCode()] = a;
		}
		else {
			//System.out.println(((Number)obj).hashCode());
			if(!table[((Number)obj).hashCode()].contains((Number)obj)){
			LinkedList<Number> a = 	table[((Number)obj).hashCode()] ;
			a.add(((Number)obj));
			table[((Number)obj).hashCode()] = a;}
			
		}




	}

	public String toString()
	{
		//begin with the accumulator provided above - make the printout look the same as the document example
		String output="HASHTABLE\n";
		for(int i =0; i < table.length; i++) {
			//System.err.println("worked");
			output+="bucket"+ i + " - ";
			LinkedList<Integer> a = table[i];
			if(a!=null) {
			output+=a.toString();
			}
			output+="\n";
		}
		System.out.println();
  		return output;
	}
}