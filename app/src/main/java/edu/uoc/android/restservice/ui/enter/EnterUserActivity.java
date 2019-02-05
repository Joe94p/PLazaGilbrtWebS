package edu.uoc.android.restservice.ui.enter;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.uoc.android.restservice.R;

public class EnterUserActivity extends AppCompatActivity {

    private EditText etUser;
    private Button btnFollowers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_user);
        initViews();
    }



    private void initViews() {
        etUser = findViewById(R.id.enter_user_edit_text);
        btnFollowers = findViewById(R.id.enter_user_button);
        btnFollowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar();
            }
        });
    }


    //Metodo para validar que el input no este vacio
    public void validar(){
        // VERIFICAR SI EL INPUT ESTA VACIO O NO
        etUser.setError(null);

        // ALMACENA EL VALOR DEL IMPUT
        String usuario = etUser.getText().toString();

        // VARIABLES PARA VERIFICAR SI ESTA VACIO RETORNE AL FOCUS
        boolean cancel = false;
        View focusView = null;

        // verifica que el campo no este vacio.
        if (TextUtils.isEmpty(usuario)) {
            etUser.setError(getString(R.string.mensaje));
            focusView = etUser;
            cancel = true;
        }

        if (cancel) {
            // si la variable canclar tiene el valor de true, se devuelve el focus al imput
            focusView.requestFocus();
        } else {
            // si el valor es false hace el onclick
            progressDialog();
        }

    }

    public void progressDialog(){
        //se llama a la actividad que muestra la información del cliente
        Intent i = new Intent(EnterUserActivity.this, InfoUserActivity.class);
        i.putExtra("loginName", etUser.getText().toString());
        startActivity(i);
    }

}
