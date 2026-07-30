package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import p153l.bzk;
import p153l.k950;
import p153l.se5;
import p153l.wtq0;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.collect.l */
/* JADX INFO: loaded from: classes7.dex */
public class C2996l<K> {

    /* JADX INFO: renamed from: a */
    public transient Object[] f11243a;

    /* JADX INFO: renamed from: b */
    public transient int[] f11244b;

    /* JADX INFO: renamed from: c */
    public transient int f11245c;

    /* JADX INFO: renamed from: d */
    public transient int f11246d;

    /* JADX INFO: renamed from: e */
    public transient int[] f11247e;

    /* JADX INFO: renamed from: f */
    public transient long[] f11248f;

    /* JADX INFO: renamed from: g */
    public transient float f11249g;

    /* JADX INFO: renamed from: h */
    public transient int f11250h;

    /* JADX INFO: renamed from: com.google.common.collect.l$a */
    public class a extends Multisets.AbstractC2920b<K> {

        /* JADX INFO: renamed from: a */
        public final K f11251a;

        /* JADX INFO: renamed from: b */
        public int f11252b;

        public a(int i) {
            this.f11251a = (K) C2996l.this.f11243a[i];
            this.f11252b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m16348a() {
            int i = this.f11252b;
            if (i == -1 || i >= C2996l.this.m16327C() || !k950.m148863a(this.f11251a, C2996l.this.f11243a[this.f11252b])) {
                this.f11252b = C2996l.this.m16336m(this.f11251a);
            }
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public int getCount() {
            m16348a();
            int i = this.f11252b;
            if (i == -1) {
                return 0;
            }
            return C2996l.this.f11244b[i];
        }

        @Override // com.google.common.collect.InterfaceC2995k.a
        public K getElement() {
            return this.f11251a;
        }
    }

    public C2996l(C2996l<? extends K> c2996l) {
        mo16337n(c2996l.m16327C(), 1.0f);
        int iMo16330e = c2996l.mo16330e();
        while (iMo16330e != -1) {
            m16342u(c2996l.m16333i(iMo16330e), c2996l.m16334k(iMo16330e));
            iMo16330e = c2996l.mo16340s(iMo16330e);
        }
    }

    /* JADX INFO: renamed from: D */
    public static long m16318D(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & ((long) i));
    }

    /* JADX INFO: renamed from: b */
    public static <K> C2996l<K> m16319b() {
        return new C2996l<>();
    }

    /* JADX INFO: renamed from: c */
    public static <K> C2996l<K> m16320c(int i) {
        return new C2996l<>(i);
    }

    /* JADX INFO: renamed from: h */
    public static int m16321h(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: renamed from: j */
    public static int m16322j(long j) {
        return (int) j;
    }

    /* JADX INFO: renamed from: q */
    public static long[] m16323q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* JADX INFO: renamed from: r */
    public static int[] m16324r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: renamed from: A */
    public final void m16325A(int i) {
        if (this.f11247e.length >= 1073741824) {
            this.f11250h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i2 = ((int) (i * this.f11249g)) + 1;
        int[] iArrM16324r = m16324r(i);
        long[] jArr = this.f11248f;
        int length = iArrM16324r.length - 1;
        for (int i3 = 0; i3 < this.f11245c; i3++) {
            int iM16321h = m16321h(jArr[i3]);
            int i4 = iM16321h & length;
            int i5 = iArrM16324r[i4];
            iArrM16324r[i4] = i3;
            jArr[i3] = (((long) iM16321h) << 32) | (((long) i5) & 4294967295L);
        }
        this.f11250h = i2;
        this.f11247e = iArrM16324r;
    }

    /* JADX INFO: renamed from: B */
    public void m16326B(int i, int i2) {
        xn80.m212109n(i, this.f11245c);
        this.f11244b[i] = i2;
    }

    /* JADX INFO: renamed from: C */
    public int m16327C() {
        return this.f11245c;
    }

    /* JADX INFO: renamed from: a */
    public void mo16328a() {
        this.f11246d++;
        Arrays.fill(this.f11243a, 0, this.f11245c, (Object) null);
        Arrays.fill(this.f11244b, 0, this.f11245c, 0);
        Arrays.fill(this.f11247e, -1);
        Arrays.fill(this.f11248f, -1L);
        this.f11245c = 0;
    }

    /* JADX INFO: renamed from: d */
    public void m16329d(int i) {
        if (i > this.f11248f.length) {
            mo16346y(i);
        }
        if (i >= this.f11250h) {
            m16325A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo16330e() {
        return this.f11245c == 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public int m16331f(Object obj) {
        int iM16336m = m16336m(obj);
        if (iM16336m == -1) {
            return 0;
        }
        return this.f11244b[iM16336m];
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2995k.a<K> m16332g(int i) {
        xn80.m212109n(i, this.f11245c);
        return new a(i);
    }

    /* JADX INFO: renamed from: i */
    public K m16333i(int i) {
        xn80.m212109n(i, this.f11245c);
        return (K) this.f11243a[i];
    }

    /* JADX INFO: renamed from: k */
    public int m16334k(int i) {
        xn80.m212109n(i, this.f11245c);
        return this.f11244b[i];
    }

    /* JADX INFO: renamed from: l */
    public final int m16335l() {
        return this.f11247e.length - 1;
    }

    /* JADX INFO: renamed from: m */
    public int m16336m(Object obj) {
        int iM107166d = bzk.m107166d(obj);
        int iM16322j = this.f11247e[m16335l() & iM107166d];
        while (iM16322j != -1) {
            long j = this.f11248f[iM16322j];
            if (m16321h(j) == iM107166d && k950.m148863a(obj, this.f11243a[iM16322j])) {
                return iM16322j;
            }
            iM16322j = m16322j(j);
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public void mo16337n(int i, float f) {
        xn80.m212100e(i >= 0, "Initial capacity must be non-negative");
        xn80.m212100e(f > 0.0f, "Illegal load factor");
        int iM107163a = bzk.m107163a(i, f);
        this.f11247e = m16324r(iM107163a);
        this.f11249g = f;
        this.f11243a = new Object[i];
        this.f11244b = new int[i];
        this.f11248f = m16323q(i);
        this.f11250h = Math.max(1, (int) (iM107163a * f));
    }

    /* JADX INFO: renamed from: o */
    public void mo16338o(int i, K k, int i2, int i3) {
        this.f11248f[i] = (((long) i3) << 32) | 4294967295L;
        this.f11243a[i] = k;
        this.f11244b[i] = i2;
    }

    /* JADX INFO: renamed from: p */
    public void mo16339p(int i) {
        int iM16327C = m16327C() - 1;
        Object[] objArr = this.f11243a;
        if (i >= iM16327C) {
            objArr[i] = null;
            this.f11244b[i] = 0;
            this.f11248f[i] = -1;
            return;
        }
        objArr[i] = objArr[iM16327C];
        int[] iArr = this.f11244b;
        iArr[i] = iArr[iM16327C];
        objArr[iM16327C] = null;
        iArr[iM16327C] = 0;
        long[] jArr = this.f11248f;
        long j = jArr[iM16327C];
        jArr[i] = j;
        jArr[iM16327C] = -1;
        int iM16321h = m16321h(j) & m16335l();
        int[] iArr2 = this.f11247e;
        int i2 = iArr2[iM16321h];
        if (i2 == iM16327C) {
            iArr2[iM16321h] = i;
            return;
        }
        while (true) {
            long j2 = this.f11248f[i2];
            int iM16322j = m16322j(j2);
            if (iM16322j == iM16327C) {
                this.f11248f[i2] = m16318D(j2, i);
                return;
            }
            i2 = iM16322j;
        }
    }

    /* JADX INFO: renamed from: s */
    public int mo16340s(int i) {
        int i2 = i + 1;
        if (i2 < this.f11245c) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public int mo16341t(int i, int i2) {
        return i - 1;
    }

    /* JADX INFO: renamed from: u */
    public int m16342u(K k, int i) {
        se5.m185518d(i, "count");
        long[] jArr = this.f11248f;
        Object[] objArr = this.f11243a;
        int[] iArr = this.f11244b;
        int iM107166d = bzk.m107166d(k);
        int iM16335l = m16335l() & iM107166d;
        int i2 = this.f11245c;
        int[] iArr2 = this.f11247e;
        int i3 = iArr2[iM16335l];
        if (i3 == -1) {
            iArr2[iM16335l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m16321h(j) == iM107166d && k950.m148863a(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int iM16322j = m16322j(j);
                if (iM16322j == -1) {
                    jArr[i3] = m16318D(j, i2);
                    break;
                }
                i3 = iM16322j;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            wtq0.m207906a("Cannot contain more than Integer.MAX_VALUE elements!");
            return 0;
        }
        int i5 = i2 + 1;
        m16347z(i5);
        mo16338o(i2, k, i, iM107166d);
        this.f11245c = i5;
        if (i2 >= this.f11250h) {
            m16325A(this.f11247e.length * 2);
        }
        this.f11246d++;
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public int m16343v(Object obj) {
        return m16344w(obj, bzk.m107166d(obj));
    }

    /* JADX INFO: renamed from: w */
    public final int m16344w(Object obj, int i) {
        int iM16335l = m16335l() & i;
        int i2 = this.f11247e[iM16335l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m16321h(this.f11248f[i2]) == i && k950.m148863a(obj, this.f11243a[i2])) {
                int i4 = this.f11244b[i2];
                if (i3 == -1) {
                    this.f11247e[iM16335l] = m16322j(this.f11248f[i2]);
                } else {
                    long[] jArr = this.f11248f;
                    jArr[i3] = m16318D(jArr[i3], m16322j(jArr[i2]));
                }
                mo16339p(i2);
                this.f11245c--;
                this.f11246d++;
                return i4;
            }
            int iM16322j = m16322j(this.f11248f[i2]);
            if (iM16322j == -1) {
                return 0;
            }
            i3 = i2;
            i2 = iM16322j;
        }
    }

    /* JADX INFO: renamed from: x */
    public int m16345x(int i) {
        return m16344w(this.f11243a[i], m16321h(this.f11248f[i]));
    }

    /* JADX INFO: renamed from: y */
    public void mo16346y(int i) {
        this.f11243a = Arrays.copyOf(this.f11243a, i);
        this.f11244b = Arrays.copyOf(this.f11244b, i);
        long[] jArr = this.f11248f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f11248f = jArrCopyOf;
    }

    /* JADX INFO: renamed from: z */
    public final void m16347z(int i) {
        int length = this.f11248f.length;
        if (i > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (iMax != length) {
                mo16346y(iMax);
            }
        }
    }

    public C2996l() {
        mo16337n(3, 1.0f);
    }

    public C2996l(int i) {
        this(i, 1.0f);
    }

    public C2996l(int i, float f) {
        mo16337n(i, f);
    }
}
