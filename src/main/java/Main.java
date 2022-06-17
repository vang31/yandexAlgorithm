import yandex.algorithm.lessons.first.CharUTF8;

public class Main {
    public static void main(String[] args) {
        String[] test = new String[]{"a","b","a","b","a"};

        CharUTF8 c = new CharUTF8();
        c.getRepeatChar(test);
        c.getRepeatCharSet(test);
    }
}
