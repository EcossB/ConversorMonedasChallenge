import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MenuPrincipal();
    }


    /**
     * Este metodo contiene el menu principal, lo que este metodo hace es validar que opcion quiere el usuario.
     * Digase si quiere convertir monedas a otras divisas o si quiere hacer conversiones de temperatura.
     * Dentro de este metodo se hace tambien manejo de errores a NullPointer, si ocurre un error de este tipo
     * se agarra la excepcion y se lanza un cuadro de dialogo diciendo que el usuario presiono cancelar y se termina el programa.
     */
    private static void MenuPrincipal(){
        JOptionPane frame = new JOptionPane(); // instanciando la clase JOptionPane

        Object[] options = {"Conversor Monedas", "Conversor Temperatura"}; // Array que contiene las opciones del menu principal
        String s = (String)JOptionPane.showInputDialog(frame,"Que desea hacer?", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, "Escoge"); // Creando cuadro de texto con las diferentes opciones
        System.out.println(s);

        try{
            if(s == null){
                JOptionPane.showMessageDialog(null, "User pressed cancel, exiting program now!");
                System.exit(0);
            }else{
                System.out.println("estas en las opciones del menu");
                new ClaseConversor();
            }
        } catch (NullPointerException | NumberFormatException e){
            e.printStackTrace();
        }

    }
}