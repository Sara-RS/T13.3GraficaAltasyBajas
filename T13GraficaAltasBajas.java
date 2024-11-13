package com.mycompany.t13graficaaltasbajas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import ventanas.Ventana1;

public class T13GraficaAltasBajas {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
                Ventana1 v= new Ventana1();
                v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                v.setVisible(true);
            });
    }
}
