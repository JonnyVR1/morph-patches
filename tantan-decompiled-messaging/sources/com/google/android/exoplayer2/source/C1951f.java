package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import java.io.IOException;
import p149l.b6j0;
import p149l.ice0;
import p149l.o8f;
import p149l.p11;
import p149l.sj0;
import p149l.vck0;
import p149l.vod0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1951f implements InterfaceC1953h, InterfaceC1953h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1965i.b f8463a;

    /* JADX INFO: renamed from: b */
    public final long f8464b;

    /* JADX INFO: renamed from: c */
    public final sj0 f8465c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1965i f8466d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1953h f8467e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC1953h.a f8468f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public a f8469g;

    /* JADX INFO: renamed from: h */
    public boolean f8470h;

    /* JADX INFO: renamed from: i */
    public long f8471i = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m11135a(InterfaceC1965i.b bVar, IOException iOException);

        /* JADX INFO: renamed from: b */
        void m11136b(InterfaceC1965i.b bVar);
    }

    public C1951f(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        this.f8463a = bVar;
        this.f8465c = sj0Var;
        this.f8464b = j;
    }

    /* JADX INFO: renamed from: b */
    public void m11127b(InterfaceC1965i.b bVar) {
        long jM11130q = m11130q(this.f8464b);
        InterfaceC1953h interfaceC1953hCreatePeriod = ((InterfaceC1965i) p11.m167011e(this.f8466d)).createPeriod(bVar, this.f8465c, jM11130q);
        this.f8467e = interfaceC1953hCreatePeriod;
        if (this.f8468f != null) {
            interfaceC1953hCreatePeriod.mo10933p(this, jM11130q);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        InterfaceC1953h interfaceC1953h = this.f8467e;
        return interfaceC1953h != null && interfaceC1953h.mo10923c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10924d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10925e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10926f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10927g(j, ice0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10928h(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10929i();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        InterfaceC1953h interfaceC1953h = this.f8467e;
        return interfaceC1953h != null && interfaceC1953h.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h.a
    /* JADX INFO: renamed from: l */
    public void mo10221l(InterfaceC1953h interfaceC1953h) {
        ((InterfaceC1953h.a) vck0.m197866j(this.f8468f)).mo10221l(this);
        a aVar = this.f8469g;
        if (aVar != null) {
            aVar.m11136b(this.f8463a);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10930m();
    }

    /* JADX INFO: renamed from: n */
    public long m11128n() {
        return this.f8471i;
    }

    /* JADX INFO: renamed from: o */
    public long m11129o() {
        return this.f8464b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f8468f = aVar;
        InterfaceC1953h interfaceC1953h = this.f8467e;
        if (interfaceC1953h != null) {
            interfaceC1953h.mo10933p(this, m11130q(this.f8464b));
        }
    }

    /* JADX INFO: renamed from: q */
    public final long m11130q(long j) {
        long j2 = this.f8471i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        long j2 = this.f8471i;
        if (j2 != -9223372036854775807L && j == this.f8464b) {
            this.f8471i = -9223372036854775807L;
            j = j2;
        }
        return ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10935r(o8fVarArr, zArr, vod0VarArr, zArr2, j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        try {
            InterfaceC1953h interfaceC1953h = this.f8467e;
            if (interfaceC1953h != null) {
                interfaceC1953h.mo10936s();
                return;
            }
            InterfaceC1965i interfaceC1965i = this.f8466d;
            if (interfaceC1965i != null) {
                interfaceC1965i.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            a aVar = this.f8469g;
            if (aVar == null) {
                throw e;
            }
            if (this.f8470h) {
                return;
            }
            this.f8470h = true;
            aVar.m11135a(this.f8463a, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        ((InterfaceC1953h) vck0.m197866j(this.f8467e)).mo10937t(j, z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10216j(InterfaceC1953h interfaceC1953h) {
        ((InterfaceC1953h.a) vck0.m197866j(this.f8468f)).mo10216j(this);
    }

    /* JADX INFO: renamed from: v */
    public void m11132v(long j) {
        this.f8471i = j;
    }

    /* JADX INFO: renamed from: w */
    public void m11133w() {
        if (this.f8467e != null) {
            ((InterfaceC1965i) p11.m167011e(this.f8466d)).releasePeriod(this.f8467e);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11134x(InterfaceC1965i interfaceC1965i) {
        p11.m167013g(this.f8466d == null);
        this.f8466d = interfaceC1965i;
    }
}
