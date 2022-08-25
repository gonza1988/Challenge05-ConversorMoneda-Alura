
package conversoralurachallenge.ConversorMoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ConvertirPesosAMoneda {
    
    public void pesosADolar(double valor){
        //Utilizar clase decimal format para elegir cuántos números mostrar después de la coma
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 290.72;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(dolar) + " dólares");
    }
    
    public void pesosAEuro(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double euro = valor / 320;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(euro) + " euros");
    }
    
    public void pesosALibras(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 344;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(dolar) + " libras esterlinas");
    }
    
    public void pesosAYens(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 2.13;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(dolar) + " yens");
    }
    
    public void pesosAWon(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 0.32;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(dolar) + " wons");
    }
    
}
