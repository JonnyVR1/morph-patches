package com.sina.weibo.sdk.network.impl;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.sina.weibo.sdk.net.NetStateManager;
import com.sina.weibo.sdk.network.IRequestParam;
import com.sina.weibo.sdk.network.base.RequestBodyHelper;
import com.sina.weibo.sdk.network.base.UriUtils;
import com.sina.weibo.sdk.network.base.WbResponse;
import com.sina.weibo.sdk.network.base.WbResponseBody;
import com.sina.weibo.sdk.network.exception.RequestException;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RequestEngine {
    public static WbResponse request(IRequestParam iRequestParam) throws RequestException {
        HttpURLConnection httpURLConnection;
        String url = iRequestParam.getUrl();
        if (TextUtils.isEmpty(url) || !(url.startsWith("http") || url.startsWith("https"))) {
            throw new RequestException("非法的请求地址");
        }
        String strBuildCompleteUri = UriUtils.buildCompleteUri(url, iRequestParam.getGetBundle());
        Pair<String, Integer> apn = NetStateManager.getAPN();
        Proxy proxy = apn != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) apn.first, ((Integer) apn.second).intValue())) : null;
        try {
            URL url2 = new URL(strBuildCompleteUri);
            if ("https".startsWith(strBuildCompleteUri)) {
                httpURLConnection = proxy == null ? (HttpsURLConnection) url2.openConnection() : (HttpsURLConnection) url2.openConnection(proxy);
            } else {
                httpURLConnection = proxy == null ? (HttpURLConnection) url2.openConnection() : (HttpURLConnection) url2.openConnection(proxy);
            }
            setRequestHeader(httpURLConnection, iRequestParam.getHeader());
            Bundle bundle = new Bundle();
            String str = "------------" + RequestBodyHelper.getBoundry();
            if (iRequestParam.getMethod() == IRequestParam.RequestType.POST) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                httpURLConnection.setUseCaches(false);
                if (iRequestParam.getPostBundle().getByteArray(RequestParam.KEY_PARAM_BODY_BYTE_ARRAY) != null) {
                    bundle.putString("Content-Type", "application/octet-stream");
                } else if (RequestBodyHelper.isMultipartRequest(iRequestParam)) {
                    bundle.putString("Content-Type", "multipart/form-data;boundary=".concat(str));
                } else {
                    bundle.putString("Content-Type", "application/x-www-form-urlencoded");
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
            } else if (iRequestParam.getMethod() == IRequestParam.RequestType.GET) {
                httpURLConnection.setRequestMethod("GET");
            } else if (iRequestParam.getMethod() == IRequestParam.RequestType.PATCH) {
                httpURLConnection.setRequestMethod("PATCH");
            }
            httpURLConnection.setReadTimeout(iRequestParam.getResponseTimeout());
            httpURLConnection.setConnectTimeout(iRequestParam.getRequestTimeout());
            setRequestHeader(httpURLConnection, bundle);
            httpURLConnection.connect();
            if (iRequestParam.getMethod() != IRequestParam.RequestType.GET) {
                RequestBodyHelper.fillRequestBody(iRequestParam, httpURLConnection, str);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return new WbResponse(new WbResponseBody(httpURLConnection.getInputStream(), httpURLConnection.getContentLength()));
            }
            if (responseCode != 302 && responseCode != 301) {
                throw new RequestException("服务器异常" + new WbResponseBody(httpURLConnection.getErrorStream(), httpURLConnection.getContentLength()).string());
            }
            iRequestParam.setUrl(httpURLConnection.getHeaderField("Location"));
            return request(iRequestParam);
        } catch (MalformedURLException e) {
            LogUtil.m10832v("weibosdk", e.toString());
            throw new RequestException("请求异常" + e.toString());
        } catch (IOException e2) {
            LogUtil.m10832v("weibosdk", e2.toString());
            throw new RequestException("请求异常" + e2.toString());
        }
    }

    private static void setRequestHeader(HttpURLConnection httpURLConnection, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            httpURLConnection.addRequestProperty(str, String.valueOf(bundle.get(str)));
        }
    }
}
