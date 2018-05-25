package aula;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.swing.*;

public class deletar {
    public static void main(String args[]) throws Exception {
         File arquivo = new File("D:\\teste.txt");
         FileReader arqleitura = new FileReader(arquivo);
         FileWriter arq = new FileWriter(arquivo, true);
         BufferedReader lerArq = new BufferedReader(arqleitura);
         BufferedWriter escArq = new BufferedWriter(arq);
         String linha = lerArq.readLine();
         
         List<String> linhas = Files.readAllLines(arquivo.toPath());
         String lista = String.join("\n\r", linhas);
                 
         try {
             String q = JOptionPane.showInputDialog(null,"O arquivo TXT possui os numeros de " + linhas.get((linhas.size() - linhas.size())) + "a " + linhas.get(linhas.size() - 1) +". Qual deles voce deseja remover?");
             lista = lista.replace("\r" + q + " ", "");
             linha = lerArq.readLine();
             PrintWriter writer = new PrintWriter(arquivo);
             writer.print("");
             writer.close();
             escArq.write(lista);
             escArq.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel realizar a remocao. Talvez voce tenha digitado um numero que nao consta no arquivo TXT.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
