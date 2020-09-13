/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplojtable;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marce
 */
public class Tabelas {
    JTable jTable1;
    DefaultTableModel df;
    JFrame jFrame;
    Object[] col;
    Object[][] lin;
    JScrollPane sp;
    
    public void q1(){
        col = new Object[3];
        col[0]="A";
        col[1]="B";
        col[2]="C";
        lin = new Object[3][3];
        lin[0][0]="a";
        lin[1][1]="b";
        lin[2][2]="c";
        monta();
    }
    
   public void q2(){
        col = new Object[3];
        col[0]="A";
        col[1]="B";
        col[2]="C";
        lin =new Object[3][3];
        lin[2][0]="c";
        lin[1][1]="b";
        lin[0][2]="a";
        monta();
    }
    public void q3(){
        col = new Object[10];
        lin = new Object[10][10];
        col[0]="A";
        col[1]="B";
        col[2]="C";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j)
                    lin[i][j]="*";
                else
                    lin[i][j]=".";
            }
            
        }
        monta();
    }   
    public void q4(){
        col = new Object[2];
        lin = new Object[5][2];
        col[0]="A";
        col[1]="B";

        for (int i = 0; i < 5; i++) {
            lin[i][0]=(i+1);
            if(i>0)
                lin[i][1]=(i+1)+(i+1)-1;
            else
                lin[i][1]=(i+1);
        }
        monta();
    }
    
    public void q5(){
        col = new Object[2];
        lin = new Object[10][2];
        col[0]="A";
        col[1]="B";
        int fatorial=1;
        for (int i = 0; i < 10; i++) {  
            lin[i][0]=(i+1);
            lin[i][1]=fatorial;
            fatorial=fatorial*(i+2);
        } 
        monta();
    }
    
    public void q6(){
        col = new Object[2];
        lin = new Object[10][2];
        col[0]="A";
        col[1]="B";
        DecimalFormat formato =new DecimalFormat("#.#");
        for (int i = 0; i < 10; i++) {  
            lin[i][0]=(i+1);
            lin[i][1]=formato.format(Math.pow(2,i));            
        }
        monta();
    }
    
    public void q7(){
        col = new Object[2];
        lin = new Object[10][2];
        col[0]="A";
        col[1]="B";
        long valor;
        for (int i = 0; i < 10; i++) {
            valor = (long) Math.pow(10,i);
            lin[i][0]=(i+1);
            lin[i][1]=valor;
        }
        monta();
    }
    
    public void q8(){
        lin = new Object[26][3];
        col = new Object[3];
        col[0]="A";
        col[1]="B";
        char letra,letraMinuscula;
        for (int i = 0; i < 26; i++) {
            letra=(char)(65+i);
            letraMinuscula=(char)(97+i);
            lin[i][0]=(i+1);
            lin[i][1]=letra;
            lin[i][2]=letraMinuscula;
        }
        monta();
    }  
    public void q9(){
        lin = new Object[15][2];
        col = new Object[2];
        col[0]="A";
        col[1]="B";
        for (int i = 0; i < 15; i++) {
            lin[i][0]=(i+1);
            lin[i][1]=fib(i+1);
        }
        monta(); 
    }
    
    public void q10(){
        lin = new Object[5][2];
        col = new Object[2];
        col[0]="A";
        col[1]="B";
        int soma=0;
        for (int i = 0; i < 5; i++) {
            soma+=(i+1);
            lin[i][0]=(i+1);
            lin[i][1]=soma;
        }
        monta(); 
    }
 
    
    public void monta(){
        jFrame = new JFrame();
        jTable1 = new JTable();
        df = new DefaultTableModel(lin, col);
        jTable1.setModel(df);
        sp = new JScrollPane(jTable1);
        jFrame.add(sp);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setSize(600,600);        
    }
    
    public long fib(long a){
        if (a<2)
            return 1;
        else
            return fib(a-1)+fib(a-2);
    }
    
}
