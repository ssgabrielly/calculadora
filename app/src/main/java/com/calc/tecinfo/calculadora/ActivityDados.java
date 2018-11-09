package com.calc.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        final TextView txtF = (TextView) findViewById(R.id.txt_f);
        final TextView txtN = (TextView) findViewById(R.id.txt_n);
        final TextView txtE = (TextView) findViewById(R.id.txt_e);
        final TextView txtT = (TextView) findViewById(R.id.txt_t);
        final TextView txtP = (TextView) findViewById(R.id.txt_p);

        Button btnInicio = (Button) findViewById(R.id.btn_inicio);
        Button btnCalcular = (Button) findViewById(R.id.btn_calcular);

        Intent intentRecebido = getIntent();
        String form = intentRecebido.getStringExtra("formação");
        String nasc = intentRecebido.getStringExtra("nascimento");
        String end = intentRecebido.getStringExtra("endereço");
        String tel = intentRecebido.getStringExtra("telefone");
        String pais = intentRecebido.getStringExtra("país");
        txtF.setText(form);
        txtN.setText(nasc);
        txtE.setText(end);
        txtT.setText(tel);
        txtP.setText(pais);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDados.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDados.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
