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
public class Main {
    

    
    
    public static void main(String[] args){
        
        int count=0, win=0;
        int move_check=0;
        Arrayclass2.emptycheck();
        Arrayclass2.emptycheck();
        Arrayclass2.printarray();
        
        
        
        while(Arrayclass2.mol()>0 || Arrayclass2.check_step()==100){
                Arrayclass2.step();
                Arrayclass2.emptycheck();
                Arrayclass2.printarray();
                count++;
                win=Arrayclass2.check_win();
                if(win==10000){
                    break;
                }
                
        }
        
        if(win==10000){
                System.out.println("You Won");
            
        }
        
        else{
        
                System.out.println("You Lost");
        }
        
        System.out.println("Total No. of Moves:" + count );
    
            
    }
}    
    

