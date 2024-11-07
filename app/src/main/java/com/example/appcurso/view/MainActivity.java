package com.example.appcurso.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.appcurso.R;
import com.example.appcurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    EditText editTextNome;
    EditText editTextSobrenome;
    EditText editTextCurso;
    EditText editTextTelefone;
    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar; // Declaração do botão Finalizar
    TextView txtDadosSalvos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referência aos campos de entrada, botões e TextView no layout
        editTextNome = findViewById(R.id.edit_primeiro_nome);
        editTextSobrenome = findViewById(R.id.edit_sobrenome);
        editTextCurso = findViewById(R.id.edit_nome_curso);
        editTextTelefone = findViewById(R.id.edit_Tel_Contato);
        buttonLimpar = findViewById(R.id.button1);
        buttonSalvar = findViewById(R.id.btn_salvar);
        buttonFinalizar = findViewById(R.id.button3); // Inicializando o botão Finalizar
        txtDadosSalvos = findViewById(R.id.txt_dados_salvos);

        // Preenchendo os campos com dados ao iniciar o aplicativo
        editTextNome.setText("Helton");
        editTextSobrenome.setText("Francisco");
        editTextCurso.setText("Java");
        editTextTelefone.setText("847289402");

        // Configuração do botão "Limpar" para apagar os campos e o TextView
        buttonLimpar.setOnClickListener(view -> {
            editTextNome.setText("Digite de nocvo o nome");
            editTextSobrenome.setText("");
            editTextCurso.setText("");
            editTextTelefone.setText("");
            txtDadosSalvos.setText(""); // Limpa o TextView também
        });

        // Configuração do botão "Salvar" para capturar e exibir os dados
        buttonSalvar.setOnClickListener(view -> {
            String nome = editTextNome.getText().toString().trim();
            String sobrenome = editTextSobrenome.getText().toString().trim();
            String curso = editTextCurso.getText().toString().trim();
            String telefone = editTextTelefone.getText().toString().trim();

            // Verificar se algum campo está vazio
            boolean camposValidos = true;

            if (nome.isEmpty()) {
                editTextNome.setError("Campo Obrigatório");
                camposValidos = false;
            }
            if (sobrenome.isEmpty()) {
                editTextSobrenome.setError("Campo Obrigatório");
                camposValidos = false;
            }
            if (curso.isEmpty()) {
                editTextCurso.setError("Campo Obrigatório");
                camposValidos = false;
            }
            if (telefone.isEmpty()) {
                editTextTelefone.setError("Campo Obrigatório");
                camposValidos = false;
            }

            // Se todos os campos são válidos, prosseguir com o salvamento
            if (camposValidos) {
                // Criando e preenchendo um objeto Pessoa com os dados inseridos
                pessoa = new Pessoa();
                pessoa.setPrimeiro_nome(nome);
                pessoa.setSobrenome(sobrenome);
                pessoa.setNome_curso(curso);
                pessoa.setTel_Contato(telefone);

                // Exibindo as informações no Logcat para verificação
                Log.i("Dados Salvos", pessoa.toString());

                // Exibindo uma notificação Toast com a mensagem "Dados Salvos"
                Toast.makeText(MainActivity.this, "Dados Salvos", Toast.LENGTH_SHORT).show();

                // Limpar campos após salvar
                //editTextNome.setText("");
                //editTextSobrenome.setText("");
                //editTextCurso.setText("");
                //editTextTelefone.setText("");
               // txtDadosSalvos.setText(""); // Limpa o TextView também
            }
        });

        // Configuração do botão "Finalizar"
        buttonFinalizar.setOnClickListener(view -> {
            // Aqui você pode colocar o que você quer que aconteça ao finalizar
            // Por exemplo, mostrar uma mensagem de finalização
            Toast.makeText(MainActivity.this, "Processo Finalizado", Toast.LENGTH_SHORT).show();

            // Ou finalizar a atividade e sair
            finish(); // Fecha a atividade atual
        });
    }
}
