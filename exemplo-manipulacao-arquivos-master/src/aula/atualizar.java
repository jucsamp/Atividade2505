/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.swing.*;

public class atualizar {
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
             String q = JOptionPane.showInputDialog(null,"O arquivo TXT possui os números de " + linhas.get((linhas.size() - linhas.size())) + "a " + linhas.get(linhas.size() - 1) +". Qual deles voce deseja alterar?");
             String nome = JOptionPane.showInputDialog(null,"Digite o novo numero que substituira o numero "+q+".");
             lista = lista.replace("\n\r" + q + " ", "\n\r" + nome + " ");
             linha = lerArq.readLine();
             PrintWriter writer = new PrintWriter(arquivo);
             writer.print("");
             writer.close();
             escArq.write(lista);
             escArq.close();
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Nao foi possivel realizar a alteracao. Talvez voce tenha digitado um numero que nao consta no arquivo TXT.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
}
