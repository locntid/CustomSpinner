package info.tutsmodel.customdropdownview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by locnt_000 on 9/23/2015.
 */
public class SpinnerAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Eating> eatings;

    public SpinnerAdapter(Activity activity,List<Eating> eatings){
        this.activity = activity;
        this.eatings = eatings;
    }

    @Override
    public int getCount() {
        return eatings.size();
    }

    @Override
    public Object getItem(int position) {
        return eatings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null){
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_view,null);
        }
        TextView txtName1 = (TextView) convertView.findViewById(R.id.txtName);
        txtName1.setText(eatings.get(position).name);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if(inflater == null){
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_dropdown,null);
        }
        TextView txtName2 = (TextView) convertView.findViewById(R.id.txtName);
        txtName2.setText(eatings.get(position).name);
        ImageView imgThumbnail = (ImageView) convertView.findViewById(R.id.imgThumbnail);
        imgThumbnail.setImageResource(eatings.get(position).image);
        return super.getDropDownView(position, convertView, parent);
    }
}
