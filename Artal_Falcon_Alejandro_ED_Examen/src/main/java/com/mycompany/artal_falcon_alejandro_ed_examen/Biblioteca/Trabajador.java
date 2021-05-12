package com.mycompany.artal_falcon_alejandro_ed_examen.Biblioteca;

import java.util.ArrayList;
import com.mycompany.artal_falcon_alejandro_ed_examen.Biblioteca.Libro;
/**
 * 
 * @author Alejandro
 */
/**
 * 
 * @version 1.0
 */
public class Trabajador extends Persona {
	private double _salario;
	public ArrayList<Libro> _prestar_Devolver = new ArrayList<Libro>();

    public Trabajador() {
    }
/**
 * 
 * @return Salario del trabajador
 */
    public double getSalario() {
        return _salario;
    }
/**
 * 
 * @param _salario Salario del trabajador
 */
    public void setSalario(double _salario) {
        this._salario = _salario;
    }

	/**
	 * @return Devuelve el estado del atributo Prestado del objeto Libro
	 * @param aLibro Se pasa el objeto Libro como parametro al metodo
	 *  
	 */
	public boolean PrestarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return Devuelve el estado del atributo Prestado del objeto Libro
	 * @param aLibro Se pasa el objeto Libro como parametro al metodo
	 */
        
	public boolean DevolverLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}
}