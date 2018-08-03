import java.util.*;
public class Janken {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name[] = {"グー","チョキ","パー"};
        int win =  0; // 勝数
        int loss = 0; // 負数
        int draw = 0; // 引き分け数
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "回目");
            // コンピュータの手を選択
            int y = (int)(Math.random() * 3);
            // 人間の手を選択
            System.out.print("何を出しますか？（0:グー，1:チョキ，2:パー）: ");
            int x  = sc.nextInt();
            // 表示
            System.out.print("あなた：" + name[x] + "\n");
            // コンピュータの手を表示する部分や勝敗の判定・カウントなど
            // 残りは自分で記述してください
            // 必要なら，変数やメソッドを適宜追加してもよい
        }
        // 最終結果表示
        System.out.println("あなたは"+win+"勝"+loss+"敗"+draw+"引分けでした");
    }
}