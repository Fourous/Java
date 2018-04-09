//删除指定字符串的字母，通过substring()来进行删除，功能封装在removeCharAt函数中
//
public class RemoveString{
		public static void main(String[] args){
			String str="this is hfourous";
			System.out.println(removeCharAt(str,8));
			}	
			public static String removeCharAt(String s,int pos){
				return s.substring(0,pos)+s.substring(pos+1);
				}
	}
