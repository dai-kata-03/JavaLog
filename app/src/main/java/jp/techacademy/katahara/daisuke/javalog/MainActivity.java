package jp.techacademy.katahara.daisuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ログ出力 Lesson 3.4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson 7.3 クラスとインスタンス

        Dog dog = new Dog("ポチ", 3); // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        Dog dog2 = new Dog("ハチ", 10); // 名前をハチ、年齢10歳で、Dogのインスタンスを作る

        dog2.say();
        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");

     }
}
