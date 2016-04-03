package vijayson.mvp_sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginMainActivity extends AppCompatActivity implements View.OnClickListener, LoginViewReference {

    EditText username, password;
    Button login;
    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
        login = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login.setOnClickListener(this);
        mLoginPresenter=new LoginPresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login) {
            Toast.makeText(this, "login clicked", Toast.LENGTH_LONG).show();
            mLoginPresenter.doLogin(username.getText().toString(),password.getText().toString());
        }
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(this, "onLoginFailed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void goToNextActivity() {
        Toast.makeText(this, "goToNextActivity", Toast.LENGTH_LONG).show();
    }
}
