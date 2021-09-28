
package MarketLacteosCongelados;

import java.util.Scanner;

public class Congelados extends Market
{
    public int numEmpleadosC;
    public String anioFundacion; //si no voy a operar con el numero mejor String
    Scanner entrada = new Scanner(System.in);
    //congelados
    
    //CONSTRUCTOR
    public Congelados(byte numEmpleadosC) //Aquí me deja poner byte xq es un tipo de dato inferior, si fuer mayor en espacio no me dejaría
    {
        super(); //hereda el constructor, si el constructor está vacío lo podemos omitir
        this.numEmpleadosC = numEmpleadosC;
        System.out.print("Introduce el año de fundadción:\t");
        this.anioFundacion = entrada.nextLine();
        numEmpleados += numEmpleadosC;
    }
    
    //constructor para el objeto C3
    public Congelados(String ciudad, String direccion, byte numEmpleadosC)
    {
        this.ciudad = ciudad;
        this.direccion=direccion;
        this.numEmpleadosC= numEmpleadosC;
        System.out.print("Introduce el año de fundadción:\t");
        this.anioFundacion = entrada.nextLine();
        numEmpleados += numEmpleadosC;

    }
            
    
    //método
    public void mostrarC()
    {
        mostrar(); //este es el mostrar padre, el de Market
        //System.out.println("La ciudad desde congelados"+ciudad);
        System.out.println("Nº empleados en Congelados: "+numEmpleadosC);
        System.out.println("Año de fundación: "+anioFundacion);
        System.out.println("");
    }
}
