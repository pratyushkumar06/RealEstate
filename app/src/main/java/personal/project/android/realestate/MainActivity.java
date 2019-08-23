package personal.project.android.realestate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username,pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //It doesn't work on api23 as the drawables are of higher version than that 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        pass=findViewById(R.id.password);

        button=findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String email=username.getText().toString();   //Here we Hardcode the email and password but in case of the real app we have to get
        String password=pass.getText().toString();    //these details from the database

        String oemail="admin";
        String opass="admin123";

        if(email.equals(oemail)&& password.equals(opass)){
            Intent intent=new Intent(this,Navigation.class);  //Login Credentials check
            startActivity(intent);

        }
        else{
            Toast.makeText(this,"Invalid Username or Password",Toast.LENGTH_LONG).show();
        }


    }
}
