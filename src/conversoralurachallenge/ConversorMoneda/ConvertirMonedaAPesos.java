
package conversoralurachallenge.ConversorMoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ConvertirMonedaAPesos {
    
     public void dolarAPesos(double valor){
        //Utilizar clase decimal format para elegir cuántos números mostrar después de la coma
        DecimalFormat df = new DecimalFormat("#.00");
        double pesos = valor * 290.72;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(pesos) + " pesos");
    }
    
    public void eurosAPesos(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double pesos = valor * 320;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(pesos) + " pesos");
    }
    
    public void librasAPesos(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double pesos = valor * 344;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(pesos) + " pesos");
    }
    
    public void yensAPesos(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double pesos = valor * 2.13;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(pesos) + " pesos");
    }
    
    public void wonAPesos(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double pesos = valor * 0.32;
        JOptionPane.showMessageDialog(null, "Tienes $" + df.format(pesos) + " pesos");
    }
}
