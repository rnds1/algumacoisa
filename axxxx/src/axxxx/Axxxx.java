/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axxxx;

/**
 *
 * @author Rafael
 */
public class Axxxx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
         
            System.out.println(10/0);   
            
            
        }catch(Exception e ){
        System.out.println(e);
        
        }finally{
            System.out.println("Erro");
        
        }
        
        
        
    }
    
}
