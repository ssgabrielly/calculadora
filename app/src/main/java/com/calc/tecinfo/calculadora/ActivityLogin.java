package com.calc.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.btn_login);
        Button cadastrar = (Button) findViewById(R.id.btn_cadastrar);

        final EditText nome = (EditText) findViewById(R.id.edt_nome);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityCadastro.class);
                intent.putExtra("nome", nome.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
