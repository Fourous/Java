import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Main{
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));  
         // 时间戳转换成时间
        System.out.println(sd);
   }
}
//这里是将获取到的current time 转换成一定的格式