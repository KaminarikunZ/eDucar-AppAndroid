package net.tohemu.educa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
    }

    public void GoToTareas(View v) {
        Intent i = new Intent(getBaseContext(), Tareas2Activity.class);
        startActivity(i);
    }

    public void GoToCalendario(View v) {
        Intent i = new Intent(getBaseContext(), CalendarioActivity.class);
        startActivity(i);
    }

    public void GoToInformes(View v) {
        Intent i = new Intent(getBaseContext(), InformesActivity.class);
        startActivity(i);
    }

    public void GoToMensajeria(View v) {
        Intent i = new Intent(getBaseContext(), MensajeriaActivity.class);
        startActivity(i);
    }


}
