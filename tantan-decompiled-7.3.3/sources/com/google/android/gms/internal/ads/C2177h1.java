package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.model.types.BytesRange;
import p153l.akx0;
import p153l.btx0;
import p153l.dct0;
import p153l.esx0;
import p153l.jsx0;
import p153l.lev0;
import p153l.m8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2177h1 extends m8x0 implements jsx0 {

    /* JADX INFO: renamed from: v */
    public static final Pattern f9934v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e */
    public final int f9935e;

    /* JADX INFO: renamed from: f */
    public final int f9936f;

    /* JADX INFO: renamed from: g */
    public final String f9937g;

    /* JADX INFO: renamed from: h */
    public final esx0 f9938h;

    /* JADX INFO: renamed from: i */
    public akx0 f9939i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f9940j;

    /* JADX INFO: renamed from: k */
    public final Queue f9941k;

    /* JADX INFO: renamed from: l */
    public InputStream f9942l;

    /* JADX INFO: renamed from: m */
    public boolean f9943m;

    /* JADX INFO: renamed from: n */
    public int f9944n;

    /* JADX INFO: renamed from: o */
    public long f9945o;

    /* JADX INFO: renamed from: p */
    public long f9946p;

    /* JADX INFO: renamed from: q */
    public long f9947q;

    /* JADX INFO: renamed from: r */
    public long f9948r;

    /* JADX INFO: renamed from: s */
    public long f9949s;

    /* JADX INFO: renamed from: t */
    public final long f9950t;

    /* JADX INFO: renamed from: u */
    public final long f9951u;

    public C2177h1(String str, btx0 btx0Var, int i, int i2, long j, long j2) {
        super(true);
        lev0.m153955c(str);
        this.f9937g = str;
        this.f9938h = new esx0();
        this.f9935e = i;
        this.f9936f = i2;
        this.f9941k = new ArrayDeque();
        this.f9950t = j;
        this.f9951u = j2;
        if (btx0Var != null) {
            mo101236f(btx0Var);
        }
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f9945o;
            long j2 = this.f9946p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.f9947q + j2;
            long j4 = i2;
            long j5 = this.f9951u;
            long j6 = j3 + j4 + j5;
            long j7 = this.f9949s;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.f9948r;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.f9950t + j8) - j5) - 1, (j8 + j4) - 1));
                    m12783m(j8, jMin, 2);
                    this.f9949s = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.f9942l.read(bArr, i, (int) Math.min(j4, ((j7 + 1) - this.f9947q) - this.f9946p));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.f9946p += (long) i3;
            zzg(i3);
            return i3;
        } catch (IOException e) {
            throw new zzhp(e, this.f9939i, 2000, 2);
        }
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhp {
        this.f9939i = akx0Var;
        this.f9946p = 0L;
        long j = akx0Var.f72052f;
        long j2 = akx0Var.f72053g;
        long jMin = this.f9950t;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f9947q = j;
        HttpURLConnection httpURLConnectionM12783m = m12783m(j, (jMin + j) - 1, 1);
        this.f9940j = httpURLConnectionM12783m;
        String headerField = httpURLConnectionM12783m.getHeaderField(HttpHeaders.CONTENT_RANGE);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f9934v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = akx0Var.f72053g;
                    if (j5 != -1) {
                        this.f9945o = j5;
                        this.f9948r = Math.max(j3, (this.f9947q + j5) - 1);
                    } else {
                        this.f9945o = j4 - this.f9947q;
                        this.f9948r = j4 - 1;
                    }
                    this.f9949s = j3;
                    this.f9943m = true;
                    m157523l(akx0Var);
                    return this.f9945o;
                } catch (NumberFormatException unused) {
                    dct0.m115295d("Unexpected Content-Range [" + headerField + Constants.AES_SUFFIX);
                }
            }
        }
        throw new zzciy(headerField, akx0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public final HttpURLConnection m12783m(long j, long j2, int i) throws zzhp {
        String string = this.f9939i.f72047a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f9935e);
            httpURLConnection.setReadTimeout(this.f9936f);
            for (Map.Entry entry : this.f9938h.m122401a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", BytesRange.PREFIX + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f9937g);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f9941k.add(httpURLConnection);
            String string2 = this.f9939i.f72047a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f9944n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    m12784n();
                    throw new zzciz(this.f9944n, headerFields, this.f9939i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f9942l != null) {
                        inputStream = new SequenceInputStream(this.f9942l, inputStream);
                    }
                    this.f9942l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m12784n();
                    throw new zzhp(e, this.f9939i, 2000, i);
                }
            } catch (IOException e2) {
                m12784n();
                throw new zzhp("Unable to connect to ".concat(String.valueOf(string2)), e2, this.f9939i, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(string)), e3, this.f9939i, 2000, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12784n() {
        while (!this.f9941k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f9941k.remove()).disconnect();
            } catch (Exception e) {
                dct0.m115296e("Unexpected error while disconnecting", e);
            }
        }
        this.f9940j = null;
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f9940j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p153l.fex0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f9942l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.f9939i, 2000, 3);
                }
            }
            this.f9942l = null;
            m12784n();
            if (this.f9943m) {
                this.f9943m = false;
                m157521j();
            }
        } catch (Throwable th) {
            this.f9942l = null;
            m12784n();
            if (this.f9943m) {
                this.f9943m = false;
                m157521j();
            }
            throw th;
        }
    }

    @Override // p153l.m8x0, p153l.fex0, p153l.jsx0
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f9940j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
