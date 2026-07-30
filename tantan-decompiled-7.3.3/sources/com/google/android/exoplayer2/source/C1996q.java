package com.google.android.exoplayer2.source;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.source.C1996q;
import java.io.IOException;
import p153l.a16;
import p153l.bmk0;
import p153l.e6c;
import p153l.ig60;
import p153l.kb00;
import p153l.kyv;
import p153l.oj0;
import p153l.p1j;
import p153l.qfj0;
import p153l.w11;
import p153l.yuf0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.q */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1996q implements qfj0 {

    /* JADX INFO: renamed from: A */
    @Nullable
    public C1894k f8798A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public C1894k f8799B;

    /* JADX INFO: renamed from: C */
    public long f8800C;

    /* JADX INFO: renamed from: D */
    public boolean f8801D;

    /* JADX INFO: renamed from: E */
    public boolean f8802E;

    /* JADX INFO: renamed from: F */
    public long f8803F;

    /* JADX INFO: renamed from: G */
    public boolean f8804G;

    /* JADX INFO: renamed from: a */
    public final C1995p f8805a;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final InterfaceC1878c f8808d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final InterfaceC1877b.a f8809e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d f8810f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public C1894k f8811g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DrmSession f8812h;

    /* JADX INFO: renamed from: p */
    public int f8820p;

    /* JADX INFO: renamed from: q */
    public int f8821q;

    /* JADX INFO: renamed from: r */
    public int f8822r;

    /* JADX INFO: renamed from: s */
    public int f8823s;

    /* JADX INFO: renamed from: w */
    public boolean f8827w;

    /* JADX INFO: renamed from: z */
    public boolean f8830z;

    /* JADX INFO: renamed from: b */
    public final b f8806b = new b();

    /* JADX INFO: renamed from: i */
    public int f8813i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f8814j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f8815k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f8818n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f8817m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f8816l = new int[1000];

    /* JADX INFO: renamed from: o */
    public qfj0.C19562a[] f8819o = new qfj0.C19562a[1000];

    /* JADX INFO: renamed from: c */
    public final yuf0<c> f8807c = new yuf0<>(new a16() { // from class: l.wwd0
        @Override // p153l.a16
        public final void accept(Object obj) {
            ((C1996q.c) obj).f8835b.release();
        }
    });

    /* JADX INFO: renamed from: t */
    public long f8824t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f8825u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f8826v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f8829y = true;

    /* JADX INFO: renamed from: x */
    public boolean f8828x = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f8831a;

        /* JADX INFO: renamed from: b */
        public long f8832b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public qfj0.C19562a f8833c;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final C1894k f8834a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1878c.b f8835b;

        public c(C1894k c1894k, InterfaceC1878c.b bVar) {
            this.f8834a = c1894k;
            this.f8835b = bVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo11414a(C1894k c1894k);
    }

    public C1996q(oj0 oj0Var, @Nullable InterfaceC1878c interfaceC1878c, @Nullable InterfaceC1877b.a aVar) {
        this.f8808d = interfaceC1878c;
        this.f8809e = aVar;
        this.f8805a = new C1995p(oj0Var);
    }

    /* JADX INFO: renamed from: k */
    public static C1996q m11465k(oj0 oj0Var, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar) {
        return new C1996q(oj0Var, (InterfaceC1878c) w11.m204369e(interfaceC1878c), (InterfaceC1877b.a) w11.m204369e(aVar));
    }

    /* JADX INFO: renamed from: l */
    public static C1996q m11466l(oj0 oj0Var) {
        return new C1996q(oj0Var, null, null);
    }

    /* JADX INFO: renamed from: A */
    public final synchronized long m11467A() {
        return Math.max(this.f8825u, m11468B(this.f8823s));
    }

    /* JADX INFO: renamed from: B */
    public final long m11468B(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM11470D = m11470D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f8818n[iM11470D]);
            if ((this.f8817m[iM11470D] & 1) != 0) {
                return jMax;
            }
            iM11470D--;
            if (iM11470D == -1) {
                iM11470D = this.f8813i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: C */
    public final int m11469C() {
        return this.f8821q + this.f8823s;
    }

    /* JADX INFO: renamed from: D */
    public final int m11470D(int i) {
        int i2 = this.f8822r + i;
        int i3 = this.f8813i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized int m11471E(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int iM11470D = m11470D(this.f8823s);
                if (!m11474H() || j < this.f8818n[iM11470D]) {
                    return 0;
                }
                if (j <= this.f8826v || !z) {
                    int iM11511v = m11511v(iM11470D, this.f8820p - this.f8823s, j, true);
                    if (iM11511v == -1) {
                        return 0;
                    }
                    return iM11511v;
                }
                try {
                    return this.f8820p - this.f8823s;
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
    public final synchronized C1894k m11472F() {
        return this.f8829y ? null : this.f8799B;
    }

    /* JADX INFO: renamed from: G */
    public final int m11473G() {
        return this.f8821q + this.f8820p;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m11474H() {
        return this.f8823s != this.f8820p;
    }

    /* JADX INFO: renamed from: I */
    public final void m11475I() {
        this.f8830z = true;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized boolean m11476J() {
        return this.f8827w;
    }

    @CallSuper
    /* JADX INFO: renamed from: K */
    public synchronized boolean m11477K(boolean z) {
        C1894k c1894k;
        boolean z2 = true;
        if (m11474H()) {
            if (this.f8807c.m217380f(m11469C()).f8834a != this.f8811g) {
                return true;
            }
            return m11478L(m11470D(this.f8823s));
        }
        if (!z && !this.f8827w && ((c1894k = this.f8799B) == null || c1894k == this.f8811g)) {
            z2 = false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m11478L(int i) {
        DrmSession drmSession = this.f8812h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f8817m[i] & 1073741824) == 0 && this.f8812h.mo9882c();
    }

    @CallSuper
    /* JADX INFO: renamed from: M */
    public void m11479M() throws IOException {
        DrmSession drmSession = this.f8812h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) w11.m204369e(this.f8812h.mo9880a()));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11480N(C1894k c1894k, p1j p1jVar) {
        C1894k c1894k2 = this.f8811g;
        boolean z = c1894k2 == null;
        DrmInitData drmInitData = z ? null : c1894k2.f7788o;
        this.f8811g = c1894k;
        DrmInitData drmInitData2 = c1894k.f7788o;
        InterfaceC1878c interfaceC1878c = this.f8808d;
        p1jVar.f150174b = interfaceC1878c != null ? c1894k.m10337c(interfaceC1878c.mo9930c(c1894k)) : c1894k;
        p1jVar.f150173a = this.f8812h;
        if (this.f8808d == null) {
            return;
        }
        if (z || !bmk0.m105123c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f8812h;
            DrmSession drmSessionMo9928a = this.f8808d.mo9928a(this.f8809e, c1894k);
            this.f8812h = drmSessionMo9928a;
            p1jVar.f150173a = drmSessionMo9928a;
            if (drmSession != null) {
                drmSession.mo9881b(this.f8809e);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final synchronized int m11481O(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, b bVar) {
        try {
            decoderInputBuffer.f7413d = false;
            if (!m11474H()) {
                if (!z2 && !this.f8827w) {
                    C1894k c1894k = this.f8799B;
                    if (c1894k == null || (!z && c1894k == this.f8811g)) {
                        return -3;
                    }
                    m11480N((C1894k) w11.m204369e(c1894k), p1jVar);
                    return -5;
                }
                decoderInputBuffer.m97783t(4);
                return -4;
            }
            C1894k c1894k2 = this.f8807c.m217380f(m11469C()).f8834a;
            if (!z && c1894k2 == this.f8811g) {
                int iM11470D = m11470D(this.f8823s);
                if (!m11478L(iM11470D)) {
                    decoderInputBuffer.f7413d = true;
                    return -3;
                }
                decoderInputBuffer.m97783t(this.f8817m[iM11470D]);
                if (this.f8823s == this.f8820p - 1 && (z2 || this.f8827w)) {
                    decoderInputBuffer.m97774h(536870912);
                }
                long j = this.f8818n[iM11470D];
                decoderInputBuffer.f7414e = j;
                if (j < this.f8824t) {
                    decoderInputBuffer.m97774h(Integer.MIN_VALUE);
                }
                bVar.f8831a = this.f8816l[iM11470D];
                bVar.f8832b = this.f8815k[iM11470D];
                bVar.f8833c = this.f8819o[iM11470D];
                return -4;
            }
            m11480N(c1894k2, p1jVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: P */
    public final synchronized long m11482P() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return m11474H() ? this.f8814j[m11470D(this.f8823s)] : this.f8800C;
    }

    @CallSuper
    /* JADX INFO: renamed from: Q */
    public void m11483Q() {
        m11507r();
        m11486T();
    }

    @CallSuper
    /* JADX INFO: renamed from: R */
    public int m11484R(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int iM11481O = m11481O(p1jVar, decoderInputBuffer, (i & 2) != 0, z, this.f8806b);
        if (iM11481O == -4 && !decoderInputBuffer.m97779p()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                C1995p c1995p = this.f8805a;
                if (z2) {
                    c1995p.m11451f(decoderInputBuffer, this.f8806b);
                } else {
                    c1995p.m11454m(decoderInputBuffer, this.f8806b);
                }
            }
            if (!z2) {
                this.f8823s++;
            }
        }
        return iM11481O;
    }

    @CallSuper
    /* JADX INFO: renamed from: S */
    public void m11485S() {
        m11488V(true);
        m11486T();
    }

    /* JADX INFO: renamed from: T */
    public final void m11486T() {
        DrmSession drmSession = this.f8812h;
        if (drmSession != null) {
            drmSession.mo9881b(this.f8809e);
            this.f8812h = null;
            this.f8811g = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11487U() {
        m11488V(false);
    }

    @CallSuper
    /* JADX INFO: renamed from: V */
    public void m11488V(boolean z) {
        this.f8805a.m11455n();
        this.f8820p = 0;
        this.f8821q = 0;
        this.f8822r = 0;
        this.f8823s = 0;
        this.f8828x = true;
        this.f8824t = Long.MIN_VALUE;
        this.f8825u = Long.MIN_VALUE;
        this.f8826v = Long.MIN_VALUE;
        this.f8827w = false;
        this.f8807c.m217377c();
        if (z) {
            this.f8798A = null;
            this.f8799B = null;
            this.f8829y = true;
        }
    }

    /* JADX INFO: renamed from: W */
    public final synchronized void m11489W() {
        this.f8823s = 0;
        this.f8805a.m11456o();
    }

    /* JADX INFO: renamed from: X */
    public final synchronized boolean m11490X(int i) {
        m11489W();
        int i2 = this.f8821q;
        if (i >= i2 && i <= this.f8820p + i2) {
            this.f8824t = Long.MIN_VALUE;
            this.f8823s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized boolean m11491Y(long j, boolean z) throws Throwable {
        try {
            try {
                m11489W();
                int iM11470D = m11470D(this.f8823s);
                if (!m11474H() || j < this.f8818n[iM11470D] || (j > this.f8826v && !z)) {
                    return false;
                }
                int iM11511v = m11511v(iM11470D, this.f8820p - this.f8823s, j, true);
                if (iM11511v == -1) {
                    return false;
                }
                this.f8824t = j;
                this.f8823s += iM11511v;
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
    public final void m11492Z(long j) {
        if (this.f8803F != j) {
            this.f8803F = j;
            m11475I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    @Override // p153l.qfj0
    /* JADX INFO: renamed from: a */
    public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
        int i4;
        if (this.f8830z) {
            mo11164b((C1894k) w11.m204373i(this.f8798A));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.f8828x) {
            if (!z) {
                return;
            } else {
                this.f8828x = false;
            }
        }
        long j2 = this.f8803F + j;
        if (!this.f8801D) {
            i4 = i;
        } else {
            if (j2 < this.f8824t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f8802E) {
                    kyv.m152151i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f8799B);
                    this.f8802E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f8804G) {
            if (!z || !m11499h(j2)) {
                return;
            } else {
                this.f8804G = false;
            }
        }
        m11500i(j2, i4, (this.f8805a.m11450e() - ((long) i2)) - ((long) i3), i2, c19562a);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11493a0(long j) {
        this.f8824t = j;
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: b */
    public final void mo11164b(C1894k c1894k) {
        C1894k c1894kMo11512w = mo11512w(c1894k);
        this.f8830z = false;
        this.f8798A = c1894k;
        boolean zM11494b0 = m11494b0(c1894kMo11512w);
        d dVar = this.f8810f;
        if (dVar == null || !zM11494b0) {
            return;
        }
        dVar.mo11414a(c1894kMo11512w);
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean m11494b0(C1894k c1894k) {
        try {
            this.f8829y = false;
            if (bmk0.m105123c(c1894k, this.f8799B)) {
                return false;
            }
            if (this.f8807c.m217382h() || !this.f8807c.m217381g().f8834a.equals(c1894k)) {
                this.f8799B = c1894k;
            } else {
                this.f8799B = this.f8807c.m217381g().f8834a;
            }
            C1894k c1894k2 = this.f8799B;
            this.f8801D = kb00.m149000a(c1894k2.f7785l, c1894k2.f7782i);
            this.f8802E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: c */
    public final int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException {
        return this.f8805a.m11457p(e6cVar, i, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11495c0(@Nullable d dVar) {
        this.f8810f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: d0 */
    public final synchronized void m11496d0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f8823s + i <= this.f8820p) {
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
        w11.m204365a(z);
        this.f8823s += i;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11497e0(long j) {
        this.f8800C = j;
    }

    @Override // p153l.qfj0
    /* JADX INFO: renamed from: f */
    public final void mo11166f(ig60 ig60Var, int i, int i2) {
        this.f8805a.m11458q(ig60Var, i);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11498f0() {
        this.f8804G = true;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m11499h(long j) {
        if (this.f8820p == 0) {
            return j > this.f8825u;
        }
        if (m11467A() >= j) {
            return false;
        }
        m11509t(this.f8821q + m11501j(j));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m11500i(long j, int i, long j2, int i2, @Nullable qfj0.C19562a c19562a) {
        try {
            int i3 = this.f8820p;
            if (i3 > 0) {
                int iM11470D = m11470D(i3 - 1);
                w11.m204365a(this.f8815k[iM11470D] + ((long) this.f8816l[iM11470D]) <= j2);
            }
            this.f8827w = (536870912 & i) != 0;
            this.f8826v = Math.max(this.f8826v, j);
            int iM11470D2 = m11470D(this.f8820p);
            this.f8818n[iM11470D2] = j;
            this.f8815k[iM11470D2] = j2;
            this.f8816l[iM11470D2] = i2;
            this.f8817m[iM11470D2] = i;
            this.f8819o[iM11470D2] = c19562a;
            this.f8814j[iM11470D2] = this.f8800C;
            if (this.f8807c.m217382h() || !this.f8807c.m217381g().f8834a.equals(this.f8799B)) {
                InterfaceC1878c interfaceC1878c = this.f8808d;
                this.f8807c.m217376b(m11473G(), new c((C1894k) w11.m204369e(this.f8799B), interfaceC1878c != null ? interfaceC1878c.mo9929b(this.f8809e, this.f8799B) : InterfaceC1878c.b.f7505a));
            }
            int i4 = this.f8820p + 1;
            this.f8820p = i4;
            int i5 = this.f8813i;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                qfj0.C19562a[] c19562aArr = new qfj0.C19562a[i6];
                int i7 = this.f8822r;
                int i8 = i5 - i7;
                System.arraycopy(this.f8815k, i7, jArr2, 0, i8);
                System.arraycopy(this.f8818n, this.f8822r, jArr3, 0, i8);
                System.arraycopy(this.f8817m, this.f8822r, iArr, 0, i8);
                System.arraycopy(this.f8816l, this.f8822r, iArr2, 0, i8);
                System.arraycopy(this.f8819o, this.f8822r, c19562aArr, 0, i8);
                System.arraycopy(this.f8814j, this.f8822r, jArr, 0, i8);
                int i9 = this.f8822r;
                System.arraycopy(this.f8815k, 0, jArr2, i8, i9);
                System.arraycopy(this.f8818n, 0, jArr3, i8, i9);
                System.arraycopy(this.f8817m, 0, iArr, i8, i9);
                System.arraycopy(this.f8816l, 0, iArr2, i8, i9);
                System.arraycopy(this.f8819o, 0, c19562aArr, i8, i9);
                System.arraycopy(this.f8814j, 0, jArr, i8, i9);
                this.f8815k = jArr2;
                this.f8818n = jArr3;
                this.f8817m = iArr;
                this.f8816l = iArr2;
                this.f8819o = c19562aArr;
                this.f8814j = jArr;
                this.f8822r = 0;
                this.f8813i = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m11501j(long j) {
        int i = this.f8820p;
        int iM11470D = m11470D(i - 1);
        while (i > this.f8823s && this.f8818n[iM11470D] >= j) {
            i--;
            iM11470D--;
            if (iM11470D == -1) {
                iM11470D = this.f8813i - 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized long m11502m(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.f8820p;
                if (i != 0) {
                    long[] jArr = this.f8818n;
                    int i2 = this.f8822r;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.f8823s;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iM11511v = m11511v(i2, i, j, z);
                        if (iM11511v == -1) {
                            return -1L;
                        }
                        return m11505p(iM11511v);
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
    public final synchronized long m11503n() {
        int i = this.f8820p;
        if (i == 0) {
            return -1L;
        }
        return m11505p(i);
    }

    /* JADX INFO: renamed from: o */
    public synchronized long m11504o() {
        int i = this.f8823s;
        if (i == 0) {
            return -1L;
        }
        return m11505p(i);
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: p */
    public final long m11505p(int i) {
        this.f8825u = Math.max(this.f8825u, m11468B(i));
        this.f8820p -= i;
        int i2 = this.f8821q + i;
        this.f8821q = i2;
        int i3 = this.f8822r + i;
        this.f8822r = i3;
        int i4 = this.f8813i;
        if (i3 >= i4) {
            this.f8822r = i3 - i4;
        }
        int i5 = this.f8823s - i;
        this.f8823s = i5;
        if (i5 < 0) {
            this.f8823s = 0;
        }
        this.f8807c.m217379e(i2);
        if (this.f8820p != 0) {
            return this.f8815k[this.f8822r];
        }
        int i6 = this.f8822r;
        if (i6 == 0) {
            i6 = this.f8813i;
        }
        int i7 = i6 - 1;
        return this.f8815k[i7] + ((long) this.f8816l[i7]);
    }

    /* JADX INFO: renamed from: q */
    public final void m11506q(long j, boolean z, boolean z2) {
        this.f8805a.m11448b(m11502m(j, z, z2));
    }

    /* JADX INFO: renamed from: r */
    public final void m11507r() {
        this.f8805a.m11448b(m11503n());
    }

    /* JADX INFO: renamed from: s */
    public final void m11508s() {
        this.f8805a.m11448b(m11504o());
    }

    /* JADX INFO: renamed from: t */
    public final long m11509t(int i) {
        int iM11473G = m11473G() - i;
        boolean z = false;
        w11.m204365a(iM11473G >= 0 && iM11473G <= this.f8820p - this.f8823s);
        int i2 = this.f8820p - iM11473G;
        this.f8820p = i2;
        this.f8826v = Math.max(this.f8825u, m11468B(i2));
        if (iM11473G == 0 && this.f8827w) {
            z = true;
        }
        this.f8827w = z;
        this.f8807c.m217378d(i);
        int i3 = this.f8820p;
        if (i3 == 0) {
            return 0L;
        }
        int iM11470D = m11470D(i3 - 1);
        return this.f8815k[iM11470D] + ((long) this.f8816l[iM11470D]);
    }

    /* JADX INFO: renamed from: u */
    public final void m11510u(int i) {
        this.f8805a.m11449c(m11509t(i));
    }

    /* JADX INFO: renamed from: v */
    public final int m11511v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f8818n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f8817m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f8813i) {
                i = 0;
            }
        }
        return i3;
    }

    @CallSuper
    /* JADX INFO: renamed from: w */
    public C1894k mo11512w(C1894k c1894k) {
        return (this.f8803F == 0 || c1894k.f7789p == Long.MAX_VALUE) ? c1894k : c1894k.m10336b().m10404k0(c1894k.f7789p + this.f8803F).m10374G();
    }

    /* JADX INFO: renamed from: x */
    public final int m11513x() {
        return this.f8821q;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized long m11514y() {
        return this.f8820p == 0 ? Long.MIN_VALUE : this.f8818n[this.f8822r];
    }

    /* JADX INFO: renamed from: z */
    public final synchronized long m11515z() {
        return this.f8826v;
    }
}
