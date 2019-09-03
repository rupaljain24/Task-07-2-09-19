import java.io.*;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st file name with path");
		String first = sc.nextLine();
		System.out.println("Enter 2nd file name with path");
		String second = sc.nextLine();
		
		FileInputStream sourceFile = new FileInputStream(first);
		FileOutputStream destinationFile = new FileOutputStream(second);

		int n;
		while ((n = sourceFile.read()) != -1)
			destinationFile.write(n);

		System.out.println("File Copied");
		sourceFile.close();
		destinationFile.close();

	}

}

//E:/worldpay training/JAVA/File3.txt 
//E:/worldpay training/JAVA/File4.txt