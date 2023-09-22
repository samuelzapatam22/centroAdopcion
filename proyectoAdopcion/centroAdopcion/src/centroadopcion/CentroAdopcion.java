
package centroadopcion;


public class CentroAdopcion {

 
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro(10,35,1019,"Sachi","Retriever");
       
        Gato gato1 = new Gato(3,16,1214,"Michi","Egipcio");
        Gato gato2 = new Gato(5,20,1215,"Fernando","Angola");
        Loro loro1 = new Loro(1,2,1345,"Lucas","Africano");
        Loro loro2 = new Loro(2,1,1347,"Pepe", "Frente Amarilla");
        
         perro1.setNombre("Celeste");
        perro1.setEdad(7);
        perro1.setPeso(45);
        perro1.setId(1013);
        perro1.setRaza("Criolla");
        
        
        System.out.println("Perro #1");
        perro1.mostrar(perro1.getNombre(),perro1.getRaza(), perro1.getId(), perro1.getEdad(), perro1.getPeso());
         System.out.println("Perro #2");
        perro2.mostrar(perro2.getNombre(),perro2.getRaza(), perro2.getId(), perro2.getEdad(), perro2.getPeso());
        
         System.out.println("Gato #1");
        gato1.mostrar(gato1.getNombre(),gato1.getRaza(),gato1.getId(), gato1.getEdad(), gato1.getPeso());
         System.out.println("Gato #2");
        gato2.mostrar(gato2.getNombre(),gato2.getRaza(), gato2.getId(), gato2.getEdad(), gato2.getPeso());
        
        System.out.println("Loro #1");
        loro1.mostrar(loro1.getNombre(),loro1.getRaza(), loro1.getId(), loro1.getEdad(), loro1.getPeso());
         System.out.println("Loro #2");
        loro2.mostrar(loro2.getNombre(),loro2.getRaza(), loro2.getId(), loro2.getEdad(), loro2.getPeso());

    }
    
}
 