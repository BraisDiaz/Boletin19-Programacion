
package boletin19_programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Boletin19_programacion {

    
    public static void main(String[] args) {
       
        Libreria libro1 = new Libreria();
        int seleccionar;
        
        do{
            
            seleccionar = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opción" 
            + "\n 1. Engada un libro \n 2. Venda un libro \n 3. Ordear por titulo ou ISBN \n 4. Consultar un libro \n 5. Dar de baixa un libro \n 6. Saír"));
            
            switch(seleccionar){
                
                case 1: libro1.engadirLibros(new Libro());
                break;
                case 2: libro1.venderLibros();
                break;
                case 3: libro1.amosarLibro();
                break;
                case 4: libro1.consultarLibro();
                break;
                case 5: libro1.darDeBaixa();
                break;
                case 6: System.exit(seleccionar);
                
            }
        
        }
            while(seleccionar !=0);
        }
        
        
        
        /* Fueron utilizados antes de hacer el switch-case
    
        libro1.engadirLibros(new Libro());
        libro1.amosarLibro();
        libro1.venderLibros();
        libro1.amosarLibro();
        libro1.consultarLibro();
        libro1.darDeBaixa();
        */
        
        
        
    }
    

