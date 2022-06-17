package yandex.algorithm.lessons.first;

import java.util.HashSet;
import java.util.Set;

/**
 *  Символы в формате UTF-8/Найти самый часто повторяющийся символ
 *  если таких символов несколько, вывести любой.
 * */
public class CharUTF8 {

    private String ch ="";
    private int repeatCount = 0;

    //O(N^2) because we have inner cycle
    public void getRepeatChar(String[] text) {

        for(int i=0; i < text.length; i++) {
            int innerCount = 0;

            for(int j = i; j < text.length; j++) {
                if(text[i].equals(text[j])){
                    innerCount++;
                }
            }

            if(innerCount > repeatCount) {
                ch = text[i];
                repeatCount = innerCount;
            }
        }
        print(repeatCount,ch);
    }

    //O(N*k) where k-is different elements
    public void getRepeatCharSet(String[] text) {
        Set<String> set = new HashSet<>();

        for(int i=0; i < text.length; i++) {
            int innerCount = 0;

            if(!set.add(text[i])) {
                innerCount++;
            }
            if(innerCount > repeatCount) {
                ch = text[i];
                repeatCount = innerCount;
            }
        }

        print(repeatCount,ch);
    }

    private void print(int repeatNum,String ch) {
        System.out.println(repeatNum + "," + ch);
    }

}
