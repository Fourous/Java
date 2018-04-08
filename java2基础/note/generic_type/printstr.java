import java.util.*;

public class GenericMethodTest{
	public static <E> void printArray(E[] inputArray){
		//输出数组
		for(E element:inputArray){
			System.out.println("%s",element);
			}
			System.out.println();
		}
		public static void main(String[] args){
			Integer[] intArray={1,2,3,4,5};
			Double[] doubleArray={1.1,2.2,3.3,4.4};
			Character[] charArray={'H','E','L','L','O'};
			System.out.println("int");
			printArray(intArray);
			printArray(doubleArray);
			printArray(charArray);
			
			}
	}
