import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        //�	1
        //�	2
        //�	3
        //�	4
        //�	5
        //�	6
        //�	7
        //�	8
        //�	9
        //�	10
        //�	11
        //�	12
        //�	13
        //�	14
        //�	15
        //�	16
        //�	17
        //�	18
        //�	19
        //�	20
        //�	21
        //�	22
        //�	23
        //�	24
        //�	25
        //�	26
        //�	27
        //�	28
        //�	29
        //�	30
        //�	31
        //�	32
        String text = "������ ��� �������: <�������� ������� ������� �� ������� 100 ������>";
        
        System.out.println(text);
        for(int i = 1; i <=33 ; i++)
            System.out.println(Decryption(text,i) + "\t| �����: " + i);
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
        if(letter =='�'){
            return template(7, 1071, number, true);
        }
        if(letter =='�'){
            return template(7, 1039, number, true);
        }
        if(Dop >= 1072 && Dop <= 1103){//���������
            return template(Dop - 1071, 1071, number, false);
        }
        if(Dop >= 1040 && Dop <= 1071){ //���������
            return template(Dop - 1039, 1039, number, false);
        }
        return letter;
    }
    static char template(int initialValue, int shift, int number, boolean flagE){
        // 1 ���: ����� �����(�� 1 �� 32)
        // 2 ���: ����� ��� ���������� ���� �����, ��� ������������� ��������� � ��������� �����
        // 3 ���: ����� �����
        // 4 ���: ��� � ��� ���
        int tmp = initialValue;
        if(!flagE && tmp >= 7){
            tmp++;
        }
        tmp -= (number%34);
        if(tmp>7){
            tmp--;
        }
        if(tmp == 7)
            return '�';
        tmp += shift;
        return (char)tmp;
    }
}

