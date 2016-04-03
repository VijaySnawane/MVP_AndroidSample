package vijayson.mvp_sampleapp;

/**
 * Created by monika-Asus-pc on 4/3/2016.
 */
public interface LoginInteractor {
    void invalidateLogin(OnLoginDoneListener mOnLoginDoneListener,String username,String password);
}
