package com.sina.weibo.sdk.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;
import p149l.upk0;

/* JADX INFO: loaded from: classes11.dex */
public class ConnectionFactory {
    public static HttpURLConnection createConnect(String str, Context context) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        if (TextUtils.isEmpty(str) || !(str.startsWith("http://") || str.startsWith("https://"))) {
            upk0.m194883a("非法url请求");
            return null;
        }
        try {
            URL url = new URL(str);
            Pair<String, Integer> apn = NetStateManager.getAPN();
            Proxy proxy = apn != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) apn.first, ((Integer) apn.second).intValue())) : null;
            if (str.startsWith("http://")) {
                httpURLConnection = proxy == null ? (HttpURLConnection) url.openConnection() : (HttpURLConnection) url.openConnection(proxy);
            } else {
                httpURLConnection = proxy == null ? (HttpsURLConnection) url.openConnection() : (HttpsURLConnection) url.openConnection(proxy);
            }
            httpURLConnection2 = httpURLConnection;
        } catch (MalformedURLException | IOException unused) {
        }
        httpURLConnection2.setUseCaches(false);
        try {
            httpURLConnection2.setRequestMethod("POST");
        } catch (ProtocolException unused2) {
        }
        httpURLConnection2.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
        httpURLConnection2.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
        httpURLConnection2.setRequestProperty("Charset", "UTF-8");
        httpURLConnection2.setReadTimeout(ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        httpURLConnection2.setConnectTimeout(25000);
        return httpURLConnection2;
    }
}
