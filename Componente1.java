package Componentes;

import java.awt.Graphics;
import javax.swing.JComponent;

public class Componente1 extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        int x=25,y=25;
        for(int i=0; i<14; i++){
            g.drawLine(25, x, 375, x);
            x=x+25;
        }
        for(int i=0; i<14; i++){
            g.drawLine(y, 25, y, 350);
            y=y+50;
        }
        g.drawLine(25, 260, 36, 282);
        g.drawLine(36, 282, 55, 250);
        g.drawLine(55, 250, 70, 256);
        g.drawLine(70, 256, 80, 241);
        g.drawLine(80, 241, 85, 225);
        g.drawLine(85, 225, 94, 235);
        g.drawLine(94, 235, 98, 220);
        g.drawLine(98, 220, 105, 213);
        g.drawLine(105, 213, 110, 233);
        g.drawLine(110, 233, 114, 242);
        g.drawLine(114, 242, 120, 232);
        g.drawLine(120, 232, 125, 227);
        g.drawLine(125, 227, 133, 220);
        g.drawLine(133, 220, 141, 224);
        g.drawLine(141, 224, 149, 213);
        g.drawLine(149, 213, 155, 204);
        g.drawLine(155, 204, 163, 199);
        g.drawLine(163, 199, 167, 182);
        g.drawLine(167, 182, 170, 193);
        g.drawLine(170, 193, 176, 185);
        g.drawLine(176, 185, 183, 193);
        g.drawLine(183, 193, 190, 203);
        g.drawLine(190, 203, 195, 208);
        g.drawLine(195, 208, 206, 199);
        g.drawLine(206, 199, 213, 187);
        g.drawLine(213, 187, 219, 190);
        g.drawLine(219, 190, 225, 202);
        g.drawLine(225, 202, 230, 210);
        g.drawLine(230, 210, 236, 208);
        g.drawLine(236, 208, 240, 215);
        g.drawLine(240, 215, 247, 223);
        g.drawLine(247, 223, 253, 228);
        g.drawLine(253, 228, 262, 220);
        g.drawLine(262, 220, 275, 212);
        g.drawLine(275, 212, 284, 214);
        g.drawLine(284, 214, 296, 208);
        g.drawLine(296, 208, 308, 193);
        g.drawLine(308, 193, 315, 187);
        g.drawLine(315, 187, 328, 170);
        g.drawLine(328, 170, 334, 183);
        g.drawLine(334, 183, 340, 197);
        g.drawLine(340, 197, 345, 204);
        g.drawLine(345, 204, 352, 196);
        g.drawLine(352, 196, 356, 181);
        g.drawLine(356, 181, 361, 184);
        g.drawLine(361, 184, 370, 169);
        g.drawLine(370, 169, 375, 153);
        
        g.drawLine(28, 230 ,371 ,120);
        g.drawLine(371, 120, 370, 146);
        g.drawLine(371, 120, 355,111);

    }
}
