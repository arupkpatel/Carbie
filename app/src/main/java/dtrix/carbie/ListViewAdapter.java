package dtrix.carbie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Soumya on 10-09-2017.
 */

public class ListViewAdapter extends ArrayAdapter<PersonVehicle> {

    private Context mcontext;
    private int mresource;
    private PersonVehicle[] mpv;


    public ListViewAdapter(@NonNull Context context, int resource, @NonNull PersonVehicle[] objects) {
        super(context, resource, objects);
        mcontext = context;
        mresource = resource;
        mpv =objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Pvholder holder;

        if(convertView==null) {
            LayoutInflater inflater = LayoutInflater.from(mcontext);
            convertView = inflater.inflate(mresource, parent, false);

            holder = new Pvholder();
            holder.imageView=(ImageView) convertView.findViewById(R.id.imageView);
            holder.tv1 = (TextView) convertView.findViewById(R.id.textView);
            holder.tv2=(TextView) convertView.findViewById(R.id.textView2);

            convertView.setTag(holder);

        }else{
            holder = (Pvholder) convertView.getTag();
        }

        holder.imageView.setImageResource(R.drawable.icon1);
        holder.tv1.setText(mpv[position].getName());
        holder.tv2.setText(mpv[position].getRegno());

        return convertView;
    }



    public static class Pvholder{
        private ImageView imageView;
        private TextView tv1,tv2;
    }
}
