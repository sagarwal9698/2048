/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.util.Scanner;



/**
 *
 * @author saurabhagarwal
 */
public class Arrayclass3 {
    
    public static int n=4;
    
    public static int[][] my= new int[n][n];
    
    
    public static int mol(){
        int j;
        int i;
        int s=0, t=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                
                if(my[i][j]==0){
                    s++;       
                }
            }
        
        }
        
        
        return s;
        
    }
    
    
    public static void printarray(){
        int i,j;
        System.out.println("  _________________________________");
        for(i=0; i<n; i++){
            System.out.print("  |   ");
            for(j=0; j<n; j++){
                if(my[i][j]!=0){
                    System.out.print(my[i][j]);
                }
                else{
                    System.out.print(" ");
                    
                }
                    
                
                System.out.print("   |   ");
                }
            System.out.print("\n  _________________________________");
            System.out.print("\n");
            
            }
        
    }
    
    
    public static void emptycheck(){    
        int ch=0;
        int i;
        while(ch==0){
        
            int a=myrandom03.newdigi();
            int b=myrandom03.newdigi();
            if(my[a][b]==0){
                my[a][b]=MyRandomEx.newdigit(); 
                ch=99;
            }
            
        }
        
    }
    
    
    public static int move(){
        int check=10000000;
        Scanner read;
        
        int ip=0;
        char input;
        
        read= new Scanner(System.in);
        System.out.print("Enter your move: ");
        input = read.next().trim().charAt(0);
        
        
        while(check!=0){
        
        if(input=='w' || input=='2'){
            ip=2;
            check=0;
        }
        else{
            if(input=='a' || input=='4'){
            ip=4;
            check=0;
            }
            else{
                if(input=='6' || input=='d'){
                ip=6;
                check=0;
                }
                else{
                    if(input=='8' || input=='s'){
                    ip=8;
                    check=0;
                    }
                    else{
                        read= new Scanner(System.in);
                        System.out.println("------Incorrect Move--------");
                        System.out.print("Next Move: ");
                        input= read.findInLine(".").charAt(0);
                    }
                }
            }
            
        }
          
    }
        
            return ip;
        
        
}
    
    
    public static void step(){
        int i,j, min=0;
        int move=move();
        switch(move){
            case 2:{
                for(i=0; i<n; i++){
                    
                    if(my[2][i]==0){
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                    }
                    
                    if(my[1][i]==0){
                        my[1][i]=my[2][i];
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                       
                    }
                    if(my[0][i]==0){
                        my[0][i]=my[1][i];
                        my[1][i]=my[2][i];
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                    }
                    
                    if(my[1][i]==my[0][i]){
                        my[0][i]+=my[1][i];
                        my[1][i]=0;
                        min++;
                    }
                  
                    if(my[2][i]==my[1][i]){
                        my[1][i]+=my[2][i];
                        my[2][i]=0;
                        min++;
                    }
                    
                    if(my[3][i]==my[2][i]){
                        my[2][i]+=my[3][i];
                        my[3][i]=0;
                        min++;
                    }
                            
                    if(my[2][i]==0){
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                    }
                    
                    if(my[1][i]==0){
                        my[1][i]=my[2][i];
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                    }
                    if(my[0][i]==0){
                        my[0][i]=my[1][i];
                        my[1][i]=my[2][i];
                        my[2][i]=my[3][i];
                        my[3][i]=0;
                        min++;
                    }    
                        
                    
                }
                 break;
            }
                    
                    
                
            
            case 8:{
                for(i=0; i<n; i++){
                    if(my[1][i]==0){
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                    }
                    
                    if(my[2][i]==0){
                        my[2][i]=my[1][i];
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                       
                    }
                    if(my[3][i]==0){
                        my[3][i]=my[2][i];
                        my[2][i]=my[1][i];
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                    }
                    
                    
                    if(my[2][i]==my[3][i]){
                        my[3][i]+=my[2][i];
                        my[2][i]=0;
                        min++;
                    }
                    
                    
                    
                    
                    if(my[1][i]==my[2][i]){
                        my[2][i]+=my[1][i];
                        my[1][i]=0;
                        min++;
                        }
                    
                    if(my[0][i]==my[1][i]){
                        my[1][i]+=my[0][i];
                        my[0][i]=0;
                        min++;
                        }
                    
                    
                    if(my[1][i]==0){
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                    }
                    
                    if(my[2][i]==0){
                        my[2][i]=my[1][i];
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                    }
                    if(my[3][i]==0){
                        my[3][i]=my[2][i];
                        my[2][i]=my[1][i];
                        my[1][i]=my[0][i];
                        my[0][i]=0;
                        min++;
                    }
                }
                break;
            }
            
            
            case 6:{
                
                for(i=0; i<n; i++){
                    
                    if(my[i][1]==0){
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                    }
                    
                    if(my[i][2]==0){
                        my[i][2]=my[i][1];
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                       
                    }
                    if(my[i][3]==0){
                        my[i][3]=my[i][2];
                        my[i][2]=my[i][1];
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                    }
                    
                    if(my[i][2]==my[i][3]){
                        my[i][3]+=my[i][2];
                        my[i][2]=0;
                        min++;
                    }
                    
                    
                    
                    if(my[i][1]==my[i][2]){
                        my[i][2]+=my[i][1];
                        my[i][1]=0;
                        min++;
                    }
                    
                    
                    
                    if(my[i][0]==my[i][1]){
                        my[i][1]+=my[i][0];
                        my[i][0]=0;
                        min++;
                    }
                    if(my[i][1]==0){
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                    }
                    
                    if(my[i][2]==0){
                        my[i][2]=my[i][1];
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                       
                    }
                    
                    if(my[i][3]==0){
                        my[i][3]=my[i][2];
                        my[i][2]=my[i][1];
                        my[i][1]=my[i][0];
                        my[i][0]=0;
                        min++;
                    }
                    
               
                }
               
                break;
            }
                
            
            
            
            case 4:{
                
                for(i=0; i<n; i++){
                    
                    if(my[i][2]==0){
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;
                    }
                    
                    if(my[i][1]==0){
                        my[i][1]=my[i][2];
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;
                       
                    }
                    if(my[i][0]==0){
                        my[i][0]=my[i][1];
                        my[i][1]=my[i][2];
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;
                    }
                    
                    if(my[i][1]==my[i][0]){
                        my[i][0]+=my[i][1];
                        my[i][1]=0;
                        min++;
                    }
                    
                    
                    
                    if(my[i][2]==my[i][1]){
                        my[i][1]+=my[i][2];
                        my[i][2]=0;
                        min++;
                    }
                    
                    if(my[i][3]==my[i][2]){
                        my[i][2]+=my[i][3];
                        my[i][3]=0;
                        min++;
                    }
                    
                    if(my[i][2]==0){
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;
                    }
                    
                    if(my[i][1]==0){
                        my[i][1]=my[i][2];
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;                       
                    }
                    
                    if(my[i][0]==0){
                        my[i][0]=my[i][1];
                        my[i][1]=my[i][2];
                        my[i][2]=my[i][3];
                        my[i][3]=0;
                        min++;
                    }
                    
                    
                }
                break;
            }    
        }  
    } 
    
    
    public static int check_step(){
        int i=0,j=0;
        int check=0;
        for(i=1; i<n-1; i++){
            for(j=01; j<n-1; j++){
               
                if(my[i][j]==my[i][j+1] || my[i][j]==my[i][j-1] || my[i][j]==my[i+1][j] || my[i][j]==my[i-1][j]){
                    check=100;
                }
            }
        }
        
        if(my[0][0]==my[0][1] || my[0][0]== my[1][0] || my[0][1]==my[0][2] || my[0][2]==my[0][3] || my[0][3]==my[1][3] || my[1][3]==my[2][3] || my[2][3]==my[3][3] || my[3][3]==my[3][2] || my[3][2]==my[3][1] || my[3][1]==my[3][0] || my[3][0]==my[2][0] || my[2][0]==my[1][0]){
            check=100;
        }
        
        
        return check;
        
    }
    
    
    public static int check_win(){
        
        int i,j, check=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(my[i][j]==2048){
                        check=10000;
                        
                }
               
           }
                        
            
        }
        return check;
    }


}