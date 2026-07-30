package com.immomo.mmdns;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.cosmos.mdlog.MDLog;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import okhttp3.Protocol;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;
import p153l.azk0;
import p153l.e7y;
import p153l.i5d0;
import p153l.jj5;
import p153l.k5d0;
import p153l.rg50;
import p153l.ry3;
import p153l.t4f;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: loaded from: classes7.dex */
public class WebDNSHandler {
    static rg50 client;
    public static t4f.InterfaceC20235b outEventFactroy;
    static WebConfig webConfig = new WebConfig();
    public static RedirectLog locationLog = new RedirectLog() { // from class: com.immomo.mmdns.WebDNSHandler.1
        @Override // com.immomo.mmdns.WebDNSHandler.RedirectLog
        public void log(String str, String str2, i5d0 i5d0Var) {
        }
    };
    public static boolean enableOnlyHtmlRedirect = false;

    public static class MyHostnameVerifier extends AbstractVerifier {
        private String originHost;

        public MyHostnameVerifier(String str) {
            this.originHost = str;
        }

        @Override // org.apache.http.conn.ssl.X509HostnameVerifier
        public void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
            try {
                if (TextUtils.isEmpty(this.originHost)) {
                    verify(str, strArr, strArr2, true);
                } else {
                    verify(this.originHost, strArr, strArr2, true);
                }
                MDLog.m7446e(LogTag.DNS, "WebDNSHandler ip %s -> host %s", str, this.originHost);
            } catch (SSLException e) {
                MDLog.printErrStackTrace(LogTag.DNS, e, "WebDNSHandler host=%s, cns=%s, subjectAlts=%s", str, Arrays.toString(strArr), Arrays.toString(strArr2));
                throw e;
            }
        }
    }

    public interface RedirectLog {
        void log(String str, String str2, i5d0 i5d0Var);
    }

    public static class WebDnsEventFactory implements t4f.InterfaceC20235b {
        WebDnsEventListener webDnsEventListener = new WebDnsEventListener();

        @Override // p153l.t4f.InterfaceC20235b
        public t4f create(ry3 ry3Var) {
            t4f.InterfaceC20235b interfaceC20235b = WebDNSHandler.outEventFactroy;
            return new WebDnsEventListenerWrapper(interfaceC20235b != null ? interfaceC20235b.create(ry3Var) : null, this.webDnsEventListener);
        }
    }

    public static class WebDnsEventListener extends t4f {
        private final Object lock;
        private LruCache<String, String> requestRecords;

        private WebDnsEventListener() {
            this.requestRecords = new LruCache<>(100);
            this.lock = new Object();
        }

        private void recordFailed(ry3 ry3Var) {
            String strRemove;
            try {
                String strM182286m = ry3Var.request().m209026k().m182286m();
                if (WebDNSHandler.isSupportDns(strM182286m)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(strM182286m + Constants.PACKNAME_END + ry3Var.hashCode());
                    }
                    MDDNSEntrance.getInstance().requestFailedForDomain(strM182286m, strRemove);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
            }
        }

        private void recordSuccess(ry3 ry3Var) {
            String strRemove;
            try {
                String strM182286m = ry3Var.request().m209026k().m182286m();
                if (WebDNSHandler.isSupportDns(strM182286m)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(strM182286m + Constants.PACKNAME_END + ry3Var.hashCode());
                    }
                    MDDNSEntrance.getInstance().requestSucceedForDomain(strM182286m, strRemove);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
            }
        }

        @Override // p153l.t4f
        public void callFailed(ry3 ry3Var, IOException iOException) {
            MDLog.m7450i(LogTag.DNS, "callFailed call %s exception:%s ", ry3Var, iOException);
            recordFailed(ry3Var);
        }

        @Override // p153l.t4f
        public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            super.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
            MDLog.m7449i(LogTag.DNS, "connectFailed call %s");
            recordFailed(ry3Var);
        }

        @Override // p153l.t4f
        public void dnsEnd(ry3 ry3Var, String str, List<InetAddress> list) {
            MDLog.m7450i(LogTag.DNS, "dnsEnd call %s domainName:%s AddressList:%s", ry3Var, str, list);
            if (!WebDNSHandler.isSupportDns(str) || list == null || list.size() <= 0) {
                return;
            }
            String hostAddress = list.get(0).getHostAddress();
            synchronized (this.lock) {
                this.requestRecords.put(str + Constants.PACKNAME_END + ry3Var.hashCode(), hostAddress);
            }
        }

        @Override // p153l.t4f
        public void dnsStart(ry3 ry3Var, String str) {
            MDLog.m7450i(LogTag.DNS, "dnsStart call %s domainName:%s", ry3Var, str);
        }

        @Override // p153l.t4f
        public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
            int iM138673q = i5d0Var.m138673q();
            if (iM138673q != 404 && iM138673q >= 400 && iM138673q <= 599) {
                recordFailed(ry3Var);
            } else {
                if (iM138673q < 200 || iM138673q > 299) {
                    return;
                }
                recordSuccess(ry3Var);
            }
        }
    }

    static {
        rg50.C19837b c19837b = new rg50.C19837b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        client = c19837b.m181383u(10L, timeUnit).m181368f(5L, timeUnit).m181387y(10L, timeUnit).m181375m(false).m181374l(new WebDnsEventFactory()).m181372j(new MMOkHttpDns()).m181365c();
    }

    private static void addHeaders(x1d0.C21228a c21228a, Map<String, String> map, String str) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c21228a.m209027a(entry.getKey(), entry.getValue());
            }
        }
        if (map == null || !map.containsKey(HttpHeaders.COOKIE)) {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (TextUtils.isEmpty(cookie)) {
                return;
            }
            c21228a.m209027a(HttpHeaders.COOKIE, cookie);
        }
    }

    private static boolean containCookie(Set<String> set) {
        if (set == null) {
            return false;
        }
        for (String str : set) {
            if (!TextUtils.isEmpty(str) && str.contains(HttpHeaders.COOKIE)) {
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

    public static String getLocationUrl(byte[] bArr, String str) throws Exception {
        x1d0.C21228a c21228aM209044r;
        URL url = new URL(str);
        String host = url.getHost();
        MDLog.m7443d(LogTag.DNS, "getLocationUrl Url: " + str);
        if (bArr != null) {
            c21228aM209044r = new x1d0.C21228a().m209038l(z1d0.create(e7y.m119773d(MimeTypes.FORM_ENCODED), bArr)).m209044r(url);
        } else {
            c21228aM209044r = new x1d0.C21228a().m209032f().m209044r(url);
        }
        addHeaders(c21228aM209044r, null, host);
        i5d0 i5d0VarExecute = client.mo181341a(c21228aM209044r.m209028b()).execute();
        int iM138673q = i5d0VarExecute.m138673q();
        if (!needRedirect(iM138673q)) {
            azk0.m101074a("cannot get location");
            return null;
        }
        String strM138675u = i5d0VarExecute.m138675u("Location");
        if (strM138675u == null) {
            strM138675u = i5d0VarExecute.m138675u("location");
        }
        if (strM138675u == null) {
            azk0.m101074a("cannot get location");
            return null;
        }
        if (!strM138675u.startsWith("http://") && !strM138675u.startsWith("https://")) {
            strM138675u = url.getProtocol() + "://" + host + strM138675u;
        }
        MDLog.m7449i(LogTag.DNS, "code:" + iM138673q + "; location:" + strM138675u + "; path:" + str);
        setCookie(i5d0VarExecute, Uri.parse(strM138675u).getHost());
        return strM138675u;
    }

    @Deprecated
    public static String getLocationUrlByUrlConnection(byte[] bArr, String str) throws Exception {
        URL url = new URL(str);
        String host = url.getHost();
        String strReplaceFirst = str.replaceFirst(host, MDDNSEntrance.getInstance().getUsableHost(host));
        MDLog.m7443d(LogTag.DNS, "oldUrl: " + str + " newUrl: " + strReplaceFirst + " from HTTPDNS successfully!");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strReplaceFirst).openConnection();
        String cookie = CookieManager.getInstance().getCookie(host);
        if (!TextUtils.isEmpty(cookie)) {
            httpURLConnection.setRequestProperty(HttpHeaders.COOKIE, cookie);
        }
        httpURLConnection.setRequestProperty("Host", host);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setInstanceFollowRedirects(false);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SNISocketFactory sNISocketFactory = new SNISocketFactory(httpURLConnection.getRequestProperty("Host"), null, null);
            sNISocketFactory.enableConfigureTlsExtensions();
            httpsURLConnection.setSSLSocketFactory(sNISocketFactory);
            httpsURLConnection.setHostnameVerifier(new MyHostnameVerifier(host));
        }
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.getOutputStream().write(bArr);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (!needRedirect(responseCode)) {
            azk0.m101074a("cannot get location");
            return null;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        if (headerField == null) {
            headerField = httpURLConnection.getHeaderField("location");
        }
        if (headerField == null) {
            azk0.m101074a("cannot get location");
            return null;
        }
        if (!headerField.startsWith("http://") && !headerField.startsWith("https://")) {
            headerField = url.getProtocol() + "://" + host + headerField;
        }
        MDLog.m7445e(LogTag.DNS, "code:" + responseCode + "; location:" + headerField + "; path:" + str);
        setCookie(httpURLConnection, Uri.parse(headerField).getHost());
        return headerField;
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
                if (!isSupportDns(url.getHost())) {
                    MDLog.m7446e(LogTag.DNS, "this url not support DNS ————> no config %s", string);
                    return null;
                }
                String method = webResourceRequest.getMethod();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String scheme = url.getScheme();
                if ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || !method.equalsIgnoreCase("get")) {
                    MDLog.m7446e(LogTag.DNS, "this url not support DNS ————> non http/get %s", string);
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                i5d0 i5d0VarRecursiveRequest = recursiveRequest(bArr, webView, string, requestHeaders, sb);
                if (!i5d0VarRecursiveRequest.m138661I()) {
                    MDLog.m7446e(LogTag.DNS, "this url not support DNS ————> response failed %d, %s", Integer.valueOf(i5d0VarRecursiveRequest.m138673q()), string);
                    return null;
                }
                k5d0 k5d0VarM138670k = i5d0VarRecursiveRequest.m138670k();
                String string2 = (k5d0VarM138670k == null || k5d0VarM138670k.contentType() == null) ? null : k5d0VarM138670k.contentType().toString();
                String mime = getMime(string2);
                String charset = getCharset(string2);
                Set<String> setM118876g = i5d0VarRecursiveRequest.m138659F().m118876g();
                if (containCookie(setM118876g)) {
                    Iterator<String> it = i5d0VarRecursiveRequest.m138658B(HttpHeaders.SET_COOKIE).iterator();
                    while (it.hasNext()) {
                        CookieManager.getInstance().setCookie(url.getHost(), it.next());
                    }
                }
                if (TextUtils.isEmpty(charset)) {
                    charset = "UTF-8";
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(mime, charset, k5d0VarM138670k.byteStream());
                webResourceResponse.setStatusCodeAndReasonPhrase(i5d0VarRecursiveRequest.m138673q() == 304 ? 200 : i5d0VarRecursiveRequest.m138673q(), "OK");
                HashMap map = new HashMap(i5d0VarRecursiveRequest.m138659F().m118878k());
                for (String str : setM118876g) {
                    List<String> listM138658B = i5d0VarRecursiveRequest.m138658B(str);
                    if (listM138658B.size() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        int i = 0;
                        if (listM138658B.size() > 1) {
                            Iterator<String> it2 = listM138658B.iterator();
                            while (it2.hasNext()) {
                                sb2.append(it2.next());
                                if (i != listM138658B.size() - 1) {
                                    sb2.append(Constants.PACKNAME_END);
                                }
                                i++;
                            }
                        } else {
                            sb2.append(listM138658B.get(0));
                        }
                        map.put(str, sb2.toString());
                    }
                }
                webResourceResponse.setResponseHeaders(map);
                recordFailed(sb, true);
                return webResourceResponse;
            }
            MDLog.m7446e(LogTag.DNS, "this url not support DNS ————> mp4 or mp3 %s", string);
            return null;
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
            return null;
        }
    }

    public static boolean isPathWithoutExtension(URL url) {
        try {
            String path = url.getPath();
            int iLastIndexOf = path.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return true;
            }
            return !path.substring(iLastIndexOf + 1).matches("[a-zA-Z0-9]+");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSupportDns(String str) {
        return MDDNSEntrance.getInstance().useDNS(str);
    }

    private static boolean needRedirect(int i) {
        return i != 304 && i >= 300 && i < 400;
    }

    private static void recordFailed(StringBuilder sb, boolean z) {
        if (sb != null) {
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(":");
            if (strArrSplit.length > 1) {
                if (z) {
                    MDDNSEntrance.getInstance().requestSucceedForDomain(strArrSplit[0], strArrSplit[1]);
                } else {
                    MDDNSEntrance.getInstance().requestFailedForDomain(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    private static i5d0 recursiveRequest(byte[] bArr, final WebView webView, String str, Map<String, String> map, StringBuilder sb) throws Exception {
        x1d0.C21228a c21228aM209044r;
        URL url = new URL(str);
        String host = url.getHost();
        if (bArr != null) {
            c21228aM209044r = new x1d0.C21228a().m209038l(z1d0.create(e7y.m119773d(MimeTypes.FORM_ENCODED), bArr)).m209044r(url);
        } else {
            c21228aM209044r = new x1d0.C21228a().m209032f().m209044r(url);
        }
        addHeaders(c21228aM209044r, map, host);
        i5d0 i5d0VarExecute = client.mo181341a(c21228aM209044r.m209028b()).execute();
        int iM138673q = i5d0VarExecute.m138673q();
        if (!needRedirect(iM138673q)) {
            setCookie(i5d0VarExecute, host);
            return i5d0VarExecute;
        }
        final String strM138675u = i5d0VarExecute.m138675u("Location");
        if (strM138675u == null) {
            strM138675u = i5d0VarExecute.m138675u("Location");
        }
        if (strM138675u == null) {
            azk0.m101074a("cannot get location");
            return null;
        }
        if (!strM138675u.startsWith("http://") && !strM138675u.startsWith("https://")) {
            strM138675u = url.getProtocol() + "://" + host + strM138675u;
        }
        MDLog.m7449i(LogTag.DNS, "code:" + iM138673q + "; location:" + strM138675u + "; path:" + str);
        Uri uri = Uri.parse(strM138675u);
        setCookie(i5d0VarExecute, uri.getHost());
        final Object obj = new Object();
        String string = i5d0VarExecute.m138670k().contentType().toString();
        RedirectLog redirectLog = locationLog;
        if (redirectLog != null) {
            redirectLog.log(str, strM138675u, i5d0VarExecute);
        }
        synchronized (obj) {
            try {
                if (enableOnlyHtmlRedirect) {
                    if (str.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) || isPathWithoutExtension(url)) {
                        if (!TextUtils.isEmpty(string) && string.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) && !TextUtils.equals(uri.getPath(), url.getPath())) {
                            MomoMainThreadExecutor.post(new Runnable() { // from class: com.immomo.mmdns.WebDNSHandler.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    WebView webView2 = webView;
                                    if (webView2 != null) {
                                        webView2.loadUrl("javascript:window.location.replace(\"" + strM138675u + "\")");
                                        synchronized (obj) {
                                            obj.notifyAll();
                                        }
                                    }
                                }
                            });
                            obj.wait(3000L);
                        }
                    }
                } else if (webConfig.canRedirect(webView, url, uri, string)) {
                    MomoMainThreadExecutor.post(new Runnable() { // from class: com.immomo.mmdns.WebDNSHandler.3
                        @Override // java.lang.Runnable
                        public void run() {
                            WebView webView2 = webView;
                            if (webView2 != null) {
                                webView2.loadUrl("javascript:window.location.replace(\"" + strM138675u + "\")");
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
        return recursiveRequest(null, webView, strM138675u, map, sb);
    }

    private static void setCookie(HttpURLConnection httpURLConnection, String str) {
        List<String> list = httpURLConnection.getHeaderFields().get(HttpHeaders.SET_COOKIE);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                CookieManager.getInstance().setCookie(str, it.next());
            }
        }
    }

    private static void setCookie(i5d0 i5d0Var, String str) {
        Iterator<String> it = i5d0Var.m138658B(HttpHeaders.SET_COOKIE).iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(str, it.next());
        }
    }

    @TargetApi(21)
    public static WebResourceResponse handleInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return jj5.m145011e(null, webView, webResourceRequest);
    }
}
