package dtrix.carbie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText tv1,tv2;
//    private static final String USER_NAME = "admin";
//    private static final String PASSWORD = "12345678";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.editText);
        tv2 = findViewById(R.id.editText2);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = tv1.getText().toString();
                final String password = tv2.getText().toString();

                if(username.equals(getString(R.string.username)) && password.equals(getString(R.string.user_password))) {
                    Intent i = new Intent(getApplicationContext(), Direction.class);
                    startActivity(i);
                }else
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
