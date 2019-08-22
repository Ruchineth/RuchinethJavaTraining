public interface Human{
       void move();     
}
class Man implements Human{
      public void move(){
           System.out.println("Man Move");
}
}
class Application{
      public static void main(String[] args){
             Human human=new Man();
             human.move();
}
}
