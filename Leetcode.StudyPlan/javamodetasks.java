import java.util.*;

public class javamodetasks {

    public static String RemoveStrings(String s){
        ArrayList<String> stack = new ArrayList<>();
        String[] subStrings = s.split("");
        for (String ch: subStrings){
            int size = stack.size();
            if (ch.equals("*") && size > 0){
                int index = size - 1;
                stack.remove(index);
            }
            else{
                stack.add(ch);
            }
        }
        return String.join("",stack);
        }
    public static void main(String[] args){
        String answ = javamodetasks.RemoveStrings("leet**code");
        System.out.println(answ);
        }

    }