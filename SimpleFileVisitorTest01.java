package ZB_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class List extends SimpleFileVisitor <Path>   {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(".java") || file.toString().endsWith(".class")){
            System.out.println(file);
        }
        return FileVisitResult.CONTINUE ;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new List());

    }
}
