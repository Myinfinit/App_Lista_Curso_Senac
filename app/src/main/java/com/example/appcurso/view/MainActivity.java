package com.example.appcurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appcurso.R;
import com.example.appcurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa OutraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();


        pessoa.setPrimeiro_nome("Helton");
        pessoa.setSobrenome("Francisco");
        pessoa.setNome_curso("Java");
        pessoa.setTel_Contato("847289402");

        OutraPessoa = new Pessoa();

        OutraPessoa.setPrimeiro_nome("Aida");
        OutraPessoa.setSobrenome("Quisito");
        OutraPessoa.setNome_curso("Java");
        OutraPessoa.setTel_Contato("847289402");

        Log.i( "Informaçoes pessoais", pessoa.toString());
        Log.i("Outra informação", OutraPessoa.toString());



    }

}