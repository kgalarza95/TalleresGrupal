package com.example.tallergrupal;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 *
 */
public class FrmDatosActivity extends AppCompatActivity {

    private TextView txtTitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_datos);

        txtTitulo = findViewById(R.id.txtTitulo);
        recibirDatosIntent();
    }

    /**
     * Me permite obtener el intent y los extras del intetn para administrarlos
     * la busqueda de los extras es por la clave del valor
     */
    private void recibirDatosIntent(){
        Bundle bundle = getIntent().getExtras();//extraer extras enviadas del activity ant.
        String nomUsuario = bundle.getString("keyUsuario");
        txtTitulo.setText("Formulario Datos "+nomUsuario);
    }
}
