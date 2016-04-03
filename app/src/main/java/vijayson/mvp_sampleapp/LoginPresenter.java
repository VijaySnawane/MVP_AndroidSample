package vijayson.mvp_sampleapp;

/**
 * Created by monika-Asus-pc on 4/3/2016.
 */
public class LoginPresenter implements IntLoginPresenter, OnLoginDoneListener {

    private LoginViewReference mView;
    private MLoginInteractor interactor;

    public LoginPresenter(LoginViewReference view) {
        this.mView = view;
        interactor=new MLoginInteractor();
    }

    @Override
    public void doLogin(String username, String Password) {
      interactor.invalidateLogin(this,username,Password);
    }

    @Override
    public void onLoginFailed() {
       mView.onLoginFailed();
    }

    @Override
    public void onLoginSucess() {
        mView.goToNextActivity();
    }
}
