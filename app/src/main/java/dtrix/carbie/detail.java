package dtrix.carbie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv1 =findViewById(R.id.textView9);
        tv2 =findViewById(R.id.textView10);
        tv3 =findViewById(R.id.textView11);
        tv4 =findViewById(R.id.textView12);
        tv5 =findViewById(R.id.textView13);

        Bundle data =getIntent().getExtras();
        String str;
        int val;
        double vald;

        str=data.getString("name");
        tv1.setText(str);

        str=data.getString("regno");
        tv2.setText(str);

        str=data.getString("cartype");
        tv3.setText(str);

        vald=data.getInt("elvl");
        str=vald+"";
        tv4.setText(str);

        val=data.getInt("exc");
        if(val==0)
            str=getString(R.string.fal);
        else
            str=getString(R.string.tru);
        tv5.setText(str);
    }
}
