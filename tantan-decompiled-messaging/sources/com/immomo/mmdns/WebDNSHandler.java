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
import org.eclipse.jetty.http.MimeTypes;
import p149l.exc0;
import p149l.gxc0;
import p149l.hyx;
import p149l.ii5;
import p149l.k850;
import p149l.o3f;
import p149l.stc0;
import p149l.sx3;
import p149l.upk0;
import p149l.utc0;

/* JADX INFO: loaded from: classes7.dex */
public class WebDNSHandler {
    static k850 client;
    public static o3f.InterfaceC18833b outEventFactroy;
    static WebConfig webConfig = new WebConfig();
    public static RedirectLog locationLog = new RedirectLog() { // from class: com.immomo.mmdns.WebDNSHandler.1
        @Override // com.immomo.mmdns.WebDNSHandler.RedirectLog
        public void log(String str, String str2, exc0 exc0Var) {
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
                MDLog.m7392e(LogTag.DNS, "WebDNSHandler ip %s -> host %s", str, this.originHost);
            } catch (SSLException e) {
                MDLog.printErrStackTrace(LogTag.DNS, e, "WebDNSHandler host=%s, cns=%s, subjectAlts=%s", str, Arrays.toString(strArr), Arrays.toString(strArr2));
                throw e;
            }
        }
    }

    public interface RedirectLog {
        void log(String str, String str2, exc0 exc0Var);
    }

    public static class WebDnsEventFactory implements o3f.InterfaceC18833b {
        WebDnsEventListener webDnsEventListener = new WebDnsEventListener();

        @Override // p149l.o3f.InterfaceC18833b
        public o3f create(sx3 sx3Var) {
            o3f.InterfaceC18833b interfaceC18833b = WebDNSHandler.outEventFactroy;
            return new WebDnsEventListenerWrapper(interfaceC18833b != null ? interfaceC18833b.create(sx3Var) : null, this.webDnsEventListener);
        }
    }

    public static class WebDnsEventListener extends o3f {
        private final Object lock;
        private LruCache<String, String> requestRecords;

        private WebDnsEventListener() {
            this.requestRecords = new LruCache<>(100);
            this.lock = new Object();
        }

        private void recordFailed(sx3 sx3Var) {
            String strRemove;
            try {
                String strM107522m = sx3Var.request().m185881k().m107522m();
                if (WebDNSHandler.isSupportDns(strM107522m)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(strM107522m + Constants.PACKNAME_END + sx3Var.hashCode());
                    }
                    MDDNSEntrance.getInstance().requestFailedForDomain(strM107522m, strRemove);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
            }
        }

        private void recordSuccess(sx3 sx3Var) {
            String strRemove;
            try {
                String strM107522m = sx3Var.request().m185881k().m107522m();
                if (WebDNSHandler.isSupportDns(strM107522m)) {
                    synchronized (this.lock) {
                        strRemove = this.requestRecords.remove(strM107522m + Constants.PACKNAME_END + sx3Var.hashCode());
                    }
                    MDDNSEntrance.getInstance().requestSucceedForDomain(strM107522m, strRemove);
                }
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
            }
        }

        @Override // p149l.o3f
        public void callFailed(sx3 sx3Var, IOException iOException) {
            MDLog.m7396i(LogTag.DNS, "callFailed call %s exception:%s ", sx3Var, iOException);
            recordFailed(sx3Var);
        }

        @Override // p149l.o3f
        public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            super.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
            MDLog.m7395i(LogTag.DNS, "connectFailed call %s");
            recordFailed(sx3Var);
        }

        @Override // p149l.o3f
        public void dnsEnd(sx3 sx3Var, String str, List<InetAddress> list) {
            MDLog.m7396i(LogTag.DNS, "dnsEnd call %s domainName:%s AddressList:%s", sx3Var, str, list);
            if (!WebDNSHandler.isSupportDns(str) || list == null || list.size() <= 0) {
                return;
            }
            String hostAddress = list.get(0).getHostAddress();
            synchronized (this.lock) {
                this.requestRecords.put(str + Constants.PACKNAME_END + sx3Var.hashCode(), hostAddress);
            }
        }

        @Override // p149l.o3f
        public void dnsStart(sx3 sx3Var, String str) {
            MDLog.m7396i(LogTag.DNS, "dnsStart call %s domainName:%s", sx3Var, str);
        }

        @Override // p149l.o3f
        public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
            int iM118609q = exc0Var.m118609q();
            if (iM118609q != 404 && iM118609q >= 400 && iM118609q <= 599) {
                recordFailed(sx3Var);
            } else {
                if (iM118609q < 200 || iM118609q > 299) {
                    return;
                }
                recordSuccess(sx3Var);
            }
        }
    }

    static {
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        client = c17954b.m144899t(10L, timeUnit).m144885f(5L, timeUnit).m144903x(10L, timeUnit).m144892m(false).m144891l(new WebDnsEventFactory()).m144889j(new MMOkHttpDns()).m144882c();
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

    public static String getLocationUrl(byte[] bArr, String str) throws Exception {
        stc0.C20027a c20027aM185899r;
        URL url = new URL(str);
        String host = url.getHost();
        MDLog.m7389d(LogTag.DNS, "getLocationUrl Url: " + str);
        if (bArr != null) {
            c20027aM185899r = new stc0.C20027a().m185893l(utc0.create(hyx.m133628d(MimeTypes.FORM_ENCODED), bArr)).m185899r(url);
        } else {
            c20027aM185899r = new stc0.C20027a().m185887f().m185899r(url);
        }
        addHeaders(c20027aM185899r, null, host);
        exc0 exc0VarExecute = client.mo144849a(c20027aM185899r.m185883b()).execute();
        int iM118609q = exc0VarExecute.m118609q();
        if (!needRedirect(iM118609q)) {
            upk0.m194883a("cannot get location");
            return null;
        }
        String strM118611u = exc0VarExecute.m118611u("Location");
        if (strM118611u == null) {
            strM118611u = exc0VarExecute.m118611u("location");
        }
        if (strM118611u == null) {
            upk0.m194883a("cannot get location");
            return null;
        }
        if (!strM118611u.startsWith("http://") && !strM118611u.startsWith("https://")) {
            strM118611u = url.getProtocol() + "://" + host + strM118611u;
        }
        MDLog.m7395i(LogTag.DNS, "code:" + iM118609q + "; location:" + strM118611u + "; path:" + str);
        setCookie(exc0VarExecute, Uri.parse(strM118611u).getHost());
        return strM118611u;
    }

    @Deprecated
    public static String getLocationUrlByUrlConnection(byte[] bArr, String str) throws Exception {
        URL url = new URL(str);
        String host = url.getHost();
        String strReplaceFirst = str.replaceFirst(host, MDDNSEntrance.getInstance().getUsableHost(host));
        MDLog.m7389d(LogTag.DNS, "oldUrl: " + str + " newUrl: " + strReplaceFirst + " from HTTPDNS successfully!");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strReplaceFirst).openConnection();
        String cookie = CookieManager.getInstance().getCookie(host);
        if (!TextUtils.isEmpty(cookie)) {
            httpURLConnection.setRequestProperty("Cookie", cookie);
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
            upk0.m194883a("cannot get location");
            return null;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        if (headerField == null) {
            headerField = httpURLConnection.getHeaderField("location");
        }
        if (headerField == null) {
            upk0.m194883a("cannot get location");
            return null;
        }
        if (!headerField.startsWith("http://") && !headerField.startsWith("https://")) {
            headerField = url.getProtocol() + "://" + host + headerField;
        }
        MDLog.m7391e(LogTag.DNS, "code:" + responseCode + "; location:" + headerField + "; path:" + str);
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
                    MDLog.m7392e(LogTag.DNS, "this url not support DNS ————> no config %s", string);
                    return null;
                }
                String method = webResourceRequest.getMethod();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String scheme = url.getScheme();
                if ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || !method.equalsIgnoreCase("get")) {
                    MDLog.m7392e(LogTag.DNS, "this url not support DNS ————> non http/get %s", string);
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                exc0 exc0VarRecursiveRequest = recursiveRequest(bArr, webView, string, requestHeaders, sb);
                if (!exc0VarRecursiveRequest.m118597I()) {
                    MDLog.m7392e(LogTag.DNS, "this url not support DNS ————> response failed %d, %s", Integer.valueOf(exc0VarRecursiveRequest.m118609q()), string);
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
                        StringBuilder sb2 = new StringBuilder();
                        int i = 0;
                        if (listM118594B.size() > 1) {
                            Iterator<String> it2 = listM118594B.iterator();
                            while (it2.hasNext()) {
                                sb2.append(it2.next());
                                if (i != listM118594B.size() - 1) {
                                    sb2.append(Constants.PACKNAME_END);
                                }
                                i++;
                            }
                        } else {
                            sb2.append(listM118594B.get(0));
                        }
                        map.put(str, sb2.toString());
                    }
                }
                webResourceResponse.setResponseHeaders(map);
                recordFailed(sb, true);
                return webResourceResponse;
            }
            MDLog.m7392e(LogTag.DNS, "this url not support DNS ————> mp4 or mp3 %s", string);
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
        exc0 exc0VarExecute = client.mo144849a(c20027aM185899r.m185883b()).execute();
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
        MDLog.m7395i(LogTag.DNS, "code:" + iM118609q + "; location:" + strM118611u + "; path:" + str);
        Uri uri = Uri.parse(strM118611u);
        setCookie(exc0VarExecute, uri.getHost());
        final Object obj = new Object();
        String string = exc0VarExecute.m118606k().contentType().toString();
        RedirectLog redirectLog = locationLog;
        if (redirectLog != null) {
            redirectLog.log(str, strM118611u, exc0VarExecute);
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
                                        webView2.loadUrl("javascript:window.location.replace(\"" + strM118611u + "\")");
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

    private static void setCookie(HttpURLConnection httpURLConnection, String str) {
        List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                CookieManager.getInstance().setCookie(str, it.next());
            }
        }
    }

    private static void setCookie(exc0 exc0Var, String str) {
        Iterator<String> it = exc0Var.m118594B("Set-Cookie").iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(str, it.next());
        }
    }

    @TargetApi(21)
    public static WebResourceResponse handleInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ii5.m136335e(null, webView, webResourceRequest);
    }
}
