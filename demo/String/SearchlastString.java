//用strOrig.lastIndexOf(stringname)来查找字符串stringname在strOrig出现的位置
public class SearchlastString{
	public static void main(String[] args){
		String str="hello.fourous,goodbye,hello,adila";
		int lastIndex=str.lastIndexOf("hello");
		if(lastIndex==-1)
			 System.out.println("there is no string hello");		
			 else{
				 System.out.println(lastIndex);
				 }

		}
	}
