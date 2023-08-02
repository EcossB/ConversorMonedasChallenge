import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane frame = new JOptionPane();

        Object[] options = {"Conversor Monedas", "Conversor Temperatura"}; // Array que contiene las opciones del menu principal

        String s = (String)JOptionPane.showInputDialog(frame,"Que desea hacer?", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, "Escoge");

        System.out.println(s);

        try{
            if(s.equals("Conversor Monedas")){
                System.out.println("estas en las opciones del menu");
                new ClaseConversor();
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }


    }
}