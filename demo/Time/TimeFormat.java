//调用SimpleDateFormat的format来进行格式化
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class TimeFormat{
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}