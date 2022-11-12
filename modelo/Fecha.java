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

    public Fecha(int d, int m, int a) 
    {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    //Constructor sin parametros
    public Fecha()
    {
       this.dia = 0;
       this.mes = 0;
       this.anio = 0;
    }

    //Constructor con parametro String dd/mm/aaaa
    public Fecha(String s)
    {
        //Posicion inicial de '/'
        int pos1 = s.indexOf("/");

        //Se busca la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf("/");
        
        //Extraer el dia 
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        //Extraer el mes
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        //Extraer el año
        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }

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

    public void addDias(int d)
    {
       int sum = fechaToDias() + d;
       diasToFecha(sum);
    }

    private int fechaToDias()
    {
        return anio*360 + mes*30 + dia;
    }

    private void diasToFecha(int i)
    {
        anio = (int)(i/360);
        mes = (int)(i/30);
        dia = (int)(i);
    }
    
    
}
