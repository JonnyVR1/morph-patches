package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1928q;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.source.C1951f;
import com.google.android.exoplayer2.source.C1952g;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.cvk;
import p149l.g0f0;
import p149l.hk0;
import p149l.jwv;
import p149l.jxx;
import p149l.l7j0;
import p149l.lrv;
import p149l.nkx;
import p149l.p11;
import p149l.sj0;
import p149l.v680;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.q */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1928q {

    /* JADX INFO: renamed from: a */
    public final v680 f8222a;

    /* JADX INFO: renamed from: e */
    public final d f8226e;

    /* JADX INFO: renamed from: h */
    public final hk0 f8229h;

    /* JADX INFO: renamed from: i */
    public final cvk f8230i;

    /* JADX INFO: renamed from: k */
    public boolean f8232k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public l7j0 f8233l;

    /* JADX INFO: renamed from: j */
    public g0f0 f8231j = new g0f0.C16972a(0);

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<InterfaceC1953h, c> f8224c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d */
    public final Map<Object, c> f8225d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<c> f8223b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap<c, b> f8227f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final Set<c> f8228g = new HashSet();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$a */
    public final class a implements InterfaceC1966j, InterfaceC1854b {

        /* JADX INFO: renamed from: a */
        public final c f8234a;

        public a(c cVar) {
            this.f8234a = cVar;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: B */
        public void mo10886B(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.txx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f172541a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10886B(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, lrvVar, nkxVar);
                    }
                });
            }
        }

        @Nullable
        /* JADX INFO: renamed from: F */
        public final Pair<Integer, InterfaceC1965i.b> m10887F(int i, @Nullable InterfaceC1965i.b bVar) {
            InterfaceC1965i.b bVar2 = null;
            if (bVar != null) {
                InterfaceC1965i.b bVarM10850n = C1928q.m10850n(this.f8234a, bVar);
                if (bVarM10850n == null) {
                    return null;
                }
                bVar2 = bVarM10850n;
            }
            return Pair.create(Integer.valueOf(C1928q.m10853s(this.f8234a, i)), bVar2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: L */
        public void mo10888L(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.rxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f161521a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10888L(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, lrvVar, nkxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: N */
        public void mo9912N(int i, @Nullable InterfaceC1965i.b bVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.nxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f141070a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9912N(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: P */
        public void mo9913P(int i, @Nullable InterfaceC1965i.b bVar, final int i2) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.sxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f166839a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9913P(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, i2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: Q */
        public void mo9914Q(int i, @Nullable InterfaceC1965i.b bVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.wxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f188530a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9914Q(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: V */
        public void mo10889V(int i, @Nullable InterfaceC1965i.b bVar, final nkx nkxVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.vxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f183482a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10889V(((Integer) pair.first).intValue(), (InterfaceC1965i.b) p11.m167011e((InterfaceC1965i.b) pair.second), nkxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: Y */
        public void mo10890Y(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.lxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f130451a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10890Y(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, lrvVar, nkxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: Z */
        public void mo10891Z(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar, final IOException iOException, final boolean z) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.uxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f178775a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10891Z(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, lrvVar, nkxVar, iOException, z);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: a0 */
        public void mo9915a0(int i, @Nullable InterfaceC1965i.b bVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.mxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f136232a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9915a0(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: j0 */
        public void mo9917j0(int i, @Nullable InterfaceC1965i.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.qxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f156876a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9917j0(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: p0 */
        public void mo10892p0(int i, @Nullable InterfaceC1965i.b bVar, final nkx nkxVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.oxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f146259a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo10892p0(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second, nkxVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: q0 */
        public void mo9918q0(int i, @Nullable InterfaceC1965i.b bVar) {
            final Pair<Integer, InterfaceC1965i.b> pairM10887F = m10887F(i, bVar);
            if (pairM10887F != null) {
                C1928q.this.f8230i.mo108865a(new Runnable() { // from class: l.pxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1928q.a aVar = this.f151738a;
                        Pair pair = pairM10887F;
                        C1928q.this.f8229h.mo9918q0(((Integer) pair.first).intValue(), (InterfaceC1965i.b) pair.second);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1965i f8236a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1965i.c f8237b;

        /* JADX INFO: renamed from: c */
        public final a f8238c;

        public b(InterfaceC1965i interfaceC1965i, InterfaceC1965i.c cVar, a aVar) {
            this.f8236a = interfaceC1965i;
            this.f8237b = cVar;
            this.f8238c = aVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$c */
    public static final class c implements jxx {

        /* JADX INFO: renamed from: a */
        public final C1952g f8239a;

        /* JADX INFO: renamed from: d */
        public int f8242d;

        /* JADX INFO: renamed from: e */
        public boolean f8243e;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC1965i.b> f8241c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f8240b = new Object();

        public c(InterfaceC1965i interfaceC1965i, boolean z) {
            this.f8239a = new C1952g(interfaceC1965i, z);
        }

        @Override // p149l.jxx
        /* JADX INFO: renamed from: a */
        public Object mo10134a() {
            return this.f8240b;
        }

        @Override // p149l.jxx
        /* JADX INFO: renamed from: b */
        public AbstractC1834c0 mo10135b() {
            return this.f8239a.m11142x();
        }

        /* JADX INFO: renamed from: c */
        public void m10893c(int i) {
            this.f8242d = i;
            this.f8243e = false;
            this.f8241c.clear();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.q$d */
    public interface d {
        /* JADX INFO: renamed from: d */
        void mo10202d();
    }

    public C1928q(d dVar, hk0 hk0Var, cvk cvkVar, v680 v680Var) {
        this.f8222a = v680Var;
        this.f8226e = dVar;
        this.f8229h = hk0Var;
        this.f8230i = cvkVar;
    }

    /* JADX INFO: renamed from: m */
    public static Object m10849m(Object obj) {
        return AbstractC1797a.m9388z(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static InterfaceC1965i.b m10850n(c cVar, InterfaceC1965i.b bVar) {
        for (int i = 0; i < cVar.f8241c.size(); i++) {
            if (cVar.f8241c.get(i).f114358d == bVar.f114358d) {
                return bVar.m11269c(m10852p(cVar, bVar.f114355a));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static Object m10851o(Object obj) {
        return AbstractC1797a.m9386A(obj);
    }

    /* JADX INFO: renamed from: p */
    public static Object m10852p(c cVar, Object obj) {
        return AbstractC1797a.m9387C(cVar.f8240b, obj);
    }

    /* JADX INFO: renamed from: s */
    public static int m10853s(c cVar, int i) {
        return i + cVar.f8242d;
    }

    /* JADX INFO: renamed from: A */
    public AbstractC1834c0 m10854A(int i, int i2, g0f0 g0f0Var) {
        p11.m167007a(i >= 0 && i <= i2 && i2 <= m10866r());
        this.f8231j = g0f0Var;
        m10855B(i, i2);
        return m10861i();
    }

    /* JADX INFO: renamed from: B */
    public final void m10855B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVarRemove = this.f8223b.remove(i3);
            this.f8225d.remove(cVarRemove.f8240b);
            m10859g(i3, -cVarRemove.f8239a.m11142x().mo9721t());
            cVarRemove.f8243e = true;
            if (this.f8232k) {
                m10868u(cVarRemove);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public AbstractC1834c0 m10856C(List<c> list, g0f0 g0f0Var) {
        m10855B(0, this.f8223b.size());
        return m10858f(this.f8223b.size(), list, g0f0Var);
    }

    /* JADX INFO: renamed from: D */
    public AbstractC1834c0 m10857D(g0f0 g0f0Var) {
        int iM10866r = m10866r();
        if (g0f0Var.getLength() != iM10866r) {
            g0f0Var = g0f0Var.mo123965d().mo123968g(0, iM10866r);
        }
        this.f8231j = g0f0Var;
        return m10861i();
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1834c0 m10858f(int i, List<c> list, g0f0 g0f0Var) {
        if (!list.isEmpty()) {
            this.f8231j = g0f0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.f8223b.get(i2 - 1);
                    cVar.m10893c(cVar2.f8242d + cVar2.f8239a.m11142x().mo9721t());
                } else {
                    cVar.m10893c(0);
                }
                m10859g(i2, cVar.f8239a.m11142x().mo9721t());
                this.f8223b.add(i2, cVar);
                this.f8225d.put(cVar.f8240b, cVar);
                if (this.f8232k) {
                    m10871x(cVar);
                    if (this.f8224c.isEmpty()) {
                        this.f8228g.add(cVar);
                    } else {
                        m10862j(cVar);
                    }
                }
            }
        }
        return m10861i();
    }

    /* JADX INFO: renamed from: g */
    public final void m10859g(int i, int i2) {
        while (i < this.f8223b.size()) {
            this.f8223b.get(i).f8242d += i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC1953h m10860h(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        Object objM10851o = m10851o(bVar.f114355a);
        InterfaceC1965i.b bVarM11269c = bVar.m11269c(m10849m(bVar.f114355a));
        c cVar = (c) p11.m167011e(this.f8225d.get(objM10851o));
        m10864l(cVar);
        cVar.f8241c.add(bVarM11269c);
        C1951f c1951fCreatePeriod = cVar.f8239a.createPeriod(bVarM11269c, sj0Var, j);
        this.f8224c.put(c1951fCreatePeriod, cVar);
        m10863k();
        return c1951fCreatePeriod;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC1834c0 m10861i() {
        if (this.f8223b.isEmpty()) {
            return AbstractC1834c0.f7289a;
        }
        int iMo9721t = 0;
        for (int i = 0; i < this.f8223b.size(); i++) {
            c cVar = this.f8223b.get(i);
            cVar.f8242d = iMo9721t;
            iMo9721t += cVar.f8239a.m11142x().mo9721t();
        }
        return new C2057v(this.f8223b, this.f8231j);
    }

    /* JADX INFO: renamed from: j */
    public final void m10862j(c cVar) {
        b bVar = this.f8227f.get(cVar);
        if (bVar != null) {
            bVar.f8236a.disable(bVar.f8237b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10863k() {
        Iterator<c> it = this.f8228g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f8241c.isEmpty()) {
                m10862j(next);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10864l(c cVar) {
        this.f8228g.add(cVar);
        b bVar = this.f8227f.get(cVar);
        if (bVar != null) {
            bVar.f8236a.enable(bVar.f8237b);
        }
    }

    /* JADX INFO: renamed from: q */
    public g0f0 m10865q() {
        return this.f8231j;
    }

    /* JADX INFO: renamed from: r */
    public int m10866r() {
        return this.f8223b.size();
    }

    /* JADX INFO: renamed from: t */
    public boolean m10867t() {
        return this.f8232k;
    }

    /* JADX INFO: renamed from: u */
    public final void m10868u(c cVar) {
        if (cVar.f8243e && cVar.f8241c.isEmpty()) {
            b bVar = (b) p11.m167011e(this.f8227f.remove(cVar));
            bVar.f8236a.releaseSource(bVar.f8237b);
            bVar.f8236a.removeEventListener(bVar.f8238c);
            bVar.f8236a.removeDrmEventListener(bVar.f8238c);
            this.f8228g.remove(cVar);
        }
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1834c0 m10869v(int i, int i2, int i3, g0f0 g0f0Var) {
        p11.m167007a(i >= 0 && i <= i2 && i2 <= m10866r() && i3 >= 0);
        this.f8231j = g0f0Var;
        if (i == i2 || i == i3) {
            return m10861i();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int iMo9721t = this.f8223b.get(iMin).f8242d;
        vck0.m197804I0(this.f8223b, i, i2, i3);
        while (iMin <= iMax) {
            c cVar = this.f8223b.get(iMin);
            cVar.f8242d = iMo9721t;
            iMo9721t += cVar.f8239a.m11142x().mo9721t();
            iMin++;
        }
        return m10861i();
    }

    /* JADX INFO: renamed from: w */
    public void m10870w(@Nullable l7j0 l7j0Var) {
        p11.m167013g(!this.f8232k);
        this.f8233l = l7j0Var;
        for (int i = 0; i < this.f8223b.size(); i++) {
            c cVar = this.f8223b.get(i);
            m10871x(cVar);
            this.f8228g.add(cVar);
        }
        this.f8232k = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m10871x(c cVar) {
        C1952g c1952g = cVar.f8239a;
        InterfaceC1965i.c cVar2 = new InterfaceC1965i.c() { // from class: l.kxx
            @Override // com.google.android.exoplayer2.source.InterfaceC1965i.c
            /* JADX INFO: renamed from: a */
            public final void mo11270a(InterfaceC1965i interfaceC1965i, AbstractC1834c0 abstractC1834c0) {
                this.f125232a.f8226e.mo10202d();
            }
        };
        a aVar = new a(cVar);
        this.f8227f.put(cVar, new b(c1952g, cVar2, aVar));
        c1952g.addEventListener(vck0.m197900y(), aVar);
        c1952g.addDrmEventListener(vck0.m197900y(), aVar);
        c1952g.prepareSource(cVar2, this.f8233l, this.f8222a);
    }

    /* JADX INFO: renamed from: y */
    public void m10872y() {
        for (b bVar : this.f8227f.values()) {
            try {
                bVar.f8236a.releaseSource(bVar.f8237b);
            } catch (RuntimeException e) {
                jwv.m143684d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f8236a.removeEventListener(bVar.f8238c);
            bVar.f8236a.removeDrmEventListener(bVar.f8238c);
        }
        this.f8227f.clear();
        this.f8228g.clear();
        this.f8232k = false;
    }

    /* JADX INFO: renamed from: z */
    public void m10873z(InterfaceC1953h interfaceC1953h) {
        c cVar = (c) p11.m167011e(this.f8224c.remove(interfaceC1953h));
        cVar.f8239a.releasePeriod(interfaceC1953h);
        cVar.f8241c.remove(((C1951f) interfaceC1953h).f8463a);
        if (!this.f8224c.isEmpty()) {
            m10863k();
        }
        m10868u(cVar);
    }
}
