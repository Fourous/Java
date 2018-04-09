//Java 中我们可以使用 StringTokennizer 设置不同分隔符来分隔字符串，
//默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。
import java.util.StringTokenizer;
 
public class StringSplitEmp1 {
    public static void main(String[] args) {
 
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str);
 
        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
 
        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");
 
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
        System.out.println("----- 通过String分隔 ------");
        StringTokenizer st3 = new StringTokenizer(str, "S");
 
        while (st3.hasMoreElements()) {
            System.out.println(st3.nextElement());
        }
    }
}