package ZB_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class BasicFileAtributesTest01 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            BasicFileAttributes bfa = null;
            System.out.println("Digite o caminho do arquivo e diremos o tamanhos dele em Mb");
            Path path = Paths.get(in.nextLine());


            bfa = Files.readAttributes(path, BasicFileAttributes.class);
            long size = bfa.size() / 1_000_000l;
            if (size >= 1000) {
                System.out.println("O tamanho de "+path.toString()+ ": " + size / 1_000 + " gb ou "+size+" mb");
            } else {
                System.out.println("O tamanho de "+path.toString()+ ": " + size + " mb");
            }

        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
