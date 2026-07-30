package p153l;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.meituan.robust.Constants;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes7.dex */
public class drp0 {

    /* JADX INFO: renamed from: l.drp0$a */
    public class RunnableC16611a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f90408a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f90409b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f90410c;

        public RunnableC16611a(WebView webView, String str, Object obj) {
            this.f90408a = webView;
            this.f90409b = str;
            this.f90410c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f90408a;
            if (webView != null) {
                webView.loadUrl("javascript:window.location.replace(\"" + this.f90409b + "\")");
                synchronized (this.f90410c) {
                    this.f90410c.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m117695a(List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.contains(HttpHeaders.COOKIE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static String m117696b(String str) {
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

    /* JADX INFO: renamed from: c */
    private static ivl m117697c() {
        ivl ivlVarM130602a = gkw.m130601b().m130602a();
        if (ivlVarM130602a != null) {
            return ivlVarM130602a;
        }
        wtq0.m207906a("请初始化IHttpClient");
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m117698d(String str) {
        if (str == null) {
            return null;
        }
        return str.split(Constants.PACKNAME_END)[0];
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: e */
    public static WebResourceResponse m117699e(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest, String str) {
        return m117700f(bArr, webView, webResourceRequest, str);
    }

    /* JADX INFO: renamed from: f */
    private static WebResourceResponse m117700f(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest, String str) {
        try {
            Uri url = webResourceRequest.getUrl();
            String string = url.toString();
            if (!string.contains(".mp4") && !string.contains(".mp3")) {
                String method = webResourceRequest.getMethod();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String scheme = url.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (method.equalsIgnoreCase("get")) {
                        jvl jvlVarM117702h = m117702h(bArr, webView, string, requestHeaders, new StringBuilder(), str);
                        if (!jvlVarM117702h.isSuccessful()) {
                            Log.e("WebFDTDNSHandler", String.format("this url not support DNS ————> response failed %d, %s", Integer.valueOf(jvlVarM117702h.getSimpleCode()), string));
                            return null;
                        }
                        String simpleContentType = jvlVarM117702h.getCachedContentType();
                        String strM117698d = m117698d(simpleContentType);
                        String strM117696b = m117696b(simpleContentType);
                        List<String> headerNames = jvlVarM117702h.getHeaderNames();
                        if (m117695a(headerNames)) {
                            Iterator<String> it = jvlVarM117702h.getHeaders(HttpHeaders.SET_COOKIE).iterator();
                            while (it.hasNext()) {
                                CookieManager.getInstance().setCookie(url.getHost(), it.next());
                            }
                        }
                        InputStream simpleBodyStream = jvlVarM117702h.getSimpleBodyStream();
                        if (simpleBodyStream == null) {
                            return null;
                        }
                        if (TextUtils.isEmpty(strM117696b)) {
                            strM117696b = "UTF-8";
                        }
                        WebResourceResponse webResourceResponse = new WebResourceResponse(strM117698d, strM117696b, simpleBodyStream);
                        webResourceResponse.setStatusCodeAndReasonPhrase(jvlVarM117702h.getSimpleCode() == 304 ? 200 : jvlVarM117702h.getSimpleCode(), "OK");
                        HashMap map = new HashMap(headerNames.size());
                        for (String str2 : headerNames) {
                            List<String> headers = jvlVarM117702h.getHeaders(str2);
                            if (headers.size() > 0) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                if (headers.size() > 1) {
                                    Iterator<String> it2 = headers.iterator();
                                    while (it2.hasNext()) {
                                        sb.append(it2.next());
                                        if (i != headers.size() - 1) {
                                            sb.append(Constants.PACKNAME_END);
                                        }
                                        i++;
                                    }
                                } else {
                                    sb.append(headers.get(0));
                                }
                                map.put(str2, sb.toString());
                            }
                        }
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                }
                Log.e("WebFDTDNSHandler", String.format("this url not support DNS ————> non http/get %s", string));
                return null;
            }
            Log.e("WebFDTDNSHandler", String.format("this url not support DNS ————> mp4 or mp3 %s", string));
            return null;
        } catch (Exception e) {
            Log.e("WebFDTDNSHandler", "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m117701g(int i) {
        return i != 304 && i >= 300 && i < 400;
    }

    /* JADX INFO: renamed from: h */
    private static jvl m117702h(byte[] bArr, WebView webView, String str, Map<String, String> map, StringBuilder sb, String str2) throws Exception {
        String strMo167945d;
        URL url = new URL(str);
        String host = url.getHost();
        ivl ivlVarM117697c = m117697c();
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        if (!map2.containsKey(HttpHeaders.COOKIE)) {
            String cookie = CookieManager.getInstance().getCookie(host);
            if (!TextUtils.isEmpty(cookie)) {
                map2.put(HttpHeaders.COOKIE, cookie);
            }
        }
        if (MKConfigSetter.m17757e() == null || (strMo167945d = MKConfigSetter.m17757e().mo167945d(str, str2)) == null) {
            strMo167945d = str;
        }
        jvl jvlVarMo115349e = bArr != null ? ivlVarM117697c.mo115349e(strMo167945d, bArr, map2, host, null) : ivlVarM117697c.mo115350f(strMo167945d, map2, null, host);
        if (!m117701g(jvlVarMo115349e.getSimpleCode())) {
            m117703i(jvlVarMo115349e, host);
            return jvlVarMo115349e;
        }
        String header = jvlVarMo115349e.getHeader("Location");
        if (header == null) {
            header = jvlVarMo115349e.getHeader("location");
        }
        if (header == null) {
            azk0.m101074a("cannot get location");
            return null;
        }
        if (!header.startsWith("http://") && !header.startsWith("https://")) {
            header = url.getProtocol() + "://" + host + header;
        }
        String str3 = header;
        try {
            if (!rs8.m182911b() && (str.contains(StringUtil.ALL_INTERFACES) || str3.contains(StringUtil.ALL_INTERFACES))) {
                HashMap<String, Object> map3 = new HashMap<>();
                map3.put("msg", str);
                MKCoreLogManager.m18427e().m18452o("WebFDTDNSHandler", str3, map3);
            }
        } catch (Exception unused) {
        }
        Uri uri = Uri.parse(str3);
        m117703i(jvlVarMo115349e, uri.getHost());
        Object obj = new Object();
        String simpleContentType = jvlVarMo115349e.getCachedContentType();
        synchronized (obj) {
            try {
                if (!TextUtils.isEmpty(simpleContentType) && simpleContentType.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) && !TextUtils.equals(uri.getPath(), url.getPath())) {
                    x310.m209186d(new RunnableC16611a(webView, str3, obj));
                    obj.wait(3000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m117702h(null, webView, str3, map, sb, str2);
    }

    /* JADX INFO: renamed from: i */
    private static void m117703i(jvl jvlVar, String str) {
        Iterator<String> it = jvlVar.getHeaders(HttpHeaders.SET_COOKIE).iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(str, it.next());
        }
    }
}
