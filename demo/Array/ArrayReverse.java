import java.util.*;
/*
import java.util.Arrays;
import java.util.Collections;
*/
public class ArrayReverse{
	public static void main(String[] args){
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("fourous");
		array.add("hello");
		array.add("adila");
		System.out.println(array);
		Collections.reverse(array);//注意是Collections
		System.out.println(array);
		}
	}
