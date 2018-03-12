package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItinearyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineary_list);

        Intent intent = getIntent();
        String intentdeparturesearch = intent.getStringExtra("depart");
        Intent intent1 = getIntent();
        String intentname2 = intent.getStringExtra("name");

       setTitle(intentdeparturesearch + ">> " + intentname2);



    }
}
