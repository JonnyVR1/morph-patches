package p153l;

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
public class iol extends mm2 {

    /* JADX INFO: renamed from: a */
    private final SSLSocketFactory f116179a;

    /* JADX INFO: renamed from: l.iol$a */
    public static class C17762a extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private final HttpURLConnection f116180a;

        public C17762a(HttpURLConnection httpURLConnection) {
            super(iol.m141339j(httpURLConnection));
            this.f116180a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f116180a.disconnect();
        }
    }

    /* JADX INFO: renamed from: l.iol$b */
    public interface InterfaceC17763b {
    }

    public iol(InterfaceC17763b interfaceC17763b, SSLSocketFactory sSLSocketFactory) {
        this.f116179a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: c */
    private void m141335c(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(m141344h(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* JADX INFO: renamed from: d */
    private void m141336d(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            m141335c(httpURLConnection, request, body);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static List<yzk> m141337e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new yzk(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m141338i(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static InputStream m141339j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX INFO: renamed from: k */
    private HttpURLConnection m141340k(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionM141342f = m141342f(url);
        int timeoutMs = request.getTimeoutMs();
        httpURLConnectionM141342f.setConnectTimeout(timeoutMs);
        httpURLConnectionM141342f.setReadTimeout(timeoutMs);
        httpURLConnectionM141342f.setUseCaches(false);
        httpURLConnectionM141342f.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f116179a) != null) {
            ((HttpsURLConnection) httpURLConnectionM141342f).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionM141342f;
    }

    @Override // p153l.mm2
    /* JADX INFO: renamed from: a */
    public bnl mo141341a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(request.getHeaders());
        HttpURLConnection httpURLConnectionM141340k = m141340k(new URL(url), request);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionM141340k.setRequestProperty(str, (String) map2.get(str));
            }
            m141345l(httpURLConnectionM141340k, request);
            int responseCode = httpURLConnectionM141340k.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (m141338i(request.getMethod(), responseCode)) {
                return new bnl(responseCode, m141337e(httpURLConnectionM141340k.getHeaderFields()), httpURLConnectionM141340k.getContentLength(), m141343g(request, httpURLConnectionM141340k));
            }
            bnl bnlVar = new bnl(responseCode, m141337e(httpURLConnectionM141340k.getHeaderFields()));
            httpURLConnectionM141340k.disconnect();
            return bnlVar;
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionM141340k.disconnect();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public HttpURLConnection m141342f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: g */
    public InputStream m141343g(Request<?> request, HttpURLConnection httpURLConnection) {
        return new C17762a(httpURLConnection);
    }

    /* JADX INFO: renamed from: h */
    public OutputStream m141344h(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* JADX INFO: renamed from: l */
    public void m141345l(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m141335c(httpURLConnection, request, postBody);
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m141336d(httpURLConnection, request);
                break;
            case 2:
                httpURLConnection.setRequestMethod(HttpMethods.PUT);
                m141336d(httpURLConnection, request);
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
                m141336d(httpURLConnection, request);
                break;
            default:
                wtq0.m207906a("Unknown method type.");
                break;
        }
    }

    public iol(InterfaceC17763b interfaceC17763b) {
        this(interfaceC17763b, null);
    }

    public iol() {
        this(null);
    }
}
