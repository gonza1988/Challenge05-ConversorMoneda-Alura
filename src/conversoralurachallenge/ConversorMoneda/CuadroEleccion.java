package conversoralurachallenge.ConversorMoneda;

import javax.swing.JOptionPane;

public class CuadroEleccion {

    ConvertirMonedaAPesos monedas = new ConvertirMonedaAPesos();
    ConvertirPesosAMoneda pesos = new ConvertirPesosAMoneda();

    public void ConvertirMonedas(double valor) {
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione el tipo de moneda a convertir tu valor ", "Monedas", JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen",
                    "Pesos a Won Coreano", "Dolar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen a Pesos",
                    "De Won Coreano a Pesos"}, "Seleccion")).toString();

        switch (opciones) {
            case "Pesos a Dolar":
                pesos.pesosADolar(valor);
                break;
            case "Pesos a Euros":
                pesos.pesosAEuro(valor);
                break;
            case "Pesos a Libras Esterlinas":
                pesos.pesosALibras(valor);
                break;
            case "Pesos a Yen":
                pesos.pesosAYens(valor);
                break;
            case "Pesos a Won Coreano":
                pesos.pesosAWon(valor);
                break;
            case "Dolar a Pesos":
                monedas.dolarAPesos(valor);
                break;
            case "De Euro a Pesos":
                monedas.eurosAPesos(valor);
                break;
            case "De Libras Esterlinas a Pesos":
                monedas.librasAPesos(valor);
                break;
            case "De Yen a Pesos":
                monedas.yensAPesos(valor);
                break;
            case "De Won Coreano a Pesos":
                monedas.wonAPesos(valor);
                break;
            default:
                throw new AssertionError();
        }
    }
}
