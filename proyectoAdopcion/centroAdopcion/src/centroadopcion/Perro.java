
package centroadopcion;


public class Perro {
    private  int  edad, peso, id;
    private String nombre,raza;
    
    public Perro(){
    
    }

    public Perro(int edad, int peso, int id, String nombre, String raza) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

  
    
    public void mostrar(String nombre,String raza,int id,int edad, int peso){
                System.out.println("Nombre: "+nombre+"\n Raza: "+raza+"\n Id: "+id+"\n Edad: "+edad+"\n Peso: "+peso+"\n");
    }
    
    
}
