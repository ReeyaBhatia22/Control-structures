import java.util.Scanner; 
public class Project 
{
    public static void main(String[]args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Rate the movie from the range of 1-10");
      int rate= sc.nextInt(); 
      switch(rate)
      {
        case 1: 
        System.out.println("The movie was bad");
        break;
        case 2:
        System.out.println("The movie was okay");
        break;
        case 3:
        System.out.println("The movie was better");
        break;
        case 4:
        System.out.println("The movie was good");
        break;
        case 5:
        System.out.println("The movie was great!");
        break;
        case 6:
        System.out.println("The movie was amazing!");
        break;
        case 7:
        System.out.println("The movie was out of the world!");
        break;
      }
      sc.close();
    }
}
