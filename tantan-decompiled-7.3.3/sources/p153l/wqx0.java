package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.internal.ads.zzhr;
import com.tencent.ugc.TXRecordCommon;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
public final class wqx0 extends m8x0 implements jsx0 {

    /* JADX INFO: renamed from: e */
    public final boolean f190444e;

    /* JADX INFO: renamed from: f */
    public final int f190445f;

    /* JADX INFO: renamed from: g */
    public final int f190446g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f190447h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final esx0 f190448i;

    /* JADX INFO: renamed from: j */
    public final esx0 f190449j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public akx0 f190450k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public HttpURLConnection f190451l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InputStream f190452m;

    /* JADX INFO: renamed from: n */
    public boolean f190453n;

    /* JADX INFO: renamed from: o */
    public int f190454o;

    /* JADX INFO: renamed from: p */
    public long f190455p;

    /* JADX INFO: renamed from: q */
    public long f190456q;

    public wqx0(@Nullable String str, int i, int i2, boolean z, @Nullable esx0 esx0Var, @Nullable uow0 uow0Var, boolean z2) {
        super(true);
        this.f190447h = str;
        this.f190445f = i;
        this.f190446g = i2;
        this.f190444e = z;
        this.f190448i = esx0Var;
        this.f190449j = new esx0();
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f190455p;
            if (j != -1) {
                long j2 = j - this.f190456q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f190452m;
            int i3 = mpw0.f137957a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 == -1) {
                return -1;
            }
            this.f190456q += (long) i4;
            zzg(i4);
            return i4;
        } catch (IOException e) {
            akx0 akx0Var = this.f190450k;
            int i5 = mpw0.f137957a;
            throw zzhp.zza(e, akx0Var, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhp {
        long j;
        wqx0 wqx0Var;
        HttpURLConnection httpURLConnectionM207524m;
        byte[] byteArray;
        long j2;
        wqx0 wqx0Var2 = this;
        wqx0Var2.f190450k = akx0Var;
        long j3 = 0;
        wqx0Var2.f190456q = 0L;
        wqx0Var2.f190455p = 0L;
        m157522k(akx0Var);
        try {
            URL url = new URL(akx0Var.f72047a.toString());
            long j4 = akx0Var.f72052f;
            long j5 = akx0Var.f72053g;
            boolean zM98632a = akx0Var.m98632a(1);
            int i = 0;
            try {
                if (wqx0Var2.f190444e) {
                    while (true) {
                        int i2 = i + 1;
                        if (i > 20) {
                            throw new zzhp(new NoRouteToHostException("Too many redirects: " + i2), akx0Var, 2001, 1);
                        }
                        j = j3;
                        wqx0Var = this;
                        HttpURLConnection httpURLConnectionM207524m2 = wqx0Var.m207524m(url, 1, null, j4, j5, zM98632a, false, akx0Var.f72050d);
                        int responseCode = httpURLConnectionM207524m2.getResponseCode();
                        String headerField = httpURLConnectionM207524m2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionM207524m = httpURLConnectionM207524m2;
                            break;
                        }
                        httpURLConnectionM207524m2.disconnect();
                        url = wqx0Var.m207525n(url, headerField, akx0Var);
                        i = i2;
                        j3 = j;
                    }
                } else {
                    httpURLConnectionM207524m = wqx0Var2.m207524m(url, 1, null, j4, j5, zM98632a, true, akx0Var.f72050d);
                    wqx0Var = this;
                    j = 0;
                }
                wqx0Var.f190451l = httpURLConnectionM207524m;
                wqx0Var.f190454o = httpURLConnectionM207524m.getResponseCode();
                String responseMessage = httpURLConnectionM207524m.getResponseMessage();
                int i3 = wqx0Var.f190454o;
                if (i3 < 200 || i3 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionM207524m.getHeaderFields();
                    if (wqx0Var.f190454o == 416) {
                        if (akx0Var.f72052f == nsx0.m164657b(httpURLConnectionM207524m.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            wqx0Var.f190453n = true;
                            m157523l(akx0Var);
                            long j6 = akx0Var.f72053g;
                            return j6 != -1 ? j6 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnectionM207524m.getErrorStream();
                    try {
                        if (errorStream != null) {
                            int i4 = mpw0.f137957a;
                            byte[] bArr = new byte[4096];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i5 = errorStream.read(bArr);
                                if (i5 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, i, i5);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        } else {
                            byteArray = mpw0.f137962f;
                        }
                    } catch (IOException unused) {
                        byteArray = mpw0.f137962f;
                    }
                    byte[] bArr2 = byteArray;
                    wqx0Var.m207526o();
                    throw new zzhr(wqx0Var.f190454o, responseMessage, wqx0Var.f190454o == 416 ? new zzgx(2008) : null, headerFields, akx0Var, bArr2);
                }
                httpURLConnectionM207524m.getContentType();
                if (wqx0Var.f190454o == 200) {
                    j2 = akx0Var.f72052f;
                    if (j2 == j) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                boolean zEqualsIgnoreCase = HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnectionM207524m.getHeaderField("Content-Encoding"));
                long j7 = akx0Var.f72053g;
                if (zEqualsIgnoreCase || j7 != -1) {
                    wqx0Var.f190455p = j7;
                } else {
                    long jM164656a = nsx0.m164656a(httpURLConnectionM207524m.getHeaderField("Content-Length"), httpURLConnectionM207524m.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    wqx0Var.f190455p = jM164656a != -1 ? jM164656a - j2 : -1L;
                }
                try {
                    wqx0Var.f190452m = httpURLConnectionM207524m.getInputStream();
                    if (zEqualsIgnoreCase) {
                        wqx0Var.f190452m = new GZIPInputStream(wqx0Var.f190452m);
                    }
                    wqx0Var.f190453n = true;
                    m157523l(akx0Var);
                    if (j2 != j) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j2 > j) {
                                int iMin = (int) Math.min(j2, 4096L);
                                InputStream inputStream = wqx0Var.f190452m;
                                int i6 = mpw0.f137957a;
                                int i7 = inputStream.read(bArr3, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhp(new InterruptedIOException(), akx0Var, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzhp(akx0Var, 2008, 1);
                                }
                                j2 -= (long) i7;
                                wqx0Var.zzg(i7);
                            }
                        } catch (IOException e) {
                            wqx0Var.m207526o();
                            if (e instanceof zzhp) {
                                throw ((zzhp) e);
                            }
                            throw new zzhp(e, akx0Var, 2000, 1);
                        }
                    }
                    return wqx0Var.f190455p;
                } catch (IOException e2) {
                    wqx0Var.m207526o();
                    throw new zzhp(e2, akx0Var, 2000, 1);
                }
            } catch (IOException e3) {
                e = e3;
                wqx0Var2 = this;
                wqx0Var2.m207526o();
                throw zzhp.zza(e, akx0Var, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX INFO: renamed from: m */
    public final HttpURLConnection m207524m(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f190445f);
        httpURLConnection.setReadTimeout(this.f190446g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f190448i.m122401a());
        map2.putAll(this.f190449j.m122401a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sb = new StringBuilder(BytesRange.PREFIX);
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new StringBuilder(BytesRange.PREFIX);
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.f190447h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : HttpHeaderValues.GZIP);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = akx0.f72046j;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: n */
    public final URL m207525n(URL url, @Nullable String str, akx0 akx0Var) throws zzhp {
        if (str == null) {
            throw new zzhp("Null location redirect", akx0Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), akx0Var, 2001, 1);
            }
            if (this.f190444e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", akx0Var, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhp(e, akx0Var, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m207526o() {
        HttpURLConnection httpURLConnection = this.f190451l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                y4w0.m214276d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f190451l = null;
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f190451l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p153l.fex0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f190452m;
            if (inputStream != null) {
                if (this.f190451l != null) {
                    int i = mpw0.f137957a;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    akx0 akx0Var = this.f190450k;
                    int i2 = mpw0.f137957a;
                    throw new zzhp(e, akx0Var, 2000, 3);
                }
            }
            this.f190452m = null;
            m207526o();
            if (this.f190453n) {
                this.f190453n = false;
                m157521j();
            }
        } catch (Throwable th) {
            this.f190452m = null;
            m207526o();
            if (this.f190453n) {
                this.f190453n = false;
                m157521j();
            }
            throw th;
        }
    }

    @Override // p153l.m8x0, p153l.fex0, p153l.jsx0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f190451l;
        return httpURLConnection == null ? zzgad.zzd() : new qpx0(httpURLConnection.getHeaderFields());
    }

    @Deprecated
    public wqx0() {
        this(null, TXRecordCommon.AUDIO_SAMPLERATE_8000, TXRecordCommon.AUDIO_SAMPLERATE_8000, false, null, null, false);
    }
}
