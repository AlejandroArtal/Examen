package com.mycompany.artal_falcon_alejandro_ed_examen.Biblioteca;
/**
 * 
 * @author Alejandro
 */
/**
 * 
 * @version 1.0
 */
public class Socio extends Persona {
	private String _telefono;
	public Libro _solicitarLibro;

    public Socio() {
    }    
/**
 * 
 * @return Telefono
 */
    public String getTelefono() {
        return _telefono;
    }
/**
 * 
 * @param _telefono 
 */
    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }



}

