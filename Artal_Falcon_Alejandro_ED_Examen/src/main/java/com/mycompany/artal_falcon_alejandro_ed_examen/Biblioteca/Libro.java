package com.mycompany.artal_falcon_alejandro_ed_examen.Biblioteca;

/**
 * 
 * @author Alejandro
 */

/**
 * 
 * @version 1.0
 * 
 */


public class Libro {
	private String _nombre;
	private String _editorial;
	private int _edad;
	private String _autor;
	public boolean _prestado;
	public Socio _solicitarLibro;
	public Trabajador _prestar_Devolver;
        

                
        
        public Libro() {
		throw new UnsupportedOperationException();
	}

   /**
    * 
    * @return Nombre del libro
    */     
        
    public String getNombre() {
        return _nombre;
    }
    
    /**
     * 
     * @param _nombre 
     */

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }
    
    /**
     * 
     * @return Editorial
     */

    public String getEditorial() {
        return _editorial;
    }
    /**
     * 
     * @param _editorial 
     */
    public void setEditorial(String _editorial) {
        this._editorial = _editorial;
    }
/**
 * 
 * @return Edad
 */
    public int getEdad() {
        return _edad;
    }
/**
 * 
 * @param _edad 
 */
    public void setEdad(int _edad) {
        this._edad = _edad;
    }
/**
 * 
 * @return Autor
 */
 
    public String getAutor() {
        return _autor;
    }
/**
 * 
 * @param _autor 
 */
    public void setAutor(String _autor) {
        this._autor = _autor;
    }
/**
 * 
 * @return Si el libro ha sido prestado
 */
    public boolean getPrestado() {
        return _prestado;
    }
/**
 * 
 * @param _prestado Cambia el estado de prestado
 */
    public void setPrestado(boolean _prestado) {
        this._prestado = _prestado;
    }

	/**
	 * Utiliza el Setter del atributo Prestado de la clase libro
	 */
	public void CambiarEstadoPrestado() {
		throw new UnsupportedOperationException();
                
                
	}

	/**
	 * Utiliza el Getter del atributo Prestado de la clase Libro
	 */
	public void ComprobarEstadoLibro() {
		throw new UnsupportedOperationException();
	}

	
}