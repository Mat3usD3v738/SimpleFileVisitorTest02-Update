package ZB_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/mateus/test");
        Path path2 = Paths.get("/test/arquivo.txt");
        System.out.println(path.relativize(path2));
    }
}
