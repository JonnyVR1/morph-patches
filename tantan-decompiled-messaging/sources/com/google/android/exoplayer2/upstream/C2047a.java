package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpMethods;
import p149l.n8f;
import p149l.ohg0;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2047a {

    /* JADX INFO: renamed from: a */
    public final Uri f9492a;

    /* JADX INFO: renamed from: b */
    public final long f9493b;

    /* JADX INFO: renamed from: c */
    public final int f9494c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final byte[] f9495d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f9496e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final long f9497f;

    /* JADX INFO: renamed from: g */
    public final long f9498g;

    /* JADX INFO: renamed from: h */
    public final long f9499h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f9500i;

    /* JADX INFO: renamed from: j */
    public final int f9501j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Object f9502k;

    static {
        n8f.m158492a("goog.exo.datasource");
    }

    public C2047a(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        p11.m167007a(j4 >= 0);
        p11.m167007a(j2 >= 0);
        p11.m167007a(j3 > 0 || j3 == -1);
        this.f9492a = uri;
        this.f9493b = j;
        this.f9494c = i;
        this.f9495d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f9496e = Collections.unmodifiableMap(new HashMap(map));
        this.f9498g = j2;
        this.f9497f = j4;
        this.f9499h = j3;
        this.f9500i = str;
        this.f9501j = i2;
        this.f9502k = obj;
    }

    /* JADX INFO: renamed from: c */
    public static String m12102c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return HttpMethods.HEAD;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public b m12103a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public final String m12104b() {
        return m12102c(this.f9494c);
    }

    /* JADX INFO: renamed from: d */
    public boolean m12105d(int i) {
        return (this.f9501j & i) == i;
    }

    /* JADX INFO: renamed from: e */
    public C2047a m12106e(long j) {
        long j2 = this.f9499h;
        return m12107f(j, j2 != -1 ? j2 - j : -1L);
    }

    /* JADX INFO: renamed from: f */
    public C2047a m12107f(long j, long j2) {
        return (j == 0 && this.f9499h == j2) ? this : new C2047a(this.f9492a, this.f9493b, this.f9494c, this.f9495d, this.f9496e, this.f9498g + j, j2, this.f9500i, this.f9501j, this.f9502k);
    }

    public String toString() {
        return "DataSpec[" + m12104b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f9492a + ", " + this.f9498g + ", " + this.f9499h + ", " + this.f9500i + ", " + this.f9501j + Constants.AES_SUFFIX;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Uri f9503a;

        /* JADX INFO: renamed from: b */
        public long f9504b;

        /* JADX INFO: renamed from: c */
        public int f9505c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public byte[] f9506d;

        /* JADX INFO: renamed from: e */
        public Map<String, String> f9507e;

        /* JADX INFO: renamed from: f */
        public long f9508f;

        /* JADX INFO: renamed from: g */
        public long f9509g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f9510h;

        /* JADX INFO: renamed from: i */
        public int f9511i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Object f9512j;

        public b(C2047a c2047a) {
            this.f9503a = c2047a.f9492a;
            this.f9504b = c2047a.f9493b;
            this.f9505c = c2047a.f9494c;
            this.f9506d = c2047a.f9495d;
            this.f9507e = c2047a.f9496e;
            this.f9508f = c2047a.f9498g;
            this.f9509g = c2047a.f9499h;
            this.f9510h = c2047a.f9500i;
            this.f9511i = c2047a.f9501j;
            this.f9512j = c2047a.f9502k;
        }

        /* JADX INFO: renamed from: a */
        public C2047a m12108a() {
            p11.m167016j(this.f9503a, "The uri must be set.");
            return new C2047a(this.f9503a, this.f9504b, this.f9505c, this.f9506d, this.f9507e, this.f9508f, this.f9509g, this.f9510h, this.f9511i, this.f9512j);
        }

        /* JADX INFO: renamed from: b */
        public b m12109b(int i) {
            this.f9511i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m12110c(@Nullable byte[] bArr) {
            this.f9506d = bArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m12111d(int i) {
            this.f9505c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m12112e(Map<String, String> map) {
            this.f9507e = map;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m12113f(@Nullable String str) {
            this.f9510h = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m12114g(long j) {
            this.f9509g = j;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m12115h(long j) {
            this.f9508f = j;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m12116i(Uri uri) {
            this.f9503a = uri;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m12117j(String str) {
            this.f9503a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f9505c = 1;
            this.f9507e = Collections.EMPTY_MAP;
            this.f9509g = -1L;
        }
    }

    public C2047a(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C2047a(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }
}
