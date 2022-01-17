package test;

public class List {
    public static void main(String[] args) {
        String list[]=new String[5];
        list[0]="book";
        list[1]="car";
        list[2]="home";
        list[3]="apple";
        list[4]="pen";
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
        int number[]=new int[5];
        number[0]=1;
        number[1]=22;
        number[2]=333;
        number[3]=4444;
        number[4]=55555;
        for(int i=0;i< number.length;i++){
            System.out.println(number[i]);
        }
    }
}
