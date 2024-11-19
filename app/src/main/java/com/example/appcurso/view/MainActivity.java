package com.example.appcurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appcurso.R;
import com.example.appcurso.controller.PessoaController;
import com.example.appcurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextSobrenome;
    EditText editTextCurso;
    EditText editTextTelefone;
    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar;
    TextView txtDadosSalvos;

    PessoaController pessoaController;

    SharedPreferences listaVip;
    SharedPreferences.Editor editor;

    public static final String NOME_PREFERENCE = "pref_ListaVip";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoaController = new PessoaController();

        listaVip = getSharedPreferences(NOME_PREFERENCE, MODE_PRIVATE);
        editor = listaVip.edit();

        editTextNome = findViewById(R.id.edit_primeiro_nome);
        editTextSobrenome = findViewById(R.id.edit_sobrenome);
        editTextCurso = findViewById(R.id.edit_nome_curso);
        editTextTelefone = findViewById(R.id.edit_Tel_Contato);
        buttonLimpar = findViewById(R.id.button1);
        buttonSalvar = findViewById(R.id.btn_salvar);
        buttonFinalizar = findViewById(R.id.button3);
        txtDadosSalvos = findViewById(R.id.txt_dados_salvos);

        editTextNome.setText(listaVip.getString("Nome", ""));
        editTextSobrenome.setText(listaVip.getString("Sobrenome", ""));
        editTextCurso.setText(listaVip.getString("Curso", ""));
        editTextTelefone.setText(listaVip.getString("Telefone", ""));

        buttonSalvar.setOnClickListener(view -> {
            Pessoa novaPessoa = new Pessoa();
            novaPessoa.setPrimeiro_nome(editTextNome.getText().toString().trim());
            novaPessoa.setSobrenome(editTextSobrenome.getText().toString().trim());
            novaPessoa.setNome_curso(editTextCurso.getText().toString().trim());
            novaPessoa.setTel_Contato(editTextTelefone.getText().toString().trim());

            pessoaController.salvar(novaPessoa, editor);

            txtDadosSalvos.setText(
                    "Nome: " + novaPessoa.getPrimeiro_nome() + " " + novaPessoa.getSobrenome() +
                            "\nCurso: " + novaPessoa.getNome_curso() +
                            "\nTelefone: " + novaPessoa.getTel_Contato()
            );

            Toast.makeText(MainActivity.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();
        });

        buttonLimpar.setOnClickListener(view -> {
            pessoaController.limpar(editor);
            limparCampos();
        });

        buttonFinalizar.setOnClickListener(view -> {
            pessoaController.finalizar(this);
        });
    }

    private void limparCampos() {
        editTextNome.setText("");
        editTextSobrenome.setText("");
        editTextCurso.setText("");
        editTextTelefone.setText("");
        txtDadosSalvos.setText("");
    }
}
