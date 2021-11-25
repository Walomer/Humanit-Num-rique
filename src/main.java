import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        AnnotationSet set = new AnnotationSet();
        set.addUnit(new Unit("Rouge", 1,15,"Paul"));
        set.addUnit(new Unit("Rouge", 3,21,"Paul"));
        set.addUnit(new Unit("Rouge", 1,15,"Elyse"));

        System.out.println(set.map.toString());

        JFrame fenetre = new JFrame();
        fenetre.setSize(300,300);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        fenetre.setLocationRelativeTo(null);
        Container container = fenetre.getContentPane();

        fenetre.setVisible(true);

    }
}
