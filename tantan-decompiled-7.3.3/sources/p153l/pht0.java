package p153l;

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
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes6.dex */
public final class pht0 extends m8x0 implements jsx0 {

    /* JADX INFO: renamed from: u */
    public static final Pattern f152472u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: v */
    public static final AtomicReference f152473v = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final SSLSocketFactory f152474e;

    /* JADX INFO: renamed from: f */
    public final int f152475f;

    /* JADX INFO: renamed from: g */
    public final int f152476g;

    /* JADX INFO: renamed from: h */
    public final String f152477h;

    /* JADX INFO: renamed from: i */
    public final esx0 f152478i;

    /* JADX INFO: renamed from: j */
    public akx0 f152479j;

    /* JADX INFO: renamed from: k */
    public HttpURLConnection f152480k;

    /* JADX INFO: renamed from: l */
    public InputStream f152481l;

    /* JADX INFO: renamed from: m */
    public boolean f152482m;

    /* JADX INFO: renamed from: n */
    public int f152483n;

    /* JADX INFO: renamed from: o */
    public long f152484o;

    /* JADX INFO: renamed from: p */
    public long f152485p;

    /* JADX INFO: renamed from: q */
    public long f152486q;

    /* JADX INFO: renamed from: r */
    public long f152487r;

    /* JADX INFO: renamed from: s */
    public int f152488s;

    /* JADX INFO: renamed from: t */
    public final Set f152489t;

    public pht0(String str, btx0 btx0Var, int i, int i2, int i3) {
        super(true);
        this.f152474e = new oht0(this);
        this.f152489t = new HashSet();
        lev0.m153955c(str);
        this.f152477h = str;
        this.f152478i = new esx0();
        this.f152475f = i;
        this.f152476g = i2;
        this.f152488s = i3;
        if (btx0Var != null) {
            mo101236f(btx0Var);
        }
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhp {
        try {
            if (this.f152486q != this.f152484o) {
                byte[] bArr2 = (byte[]) f152473v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f152486q;
                    long j2 = this.f152484o;
                    if (j == j2) {
                        f152473v.set(bArr2);
                        break;
                    }
                    int i3 = this.f152481l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.f152486q += (long) i3;
                    zzg(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f152485p;
            if (j3 != -1) {
                long j4 = j3 - this.f152487r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.f152481l.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.f152485p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f152487r += (long) i4;
            zzg(i4);
            return i4;
        } catch (IOException e) {
            throw new zzhp(e, this.f152479j, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0044, B:13:0x005c, B:15:0x0062, B:22:0x0086, B:24:0x00a0, B:25:0x00b2, B:26:0x00b7, B:28:0x00c0, B:29:0x00c7, B:42:0x00ef, B:95:0x022e, B:97:0x0239, B:99:0x024a, B:102:0x0253, B:103:0x0262, B:105:0x0269, B:106:0x0270, B:107:0x0271, B:108:0x0287), top: B:117:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239 A[Catch: IOException -> 0x003f, TryCatch #3 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0044, B:13:0x005c, B:15:0x0062, B:22:0x0086, B:24:0x00a0, B:25:0x00b2, B:26:0x00b7, B:28:0x00c0, B:29:0x00c7, B:42:0x00ef, B:95:0x022e, B:97:0x0239, B:99:0x024a, B:102:0x0253, B:103:0x0262, B:105:0x0269, B:106:0x0270, B:107:0x0271, B:108:0x0287), top: B:117:0x000e }] */
    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhp {
        long j;
        int responseCode;
        String headerField;
        String protocol;
        long j2;
        long jMax;
        this.f152479j = akx0Var;
        long j3 = 0;
        this.f152487r = 0L;
        this.f152486q = 0L;
        try {
            URL url = new URL(akx0Var.f72047a.toString());
            long j4 = akx0Var.f72052f;
            long j5 = akx0Var.f72053g;
            boolean zM98632a = akx0Var.m98632a(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f152474e);
                }
                httpURLConnection.setConnectTimeout(this.f152475f);
                httpURLConnection.setReadTimeout(this.f152476g);
                for (Map.Entry entry : this.f152478i.m122401a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j3) {
                    if (j5 != -1) {
                        j = j3;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f152477h);
                    if (!zM98632a) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f152480k = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.f152483n = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f152480k.getHeaderFields();
                                m172336p();
                                zzhr zzhrVar = new zzhr(this.f152483n, null, null, headerFields, akx0Var, mpw0.f137962f);
                                if (this.f152483n != 416) {
                                    throw zzhrVar;
                                }
                                zzhrVar.initCause(new zzgx(2008));
                                throw zzhrVar;
                            }
                            if (responseCode2 == 200) {
                                j2 = akx0Var.f72052f;
                                if (j2 == j3) {
                                    j2 = j3;
                                }
                            } else {
                                j2 = j3;
                            }
                            this.f152484o = j2;
                            boolean zM98632a2 = akx0Var.m98632a(1);
                            long j6 = akx0Var.f72053g;
                            if (zM98632a2 || j6 != -1) {
                                this.f152485p = j6;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f152480k;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        dct0.m115295d("Unexpected Content-Length [" + headerField2 + Constants.AES_SUFFIX);
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = f152472u.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j7 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j3) {
                                                jMax = j7;
                                            } else if (jMax != j7) {
                                                dct0.m115298g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + Constants.AES_SUFFIX);
                                                jMax = Math.max(jMax, j7);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            dct0.m115295d("Unexpected Content-Range [" + headerField3 + Constants.AES_SUFFIX);
                                        }
                                    }
                                }
                                this.f152485p = jMax != -1 ? jMax - this.f152484o : -1L;
                            }
                            try {
                                this.f152481l = this.f152480k.getInputStream();
                                this.f152482m = true;
                                m157523l(akx0Var);
                                return this.f152485p;
                            } catch (IOException e) {
                                m172336p();
                                throw new zzhp(e, akx0Var, 2000, 1);
                            }
                        } catch (IOException e2) {
                            m172336p();
                            throw new zzhp("Unable to connect to ".concat(String.valueOf(akx0Var.f72047a.toString())), e2, akx0Var, 2000, 1);
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
                httpURLConnection.setRequestProperty("User-Agent", this.f152477h);
                if (!zM98632a) {
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
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
            throw new zzhp("Unable to connect to ".concat(String.valueOf(akx0Var.f72047a.toString())), e3, akx0Var, 2000, 1);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m172335o(int i) {
        this.f152488s = i;
        for (Socket socket : this.f152489t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f152488s);
                } catch (SocketException e) {
                    dct0.m115299h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m172336p() {
        HttpURLConnection httpURLConnection = this.f152480k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                dct0.m115296e("Unexpected error while disconnecting", e);
            }
            this.f152480k = null;
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f152480k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p153l.fex0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f152481l;
            if (inputStream != null) {
                int i = mpw0.f137957a;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.f152479j, 2000, 3);
                }
            }
            this.f152481l = null;
            m172336p();
            if (this.f152482m) {
                this.f152482m = false;
                m157521j();
            }
            this.f152489t.clear();
        } catch (Throwable th) {
            this.f152481l = null;
            m172336p();
            if (this.f152482m) {
                this.f152482m = false;
                m157521j();
            }
            this.f152489t.clear();
            throw th;
        }
    }

    @Override // p153l.m8x0, p153l.fex0, p153l.jsx0
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f152480k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
