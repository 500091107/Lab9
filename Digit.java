import java.util.Scanner;
public class Digit 
{
    Scanner sc = new Scanner(System.in);
    int[] input_Digit()
    {
        int[] num = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the "+(i+1)+" digit :");
            num[i]=sc.nextInt();
        }
        return num;
    }
    public static void main(String[] args) 
    {
        Digit n = new Digit();
        int[] numbers=n.input_Digit();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        System.out.println(numbers[i]+" "+numbers[j]+" "+numbers[k]);
                    }
                }
            }
        }
    }
    
}