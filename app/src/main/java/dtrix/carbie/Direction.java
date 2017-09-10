package dtrix.carbie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Direction extends AppCompatActivity {

    private TextView north,south,east,west;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        north= findViewById(R.id.north);
        south= findViewById(R.id.south);
        east=  findViewById(R.id.east);
        west=  findViewById(R.id.west);

        north.setOnClickListener(setPopup("north"));
        south.setOnClickListener(setPopup("south"));
        east.setOnClickListener(setPopup("east"));
        west.setOnClickListener(setPopup("west"));


    }

    private View.OnClickListener setPopup(final String key) {
        View.OnClickListener popup = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), ListViewActivity.class);
                it.putExtra("zone",key);
                startActivity(it);

//            Toast.makeText(getApplicationContext(),"fuck u!!!",Toast.LENGTH_SHORT).show();
            }
        };
        return popup;
    }
}
