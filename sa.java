import java.util.Scanner;
    public class sa{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int pos=sc.nextInt();
            System.out.println(a^(1<<pos));


        }
    }
