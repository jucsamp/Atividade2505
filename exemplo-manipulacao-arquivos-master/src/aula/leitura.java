/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import java.io.*;

public class leitura {
    public static void main(String args[]) throws Exception {
         FileReader arqleitura = new FileReader("D:\\teste.txt");
	 BufferedReader lerArq = new BufferedReader(arqleitura);
         String linha = lerArq.readLine();
         int i = 0;
         while (linha != null) {
	    	 i++;
	    	 System.out.println("linha: " + i + " conteúdo: " + linha);
	    	 linha = lerArq.readLine();
	     }
         lerArq.close();
    }
}
