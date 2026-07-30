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
import org.fourthline.cling.model.types.BytesRange;
import p149l.djx0;
import p149l.f5v0;
import p149l.gzw0;
import p149l.uax0;
import p149l.vjx0;
import p149l.x2t0;
import p149l.yix0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2154h1 extends gzw0 implements djx0 {

    /* JADX INFO: renamed from: v */
    public static final Pattern f9897v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e */
    public final int f9898e;

    /* JADX INFO: renamed from: f */
    public final int f9899f;

    /* JADX INFO: renamed from: g */
    public final String f9900g;

    /* JADX INFO: renamed from: h */
    public final yix0 f9901h;

    /* JADX INFO: renamed from: i */
    public uax0 f9902i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f9903j;

    /* JADX INFO: renamed from: k */
    public final Queue f9904k;

    /* JADX INFO: renamed from: l */
    public InputStream f9905l;

    /* JADX INFO: renamed from: m */
    public boolean f9906m;

    /* JADX INFO: renamed from: n */
    public int f9907n;

    /* JADX INFO: renamed from: o */
    public long f9908o;

    /* JADX INFO: renamed from: p */
    public long f9909p;

    /* JADX INFO: renamed from: q */
    public long f9910q;

    /* JADX INFO: renamed from: r */
    public long f9911r;

    /* JADX INFO: renamed from: s */
    public long f9912s;

    /* JADX INFO: renamed from: t */
    public final long f9913t;

    /* JADX INFO: renamed from: u */
    public final long f9914u;

    public C2154h1(String str, vjx0 vjx0Var, int i, int i2, long j, long j2) {
        super(true);
        f5v0.m119532c(str);
        this.f9900g = str;
        this.f9901h = new yix0();
        this.f9898e = i;
        this.f9899f = i2;
        this.f9904k = new ArrayDeque();
        this.f9913t = j;
        this.f9914u = j2;
        if (vjx0Var != null) {
            mo128921f(vjx0Var);
        }
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f9908o;
            long j2 = this.f9909p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.f9910q + j2;
            long j4 = i2;
            long j5 = this.f9914u;
            long j6 = j3 + j4 + j5;
            long j7 = this.f9912s;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.f9911r;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.f9913t + j8) - j5) - 1, (j8 + j4) - 1));
                    m12729m(j8, jMin, 2);
                    this.f9912s = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.f9905l.read(bArr, i, (int) Math.min(j4, ((j7 + 1) - this.f9910q) - this.f9909p));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.f9909p += (long) i3;
            zzg(i3);
            return i3;
        } catch (IOException e) {
            throw new zzhp(e, this.f9902i, 2000, 2);
        }
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhp {
        this.f9902i = uax0Var;
        this.f9909p = 0L;
        long j = uax0Var.f175653f;
        long j2 = uax0Var.f175654g;
        long jMin = this.f9913t;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f9910q = j;
        HttpURLConnection httpURLConnectionM12729m = m12729m(j, (jMin + j) - 1, 1);
        this.f9903j = httpURLConnectionM12729m;
        String headerField = httpURLConnectionM12729m.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f9897v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = uax0Var.f175654g;
                    if (j5 != -1) {
                        this.f9908o = j5;
                        this.f9911r = Math.max(j3, (this.f9910q + j5) - 1);
                    } else {
                        this.f9908o = j4 - this.f9910q;
                        this.f9911r = j4 - 1;
                    }
                    this.f9912s = j3;
                    this.f9906m = true;
                    m128924l(uax0Var);
                    return this.f9908o;
                } catch (NumberFormatException unused) {
                    x2t0.m206866d("Unexpected Content-Range [" + headerField + Constants.AES_SUFFIX);
                }
            }
        }
        throw new zzciy(headerField, uax0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public final HttpURLConnection m12729m(long j, long j2, int i) throws zzhp {
        String string = this.f9902i.f175648a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f9898e);
            httpURLConnection.setReadTimeout(this.f9899f);
            for (Map.Entry entry : this.f9901h.m215026a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", BytesRange.PREFIX + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f9900g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f9904k.add(httpURLConnection);
            String string2 = this.f9902i.f175648a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f9907n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    m12730n();
                    throw new zzciz(this.f9907n, headerFields, this.f9902i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f9905l != null) {
                        inputStream = new SequenceInputStream(this.f9905l, inputStream);
                    }
                    this.f9905l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m12730n();
                    throw new zzhp(e, this.f9902i, 2000, i);
                }
            } catch (IOException e2) {
                m12730n();
                throw new zzhp("Unable to connect to ".concat(String.valueOf(string2)), e2, this.f9902i, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(string)), e3, this.f9902i, 2000, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12730n() {
        while (!this.f9904k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f9904k.remove()).disconnect();
            } catch (Exception e) {
                x2t0.m206867e("Unexpected error while disconnecting", e);
            }
        }
        this.f9903j = null;
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f9903j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.f9905l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.f9902i, 2000, 3);
                }
            }
            this.f9905l = null;
            m12730n();
            if (this.f9906m) {
                this.f9906m = false;
                m128922j();
            }
        } catch (Throwable th) {
            this.f9905l = null;
            m12730n();
            if (this.f9906m) {
                this.f9906m = false;
                m128922j();
            }
            throw th;
        }
    }

    @Override // p149l.gzw0, p149l.z4x0, p149l.djx0
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f9903j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
