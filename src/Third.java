import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//Write a program to store the names of cities to file.
public class Third implements Serializable{

	public static void main(String[] args)  throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list Size");
		int n=sc.nextInt();
		System.out.println("Enter cities");
		String s[]=new String[n];	
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		
		}
		FileOutputStream fout=new FileOutputStream("E:/worldpay training/JAVA/File1.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fout); 
		obj.writeObject(s);
		System.out.println("array added");
		obj.close();
		
		
		
		
		}
	
		
		
	}


