package Iteration;

public class Iteration {
    public static void main(String args[]){
        //while(run only if condition is true),do while(run at least once), for , for each
        int i=1;
        while(i<=5){
            System.out.println("Hello! from while");
            i++;
        }
        i=1;
        do{
            System.out.print("Hello! from do while");
            i++;
        }while(i<=5);
        for(i=0;i<=5;i++){
            System.out.println("Hello! from for");
        }
        //nested loop
        for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
