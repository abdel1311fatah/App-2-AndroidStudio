// Abel Ibarra

//El codi es exactament el mateix que el de la primera practica per lo que no l' he cambiat tot i que els noms no son els que tocarien
package com.example.app1_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
        resultat = (TextView) findViewById(R.id.resultat);
    }

    public void sumar(View dibuix) {
        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);

            long suma = n1 + n2;

            String resultat_suma = String.valueOf(suma);
            resultat.setText(resultat_suma);
        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa numeros valids");
        }
    }

    public void restar(View dibuix){

        resultat.clearComposingText();

        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {

            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);
            long resta = n1 - n2;

            String resultat_resta = String.valueOf(resta);
            resultat.setText(resultat_resta);

        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa numeros valids");
        }


    }

    public void multiplicar(View dibuix){

        resultat.clearComposingText();

        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {

            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);
            long multiplicacio = n1 * n2;

            String resultat_multiplicacio = String.valueOf(multiplicacio);
            resultat.setText(resultat_multiplicacio);

        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa numeros válids");
        }

    }

    public void divisio(View dibuix) {
        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);

            if (n2 == 0) {
                resultat.setText("No es pot dividir per 0");
            } else if (n1 < n2) {
                resultat.setText("El primer numero ha de ser mes gran que el segon");
            } else {
                long divisio = n1 / n2;
                String resultat_divisio = String.valueOf(divisio);
                resultat.setText(resultat_divisio);
            }
        } catch (NumberFormatException e) {
            resultat.setText("Ingresa numeros valids");
        }
    }
    public void mod(View dibuix){

        resultat.clearComposingText();

        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {

            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);

            if (n2 == 0 || n1 == 0) {
                resultat.setText("Un dels 2 numeros es 0");
            } else {
                long mod = n1 % n2;
                String resultat_mod = String.valueOf(mod);
                resultat.setText(resultat_mod);
            }

        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa números valids");
        }


    }

    public void elevar(View dibuix) {

        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        try {

            long base = Long.parseLong(valor1);
            long exponent = Long.parseLong(valor2);
            long result = 1; // Initialize result to 1

            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            String resultat_elevacio = String.valueOf(result);
            resultat.setText(resultat_elevacio);

        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa números valids");
        }


    }

    public void combinacions(View dibuix){

        // No va
        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {
            long n = Long.parseLong(valor1);
            long r = Long.parseLong(valor2);
            long resultat_operacio = 0;
            long n3 = 0;
            long r1 = 0;
            long x = 0, x1 = 0;

            for (long i = 1; i <= n; i++) {
                n3 = n3 * i;
            }

            for (long i = 1; i <= r; i++) {
                r1 = r1 * i;
            }

            x = n3 - r1;

            for (long i = 1; i <= x; i++) {
                x1 = x1 * i;
            }

            long denominador = x1 * r1;

            if (denominador == 0) {
                resultat.setText("El denominador es 0, per lo que no es pot fer la operacio");
                resultat_operacio = 0;
            } else {
                resultat_operacio = n3 / denominador;
            }

            resultat.setText(String.valueOf(resultat_operacio));
        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            resultat.setText("Ingresa números valids");
        }
    }
}
