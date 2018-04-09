//用replace 函数将字符串的字母进行替换，有replace,replaceFirst,replaceAll
//
public class StringReplaceEmp{
	public static void main(String[] args){
		String str="hello,fourous,hello,adila,hello,everyone";
		System.out.println(str.replace('h','w'));
		System.out.println(str.replaceFirst("hello","goodbye"));
		System.out.println(str.replaceAll("hello","goodbye"));
		}
	
	}
