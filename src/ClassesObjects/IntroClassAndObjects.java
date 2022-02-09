package ClassesObjects;
class Calc{
    int num1;
    int num2;
    int result;
    public Calc(){
        num1=0;
        num2=0;
    }
    public Calc(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void perform(){
        result = num1+num2;
        System.out.print(result);
    }
}
public class IntroClassAndObjects {
    public static void main(String args[]){
        Calc obj;
        obj = new Calc();
        obj.num1 = 3;
        obj.num2 = 5;
        obj.perform();
    }
}
//constructor is a member method
//it has same name as class
//never return anything
//To allocate memory

