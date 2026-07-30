package p149l;

import androidx.annotation.VisibleForTesting;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes.dex */
public class wll extends em2 {

    /* JADX INFO: renamed from: a */
    private final SSLSocketFactory f186960a;

    /* JADX INFO: renamed from: l.wll$a */
    public static class C20888a extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final HttpURLConnection f186961a;

        public C20888a(HttpURLConnection httpURLConnection) {
            super(wll.m203828j(httpURLConnection));
            this.f186961a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f186961a.disconnect();
        }
    }

    /* JADX INFO: renamed from: l.wll$b */
    public interface InterfaceC20889b {
    }

    public wll(InterfaceC20889b interfaceC20889b, SSLSocketFactory sSLSocketFactory) {
        this.f186960a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: c */
    private void m203824c(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(m203832h(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* JADX INFO: renamed from: d */
    private void m203825d(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            m203824c(httpURLConnection, request, body);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static List<ixk> m203826e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new ixk(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m203827i(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static InputStream m203828j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX INFO: renamed from: k */
    private HttpURLConnection m203829k(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionM203830f = m203830f(url);
        int timeoutMs = request.getTimeoutMs();
        httpURLConnectionM203830f.setConnectTimeout(timeoutMs);
        httpURLConnectionM203830f.setReadTimeout(timeoutMs);
        httpURLConnectionM203830f.setUseCaches(false);
        httpURLConnectionM203830f.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f186960a) != null) {
            ((HttpsURLConnection) httpURLConnectionM203830f).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionM203830f;
    }

    @Override // p149l.em2
    /* JADX INFO: renamed from: a */
    public okl mo117198a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(request.getHeaders());
        HttpURLConnection httpURLConnectionM203829k = m203829k(new URL(url), request);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionM203829k.setRequestProperty(str, (String) map2.get(str));
            }
            m203833l(httpURLConnectionM203829k, request);
            int responseCode = httpURLConnectionM203829k.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (m203827i(request.getMethod(), responseCode)) {
                return new okl(responseCode, m203826e(httpURLConnectionM203829k.getHeaderFields()), httpURLConnectionM203829k.getContentLength(), m203831g(request, httpURLConnectionM203829k));
            }
            okl oklVar = new okl(responseCode, m203826e(httpURLConnectionM203829k.getHeaderFields()));
            httpURLConnectionM203829k.disconnect();
            return oklVar;
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionM203829k.disconnect();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public HttpURLConnection m203830f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: g */
    public InputStream m203831g(Request<?> request, HttpURLConnection httpURLConnection) {
        return new C20888a(httpURLConnection);
    }

    /* JADX INFO: renamed from: h */
    public OutputStream m203832h(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* JADX INFO: renamed from: l */
    public void m203833l(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m203824c(httpURLConnection, request, postBody);
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m203825d(httpURLConnection, request);
                break;
            case 2:
                httpURLConnection.setRequestMethod(HttpMethods.PUT);
                m203825d(httpURLConnection, request);
                break;
            case 3:
                httpURLConnection.setRequestMethod(HttpMethods.DELETE);
                break;
            case 4:
                httpURLConnection.setRequestMethod(HttpMethods.HEAD);
                break;
            case 5:
                httpURLConnection.setRequestMethod(HttpMethods.OPTIONS);
                break;
            case 6:
                httpURLConnection.setRequestMethod(HttpMethods.TRACE);
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m203825d(httpURLConnection, request);
                break;
            default:
                qkq0.m175383a("Unknown method type.");
                break;
        }
    }

    public wll(InterfaceC20889b interfaceC20889b) {
        this(interfaceC20889b, null);
    }

    public wll() {
        this(null);
    }
}
