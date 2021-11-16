//Proyecto de Suar Palazón Losa
package proyectfuturo;

public class ProyectFuturo {


    public static void main(String[] args) {
        
        
        System.out.println("Estudiante : " + args[0]);
        System.out.println(veredicto(args[1], args[2]));
        
    }
    public static String veredicto(String a, String b) {
        
        
        if (a.equals(b)) {
    return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
}
        else if (Integer.valueOf(a) > Integer.valueOf(b)){
    return "Poco tiempo de estudio. Debes dedicar más tiempo.";
}
        else{
    return "Ideal. Trabajas los contenidos en casa.";        
        }
    }
}
    