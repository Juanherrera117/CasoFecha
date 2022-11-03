package modelo;

public class Fecha 
{
       //------------------
    // Atributos
    //------------------
    private int dia;
    private int mes;
    private int anio;

    //------------------
    // Metodos
    //------------------

    //Metodos de acceso (setter y getter)
    public int getDia()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAnio()
    {
        return anio;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    //Metodo sobreescrito de la clase Object
    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    } 
}
