public interface Printer{
       void print();
}
class TestPrinter{
      Printer p=new Printer(){
         public void print(){
              System.out.println("Hi Ruchineth");
}};
}
class Application{
      public static void main(String[] args){
      TestPrinter t=new TestPrinter();
      t.p.print();
}}
