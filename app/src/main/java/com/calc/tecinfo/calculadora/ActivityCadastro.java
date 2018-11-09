package com.calc.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final TextView txtNome = (TextView) findViewById(R.id.txt_nome);

        final EditText txtForm = (EditText) findViewById(R.id.txt_form);
        final EditText txtNasc = (EditText) findViewById(R.id.txt_nasc);
        final EditText txtEnd = (EditText) findViewById(R.id.txt_end);
        final EditText txtTel = (EditText) findViewById(R.id.txt_tel);
        final EditText txtPais = (EditText) findViewById(R.id.txt_pais);

        Button btnSalvar = (Button) findViewById(R.id.btn_salvar);

        Intent intentRecebido = getIntent();
        String nome = intentRecebido.getStringExtra("nome");
        txtNome.setText(nome);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCadastro.this, ActivityDados.class);
                intent.putExtra("formação", txtForm.getText().toString());
                intent.putExtra("nascimento", txtNasc.getText().toString());
                intent.putExtra("endereço", txtEnd.getText().toString());
                intent.putExtra("telefone", txtTel.getText().toString());
                intent.putExtra("país", txtPais.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
