import javax.swing.*;
import java.awt.*;

public class AnnotationSetView extends JPanel {

    public AnnotationSetView() {
        super(new GridBagLayout());

        JTextPane textPane = new JTextPane();

        textPane.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In fermentum orci sit amet velit dapibus posuere. Etiam nec scelerisque dolor. Suspendisse nec aliquam orci. Aliquam consectetur, libero eu placerat lobortis, libero dui volutpat est, et condimentum turpis orci ac quam. Integer dapibus, ipsum a mollis ultricies, nibh lorem ultricies urna, in consectetur mi augue non ante. Nunc luctus sollicitudin nisl ut molestie. Praesent cursus pellentesque justo in pretium. Vestibulum vitae posuere libero. Ut vitae lobortis mauris, at accumsan nunc.");

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
