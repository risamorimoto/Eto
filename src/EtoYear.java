import java. io. *;

public class EtoYear {
    public static void main(String[] args) {
        int nen;
        int eto;
        String line;
        System.out.println("年数を入力してね。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                line = reader.readLine();
                nen = Integer.parseInt(line);
                if (nen == 0) {
                    System.out.println("0以外の整数で入力してください。");
                }
            } while (nen == 0);

            eto = (nen % 12);
            switch (eto) {
                case 0:
                    System.out.println("西暦" + nen + "年の干支は申です。");
                    break;

                case 1:
                    System.out.println("西暦" + nen + "年の干支は酉です。");
                    break;

                case 2:
                    System.out.println("西暦" + nen + "年の干支は戌です。");
                    break;

                case 3:
                    System.out.println("西暦" + nen + "年の干支は亥です。");
                    break;

                case 4:
                    System.out.println("西暦" + nen + "年の干支は子です。");
                    break;

                case 5:
                    System.out.println("西暦" + nen + "年の干支は丑です。");
                    break;

                case 6:
                    System.out.println("西暦" + nen + "年の干支は寅です。");
                    break;

                case 7:
                    System.out.println("西暦" + nen + "年の干支は卯です。");
                    break;

                case 8:
                    System.out.println("西暦" + nen + "年の干支は辰です。");
                    break;

                case 9:
                    System.out.println("西暦" + nen + "年の干支は巳です。");
                    break;

                case 10:
                    System.out.println("西暦" + nen + "年の干支は午です。");
                    break;

                case 11:
                    System.out.println("西暦" + nen + "年の干支は未です。");
                    break;

                default:
                    System.out.println("何かがおかしいです。");
                    break;

            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("整数を入力してください。");
        }
    }
}