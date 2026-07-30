package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import p149l.lwk;
import p149l.qkq0;
import p149l.sd5;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: renamed from: com.google.common.collect.l */
/* JADX INFO: loaded from: classes7.dex */
public class C2973l<K> {

    /* JADX INFO: renamed from: a */
    public transient Object[] f11206a;

    /* JADX INFO: renamed from: b */
    public transient int[] f11207b;

    /* JADX INFO: renamed from: c */
    public transient int f11208c;

    /* JADX INFO: renamed from: d */
    public transient int f11209d;

    /* JADX INFO: renamed from: e */
    public transient int[] f11210e;

    /* JADX INFO: renamed from: f */
    public transient long[] f11211f;

    /* JADX INFO: renamed from: g */
    public transient float f11212g;

    /* JADX INFO: renamed from: h */
    public transient int f11213h;

    /* JADX INFO: renamed from: com.google.common.collect.l$a */
    public class a extends Multisets.AbstractC2897b<K> {

        /* JADX INFO: renamed from: a */
        public final K f11214a;

        /* JADX INFO: renamed from: b */
        public int f11215b;

        public a(int i) {
            this.f11214a = (K) C2973l.this.f11206a[i];
            this.f11215b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m16294a() {
            int i = this.f11215b;
            if (i == -1 || i >= C2973l.this.m16273C() || !v050.m196470a(this.f11214a, C2973l.this.f11206a[this.f11215b])) {
                this.f11215b = C2973l.this.m16282m(this.f11214a);
            }
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public int getCount() {
            m16294a();
            int i = this.f11215b;
            if (i == -1) {
                return 0;
            }
            return C2973l.this.f11207b[i];
        }

        @Override // com.google.common.collect.InterfaceC2972k.a
        public K getElement() {
            return this.f11214a;
        }
    }

    public C2973l(C2973l<? extends K> c2973l) {
        mo16283n(c2973l.m16273C(), 1.0f);
        int iMo16276e = c2973l.mo16276e();
        while (iMo16276e != -1) {
            m16288u(c2973l.m16279i(iMo16276e), c2973l.m16280k(iMo16276e));
            iMo16276e = c2973l.mo16286s(iMo16276e);
        }
    }

    /* JADX INFO: renamed from: D */
    public static long m16264D(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & ((long) i));
    }

    /* JADX INFO: renamed from: b */
    public static <K> C2973l<K> m16265b() {
        return new C2973l<>();
    }

    /* JADX INFO: renamed from: c */
    public static <K> C2973l<K> m16266c(int i) {
        return new C2973l<>(i);
    }

    /* JADX INFO: renamed from: h */
    public static int m16267h(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: renamed from: j */
    public static int m16268j(long j) {
        return (int) j;
    }

    /* JADX INFO: renamed from: q */
    public static long[] m16269q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* JADX INFO: renamed from: r */
    public static int[] m16270r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: renamed from: A */
    public final void m16271A(int i) {
        if (this.f11210e.length >= 1073741824) {
            this.f11213h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i2 = ((int) (i * this.f11212g)) + 1;
        int[] iArrM16270r = m16270r(i);
        long[] jArr = this.f11211f;
        int length = iArrM16270r.length - 1;
        for (int i3 = 0; i3 < this.f11208c; i3++) {
            int iM16267h = m16267h(jArr[i3]);
            int i4 = iM16267h & length;
            int i5 = iArrM16270r[i4];
            iArrM16270r[i4] = i3;
            jArr[i3] = (((long) iM16267h) << 32) | (((long) i5) & 4294967295L);
        }
        this.f11213h = i2;
        this.f11210e = iArrM16270r;
    }

    /* JADX INFO: renamed from: B */
    public void m16272B(int i, int i2) {
        sf80.m183892n(i, this.f11208c);
        this.f11207b[i] = i2;
    }

    /* JADX INFO: renamed from: C */
    public int m16273C() {
        return this.f11208c;
    }

    /* JADX INFO: renamed from: a */
    public void mo16274a() {
        this.f11209d++;
        Arrays.fill(this.f11206a, 0, this.f11208c, (Object) null);
        Arrays.fill(this.f11207b, 0, this.f11208c, 0);
        Arrays.fill(this.f11210e, -1);
        Arrays.fill(this.f11211f, -1L);
        this.f11208c = 0;
    }

    /* JADX INFO: renamed from: d */
    public void m16275d(int i) {
        if (i > this.f11211f.length) {
            mo16292y(i);
        }
        if (i >= this.f11213h) {
            m16271A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo16276e() {
        return this.f11208c == 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public int m16277f(Object obj) {
        int iM16282m = m16282m(obj);
        if (iM16282m == -1) {
            return 0;
        }
        return this.f11207b[iM16282m];
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2972k.a<K> m16278g(int i) {
        sf80.m183892n(i, this.f11208c);
        return new a(i);
    }

    /* JADX INFO: renamed from: i */
    public K m16279i(int i) {
        sf80.m183892n(i, this.f11208c);
        return (K) this.f11206a[i];
    }

    /* JADX INFO: renamed from: k */
    public int m16280k(int i) {
        sf80.m183892n(i, this.f11208c);
        return this.f11207b[i];
    }

    /* JADX INFO: renamed from: l */
    public final int m16281l() {
        return this.f11210e.length - 1;
    }

    /* JADX INFO: renamed from: m */
    public int m16282m(Object obj) {
        int iM151974d = lwk.m151974d(obj);
        int iM16268j = this.f11210e[m16281l() & iM151974d];
        while (iM16268j != -1) {
            long j = this.f11211f[iM16268j];
            if (m16267h(j) == iM151974d && v050.m196470a(obj, this.f11206a[iM16268j])) {
                return iM16268j;
            }
            iM16268j = m16268j(j);
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public void mo16283n(int i, float f) {
        sf80.m183883e(i >= 0, "Initial capacity must be non-negative");
        sf80.m183883e(f > 0.0f, "Illegal load factor");
        int iM151971a = lwk.m151971a(i, f);
        this.f11210e = m16270r(iM151971a);
        this.f11212g = f;
        this.f11206a = new Object[i];
        this.f11207b = new int[i];
        this.f11211f = m16269q(i);
        this.f11213h = Math.max(1, (int) (iM151971a * f));
    }

    /* JADX INFO: renamed from: o */
    public void mo16284o(int i, K k, int i2, int i3) {
        this.f11211f[i] = (((long) i3) << 32) | 4294967295L;
        this.f11206a[i] = k;
        this.f11207b[i] = i2;
    }

    /* JADX INFO: renamed from: p */
    public void mo16285p(int i) {
        int iM16273C = m16273C() - 1;
        Object[] objArr = this.f11206a;
        if (i >= iM16273C) {
            objArr[i] = null;
            this.f11207b[i] = 0;
            this.f11211f[i] = -1;
            return;
        }
        objArr[i] = objArr[iM16273C];
        int[] iArr = this.f11207b;
        iArr[i] = iArr[iM16273C];
        objArr[iM16273C] = null;
        iArr[iM16273C] = 0;
        long[] jArr = this.f11211f;
        long j = jArr[iM16273C];
        jArr[i] = j;
        jArr[iM16273C] = -1;
        int iM16267h = m16267h(j) & m16281l();
        int[] iArr2 = this.f11210e;
        int i2 = iArr2[iM16267h];
        if (i2 == iM16273C) {
            iArr2[iM16267h] = i;
            return;
        }
        while (true) {
            long j2 = this.f11211f[i2];
            int iM16268j = m16268j(j2);
            if (iM16268j == iM16273C) {
                this.f11211f[i2] = m16264D(j2, i);
                return;
            }
            i2 = iM16268j;
        }
    }

    /* JADX INFO: renamed from: s */
    public int mo16286s(int i) {
        int i2 = i + 1;
        if (i2 < this.f11208c) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public int mo16287t(int i, int i2) {
        return i - 1;
    }

    /* JADX INFO: renamed from: u */
    public int m16288u(K k, int i) {
        sd5.m183446d(i, "count");
        long[] jArr = this.f11211f;
        Object[] objArr = this.f11206a;
        int[] iArr = this.f11207b;
        int iM151974d = lwk.m151974d(k);
        int iM16281l = m16281l() & iM151974d;
        int i2 = this.f11208c;
        int[] iArr2 = this.f11210e;
        int i3 = iArr2[iM16281l];
        if (i3 == -1) {
            iArr2[iM16281l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m16267h(j) == iM151974d && v050.m196470a(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int iM16268j = m16268j(j);
                if (iM16268j == -1) {
                    jArr[i3] = m16264D(j, i2);
                    break;
                }
                i3 = iM16268j;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            qkq0.m175383a("Cannot contain more than Integer.MAX_VALUE elements!");
            return 0;
        }
        int i5 = i2 + 1;
        m16293z(i5);
        mo16284o(i2, k, i, iM151974d);
        this.f11208c = i5;
        if (i2 >= this.f11213h) {
            m16271A(this.f11210e.length * 2);
        }
        this.f11209d++;
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public int m16289v(Object obj) {
        return m16290w(obj, lwk.m151974d(obj));
    }

    /* JADX INFO: renamed from: w */
    public final int m16290w(Object obj, int i) {
        int iM16281l = m16281l() & i;
        int i2 = this.f11210e[iM16281l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m16267h(this.f11211f[i2]) == i && v050.m196470a(obj, this.f11206a[i2])) {
                int i4 = this.f11207b[i2];
                if (i3 == -1) {
                    this.f11210e[iM16281l] = m16268j(this.f11211f[i2]);
                } else {
                    long[] jArr = this.f11211f;
                    jArr[i3] = m16264D(jArr[i3], m16268j(jArr[i2]));
                }
                mo16285p(i2);
                this.f11208c--;
                this.f11209d++;
                return i4;
            }
            int iM16268j = m16268j(this.f11211f[i2]);
            if (iM16268j == -1) {
                return 0;
            }
            i3 = i2;
            i2 = iM16268j;
        }
    }

    /* JADX INFO: renamed from: x */
    public int m16291x(int i) {
        return m16290w(this.f11206a[i], m16267h(this.f11211f[i]));
    }

    /* JADX INFO: renamed from: y */
    public void mo16292y(int i) {
        this.f11206a = Arrays.copyOf(this.f11206a, i);
        this.f11207b = Arrays.copyOf(this.f11207b, i);
        long[] jArr = this.f11211f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f11211f = jArrCopyOf;
    }

    /* JADX INFO: renamed from: z */
    public final void m16293z(int i) {
        int length = this.f11211f.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (iMax != length) {
                mo16292y(iMax);
            }
        }
    }

    public C2973l() {
        mo16283n(3, 1.0f);
    }

    public C2973l(int i) {
        this(i, 1.0f);
    }

    public C2973l(int i, float f) {
        mo16283n(i, f);
    }
}
