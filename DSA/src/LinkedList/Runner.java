package LinkedList;

public class Runner {
   public static void main(String[] args) {
  LinkedListImpl lli=new LinkedListImpl();
  lli.delete();
  lli.insert(32);
  lli.insert(11);
  lli.insert(77);
  lli.display();
  lli.insertFront(44);

  lli.display();
  lli.delete();
  lli.display();
}
}
