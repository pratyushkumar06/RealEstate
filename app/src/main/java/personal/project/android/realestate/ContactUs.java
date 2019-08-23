package personal.project.android.realestate;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class ContactUs extends AppCompatActivity implements View.OnClickListener {

    Button button;

    Boolean error=false;
    EditText name,email,phone,prop;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        name=findViewById(R.id.editText);
        phone=findViewById(R.id.editText3);
        prop=findViewById(R.id.editText4);
            button=findViewById(R.id.button);
          button.setOnClickListener(this);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onClick(View v) {

       error=false;
        String n=name.getText().toString().trim();
        String ph=phone.getText().toString().trim();
        String pr=prop.getText().toString().trim();

        if(n.isEmpty()){  //checking for constraints
            name.setError("Name can't be blank");
            name.requestFocus();
            error=true;

        }

        if(ph.isEmpty()){
            phone.setError("Number can't be blank");
            phone.requestFocus();
            error=true;
        }

        if(pr.isEmpty()){
            prop.setError("Properties can't be blank");
            prop.requestFocus();
            error=true;
        }

        if(!error)
            Toast.makeText(this,"Details Submitted",Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home)     //For functioning of the home button  
            finish();
        return super.onOptionsItemSelected(item);

    }
}