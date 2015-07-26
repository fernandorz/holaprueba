package dowhile;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String salida="";
        int cont= 0;
        do{
            String nu = JOptionPane.showInputDialog("ingrese un numero");
            int numero = Integer.parseInt(nu);
            cont = cont + numero;
            JOptionPane.showMessageDialog(null,"la cuenta va en: "+ cont);
            salida = JOptionPane.showInputDialog("desea salir si/no");
        }while(salida == "si");




    }

}
