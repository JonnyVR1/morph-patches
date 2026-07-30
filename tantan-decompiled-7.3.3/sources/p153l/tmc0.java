package p153l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tmc0 implements azm.InterfaceC15867a {

    /* JADX INFO: renamed from: a */
    public final List<azm> f174910a;

    /* JADX INFO: renamed from: b */
    public final oij0 f174911b;

    /* JADX INFO: renamed from: c */
    public final n6f f174912c;

    /* JADX INFO: renamed from: d */
    public final int f174913d;

    /* JADX INFO: renamed from: e */
    public final x1d0 f174914e;

    /* JADX INFO: renamed from: f */
    public final ry3 f174915f;

    /* JADX INFO: renamed from: g */
    public final int f174916g;

    /* JADX INFO: renamed from: h */
    public final int f174917h;

    /* JADX INFO: renamed from: i */
    public final int f174918i;

    /* JADX INFO: renamed from: j */
    public int f174919j;

    public tmc0(List<azm> list, oij0 oij0Var, n6f n6fVar, int i, x1d0 x1d0Var, ry3 ry3Var, int i2, int i3, int i4) {
        this.f174910a = list;
        this.f174911b = oij0Var;
        this.f174912c = n6fVar;
        this.f174913d = i;
        this.f174914e = x1d0Var;
        this.f174915f = ry3Var;
        this.f174916g = i2;
        this.f174917h = i3;
        this.f174918i = i4;
    }

    @Override // p153l.azm.InterfaceC15867a
    /* JADX INFO: renamed from: a */
    public i5d0 mo101076a(x1d0 x1d0Var) throws IOException {
        return m191725c(x1d0Var, this.f174911b, this.f174912c);
    }

    /* JADX INFO: renamed from: b */
    public n6f m191724b() {
        n6f n6fVar = this.f174912c;
        if (n6fVar != null) {
            return n6fVar;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public i5d0 m191725c(x1d0 x1d0Var, oij0 oij0Var, n6f n6fVar) throws IOException {
        if (this.f174913d >= this.f174910a.size()) {
            aqg0.m99478a();
            return null;
        }
        this.f174919j++;
        n6f n6fVar2 = this.f174912c;
        if (n6fVar2 != null && !n6fVar2.m161766c().m140919w(x1d0Var.m209026k())) {
            m5j.m157106a("network interceptor ", this.f174910a.get(this.f174913d - 1), " must retain the same host and port");
            return null;
        }
        if (this.f174912c != null && this.f174919j > 1) {
            m5j.m157106a("network interceptor ", this.f174910a.get(this.f174913d - 1), " must call proceed() exactly once");
            return null;
        }
        tmc0 tmc0Var = new tmc0(this.f174910a, oij0Var, n6fVar, this.f174913d + 1, x1d0Var, this.f174915f, this.f174916g, this.f174917h, this.f174918i);
        azm azmVar = this.f174910a.get(this.f174913d);
        i5d0 i5d0VarIntercept = azmVar.intercept(tmc0Var);
        if (n6fVar != null && this.f174913d + 1 < this.f174910a.size() && tmc0Var.f174919j != 1) {
            wmw.m207134a("network interceptor ", azmVar, " must call proceed() exactly once");
            return null;
        }
        if (i5d0VarIntercept == null) {
            c0l.m107429a("interceptor ", azmVar, " returned null");
            return null;
        }
        if (i5d0VarIntercept.m138670k() != null) {
            return i5d0VarIntercept;
        }
        wmw.m207134a("interceptor ", azmVar, " returned a response with no body");
        return null;
    }

    @Override // p153l.azm.InterfaceC15867a
    public int connectTimeoutMillis() {
        return this.f174916g;
    }

    @Override // p153l.azm.InterfaceC15867a
    public bx5 connection() {
        n6f n6fVar = this.f174912c;
        if (n6fVar != null) {
            return n6fVar.m161766c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public oij0 m191726d() {
        return this.f174911b;
    }

    @Override // p153l.azm.InterfaceC15867a
    public int readTimeoutMillis() {
        return this.f174917h;
    }

    @Override // p153l.azm.InterfaceC15867a
    public x1d0 request() {
        return this.f174914e;
    }

    @Override // p153l.azm.InterfaceC15867a
    public int writeTimeoutMillis() {
        return this.f174918i;
    }
}
