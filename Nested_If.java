import java.util.Scanner;
public class Nested_If 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you attendence percentage"); 
        int percentage= sc.nextInt();
        if(percentage<75)
        {
            
            System.out.println("Do you have a medical cause" + "Yes or No");
            String answer = sc.next();
        
        
            if(answer.equalsIgnoreCase("Yes"))
            {
                System.out.println("Your supposed to submit your medical certificate and then your allowed to write it");
            }
            else 
            {
                System.out.println("Your not allowed to write ur exam");
            }
        }
        else{
            System.out.println("Your allowed to write your exam");
            
            

        }
        sc.close();

    }
}
