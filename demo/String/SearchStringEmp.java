//这里是搜索全局字符串，用lastindexOf 搜索最后一个出现的位置
public class SearchStringEmp {
   public static void main(String[] args) {
      String strOrig = "hello,fourous,hello,adila";
      int intIndex = strOrig.indexOf("hello");
      if(intIndex == - 1){
         System.out.println("没有找到字符串 hello");
      }else{
         System.out.println("hello 字符串位置 " + intIndex);
      }
   }
}
//返回值只能第一个，不能所有，其实也没有那么方便