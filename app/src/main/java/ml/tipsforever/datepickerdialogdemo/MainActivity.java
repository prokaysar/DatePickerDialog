package ml.tipsforever.datepickerdialogdemo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.showTextId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePicker datePicker = new DatePicker(MainActivity.this);
                int currentDate = datePicker.getDayOfMonth();
                int currentMonth = datePicker.getMonth();
                int currentYear = datePicker.getYear();
            DatePickerDialog dialog;
            dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    textView.setText("Selected date : "+i2+"/"+(i1+1)+"/"+i);
                }
            },
                    currentYear,
                    currentMonth,
                    currentDate
                    );
            dialog.show();
            }
        });
    }
}
