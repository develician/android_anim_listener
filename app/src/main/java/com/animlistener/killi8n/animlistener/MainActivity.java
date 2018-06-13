package com.animlistener.killi8n.animlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button animButton;

    Animation mAni1, mAni2, mAni3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animButton = (Button) findViewById(R.id.animButton);

        animButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animButton.startAnimation(mAni1);
            }
        });

        mAni1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        mAni2 = AnimationUtils.loadAnimation(this, R.anim.rotate);
        mAni3 = AnimationUtils.loadAnimation(this, R.anim.scale);

        mAni1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animButton.startAnimation(mAni2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mAni2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animButton.startAnimation(mAni3);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mAni3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText( MainActivity.this, "Animation End", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
