package io.agora.utils2;

import android.text.TextUtils;
import android.util.Log;
import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.Logging;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public class NetUtil {
    private static final String TAG = "NetUtil";

    public static boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e) {
            Log.e(TAG, "checkUrlEncoded failed: ", e);
            return false;
        }
    }

    public static String encodeUrl(String str) {
        Logging.m88105d(TAG, "encodedUrl()");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            Log.e(TAG, "encodeUrl failed: ", e);
            return str;
        }
    }

    @CalledByNative
    public static String getDecodedUrl(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e) {
            Log.e(TAG, "getDecodedUrl failed: ", e);
            return str;
        }
    }

    @CalledByNative
    public static String getEncodedUrl(String str) {
        return checkUrlEncoded(str) ? str : encodeUrl(str);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public static boolean testNetworkUrlAvailable(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Exception e;
        Logging.m88105d(TAG, "testNetworkUrlAvailable encodedUrl");
        boolean z = false;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setConnectTimeout(1000);
                    httpURLConnection.setReadTimeout(1000);
                    z = httpURLConnection.getResponseCode() != 404;
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return z;
                } catch (Exception e2) {
                    e = e2;
                    Log.e(TAG, "testNetworkUrlAvailable failed: ", e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return z;
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
