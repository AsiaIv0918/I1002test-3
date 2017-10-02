import java.util.*;
public class Main {
    //字串切割
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        char a;
        str=in.next();
        a=in.next().charAt(0);
        System.out.println(str.replace(a,'\n'));
    }
}
