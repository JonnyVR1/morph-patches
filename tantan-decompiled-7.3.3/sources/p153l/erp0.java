package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.immomo.mmdns.LogTag;
import com.meituan.robust.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes7.dex */
public class erp0 {

    /* JADX INFO: renamed from: a */
    static xqp0 f95490a = new xqp0();

    /* JADX INFO: renamed from: b */
    static int f95491b = 99999;

    /* JADX INFO: renamed from: c */
    public static InterfaceC16816f f95492c = new C16811a();

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static boolean f95493d = rs8.m182912c();

    /* JADX INFO: renamed from: l.erp0$a */
    public class C16811a implements InterfaceC16816f {
        @Override // p153l.erp0.InterfaceC16816f
        /* JADX INFO: renamed from: a */
        public void mo122255a(String str, String str2, jvl jvlVar) {
            MKCoreLogManager.m18427e().m18451n(str, str2, jvlVar);
        }
    }

    /* JADX INFO: renamed from: l.erp0$b */
    public class RunnableC16812b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f95494a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f95495b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f95496c;

        public RunnableC16812b(WebView webView, String str, Object obj) {
            this.f95494a = webView;
            this.f95495b = str;
            this.f95496c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f95494a;
            if (webView != null) {
                webView.loadUrl("javascript:window.location.replace(\"" + this.f95495b + "\")");
                synchronized (this.f95496c) {
                    this.f95496c.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.erp0$c */
    public class RunnableC16813c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f95497a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f95498b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f95499c;

        public RunnableC16813c(WebView webView, String str, Object obj) {
            this.f95497a = webView;
            this.f95498b = str;
            this.f95499c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f95497a;
            if (webView != null) {
                webView.loadUrl("javascript:window.location.replace(\"" + this.f95498b + "\")");
                synchronized (this.f95499c) {
                    this.f95499c.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.erp0$d */
    public class RunnableC16814d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f95500a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f95501b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f95502c;

        public RunnableC16814d(WebView webView, String str, Object obj) {
            this.f95500a = webView;
            this.f95501b = str;
            this.f95502c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f95500a;
            if (webView != null) {
                webView.loadUrl("javascript:window.location.replace(\"" + this.f95501b + "\")");
                synchronized (this.f95502c) {
                    this.f95502c.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.erp0$e */
    public class RunnableC16815e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f95503a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f95504b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f95505c;

        public RunnableC16815e(WebView webView, String str, Object obj) {
            this.f95503a = webView;
            this.f95504b = str;
            this.f95505c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f95503a;
            if (webView != null) {
                webView.loadUrl("javascript:window.location.replace(\"" + this.f95504b + "\")");
                synchronized (this.f95505c) {
                    this.f95505c.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.erp0$f */
    public interface InterfaceC16816f {
        /* JADX INFO: renamed from: a */
        void mo122255a(String str, String str2, jvl jvlVar);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m122241a(List<String> list) {
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
    private static String m122242b(String str) {
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
    private static ivl m122243c() {
        ivl ivlVarM130602a = gkw.m130601b().m130602a();
        if (ivlVarM130602a != null) {
            return ivlVarM130602a;
        }
        wtq0.m207906a("请初始化IDnsHttpClient");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m122244d(byte[] bArr, String str, String str2) throws Exception {
        return m122245e(bArr, str, str2);
    }

    /* JADX INFO: renamed from: e */
    private static String m122245e(byte[] bArr, String str, String str2) throws Exception {
        String strMo167945d;
        URL url = new URL(str);
        String host = url.getHost();
        jzv.m147728a(LogTag.DNS, "getLocationUrl Url: " + str);
        ivl ivlVarM122243c = m122243c();
        String str3 = (MKConfigSetter.m17757e() == null || (strMo167945d = MKConfigSetter.m17757e().mo167945d(str, str2)) == null) ? str : strMo167945d;
        jvl jvlVarMo115349e = bArr != null ? ivlVarM122243c.mo115349e(str3, bArr, null, host, null) : ivlVarM122243c.mo115350f(str3, null, null, host);
        int simpleCode = jvlVarMo115349e.getSimpleCode();
        if (!m122251k(simpleCode)) {
            azk0.m101074a("cannot get location");
            return null;
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
        jzv.m147732e(LogTag.DNS, "code:" + simpleCode + "; location:" + header + "; path:" + str);
        m122253m(jvlVarMo115349e, Uri.parse(header).getHost());
        return header;
    }

    /* JADX INFO: renamed from: f */
    private static String m122246f(String str) {
        if (str == null) {
            return null;
        }
        return str.split(Constants.PACKNAME_END)[0];
    }

    /* JADX INFO: renamed from: g */
    public static WebResourceResponse m122247g(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest, String str) {
        return m122248h(bArr, webView, webResourceRequest, str);
    }

    /* JADX INFO: renamed from: h */
    private static WebResourceResponse m122248h(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest, String str) {
        try {
            if (m122249i(webResourceRequest)) {
                return null;
            }
            Uri url = webResourceRequest.getUrl();
            String string = url.toString();
            jvl jvlVarM122252l = m122252l(bArr, webView, string, webResourceRequest.getRequestHeaders(), new StringBuilder(), str);
            if (!jvlVarM122252l.isSuccessful() && jvlVarM122252l.getSimpleCode() != f95491b) {
                jzv.m147729b(LogTag.DNS, String.format("this url not support DNS ————> response failed %d, %s", Integer.valueOf(jvlVarM122252l.getSimpleCode()), string));
                return null;
            }
            String simpleContentType = jvlVarM122252l.getCachedContentType();
            String strM122246f = m122246f(simpleContentType);
            String strM122242b = m122242b(simpleContentType);
            List<String> headerNames = jvlVarM122252l.getHeaderNames();
            if (m122241a(headerNames)) {
                Iterator<String> it = jvlVarM122252l.getHeaders(HttpHeaders.SET_COOKIE).iterator();
                while (it.hasNext()) {
                    CookieManager.getInstance().setCookie(url.getHost(), it.next());
                }
            }
            if (jvlVarM122252l.getSimpleCode() == f95491b) {
                return new WebResourceResponse(MimeTypes.TEXT_PLAIN, "utf-8", 200, "OK", new HashMap(), new ByteArrayInputStream(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.getBytes()));
            }
            InputStream simpleBodyStream = jvlVarM122252l.getSimpleBodyStream();
            if (simpleBodyStream == null) {
                return null;
            }
            if (TextUtils.isEmpty(strM122242b)) {
                strM122242b = "UTF-8";
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(strM122246f, strM122242b, simpleBodyStream);
            webResourceResponse.setStatusCodeAndReasonPhrase(jvlVarM122252l.getSimpleCode() == 304 ? 200 : jvlVarM122252l.getSimpleCode(), "OK");
            HashMap map = new HashMap(headerNames.size());
            for (String str2 : headerNames) {
                List<String> headers = jvlVarM122252l.getHeaders(str2);
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
        } catch (Exception e) {
            jzv.m147730c(LogTag.DNS, "", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m122249i(WebResourceRequest webResourceRequest) {
        try {
            if (webResourceRequest == null) {
                jzv.m147729b(LogTag.DNS, "this url not support DNS ————> non request");
                return true;
            }
            Uri url = webResourceRequest.getUrl();
            String string = url.toString();
            if (!string.contains(".mp4") && !string.contains(".mp3")) {
                String method = webResourceRequest.getMethod();
                String scheme = url.getScheme();
                if (("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) && method.equalsIgnoreCase("get")) {
                    return false;
                }
                jzv.m147729b(LogTag.DNS, String.format("this url not support DNS ————> non http/get %s", string));
                return true;
            }
            jzv.m147729b(LogTag.DNS, String.format("this url not support DNS ————> mp4 or mp3 %s", string));
            return true;
        } catch (Exception e) {
            jzv.m147730c(LogTag.DNS, "", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m122250j(URL url) {
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

    /* JADX INFO: renamed from: k */
    private static boolean m122251k(int i) {
        return i != 304 && i >= 300 && i < 400;
    }

    /* JADX INFO: renamed from: l */
    private static jvl m122252l(byte[] bArr, WebView webView, String str, Map<String, String> map, StringBuilder sb, String str2) throws Exception {
        String strMo167945d;
        URL url = new URL(str);
        String host = url.getHost();
        ivl ivlVarM122243c = m122243c();
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
        jvl jvlVarMo115349e = bArr != null ? ivlVarM122243c.mo115349e(strMo167945d, bArr, map2, host, null) : ivlVarM122243c.mo115350f(strMo167945d, map2, null, host);
        int simpleCode = jvlVarMo115349e.getSimpleCode();
        if (!m122251k(simpleCode)) {
            m122253m(jvlVarMo115349e, host);
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
        jzv.m147732e(LogTag.DNS, "code:" + simpleCode + "; location:" + str3 + "; path:" + str);
        Uri uri = Uri.parse(str3);
        m122253m(jvlVarMo115349e, uri.getHost());
        Object obj = new Object();
        String simpleContentType = jvlVarMo115349e.getCachedContentType();
        InterfaceC16816f interfaceC16816f = f95492c;
        if (interfaceC16816f != null) {
            interfaceC16816f.mo122255a(str, str3, jvlVarMo115349e);
        }
        if (rs8.m182926q()) {
            synchronized (obj) {
                try {
                    if (f95493d) {
                        if (str.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) || m122250j(url)) {
                            if (!TextUtils.isEmpty(simpleContentType) && simpleContentType.toLowerCase().contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) && !TextUtils.equals(uri.getPath(), url.getPath())) {
                                x310.m209186d(new RunnableC16812b(webView, str3, obj));
                                obj.wait(3000L);
                                return m122254n(jvlVarMo115349e);
                            }
                        }
                    } else if (f95490a.m212738a(webView, url, uri, simpleContentType)) {
                        x310.m209186d(new RunnableC16813c(webView, str3, obj));
                        obj.wait(3000L);
                        return m122254n(jvlVarMo115349e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            synchronized (obj) {
                try {
                    if (f95493d) {
                        if (str.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) || m122250j(url)) {
                            if (!TextUtils.isEmpty(simpleContentType) && simpleContentType.contains(com.clevertap.android.sdk.Constants.INAPP_HTML_TAG) && !TextUtils.equals(uri.getPath(), url.getPath())) {
                                x310.m209186d(new RunnableC16814d(webView, str3, obj));
                                obj.wait(3000L);
                            }
                        }
                    } else if (f95490a.m212738a(webView, url, uri, simpleContentType)) {
                        x310.m209186d(new RunnableC16815e(webView, str3, obj));
                        obj.wait(3000L);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return m122252l(null, webView, str3, map, sb, str2);
    }

    /* JADX INFO: renamed from: m */
    private static void m122253m(jvl jvlVar, String str) {
        Iterator<String> it = jvlVar.getHeaders(HttpHeaders.SET_COOKIE).iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(str, it.next());
        }
    }

    /* JADX INFO: renamed from: n */
    private static jvl m122254n(jvl jvlVar) {
        return m122243c().mo115347c(f95491b, jvlVar.getSimpleMessage()).mo111520a(new ByteArrayInputStream(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.getBytes())).setContentType(MimeTypes.TEXT_PLAIN).mo111521b(jvlVar.getBodyString()).build();
    }
}
