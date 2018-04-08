import java.util.*;
import java.io.*;
public class SerializeDemo{
	public static void main(String[] args){
		Employee e=new Employee();
		e.name="Reyan Ali";
		e.address="Phokka kuan,Ambehta peer";
		e.SSN=112233;
		e.number=101;
		try{
			FileOutputStream fileOut=new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serilized data is saved in /tmp/employee.ser");
			}catch (IOException i){
				i.printStackTrace();
				}
		}
	}
