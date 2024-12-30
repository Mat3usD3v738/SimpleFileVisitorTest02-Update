package ZB_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOTest01 {
    public static void main(String[] args) {
        Path pasta = Paths.get("/home/subpasta");
        Path file = Paths.get("arquivo.txt");
        Path path = Paths.get(""+pasta.resolve(file));
        System.out.println(pasta.resolve(file));
        System.out.println(path);
        System.out.println(file.resolve(pasta));
        System.out.println(file.resolve(file));
        System.out.println(pasta.resolve(pasta));
    }
}
