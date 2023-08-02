import javax.swing.*;

import static com.sun.jmx.mbeanserver.Util.cast;

public class ClaseConversor {

    public ClaseConversor(){
        JFrame frame = new JFrame();
        Input(frame);
    }


    public static void Input(JFrame frame){
        String num1 = JOptionPane.showInputDialog(frame, "Ingresa la cantidad de dinero que desea convertir");

        try{
            int num = Integer.parseInt(num1);
            SeleccionDivisa(frame);
            System.out.println(num);
        } catch(NullPointerException | NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Debe de ingresar numeros no texto", "Error", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }

    public static void SeleccionDivisa(JFrame frame){
        Object[] options = {
                "De peso a Dolar",
                "De peso a Euro",
                "De peso a Yen  ",
                "De peso a Libras",
                "De peso a Won Coreano",
                "De Dolar a Peso",
                "De Euro a Peso",
                "De Yen a Peso",
                "De Libas a Peso",
                "De Won Coreano a Peso",}; // Array que contiene las opciones del menu principal
        String s = (String)JOptionPane.showInputDialog(frame,"Eliga la divisa que a la que desea convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, "Escoge"); // Creando cuadro de texto con las diferentes opciones
        System.out.println(s);
    }


}
