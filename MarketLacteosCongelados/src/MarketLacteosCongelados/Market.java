package MarketLacteosCongelados;

public class Market 
{
    //Atributos
    /*Si no se pone nada es #protedted*/
    public String ciudad, direccion;
    public static int numEmpleados; //ahora no es variable de objeto sino variable de clase

    //constructor
    public Market() 
    { //no es obligatorio pero recomendable para inicializar atributos
        ciudad = "Sevilla"; //inicializo en el constructor para guardar un orden
        direccion = "C/ Pizaro 5000";
    }

    //método
    public void mostrar() 
    {
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Dirección: "+direccion);
        System.out.println("Nº total empleados: "+ numEmpleados+"\n");
    }

    public static void main(String[] args) 
    {
        //objetos clase lanceos
        Lacteos L1 = new Lacteos((byte)7, (byte)10);
        L1.mostrarL();
        Lacteos L2 = new Lacteos((byte)4, (byte)10);
        L2.mostrarL();
        
        Congelados C1 = new Congelados((byte)4);
        C1.mostrarC();
        Congelados C2 = new Congelados((byte)3);
        C2.mostrarC();
        
        Lacteos L3 = new Lacteos((byte)4, (byte)10);
        L3.mostrarL();
        
        //Necesito un nuevo constructor para este objeto
        Congelados C3 = new Congelados("Zaragoza","C/Magallanes 6000",(byte)8);
        C3.mostrarC();
    }
}
