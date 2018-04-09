//比较两个字符串的不同
//调用compareTo() compareToIgnoreCase(String),compareTo(object String)
//compareTo 分为number 和String 如果Number 如果第一个小于第二个，则返回一个大于０的数字（１），反之，返回（－１），相同返回０
//如果是string　，相同返回０，第一个字母不同，返回ａｓｃｉｉ只差，后面的不在比较，以此后推，如果第一个小于，返回差值为负
//
public class StringCompareEmp{
	public static void main(String[] args){
		String str1="hello,world";
		String str2="Hello,world";
		Object str=str1;
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str.toString()));
		}
	}
