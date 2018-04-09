//用Arrays.toString()和Arrays.asList()合并数组
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String args[]) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}