package ZB_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("");
            System.out.println("\033[0;32m==========Programa=Inicializado==========\033[0m");
            System.out.println("");
            Path root = null;
            System.out.println("\033[0;32m-> Digite o caminho\033[0m");
            String caminho = in.nextLine();
            root = Paths.get(caminho);
            System.out.println("\033[0;32m-> Digite a extencao\033[0m");
            List.extencao = new StringBuilder(in.nextLine());
            Files.walkFileTree(root, new List());
            System.out.println("\033[0;30m============================================================================================================\033[0m");


            System.out.println("\033[0;32m-> Arquivos encontrados com a extencao [" + List.extencao + "] : " + List.na + "" +
                    " arquivos\033[0m");
            System.out.println("\033[0;32m-> "+List.tamanho / 100000 +" mb em arquivos\033[0m");
            System.out.println("");
            System.out.println("\033[0;32m==========Programa=Finalizado==========\033[0m");

        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class List extends SimpleFileVisitor<Path> {
    static StringBuilder extencao = null;
    static long na;
static long tamanho = 0l;
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        StringBuilder EXTENCAO_DO_ARQUIVO = new StringBuilder(extencao);

        if (file.toString().endsWith(EXTENCAO_DO_ARQUIVO.toString())) {
            BasicFileAttributes bfa = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\033[0;30m============================================================================================================\033[0m");
            System.out.println("\033[0;34mNome do arquivo : \033[0m" + "\033[0;32m" + file.toFile().getName() + "\033[0m");
            System.out.println("\033[0;34mCaminho do arquivo : \033[0m" + "\033[0;32m" + file.toFile().getAbsolutePath() + "\033[0m");
            na++;
            tamanho += bfa.size() ;
        }
        return FileVisitResult.CONTINUE;
    }
}
