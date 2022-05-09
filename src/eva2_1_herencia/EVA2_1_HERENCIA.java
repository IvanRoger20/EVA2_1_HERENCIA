/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author IvanTron
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Juana");
        estu1.setEdad(22);
        estu1.setNumeroDeControl("00120312");
        estu1.ImprimirDatos();
        System.out.println("Numero de control: " + estu1.getNumeroDeControl());
    }
    
}

class Estudiante extends Persona {
    private String numeroDeControl;

    public String getNumeroDeControl() {
        return numeroDeControl;
    }

    public void setNumeroDeControl(String numeroDeControl) {
        this.numeroDeControl = numeroDeControl;
    }
    
}

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void ImprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " +  getEdad());
    }
    
}