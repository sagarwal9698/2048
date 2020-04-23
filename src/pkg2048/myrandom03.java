/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

/**
 *
 * @author saurabhagarwal
 */
public class myrandom03 {
    public static int newdigi(){
       int z=0;  
       float x= (float) +Math.random();
       
       if(x<0.25){
           z=0;
       }
       
       if(x>0.25 && x<0.5){
           z=1;
       }
       
       if(x>0.5 && x<0.75){
           z=2;
       }
       
       if(x>0.75){
           z=3;
       }
    return z;
    
    }
    
}
