
package conversoralurachallenge.SimuladorPlazoFijo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class SimularPlazoFijo {
    
    public void simularPlazo(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double plazoFijo = (valor * 5.8) /100;
        double total = plazoFijo + valor;
        JOptionPane.showMessageDialog(null, "En 30 días se te acreditarán $" + df.format(plazoFijo) + " pesos");
        JOptionPane.showMessageDialog(null, "Dando un total en tu cuenta de $" + df.format(total) + " pesos");
        
    }
}
