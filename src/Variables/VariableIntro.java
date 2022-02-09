package Variables;

public class VariableIntro {
    public static void main(String args[]){
        long lNum = 5l;//8bytes
        int num=5;//4bytes
        short sNum = 5;//2bytes
        byte bNum = 5;//1byte
        System.out.print(num);
        float decFloat = 5.5f;//4bytes
        System.out.print(decFloat);
        double decDouble = 5.5; // 8bytes default for floating numbers
        char c ='A'; //1byte ASCII values supported
        int i1 = 5;
        double d1 = i1;//implicit conversion
        int i2 = (int) d1;//explicit conversion
    }
}
