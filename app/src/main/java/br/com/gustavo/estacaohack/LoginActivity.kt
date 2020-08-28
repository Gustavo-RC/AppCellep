package br.com.gustavo.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Executando o clique do botão entrar
        btnLoginEntrar.setOnClickListener {

            //Capturar dados digitados pelo usuário
            val email = edtLoginEmail.text.toString().trim().toLowerCase()
            val senha = edtLoginSenha.text.toString().trim()

            //Validação dos campos
            if (email.isEmpty()){
                edtLoginEmail.error = "Campo Obrigatório"
                edtLoginEmail.requestFocus()
            }else if(senha.isEmpty()){
                edtLoginSenha.error = "Campo Obrigatório"
                edtLoginSenha.requestFocus()
            }else{
                //Apresentar uma mensagem de erro ao usuáro
                Toast.makeText(this, "E-mail ou senha inválidos", Toast.LENGTH_LONG).show()
            }
        }

        //Executando o clique do botão cadastrar
        btnLoginCadastrar.setOnClickListener {
            //Abrindo a tela de cadastro
            val mIntent = Intent(this, CadastroActivity::class.java)
            startActivity(mIntent)
        }
    }
}