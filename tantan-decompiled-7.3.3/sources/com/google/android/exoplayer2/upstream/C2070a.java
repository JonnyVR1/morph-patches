package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import p153l.t9f;
import p153l.w11;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2070a {

    /* JADX INFO: renamed from: a */
    public final Uri f9529a;

    /* JADX INFO: renamed from: b */
    public final long f9530b;

    /* JADX INFO: renamed from: c */
    public final int f9531c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f9532d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f9533e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final long f9534f;

    /* JADX INFO: renamed from: g */
    public final long f9535g;

    /* JADX INFO: renamed from: h */
    public final long f9536h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f9537i;

    /* JADX INFO: renamed from: j */
    public final int f9538j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Object f9539k;

    static {
        t9f.m189752a("goog.exo.datasource");
    }

    public C2070a(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        w11.m204365a(j4 >= 0);
        w11.m204365a(j2 >= 0);
        w11.m204365a(j3 > 0 || j3 == -1);
        this.f9529a = uri;
        this.f9530b = j;
        this.f9531c = i;
        this.f9532d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f9533e = Collections.unmodifiableMap(new HashMap(map));
        this.f9535g = j2;
        this.f9534f = j4;
        this.f9536h = j3;
        this.f9537i = str;
        this.f9538j = i2;
        this.f9539k = obj;
    }

    /* JADX INFO: renamed from: c */
    public static String m12156c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return HttpMethods.HEAD;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public b m12157a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public final String m12158b() {
        return m12156c(this.f9531c);
    }

    /* JADX INFO: renamed from: d */
    public boolean m12159d(int i) {
        return (this.f9538j & i) == i;
    }

    /* JADX INFO: renamed from: e */
    public C2070a m12160e(long j) {
        long j2 = this.f9536h;
        return m12161f(j, j2 != -1 ? j2 - j : -1L);
    }

    /* JADX INFO: renamed from: f */
    public C2070a m12161f(long j, long j2) {
        return (j == 0 && this.f9536h == j2) ? this : new C2070a(this.f9529a, this.f9530b, this.f9531c, this.f9532d, this.f9533e, this.f9535g + j, j2, this.f9537i, this.f9538j, this.f9539k);
    }

    public String toString() {
        return "DataSpec[" + m12158b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f9529a + ", " + this.f9535g + ", " + this.f9536h + ", " + this.f9537i + ", " + this.f9538j + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Uri f9540a;

        /* JADX INFO: renamed from: b */
        public long f9541b;

        /* JADX INFO: renamed from: c */
        public int f9542c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f9543d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f9544e;

        /* JADX INFO: renamed from: f */
        public long f9545f;

        /* JADX INFO: renamed from: g */
        public long f9546g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9547h;

        /* JADX INFO: renamed from: i */
        public int f9548i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Object f9549j;

        public b(C2070a c2070a) {
            this.f9540a = c2070a.f9529a;
            this.f9541b = c2070a.f9530b;
            this.f9542c = c2070a.f9531c;
            this.f9543d = c2070a.f9532d;
            this.f9544e = c2070a.f9533e;
            this.f9545f = c2070a.f9535g;
            this.f9546g = c2070a.f9536h;
            this.f9547h = c2070a.f9537i;
            this.f9548i = c2070a.f9538j;
            this.f9549j = c2070a.f9539k;
        }

        /* JADX INFO: renamed from: a */
        public C2070a m12162a() {
            w11.m204374j(this.f9540a, "The uri must be set.");
            return new C2070a(this.f9540a, this.f9541b, this.f9542c, this.f9543d, this.f9544e, this.f9545f, this.f9546g, this.f9547h, this.f9548i, this.f9549j);
        }

        /* JADX INFO: renamed from: b */
        public b m12163b(int i) {
            this.f9548i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m12164c(@Nullable byte[] bArr) {
            this.f9543d = bArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m12165d(int i) {
            this.f9542c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m12166e(Map<String, String> map) {
            this.f9544e = map;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m12167f(@Nullable String str) {
            this.f9547h = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m12168g(long j) {
            this.f9546g = j;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m12169h(long j) {
            this.f9545f = j;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m12170i(Uri uri) {
            this.f9540a = uri;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m12171j(String str) {
            this.f9540a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f9542c = 1;
            this.f9544e = Collections.EMPTY_MAP;
            this.f9546g = -1L;
        }
    }

    public C2070a(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C2070a(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }
}
