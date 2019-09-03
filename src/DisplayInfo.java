import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DisplayInfo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("E:/worldpay training/JAVA/File4.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee) ois.readObject();
		System.out.println("Employee [empNo=" + emp.getEno() + ", Name=" + emp.getEname() + ", salary="
				+ emp.getSalary() + ", designation=" + emp.getDesignation() + ", dept=" + emp.getDepartment()
				+ "]");
	}

}
