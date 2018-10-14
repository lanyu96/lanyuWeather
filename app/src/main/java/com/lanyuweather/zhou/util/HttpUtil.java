package com.lanyuweather.zhou.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhou on 2018/10/13.
 */
public class HttpUtil {
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
