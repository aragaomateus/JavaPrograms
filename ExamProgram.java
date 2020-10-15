/* Exam Program.
   Mateus Aragao.
   10/14/20*/

import java.util.*;
public class ExamProgram{
   public static void main(String[] args){
   
   // Reading input from the user.
   int newSize=0;
   System.out.println("Enter a name and a birthday date:");  
   Scanner scan = new Scanner(System.in);
   String input = scan.nextLine();
   
   // converting day of birth in String to integer.
   // Ascii number - 48 is the integer equivalent.
   int last = input.charAt(input.length()-1);
   int max = Integer.valueOf(last)-48;
   
   // Conditions to decided the size of the array based on the 
   // month of birthday.
   int size=0;
   if (input.contains("January")||input.contains("Jan"))
      size = 1+10;
   else if (input.contains("February")||input.contains("Feb"))
      size = 2 +10;
   else if (input.contains("March")||input.contains("Mar"))
      size = 3 +10;
   else if (input.contains("April")||input.contains("Apr"))
      size = 4 +10;
   else if (input.contains("May")||input.contains("May"))
      size = 5 +10;
   else if (input.contains("June")||input.contains("Jun"))
      size =6 +10;
   else if (input.contains("July")||input.contains("Jul"))
      size = 7 +10;
   else if (input.contains("August")||input.contains("Aug"))
      size = 8 +10;
   else if (input.contains("September")||input.contains("Sep"))
      size = 9 +10;  
   else if (input.contains("October")||input.contains("Oct"))
      size = 10 +10;
   else if (input.contains("November")||input.contains("Nov"))
      size = 11 +10;
   else if (input.contains("December")||input.contains("Dec"))
      size = 12 +10; 
   
   // Declaring the arrays.  
   int num;  
   int [] array = new int[size]; 
   int [] array2 = new int[size];
   
   // Reading and validading numbers appended to the array.
   for (int i = 0; i < size ; i++){
      num = scan.nextInt();
      if (num > max){
         System.out.println("invalid");
         break;
      }else 
         array[i] = num;
   }
   for (int i = 0; i < size ; i++)
      System.out.print(array[i]+" ");
   
   // While loop for the continuous collapsing until we have only 2 
   // items, which is the smallest amount to close the loop.
   while(size>2){
   if (size%3==0){
      for(int i = 0; i < size-2 ; i=i+3){
         array2[i] = array[i]+array[i+1];
         array2[i] = array2[i] + array[i+2];
    }
    
    }
   
   if(size%3==1){
      for(int i = 0; i < size-3 ; i=i+3){
         array2[i] = array[i]+array[i+1]+array[i+2];
      array2[size-1]=array[size-1];
        
    }
    }
    
   if(size%3==2){
      for(int i = 0; i < size-4 ; i=i+3){
         array2[i] = array[i]+array[i+1]+array[i+2];
      array2[size-1]=array[size-1]+array[size-2];
    }
    }
    
   // Subtracting 12 from the numbers above 12.
   for(int i = 0; i < size; i++){
      if (array2[i]>12)
         array2[i]=array2[i]-12;
            }   
   // Sorting the array, puting zeros aside.
   // iterating newSize variable, which will set the size of the new array.
   int [] array3 = new int[size];           
   for (int i=0, j=0; i<size; i++){
      if (array2[i] != 0) {
         array[j] = array2[i];
         j++;
         newSize++;
            }
        }
   // Reseting the length of the array.     
   size=newSize;
    
   System.out.println(" ");  
   System.out.print("Modified Array: ");
   for( int i = 0; i <size ; i++)
         System.out.print(array[i]+" ");
         
   System.out.println(" ");
   // If there are only 2 numbers left, in case the month is even, 
   // we need to do this last step. 
   int sum =array[0]+array[1];
   if (size==2)
      System.out.println("Modified array: "+sum);
   newSize=0;
   } 
   }        
   }