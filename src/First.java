import java.util.*;
import java.io.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st file name with path");
		String first = sc.nextLine();
		System.out.println("Enter 2nd file name with path");
		String second = sc.nextLine();

		File file1 = new File(first);
		File file2 = new File(second);
		if (file1.exists()) {
			System.out.println("First File exist ");
		}
		if (file1.isDirectory()) {
			System.out.println("No this is a Directory ");
		}  if (file2.exists()) {
			System.out.println("Second File exist ");
		}  if (file1.length() < 500) {
			System.out.println("File Size is below 500");
			Boolean s=file1.renameTo(file2);
			if(!s)
			System.out.println(" name of"+file1+" with path has been changed to" +file2);

		}
	}

}
