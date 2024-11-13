package ventanas;

import Componentes.Componente1;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Ventana1 extends JFrame{
        public Ventana1() throws HeadlessException {
            setSize(405,405);
            setTitle("Persona");
            setLocation(200,100);
            setResizable(false);
            Componente1 c= new Componente1();
            add(c);
    }
}