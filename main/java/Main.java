import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        String text = "Фйхжао пчу тефнэйч: <Уъшйттуй меиетнй фуршьнч те чйрйщут 100 хшёрйо>";
        System.out.println((int)'ё' + " " + (int)'Ё');
        System.out.println(text);
        for(int i = 1; i <=33 ; i++)
            System.out.println(Decryption(text,i) + "\t| Сдвиг: " + i);
    }


    static String Decryption(String oldText, int j){
        char[] arr = oldText.toCharArray();

        String newText = null;
        for(int i = 0; i < arr.length; i++){
            if(newText == null)
                newText = String.valueOf(myFun(arr[i],j));
            else
                newText += myFun(arr[i],j);
        }

        return newText;
    }
    static char myFun(char letter, int number){
        int Dop = letter;
        if((int)letter ==1105){
            return template(7, 1071, number, true);
        }
        if((int)letter ==1025){
            return template(7, 1039, number, true);
        }
        if(Dop >= 1072 && Dop <= 1103){//Маленькие
            return template(Dop - 1071, 1071, number, false);
        }
        if(Dop >= 1040 && Dop <= 1071){ //Заглавные
            return template(Dop - 1039, 1039, number, false);
        }
        return letter;
    }
    static char template(int initialValue, int shift, int number, boolean flagE){
        // 1 арг: Номер буквы(от 1 до 32)
        // 2 арг: Сдвиг для возращения кода буквы, для распознования заглавной и маленькой буквы
        // 3 арг: Сдвиг буквы
        // 4 арг: Это ё или нет
        int tmp = initialValue;
        if(!flagE && tmp >= 7){
            tmp++;
        }
        tmp -= (number%34);
        if(tmp>7){
            tmp--;
        }
        if(tmp == 7 && shift == 1071)
            return (char)1105;
        if(tmp == 7 && shift == 1039)
            return (char)1025;
        tmp += shift;
        return (char)tmp;
    }
}

