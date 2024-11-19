package com.example.appcurso.controller;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.example.appcurso.model.Pessoa;

public class PessoaController {

    public PessoaController() {
        Log.d("MVC_CONTROLLER", "CONTROLLER INICIADA");
    }

    @Override
    public String toString() {
        return "PessoaController()";
    }

    public void salvar(Pessoa pessoa, SharedPreferences.Editor editor) {
        editor.putString("Nome", pessoa.getPrimeiro_nome());
        editor.putString("Sobrenome", pessoa.getSobrenome());
        editor.putString("Curso", pessoa.getNome_curso());
        editor.putString("Telefone", pessoa.getTel_Contato());
        editor.commit();
        Log.d("MVC_CONTROLLER", "DADOS SALVOS: " + pessoa.toString());
    }

    public void limpar(SharedPreferences.Editor editor) {
        editor.clear();
        editor.commit();
        Log.d("MVC_CONTROLLER", "DADOS LIMPOS");
    }

    public void finalizar(Activity activity) {
        Toast.makeText(activity, "Finalizado, volte sempre!", Toast.LENGTH_SHORT).show();
        activity.finish();
        Log.d("MVC_CONTROLLER", "FINALIZADO");
    }
}
