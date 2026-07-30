package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1951q;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.source.C1974f;
import com.google.android.exoplayer2.source.C1975g;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.bf80;
import p153l.bmk0;
import p153l.dk0;
import p153l.g6y;
import p153l.ktx;
import p153l.kyv;
import p153l.mtv;
import p153l.n8f0;
import p153l.oj0;
import p153l.pgj0;
import p153l.sxk;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.q */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1951q {

    /* JADX INFO: renamed from: a */
    public final bf80 f8259a;

    /* JADX INFO: renamed from: e */
    public final d f8263e;

    /* JADX INFO: renamed from: h */
    public final dk0 f8266h;

    /* JADX INFO: renamed from: i */
    public final sxk f8267i;

    /* JADX INFO: renamed from: k */
    public boolean f8269k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public pgj0 f8270l;

    /* JADX INFO: renamed from: j */
    public n8f0 f8268j = new n8f0.C18822a(0);

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<InterfaceC1976h, c> f8261c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d */
    public final Map<Object, c> f8262d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<c> f8260b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap<c, b> f8264f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final Set<c> f8265g = new HashSet();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$a */
    public final class a implements InterfaceC1989j, InterfaceC1877b {

        /* JADX INFO: renamed from: a */
        public final c f8271a;

        public a(c cVar) {
            this.f8271a = cVar;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: B */
        public void mo10940B(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.q6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f155921a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10940B(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, mtvVar, ktxVar);
                    }
                });
            }
        }

        @Nullable
        /* JADX INFO: renamed from: F */
        public final Pair<Integer, InterfaceC1988i.b> m10941F(int i, @Nullable InterfaceC1988i.b bVar) {
            InterfaceC1988i.b bVar2 = null;
            if (bVar != null) {
                InterfaceC1988i.b bVarM10904n = C1951q.m10904n(this.f8271a, bVar);
                if (bVarM10904n == null) {
                    return null;
                }
                bVar2 = bVarM10904n;
            }
            return Pair.create(Integer.valueOf(C1951q.m10907s(this.f8271a, i)), bVar2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: L */
        public void mo10942L(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.o6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f145221a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10942L(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, mtvVar, ktxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: N */
        public void mo9966N(int i, @Nullable InterfaceC1988i.b bVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.k6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f124223a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9966N(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: P */
        public void mo9967P(int i, @Nullable InterfaceC1988i.b bVar, final int i2) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.p6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f150884a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9967P(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, i2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: Q */
        public void mo9968Q(int i, @Nullable InterfaceC1988i.b bVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.t6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f172384a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9968Q(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: V */
        public void mo10943V(int i, @Nullable InterfaceC1988i.b bVar, final ktx ktxVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.s6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f166621a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10943V(((Integer) pair.first).intValue(), (InterfaceC1988i.b) w11.m204369e((InterfaceC1988i.b) pair.second), ktxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: Y */
        public void mo10944Y(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.i6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f113202a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10944Y(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, mtvVar, ktxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: Z */
        public void mo10945Z(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar, final IOException iOException, final boolean z) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.r6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f161513a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10945Z(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, mtvVar, ktxVar, iOException, z);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: a0 */
        public void mo9969a0(int i, @Nullable InterfaceC1988i.b bVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.j6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f118614a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9969a0(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: j0 */
        public void mo9971j0(int i, @Nullable InterfaceC1988i.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.n6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f140501a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9971j0(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: p0 */
        public void mo10946p0(int i, @Nullable InterfaceC1988i.b bVar, final ktx ktxVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.l6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f130309a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo10946p0(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second, ktxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: q0 */
        public void mo9972q0(int i, @Nullable InterfaceC1988i.b bVar) {
            final Pair<Integer, InterfaceC1988i.b> pairM10941F = m10941F(i, bVar);
            if (pairM10941F != null) {
                C1951q.this.f8267i.mo131271i(new Runnable() { // from class: l.m6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1951q.a aVar = this.f135040a;
                        Pair pair = pairM10941F;
                        C1951q.this.f8266h.mo9972q0(((Integer) pair.first).intValue(), (InterfaceC1988i.b) pair.second);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1988i f8273a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1988i.c f8274b;

        /* JADX INFO: renamed from: c */
        public final a f8275c;

        public b(InterfaceC1988i interfaceC1988i, InterfaceC1988i.c cVar, a aVar) {
            this.f8273a = interfaceC1988i;
            this.f8274b = cVar;
            this.f8275c = aVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$c */
    public static final class c implements g6y {

        /* JADX INFO: renamed from: a */
        public final C1975g f8276a;

        /* JADX INFO: renamed from: d */
        public int f8279d;

        /* JADX INFO: renamed from: e */
        public boolean f8280e;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC1988i.b> f8278c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f8277b = new Object();

        public c(InterfaceC1988i interfaceC1988i, boolean z) {
            this.f8276a = new C1975g(interfaceC1988i, z);
        }

        @Override // p153l.g6y
        /* JADX INFO: renamed from: a */
        public Object mo10188a() {
            return this.f8277b;
        }

        @Override // p153l.g6y
        /* JADX INFO: renamed from: b */
        public AbstractC1857c0 mo10189b() {
            return this.f8276a.m11196x();
        }

        /* JADX INFO: renamed from: c */
        public void m10947c(int i) {
            this.f8279d = i;
            this.f8280e = false;
            this.f8278c.clear();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$d */
    public interface d {
        /* JADX INFO: renamed from: d */
        void mo10256d();
    }

    public C1951q(d dVar, dk0 dk0Var, sxk sxkVar, bf80 bf80Var) {
        this.f8259a = bf80Var;
        this.f8263e = dVar;
        this.f8266h = dk0Var;
        this.f8267i = sxkVar;
    }

    /* JADX INFO: renamed from: m */
    public static Object m10903m(Object obj) {
        return AbstractC1820a.m9442z(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static InterfaceC1988i.b m10904n(c cVar, InterfaceC1988i.b bVar) {
        for (int i = 0; i < cVar.f8278c.size(); i++) {
            if (cVar.f8278c.get(i).f101425d == bVar.f101425d) {
                return bVar.m11323c(m10906p(cVar, bVar.f101422a));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static Object m10905o(Object obj) {
        return AbstractC1820a.m9440A(obj);
    }

    /* JADX INFO: renamed from: p */
    public static Object m10906p(c cVar, Object obj) {
        return AbstractC1820a.m9441C(cVar.f8277b, obj);
    }

    /* JADX INFO: renamed from: s */
    public static int m10907s(c cVar, int i) {
        return i + cVar.f8279d;
    }

    /* JADX INFO: renamed from: A */
    public AbstractC1857c0 m10908A(int i, int i2, n8f0 n8f0Var) {
        w11.m204365a(i >= 0 && i <= i2 && i2 <= m10920r());
        this.f8268j = n8f0Var;
        m10909B(i, i2);
        return m10915i();
    }

    /* JADX INFO: renamed from: B */
    public final void m10909B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVarRemove = this.f8260b.remove(i3);
            this.f8262d.remove(cVarRemove.f8277b);
            m10913g(i3, -cVarRemove.f8276a.m11196x().mo9775t());
            cVarRemove.f8280e = true;
            if (this.f8269k) {
                m10922u(cVarRemove);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public AbstractC1857c0 m10910C(List<c> list, n8f0 n8f0Var) {
        m10909B(0, this.f8260b.size());
        return m10912f(this.f8260b.size(), list, n8f0Var);
    }

    /* JADX INFO: renamed from: D */
    public AbstractC1857c0 m10911D(n8f0 n8f0Var) {
        int iM10920r = m10920r();
        if (n8f0Var.getLength() != iM10920r) {
            n8f0Var = n8f0Var.mo161916d().mo161919g(0, iM10920r);
        }
        this.f8268j = n8f0Var;
        return m10915i();
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1857c0 m10912f(int i, List<c> list, n8f0 n8f0Var) {
        if (!list.isEmpty()) {
            this.f8268j = n8f0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.f8260b.get(i2 - 1);
                    cVar.m10947c(cVar2.f8279d + cVar2.f8276a.m11196x().mo9775t());
                } else {
                    cVar.m10947c(0);
                }
                m10913g(i2, cVar.f8276a.m11196x().mo9775t());
                this.f8260b.add(i2, cVar);
                this.f8262d.put(cVar.f8277b, cVar);
                if (this.f8269k) {
                    m10925x(cVar);
                    if (this.f8261c.isEmpty()) {
                        this.f8265g.add(cVar);
                    } else {
                        m10916j(cVar);
                    }
                }
            }
        }
        return m10915i();
    }

    /* JADX INFO: renamed from: g */
    public final void m10913g(int i, int i2) {
        while (i < this.f8260b.size()) {
            this.f8260b.get(i).f8279d += i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC1976h m10914h(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        Object objM10905o = m10905o(bVar.f101422a);
        InterfaceC1988i.b bVarM11323c = bVar.m11323c(m10903m(bVar.f101422a));
        c cVar = (c) w11.m204369e(this.f8262d.get(objM10905o));
        m10918l(cVar);
        cVar.f8278c.add(bVarM11323c);
        C1974f c1974fCreatePeriod = cVar.f8276a.createPeriod(bVarM11323c, oj0Var, j);
        this.f8261c.put(c1974fCreatePeriod, cVar);
        m10917k();
        return c1974fCreatePeriod;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC1857c0 m10915i() {
        if (this.f8260b.isEmpty()) {
            return AbstractC1857c0.f7326a;
        }
        int iMo9775t = 0;
        for (int i = 0; i < this.f8260b.size(); i++) {
            c cVar = this.f8260b.get(i);
            cVar.f8279d = iMo9775t;
            iMo9775t += cVar.f8276a.m11196x().mo9775t();
        }
        return new C2080v(this.f8260b, this.f8268j);
    }

    /* JADX INFO: renamed from: j */
    public final void m10916j(c cVar) {
        b bVar = this.f8264f.get(cVar);
        if (bVar != null) {
            bVar.f8273a.disable(bVar.f8274b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10917k() {
        Iterator<c> it = this.f8265g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f8278c.isEmpty()) {
                m10916j(next);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10918l(c cVar) {
        this.f8265g.add(cVar);
        b bVar = this.f8264f.get(cVar);
        if (bVar != null) {
            bVar.f8273a.enable(bVar.f8274b);
        }
    }

    /* JADX INFO: renamed from: q */
    public n8f0 m10919q() {
        return this.f8268j;
    }

    /* JADX INFO: renamed from: r */
    public int m10920r() {
        return this.f8260b.size();
    }

    /* JADX INFO: renamed from: t */
    public boolean m10921t() {
        return this.f8269k;
    }

    /* JADX INFO: renamed from: u */
    public final void m10922u(c cVar) {
        if (cVar.f8280e && cVar.f8278c.isEmpty()) {
            b bVar = (b) w11.m204369e(this.f8264f.remove(cVar));
            bVar.f8273a.releaseSource(bVar.f8274b);
            bVar.f8273a.removeEventListener(bVar.f8275c);
            bVar.f8273a.removeDrmEventListener(bVar.f8275c);
            this.f8265g.remove(cVar);
        }
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1857c0 m10923v(int i, int i2, int i3, n8f0 n8f0Var) {
        w11.m204365a(i >= 0 && i <= i2 && i2 <= m10920r() && i3 >= 0);
        this.f8268j = n8f0Var;
        if (i == i2 || i == i3) {
            return m10915i();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int iMo9775t = this.f8260b.get(iMin).f8279d;
        bmk0.m105082I0(this.f8260b, i, i2, i3);
        while (iMin <= iMax) {
            c cVar = this.f8260b.get(iMin);
            cVar.f8279d = iMo9775t;
            iMo9775t += cVar.f8276a.m11196x().mo9775t();
            iMin++;
        }
        return m10915i();
    }

    /* JADX INFO: renamed from: w */
    public void m10924w(@Nullable pgj0 pgj0Var) {
        w11.m204371g(!this.f8269k);
        this.f8270l = pgj0Var;
        for (int i = 0; i < this.f8260b.size(); i++) {
            c cVar = this.f8260b.get(i);
            m10925x(cVar);
            this.f8265g.add(cVar);
        }
        this.f8269k = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m10925x(c cVar) {
        C1975g c1975g = cVar.f8276a;
        InterfaceC1988i.c cVar2 = new InterfaceC1988i.c() { // from class: l.h6y
            @Override // com.google.android.exoplayer2.source.InterfaceC1988i.c
            /* JADX INFO: renamed from: a */
            public final void mo11324a(InterfaceC1988i interfaceC1988i, AbstractC1857c0 abstractC1857c0) {
                this.f108066a.f8263e.mo10256d();
            }
        };
        a aVar = new a(cVar);
        this.f8264f.put(cVar, new b(c1975g, cVar2, aVar));
        c1975g.addEventListener(bmk0.m105178y(), aVar);
        c1975g.addDrmEventListener(bmk0.m105178y(), aVar);
        c1975g.prepareSource(cVar2, this.f8270l, this.f8259a);
    }

    /* JADX INFO: renamed from: y */
    public void m10926y() {
        for (b bVar : this.f8264f.values()) {
            try {
                bVar.f8273a.releaseSource(bVar.f8274b);
            } catch (RuntimeException e) {
                kyv.m152146d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f8273a.removeEventListener(bVar.f8275c);
            bVar.f8273a.removeDrmEventListener(bVar.f8275c);
        }
        this.f8264f.clear();
        this.f8265g.clear();
        this.f8269k = false;
    }

    /* JADX INFO: renamed from: z */
    public void m10927z(InterfaceC1976h interfaceC1976h) {
        c cVar = (c) w11.m204369e(this.f8261c.remove(interfaceC1976h));
        cVar.f8276a.releasePeriod(interfaceC1976h);
        cVar.f8278c.remove(((C1974f) interfaceC1976h).f8500a);
        if (!this.f8261c.isEmpty()) {
            m10917k();
        }
        m10922u(cVar);
    }
}
