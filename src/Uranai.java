import java. io. *;

public class Uranai {
    public static void main(String[] args) throws IOException {
        System.out.println("ようこそ占いの館へ");
//        名前を入力してもらうよ
            String name;
            System.out.println("あなたの名前を入力してください");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                name = reader.readLine();
            String ageString;
//        年齢を入力してもらうよ
            System.out.println("あなたの年齢を入力してください");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                ageString = reader2.readLine();
                int age = Integer.parseInt(ageString);
//        randomメソッドで0以上4未満の整数を生成
                int i;
                i = (int)(Math.random()*4);
                ++i;
//        占いの結果を出すよ
            System.out.println("占いの結果が出ました！");
            System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+i+"です");
            System.out.println("1:大吉 2:中吉 3:小吉 4:凶");

//System.out.println(i);


    }


    }


