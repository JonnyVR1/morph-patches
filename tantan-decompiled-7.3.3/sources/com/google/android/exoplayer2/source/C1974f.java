package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import java.io.IOException;
import p153l.bmk0;
import p153l.ffj0;
import p153l.nke0;
import p153l.oj0;
import p153l.u9f;
import p153l.w11;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1974f implements InterfaceC1976h, InterfaceC1976h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1988i.b f8500a;

    /* JADX INFO: renamed from: b */
    public final long f8501b;

    /* JADX INFO: renamed from: c */
    public final oj0 f8502c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1988i f8503d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1976h f8504e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC1976h.a f8505f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public a f8506g;

    /* JADX INFO: renamed from: h */
    public boolean f8507h;

    /* JADX INFO: renamed from: i */
    public long f8508i = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m11189a(InterfaceC1988i.b bVar, IOException iOException);

        /* JADX INFO: renamed from: b */
        void m11190b(InterfaceC1988i.b bVar);
    }

    public C1974f(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        this.f8500a = bVar;
        this.f8502c = oj0Var;
        this.f8501b = j;
    }

    /* JADX INFO: renamed from: b */
    public void m11181b(InterfaceC1988i.b bVar) {
        long jM11184q = m11184q(this.f8501b);
        InterfaceC1976h interfaceC1976hCreatePeriod = ((InterfaceC1988i) w11.m204369e(this.f8503d)).createPeriod(bVar, this.f8502c, jM11184q);
        this.f8504e = interfaceC1976hCreatePeriod;
        if (this.f8505f != null) {
            interfaceC1976hCreatePeriod.mo10987p(this, jM11184q);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        InterfaceC1976h interfaceC1976h = this.f8504e;
        return interfaceC1976h != null && interfaceC1976h.mo10977c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10980f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10981g(j, nke0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10982h(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10983i();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        InterfaceC1976h interfaceC1976h = this.f8504e;
        return interfaceC1976h != null && interfaceC1976h.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h.a
    /* JADX INFO: renamed from: l */
    public void mo10275l(InterfaceC1976h interfaceC1976h) {
        ((InterfaceC1976h.a) bmk0.m105144j(this.f8505f)).mo10275l(this);
        a aVar = this.f8506g;
        if (aVar != null) {
            aVar.m11190b(this.f8500a);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10984m();
    }

    /* JADX INFO: renamed from: n */
    public long m11182n() {
        return this.f8508i;
    }

    /* JADX INFO: renamed from: o */
    public long m11183o() {
        return this.f8501b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8505f = aVar;
        InterfaceC1976h interfaceC1976h = this.f8504e;
        if (interfaceC1976h != null) {
            interfaceC1976h.mo10987p(this, m11184q(this.f8501b));
        }
    }

    /* JADX INFO: renamed from: q */
    public final long m11184q(long j) {
        long j2 = this.f8508i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        long j2 = this.f8508i;
        if (j2 != -9223372036854775807L && j == this.f8501b) {
            this.f8508i = -9223372036854775807L;
            j = j2;
        }
        return ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10989r(u9fVarArr, zArr, xwd0VarArr, zArr2, j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        try {
            InterfaceC1976h interfaceC1976h = this.f8504e;
            if (interfaceC1976h != null) {
                interfaceC1976h.mo10990s();
                return;
            }
            InterfaceC1988i interfaceC1988i = this.f8503d;
            if (interfaceC1988i != null) {
                interfaceC1988i.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            a aVar = this.f8506g;
            if (aVar == null) {
                throw e;
            }
            if (this.f8507h) {
                return;
            }
            this.f8507h = true;
            aVar.m11189a(this.f8500a, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        ((InterfaceC1976h) bmk0.m105144j(this.f8504e)).mo10991t(j, z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10270j(InterfaceC1976h interfaceC1976h) {
        ((InterfaceC1976h.a) bmk0.m105144j(this.f8505f)).mo10270j(this);
    }

    /* JADX INFO: renamed from: v */
    public void m11186v(long j) {
        this.f8508i = j;
    }

    /* JADX INFO: renamed from: w */
    public void m11187w() {
        if (this.f8504e != null) {
            ((InterfaceC1988i) w11.m204369e(this.f8503d)).releasePeriod(this.f8504e);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11188x(InterfaceC1988i interfaceC1988i) {
        w11.m204371g(this.f8503d == null);
        this.f8503d = interfaceC1988i;
    }
}
