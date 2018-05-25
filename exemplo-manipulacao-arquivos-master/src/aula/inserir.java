/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import java.io.*;
import javax.swing.*;
 
public class inserir {
    public static void main(String args[]) throws Exception {
         FileWriter arq = new FileWriter("D:\\teste.txt", true);
         BufferedWriter escArq = new BufferedWriter(arq);
         String numero = JOptionPane.showInputDialog(null,"Digite um número para o banco de dados do arquivo TXT.");
         escArq.newLine();
         escArq.append(numero);
         escArq.close();
	 arq.close();
    }
}
