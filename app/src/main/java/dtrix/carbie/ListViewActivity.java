package dtrix.carbie;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    private ListView mlistView;
    public PersonVehicle[] array;

    public PersonVehicle[] arrayN = {
            new PersonVehicle("Arup","TN 08 AR 3428","Private",12,4,12.912329,80.179327),
            new PersonVehicle("Dipayan","TN 34 SD 7635","Public",12,0,13.185915,80.245393),
            new PersonVehicle("Jerry","TN 03 AF 2587","Private",12,4,13.174805,80.219300),
            new PersonVehicle("Iyer","TN 34 AA 4235","Private",12,4,12.921030,80.145142)};

    public PersonVehicle[] arrayS={
            new PersonVehicle("Jethalal","TN 03 AE 4234","Private",12,4,13.028088,80.110123),
            new PersonVehicle("Bhide","PY 08 A 3425","Private",12,4,13.045481,80.266679),
            new PersonVehicle("Roshan","TN 45 AK 9374","Public",12,0,13.010695,80.153382),
            new PersonVehicle("Sonali","TN 08 AE 2526","Private",12,4,12.958906,80.230973)};

    public PersonVehicle[] arrayE={
            new PersonVehicle("Popatlal","TN 87 DF 4529","Private",12,4,13.164521,80.268739),
            new PersonVehicle("Rita","TN 45 FG 4365","Public",12,0,13.108352,80.213807),
            new PersonVehicle("Muthuraju","TN 98 E 4236","Emergency",12,0,12.949806,80.206940),
            new PersonVehicle("Sai Prashant","TN 45 HG 1794","Public",12,0,13.157385,80.298251)};

    public PersonVehicle[] arrayW={
            new PersonVehicle("Sidhu","TN 18 FG 4327","Private",12,4,13.049829,80.101844),
            new PersonVehicle("Abdul","TN 06 G 7378","Government",12,0,12.934415,80.180848),
            new PersonVehicle("Gurkeerat","TN 34 XD 2847","Private",12,4,13.061869,80.157502),
            new PersonVehicle("Rahul","Kl 04 GH 2457","Public",12,0,13.087285,80.264144)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mlistView =(ListView) findViewById(R.id.listview);
        String zone = getIntent().getExtras().getString("zone");

        switch (zone){
            case "north":
                array=arrayN;
                break;

            case "south":
                array=arrayS;
                break;

            case "east":
                array=arrayE;
                break;

            case "west":
                array=arrayW;
                break;

        }
        ListViewAdapter adapter = new ListViewAdapter(getApplicationContext(),R.layout.row,array);
        mlistView.setAdapter(adapter);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent dint = new Intent(getApplicationContext(),detail.class);
                dint.putExtra("name",array[i].getName());
                dint.putExtra("regno",array[i].getRegno());
                dint.putExtra("cartype",array[i].getCartype());
                dint.putExtra("elvl",array[i].getEmissionlvl());
                dint.putExtra("exc",array[i].getException());
                startActivity(dint);
            }
        });

        mlistView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                double lati,longi;
                lati = array[i].getLati();
                longi = array[i].getLongi();
                String loc = "geo:"+lati+","+longi+"?q="+lati+","+longi+"("+array[i].getName()+")";
                Uri location = Uri.parse(loc);
                Intent lint = new Intent(Intent.ACTION_VIEW,location);
                startActivity(lint);
                return true;
            }
        });


    }
}
