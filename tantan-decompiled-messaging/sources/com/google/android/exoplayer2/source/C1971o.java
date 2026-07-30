package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.drm.C1853a;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.source.C1971o;
import com.google.android.exoplayer2.source.InterfaceC1969m;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import p149l.a5c;
import p149l.cif0;
import p149l.h0j;
import p149l.l7j0;
import p149l.p11;
import p149l.ri3;
import p149l.sj0;
import p149l.v680;
import p149l.vce;
import p149l.xqf;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.o */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1971o extends AbstractC1934a implements C1970n.b {

    /* JADX INFO: renamed from: a */
    public final C1921n f8732a;

    /* JADX INFO: renamed from: b */
    public final C1921n.h f8733b;

    /* JADX INFO: renamed from: c */
    public final a5c.InterfaceC15531a f8734c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1969m.a f8735d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1855c f8736e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2049c f8737f;

    /* JADX INFO: renamed from: g */
    public final int f8738g;

    /* JADX INFO: renamed from: h */
    public boolean f8739h;

    /* JADX INFO: renamed from: i */
    public long f8740i;

    /* JADX INFO: renamed from: j */
    public boolean f8741j;

    /* JADX INFO: renamed from: k */
    public boolean f8742k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public l7j0 f8743l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o$a */
    public class a extends h0j {
        public a(AbstractC1834c0 abstractC1834c0) {
            super(abstractC1834c0);
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            super.mo9399k(i, bVar, z);
            bVar.f7305f = true;
            return bVar;
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            super.mo9403s(i, dVar, j);
            dVar.f7339l = true;
            return dVar;
        }
    }

    public C1971o(C1921n c1921n, a5c.InterfaceC15531a interfaceC15531a, InterfaceC1969m.a aVar, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, int i) {
        this.f8733b = (C1921n.h) p11.m167011e(c1921n.f7960b);
        this.f8732a = c1921n;
        this.f8734c = interfaceC15531a;
        this.f8735d = aVar;
        this.f8736e = interfaceC1855c;
        this.f8737f = interfaceC2049c;
        this.f8738g = i;
        this.f8739h = true;
        this.f8740i = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.C1970n.b
    /* JADX INFO: renamed from: a */
    public void mo11381a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f8740i;
        }
        if (!this.f8739h && this.f8740i == j && this.f8741j == z && this.f8742k == z2) {
            return;
        }
        this.f8740i = j;
        this.f8741j = z;
        this.f8742k = z2;
        this.f8739h = false;
        m11383b();
    }

    /* JADX INFO: renamed from: b */
    public final void m11383b() {
        AbstractC1834c0 cif0Var = new cif0(this.f8740i, this.f8741j, false, this.f8742k, null, this.f8732a);
        if (this.f8739h) {
            cif0Var = new a(cif0Var);
        }
        refreshSourceInfo(cif0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        a5c a5cVarMo95019a = this.f8734c.mo95019a();
        l7j0 l7j0Var = this.f8743l;
        if (l7j0Var != null) {
            a5cVarMo95019a.mo11123e(l7j0Var);
        }
        return new C1970n(this.f8733b.f8057a, a5cVarMo95019a, this.f8735d.mo11327a(getPlayerId()), this.f8736e, createDrmEventDispatcher(bVar), this.f8737f, createEventDispatcher(bVar), this, sj0Var, this.f8733b.f8062f, this.f8738g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f8732a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.f8743l = l7j0Var;
        this.f8736e.mo9877d((Looper) p11.m167011e(Looper.myLooper()), getPlayerId());
        this.f8736e.prepare();
        m11383b();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((C1970n) interfaceC1953h).m11363b0();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        this.f8736e.release();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.o$b */
    public static final class b implements InterfaceC1967k {

        /* JADX INFO: renamed from: c */
        public final a5c.InterfaceC15531a f8745c;

        /* JADX INFO: renamed from: d */
        public InterfaceC1969m.a f8746d;

        /* JADX INFO: renamed from: e */
        public vce f8747e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2049c f8748f;

        /* JADX INFO: renamed from: g */
        public int f8749g;

        public b(a5c.InterfaceC15531a interfaceC15531a, InterfaceC1969m.a aVar) {
            this(interfaceC15531a, aVar, new C1853a(), new C2048b(), 1048576);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ InterfaceC1969m m11384e(xqf xqfVar, v680 v680Var) {
            return new ri3(xqfVar);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1971o mo10958c(C1921n c1921n) {
            p11.m167011e(c1921n.f7960b);
            return new C1971o(c1921n, this.f8745c, this.f8746d, this.f8747e.mo9910a(c1921n), this.f8748f, this.f8749g, null);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo10956a(vce vceVar) {
            this.f8747e = (vce) p11.m167012f(vceVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b mo10957b(InterfaceC2049c interfaceC2049c) {
            this.f8748f = (InterfaceC2049c) p11.m167012f(interfaceC2049c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(a5c.InterfaceC15531a interfaceC15531a, final xqf xqfVar) {
            this(interfaceC15531a, new InterfaceC1969m.a() { // from class: l.vwa0
                @Override // com.google.android.exoplayer2.source.InterfaceC1969m.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1969m mo11327a(v680 v680Var) {
                    return C1971o.b.m11384e(xqfVar, v680Var);
                }
            });
        }

        public b(a5c.InterfaceC15531a interfaceC15531a, InterfaceC1969m.a aVar, vce vceVar, InterfaceC2049c interfaceC2049c, int i) {
            this.f8745c = interfaceC15531a;
            this.f8746d = aVar;
            this.f8747e = vceVar;
            this.f8748f = interfaceC2049c;
            this.f8749g = i;
        }
    }

    public /* synthetic */ C1971o(C1921n c1921n, a5c.InterfaceC15531a interfaceC15531a, InterfaceC1969m.a aVar, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, int i, a aVar2) {
        this(c1921n, interfaceC15531a, aVar, interfaceC1855c, interfaceC2049c, i);
    }
}
