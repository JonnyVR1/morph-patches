package p153l;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class unl implements t5c<InputStream> {

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    static final InterfaceC20604b f179740g = new C20603a();

    /* JADX INFO: renamed from: a */
    private final e4k f179741a;

    /* JADX INFO: renamed from: b */
    private final int f179742b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC20604b f179743c;

    /* JADX INFO: renamed from: d */
    private HttpURLConnection f179744d;

    /* JADX INFO: renamed from: e */
    private InputStream f179745e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f179746f;

    /* JADX INFO: renamed from: l.unl$a */
    public static class C20603a implements InterfaceC20604b {
        @Override // p153l.unl.InterfaceC20604b
        /* JADX INFO: renamed from: a */
        public HttpURLConnection mo196879a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: l.unl$b */
    public interface InterfaceC20604b {
        /* JADX INFO: renamed from: a */
        HttpURLConnection mo196879a(URL url) throws IOException;
    }

    @VisibleForTesting
    public unl(e4k e4kVar, int i, InterfaceC20604b interfaceC20604b) {
        this.f179741a = e4kVar;
        this.f179742b = i;
        this.f179743c = interfaceC20604b;
    }

    /* JADX INFO: renamed from: b */
    private HttpURLConnection m196873b(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo196879a = this.f179743c.mo196879a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionMo196879a.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionMo196879a.setConnectTimeout(this.f179742b);
            httpURLConnectionMo196879a.setReadTimeout(this.f179742b);
            httpURLConnectionMo196879a.setUseCaches(false);
            httpURLConnectionMo196879a.setDoInput(true);
            httpURLConnectionMo196879a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo196879a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m196874c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private InputStream m196875e(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f179745e = z16.m218278e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f179745e = httpURLConnection.getInputStream();
            }
            return this.f179745e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m196874c(httpURLConnection), e);
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m196876f(int i) {
        return i / 100 == 2;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m196877g(int i) {
        return i / 100 == 3;
    }

    /* JADX INFO: renamed from: h */
    private InputStream m196878h(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionM196873b = m196873b(url, map);
        this.f179744d = httpURLConnectionM196873b;
        try {
            httpURLConnectionM196873b.connect();
            this.f179745e = this.f179744d.getInputStream();
            if (this.f179746f) {
                return null;
            }
            int iM196874c = m196874c(this.f179744d);
            if (m196876f(iM196874c)) {
                return m196875e(this.f179744d);
            }
            if (!m196877g(iM196874c)) {
                if (iM196874c == -1) {
                    throw new HttpException(iM196874c);
                }
                try {
                    throw new HttpException(this.f179744d.getResponseMessage(), iM196874c);
                } catch (IOException e) {
                    throw new HttpException("Failed to get a response message", iM196874c, e);
                }
            }
            String headerField = this.f179744d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM196874c);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return m196878h(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new HttpException("Bad redirect url: " + headerField, iM196874c, e2);
            }
        } catch (IOException e3) {
            throw new HttpException("Failed to connect or obtain data", m196874c(this.f179744d), e3);
        }
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo106029a() {
        return InputStream.class;
    }

    @Override // p153l.t5c
    public void cancel() {
        this.f179746f = true;
    }

    @Override // p153l.t5c
    public void cleanup() {
        InputStream inputStream = this.f179745e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f179744d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f179744d = null;
    }

    @Override // p153l.t5c
    /* JADX INFO: renamed from: d */
    public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super InputStream> interfaceC20239a) {
        long jM142879b = izv.m142879b();
        try {
            interfaceC20239a.mo5432b(m196878h(this.f179741a.m119435h(), 0, null, this.f179741a.m119434e()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            interfaceC20239a.mo5433c(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                izv.m142878a(jM142879b);
            }
        }
    }

    @Override // p153l.t5c
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    public unl(e4k e4kVar, int i) {
        this(e4kVar, i, f179740g);
    }
}
