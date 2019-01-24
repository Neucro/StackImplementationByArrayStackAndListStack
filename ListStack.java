public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size()
    {
      return size;
    }
    public boolean isEmpty()
    {
       if(size==0||top==null)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public void push(Object e) throws StackOverflowException
    {
       Node n = new Node(e,null);
     if(n==null)
        throw new StackOverflowException();
      n.next = top;
      top=n;
      size++;
  }
//      int c=0;
//      for(Node i=top;i!=null;i=i.next)
//      {
//        c++;
//      }
//      if(size==c)
//      {
//        throw new StackOverflowException();
//      }
//      else
//      {
//      if(top==null){
//        top.val=e;
//      }
//      else{
//        Node p=new Node(e,null);
//        p.next=top;
//        top=p;
//        
//      }
//      }
//       if(top.next==null)
//      {
//         throw new StackOverflowException();
//      }
//       else
//       {
//         if(top==null)
//         {
//         }
//         else
//         {
//         Node pr=new Node(e,null);
//         pr.next=top;
//         pr=top;
//         }
//         top=new Node(e,null);
//         top=top.next;
//         size++;
       
//    }
    public Object pop() throws StackUnderflowException
    {
        if(top==null){
         throw new StackUnderflowException();
       }
       Node topNode = top;
       top=top.next;
      size--;
      return topNode.val;
    }
//      if(top==null)
//      {
//         throw new StackUnderflowException();
//      }
//      else
//      {
//      Object temp=top.val;
//      top=null;
//      top=top.next;
//      size--;
//      return temp;
//      }
//    }
    public Object peek() throws StackUnderflowException
    {
      if(top==null)
      {
         throw new StackUnderflowException();
      }
      {
      return top.val;
      }
    }
    public String toString()
    {
      String ab=" ";
      for(Node i=top;i!=null;i=i.next)
      {
        if(i==top)
        {
          ab=ab+"[ "+i.val;
        }
        else if(i.next==null)
        {
          ab=ab+i.val+"]";
        }
        else
        {
          ab=ab+" "+i.val+" ";
        }
      }
      return ab;
    }
    public Object[] toArray()
    {
      int c=0;
      Object [] temp=new Object[size];
      for(Node i=top;i!=null;i=i.next)
      {
        temp[c]=i.val;
        c++;
      }
      return temp;
    }
    public int search(Object e)
    {
      int c=0;
      for(Node i=top;i!=null;i=i.next)
      {
        if(i.val.equals(e))
        {
          return c;
        }
        c++;
      }
      return -1;
    }
    

}