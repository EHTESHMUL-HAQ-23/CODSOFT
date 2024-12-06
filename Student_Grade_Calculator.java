import java.util.Scanner;  // import the Scanner Class
public class Student_Grade_Calculator
{
        
        public static void main(String[] args)
    {

            Scanner sgc = new Scanner(System.in);
         
            System.out.println(" ' Student Grade Calculator ' ");
            System.out.println("Enter Total Subjects:");
            int num_of_sub=sgc.nextInt(); // ns  // input from user
            
{
            int Total=0;
            int i;
            char Grade;
            
            for (i=1; i<=num_of_sub; i++) // loop to iterate
            {
                System.out.println("Enter the  " + i + "st Subject Mark");
                int Mark=sgc.nextInt();  // input from user
                Total +=Mark; // Total = Total + Mark
                
            }
                
                float Average= (float) Total /num_of_sub; // average/Percentage =total_markobtained/total marks
                sgc.close();
                
            if (Average  <= 100   && Average > 90)
            {
                Grade= 'O';
                System.out.println("The Grade is : "+Grade);
                    
            }

            else if  (Average <= 90 && Average > 80 )
            {
                Grade = 'A' ;
                System.out.println("The Grade is : "+Grade);
            }

            else if (Average <=80 && Average > 70)
            {
                Grade = 'B' ;
                System.out.println("The Grade is : "+Grade);

            }

            else if (Average <=70 && Average > 60)
            {
                Grade ='C';
                System.out.println("The Grade is : "+Grade);
            }

            else if (Average <=60 && Average > 50)
            {
                Grade ='D';
                System.out.println("The Grade is : "+Grade);
            }

            else if (Average <= 50 && Average > 40)
            {
                Grade='E';
                System.out.println("The Grade is : "+Grade);
            }
            
            else 
            {
            
                // System.out.println("Grade: " + Grade);                
            System.out.println("Sorry to said ! "+ "Your are failed in Examination");
            System.out.println("The Mark is :" + Average);
            }
                    
            System.out.println("Total Mark of Obtained is:" +Total);
            System.out.println("Average / Percentage is:" + Average);
        
    } 
}
    

}