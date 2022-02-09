package Operators;

public class ArithmeticOperator {
    public static void main(String args[]){
        //Arithmetic +,-,*,/,%
        int mNum=6,nNum=2;
        int r1 = mNum+nNum;
        int r2 = mNum-nNum;
        int r3 = mNum*nNum;
        double r4 = (double)mNum/nNum;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        r1+=r2; //r1 = r1+r2
        r1++;//r1+=1 postincrement
        ++r1;//preincrement

    }
}
