package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ItinearySearchActivity extends AppCompatActivity {

    public static String depart = "depart";
    public static String name = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineary_search);


        Button buttoncontent = findViewById(R.id.buttn);
        buttoncontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText departurecontent = findViewById(R.id.depart);
                String departureValue = departurecontent.getText().toString();
                EditText destinationcontent = findViewById(R.id.name);
                String destinationValue = destinationcontent.getText().toString();

                if (departureValue.isEmpty() && destinationValue.isEmpty()) {
                    Toast.makeText(ItinearySearchActivity.this, "Please enter your Departure and your Destination", Toast.LENGTH_SHORT).show();


                }
                else {
                    Intent intentcontent = new Intent(ItinearySearchActivity.this, ItinearyListActivity.class);
                    intentcontent.putExtra(depart, departureValue);
                    intentcontent.putExtra(name, destinationValue);
                    ItinearySearchActivity.this.startActivity(intentcontent);
                }
            }

        });
    }
}