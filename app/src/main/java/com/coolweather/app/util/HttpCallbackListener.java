package com.coolweather.app.util;

/**
 * Created by lixfe on 2015/3/22.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
