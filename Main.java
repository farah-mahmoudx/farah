import java.util.Scanner;
import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<>();
Scanner s=new Scanner(System.in);
do {
    int x = s.nextInt();
    if (!list.contains(x) && x != 0)

        list.add(x);
}while( x !=0);
        System.out.println("print out integers");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
}
    }
