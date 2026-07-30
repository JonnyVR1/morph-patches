package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.drm.C1876a;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.source.C1994o;
import com.google.android.exoplayer2.source.InterfaceC1992m;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import p153l.bf80;
import p153l.c3j;
import p153l.esf;
import p153l.fj3;
import p153l.g6c;
import p153l.lqf0;
import p153l.oj0;
import p153l.pgj0;
import p153l.w11;
import p153l.zde;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.o */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1994o extends AbstractC1957a implements C1993n.b {

    /* JADX INFO: renamed from: a */
    public final C1944n f8769a;

    /* JADX INFO: renamed from: b */
    public final C1944n.h f8770b;

    /* JADX INFO: renamed from: c */
    public final g6c.InterfaceC17163a f8771c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1992m.a f8772d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1878c f8773e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2072c f8774f;

    /* JADX INFO: renamed from: g */
    public final int f8775g;

    /* JADX INFO: renamed from: h */
    public boolean f8776h;

    /* JADX INFO: renamed from: i */
    public long f8777i;

    /* JADX INFO: renamed from: j */
    public boolean f8778j;

    /* JADX INFO: renamed from: k */
    public boolean f8779k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public pgj0 f8780l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o$a */
    public class a extends c3j {
        public a(AbstractC1857c0 abstractC1857c0) {
            super(abstractC1857c0);
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            super.mo9453k(i, bVar, z);
            bVar.f7342f = true;
            return bVar;
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            super.mo9457s(i, dVar, j);
            dVar.f7376l = true;
            return dVar;
        }
    }

    public C1994o(C1944n c1944n, g6c.InterfaceC17163a interfaceC17163a, InterfaceC1992m.a aVar, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, int i) {
        this.f8770b = (C1944n.h) w11.m204369e(c1944n.f7997b);
        this.f8769a = c1944n;
        this.f8771c = interfaceC17163a;
        this.f8772d = aVar;
        this.f8773e = interfaceC1878c;
        this.f8774f = interfaceC2072c;
        this.f8775g = i;
        this.f8776h = true;
        this.f8777i = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.C1993n.b
    /* JADX INFO: renamed from: a */
    public void mo11435a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f8777i;
        }
        if (!this.f8776h && this.f8777i == j && this.f8778j == z && this.f8779k == z2) {
            return;
        }
        this.f8777i = j;
        this.f8778j = z;
        this.f8779k = z2;
        this.f8776h = false;
        m11437b();
    }

    /* JADX INFO: renamed from: b */
    public final void m11437b() {
        AbstractC1857c0 lqf0Var = new lqf0(this.f8777i, this.f8778j, false, this.f8779k, null, this.f8769a);
        if (this.f8776h) {
            lqf0Var = new a(lqf0Var);
        }
        refreshSourceInfo(lqf0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        g6c g6cVarMo129219a = this.f8771c.mo129219a();
        pgj0 pgj0Var = this.f8780l;
        if (pgj0Var != null) {
            g6cVarMo129219a.mo11177e(pgj0Var);
        }
        return new C1993n(this.f8770b.f8094a, g6cVarMo129219a, this.f8772d.mo11381a(getPlayerId()), this.f8773e, createDrmEventDispatcher(bVar), this.f8774f, createEventDispatcher(bVar), this, oj0Var, this.f8770b.f8099f, this.f8775g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f8769a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.f8780l = pgj0Var;
        this.f8773e.mo9931d((Looper) w11.m204369e(Looper.myLooper()), getPlayerId());
        this.f8773e.prepare();
        m11437b();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((C1993n) interfaceC1976h).m11417b0();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        this.f8773e.release();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o$b */
    public static final class b implements InterfaceC1990k {

        /* JADX INFO: renamed from: c */
        public final g6c.InterfaceC17163a f8782c;

        /* JADX INFO: renamed from: d */
        public InterfaceC1992m.a f8783d;

        /* JADX INFO: renamed from: e */
        public zde f8784e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2072c f8785f;

        /* JADX INFO: renamed from: g */
        public int f8786g;

        public b(g6c.InterfaceC17163a interfaceC17163a, InterfaceC1992m.a aVar) {
            this(interfaceC17163a, aVar, new C1876a(), new C2071b(), 1048576);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ InterfaceC1992m m11438e(esf esfVar, bf80 bf80Var) {
            return new fj3(esfVar);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1994o mo11012c(C1944n c1944n) {
            w11.m204369e(c1944n.f7997b);
            return new C1994o(c1944n, this.f8782c, this.f8783d, this.f8784e.mo9964a(c1944n), this.f8785f, this.f8786g, null);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo11010a(zde zdeVar) {
            this.f8784e = (zde) w11.m204370f(zdeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b mo11011b(InterfaceC2072c interfaceC2072c) {
            this.f8785f = (InterfaceC2072c) w11.m204370f(interfaceC2072c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(g6c.InterfaceC17163a interfaceC17163a, final esf esfVar) {
            this(interfaceC17163a, new InterfaceC1992m.a() { // from class: l.z4b0
                @Override // com.google.android.exoplayer2.source.InterfaceC1992m.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1992m mo11381a(bf80 bf80Var) {
                    return C1994o.b.m11438e(esfVar, bf80Var);
                }
            });
        }

        public b(g6c.InterfaceC17163a interfaceC17163a, InterfaceC1992m.a aVar, zde zdeVar, InterfaceC2072c interfaceC2072c, int i) {
            this.f8782c = interfaceC17163a;
            this.f8783d = aVar;
            this.f8784e = zdeVar;
            this.f8785f = interfaceC2072c;
            this.f8786g = i;
        }
    }

    public /* synthetic */ C1994o(C1944n c1944n, g6c.InterfaceC17163a interfaceC17163a, InterfaceC1992m.a aVar, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, int i, a aVar2) {
        this(c1944n, interfaceC17163a, aVar, interfaceC1878c, interfaceC2072c, i);
    }
}
