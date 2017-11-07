/*
 * Clase persona
 */
package ex8;

/**
 * Clase perona que contendra toda la información.
 * @author Marvin Isaac
 * @version 1.0 06-11-17
 */
public class Person {
    String nombre;
    String dni;
    int edad;
    double peso;
    String correo;

    public Person() {
    }

    public Person(String nombre, String dni, int edad, double peso, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", peso=" + peso + ", correo=" + correo + '}';
    }
    
    
    
    
}
