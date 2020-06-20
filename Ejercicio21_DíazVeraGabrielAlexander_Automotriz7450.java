/*
Diseñe e implemente una clase Informe_accidente que contenga los siguientes atributos:
lugar tipo String, fecha tipo String, hora tipo String, numFallecidos tipo entero.
Diseñe e implemente sus respectivos métodos get() y set() correspondientes para cada atributo;
además implemente toString() para mostrar la información relativa a la clase Informe_accidente.
En la clase principal main(), diseñe e implemente 2 objetos Informe_accidente,
con valores que considere necesario por pantalla.
Por último, imprimir cual de los 2 objetos tiene mas numFallecidos.

 */
package ejercicio21_díazveragabrielalexander_automotriz.pkg7450;
/**
 *
 * @author Gabriel Alexander Díaz Vera
 */
class Informe_accidente {

        //Atributo
    private String lugar;
    private String fecha;
    private String hora;
    private int numFallecido;

        //Constructor
    public Informe_accidente(String plugar, String pFecha, String pHora, int pnumFallecido){

        lugar=plugar;
        fecha=pFecha;
        hora=pHora;
        numFallecido=pnumFallecido;
    }

        //Metodos
    public String getLugar(){
        return lugar;
    }
    public void setLugar(String codigo){
        this.lugar=lugar; //puntero this invoca al atributo privado codigo
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public String getHora(){
        return hora;
    }
     public void setHora(String hora){
        this.hora=hora;
    }
    public int getNumFallecido(){
        return numFallecido;
    }
    public void setNumFallecido(int numFallecido){
        this.numFallecido=numFallecido;
    }
    @Override
    public String toString(){
        return "El  "+fecha+" con LUGAR: \t"+lugar+""
               + " con "+hora
               + " se reportan: "+numFallecido+" descesos las ultimas 24 horas";
    }
}
public class Ejercicio21_DíazVeraGabrielAlexander_Automotriz7450 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Encabezado
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema del Paper:");
    System.out.println("Transferencia de Aprendizaje Mediante Redes Neuronales Convolucionales para el Reconocimiento de Conductores Distraídos\n");
    System.out.println("\t\t\tTipos de constructores, instanciación\n");

    // creamoslos objetos
    Informe_accidente informe1=new Informe_accidente("Lima", "informe de accidente 1", "hora 22:00 ", 8 );
    Informe_accidente informe2=new Informe_accidente("Arequipa", "informe de accidente 2", "hora 00:00", 5 );

    //Mostramos su estado
    System.out.println(informe1.toString());
    System.out.println(informe2.toString());

    //comparamos quien tiene mas nufallecidos
    if(informe1.getNumFallecido()<informe2.getNumFallecido()){
        System.out.println(informe1.getLugar()+ " no se registran mas decesos");
    }else {
            System.out.println(informe2.getLugar()+ " no se registran mas decesos");
    }
    }
  }
