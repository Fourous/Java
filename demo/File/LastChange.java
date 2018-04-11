//修改文件的最后修改日期
import java.io.File;
import java.util.Date;
 
public class LastChange {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("./myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());//date
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));//ture
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());//date
    }
}