package test.bluerain.youku.com.xposedtest.net;

/**
 * Project: XposedTest.
 * Data: 2016/5/26.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */
public interface NetworkResponseListener {

    void onSuccess(String response);

    void onFailed(String failMessage);
}
