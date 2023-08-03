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
            double num = Integer.parseInt(num1);
            SeleccionDivisa(frame, num);
            System.out.println(num);
        } catch(NullPointerException | NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Debe de ingresar numeros no texto", "Error", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }

    public static void SeleccionDivisa(JFrame frame, double n){
        Object[] options = {
                "De peso a Dolar",
                "De peso a Euro",
                "De peso a Yen  ",
                "De peso a Libras",
                "De peso a Won Coreano",
                "De Dolar a Peso",
                "De Euro a Peso",
                "De Yen a Peso",
                "De Libras a Peso",
                "De Won Coreano a Peso",}; // Array que contiene las opciones del menu principal
        String s = (String)JOptionPane.showInputDialog(frame,"Eliga la divisa que a la que desea convertir", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, "Escoge"); // Creando cuadro de texto con las diferentes opciones
        System.out.println(s);

        resultado(frame, s, n);
    }

    public static void resultado(JFrame frame, String s, double n){

        String cond = s;
        double result;

        switch (cond){
            case "De peso a Dolar":
                result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                //System.exit(0);
                break;
            case "De peso a Euro":
                result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De peso a Yen":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De peso a Libras":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De peso a Won Coreano":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De Dolar a Peso":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De Euro a Peso":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De Yen a Peso":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De Libras a Peso":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                break;
            case "De Won Coreano a Peso":
                 result = n * 0.018;
                JOptionPane.showMessageDialog(frame, "El valor es: " + result + " Dolares", "Resultado", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);

                break;
            default:
                System.out.println("termino");
        }


    }


}
