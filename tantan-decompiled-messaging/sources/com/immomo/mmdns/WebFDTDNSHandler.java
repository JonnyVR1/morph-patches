package com.immomo.mmdns;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.cosmos.mdlog.MDLog;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.eclipse.jetty.http.MimeTypes;
import p149l.exc0;
import p149l.gxc0;
import p149l.hyx;
import p149l.k850;
import p149l.o3f;
import p149l.stc0;
import p149l.sx3;
import p149l.upk0;
import p149l.utc0;

/* JADX INFO: loaded from: classes7.dex */
public class WebFDTDNSHandler {
    private static final String TAG = "WebFDTDNSHandler";
    private static k850 client;

    public static class UnSafeTrustManager implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static class WebDnsEventListener extends o3f {
        private WebDnsEventListener() {
        }

        @Override // p149l.o3f
        public void callFailed(sx3 sx3Var, IOException iOException) {
            MDLog.m7396i(WebFDTDNSHandler.TAG, "callFailed call %s exception:%s ", sx3Var, iOException);
        }

        @Override // p149l.o3f
        public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            super.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
            MDLog.m7395i(WebFDTDNSHandler.TAG, "connectFailed call %s");
        }

        @Override // p149l.o3f
        public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
            MDLog.m7396i(WebFDTDNSHandler.TAG, "dnsEnd call %s domainName:%s AddressList:%s", sx3Var, str, list);
        }

        @Override // p149l.o3f
        public void dnsStart(sx3 sx3Var, String str) {
            MDLog.m7396i(WebFDTDNSHandler.TAG, "fdt dnsStart call %s domainName:%s", sx3Var, str);
        }

        @Override // p149l.o3f
        public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
            MDLog.m7396i(WebFDTDNSHandler.TAG, "responseHeadersEnd code:%d", Integer.valueOf(exc0Var.m118609q()));
        }
    }

    private static void addHeaders(stc0.C20027a c20027a, Map<String, String> map, String str) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c20027a.m185882a(entry.getKey(), entry.getValue());
            }
        }
        if (map == null || !map.containsKey("Cookie")) {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (TextUtils.isEmpty(cookie)) {
                return;
            }
            c20027a.m185882a("Cookie", cookie);
        }
    }

    private static boolean containCookie(Set<String> set) {
        if (set == null) {
            return false;
        }
        for (String str : set) {
            if (!TextUtils.isEmpty(str) && str.contains("Cookie")) {
                return true;
            }
        }
        return false;
    }

    private static String getCharset(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(Constants.PACKNAME_END);
        if (strArrSplit.length <= 1) {
            return null;
        }
        String str2 = strArrSplit[1];
        if (str2.contains("=")) {
            return str2.substring(str2.indexOf("=") + 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k850 getClient() {
        if (client == null) {
            k850.C17954b c17954b = new k850.C17954b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            k850.C17954b c17954bM144894o = c17954b.m144899t(10L, timeUnit).m144885f(5L, timeUnit).m144903x(10L, timeUnit).m144892m(false).m144894o(new HostnameVerifier() { // from class: com.immomo.mmdns.WebFDTDNSHandler.2
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
            SSLSocketFactory socketFactory = null;
            k850.C17954b c17954bM144889j = c17954bM144894o.m144890k(new WebDnsEventListener()).m144889j(new WebFDTHttpDns());
            TrustManager[] trustManagerArr = {new UnSafeTrustManager()};
            try {
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                socketFactory = sSLContext.getSocketFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (socketFactory != null) {
                c17954bM144889j.m144902w(socketFactory, (X509TrustManager) trustManagerArr[0]);
            }
            client = c17954bM144889j.m144882c();
        }
        return client;
    }

    private static String getMime(String str) {
        if (str == null) {
            return null;
        }
        return str.split(Constants.PACKNAME_END)[0];
    }

    @TargetApi(21)
    public static WebResourceResponse handleInterceptRequest(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest) {
        try {
            Uri url = webResourceRequest.getUrl();
            String string = url.toString();
            if (!string.contains(".mp4") && !string.contains(".mp3")) {
                String method = webResourceRequest.getMethod();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String scheme = url.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (method.equalsIgnoreCase("get")) {
                        exc0 exc0VarRecursiveRequest = recursiveRequest(bArr, webView, string, requestHeaders, new StringBuilder());
                        if (!exc0VarRecursiveRequest.m118597I()) {
                            MDLog.m7392e(TAG, "this url not support DNS ————> response failed %d, %s", Integer.valueOf(exc0VarRecursiveRequest.m118609q()), string);
                            return null;
                        }
                        gxc0 gxc0VarM118606k = exc0VarRecursiveRequest.m118606k();
                        String string2 = (gxc0VarM118606k == null || gxc0VarM118606k.contentType() == null) ? null : gxc0VarM118606k.contentType().toString();
                        String mime = getMime(string2);
                        String charset = getCharset(string2);
                        Set<String> setM166557g = exc0VarRecursiveRequest.m118595F().m166557g();
                        if (containCookie(setM166557g)) {
                            Iterator<String> it = exc0VarRecursiveRequest.m118594B("Set-Cookie").iterator();
                            while (it.hasNext()) {
                                CookieManager.getInstance().setCookie(url.getHost(), it.next());
                            }
                        }
                        if (TextUtils.isEmpty(charset)) {
                            charset = "UTF-8";
                        }
                        WebResourceResponse webResourceResponse = new WebResourceResponse(mime, charset, gxc0VarM118606k.byteStream());
                        webResourceResponse.setStatusCodeAndReasonPhrase(exc0VarRecursiveRequest.m118609q() == 304 ? 200 : exc0VarRecursiveRequest.m118609q(), "OK");
                        HashMap map = new HashMap(exc0VarRecursiveRequest.m118595F().m166559k());
                        for (String str : setM166557g) {
                            List<String> listM118594B = exc0VarRecursiveRequest.m118594B(str);
                            if (listM118594B.size() > 0) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                if (listM118594B.size() > 1) {
                                    Iterator<String> it2 = listM118594B.iterator();
                                    while (it2.hasNext()) {
                                        sb.append(it2.next());
                                        if (i != listM118594B.size() - 1) {
                                            sb.append(Constants.PACKNAME_END);
                                        }
                                        i++;
                                    }
                                } else {
                                    sb.append(listM118594B.get(0));
                                }
                                map.put(str, sb.toString());
                            }
                        }
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                }
                MDLog.m7392e(TAG, "this url not support DNS ————> non http/get %s", string);
                return null;
            }
            MDLog.m7392e(TAG, "this url not support DNS ————> mp4 or mp3 %s", string);
            return null;
        } catch (Exception e) {
            MDLog.printErrStackTrace(TAG, e);
            return null;
        }
    }

    private static boolean needRedirect(int i) {
        return i != 304 && i >= 300 && i < 400;
    }

    private static exc0 recursiveRequest(byte[] bArr, final WebView webView, String str, Map<String, String> map, StringBuilder sb) throws Exception {
        stc0.C20027a c20027aM185899r;
        URL url = new URL(str);
        String host = url.getHost();
        if (bArr != null) {
            c20027aM185899r = new stc0.C20027a().m185893l(utc0.create(hyx.m133628d(MimeTypes.FORM_ENCODED), bArr)).m185899r(url);
        } else {
            c20027aM185899r = new stc0.C20027a().m185887f().m185899r(url);
        }
        addHeaders(c20027aM185899r, map, host);
        exc0 exc0VarExecute = getClient().mo144849a(c20027aM185899r.m185883b()).execute();
        int iM118609q = exc0VarExecute.m118609q();
        if (!needRedirect(iM118609q)) {
            setCookie(exc0VarExecute, host);
            return exc0VarExecute;
        }
        final String strM118611u = exc0VarExecute.m118611u("Location");
        if (strM118611u == null) {
            strM118611u = exc0VarExecute.m118611u("Location");
        }
        if (strM118611u == null) {
            upk0.m194883a("cannot get location");
            return null;
        }
        if (!strM118611u.startsWith("http://") && !strM118611u.startsWith("https://")) {
            strM118611u = url.getProtocol() + "://" + host + strM118611u;
        }
        MDLog.m7395i(TAG, "code:" + iM118609q + "; location:" + strM118611u + "; path:" + str);
        Uri uri = Uri.parse(strM118611u);
        setCookie(exc0VarExecute, uri.getHost());
        final Object obj = new Object();
        String string = exc0VarExecute.m118606k().contentType().toString();
        synchronized (obj) {
            try {
                if (!TextUtils.isEmpty(string) && string.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) && !TextUtils.equals(uri.getPath(), url.getPath())) {
                    MomoMainThreadExecutor.post(new Runnable() { // from class: com.immomo.mmdns.WebFDTDNSHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WebView webView2 = webView;
                            if (webView2 != null) {
                                webView2.loadUrl("javascript:window.location.replace(\"" + strM118611u + "\")");
                                synchronized (obj) {
                                    obj.notifyAll();
                                }
                            }
                        }
                    });
                    obj.wait(3000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return recursiveRequest(null, webView, strM118611u, map, sb);
    }

    private static void setCookie(exc0 exc0Var, String str) {
        Iterator<String> it = exc0Var.m118594B("Set-Cookie").iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(str, it.next());
        }
    }
}
