package sg.edu.rp.c346.id20012912.mymodules;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
  TextView android;
  TextView ipad;
  ToggleButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.Android);
        ipad = findViewById(R.id.Ipad);
        back = findViewById(R.id.btnBack);

        android.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                android.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(MainActivity.this, ModuledetailsActivity.class);
                        intent.putExtra("Module Code", "C346");
                        intent.putExtra("Module Name", "Android Programming");
                        intent.putExtra("Academic Year", 2021);
                        intent.putExtra("Semester", 1);
                        intent.putExtra("Module Credit", 4);
                        intent.putExtra("Venue" , "W66M");
                        startActivity(intent);
                    }
                });

                ipad.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(MainActivity.this, ModuledetailsActivity.class);
                        intent.putExtra("Module Code", "C349");
                        intent.putExtra("Module Name", "Ipad Programming");
                        intent.putExtra("Academic Year", 2021);
                        intent.putExtra("Semester", 1);
                        intent.putExtra("Module Credit", 4);
                        intent.putExtra("Venue","W65M");
                        startActivity(intent);
                    }
                });

                back.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        finish();
                    }

                });


            }
        });
    }
}