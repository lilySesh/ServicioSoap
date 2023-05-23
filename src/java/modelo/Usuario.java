/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lilis
 */
public class Usuario {
    private int saldo;
    private String nombre;
    private String clave;
    private String repetirclave;

    public Usuario() {
    }

    public Usuario(int saldo, String nombre, String clave, String repetirclave) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.clave = clave;
        this.repetirclave = repetirclave;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRepetirclave() {
        return repetirclave;
    }

    public void setRepetirclave(String repetirclave) {
        this.repetirclave = repetirclave;
    }
    
    
    
}
