public class StackTester
{
  public static void main(String[]args)
  {
    System.out.println("ArrayStack");
    Stack s=new ArrayStack();
    try{
      System.out.println(s.size());
      System.out.println(s.isEmpty());
      s.push(10);
       System.out.println(s.isEmpty());

//    try{
         System.out.println(s.peek());
         System.out.println(s.search(10));
         
    System.out.println(s.toString());
      Object b=s.pop();
      System.out.println(b);
      
//    }
//    catch(Exception e)
//    {
//      System.out.println(e);
//    }
  
    System.out.println(s.toArray());
    s.push(10);
    s.push(20);
    s.push(30);
    Object [] abc=s.toArray();
    for(int c=0;c<abc.length;c++)
    {
      if(c!=abc.length-1)
      {
      System.out.print(abc[c]+", ");
      }
      else
      {
        System.out.print(abc[c]+".");
      }
    }
    System.out.println();
    }
        catch(Exception e)
    {
      System.out.println(e);
    }
//    System.out.println(s.size());
//    System.out.println(s.isEmpty());
//    System.out.println(s.push(10));
//    System.out.println(s.pop());
//    System.out.println(s.peek());
//    System.out.println(s.toString());
//    System.out.println(s.toArray());
//    System.out.println(s.search(10));
    System.out.println("ListStack");
    Stack ls=new ListStack();
    try{
      System.out.println(ls.size());
      System.out.println(ls.isEmpty());//true
      ls.push(10);//exception
       System.out.println(ls.isEmpty());//false
 System.out.println(ls.peek());
         System.out.println(ls.search(10));//10
         
    
      
      System.out.println(ls.toArray());
      System.out.println(ls.pop());
    ls.push(10);
    ls.push(20);
    ls.push(30);
    System.out.println(ls.toString());
    Object [] abc=ls.toArray();
    for(int c=0;c<abc.length;c++)
    {
      if(c!=abc.length-1)
      {
      System.out.print(abc[c]+", ");
      }
      else
      {
        System.out.print(abc[c]+".");
      }
    }
    System.out.println();
    Object b=ls.pop();
      System.out.println(b);
    }
        catch(Exception e)
    {
      System.out.println(e);
    }
//    System.out.println(ls.size());
//    System.out.println(ls.isEmpty());
//    System.out.println(ls.push(10));
//    System.out.println(ls.pop());
//    System.out.println(ls.peek());
//    System.out.println(ls.toString());
//    System.out.println(ls.toArray());
//    System.out.println(ls.search(10));
  }
}