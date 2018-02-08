package mx.edu.ittepic.tablamultiplicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnMul;
    TextView txtRes;
    EditText edtNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMul = (Button) findViewById(R.id.btnMul);
        txtRes = (TextView) findViewById(R.id.txtRes);
        edtNum = (EditText) findViewById(R.id.edtNum);

    }

    public void multiplicar (View view){
        int num = Integer.parseInt(edtNum.getText().toString());
        String res = "" + num + " X 1 = " + (num * 1) +  "\n" +
                     "" + num + " X 2 = " + (num * 2) +  "\n" +
                    "" + num + " X 3 = " + (num * 3) +  "\n" +
                    "" + num + " X 4 = " + (num * 4) +  "\n" +
                    "" + num + " X 5 = " + (num * 5) +  "\n" +
                    "" + num + " X 6 = " + (num * 6) +  "\n" +
                    "" + num + " X 7 = " + (num * 7) +  "\n" +
                    "" + num + " X 8 = " + (num * 8) +  "\n" +
                    "" + num + " X 9 = " + (num * 9) +  "\n" +
                    "" + num + " X 10 = " + (num * 10) +  "\n";

        txtRes.setText(res.toString());

    }

}
