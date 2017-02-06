package net.tohemu.educa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_calendario);

        CalendarView calendar = (CalendarView)findViewById( R.id.calendarView );
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView arg0, int year, int month,int date) {
                //Toast.makeText(getApplicationContext(),date+ "/"+month+"/"+year,Toast.LENGTH_LONG).show();
                String fecha = date+ "/"+month+"/"+year;
                String msg = "Sin Entregas para esta Fecha.";
                switch (fecha){
                    case "2/0/2017": msg= "Literatura - Libro Los de Abajo"; break; //2 de Enero
                    case "6/0/2017": msg= "Español - Redacción de Carta"; break; //6 de Enero
                    case "28/1/2017": msg= "Educación Física - Traer Uniforme"; break; //28 de Febrero
                    default: break;
                }
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
