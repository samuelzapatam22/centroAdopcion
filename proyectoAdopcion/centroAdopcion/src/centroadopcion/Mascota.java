
package centroadopcion;
public class Mascota {
        int  edad, peso, id;
        String nombre,raza,tipo,comida;
        boolean vacunado;

    public Mascota() {
    }

    public Mascota(int edad, int peso, int id, String nombre, String raza, String tipo, String comida, boolean vacunado) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.comida = comida;
        this.vacunado = vacunado;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    
    public void mostrar(String nombre,String raza,String tipo,int id,int edad, int peso,String comida,boolean vacunado){
                System.out.println("Nombre: "+nombre+"\n Raza: "+raza+"\n Tipo: "+tipo+"\n Id: "+id+"\n Edad: "+edad+"\n Peso: "+peso+"\n Comida: "+comida+"\n Vacunado: "+vacunado+"\n");
    }
    
        
        
}
