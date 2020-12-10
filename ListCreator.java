import java.util.List;
import java.util.function.Supplier;

public class ListCreator {

    public static void main(String[] args) {
    }

    private List<Character> getRandomCharList(int lenght, Class<? extends List> listClass) {
    }
    public class mainProgram {

        public static void main(String[] args) {

            boolean flag = true;
            while (flag) {
                char[] chars = new char[62];

                for (int i = 0; i < 26; i++) {
                    chars[i] = (char) ('A' + i);
                }

                for (int i = 0, j = 26; i < 26; i++) {
                    chars[j++] = (char) ('a' + i);
                }
                for (int i = 0, j = 52; i < 10; i++) {
                    chars[j++] = (char) ('0' + i);
                    StringBuilder str = new StringBuilder();
                    for (int i = 0; i < 4; i++) {
                        str.append(chars[(int) (Math.random() * 52)]);
                    }
                    System.out.println(str);
                    System.out.println("输出4个字符串包含a-z 0-9: ");
                    String inputStr = new Scanner(System.in).nextLine();

                    if (inputStr != null) {
                        if (str.toString().equalsIgnoreCase(inputStr)) {
                            System.out.println("正确...");
                            flag = false;
                        } else {
                            System.out.println("输入错误...");
                        }
                }
            }
    private static class RandomCharSupplier implements Supplier<Character> {
    }

}
