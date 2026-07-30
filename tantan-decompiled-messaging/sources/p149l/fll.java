package p149l;

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
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fll implements l4c<InputStream> {

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    static final InterfaceC16876b f98190g = new C16875a();

    /* JADX INFO: renamed from: a */
    private final n1k f98191a;

    /* JADX INFO: renamed from: b */
    private final int f98192b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16876b f98193c;

    /* JADX INFO: renamed from: d */
    private HttpURLConnection f98194d;

    /* JADX INFO: renamed from: e */
    private InputStream f98195e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f98196f;

    /* JADX INFO: renamed from: l.fll$a */
    public static class C16875a implements InterfaceC16876b {
        @Override // p149l.fll.InterfaceC16876b
        /* JADX INFO: renamed from: a */
        public HttpURLConnection mo122080a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: l.fll$b */
    public interface InterfaceC16876b {
        /* JADX INFO: renamed from: a */
        HttpURLConnection mo122080a(URL url) throws IOException;
    }

    @VisibleForTesting
    public fll(n1k n1kVar, int i, InterfaceC16876b interfaceC16876b) {
        this.f98191a = n1kVar;
        this.f98192b = i;
        this.f98193c = interfaceC16876b;
    }

    /* JADX INFO: renamed from: b */
    private InputStream m122076b(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f98195e = u06.m191287e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                httpURLConnection.getContentEncoding();
            }
            this.f98195e = httpURLConnection.getInputStream();
        }
        return this.f98195e;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m122077c(int i) {
        return i / 100 == 2;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m122078e(int i) {
        return i / 100 == 3;
    }

    /* JADX INFO: renamed from: f */
    private InputStream m122079f(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f98194d = this.f98193c.mo122080a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f98194d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f98194d.setConnectTimeout(this.f98192b);
        this.f98194d.setReadTimeout(this.f98192b);
        this.f98194d.setUseCaches(false);
        this.f98194d.setDoInput(true);
        this.f98194d.setInstanceFollowRedirects(false);
        this.f98194d.connect();
        this.f98195e = this.f98194d.getInputStream();
        if (this.f98196f) {
            return null;
        }
        int responseCode = this.f98194d.getResponseCode();
        if (m122077c(responseCode)) {
            return m122076b(this.f98194d);
        }
        if (!m122078e(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f98194d.getResponseMessage(), responseCode);
        }
        String headerField = this.f98194d.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        cleanup();
        return m122079f(url3, i + 1, url, map);
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo103356a() {
        return InputStream.class;
    }

    @Override // p149l.l4c
    public void cancel() {
        this.f98196f = true;
    }

    @Override // p149l.l4c
    public void cleanup() {
        InputStream inputStream = this.f98195e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f98194d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f98194d = null;
    }

    @Override // p149l.l4c
    /* JADX INFO: renamed from: d */
    public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super InputStream> interfaceC18148a) {
        long jM147808b = kxv.m147808b();
        try {
            interfaceC18148a.mo5407b(m122079f(this.f98191a.m157376h(), 0, null, this.f98191a.m157375e()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            interfaceC18148a.mo5408c(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                kxv.m147807a(jM147808b);
            }
        }
    }

    @Override // p149l.l4c
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    public fll(n1k n1kVar, int i) {
        this(n1kVar, i, f98190g);
    }
}
