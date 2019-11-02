/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1;

import java.util.Random;

/**
 *
 * @author tecnologo
 */
public abstract class  Cs {
    Random r = new Random();
    private int x = r.nextInt();
    private int y = r.nextInt();
    
    public int soma(){
    return x+y;
    }
    
    public int getx(){
        System.out.println(x);
        System.out.println(y);
    return x;
    }        
    public void setx(int w){
    x = w;
    }
}
