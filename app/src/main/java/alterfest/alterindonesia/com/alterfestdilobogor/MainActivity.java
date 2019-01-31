package alterfest.alterindonesia.com.alterfestdilobogor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText edEmail, edPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail     = (EditText) findViewById(R.id.edEmail);
        edPassword  = (EditText) findViewById(R.id.edPassword);
        btnLogin     = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();

                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this,
                            "Email dan Password Tidak Boleh Kosong",
                            Toast.LENGTH_LONG).show();
                } else {
                    if(email.equals("admin@admin.com")
                            && password.equals("123456")){

                        Toast.makeText(MainActivity.this,
                                "Berhasil Login",
                                Toast.LENGTH_LONG).show();

                        Intent intentPindahHalaman = new Intent(MainActivity.this,
                                HalamanUtama.class);
                        startActivity(intentPindahHalaman);
                    } else {
                        Toast.makeText(MainActivity.this,
                                "Login Gagal",
                                Toast.LENGTH_LONG).show();
                    }

                }
            }
        });

    }
}
