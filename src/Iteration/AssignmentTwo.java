package Iteration;

public class AssignmentTwo {
    public static void main(String args[]){
        char letter = 'A';
        for(int i=1;i<=3;i++){
            letter = 65;
            for(int j=1;j<=i;j++){
                System.out.print(letter+" ");
                letter++;
            }
            System.out.println();
        }
    }
}
