package net.tohemu.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;

public class MainActivity extends AppCompatActivity {

    public String HTTPResponse = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v) {
        EditText user   = (EditText)findViewById(R.id.txtLogin);
        EditText passwd = (EditText)findViewById(R.id.txtPasswd);

        String userText = user.getText().toString().trim();
        String passText = passwd.getText().toString().trim();

        if(userText.length() == 0){
            Toast.makeText(this, "Especificar un Nombre de Usuario.", Toast.LENGTH_LONG).show();
            return;
        }

        if(passText.length() == 0){
            Toast.makeText(this, "Especificar un Password.", Toast.LENGTH_LONG).show();
            return;
        }

        GetRequest("http://74.208.157.199/educar/ws/login.php?l="+userText+"&p="+passText);

        //if(userText.equals("tohemu") && passText.equals("0lv1d4m3")){
        if(Integer.parseInt(HTTPResponse) > 0){
            Toast.makeText(this, "Respuesta GET= "+HTTPResponse, Toast.LENGTH_LONG).show();
            Intent i = new Intent(getBaseContext(), HomeActivity.class);
            //i.putExtra("PersonID", personID); //Pasar parámetros a la siguiente actividad
            startActivity(i);
        }else{
            Toast.makeText(this, "Los Datos proporcionados son incoorrectos.", Toast.LENGTH_LONG).show();
            user.setText("");
            passwd.setText("");
            return;
        }
    }

    private void GetRequest(String URL) {
        HTTP peticion = new HTTP(URL);
        String a = peticion.GetRequest();
        int b = 1;
    }
}