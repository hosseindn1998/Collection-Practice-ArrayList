import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> goodIntegers = new ArrayList<>();
        int flag=0;
        int count=0;
        int temp;
        while (flag==0){
            System.out.println("Enter Numbers : (End with -1)");
            temp=scanner.nextInt();
            scanner.nextLine();
            if(temp==-1){
                System.out.println("Are you Sure Ending? Please Enter 0 Else Input Your Number");
                temp=scanner.nextInt();
                scanner.nextLine();
                if(temp==0)break;
            }
            integers.add(count,temp);
            count++;


        }
        System.out.println("User Input Integers : \n"+integers);
        if(integers.size()%2==1){
            integers.remove(integers.size()-1);
        }

        for (int i = 0; i < integers.size()-1; i++) {
            if(i%2==0 & integers.get(i)>=integers.get(i+1)){
                goodIntegers.add(integers.get(i));
                goodIntegers.add(integers.get(i+1));
            }


        }
        System.out.println("Good Integers : \n"+goodIntegers);
    }
}
