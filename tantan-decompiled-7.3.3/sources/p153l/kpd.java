package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.C2070a;
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
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class kpd extends zi2 implements g6c {

    /* JADX INFO: renamed from: e */
    public final boolean f127852e;

    /* JADX INFO: renamed from: f */
    public final int f127853f;

    /* JADX INFO: renamed from: g */
    public final int f127854g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f127855h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final oml f127856i;

    /* JADX INFO: renamed from: j */
    public final oml f127857j;

    /* JADX INFO: renamed from: k */
    public final boolean f127858k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public tp80<String> f127859l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C2070a f127860m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public HttpURLConnection f127861n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public InputStream f127862o;

    /* JADX INFO: renamed from: p */
    public boolean f127863p;

    /* JADX INFO: renamed from: q */
    public int f127864q;

    /* JADX INFO: renamed from: r */
    public long f127865r;

    /* JADX INFO: renamed from: s */
    public long f127866s;

    /* JADX INFO: renamed from: l.kpd$b */
    public static final class C18234b implements g6c.InterfaceC17163a {

        /* JADX INFO: renamed from: b */
        @Nullable
        public pgj0 f127868b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public tp80<String> f127869c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f127870d;

        /* JADX INFO: renamed from: g */
        public boolean f127873g;

        /* JADX INFO: renamed from: h */
        public boolean f127874h;

        /* JADX INFO: renamed from: a */
        public final oml f127867a = new oml();

        /* JADX INFO: renamed from: e */
        public int f127871e = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        /* JADX INFO: renamed from: f */
        public int f127872f = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        @Override // p153l.g6c.InterfaceC17163a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public kpd mo129219a() {
            kpd kpdVar = new kpd(this.f127870d, this.f127871e, this.f127872f, this.f127873g, this.f127867a, this.f127869c, this.f127874h);
            pgj0 pgj0Var = this.f127868b;
            if (pgj0Var != null) {
                kpdVar.mo11177e(pgj0Var);
            }
            return kpdVar;
        }

        /* JADX INFO: renamed from: c */
        public C18234b m150709c(@Nullable pgj0 pgj0Var) {
            this.f127868b = pgj0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18234b m150710d(@Nullable String str) {
            this.f127870d = str;
            return this;
        }
    }

    public kpd(@Nullable String str, int i, int i2, boolean z, @Nullable oml omlVar, @Nullable tp80<String> tp80Var, boolean z2) {
        super(true);
        this.f127855h = str;
        this.f127853f = i;
        this.f127854g = i2;
        this.f127852e = z;
        this.f127856i = omlVar;
        this.f127859l = tp80Var;
        this.f127857j = new oml();
        this.f127858k = z2;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m150699w(HttpURLConnection httpURLConnection) {
        return HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* JADX INFO: renamed from: z */
    public static void m150700z(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = bmk0.f77313a) < 19 || i > 20) {
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
                Method declaredMethod = ((Class) w11.m204369e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A */
    public HttpURLConnection m150701A(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: B */
    public final int m150702B(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f127865r;
        if (j != -1) {
            long j2 = j - this.f127866s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) bmk0.m105144j(this.f127862o)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f127866s += (long) i3;
        m219718q(i3);
        return i3;
    }

    /* JADX INFO: renamed from: C */
    public final void m150703C(long j, C2070a c2070a) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) bmk0.m105144j(this.f127862o)).read(bArr, 0, (int) Math.min(j, 4096L));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), c2070a, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(c2070a, 2008, 1);
            }
            j -= (long) i;
            m219718q(i);
        }
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: a */
    public Map<String, List<String>> mo11175a() {
        HttpURLConnection httpURLConnection = this.f127861n;
        return httpURLConnection == null ? ImmutableMap.m15769of() : new C18235c(httpURLConnection.getHeaderFields());
    }

    @Override // p153l.g6c
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f127862o;
            if (inputStream != null) {
                long j = this.f127865r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f127866s;
                }
                m150700z(this.f127861n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource$HttpDataSourceException(e, (C2070a) bmk0.m105144j(this.f127860m), 2000, 3);
                }
            }
            this.f127862o = null;
            m150704u();
            if (this.f127863p) {
                this.f127863p = false;
                m219719r();
            }
        } catch (Throwable th) {
            this.f127862o = null;
            m150704u();
            if (this.f127863p) {
                this.f127863p = false;
                m219719r();
            }
            throw th;
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        HttpURLConnection httpURLConnection = this.f127861n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(final C2070a c2070a) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrM105134f1;
        this.f127860m = c2070a;
        long j = 0;
        this.f127866s = 0L;
        this.f127865r = 0L;
        m219720s(c2070a);
        try {
            HttpURLConnection httpURLConnectionM150706x = m150706x(c2070a);
            this.f127861n = httpURLConnectionM150706x;
            this.f127864q = httpURLConnectionM150706x.getResponseCode();
            String responseMessage = httpURLConnectionM150706x.getResponseMessage();
            int i = this.f127864q;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM150706x.getHeaderFields();
                if (this.f127864q == 416) {
                    if (c2070a.f9535g == znl.m220605c(httpURLConnectionM150706x.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                        this.f127863p = true;
                        m219721t(c2070a);
                        long j2 = c2070a.f9536h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM150706x.getErrorStream();
                try {
                    bArrM105134f1 = errorStream != null ? bmk0.m105134f1(errorStream) : bmk0.f77318f;
                } catch (IOException unused) {
                    bArrM105134f1 = bmk0.f77318f;
                }
                byte[] bArr = bArrM105134f1;
                m150704u();
                throw new HttpDataSource$InvalidResponseCodeException(this.f127864q, responseMessage, this.f127864q == 416 ? new DataSourceException(2008) : null, headerFields, c2070a, bArr);
            }
            final String contentType = httpURLConnectionM150706x.getContentType();
            tp80<String> tp80Var = this.f127859l;
            if (tp80Var != null && !tp80Var.apply(contentType)) {
                m150704u();
                throw new HttpDataSource$HttpDataSourceException(contentType, c2070a) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super("Invalid content type: " + contentType, c2070a, 2003, 1);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.f127864q == 200) {
                long j3 = c2070a.f9535g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zM150699w = m150699w(httpURLConnectionM150706x);
            if (zM150699w) {
                this.f127865r = c2070a.f9536h;
            } else {
                long j4 = c2070a.f9536h;
                if (j4 != -1) {
                    this.f127865r = j4;
                } else {
                    long jM220604b = znl.m220604b(httpURLConnectionM150706x.getHeaderField("Content-Length"), httpURLConnectionM150706x.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    this.f127865r = jM220604b != -1 ? jM220604b - j : -1L;
                }
            }
            try {
                this.f127862o = httpURLConnectionM150706x.getInputStream();
                if (zM150699w) {
                    this.f127862o = new GZIPInputStream(this.f127862o);
                }
                this.f127863p = true;
                m219721t(c2070a);
                try {
                    m150703C(j, c2070a);
                    return this.f127865r;
                } catch (IOException e) {
                    m150704u();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, c2070a, 2000, 1);
                }
            } catch (IOException e2) {
                m150704u();
                throw new HttpDataSource$HttpDataSourceException(e2, c2070a, 2000, 1);
            }
        } catch (IOException e3) {
            m150704u();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e3, c2070a, 1);
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return m150702B(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.createForIOException(e, (C2070a) bmk0.m105144j(this.f127860m), 2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m150704u() {
        HttpURLConnection httpURLConnection = this.f127861n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                kyv.m152146d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f127861n = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final URL m150705v(URL url, @Nullable String str, C2070a c2070a) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", c2070a, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, c2070a, 2001, 1);
            }
            if (this.f127852e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c2070a, 2001, 1);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, c2070a, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: x */
    public final HttpURLConnection m150706x(C2070a c2070a) throws IOException {
        URL url = new URL(c2070a.f9529a.toString());
        int i = c2070a.f9531c;
        byte[] bArr = c2070a.f9532d;
        long j = c2070a.f9535g;
        long j2 = c2070a.f9536h;
        int i2 = 1;
        boolean zM12159d = c2070a.m12159d(1);
        if (!this.f127852e && !this.f127858k) {
            return m150707y(url, i, bArr, j, j2, zM12159d, true, c2070a.f9533e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i4), c2070a, 2001, 1);
            }
            HttpURLConnection httpURLConnectionM150707y = m150707y(url, i, bArr, j, j2, zM12159d, false, c2070a.f9533e);
            int responseCode = httpURLConnectionM150707y.getResponseCode();
            String headerField = httpURLConnectionM150707y.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM150707y.disconnect();
                url = m150705v(url, headerField, c2070a);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM150707y;
                }
                httpURLConnectionM150707y.disconnect();
                if (!this.f127858k || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = m150705v(url, headerField, c2070a);
            }
            i3 = i4;
            i2 = 1;
        }
    }

    /* JADX INFO: renamed from: y */
    public final HttpURLConnection m150707y(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionM150701A = m150701A(url);
        httpURLConnectionM150701A.setConnectTimeout(this.f127853f);
        httpURLConnectionM150701A.setReadTimeout(this.f127854g);
        HashMap map2 = new HashMap();
        oml omlVar = this.f127856i;
        if (omlVar != null) {
            map2.putAll(omlVar.m168234a());
        }
        map2.putAll(this.f127857j.m168234a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM150701A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM220603a = znl.m220603a(j, j2);
        if (strM220603a != null) {
            httpURLConnectionM150701A.setRequestProperty("Range", strM220603a);
        }
        String str = this.f127855h;
        if (str != null) {
            httpURLConnectionM150701A.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM150701A.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z ? HttpHeaderValues.GZIP : "identity");
        httpURLConnectionM150701A.setInstanceFollowRedirects(z2);
        httpURLConnectionM150701A.setDoOutput(bArr != null);
        httpURLConnectionM150701A.setRequestMethod(C2070a.m12156c(i));
        if (bArr == null) {
            httpURLConnectionM150701A.connect();
            return httpURLConnectionM150701A;
        }
        httpURLConnectionM150701A.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionM150701A.connect();
        OutputStream outputStream = httpURLConnectionM150701A.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionM150701A;
    }

    /* JADX INFO: renamed from: l.kpd$c */
    public static class C18235c extends s2j<String, List<String>> {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<String>> f127875a;

        public C18235c(Map<String, List<String>> map) {
            this.f127875a = map;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m150711a(String str) {
            return str != null;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ boolean m150712c(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // p153l.s2j, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // p153l.s2j, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // p153l.s2j, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.m16171b(super.entrySet(), new tp80() { // from class: l.mpd
                @Override // p153l.tp80
                public final boolean apply(Object obj) {
                    return kpd.C18235c.m150712c((Map.Entry) obj);
                }
            });
        }

        @Override // p153l.s2j, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // p153l.s2j, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // p153l.s2j, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // p153l.s2j, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // p153l.s2j, java.util.Map
        public Set<String> keySet() {
            return Sets.m16171b(super.keySet(), new tp80() { // from class: l.lpd
                @Override // p153l.tp80
                public final boolean apply(Object obj) {
                    return kpd.C18235c.m150711a((String) obj);
                }
            });
        }

        @Override // p153l.s2j, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // p153l.s2j, p153l.v2j
        public Map<String, List<String>> delegate() {
            return this.f127875a;
        }
    }

    @Deprecated
    public kpd() {
        this(null, TXRecordCommon.AUDIO_SAMPLERATE_8000, TXRecordCommon.AUDIO_SAMPLERATE_8000);
    }

    @Deprecated
    public kpd(@Nullable String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public kpd(@Nullable String str, int i, int i2, boolean z, @Nullable oml omlVar) {
        this(str, i, i2, z, omlVar, null, false);
    }
}
