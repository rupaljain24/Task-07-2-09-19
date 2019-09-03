import java.io.*;
		import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) throws IOException {
		
		 


				// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				System.out.println("Merging 4 files into one file");

				File f1 = new File("E:/worldpay training/JAVA/1.txt");
				File f2 = new File("E:/worldpay training/JAVA/2.txt");
				File f3 = new File("E:/worldpay training/JAVA/3.txt");
				File f4 = new File("E:/worldpay training/JAVA/4.txt");

				FileInputStream fis1 = new FileInputStream(f1);
				FileInputStream fis2 = new FileInputStream(f2);
				FileInputStream fis3 = new FileInputStream(f3);
				FileInputStream fis4 = new FileInputStream(f4);

				int len = (int) (f1.length() + f2.length() + f3.length() + f4.length() + 1);
				byte[] barr = new byte[len];
				int x = 0;
				for (int i = 0; i < f1.length(); i++) {
					barr[x++] = (byte) fis1.read();

				}

				for (int i = 0; i < f2.length(); i++) {
					barr[x++] = (byte) fis2.read();

				}
				for (int i = 0; i < f3.length(); i++) {
					barr[x++] = (byte) fis3.read();

				}
				for (int i = 0; i < f4.length(); i++) {
					barr[x++] = (byte) fis4.read();

				}

				FileOutputStream fos = new FileOutputStream("G:/merge.txt");
				fos.write(barr);

				fos.close();
				fis1.close();
				fis2.close();
				fis3.close();
				fis4.close();

				System.out.println("Data merged");
			}
		


	}


