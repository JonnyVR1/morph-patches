package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149l.h0j;
import p149l.p11;
import p149l.sj0;
import p149l.v70;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1952g extends AbstractC2002u {

    /* JADX INFO: renamed from: f */
    public final boolean f8472f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1834c0.d f8473g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1834c0.b f8474h;

    /* JADX INFO: renamed from: i */
    public a f8475i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public C1951f f8476j;

    /* JADX INFO: renamed from: k */
    public boolean f8477k;

    /* JADX INFO: renamed from: l */
    public boolean f8478l;

    /* JADX INFO: renamed from: m */
    public boolean f8479m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$a */
    public static final class a extends h0j {

        /* JADX INFO: renamed from: i */
        public static final Object f8480i = new Object();

        /* JADX INFO: renamed from: g */
        @Nullable
        public final Object f8481g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final Object f8482h;

        public a(AbstractC1834c0 abstractC1834c0, @Nullable Object obj, @Nullable Object obj2) {
            super(abstractC1834c0);
            this.f8481g = obj;
            this.f8482h = obj2;
        }

        /* JADX INFO: renamed from: y */
        public static a m11145y(C1921n c1921n) {
            return new a(new b(c1921n), AbstractC1834c0.d.f7319r, f8480i);
        }

        /* JADX INFO: renamed from: z */
        public static a m11146z(AbstractC1834c0 abstractC1834c0, @Nullable Object obj, @Nullable Object obj2) {
            return new a(abstractC1834c0, obj, obj2);
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: f */
        public int mo9396f(Object obj) {
            Object obj2;
            AbstractC1834c0 abstractC1834c0 = this.f105222f;
            if (f8480i.equals(obj) && (obj2 = this.f8482h) != null) {
                obj = obj2;
            }
            return abstractC1834c0.mo9396f(obj);
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            this.f105222f.mo9399k(i, bVar, z);
            if (vck0.m197845c(bVar.f7301b, this.f8482h) && z) {
                bVar.f7301b = f8480i;
            }
            return bVar;
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: q */
        public Object mo9402q(int i) {
            Object objMo9402q = this.f105222f.mo9402q(i);
            return vck0.m197845c(objMo9402q, this.f8482h) ? f8480i : objMo9402q;
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            this.f105222f.mo9403s(i, dVar, j);
            if (vck0.m197845c(dVar.f7328a, this.f8481g)) {
                dVar.f7328a = AbstractC1834c0.d.f7319r;
            }
            return dVar;
        }

        /* JADX INFO: renamed from: x */
        public a m11147x(AbstractC1834c0 abstractC1834c0) {
            return new a(abstractC1834c0, this.f8481g, this.f8482h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$b */
    @VisibleForTesting
    public static final class b extends AbstractC1834c0 {

        /* JADX INFO: renamed from: f */
        public final C1921n f8483f;

        public b(C1921n c1921n) {
            this.f8483f = c1921n;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: f */
        public int mo9396f(Object obj) {
            return obj == a.f8480i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            bVar.m9746w(z ? 0 : null, z ? a.f8480i : null, 0, -9223372036854775807L, 0L, v70.f180250g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: m */
        public int mo9717m() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: q */
        public Object mo9402q(int i) {
            return a.f8480i;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            dVar.m9755i(AbstractC1834c0.d.f7319r, this.f8483f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f7339l = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: t */
        public int mo9721t() {
            return 1;
        }
    }

    public C1952g(InterfaceC1965i interfaceC1965i, boolean z) {
        super(interfaceC1965i);
        this.f8472f = z && interfaceC1965i.isSingleWindow();
        this.f8473g = new AbstractC1834c0.d();
        this.f8474h = new AbstractC1834c0.b();
        AbstractC1834c0 initialTimeline = interfaceC1965i.getInitialTimeline();
        if (initialTimeline == null) {
            this.f8475i = a.m11145y(interfaceC1965i.getMediaItem());
        } else {
            this.f8475i = a.m11146z(initialTimeline, null, null);
            this.f8479m = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2002u
    @Nullable
    /* JADX INFO: renamed from: h */
    public InterfaceC1965i.b mo11137h(InterfaceC1965i.b bVar) {
        return bVar.m11269c(m11140v(bVar.f114355a));
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.AbstractC2002u
    /* JADX INFO: renamed from: p */
    public void mo10913p(AbstractC1834c0 abstractC1834c0) {
        long j;
        InterfaceC1965i.b bVarM11269c;
        if (this.f8478l) {
            this.f8475i = this.f8475i.m11147x(abstractC1834c0);
            C1951f c1951f = this.f8476j;
            if (c1951f != null) {
                m11143y(c1951f.m11128n());
            }
        } else {
            if (!abstractC1834c0.m9722u()) {
                abstractC1834c0.m9720r(0, this.f8473g);
                long jM9751e = this.f8473g.m9751e();
                Object obj = this.f8473g.f7328a;
                C1951f c1951f2 = this.f8476j;
                if (c1951f2 != null) {
                    long jM11129o = c1951f2.m11129o();
                    this.f8475i.mo9400l(this.f8476j.f8463a.f114355a, this.f8474h);
                    long jM9740q = this.f8474h.m9740q() + jM11129o;
                    if (jM9740q != this.f8475i.m9720r(0, this.f8473g).m9751e()) {
                        j = jM9740q;
                    } else {
                        j = jM9751e;
                    }
                } else {
                    j = jM9751e;
                }
                Pair<Object, Long> pairM9718n = abstractC1834c0.m9718n(this.f8473g, this.f8474h, 0, j);
                Object obj2 = pairM9718n.first;
                long jLongValue = ((Long) pairM9718n.second).longValue();
                this.f8475i = this.f8479m ? this.f8475i.m11147x(abstractC1834c0) : a.m11146z(abstractC1834c0, obj, obj2);
                C1951f c1951f3 = this.f8476j;
                if (c1951f3 != null) {
                    m11143y(jLongValue);
                    InterfaceC1965i.b bVar = c1951f3.f8463a;
                    bVarM11269c = bVar.m11269c(m11141w(bVar.f114355a));
                }
                this.f8479m = true;
                this.f8478l = true;
                refreshSourceInfo(this.f8475i);
                if (bVarM11269c != null) {
                    ((C1951f) p11.m167011e(this.f8476j)).m11127b(bVarM11269c);
                }
            }
            this.f8475i = this.f8479m ? this.f8475i.m11147x(abstractC1834c0) : a.m11146z(abstractC1834c0, AbstractC1834c0.d.f7319r, a.f8480i);
        }
        bVarM11269c = null;
        this.f8479m = true;
        this.f8478l = true;
        refreshSourceInfo(this.f8475i);
        if (bVarM11269c != null) {
            ((C1951f) p11.m167011e(this.f8476j)).m11127b(bVarM11269c);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((C1951f) interfaceC1953h).m11133w();
        if (interfaceC1953h == this.f8476j) {
            this.f8476j = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        this.f8478l = false;
        this.f8477k = false;
        super.releaseSourceInternal();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2002u
    /* JADX INFO: renamed from: t */
    public void mo11138t() {
        if (this.f8472f) {
            return;
        }
        this.f8477k = true;
        m11741s();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C1951f createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        C1951f c1951f = new C1951f(bVar, sj0Var, j);
        c1951f.m11134x(this.f9090d);
        if (this.f8478l) {
            c1951f.m11127b(bVar.m11269c(m11141w(bVar.f114355a)));
            return c1951f;
        }
        this.f8476j = c1951f;
        if (!this.f8477k) {
            this.f8477k = true;
            m11741s();
        }
        return c1951f;
    }

    /* JADX INFO: renamed from: v */
    public final Object m11140v(Object obj) {
        return (this.f8475i.f8482h == null || !this.f8475i.f8482h.equals(obj)) ? obj : a.f8480i;
    }

    /* JADX INFO: renamed from: w */
    public final Object m11141w(Object obj) {
        return (this.f8475i.f8482h == null || !obj.equals(a.f8480i)) ? obj : this.f8475i.f8482h;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC1834c0 m11142x() {
        return this.f8475i;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: y */
    public final void m11143y(long j) {
        C1951f c1951f = this.f8476j;
        int iMo9396f = this.f8475i.mo9396f(c1951f.f8463a.f114355a);
        if (iMo9396f == -1) {
            return;
        }
        long j2 = this.f8475i.m9716j(iMo9396f, this.f8474h).f7303d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c1951f.m11132v(j);
    }
}
