package ejecutable;

import modelo.Fecha;
import modelo.FechaDetallada;

public class Test
{
    public static void main(String[] args) 
    {
       Fecha f = new Fecha(2, 10, 1970);
       f.setDia(2);
       f.setMes(10);
       f.setAnio(1970);

       Fecha f2 = new Fecha();

       System.out.println("Dia: " + f.getDia());
       System.out.println("Mes: " + f.getMes());
       System.out.println("Año: " + f.getAnio());
       System.out.println(f.toString());

       Fecha f3 = new Fecha("10/11/2022");
       
       Fecha mif = new Fecha(2, 10, 1970);
       mif.setDia(8);
       mif.setMes(6);
       mif.setAnio(1990);
       System.out.println(mif.toString());

       if(f.equals(mif))
       {
        System.out.println("Las fechas si son iguales");
       }
       else
       {
        System.out.println("Las fechas no son iguales");
       }

       FechaDetallada fecha1 = new FechaDetallada(19, 11, 2022);
       System.out.println(fecha1.toString());
    }

}