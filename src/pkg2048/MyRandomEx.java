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
public class MyRandomEx {
 
    public static int newdigit(){
       int z;  
       float x= (float) +Math.random();
       
       if(x<0.70){
           z=2;
           
       }
       else{
           z=4;
       }
       return z;
    }

    
}
