
package boletin19_programacion;

import java.util.Objects;
import javax.swing.JOptionPane;
import milibreria.MiLibreria;

/**
 *
 * @author Brais Núñez
 */
public class Libro extends Libreria implements Comparable <Libro> {
    
    String titulo, autor, isbn;
    float prezo;
    int nunidades;
    
    public Libro() {
       titulo = MiLibreria.pedirString();
       autor = MiLibreria.pedirString();
       isbn = MiLibreria.pedirString();
       prezo = MiLibreria.darValorConDecimales();
       nunidades = MiLibreria.darValorEntero();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNunidades() {
        return nunidades;
    }

    public void setNunidades(int nunidades) {
        this.nunidades = nunidades;
    }

    public String getIsbn() {
        return isbn;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", prezo=" + prezo + ", nunidades=" + nunidades + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + Objects.hashCode(this.isbn);
        hash = 79 * hash + Float.floatToIntBits(this.prezo);
        hash = 79 * hash + this.nunidades;
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (Float.floatToIntBits(this.prezo) != Float.floatToIntBits(other.prezo)) {
            return false;
        }
        if (this.nunidades != other.nunidades) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }

    @Override
   public int compareTo(Libro comparar){
       
       int seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Elija la variable por la que ordenar"
       + "\n 1. Titulo \n 2. ISBN"));
       
       int compare = seleccionar;
       switch (seleccionar){
           case 1: compare = this.titulo.compareToIgnoreCase(comparar.getTitulo());
           break;
           case 2: compare = this.isbn.compareToIgnoreCase(comparar.getIsbn());
           break;
        }
       
       return compare;
    }
    
}

   
    

    
    

    

