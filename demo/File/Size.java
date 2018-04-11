//用file 类的file.exists() file.length() 
//用字节计算大小
import java.io.File;
 
public class Size {
    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {
        long size = getFileSize("./myjavafile.txt");
        System.out.println("java.txt文件大小为: " + size);
    }
}