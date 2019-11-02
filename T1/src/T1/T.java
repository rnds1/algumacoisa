/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tecnologo
 */
import T1.Cs;
import java.lang.ArithmeticException;
import java.util.Arrays;

public class T extends Cs{
    
    
    public void wx(){
        setx(1);
    
    }

    public T() {
       getx();
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       T a =new T();
       T b = new T();
        a.getx();
        
    }
    
    
    
    
    private static void ex(int a, int b){
    try{
         
            System.out.println(a/b);   
            
            
        }catch(ArithmeticException e ){
             
            
            System.out.println("Erro ao dividir "+ a+ "por "+b);
                
        
            }
        finally{
             
            System.out.println("Obrigado!");
        
        }
    
    }
    
}
