package test.andrew.com.study001;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    BitmapDrawable bitmap001;
    BitmapDrawable bitmap002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        bitmap001 = (BitmapDrawable) res.getDrawable(R.mipmap.photo001);
        bitmap002 = (BitmapDrawable) res.getDrawable(R.mipmap.photo002);
    }

    public void onUpBtn001Clicked(View v) {

        ImageView imgView001 = (ImageView) findViewById(R.id.photo001);
        ImageView imgView002 = (ImageView) findViewById(R.id.photo002);

        if(null != imgView001.getDrawable() && null != imgView002.getDrawable()) {
            if(imgView001.getDrawable().equals((bitmap001)) && imgView002.getDrawable().equals(bitmap002)) {
                imgView001.setImageDrawable(bitmap002);
                imgView002.setImageDrawable(bitmap001);
            } else {
                imgView001.setImageDrawable(bitmap001);
                imgView002.setImageDrawable(bitmap002);
            }
        } else {
            imgView001.setImageDrawable(bitmap001);
            imgView002.setImageDrawable(bitmap002);
        }
    }

    public void onDownBtn001Clicked(View v) {

        ImageView imgView001 = (ImageView) findViewById(R.id.photo001);
        ImageView imgView002 = (ImageView) findViewById(R.id.photo002);

        if(null != imgView001.getDrawable() && null != imgView002.getDrawable()) {
            if(imgView001.getDrawable().equals((bitmap001)) && imgView002.getDrawable().equals(bitmap002)) {
                imgView001.setImageDrawable(bitmap002);
                imgView002.setImageDrawable(bitmap001);
            } else {
                imgView001.setImageDrawable(bitmap001);
                imgView002.setImageDrawable(bitmap002);
            }
        } else {
            imgView001.setImageDrawable(bitmap001);
            imgView002.setImageDrawable(bitmap002);
        }
    }
}
