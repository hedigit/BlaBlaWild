package fr.wcs.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by wilder on 12/03/18.
 */

public class TripAdapter extends ArrayAdapter<TripModel> {

    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TripModel trip = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
        }
        // Lookup view for data population
        TextView textFirstname  = (TextView) convertView.findViewById(R.id.firstname);
        TextView textLastname = (TextView) convertView.findViewById(R.id.lastname);
        TextView textDate = (TextView) convertView.findViewById(R.id.date);
        TextView textPrice = (TextView) convertView.findViewById(R.id.price);
        // Populate the data into the template view using the data object

        textFirstname.setText(trip.getFirstname());
        textLastname.setText(trip.getLastname());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");
        String sdfString = sdf.format(trip.getDate());
        textDate.setText(sdfString);


        String pricez = String.valueOf(trip.getPrice());
        textPrice.setText(pricez);




        // Return the completed view to render on screen
        return convertView;
    }
}
