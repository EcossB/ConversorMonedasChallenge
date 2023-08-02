import javax.swing.*;

import static com.sun.jmx.mbeanserver.Util.cast;

public class ClaseConversor {

    public ClaseConversor(){
        JFrame frame = new JFrame();
        String num1 = JOptionPane.showInputDialog(frame, "Ingresa la cantidad de dinero que desea convertir");

        try{
            int num = Integer.parseInt(num1);
            System.out.println(num);
        } catch(NullPointerException | NumberFormatException e){
            e.printStackTrace();
        }

    }

}
