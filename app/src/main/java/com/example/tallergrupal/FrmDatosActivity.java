package com.example.tallergrupal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 *
 */
public class FrmDatosActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private Button btnAceptar;
    private Button btnCancelar;
    private EditText txtNombres;
    private EditText txtApellidos;
    private EditText txtEdad;
    private EditText txtCorreo;
    private EditText txtContrasenia;
    private EditText txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_datos);

        txtNombres = findViewById(R.id.txtNombres);
        txtTitulo = findViewById(R.id.txtTitulo);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtContrasenia = findViewById(R.id.txtContrasenia);
        txtTelefono = findViewById(R.id.txtTelefono);
        btnAceptar = findViewById(R.id.btnAceptar2);
        btnCancelar = findViewById(R.id.btnCancelar2);
        recibirDatosIntent();
        initEventos();
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

    //FORMA 2 de manejo de eventos de boton
    private void initEventos(){

        //evento de boton aceptar forma 2
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mostrar alerta
                //(ubicacion del mensaje, dato a mostrar, tiempo de aparicion)
                Toast.makeText(getApplicationContext(), "Datos ingresados correctamentes", Toast.LENGTH_SHORT);
                System.out.println("Log de consola");
                limpiarComponentes();

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Operacion cancelada", Toast.LENGTH_SHORT);
                limpiarComponentes();
            }
        });
    }

    private void limpiarComponentes(){
        txtTitulo.setText("");
        btnAceptar.setText("");
        btnCancelar.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtCorreo.setText("");
        txtContrasenia.setText("");
        txtTelefono.setText("");
    }
}
