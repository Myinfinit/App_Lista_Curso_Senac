// PessoaController.java
package com.example.appcurso.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

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
}
