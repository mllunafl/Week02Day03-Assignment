/**
 * Created by LunaFlores on 12/7/16.
 */
public class Varargs {
    public static void setThings(String... previousNames){
        for (String previous : previousNames){
            System.out.print(previous);
        }
        System.out.println();
    }
}
