import javax.swing.*;
public class ClaseConversor {

    public ClaseConversor(){
        JFrame frame = new JFrame();
        String num = JOptionPane.showInputDialog(frame, "Ingresa la cantidad de dinero que desea convertir");
        System.out.println(num);
    }

}
