import java.util.Scanner;

class task_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),litr=sc.nextInt(), weeks=1, c=0;
        if(k<1 || litr<1){
            System.out.print("Введены некорректные данные");
            System.exit(0);
        }
        while(weeks<17){
            c+=k*litr;
            System.out.println("К " + weeks + " неделе будет выпито " + c + " литров жидкости");
            weeks++;
        }
        if(c<120){
            System.out.print("К сожалению, студент не принят в клуб");
        }else{
            System.out.print("Студент принят в IT-клуб");
        }
    }
}
