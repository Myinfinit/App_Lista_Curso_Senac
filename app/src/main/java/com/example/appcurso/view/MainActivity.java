package com.example.appcurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        OutraPessoa.setPrimeiro_nome("Helton");
        OutraPessoa.setSobrenome("Francisco");
        OutraPessoa.setNome_curso("Java");
        OutraPessoa.setTel_Contato("847289402");



        String dadosPessoa = "Nome: " + pessoa.getPrimeiro_nome() + "\n" + "Sobrenome: " + pessoa.getSobrenome() + "\n" +
                "Curso: " + pessoa.getNome_curso() + "\n" +
                "Telefone: " + pessoa.getTel_Contato();

        int parada = 0;





    }

}