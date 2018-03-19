package fr.wcs.blablawild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class VehicleActivity extends AppCompatActivity {

    final static int NO_VH = 0;
    final static int CAR_VH = 1;
    final static int BOAT_VH = 2;
    final static int PLANE_VH = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        final Spinner spinVehicle = (Spinner) findViewById(R.id.vehicle_spin);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vehiclelist, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinVehicle.setAdapter(adapter);
        spinVehicle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final EditText edit_brand = findViewById(R.id.brand);
                final EditText edit_model = findViewById(R.id.model);
                final EditText edit_kilometre = findViewById(R.id.kilometers);
                final EditText edit_hours = findViewById(R.id.hours);
                final EditText edit_speed = findViewById(R.id.speed);
                Button butt_send = findViewById(R.id.send_btn);

                edit_brand.getText().clear();
                edit_model.getText().clear();
                edit_kilometre.getText().clear();
                edit_hours.getText().clear();
                edit_speed.getText().clear();




                if (i == NO_VH) {
                    edit_kilometre.setVisibility(View.GONE);
                    edit_hours.setVisibility(View.GONE);
                    edit_speed.setVisibility(View.GONE);
                    butt_send.setEnabled(false);
                    edit_brand.setEnabled(false);
                    edit_model.setEnabled(false);

                } else if (i == CAR_VH) {
                    edit_kilometre.setVisibility(View.VISIBLE);
                    edit_hours.setVisibility(View.GONE);
                    edit_speed.setVisibility(View.GONE);
                    butt_send.setEnabled(true);
                    edit_brand.setEnabled(true);
                    edit_model.setEnabled(true);




                    butt_send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            final String brandValue = edit_brand.getText().toString();
                            final String modelValue = edit_model.getText().toString();
                            String kilometreValue = edit_kilometre.getText().toString();
                            int kilometreInt = 0;
                            if (!kilometreValue.isEmpty()) {
                                kilometreInt = Integer.parseInt(kilometreValue);
                            }
                            final Vehiclecar cardesk = new Vehiclecar(brandValue, modelValue, kilometreInt);
                            Toast.makeText(VehicleActivity.this, cardesk.getDescription(), Toast.LENGTH_SHORT).show();

                        }
                    });

                    }

                    else if (i == BOAT_VH) {
                        edit_kilometre.setVisibility(View.GONE);
                        edit_speed.setVisibility(View.GONE);
                        edit_hours.setVisibility(View.VISIBLE);
                        edit_brand.setEnabled(true);
                        edit_model.setEnabled(true);
                        butt_send.setEnabled(true);{


                            butt_send.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    String brandValue = edit_brand.getText().toString();
                                    String modelValue = edit_model.getText().toString();
                                    String hoursValue = edit_hours.getText().toString();
                                    int hoursInt =0;
                                    if (!hoursValue.isEmpty()){
                                       hoursInt = Integer.parseInt(hoursValue);
                                    }
                                    final VehicleBoat boat = new VehicleBoat(brandValue, modelValue, hoursInt);
                                    Toast.makeText(VehicleActivity.this, boat.getDescription(), Toast.LENGTH_SHORT).show();
                                }
                            });

                        }
                    }

                else if (i == PLANE_VH){
                    edit_kilometre.setVisibility(View.GONE);
                    edit_speed.setVisibility(View.VISIBLE);
                    edit_hours.setVisibility(View.GONE);
                    edit_brand.setEnabled(true);
                    edit_model.setEnabled(true);
                    butt_send.setEnabled(true);{


                        butt_send.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String brandValue = edit_brand.getText().toString();
                                String modelValue = edit_model.getText().toString();
                                String speedValue = edit_speed.getText().toString();
                                int speedInt =0;
                                if (!speedValue.isEmpty()){
                                    speedInt = Integer.parseInt(speedValue);
                                }
                                final Vehicleplane plane = new Vehicleplane(brandValue, modelValue, speedInt);
                                Toast.makeText(VehicleActivity.this, plane.getDescription(), Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
