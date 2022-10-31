interface student {
   void finalize() throws Throwable;

   void walk();
}

interface studentslife {
   void travel();
}

class travel implements student, studentslife {
   public void walk() {
      System.out.println("Animal is eating");
   }

   public void trav() {
      System.out.println("Animal is travelling");
   }
}

public class Demo {
   public static void main(String args[]) {
      a.travel = new travel();
      a.walk();
      a.trav();
   }
}