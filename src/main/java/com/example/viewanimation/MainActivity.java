package com.example.viewanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    private ImageView imgview;
    private Animation rotateAnim;
    private Animation translateAnim;
    private Animation scaleAnim;
    private Animation alphaAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgview=(ImageView)findViewById(R.id.football);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Image Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void rotateAnimation(View v)
    {
        rotateAnim= AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        rotateAnim.setAnimationListener(this);
        imgview.startAnimation(rotateAnim);

    }
    public void translateAnimation(View v)
    {
        translateAnim= AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        translateAnim.setAnimationListener(this);
        imgview.startAnimation(translateAnim);
    }
    public void alphaAnimation(View v)
    {
        alphaAnim= AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        alphaAnim.setAnimationListener(this);
        imgview.startAnimation(alphaAnim);
    }
    public void scaleAnimation(View v)
    {
        scaleAnim= AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        scaleAnim.setAnimationListener(this);
        imgview.startAnimation(scaleAnim);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        if(animation==rotateAnim)
        Toast.makeText(getApplicationContext(),"Rotate Animation Started",Toast.LENGTH_SHORT).show();
        if(animation==translateAnim)
            Toast.makeText(getApplicationContext(),"Translate Animation Started",Toast.LENGTH_SHORT).show();
        if(animation==scaleAnim)
            Toast.makeText(getApplicationContext(),"Scaling Animation Started",Toast.LENGTH_SHORT).show();
        if(animation==alphaAnim)
            Toast.makeText(getApplicationContext(),"Alpha Animation Started",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(getApplicationContext(),"Animation Has Ended",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(getApplicationContext(),"Animation is Repeating",Toast.LENGTH_SHORT).show();

    }
}
