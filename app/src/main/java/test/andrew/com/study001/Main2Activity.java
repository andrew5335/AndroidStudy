package test.andrew.com.study001;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onInflateBtnClicked(View v) {
        inFlateLayout();
    }

    private void inFlateLayout() {
        LinearLayout contentLayout = (LinearLayout) findViewById(R.id.contentLayout);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, contentLayout, true);

        Button selectButton = (Button) findViewById(R.id.selectButton);
        final CheckBox allDay = (CheckBox) findViewById(R.id.allDay);
        final RadioButton radio1 = (RadioButton) findViewById(R.id.radio01);
        final RadioButton radio2 = (RadioButton) findViewById(R.id.radio02);
        final TextView textArea = (TextView) findViewById(R.id.text001);

        selectButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(allDay.isChecked()) {
                    allDay.setChecked(false);
                    textArea.setText("놀자 !!!");
                } else {
                    allDay.setChecked(true);
                    textArea.setText("하루 온종일 ~~~");
                }

                if(radio1.isChecked() && !radio2.isChecked()) {
                    radio1.setChecked(false);
                    radio2.setChecked(true);
                } else if(!radio1.isChecked() && radio2.isChecked()) {
                    radio1.setChecked(true);
                    radio2.setChecked(false);
                } else {
                    radio1.setChecked(true);
                    radio2.setChecked(false);
                }
            }
        });
    }
}
