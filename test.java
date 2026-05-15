public class test {
   public void add (int a , int b){
     System.out.println("addition" +"->" +   a+b);
   } 

     public void sub (int a , int b){
     System.out.println("subtraction" +"->" +   (a-b));
   } 

     public void mul (int a , int b){
     System.out.println("multiplication" +"->" +   a*b);
   } 
   public static void main(String[] args) {
       test t = new test();
        t.add(1, 2);
         t.sub(10, 5);
       t.mul(10,5);

   }
}
