import java.io.File;
 
public class Main {
    public static void main(String[] args) {
        File file = new File("./java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}