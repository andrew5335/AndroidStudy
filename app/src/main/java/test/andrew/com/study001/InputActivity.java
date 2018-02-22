package test.andrew.com.study001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    //Resources res = getResources();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        /**
        Button chkBtn = (Button) findViewById(R.id.chkBtn);

        chkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼이 눌렸어요 !!!", Toast.LENGTH_LONG).show();
            }
        });
         **/
    }

    public void onOkBtnClicked(View v) {
        EditText editText = (EditText) findViewById(R.id.editTxt001);
        TextView textView = (TextView) findViewById(R.id.viewLength);
        textView.setText(String.valueOf(editText.getText().length()));
        Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
    }

    public void onChkBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "버튼이 눌렸네. 이거랑 click listener랑 같은듯..", Toast.LENGTH_LONG).show();
    }
}
