package alterfest.alterindonesia.com.alterfestdilobogor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HalamanUtama extends AppCompatActivity {

    EditText etAngka1, etAngka2;
    Button btnPlus, btnKali, btnBagi;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);


        etAngka1    = (EditText) findViewById(R.id.angka_1);
        etAngka2    = (EditText) findViewById(R.id.angka_2);
        btnPlus     = (Button) findViewById(R.id.btnPlus);
        btnKali     = (Button) findViewById(R.id.btnKali);
        btnBagi     = (Button) findViewById(R.id.btnBagi);
        tvHasil     = (TextView) findViewById(R.id.tvHasil);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strAngka1 = etAngka1.getText().toString();
                String strAngka2 = etAngka2.getText().toString();

                if(strAngka1.isEmpty() || strAngka2.isEmpty()){
                    Toast.makeText(HalamanUtama.this, "Wajib Diisi",
                            Toast.LENGTH_LONG).show();
                } else {
                    int angka1 = Integer.parseInt(strAngka1);
                    int angka2 = Integer.parseInt(strAngka2);
                    int total = angka1+angka2;
                    tvHasil.setText("Hasilnya: "+total);
                    Toast.makeText(HalamanUtama.this, "Hasilnya: "+total,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strAngka1 = etAngka1.getText().toString();
                String strAngka2 = etAngka2.getText().toString();

                if(strAngka1.isEmpty() || strAngka2.isEmpty()){
                    Toast.makeText(HalamanUtama.this, "Wajib Diisi",
                            Toast.LENGTH_LONG).show();
                } else {
                    int angka1 = Integer.parseInt(strAngka1);
                    int angka2 = Integer.parseInt(strAngka2);
                    int total = angka1*angka2;
                    tvHasil.setText("Hasilnya: "+total);
                    Toast.makeText(HalamanUtama.this, "Hasilnya: "+total,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
