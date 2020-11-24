package br.unigran.alunos;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class cadastroAluno  extends AppCompatActivity{
    private EditText nome;
    private EditText idade;
    private EditText turmaAno;
    private EditText dataNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_alunos);

        nome= findViewById(R.id.nome);
        idade = findViewById(R.id.dataNasc);
        turmaAno = findViewById(R.id.turmaAno);
        dataNasc = findViewById(R.id.dataNasc);
    }

}
