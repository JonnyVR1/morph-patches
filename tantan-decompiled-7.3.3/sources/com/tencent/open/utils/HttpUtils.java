package com.tencent.open.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.p082a.C13966a;
import com.tencent.open.log.C14540d;
import com.tencent.open.log.SLog;
import com.tencent.open.p109a.C14518f;
import com.tencent.open.p109a.InterfaceC14519g;
import com.tencent.open.p110b.C14529h;
import com.tencent.tauth.IRequestListener;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class HttpUtils {

    public static class NetworkUnavailableException extends Exception {
        public static final String ERROR_INFO = "network unavailable";

        public NetworkUnavailableException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.utils.HttpUtils$a */
    public static class C14545a {

        /* JADX INFO: renamed from: a */
        public final String f61158a;

        /* JADX INFO: renamed from: b */
        public final int f61159b;

        private C14545a(String str, int i) {
            this.f61158a = str;
            this.f61159b = i;
        }
    }

    private HttpUtils() {
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC14519g m85547a(String str, String str2, Bundle bundle) throws IOException {
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        if (str2.equalsIgnoreCase("GET")) {
            Map<String, String> mapM85548a = m85548a(bundle2);
            Bundle bundleM85537b = C14540d.m85537b(bundle2);
            if (bundleM85537b != bundle2) {
                SLog.m85492i("openSDK_LOG.HttpUtils", "-->openUrl encodedParam =" + bundleM85537b.toString() + " -- url = " + str);
            } else {
                SLog.m85492i("openSDK_LOG.HttpUtils", "-->openUrl encodedParam =" + mapM85548a.toString() + " -- url = " + str);
            }
            return C14518f.m85410a().m85414a(str, mapM85548a);
        }
        if (!str2.equalsIgnoreCase("POST")) {
            SLog.m85490e("openSDK_LOG.HttpUtils", "openUrl: http method " + str2 + " is not supported.");
            zpg0.m220844a("http method is not supported.");
            return null;
        }
        Map<String, String> mapM85548a2 = m85548a(bundle2);
        Map<String, byte[]> mapM85551b = m85551b(bundle2);
        if (mapM85551b == null || mapM85551b.size() == 0) {
            return C14518f.m85410a().m85418b(str, mapM85548a2);
        }
        SLog.m85498w("openSDK_LOG.HttpUtils", "openUrl: has binary " + mapM85551b.size());
        return C14518f.m85410a().m85415a(str, mapM85548a2, mapM85551b);
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, byte[]> m85551b(Bundle bundle) {
        HashMap map = new HashMap(0);
        if (bundle != null && bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof byte[]) {
                    map.put(str, (byte[]) obj);
                }
            }
        }
        return map;
    }

    public static String encodeUrl(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : map.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str));
            sb.append("=");
            sb.append(URLEncoder.encode(map.get(str)));
        }
        return sb.toString();
    }

    public static int getErrorCodeFromException(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof ZipException ? -54 : -2;
    }

    public static C14545a getProxy(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
            String strM85550b = m85550b(context);
            int iM85546a = m85546a(context);
            if (!TextUtils.isEmpty(strM85550b) && iM85546a >= 0) {
                return new C14545a(strM85550b, iM85546a);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0156  */
    /* JADX WARN: Code duplicated, block: B:46:0x0164 A[LOOP:0: B:13:0x00b8->B:46:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015c A[SYNTHETIC] */
    public static JSONObject request(QQToken qQToken, Context context, String str, Bundle bundle, String str2) throws JSONException, IOException, HttpStatusException, NetworkUnavailableException {
        String str3;
        String str4;
        int i;
        long jMo85406c;
        long jMo85405b;
        int i2;
        SLog.m85492i("openSDK_LOG.HttpUtils", "OpenApi request");
        if (!C14559n.m85671b(context)) {
            throw new NetworkUnavailableException(NetworkUnavailableException.ERROR_INFO);
        }
        if (str.toLowerCase().startsWith("http")) {
            str3 = str;
            str4 = str3;
        } else {
            str3 = C14556k.m85609a().m85610a(context, "https://openmobile.qq.com/") + str;
            str4 = C14556k.m85609a().m85610a(context, "https://openmobile.qq.com/") + str;
        }
        m85549a(context, qQToken, str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iM85607a = C14555j.m85598a(context, qQToken.getAppId()).m85607a("Common_HttpRetryCount");
        SLog.m85496v("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + iM85607a + "   appid:" + qQToken.getAppId() + "     url:" + str4);
        if (iM85607a == 0) {
            iM85607a = 3;
        }
        int i3 = iM85607a;
        SLog.m85496v("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + i3 + "   appid:" + qQToken.getAppId() + "     url:" + str4);
        int i4 = 0;
        JSONObject jSONObject = null;
        while (true) {
            int i5 = i4 + 1;
            try {
                try {
                    try {
                        InterfaceC14519g interfaceC14519gM85547a = m85547a(str3, str2, bundle);
                        int iMo85407d = interfaceC14519gM85547a.mo85407d();
                        SLog.m85492i("openSDK_LOG.HttpUtils", "request statusCode " + iMo85407d);
                        if (iMo85407d != 200) {
                            C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, iMo85407d);
                            throw new HttpStatusException(iMo85407d);
                        }
                        JSONObject jSONObjectM85678d = C14559n.m85678d(interfaceC14519gM85547a.mo85404a());
                        try {
                            try {
                                i2 = jSONObjectM85678d.getInt("ret");
                            } catch (JSONException unused) {
                                i2 = -4;
                            }
                            jSONObject = jSONObjectM85678d;
                            i = i2;
                            jMo85406c = interfaceC14519gM85547a.mo85406c();
                            jMo85405b = interfaceC14519gM85547a.mo85405b();
                        } catch (SocketTimeoutException e) {
                            e = e;
                            jSONObject = jSONObjectM85678d;
                            e.printStackTrace();
                            i = -8;
                            jMo85406c = 0;
                            jMo85405b = 0;
                            if (i5 < i3) {
                                C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, -8);
                                throw e;
                            }
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (i5 < i3) {
                                i4 = i5;
                            }
                        }
                        C14529h.m85459a().m85462a(str4, jElapsedRealtime, jMo85406c, jMo85405b, i);
                        return jSONObject;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, -4);
                        throw e2;
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                }
                if (i5 < i3) {
                    C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, -8);
                    throw e;
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
                if (i5 < i3) {
                    C14529h.m85459a().m85462a(str4, jElapsedRealtime, jMo85406c, jMo85405b, i);
                    return jSONObject;
                }
                i4 = i5;
            } catch (MalformedURLException e4) {
                e4.printStackTrace();
                C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, -3);
                throw e4;
            } catch (IOException e5) {
                e5.printStackTrace();
                C14529h.m85459a().m85462a(str4, jElapsedRealtime, 0L, 0L, getErrorCodeFromException(e5));
                throw e5;
            }
            e.printStackTrace();
            i = -8;
            jMo85406c = 0;
            jMo85405b = 0;
        }
    }

    public static void requestAsync(final QQToken qQToken, final Context context, final String str, final Bundle bundle, final String str2, final IRequestListener iRequestListener) {
        SLog.m85492i("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
        C14558m.m85637a(new Runnable() { // from class: com.tencent.open.utils.HttpUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObjectRequest = HttpUtils.request(qQToken, context, str, bundle, str2);
                    IRequestListener iRequestListener2 = iRequestListener;
                    if (iRequestListener2 != null) {
                        iRequestListener2.onComplete(jSONObjectRequest);
                        SLog.m85492i("openSDK_LOG.HttpUtils", "OpenApi onComplete");
                    }
                } catch (HttpStatusException e) {
                    IRequestListener iRequestListener3 = iRequestListener;
                    if (iRequestListener3 != null) {
                        iRequestListener3.onHttpStatusException(e);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onHttpStatusException" + e.toString());
                    }
                } catch (NetworkUnavailableException e2) {
                    IRequestListener iRequestListener4 = iRequestListener;
                    if (iRequestListener4 != null) {
                        iRequestListener4.onNetworkUnavailableException(e2);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onNetworkUnavailableException" + e2.toString());
                    }
                } catch (MalformedURLException e3) {
                    IRequestListener iRequestListener5 = iRequestListener;
                    if (iRequestListener5 != null) {
                        iRequestListener5.onMalformedURLException(e3);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync MalformedURLException" + e3.toString());
                    }
                } catch (SocketTimeoutException e4) {
                    IRequestListener iRequestListener6 = iRequestListener;
                    if (iRequestListener6 != null) {
                        iRequestListener6.onSocketTimeoutException(e4);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onSocketTimeoutException" + e4.toString());
                    }
                } catch (IOException e5) {
                    IRequestListener iRequestListener7 = iRequestListener;
                    if (iRequestListener7 != null) {
                        iRequestListener7.onIOException(e5);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync IOException" + e5.toString());
                    }
                } catch (JSONException e6) {
                    IRequestListener iRequestListener8 = iRequestListener;
                    if (iRequestListener8 != null) {
                        iRequestListener8.onJSONException(e6);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync JSONException" + e6.toString());
                    }
                } catch (Exception e7) {
                    IRequestListener iRequestListener9 = iRequestListener;
                    if (iRequestListener9 != null) {
                        iRequestListener9.onUnknowException(e7);
                        SLog.m85490e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onUnknowException" + e7.toString());
                    }
                }
            }
        });
    }

    public static class HttpStatusException extends Exception {
        public static final String ERROR_INFO = "http status code error:";
        public final int statusCode;

        public HttpStatusException(int i) {
            super(ERROR_INFO + i);
            this.statusCode = i;
        }

        public HttpStatusException(String str) {
            super(str);
            this.statusCode = -1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m85550b(Context context) {
        return System.getProperty("http.proxyHost");
    }

    public static String encodeUrl(Bundle bundle) {
        return encodeUrl(m85548a(bundle));
    }

    /* JADX INFO: renamed from: a */
    private static void m85549a(Context context, QQToken qQToken, String str) {
        if (str.indexOf("add_share") > -1 || str.indexOf("upload_pic") > -1 || str.indexOf("add_topic") > -1 || str.indexOf("set_user_face") > -1 || str.indexOf("add_t") > -1 || str.indexOf("add_pic_t") > -1 || str.indexOf("add_pic_url") > -1 || str.indexOf("add_video") > -1) {
            C13966a.m83169a(context, qQToken, "requireApi", str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m85548a(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null && bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (!(obj instanceof String) && !(obj instanceof String[])) {
                    SLog.m85498w("openSDK_LOG.HttpUtils", "parseBundleToMap: the type " + obj.getClass() + " is unsupported");
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strArr.length; i++) {
                        if (i != 0) {
                            sb.append(Constants.SEPARATOR_COMMA);
                        }
                        sb.append(strArr[i]);
                    }
                    map.put(str, sb.toString());
                } else {
                    map.put(str, (String) obj);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static int m85546a(Context context) {
        String property = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property)) {
            return -1;
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
