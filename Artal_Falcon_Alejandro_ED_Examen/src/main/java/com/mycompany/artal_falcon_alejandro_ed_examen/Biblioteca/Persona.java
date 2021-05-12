package com.mycompany.artal_falcon_alejandro_ed_examen.Biblioteca;
/**
 * 
 * @author Alejandro
 */
/**
 * 
 * @version 1.0
 */
public abstract class Persona {
	protected String _nombre;
	protected int _edad;
/**
 * 
 * @return Nombre de la persona
 */
    public String getNombre() {
        return _nombre;
    }
/**
 * 
 * @param _nombre Nombre de la persona
 */
    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }
/**
 * 
 * @return Edad de la persona
 */
    public int getEdad() {
        return _edad;
    }
/**
 * 
 * @param _edad Edad de la persona
 * 
 */
    public void setEdad(int _edad) {
        this._edad = _edad;
    }


}
