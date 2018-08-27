package ph.edu.iicsust.raymundo.johnandre.firsttime1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstTime1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time1);

        EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
        EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
                TextView resultTextView = (TextView) findViewById(R.id.inputEditText1);

                int first_num = Integer.parseInt(inputEditText1.getText().toString());

                int second_num = Integer.parseInt(inputEditText2.getText().toString());

                int result = first_num + second_num;
                resultTextView.setText(result + "");


            }
        });

    }
}
