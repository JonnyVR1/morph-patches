package com.google.android.exoplayer2.source;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.source.C1973q;
import java.io.IOException;
import p149l.d860;
import p149l.jwv;
import p149l.m6j0;
import p149l.n200;
import p149l.p11;
import p149l.pmf0;
import p149l.sj0;
import p149l.uyi;
import p149l.vck0;
import p149l.vz5;
import p149l.w4c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.q */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1973q implements m6j0 {

    /* JADX INFO: renamed from: A */
    @Nullable
    public C1871k f8761A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public C1871k f8762B;

    /* JADX INFO: renamed from: C */
    public long f8763C;

    /* JADX INFO: renamed from: D */
    public boolean f8764D;

    /* JADX INFO: renamed from: E */
    public boolean f8765E;

    /* JADX INFO: renamed from: F */
    public long f8766F;

    /* JADX INFO: renamed from: G */
    public boolean f8767G;

    /* JADX INFO: renamed from: a */
    public final C1972p f8768a;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InterfaceC1855c f8771d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final InterfaceC1854b.a f8772e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d f8773f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public C1871k f8774g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DrmSession f8775h;

    /* JADX INFO: renamed from: p */
    public int f8783p;

    /* JADX INFO: renamed from: q */
    public int f8784q;

    /* JADX INFO: renamed from: r */
    public int f8785r;

    /* JADX INFO: renamed from: s */
    public int f8786s;

    /* JADX INFO: renamed from: w */
    public boolean f8790w;

    /* JADX INFO: renamed from: z */
    public boolean f8793z;

    /* JADX INFO: renamed from: b */
    public final b f8769b = new b();

    /* JADX INFO: renamed from: i */
    public int f8776i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f8777j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f8778k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f8781n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f8780m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f8779l = new int[1000];

    /* JADX INFO: renamed from: o */
    public m6j0.C18401a[] f8782o = new m6j0.C18401a[1000];

    /* JADX INFO: renamed from: c */
    public final pmf0<c> f8770c = new pmf0<>(new vz5() { // from class: l.uod0
        @Override // p149l.vz5
        public final void accept(Object obj) {
            ((C1973q.c) obj).f8798b.release();
        }
    });

    /* JADX INFO: renamed from: t */
    public long f8787t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f8788u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f8789v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f8792y = true;

    /* JADX INFO: renamed from: x */
    public boolean f8791x = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f8794a;

        /* JADX INFO: renamed from: b */
        public long f8795b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public m6j0.C18401a f8796c;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final C1871k f8797a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1855c.b f8798b;

        public c(C1871k c1871k, InterfaceC1855c.b bVar) {
            this.f8797a = c1871k;
            this.f8798b = bVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo11360a(C1871k c1871k);
    }

    public C1973q(sj0 sj0Var, @Nullable InterfaceC1855c interfaceC1855c, @Nullable InterfaceC1854b.a aVar) {
        this.f8771d = interfaceC1855c;
        this.f8772e = aVar;
        this.f8768a = new C1972p(sj0Var);
    }

    /* JADX INFO: renamed from: k */
    public static C1973q m11411k(sj0 sj0Var, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar) {
        return new C1973q(sj0Var, (InterfaceC1855c) p11.m167011e(interfaceC1855c), (InterfaceC1854b.a) p11.m167011e(aVar));
    }

    /* JADX INFO: renamed from: l */
    public static C1973q m11412l(sj0 sj0Var) {
        return new C1973q(sj0Var, null, null);
    }

    /* JADX INFO: renamed from: A */
    public final synchronized long m11413A() {
        return Math.max(this.f8788u, m11414B(this.f8786s));
    }

    /* JADX INFO: renamed from: B */
    public final long m11414B(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM11416D = m11416D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f8781n[iM11416D]);
            if ((this.f8780m[iM11416D] & 1) != 0) {
                return jMax;
            }
            iM11416D--;
            if (iM11416D == -1) {
                iM11416D = this.f8776i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: C */
    public final int m11415C() {
        return this.f8784q + this.f8786s;
    }

    /* JADX INFO: renamed from: D */
    public final int m11416D(int i) {
        int i2 = this.f8785r + i;
        int i3 = this.f8776i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized int m11417E(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int iM11416D = m11416D(this.f8786s);
                if (!m11420H() || j < this.f8781n[iM11416D]) {
                    return 0;
                }
                if (j <= this.f8789v || !z) {
                    int iM11457v = m11457v(iM11416D, this.f8783p - this.f8786s, j, true);
                    if (iM11457v == -1) {
                        return 0;
                    }
                    return iM11457v;
                }
                try {
                    return this.f8783p - this.f8786s;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final synchronized C1871k m11418F() {
        return this.f8792y ? null : this.f8762B;
    }

    /* JADX INFO: renamed from: G */
    public final int m11419G() {
        return this.f8784q + this.f8783p;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m11420H() {
        return this.f8786s != this.f8783p;
    }

    /* JADX INFO: renamed from: I */
    public final void m11421I() {
        this.f8793z = true;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized boolean m11422J() {
        return this.f8790w;
    }

    @CallSuper
    /* JADX INFO: renamed from: K */
    public synchronized boolean m11423K(boolean z) {
        C1871k c1871k;
        boolean z2 = true;
        if (m11420H()) {
            if (this.f8770c.m170328f(m11415C()).f8797a != this.f8774g) {
                return true;
            }
            return m11424L(m11416D(this.f8786s));
        }
        if (!z && !this.f8790w && ((c1871k = this.f8762B) == null || c1871k == this.f8774g)) {
            z2 = false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m11424L(int i) {
        DrmSession drmSession = this.f8775h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f8780m[i] & 1073741824) == 0 && this.f8775h.mo9828c();
    }

    @CallSuper
    /* JADX INFO: renamed from: M */
    public void m11425M() throws IOException {
        DrmSession drmSession = this.f8775h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) p11.m167011e(this.f8775h.mo9826a()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11426N(C1871k c1871k, uyi uyiVar) {
        C1871k c1871k2 = this.f8774g;
        boolean z = c1871k2 == null;
        DrmInitData drmInitData = z ? null : c1871k2.f7751o;
        this.f8774g = c1871k;
        DrmInitData drmInitData2 = c1871k.f7751o;
        InterfaceC1855c interfaceC1855c = this.f8771d;
        uyiVar.f178866b = interfaceC1855c != null ? c1871k.m10283c(interfaceC1855c.mo9876c(c1871k)) : c1871k;
        uyiVar.f178865a = this.f8775h;
        if (this.f8771d == null) {
            return;
        }
        if (z || !vck0.m197845c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f8775h;
            DrmSession drmSessionMo9874a = this.f8771d.mo9874a(this.f8772e, c1871k);
            this.f8775h = drmSessionMo9874a;
            uyiVar.f178865a = drmSessionMo9874a;
            if (drmSession != null) {
                drmSession.mo9827b(this.f8772e);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final synchronized int m11427O(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, b bVar) {
        try {
            decoderInputBuffer.f7376d = false;
            if (!m11420H()) {
                if (!z2 && !this.f8790w) {
                    C1871k c1871k = this.f8762B;
                    if (c1871k == null || (!z && c1871k == this.f8774g)) {
                        return -3;
                    }
                    m11426N((C1871k) p11.m167011e(c1871k), uyiVar);
                    return -5;
                }
                decoderInputBuffer.m154499t(4);
                return -4;
            }
            C1871k c1871k2 = this.f8770c.m170328f(m11415C()).f8797a;
            if (!z && c1871k2 == this.f8774g) {
                int iM11416D = m11416D(this.f8786s);
                if (!m11424L(iM11416D)) {
                    decoderInputBuffer.f7376d = true;
                    return -3;
                }
                decoderInputBuffer.m154499t(this.f8780m[iM11416D]);
                if (this.f8786s == this.f8783p - 1 && (z2 || this.f8790w)) {
                    decoderInputBuffer.m154490h(536870912);
                }
                long j = this.f8781n[iM11416D];
                decoderInputBuffer.f7377e = j;
                if (j < this.f8787t) {
                    decoderInputBuffer.m154490h(Integer.MIN_VALUE);
                }
                bVar.f8794a = this.f8779l[iM11416D];
                bVar.f8795b = this.f8778k[iM11416D];
                bVar.f8796c = this.f8782o[iM11416D];
                return -4;
            }
            m11426N(c1871k2, uyiVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: P */
    public final synchronized long m11428P() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return m11420H() ? this.f8777j[m11416D(this.f8786s)] : this.f8763C;
    }

    @CallSuper
    /* JADX INFO: renamed from: Q */
    public void m11429Q() {
        m11453r();
        m11432T();
    }

    @CallSuper
    /* JADX INFO: renamed from: R */
    public int m11430R(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int iM11427O = m11427O(uyiVar, decoderInputBuffer, (i & 2) != 0, z, this.f8769b);
        if (iM11427O == -4 && !decoderInputBuffer.m154495p()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                C1972p c1972p = this.f8768a;
                if (z2) {
                    c1972p.m11397f(decoderInputBuffer, this.f8769b);
                } else {
                    c1972p.m11400m(decoderInputBuffer, this.f8769b);
                }
            }
            if (!z2) {
                this.f8786s++;
            }
        }
        return iM11427O;
    }

    @CallSuper
    /* JADX INFO: renamed from: S */
    public void m11431S() {
        m11434V(true);
        m11432T();
    }

    /* JADX INFO: renamed from: T */
    public final void m11432T() {
        DrmSession drmSession = this.f8775h;
        if (drmSession != null) {
            drmSession.mo9827b(this.f8772e);
            this.f8775h = null;
            this.f8774g = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11433U() {
        m11434V(false);
    }

    @CallSuper
    /* JADX INFO: renamed from: V */
    public void m11434V(boolean z) {
        this.f8768a.m11401n();
        this.f8783p = 0;
        this.f8784q = 0;
        this.f8785r = 0;
        this.f8786s = 0;
        this.f8791x = true;
        this.f8787t = Long.MIN_VALUE;
        this.f8788u = Long.MIN_VALUE;
        this.f8789v = Long.MIN_VALUE;
        this.f8790w = false;
        this.f8770c.m170325c();
        if (z) {
            this.f8761A = null;
            this.f8762B = null;
            this.f8792y = true;
        }
    }

    /* JADX INFO: renamed from: W */
    public final synchronized void m11435W() {
        this.f8786s = 0;
        this.f8768a.m11402o();
    }

    /* JADX INFO: renamed from: X */
    public final synchronized boolean m11436X(int i) {
        m11435W();
        int i2 = this.f8784q;
        if (i >= i2 && i <= this.f8783p + i2) {
            this.f8787t = Long.MIN_VALUE;
            this.f8786s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized boolean m11437Y(long j, boolean z) throws Throwable {
        try {
            try {
                m11435W();
                int iM11416D = m11416D(this.f8786s);
                if (!m11420H() || j < this.f8781n[iM11416D] || (j > this.f8789v && !z)) {
                    return false;
                }
                int iM11457v = m11457v(iM11416D, this.f8783p - this.f8786s, j, true);
                if (iM11457v == -1) {
                    return false;
                }
                this.f8787t = j;
                this.f8786s += iM11457v;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m11438Z(long j) {
        if (this.f8766F != j) {
            this.f8766F = j;
            m11421I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    @Override // p149l.m6j0
    /* JADX INFO: renamed from: a */
    public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
        int i4;
        if (this.f8793z) {
            mo11110b((C1871k) p11.m167015i(this.f8761A));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.f8791x) {
            if (!z) {
                return;
            } else {
                this.f8791x = false;
            }
        }
        long j2 = this.f8766F + j;
        if (!this.f8764D) {
            i4 = i;
        } else {
            if (j2 < this.f8787t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f8765E) {
                    jwv.m143689i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f8762B);
                    this.f8765E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f8767G) {
            if (!z || !m11445h(j2)) {
                return;
            } else {
                this.f8767G = false;
            }
        }
        m11446i(j2, i4, (this.f8768a.m11396e() - ((long) i2)) - ((long) i3), i2, c18401a);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11439a0(long j) {
        this.f8787t = j;
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: b */
    public final void mo11110b(C1871k c1871k) {
        C1871k c1871kMo11458w = mo11458w(c1871k);
        this.f8793z = false;
        this.f8761A = c1871k;
        boolean zM11440b0 = m11440b0(c1871kMo11458w);
        d dVar = this.f8773f;
        if (dVar == null || !zM11440b0) {
            return;
        }
        dVar.mo11360a(c1871kMo11458w);
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean m11440b0(C1871k c1871k) {
        try {
            this.f8792y = false;
            if (vck0.m197845c(c1871k, this.f8762B)) {
                return false;
            }
            if (this.f8770c.m170330h() || !this.f8770c.m170329g().f8797a.equals(c1871k)) {
                this.f8762B = c1871k;
            } else {
                this.f8762B = this.f8770c.m170329g().f8797a;
            }
            C1871k c1871k2 = this.f8762B;
            this.f8764D = n200.m157519a(c1871k2.f7748l, c1871k2.f7745i);
            this.f8765E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: c */
    public final int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException {
        return this.f8768a.m11403p(w4cVar, i, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11441c0(@Nullable d dVar) {
        this.f8773f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: d0 */
    public final synchronized void m11442d0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f8786s + i <= this.f8783p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        p11.m167007a(z);
        this.f8786s += i;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11443e0(long j) {
        this.f8763C = j;
    }

    @Override // p149l.m6j0
    /* JADX INFO: renamed from: f */
    public final void mo11112f(d860 d860Var, int i, int i2) {
        this.f8768a.m11404q(d860Var, i);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11444f0() {
        this.f8767G = true;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m11445h(long j) {
        if (this.f8783p == 0) {
            return j > this.f8788u;
        }
        if (m11413A() >= j) {
            return false;
        }
        m11455t(this.f8784q + m11447j(j));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m11446i(long j, int i, long j2, int i2, @Nullable m6j0.C18401a c18401a) {
        try {
            int i3 = this.f8783p;
            if (i3 > 0) {
                int iM11416D = m11416D(i3 - 1);
                p11.m167007a(this.f8778k[iM11416D] + ((long) this.f8779l[iM11416D]) <= j2);
            }
            this.f8790w = (536870912 & i) != 0;
            this.f8789v = Math.max(this.f8789v, j);
            int iM11416D2 = m11416D(this.f8783p);
            this.f8781n[iM11416D2] = j;
            this.f8778k[iM11416D2] = j2;
            this.f8779l[iM11416D2] = i2;
            this.f8780m[iM11416D2] = i;
            this.f8782o[iM11416D2] = c18401a;
            this.f8777j[iM11416D2] = this.f8763C;
            if (this.f8770c.m170330h() || !this.f8770c.m170329g().f8797a.equals(this.f8762B)) {
                InterfaceC1855c interfaceC1855c = this.f8771d;
                this.f8770c.m170324b(m11419G(), new c((C1871k) p11.m167011e(this.f8762B), interfaceC1855c != null ? interfaceC1855c.mo9875b(this.f8772e, this.f8762B) : InterfaceC1855c.b.f7468a));
            }
            int i4 = this.f8783p + 1;
            this.f8783p = i4;
            int i5 = this.f8776i;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                m6j0.C18401a[] c18401aArr = new m6j0.C18401a[i6];
                int i7 = this.f8785r;
                int i8 = i5 - i7;
                System.arraycopy(this.f8778k, i7, jArr2, 0, i8);
                System.arraycopy(this.f8781n, this.f8785r, jArr3, 0, i8);
                System.arraycopy(this.f8780m, this.f8785r, iArr, 0, i8);
                System.arraycopy(this.f8779l, this.f8785r, iArr2, 0, i8);
                System.arraycopy(this.f8782o, this.f8785r, c18401aArr, 0, i8);
                System.arraycopy(this.f8777j, this.f8785r, jArr, 0, i8);
                int i9 = this.f8785r;
                System.arraycopy(this.f8778k, 0, jArr2, i8, i9);
                System.arraycopy(this.f8781n, 0, jArr3, i8, i9);
                System.arraycopy(this.f8780m, 0, iArr, i8, i9);
                System.arraycopy(this.f8779l, 0, iArr2, i8, i9);
                System.arraycopy(this.f8782o, 0, c18401aArr, i8, i9);
                System.arraycopy(this.f8777j, 0, jArr, i8, i9);
                this.f8778k = jArr2;
                this.f8781n = jArr3;
                this.f8780m = iArr;
                this.f8779l = iArr2;
                this.f8782o = c18401aArr;
                this.f8777j = jArr;
                this.f8785r = 0;
                this.f8776i = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m11447j(long j) {
        int i = this.f8783p;
        int iM11416D = m11416D(i - 1);
        while (i > this.f8786s && this.f8781n[iM11416D] >= j) {
            i--;
            iM11416D--;
            if (iM11416D == -1) {
                iM11416D = this.f8776i - 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized long m11448m(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.f8783p;
                if (i != 0) {
                    long[] jArr = this.f8781n;
                    int i2 = this.f8785r;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.f8786s;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iM11457v = m11457v(i2, i, j, z);
                        if (iM11457v == -1) {
                            return -1L;
                        }
                        return m11451p(iM11457v);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized long m11449n() {
        int i = this.f8783p;
        if (i == 0) {
            return -1L;
        }
        return m11451p(i);
    }

    /* JADX INFO: renamed from: o */
    public synchronized long m11450o() {
        int i = this.f8786s;
        if (i == 0) {
            return -1L;
        }
        return m11451p(i);
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: p */
    public final long m11451p(int i) {
        this.f8788u = Math.max(this.f8788u, m11414B(i));
        this.f8783p -= i;
        int i2 = this.f8784q + i;
        this.f8784q = i2;
        int i3 = this.f8785r + i;
        this.f8785r = i3;
        int i4 = this.f8776i;
        if (i3 >= i4) {
            this.f8785r = i3 - i4;
        }
        int i5 = this.f8786s - i;
        this.f8786s = i5;
        if (i5 < 0) {
            this.f8786s = 0;
        }
        this.f8770c.m170327e(i2);
        if (this.f8783p != 0) {
            return this.f8778k[this.f8785r];
        }
        int i6 = this.f8785r;
        if (i6 == 0) {
            i6 = this.f8776i;
        }
        int i7 = i6 - 1;
        return this.f8778k[i7] + ((long) this.f8779l[i7]);
    }

    /* JADX INFO: renamed from: q */
    public final void m11452q(long j, boolean z, boolean z2) {
        this.f8768a.m11394b(m11448m(j, z, z2));
    }

    /* JADX INFO: renamed from: r */
    public final void m11453r() {
        this.f8768a.m11394b(m11449n());
    }

    /* JADX INFO: renamed from: s */
    public final void m11454s() {
        this.f8768a.m11394b(m11450o());
    }

    /* JADX INFO: renamed from: t */
    public final long m11455t(int i) {
        int iM11419G = m11419G() - i;
        boolean z = false;
        p11.m167007a(iM11419G >= 0 && iM11419G <= this.f8783p - this.f8786s);
        int i2 = this.f8783p - iM11419G;
        this.f8783p = i2;
        this.f8789v = Math.max(this.f8788u, m11414B(i2));
        if (iM11419G == 0 && this.f8790w) {
            z = true;
        }
        this.f8790w = z;
        this.f8770c.m170326d(i);
        int i3 = this.f8783p;
        if (i3 == 0) {
            return 0L;
        }
        int iM11416D = m11416D(i3 - 1);
        return this.f8778k[iM11416D] + ((long) this.f8779l[iM11416D]);
    }

    /* JADX INFO: renamed from: u */
    public final void m11456u(int i) {
        this.f8768a.m11395c(m11455t(i));
    }

    /* JADX INFO: renamed from: v */
    public final int m11457v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f8781n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f8780m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f8776i) {
                i = 0;
            }
        }
        return i3;
    }

    @CallSuper
    /* JADX INFO: renamed from: w */
    public C1871k mo11458w(C1871k c1871k) {
        return (this.f8766F == 0 || c1871k.f7752p == Long.MAX_VALUE) ? c1871k : c1871k.m10282b().m10350k0(c1871k.f7752p + this.f8766F).m10320G();
    }

    /* JADX INFO: renamed from: x */
    public final int m11459x() {
        return this.f8784q;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized long m11460y() {
        return this.f8783p == 0 ? Long.MIN_VALUE : this.f8781n[this.f8785r];
    }

    /* JADX INFO: renamed from: z */
    public final synchronized long m11461z() {
        return this.f8789v;
    }
}
