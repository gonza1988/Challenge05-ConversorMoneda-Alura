package conversoralurachallenge;

import conversoralurachallenge.ConversorMoneda.CuadroEleccion;
import conversoralurachallenge.ConversorTemperatura.CuadroEleccionTemperatura;
import conversoralurachallenge.SimuladorPlazoFijo.SimularPlazoFijo;
import javax.swing.JOptionPane;

public class ConversorAluraChallenge {

    public static void main(String[] args) {

        CuadroEleccion monedas = new CuadroEleccion();
        CuadroEleccionTemperatura temperatura = new CuadroEleccionTemperatura();
        SimularPlazoFijo simulador = new SimularPlazoFijo();

        boolean salir = false;

        while (salir == false) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura", "Simulador Plazo Fijo"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuando con el programa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Simulador Plazo Fijo":
                    input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a simular: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        simulador.simularPlazo(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra simulación?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuando con el programa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }

    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
