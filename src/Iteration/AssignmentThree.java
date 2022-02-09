package Iteration;

public class AssignmentThree {
    public static void main(String args[]){
        char dollar = '$';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4){
                    System.out.print(dollar+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
