// PessoaController.java
package com.example.appcurso.controller;

import android.content.Context;
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

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_CONTROLLER", "DADOS SALVOS: " + pessoa.toString());
    }
}
