package vijayson.mvp_sampleapp;

import android.os.Handler;

/**
 * Created by monika-Asus-pc on 4/3/2016.
 */
public class MLoginInteractor implements LoginInteractor {
    @Override
    public void invalidateLogin(final OnLoginDoneListener mOnLoginDoneListener,final String username,final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if ((username.length() > 3) && (password.length() > 3)) {
                    mOnLoginDoneListener.onLoginSucess();
                } else {
                    mOnLoginDoneListener.onLoginFailed();
                }
            }
        }, 2000);
    }
}
