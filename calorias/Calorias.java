package calorias;

import javax.swing.JOptionPane;

public class Calorias
{
    public static void main(String[] args) 
    {
        int[] calorias;
        calorias = new int[7];

        calorias[0]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día lunes: "));
        calorias[1]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día martes: "));
        calorias[2]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día miercoles: "));
        calorias[3]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día jueves: "));
        calorias[4]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día viernes: "));
        calorias[5]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día sabado: "));
        calorias[6]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calorias del día domingo: "));

        
    }

}