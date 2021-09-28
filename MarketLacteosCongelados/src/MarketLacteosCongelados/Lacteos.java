package MarketLacteosCongelados;

/*La palabra extends hace hijas, pueden usar los métodos y los atributos*/
public class Lacteos extends Market 
{

    //atributos
    public int numEmpleadosL, numProveedores, numRepartidores;

    //constructor
    public Lacteos(byte numEmpleadosL, byte numProveedores)
    { //Aquí decido que tipo es cada argumento
        this.numEmpleadosL = numEmpleadosL;
        this.numProveedores = numProveedores;
        this.numRepartidores = (int) (Math.random() * (6 - 3) + 4); //Entre 3 y 6
        //random da entre 9 y o,999999, para redondear añado uno más
        //Math por (mayor menos menor)+ menos más 1(para que lo incluya)
        numEmpleados += numEmpleadosL;
    }

    //método
    public void mostrarL() 
    {
        mostrar(); //éste método es heredado de market 
        //System.out.println("Veo la ciudad desde lacteos "+ciudad); //es un atributo del padre
        System.out.println("Nº empleados en Lácteos: "+numEmpleadosL);
        System.out.println("Nº proveedores en Lácteos: "+numProveedores);
        System.out.println("Nº repartidosres en Lácteos: "+numRepartidores);
        System.out.println("");
    }

}
