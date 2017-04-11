package jp.techacademy.katahara.daisuke.javalog;

import android.util.Log;

/**
 * Created by Daisuke on 2017/04/02.
 */

class Human extends Animal implements Thinkable {

    // メンバ変数
       String hobby;

    // コンストラクタ
    public Human (String hobby, String name, int age) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数 - Say
    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

        // メンバ関数 - Think
    @Override
    public void think() {
        Log.d("javatest","「私は" + this.hobby + "について考える」");
    }

}
