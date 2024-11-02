package com.example.appcurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appcurso.R;
import com.example.appcurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiro_nome("Helton");
        pessoa.setSobrenome("Francisco");
        pessoa.setNome_curso("Java");
        pessoa.setTel_Contato("847289402");
    }

}