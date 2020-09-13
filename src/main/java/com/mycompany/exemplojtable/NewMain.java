/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplojtable;

import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcao;
        
        Tabelas tabelas;
        tabelas = new Tabelas();
        
        while(true){
            opcao=JOptionPane.showInputDialog("Digite uma opção\n"
                    + "1 - 3x3 com abc na diagonal \n"
                    + "2 - 3x3 cba na diagonal secundária \n"
                    + "3 - 3x3 b na diagonal, a nos demais \n"
                    + "4 - 5x2 soma dos 2 anteriores (seq.) \n"
                    + "5 - 5x2 Fatorial \n"
                    + "6 - 5x2 base 2 \n"
                    + "7 - 5x2 base 10 \n"
                    + "8 - 26x2 alfabeto\n"
                    + "9 - 7x2 Fibonacci\n"
                    + "10 - 5x2 soma de todos(seq.) anteriores \n"
                    + "f - Sair\n"
                    + "");
            switch (opcao){
                case "1":
                   tabelas.q1();
                   break;
                case "2":
                   tabelas.q2();
                   break;
                case "3":
			tabelas.q3();
			break;
		case "4":
			tabelas.q4();
			break;
		case "5":
			tabelas.q5();
			break;
		case "6":
			tabelas.q6();
                        break;
		case "7":
			tabelas.q7();
			break;
		case "8":
			tabelas.q8();
                        break;
		case "9":
			tabelas.q9();
			break;
		case "10":
			tabelas.q10();
			break;
		case "f":
			System.exit(0);
			break;		
		default:
			System.out.println("Esta não é opção válida!");

            }
        }
                
    }
    
}
