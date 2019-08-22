public interface PrinterWithLamda{
       void print();
}
class TextPrinterWithLamda{
      PrinterWithLamda pl=()->System.out.println("Hi Java Lamda");
}
class ApplicationWithLamda{
      public static void main(String[] args){
             TextPrinterWithLamda tpl=new TextPrinterWithLamda();
             tpl.pl.print();
}
}
