package sg.edu.rp.c346.id20012912.mymodules;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ModuledetailsActivity extends AppCompatActivity
{
    TextView C346;
    TextView name;
    TextView year;
    TextView semester;
    TextView credit;
    TextView location;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduledetails);


        Intent getmoduledetails = getIntent();

        C346 = findViewById(R.id.C346ModuleCode);
        name = findViewById(R.id.C346ModuleName);
        year = findViewById(R.id.C346Year);
        semester = findViewById(R.id.C346Sem);
        credit = findViewById(R.id.C346Credit);
        location = findViewById(R.id.C346Place);

        String C346mcode = getmoduledetails.getStringExtra("Module Code");
        String C346mname = getmoduledetails.getStringExtra("Module Name");
        int C346year = getmoduledetails.getIntExtra("Academic Year", 0);
        int C346Sem = getmoduledetails.getIntExtra("Semester", 0);
        int C346mcredit = getmoduledetails.getIntExtra("Module Credit", 0);
        String place = getmoduledetails.getStringExtra("Venue");

        C346.setText("Module Code: " +C346mcode);
        name.setText("Module Name: "+C346mname);
        year.setText("Academic Year: " +C346year);
        semester.setText("Semester Year: " +C346Sem);
        credit.setText("Module Credit" + C346mcredit);
        location.setText("Location: "+place);


    }
}