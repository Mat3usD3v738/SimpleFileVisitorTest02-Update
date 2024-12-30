package ZB_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NIOTest02 {
    public static void main(String[] args) throws IOException {
/*
        Path path1 = Paths.get("arquivo.txt");
        Path pasta = Paths.get("Relatorios");
        System.out.println(path1.toAbsolutePath());
        System.out.println(path1.normalize());
        System.out.println(pasta.toAbsolutePath());
        System.out.println(pasta.normalize());

*/
        Path path = Paths.get("home/subpasta");
        Path file = Paths.get("arquivo.txt");

        try {
            File fileRenamed = new File("renamed.txt");
            File file2 = new File("arquivo.txt");
            file2.renameTo(fileRenamed);
            System.out.println(file2.renameTo(fileRenamed));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
