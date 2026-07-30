package p149l;

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
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
public final class qhx0 extends gzw0 implements djx0 {

    /* JADX INFO: renamed from: e */
    public final boolean f154528e;

    /* JADX INFO: renamed from: f */
    public final int f154529f;

    /* JADX INFO: renamed from: g */
    public final int f154530g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f154531h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final yix0 f154532i;

    /* JADX INFO: renamed from: j */
    public final yix0 f154533j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public uax0 f154534k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public HttpURLConnection f154535l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InputStream f154536m;

    /* JADX INFO: renamed from: n */
    public boolean f154537n;

    /* JADX INFO: renamed from: o */
    public int f154538o;

    /* JADX INFO: renamed from: p */
    public long f154539p;

    /* JADX INFO: renamed from: q */
    public long f154540q;

    public qhx0(@Nullable String str, int i, int i2, boolean z, @Nullable yix0 yix0Var, @Nullable ofw0 ofw0Var, boolean z2) {
        super(true);
        this.f154531h = str;
        this.f154529f = i;
        this.f154530g = i2;
        this.f154528e = z;
        this.f154532i = yix0Var;
        this.f154533j = new yix0();
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f154539p;
            if (j != -1) {
                long j2 = j - this.f154540q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f154536m;
            int i3 = ggw0.f102568a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 == -1) {
                return -1;
            }
            this.f154540q += (long) i4;
            zzg(i4);
            return i4;
        } catch (IOException e) {
            uax0 uax0Var = this.f154534k;
            int i5 = ggw0.f102568a;
            throw zzhp.zza(e, uax0Var, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhp {
        long j;
        qhx0 qhx0Var;
        HttpURLConnection httpURLConnectionM174605m;
        byte[] byteArray;
        long j2;
        qhx0 qhx0Var2 = this;
        qhx0Var2.f154534k = uax0Var;
        long j3 = 0;
        qhx0Var2.f154540q = 0L;
        qhx0Var2.f154539p = 0L;
        m128923k(uax0Var);
        try {
            URL url = new URL(uax0Var.f175648a.toString());
            long j4 = uax0Var.f175653f;
            long j5 = uax0Var.f175654g;
            boolean zM192805a = uax0Var.m192805a(1);
            int i = 0;
            try {
                if (qhx0Var2.f154528e) {
                    while (true) {
                        int i2 = i + 1;
                        if (i > 20) {
                            throw new zzhp(new NoRouteToHostException("Too many redirects: " + i2), uax0Var, 2001, 1);
                        }
                        j = j3;
                        qhx0Var = this;
                        HttpURLConnection httpURLConnectionM174605m2 = qhx0Var.m174605m(url, 1, null, j4, j5, zM192805a, false, uax0Var.f175651d);
                        int responseCode = httpURLConnectionM174605m2.getResponseCode();
                        String headerField = httpURLConnectionM174605m2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionM174605m = httpURLConnectionM174605m2;
                            break;
                        }
                        httpURLConnectionM174605m2.disconnect();
                        url = qhx0Var.m174606n(url, headerField, uax0Var);
                        i = i2;
                        j3 = j;
                    }
                } else {
                    httpURLConnectionM174605m = qhx0Var2.m174605m(url, 1, null, j4, j5, zM192805a, true, uax0Var.f175651d);
                    qhx0Var = this;
                    j = 0;
                }
                qhx0Var.f154535l = httpURLConnectionM174605m;
                qhx0Var.f154538o = httpURLConnectionM174605m.getResponseCode();
                String responseMessage = httpURLConnectionM174605m.getResponseMessage();
                int i3 = qhx0Var.f154538o;
                if (i3 < 200 || i3 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionM174605m.getHeaderFields();
                    if (qhx0Var.f154538o == 416) {
                        if (uax0Var.f175653f == hjx0.m131424b(httpURLConnectionM174605m.getHeaderField("Content-Range"))) {
                            qhx0Var.f154537n = true;
                            m128924l(uax0Var);
                            long j6 = uax0Var.f175654g;
                            return j6 != -1 ? j6 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnectionM174605m.getErrorStream();
                    try {
                        if (errorStream != null) {
                            int i4 = ggw0.f102568a;
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
                            byteArray = ggw0.f102573f;
                        }
                    } catch (IOException unused) {
                        byteArray = ggw0.f102573f;
                    }
                    byte[] bArr2 = byteArray;
                    qhx0Var.m174607o();
                    throw new zzhr(qhx0Var.f154538o, responseMessage, qhx0Var.f154538o == 416 ? new zzgx(2008) : null, headerFields, uax0Var, bArr2);
                }
                httpURLConnectionM174605m.getContentType();
                if (qhx0Var.f154538o == 200) {
                    j2 = uax0Var.f175653f;
                    if (j2 == j) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                boolean zEqualsIgnoreCase = HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnectionM174605m.getHeaderField("Content-Encoding"));
                long j7 = uax0Var.f175654g;
                if (zEqualsIgnoreCase || j7 != -1) {
                    qhx0Var.f154539p = j7;
                } else {
                    long jM131423a = hjx0.m131423a(httpURLConnectionM174605m.getHeaderField("Content-Length"), httpURLConnectionM174605m.getHeaderField("Content-Range"));
                    qhx0Var.f154539p = jM131423a != -1 ? jM131423a - j2 : -1L;
                }
                try {
                    qhx0Var.f154536m = httpURLConnectionM174605m.getInputStream();
                    if (zEqualsIgnoreCase) {
                        qhx0Var.f154536m = new GZIPInputStream(qhx0Var.f154536m);
                    }
                    qhx0Var.f154537n = true;
                    m128924l(uax0Var);
                    if (j2 != j) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j2 > j) {
                                int iMin = (int) Math.min(j2, 4096L);
                                InputStream inputStream = qhx0Var.f154536m;
                                int i6 = ggw0.f102568a;
                                int i7 = inputStream.read(bArr3, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhp(new InterruptedIOException(), uax0Var, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzhp(uax0Var, 2008, 1);
                                }
                                j2 -= (long) i7;
                                qhx0Var.zzg(i7);
                            }
                        } catch (IOException e) {
                            qhx0Var.m174607o();
                            if (e instanceof zzhp) {
                                throw ((zzhp) e);
                            }
                            throw new zzhp(e, uax0Var, 2000, 1);
                        }
                    }
                    return qhx0Var.f154539p;
                } catch (IOException e2) {
                    qhx0Var.m174607o();
                    throw new zzhp(e2, uax0Var, 2000, 1);
                }
            } catch (IOException e3) {
                e = e3;
                qhx0Var2 = this;
                qhx0Var2.m174607o();
                throw zzhp.zza(e, uax0Var, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX INFO: renamed from: m */
    public final HttpURLConnection m174605m(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f154529f);
        httpURLConnection.setReadTimeout(this.f154530g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f154532i.m215026a());
        map2.putAll(this.f154533j.m215026a());
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
        String str = this.f154531h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : HttpHeaderValues.GZIP);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = uax0.f175647j;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: n */
    public final URL m174606n(URL url, @Nullable String str, uax0 uax0Var) throws zzhp {
        if (str == null) {
            throw new zzhp("Null location redirect", uax0Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), uax0Var, 2001, 1);
            }
            if (this.f154528e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", uax0Var, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhp(e, uax0Var, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m174607o() {
        HttpURLConnection httpURLConnection = this.f154535l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                svv0.m186109d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f154535l = null;
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f154535l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f154536m;
            if (inputStream != null) {
                if (this.f154535l != null) {
                    int i = ggw0.f102568a;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    uax0 uax0Var = this.f154534k;
                    int i2 = ggw0.f102568a;
                    throw new zzhp(e, uax0Var, 2000, 3);
                }
            }
            this.f154536m = null;
            m174607o();
            if (this.f154537n) {
                this.f154537n = false;
                m128922j();
            }
        } catch (Throwable th) {
            this.f154536m = null;
            m174607o();
            if (this.f154537n) {
                this.f154537n = false;
                m128922j();
            }
            throw th;
        }
    }

    @Override // p149l.gzw0, p149l.z4x0, p149l.djx0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f154535l;
        return httpURLConnection == null ? zzgad.zzd() : new kgx0(httpURLConnection.getHeaderFields());
    }

    @Deprecated
    public qhx0() {
        this(null, TXRecordCommon.AUDIO_SAMPLERATE_8000, TXRecordCommon.AUDIO_SAMPLERATE_8000, false, null, null, false);
    }
}
