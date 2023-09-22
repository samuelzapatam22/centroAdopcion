
package centroadopcion;


public class CentroAdopcion {

 
    public static void main(String[] args) {
        Perro perro1=new Perro(13, 14,1013, "Celeste","Retriever","Terrestre","Concentrado",true);
        Gato gato1 = new Gato();
        Loro loro1 = new Loro();
        
        perro1.mostrar(perro1.getNombre(), perro1.getRaza(), perro1.getTipo(), perro1.getId(), perro1.getEdad(), perro1.getPeso(), perro1.getComida(),perro1.isVacunado());
        
        
    }
    
}
 