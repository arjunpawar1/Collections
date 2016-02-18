import java.util.*;
import java.io.*;

class javaMap{
   public static void main(String []argh)
   {
       Map<String,Integer> abc = new HashMap<String, Integer>();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
          abc.put(name,phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if(abc.containsKey(s))
              {
              System.out.println(s+"="+ abc.get(s));
          }
          else
              {
              System.out.println("Not found");
          }
      }
   }
}
