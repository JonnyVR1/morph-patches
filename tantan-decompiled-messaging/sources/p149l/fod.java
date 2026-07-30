package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.tencent.ugc.TXRecordCommon;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class fod extends si2 implements a5c {

    /* JADX INFO: renamed from: e */
    public final boolean f98530e;

    /* JADX INFO: renamed from: f */
    public final int f98531f;

    /* JADX INFO: renamed from: g */
    public final int f98532g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f98533h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final akl f98534i;

    /* JADX INFO: renamed from: j */
    public final akl f98535j;

    /* JADX INFO: renamed from: k */
    public final boolean f98536k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public oh80<String> f98537l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C2047a f98538m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public HttpURLConnection f98539n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public InputStream f98540o;

    /* JADX INFO: renamed from: p */
    public boolean f98541p;

    /* JADX INFO: renamed from: q */
    public int f98542q;

    /* JADX INFO: renamed from: r */
    public long f98543r;

    /* JADX INFO: renamed from: s */
    public long f98544s;

    /* JADX INFO: renamed from: l.fod$b */
    public static final class C16893b implements a5c.InterfaceC15531a {

        /* JADX INFO: renamed from: b */
        @Nullable
        public l7j0 f98546b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public oh80<String> f98547c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f98548d;

        /* JADX INFO: renamed from: g */
        public boolean f98551g;

        /* JADX INFO: renamed from: h */
        public boolean f98552h;

        /* JADX INFO: renamed from: a */
        public final akl f98545a = new akl();

        /* JADX INFO: renamed from: e */
        public int f98549e = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        /* JADX INFO: renamed from: f */
        public int f98550f = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        @Override // p149l.a5c.InterfaceC15531a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public fod mo95019a() {
            fod fodVar = new fod(this.f98548d, this.f98549e, this.f98550f, this.f98551g, this.f98545a, this.f98547c, this.f98552h);
            l7j0 l7j0Var = this.f98546b;
            if (l7j0Var != null) {
                fodVar.mo11123e(l7j0Var);
            }
            return fodVar;
        }

        /* JADX INFO: renamed from: c */
        public C16893b m122447c(@Nullable l7j0 l7j0Var) {
            this.f98546b = l7j0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16893b m122448d(@Nullable String str) {
            this.f98548d = str;
            return this;
        }
    }

    public fod(@Nullable String str, int i, int i2, boolean z, @Nullable akl aklVar, @Nullable oh80<String> oh80Var, boolean z2) {
        super(true);
        this.f98533h = str;
        this.f98531f = i;
        this.f98532g = i2;
        this.f98530e = z;
        this.f98534i = aklVar;
        this.f98537l = oh80Var;
        this.f98535j = new akl();
        this.f98536k = z2;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m122437w(HttpURLConnection httpURLConnection) {
        return HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* JADX INFO: renamed from: z */
    public static void m122438z(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = vck0.f180948a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) p11.m167011e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A */
    public HttpURLConnection m122439A(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: B */
    public final int m122440B(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f98543r;
        if (j != -1) {
            long j2 = j - this.f98544s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) vck0.m197866j(this.f98540o)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f98544s += (long) i3;
        m184310q(i3);
        return i3;
    }

    /* JADX INFO: renamed from: C */
    public final void m122441C(long j, C2047a c2047a) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) vck0.m197866j(this.f98540o)).read(bArr, 0, (int) Math.min(j, 4096L));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), c2047a, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(c2047a, 2008, 1);
            }
            j -= (long) i;
            m184310q(i);
        }
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        HttpURLConnection httpURLConnection = this.f98539n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> mo11122b() {
        HttpURLConnection httpURLConnection = this.f98539n;
        return httpURLConnection == null ? ImmutableMap.m15715of() : new C16894c(httpURLConnection.getHeaderFields());
    }

    @Override // p149l.a5c
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f98540o;
            if (inputStream != null) {
                long j = this.f98543r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f98544s;
                }
                m122438z(this.f98539n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource$HttpDataSourceException(e, (C2047a) vck0.m197866j(this.f98538m), 2000, 3);
                }
            }
            this.f98540o = null;
            m122442u();
            if (this.f98541p) {
                this.f98541p = false;
                m184311r();
            }
        } catch (Throwable th) {
            this.f98540o = null;
            m122442u();
            if (this.f98541p) {
                this.f98541p = false;
                m184311r();
            }
            throw th;
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(final C2047a c2047a) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrM197856f1;
        this.f98538m = c2047a;
        long j = 0;
        this.f98544s = 0L;
        this.f98543r = 0L;
        m184312s(c2047a);
        try {
            HttpURLConnection httpURLConnectionM122444x = m122444x(c2047a);
            this.f98539n = httpURLConnectionM122444x;
            this.f98542q = httpURLConnectionM122444x.getResponseCode();
            String responseMessage = httpURLConnectionM122444x.getResponseMessage();
            int i = this.f98542q;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM122444x.getHeaderFields();
                if (this.f98542q == 416) {
                    if (c2047a.f9498g == kll.m146419c(httpURLConnectionM122444x.getHeaderField("Content-Range"))) {
                        this.f98541p = true;
                        m184313t(c2047a);
                        long j2 = c2047a.f9499h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM122444x.getErrorStream();
                try {
                    bArrM197856f1 = errorStream != null ? vck0.m197856f1(errorStream) : vck0.f180953f;
                } catch (IOException unused) {
                    bArrM197856f1 = vck0.f180953f;
                }
                byte[] bArr = bArrM197856f1;
                m122442u();
                throw new HttpDataSource$InvalidResponseCodeException(this.f98542q, responseMessage, this.f98542q == 416 ? new DataSourceException(2008) : null, headerFields, c2047a, bArr);
            }
            final String contentType = httpURLConnectionM122444x.getContentType();
            oh80<String> oh80Var = this.f98537l;
            if (oh80Var != null && !oh80Var.apply(contentType)) {
                m122442u();
                throw new HttpDataSource$HttpDataSourceException(contentType, c2047a) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super("Invalid content type: " + contentType, c2047a, 2003, 1);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.f98542q == 200) {
                long j3 = c2047a.f9498g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zM122437w = m122437w(httpURLConnectionM122444x);
            if (zM122437w) {
                this.f98543r = c2047a.f9499h;
            } else {
                long j4 = c2047a.f9499h;
                if (j4 != -1) {
                    this.f98543r = j4;
                } else {
                    long jM146418b = kll.m146418b(httpURLConnectionM122444x.getHeaderField("Content-Length"), httpURLConnectionM122444x.getHeaderField("Content-Range"));
                    this.f98543r = jM146418b != -1 ? jM146418b - j : -1L;
                }
            }
            try {
                this.f98540o = httpURLConnectionM122444x.getInputStream();
                if (zM122437w) {
                    this.f98540o = new GZIPInputStream(this.f98540o);
                }
                this.f98541p = true;
                m184313t(c2047a);
                try {
                    m122441C(j, c2047a);
                    return this.f98543r;
                } catch (IOException e) {
                    m122442u();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, c2047a, 2000, 1);
                }
            } catch (IOException e2) {
                m122442u();
                throw new HttpDataSource$HttpDataSourceException(e2, c2047a, 2000, 1);
            }
        } catch (IOException e3) {
            m122442u();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e3, c2047a, 1);
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return m122440B(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.createForIOException(e, (C2047a) vck0.m197866j(this.f98538m), 2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m122442u() {
        HttpURLConnection httpURLConnection = this.f98539n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                jwv.m143684d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f98539n = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final URL m122443v(URL url, @Nullable String str, C2047a c2047a) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", c2047a, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, c2047a, 2001, 1);
            }
            if (this.f98530e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c2047a, 2001, 1);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, c2047a, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: x */
    public final HttpURLConnection m122444x(C2047a c2047a) throws IOException {
        URL url = new URL(c2047a.f9492a.toString());
        int i = c2047a.f9494c;
        byte[] bArr = c2047a.f9495d;
        long j = c2047a.f9498g;
        long j2 = c2047a.f9499h;
        int i2 = 1;
        boolean zM12105d = c2047a.m12105d(1);
        if (!this.f98530e && !this.f98536k) {
            return m122445y(url, i, bArr, j, j2, zM12105d, true, c2047a.f9496e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i4), c2047a, 2001, 1);
            }
            HttpURLConnection httpURLConnectionM122445y = m122445y(url, i, bArr, j, j2, zM12105d, false, c2047a.f9496e);
            int responseCode = httpURLConnectionM122445y.getResponseCode();
            String headerField = httpURLConnectionM122445y.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM122445y.disconnect();
                url = m122443v(url, headerField, c2047a);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM122445y;
                }
                httpURLConnectionM122445y.disconnect();
                if (!this.f98536k || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = m122443v(url, headerField, c2047a);
            }
            i3 = i4;
            i2 = 1;
        }
    }

    /* JADX INFO: renamed from: y */
    public final HttpURLConnection m122445y(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionM122439A = m122439A(url);
        httpURLConnectionM122439A.setConnectTimeout(this.f98531f);
        httpURLConnectionM122439A.setReadTimeout(this.f98532g);
        HashMap map2 = new HashMap();
        akl aklVar = this.f98534i;
        if (aklVar != null) {
            map2.putAll(aklVar.m97155a());
        }
        map2.putAll(this.f98535j.m97155a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM122439A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM146417a = kll.m146417a(j, j2);
        if (strM146417a != null) {
            httpURLConnectionM122439A.setRequestProperty("Range", strM146417a);
        }
        String str = this.f98533h;
        if (str != null) {
            httpURLConnectionM122439A.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM122439A.setRequestProperty("Accept-Encoding", z ? HttpHeaderValues.GZIP : "identity");
        httpURLConnectionM122439A.setInstanceFollowRedirects(z2);
        httpURLConnectionM122439A.setDoOutput(bArr != null);
        httpURLConnectionM122439A.setRequestMethod(C2047a.m12102c(i));
        if (bArr == null) {
            httpURLConnectionM122439A.connect();
            return httpURLConnectionM122439A;
        }
        httpURLConnectionM122439A.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionM122439A.connect();
        OutputStream outputStream = httpURLConnectionM122439A.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionM122439A;
    }

    /* JADX INFO: renamed from: l.fod$c */
    public static class C16894c extends xzi<String, List<String>> {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<String>> f98553a;

        public C16894c(Map<String, List<String>> map) {
            this.f98553a = map;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m122449a(String str) {
            return str != null;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m122450c(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // p149l.xzi, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // p149l.xzi, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // p149l.xzi, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.m16117b(super.entrySet(), new oh80() { // from class: l.hod
                @Override // p149l.oh80
                public final boolean apply(Object obj) {
                    return fod.C16894c.m122450c((Map.Entry) obj);
                }
            });
        }

        @Override // p149l.xzi, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // p149l.xzi, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // p149l.xzi, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // p149l.xzi, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // p149l.xzi, java.util.Map
        public Set<String> keySet() {
            return Sets.m16117b(super.keySet(), new oh80() { // from class: l.god
                @Override // p149l.oh80
                public final boolean apply(Object obj) {
                    return fod.C16894c.m122449a((String) obj);
                }
            });
        }

        @Override // p149l.xzi, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // p149l.xzi, p149l.a0j
        public Map<String, List<String>> delegate() {
            return this.f98553a;
        }
    }

    @Deprecated
    public fod() {
        this(null, TXRecordCommon.AUDIO_SAMPLERATE_8000, TXRecordCommon.AUDIO_SAMPLERATE_8000);
    }

    @Deprecated
    public fod(@Nullable String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public fod(@Nullable String str, int i, int i2, boolean z, @Nullable akl aklVar) {
        this(str, i, i2, z, aklVar, null, false);
    }
}
