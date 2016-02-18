/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketchecker;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author arjun
 */
public class BracketCheckerUsingStack 
{
    static Scanner s= new Scanner(System.in);
static String input1;

    public static void main(String[] args)
    {
       
    
        System.out.println("please enter any string compraising of (, {,} ,),[,]");
        String input = s.nextLine();
        
      System.out.println(check(input));
    }
    
 public static boolean check(String input)
    {
         Stack theStack = new Stack();
      
            input1=input;
   // System.out.println(input1);
            int a = input1.length();
             
           // System.out.println(a);
            //check if the length is odd return false
            
          
                //check for 1st character using the for loop
                //()
                // {}{}{
           // while(s.hasNext())
            
                for(int i =0;i<a;i++)
                {
                    char check = input1.charAt(i);
                   // System.out.println(check);
                    if(check =='{' || check =='('  || check =='[' )
                    {
                    theStack.push(check);
                    // System.out.println("Current stack elements "+theStack);
                    }
                   
                    else if(check =='}' || check==')'|| check== ']')
                    {
                        //check for if the stack is empty or the the character in stack is not same
                        
                        if(theStack.isEmpty())
                        {
                            return false;
                        }
                        else if(!theStack.isEmpty() &&  ArePair((char)theStack.peek(),check) == true)
                        {
                        
                            theStack.pop();
                        }
                        
                    }
                }
            
                
                //System.out.println("Stack at the end "+ theStack);
               return theStack.isEmpty()? true: false;
          // return false;
       // return false;
    }
 
    
static boolean ArePair(char opening,char closing)
{
	if(opening == '(' && closing == ')') return true;
	else if(opening == '{' && closing == '}') return true;
	else if(opening == '[' && closing == ']') return true;
	return false;
}
 
    
}