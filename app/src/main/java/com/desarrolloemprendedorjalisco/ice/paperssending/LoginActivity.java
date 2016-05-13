package com.desarrolloemprendedorjalisco.ice.paperssending;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int seleccion = v.getId();

        try {
            switch (seleccion)
            {
                case R.id.btnIngresar:
                    Intent IntentToMain = new Intent(LoginActivity.this, MainActivity.class);
                    //IntentoDecimal.putExtra("Resultado: ", resultado);
                    startActivity(IntentToMain);
                    break;
            }
        }catch (Exception e){
            //pantalla.setText("Error:" + e.getMessage());
            Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
