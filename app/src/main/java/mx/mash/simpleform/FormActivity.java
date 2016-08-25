package mx.mash.simpleform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by miguel_angel on 24/08/2016.
 */
public class FormActivity extends AppCompatActivity {

    private EditText edId;
    private EditText edName;
    private Button btInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        edId    = (EditText) findViewById(R.id.id);
        edName  = (EditText) findViewById(R.id.name);
        btInsert = (Button) findViewById(R.id.insert_button);

        btInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
