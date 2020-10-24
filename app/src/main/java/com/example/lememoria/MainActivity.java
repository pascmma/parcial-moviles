package com.example.lememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton verificador;
    int aux=0;
    TextView score;
    int Score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score =(TextView)findViewById(R.id.id_textView);

    }
    public void next(){
        Intent pass = new Intent(this,MainActivity2.class);
        pass.putExtra("score",score.getText().toString());
        startActivity(pass);
    }

    public void boton1(View view){

        ImageButton btn = (ImageButton)findViewById(R.id.boton11);
        btn.setImageResource(R.drawable.gokuuno);
        if(aux == 0){
            verificador = (ImageButton)findViewById(R.id.boton11);
            aux +=1;
        }
        else{
            if(verificador == (ImageButton)findViewById(R.id.boton13)){
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this,"Jugada correcta",Toast.LENGTH_SHORT).show();
                if(Score == 2){
                    next();
                }
            }
            else{
                btn.setImageResource(R.drawable.andri);
                verificador.setImageResource(R.drawable.andri);
                aux =0;
                Toast.makeText(this,"Jugada Incorrecta",Toast.LENGTH_SHORT).show();
            }
        }

    }
    public void boton2(View view){
        ImageButton btn = (ImageButton)findViewById(R.id.boton12);
        btn.setImageResource(R.drawable.gokudos);
        if(aux == 0){
            verificador = (ImageButton)findViewById(R.id.boton12);
            aux +=1;
        }
        else{
            if(verificador == (ImageButton)findViewById(R.id.boton14)){
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this,"Jugada correcta",Toast.LENGTH_SHORT).show();
                if(Score == 2){
                    next();
                }
            }
            else{
                btn.setImageResource(R.drawable.andri);
                verificador.setImageResource(R.drawable.andri);
                aux =0;
                Toast.makeText(this,"Jugada Incorrecta",Toast.LENGTH_SHORT).show();

            }
        }


    }
    public void boton3(View view){
        ImageButton btn = (ImageButton)findViewById(R.id.boton13);
        btn.setImageResource(R.drawable.gokuuno);
        if(aux == 0){
            verificador = (ImageButton)findViewById(R.id.boton13);
            aux +=1;
        }
        else{
            if(verificador == (ImageButton)findViewById(R.id.boton11)){
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this,"Jugada correcta",Toast.LENGTH_SHORT).show();
                if(Score == 2){
                    next();
                }
            }
            else{
                btn.setImageResource(R.drawable.andri);
                verificador.setImageResource(R.drawable.andri);
                aux =0;
                Toast.makeText(this,"Jugada Incorrecta",Toast.LENGTH_SHORT).show();

            }
        }


    }
    public void boton4(View view){
        ImageButton btn = (ImageButton)findViewById(R.id.boton14);
        btn.setImageResource(R.drawable.gokudos);
        if(aux == 0){
            verificador = (ImageButton)findViewById(R.id.boton14);
            aux +=1;
        }
        else{
            if(verificador == (ImageButton)findViewById(R.id.boton12)){
                aux = 0;
                Score += 1;
                score.setText(Integer.toString(Score));
                Toast.makeText(this,"Jugada correcta",Toast.LENGTH_SHORT).show();
                if(Score == 2){
                    next();
                }
            }
            else{
                btn.setImageResource(R.drawable.andri);
                verificador.setImageResource(R.drawable.andri);
                aux =0;
                Toast.makeText(this,"Jugada Incorrecta",Toast.LENGTH_SHORT).show();

            }
        }


    }



}