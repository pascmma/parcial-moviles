package com.example.lememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageButton verificador;
    int aux=0;
    TextView score;
    int Score=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bun = getIntent().getExtras();
        String mensage = bun.getString("score");
        score = (TextView)findViewById(R.id.id_score2);
        score.setText(mensage);
    }
    public void next(){
        Intent fin = new Intent(this,MainActivity3.class);
        startActivity(fin);
    }



    public void boton21(View view) {

        ImageButton btn = (ImageButton) findViewById(R.id.boton21);
        btn.setImageResource(R.drawable.gokutres);
        if (aux == 0) {
            verificador = (ImageButton) findViewById(R.id.boton21);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton24)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
                else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();
                }
            }

        }


    public void boton22(View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.boton22);
        btn.setImageResource(R.drawable.gokuuno);
        if (aux == 0) {
            verificador = (ImageButton)findViewById(R.id.boton22);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton25)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
                else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }


        }

    public void boton23(View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.boton23);
        btn.setImageResource(R.drawable.gokudos);
        if (aux == 0) {
            verificador = (ImageButton)findViewById(R.id.boton23);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton26)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
                else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }


        }

    public void boton24(View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.boton24);
        btn.setImageResource(R.drawable.gokutres);
        if (aux == 0) {
            verificador = (ImageButton)findViewById(R.id.boton24);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton21)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
            else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }


        }

    public void boton25(View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.boton25);
        btn.setImageResource(R.drawable.gokuuno);
        if (aux == 0) {
            verificador = (ImageButton)findViewById(R.id.boton25);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton22)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
                else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }


        }

    public void boton26(View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.boton26);
        btn.setImageResource(R.drawable.gokudos);
        if (aux == 0) {
            verificador = (ImageButton)findViewById(R.id.boton26);
            aux += 1;
        }
        else {
            if (verificador == (ImageButton)findViewById(R.id.boton23)) {
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this, "Jugada correcta", Toast.LENGTH_SHORT).show();
                if (Score == 5) {
                    next();
                }
            }
                else {
                    btn.setImageResource(R.drawable.andri);
                    verificador.setImageResource(R.drawable.andri);
                    aux = 0;
                    Toast.makeText(this, "Jugada Incorrecta", Toast.LENGTH_SHORT).show();

                }
            }


        }
}



