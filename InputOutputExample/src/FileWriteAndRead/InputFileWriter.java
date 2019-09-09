package FileWriteAndRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InputFileWriter {
    public static void main(String[] args) {
        InputFileWriter ifw=new InputFileWriter();
        ifw.write();
        ifw.read();
        System.out.println("After Try block work...");
        ifw.withTryWrite();
        ifw.withTryRead();

    }
    public void write(){
        try{
            FileWriter flWriter=new FileWriter("/home/user/Desktop/RuchinethTest/write.txt");
            BufferedWriter bfWriter=new BufferedWriter(flWriter);
            for (int i=1;i<=10;i++){
                bfWriter.write(""+i);
                bfWriter.newLine();


            }


            bfWriter.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void read(){
        try {
            FileReader flReader=new FileReader("/home/user/Desktop/RuchinethTest/write.txt");
            BufferedReader bfReader=new BufferedReader(flReader);
            String bfValue;

            while((bfValue=bfReader.readLine())!=null){
                System.out.println(bfValue);
            }
            bfReader.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void withTryWrite(){
        try(FileWriter flWriter=new FileWriter("/home/user/Desktop/RuchinethTest/writeWithTry.txt");
            BufferedWriter bfWriter=new BufferedWriter(flWriter)){

            for (int i=1;i<=10;i++){
                bfWriter.write(""+i);
                bfWriter.newLine();


            }

        }
        catch(Exception e){System.out.println(e);}
    }
    public void withTryRead(){
        try (FileReader flReader=new FileReader("/home/user/Desktop/RuchinethTest/writeWithTry.txt");
             BufferedReader bfReader=new BufferedReader(flReader)){

            String bfValue;

            while((bfValue=bfReader.readLine())!=null){
                System.out.println(bfValue);
            }
        }
        catch(Exception e){System.out.println(e);}

    }








}
