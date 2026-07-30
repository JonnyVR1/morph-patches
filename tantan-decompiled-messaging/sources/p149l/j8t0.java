package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.internal.ads.zzhr;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
public final class j8t0 extends gzw0 implements djx0 {

    /* JADX INFO: renamed from: u */
    public static final Pattern f116786u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v */
    public static final AtomicReference f116787v = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final SSLSocketFactory f116788e;

    /* JADX INFO: renamed from: f */
    public final int f116789f;

    /* JADX INFO: renamed from: g */
    public final int f116790g;

    /* JADX INFO: renamed from: h */
    public final String f116791h;

    /* JADX INFO: renamed from: i */
    public final yix0 f116792i;

    /* JADX INFO: renamed from: j */
    public uax0 f116793j;

    /* JADX INFO: renamed from: k */
    public HttpURLConnection f116794k;

    /* JADX INFO: renamed from: l */
    public InputStream f116795l;

    /* JADX INFO: renamed from: m */
    public boolean f116796m;

    /* JADX INFO: renamed from: n */
    public int f116797n;

    /* JADX INFO: renamed from: o */
    public long f116798o;

    /* JADX INFO: renamed from: p */
    public long f116799p;

    /* JADX INFO: renamed from: q */
    public long f116800q;

    /* JADX INFO: renamed from: r */
    public long f116801r;

    /* JADX INFO: renamed from: s */
    public int f116802s;

    /* JADX INFO: renamed from: t */
    public final Set f116803t;

    public j8t0(String str, vjx0 vjx0Var, int i, int i2, int i3) {
        super(true);
        this.f116788e = new i8t0(this);
        this.f116803t = new HashSet();
        f5v0.m119532c(str);
        this.f116791h = str;
        this.f116792i = new yix0();
        this.f116789f = i;
        this.f116790g = i2;
        this.f116802s = i3;
        if (vjx0Var != null) {
            mo128921f(vjx0Var);
        }
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhp {
        try {
            if (this.f116800q != this.f116798o) {
                byte[] bArr2 = (byte[]) f116787v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f116800q;
                    long j2 = this.f116798o;
                    if (j == j2) {
                        f116787v.set(bArr2);
                        break;
                    }
                    int i3 = this.f116795l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.f116800q += (long) i3;
                    zzg(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f116799p;
            if (j3 != -1) {
                long j4 = j3 - this.f116801r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.f116795l.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.f116799p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f116801r += (long) i4;
            zzg(i4);
            return i4;
        } catch (IOException e) {
            throw new zzhp(e, this.f116793j, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0044, B:13:0x005c, B:15:0x0062, B:22:0x0086, B:24:0x00a0, B:25:0x00b2, B:26:0x00b7, B:28:0x00c0, B:29:0x00c7, B:42:0x00ef, B:95:0x022e, B:97:0x0239, B:99:0x024a, B:102:0x0253, B:103:0x0262, B:105:0x0269, B:106:0x0270, B:107:0x0271, B:108:0x0287), top: B:117:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0044, B:13:0x005c, B:15:0x0062, B:22:0x0086, B:24:0x00a0, B:25:0x00b2, B:26:0x00b7, B:28:0x00c0, B:29:0x00c7, B:42:0x00ef, B:95:0x022e, B:97:0x0239, B:99:0x024a, B:102:0x0253, B:103:0x0262, B:105:0x0269, B:106:0x0270, B:107:0x0271, B:108:0x0287), top: B:117:0x000e }] */
    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhp {
        long j;
        int responseCode;
        String headerField;
        String protocol;
        long j2;
        long jMax;
        this.f116793j = uax0Var;
        long j3 = 0;
        this.f116801r = 0L;
        this.f116800q = 0L;
        try {
            URL url = new URL(uax0Var.f175648a.toString());
            long j4 = uax0Var.f175653f;
            long j5 = uax0Var.f175654g;
            boolean zM192805a = uax0Var.m192805a(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f116788e);
                }
                httpURLConnection.setConnectTimeout(this.f116789f);
                httpURLConnection.setReadTimeout(this.f116790g);
                for (Map.Entry entry : this.f116792i.m215026a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j3) {
                    if (j5 != -1) {
                        j = j3;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f116791h);
                    if (!zM192805a) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f116794k = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.f116797n = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f116794k.getHeaderFields();
                                m140346p();
                                zzhr zzhrVar = new zzhr(this.f116797n, null, null, headerFields, uax0Var, ggw0.f102573f);
                                if (this.f116797n != 416) {
                                    throw zzhrVar;
                                }
                                zzhrVar.initCause(new zzgx(2008));
                                throw zzhrVar;
                            }
                            if (responseCode2 == 200) {
                                j2 = uax0Var.f175653f;
                                if (j2 == j3) {
                                    j2 = j3;
                                }
                            } else {
                                j2 = j3;
                            }
                            this.f116798o = j2;
                            boolean zM192805a2 = uax0Var.m192805a(1);
                            long j6 = uax0Var.f175654g;
                            if (zM192805a2 || j6 != -1) {
                                this.f116799p = j6;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f116794k;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        x2t0.m206866d("Unexpected Content-Length [" + headerField2 + Constants.AES_SUFFIX);
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = f116786u.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j7 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j3) {
                                                jMax = j7;
                                            } else if (jMax != j7) {
                                                x2t0.m206869g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + Constants.AES_SUFFIX);
                                                jMax = Math.max(jMax, j7);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            x2t0.m206866d("Unexpected Content-Range [" + headerField3 + Constants.AES_SUFFIX);
                                        }
                                    }
                                }
                                this.f116799p = jMax != -1 ? jMax - this.f116798o : -1L;
                            }
                            try {
                                this.f116795l = this.f116794k.getInputStream();
                                this.f116796m = true;
                                m128924l(uax0Var);
                                return this.f116799p;
                            } catch (IOException e) {
                                m140346p();
                                throw new zzhp(e, uax0Var, 2000, 1);
                            }
                        } catch (IOException e2) {
                            m140346p();
                            throw new zzhp("Unable to connect to ".concat(String.valueOf(uax0Var.f175648a.toString())), e2, uax0Var, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j3 = j3;
                } else {
                    j = j4;
                }
                String string = BytesRange.PREFIX + j + "-";
                if (j5 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j + j5) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.f116791h);
                if (!zM192805a) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j3 = j3;
            }
        } catch (IOException e3) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(uax0Var.f175648a.toString())), e3, uax0Var, 2000, 1);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m140345o(int i) {
        this.f116802s = i;
        for (Socket socket : this.f116803t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f116802s);
                } catch (SocketException e) {
                    x2t0.m206870h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m140346p() {
        HttpURLConnection httpURLConnection = this.f116794k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                x2t0.m206867e("Unexpected error while disconnecting", e);
            }
            this.f116794k = null;
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f116794k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f116795l;
            if (inputStream != null) {
                int i = ggw0.f102568a;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.f116793j, 2000, 3);
                }
            }
            this.f116795l = null;
            m140346p();
            if (this.f116796m) {
                this.f116796m = false;
                m128922j();
            }
            this.f116803t.clear();
        } catch (Throwable th) {
            this.f116795l = null;
            m140346p();
            if (this.f116796m) {
                this.f116796m = false;
                m128922j();
            }
            this.f116803t.clear();
            throw th;
        }
    }

    @Override // p149l.gzw0, p149l.z4x0, p149l.djx0
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f116794k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
