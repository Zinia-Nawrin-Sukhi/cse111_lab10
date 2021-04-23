import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
//S1=new Student();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    Student[]s=new Student[n];
    for(int i=0;i<s.length;i++)
    {
      Student s1=new Student();
      s[i]=s1;
      System.out.println("enter a name");
      s[i].setName(sc.next());
      System.out.println("enter a id");
      s[i].setId(sc.next());
      System.out.println(s[i].getName());
    }
    
    for(int j=0;j<s.length;j++)
    {
      System.out.println(s[j].getName());
      System.out.println(s[j].getId());
    }
    
    
  }
}