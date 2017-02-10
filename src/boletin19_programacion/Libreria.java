
package boletin19_programacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Libreria {
    
    protected ArrayList<Libro> listalibros = new ArrayList();
    
    public void engadirLibros(Libro e){
        
        listalibros.add(e);
    }
  
    public void venderLibros(){
        
        String elegir = JOptionPane.showInputDialog("Introducir libro a vender");
        int udsavender = Integer.parseInt(JOptionPane.showInputDialog("Introducir nº unidades a vender"));
        
        for(int i=0; i<listalibros.size(); i++){
            
            if(listalibros.get(i).getTitulo().equals(elegir)){
            listalibros.get(i).setNunidades(listalibros.get(i).getNunidades()- udsavender);
        } else
          System.out.println("O libro introducido non está na lista");
    }
    }
    
    public void amosarLibro(){
       
       Collections.sort(listalibros);
               
       Iterator it = listalibros.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
    }
    }
    
    public void darDeBaixa(){
        
        for(int i=0; i<listalibros.size(); i++){
        
        if (listalibros.get(i).nunidades==0){
            
            listalibros.remove(i);
        }
        
    }
    }
        
    public void consultarLibro(){
        
        boolean atopado = false;
        String compara = JOptionPane.showInputDialog("Introduzca o título do libro a buscar");
        
        for(int i=0; i<listalibros.size();i++){
            
            if(compara.equals(listalibros.get(i).titulo)){
                
                atopado = true;
            }
        }
            System.out.println("O libro atópase na lista");
    }
    
}
    

