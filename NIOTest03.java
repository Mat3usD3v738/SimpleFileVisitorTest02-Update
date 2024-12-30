package ZB_NIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOTest03 {
    public static void main(String[] args) throws IOException {
/*
        Path pasta1 = Files.createDirectory(Paths.get("pasta"));
        Path subpasta1 = Files.createDirectories(Paths.get("subpasta"));
        Path subsubpasta1 = Files.createDirectories(Paths.get("subsubpasta"));
        Path path1 = Paths.get(pasta1.toString(),subpasta1.toString(),
                subsubpasta1.toString());

        Path subpasta2 = Files.createDirectories(Paths.get("subpasta2"));
        Path subsubpasta2 = Files.createDirectories(Paths.get("subsubpasta2"));
        Path pasta2 = Files.createDirectory(Paths.get("pasta2",subpasta2.toString(),subsubpasta2.toString()));

*/
        Path path = Paths.get("pasta/subpasta/subsubpasta");
       if (!path.toFile().exists()){
           Files.createDirectories(path);
       }
        Path relatorio = Paths.get("relatorio.txt") ;
        Path arquivo = Paths.get(path.toString(), relatorio.toString());
        if (!arquivo.toFile().exists()){
            Files.createFile(arquivo);
        }
        


    }
}