
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;
import java.io.*;

public class HashTableRunner
{
  public static void main ( String[] args ) throws IOException
  {
		
			//initialize a new hashtable			
			HashTable hashtable = new HashTable();
			//read from the dat file using a scanner object	
			   //hint: the first number in the file tells you how many integers in your numbers.dat file
			FileReader file = new FileReader(new File("H:\\workspace2021\\HashTables\\src\\numbers.dat"));
			BufferedReader br = new BufferedReader(file);
			//load stuff into the table using your add method	
			int num = Integer.parseInt(br.readLine()); 
			for(int i =0; i < num; i++) {
				Number a = new Number(Integer.parseInt(br.readLine()));
				hashtable.add(a);
			}
			//print out the table
			System.out.println(hashtable.toString());
		
  }
}