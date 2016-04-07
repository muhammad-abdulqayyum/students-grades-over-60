package students_grades_over_60;

import java.util.Scanner;

/**
 *
 * @author ABDULQM
 */
public class Students_Grades_over_60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] A;
        A = new int [10];
        String [] names;
        names = new String [10];
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Enter the name and test grade of 10 people.");
        
        
        
        for (int i=0 ; i<A.length; i++) {
            System.out.println ("Enter the students name");
            names [i] = in.next();
            System.out.println ("Enter the Students grade");
            A[i] = in.nextInt();
        
            
            
            
        
            if (A[i] < 0 || A[i] > 100)
            {
                throw new IllegalArgumentException("Your grade must be between 0 and 100");
           
            }
        
        }
            
         
	int min = A[0];
	int max = A[0];
 
	for (int j = 1; j <= A.length - 1; j++) {
            if (max < A[j]) {
		
                max = A[j];
		
            }
 
            if (min > A[j]) {
		
                min = A[j];
            }              
         
        
        }
        
        
        
        for(int k =0; k < A.length - 1; ++k)
        {
            if (A[k] > 60) 
            {        
                System.out.println("Student with grade over 60. Students Name: " + names[k] + " Students Grade: " + A[k] );
        
            }
        }
    }
        
}
    



