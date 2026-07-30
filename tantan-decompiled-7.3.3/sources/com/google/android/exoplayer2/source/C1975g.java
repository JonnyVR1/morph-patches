package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p153l.bmk0;
import p153l.c3j;
import p153l.oj0;
import p153l.r70;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1975g extends AbstractC2025u {

    /* JADX INFO: renamed from: f */
    public final boolean f8509f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1857c0.d f8510g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1857c0.b f8511h;

    /* JADX INFO: renamed from: i */
    public a f8512i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public C1974f f8513j;

    /* JADX INFO: renamed from: k */
    public boolean f8514k;

    /* JADX INFO: renamed from: l */
    public boolean f8515l;

    /* JADX INFO: renamed from: m */
    public boolean f8516m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$a */
    public static final class a extends c3j {

        /* JADX INFO: renamed from: i */
        public static final Object f8517i = new Object();

        /* JADX INFO: renamed from: g */
        @Nullable
        public final Object f8518g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final Object f8519h;

        public a(AbstractC1857c0 abstractC1857c0, @Nullable Object obj, @Nullable Object obj2) {
            super(abstractC1857c0);
            this.f8518g = obj;
            this.f8519h = obj2;
        }

        /* JADX INFO: renamed from: y */
        public static a m11199y(C1944n c1944n) {
            return new a(new b(c1944n), AbstractC1857c0.d.f7356r, f8517i);
        }

        /* JADX INFO: renamed from: z */
        public static a m11200z(AbstractC1857c0 abstractC1857c0, @Nullable Object obj, @Nullable Object obj2) {
            return new a(abstractC1857c0, obj, obj2);
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: f */
        public int mo9450f(Object obj) {
            Object obj2;
            AbstractC1857c0 abstractC1857c0 = this.f79626f;
            if (f8517i.equals(obj) && (obj2 = this.f8519h) != null) {
                obj = obj2;
            }
            return abstractC1857c0.mo9450f(obj);
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            this.f79626f.mo9453k(i, bVar, z);
            if (bmk0.m105123c(bVar.f7338b, this.f8519h) && z) {
                bVar.f7338b = f8517i;
            }
            return bVar;
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: q */
        public Object mo9456q(int i) {
            Object objMo9456q = this.f79626f.mo9456q(i);
            return bmk0.m105123c(objMo9456q, this.f8519h) ? f8517i : objMo9456q;
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            this.f79626f.mo9457s(i, dVar, j);
            if (bmk0.m105123c(dVar.f7365a, this.f8518g)) {
                dVar.f7365a = AbstractC1857c0.d.f7356r;
            }
            return dVar;
        }

        /* JADX INFO: renamed from: x */
        public a m11201x(AbstractC1857c0 abstractC1857c0) {
            return new a(abstractC1857c0, this.f8518g, this.f8519h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$b */
    @VisibleForTesting
    public static final class b extends AbstractC1857c0 {

        /* JADX INFO: renamed from: f */
        public final C1944n f8520f;

        public b(C1944n c1944n) {
            this.f8520f = c1944n;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: f */
        public int mo9450f(Object obj) {
            return obj == a.f8517i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            bVar.m9800w(z ? 0 : null, z ? a.f8517i : null, 0, -9223372036854775807L, 0L, r70.f161545g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: m */
        public int mo9771m() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: q */
        public Object mo9456q(int i) {
            return a.f8517i;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            dVar.m9809i(AbstractC1857c0.d.f7356r, this.f8520f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f7376l = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: t */
        public int mo9775t() {
            return 1;
        }
    }

    public C1975g(InterfaceC1988i interfaceC1988i, boolean z) {
        super(interfaceC1988i);
        this.f8509f = z && interfaceC1988i.isSingleWindow();
        this.f8510g = new AbstractC1857c0.d();
        this.f8511h = new AbstractC1857c0.b();
        AbstractC1857c0 initialTimeline = interfaceC1988i.getInitialTimeline();
        if (initialTimeline == null) {
            this.f8512i = a.m11199y(interfaceC1988i.getMediaItem());
        } else {
            this.f8512i = a.m11200z(initialTimeline, null, null);
            this.f8516m = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2025u
    @Nullable
    /* JADX INFO: renamed from: h */
    public InterfaceC1988i.b mo11191h(InterfaceC1988i.b bVar) {
        return bVar.m11323c(m11194v(bVar.f101422a));
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.AbstractC2025u
    /* JADX INFO: renamed from: p */
    public void mo10967p(AbstractC1857c0 abstractC1857c0) {
        long j;
        InterfaceC1988i.b bVarM11323c;
        if (this.f8515l) {
            this.f8512i = this.f8512i.m11201x(abstractC1857c0);
            C1974f c1974f = this.f8513j;
            if (c1974f != null) {
                m11197y(c1974f.m11182n());
            }
        } else {
            if (!abstractC1857c0.m9776u()) {
                abstractC1857c0.m9774r(0, this.f8510g);
                long jM9805e = this.f8510g.m9805e();
                Object obj = this.f8510g.f7365a;
                C1974f c1974f2 = this.f8513j;
                if (c1974f2 != null) {
                    long jM11183o = c1974f2.m11183o();
                    this.f8512i.mo9454l(this.f8513j.f8500a.f101422a, this.f8511h);
                    long jM9794q = this.f8511h.m9794q() + jM11183o;
                    if (jM9794q != this.f8512i.m9774r(0, this.f8510g).m9805e()) {
                        j = jM9794q;
                    } else {
                        j = jM9805e;
                    }
                } else {
                    j = jM9805e;
                }
                Pair<Object, Long> pairM9772n = abstractC1857c0.m9772n(this.f8510g, this.f8511h, 0, j);
                Object obj2 = pairM9772n.first;
                long jLongValue = ((Long) pairM9772n.second).longValue();
                this.f8512i = this.f8516m ? this.f8512i.m11201x(abstractC1857c0) : a.m11200z(abstractC1857c0, obj, obj2);
                C1974f c1974f3 = this.f8513j;
                if (c1974f3 != null) {
                    m11197y(jLongValue);
                    InterfaceC1988i.b bVar = c1974f3.f8500a;
                    bVarM11323c = bVar.m11323c(m11195w(bVar.f101422a));
                }
                this.f8516m = true;
                this.f8515l = true;
                refreshSourceInfo(this.f8512i);
                if (bVarM11323c != null) {
                    ((C1974f) w11.m204369e(this.f8513j)).m11181b(bVarM11323c);
                }
            }
            this.f8512i = this.f8516m ? this.f8512i.m11201x(abstractC1857c0) : a.m11200z(abstractC1857c0, AbstractC1857c0.d.f7356r, a.f8517i);
        }
        bVarM11323c = null;
        this.f8516m = true;
        this.f8515l = true;
        refreshSourceInfo(this.f8512i);
        if (bVarM11323c != null) {
            ((C1974f) w11.m204369e(this.f8513j)).m11181b(bVarM11323c);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((C1974f) interfaceC1976h).m11187w();
        if (interfaceC1976h == this.f8513j) {
            this.f8513j = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        this.f8515l = false;
        this.f8514k = false;
        super.releaseSourceInternal();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2025u
    /* JADX INFO: renamed from: t */
    public void mo11192t() {
        if (this.f8509f) {
            return;
        }
        this.f8514k = true;
        m11795s();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C1974f createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        C1974f c1974f = new C1974f(bVar, oj0Var, j);
        c1974f.m11188x(this.f9127d);
        if (this.f8515l) {
            c1974f.m11181b(bVar.m11323c(m11195w(bVar.f101422a)));
            return c1974f;
        }
        this.f8513j = c1974f;
        if (!this.f8514k) {
            this.f8514k = true;
            m11795s();
        }
        return c1974f;
    }

    /* JADX INFO: renamed from: v */
    public final Object m11194v(Object obj) {
        return (this.f8512i.f8519h == null || !this.f8512i.f8519h.equals(obj)) ? obj : a.f8517i;
    }

    /* JADX INFO: renamed from: w */
    public final Object m11195w(Object obj) {
        return (this.f8512i.f8519h == null || !obj.equals(a.f8517i)) ? obj : this.f8512i.f8519h;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC1857c0 m11196x() {
        return this.f8512i;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: y */
    public final void m11197y(long j) {
        C1974f c1974f = this.f8513j;
        int iMo9450f = this.f8512i.mo9450f(c1974f.f8500a.f101422a);
        if (iMo9450f == -1) {
            return;
        }
        long j2 = this.f8512i.m9770j(iMo9450f, this.f8511h).f7340d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c1974f.m11186v(j);
    }
}
