public class CreateReverceNumber {

    public int reverceTheNumber(int originalNum){
        int reverceNum;
        int x;
        int y;
        x=originalNum/10;
        y=originalNum%10;
        //System.out.println(x);
        reverceNum=y;
        while(x>0){
            y=x%10;
            x=x/10;

            reverceNum=reverceNum*10+y;
        }
        return reverceNum;

    }
    public static void main(String[] args) {
        CreateReverceNumber crn=new CreateReverceNumber();
        int originalNum=562873;
        int reverceNum;
        reverceNum=crn.reverceTheNumber(originalNum);
        System.out.println("The Original Number:"+originalNum);
        System.out.println("After Reverce work the Number:"+reverceNum);
    }
}
