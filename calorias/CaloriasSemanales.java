package calorias;

import javax.swing.JOptionPane;

public class CaloriasSemanales 
{
    public static void main(String[] args) 
    {
        int[] calorias = new int[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int sumatoria = 0;
        
        for (int i = 0; i < calorias.length; i++) 
        {
            String input = JOptionPane.showInputDialog(null, "Ingresa las calorías quemadas el " + dias[i]);
            calorias[i] = Integer.parseInt(input);
            sumatoria += calorias[i];
        }
        
        String output = "La sumatoria de calorías quemadas en la semana es: " + sumatoria + "\n\n";
        
        for (int i = 0; i < calorias.length; i++) 
        {
            output += dias[i] + ": " + calorias[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
}
