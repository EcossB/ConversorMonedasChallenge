import javax.swing.*;

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
                operacion(frame, n, 0.017842225, "Dolares");
                break;
            case "De peso a Euro":
                operacion(frame, n, 0.016, "Euros");
                break;
            case "De peso a Yen":
                operacion(frame, n, 2.53, "Yen");
                break;
            case "De peso a Libras":
                operacion(frame, n, 0.014, "Libras");
                break;
            case "De peso a Won Coreano":
                operacion(frame, n, 22.92, "Won Coreano");
                break;
            case "De Dolar a Peso":
                operaciondiv(frame,n,0.017842225);
                break;
            case "De Euro a Peso":
                operaciondiv(frame,n,0.016);
                break;
            case "De Yen a Peso":
                operaciondiv(frame,n,2.53);
                break;
            case "De Libras a Peso":
                operaciondiv(frame,n,0.014);
                break;
            case "De Won Coreano a Peso":
                operaciondiv(frame,n,22.92);
                break;
            default:
                System.out.println("termino");
        }

    }

    private static void operacion(JFrame frame, double n, Double valor,String moneda){
        double result = n * valor;
        JOptionPane.showMessageDialog(frame, "El valor es: $" + Math.rint(result) + moneda, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    private static void operaciondiv(JFrame frame, double n, Double valor){
        double result = n / valor;
        JOptionPane.showMessageDialog(frame, "El valor es: $" + Math.rint(result) + " pesos", "Resultado", JOptionPane.PLAIN_MESSAGE);
    }


}
