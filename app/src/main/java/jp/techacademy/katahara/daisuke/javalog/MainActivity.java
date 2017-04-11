package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 課題：Humanクラスの定義 - インタフェース

        Human human = new Human("サッカーと野球","片原",40); // 趣味＝サッカーと野球、名前=片原、年齢=40でHumanのインスタンスを作る

        human.say();
        human.think();

    }
}
