package Collections;

import java.util.*;
import javax.swing.JOptionPane;
import Collections.Estudiante;

public class MainCollections {

    public static void main(String[] args) {

        String mayorvalor="";
        
        List listaEstudiantes = new ArrayList();
        

        boolean cantidad = true;
      

        while (cantidad == true) {
            listaEstudiantes.add(new Estudiante(JOptionPane.showInputDialog("Ingrese el número del carnet"), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de creditos")),
                    Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del crédito")), Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje de descuento"))));

            String cap = (JOptionPane.showInputDialog("desea inscribir otro estudiante"));

            if (cap.equalsIgnoreCase("si")) {
                cantidad = true;
            } else {
                cantidad = false;
            }

            
        }
       // System.out.println("El tamaño del array es : "+listaEstudiantes.size());
        
        
        for(Object estudiante : listaEstudiantes){
            
            double valor =((Estudiante)estudiante).getCreditos()*((Estudiante)estudiante).getValorCredito();
            double valorneto = (valor * (((Estudiante)estudiante).getDescuento())/100);
            double valortotal = (valor - valorneto);
            
            System.out.println("el valor total de la matricula para este alumno es con carnet "
                    + ""+((Estudiante)estudiante).getCarnet() +" es : $"+ valortotal);
            
            if (valortotal<valortotal){
               mayorvalor = ((Estudiante)estudiante).getCarnet();
            }

            
            
        }
        
         System.out.println("La persona que mas paga por concepto de "
                     + "matricula es quien porta el carnét número :" + mayorvalor);
        
        
       
    }

}

