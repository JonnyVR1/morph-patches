package p149l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mec0 implements axm.InterfaceC15754a {

    /* JADX INFO: renamed from: a */
    public final List<axm> f133390a;

    /* JADX INFO: renamed from: b */
    public final k9j0 f133391b;

    /* JADX INFO: renamed from: c */
    public final j5f f133392c;

    /* JADX INFO: renamed from: d */
    public final int f133393d;

    /* JADX INFO: renamed from: e */
    public final stc0 f133394e;

    /* JADX INFO: renamed from: f */
    public final sx3 f133395f;

    /* JADX INFO: renamed from: g */
    public final int f133396g;

    /* JADX INFO: renamed from: h */
    public final int f133397h;

    /* JADX INFO: renamed from: i */
    public final int f133398i;

    /* JADX INFO: renamed from: j */
    public int f133399j;

    public mec0(List<axm> list, k9j0 k9j0Var, j5f j5fVar, int i, stc0 stc0Var, sx3 sx3Var, int i2, int i3, int i4) {
        this.f133390a = list;
        this.f133391b = k9j0Var;
        this.f133392c = j5fVar;
        this.f133393d = i;
        this.f133394e = stc0Var;
        this.f133395f = sx3Var;
        this.f133396g = i2;
        this.f133397h = i3;
        this.f133398i = i4;
    }

    @Override // p149l.axm.InterfaceC15754a
    /* JADX INFO: renamed from: a */
    public exc0 mo99454a(stc0 stc0Var) throws IOException {
        return m154178c(stc0Var, this.f133391b, this.f133392c);
    }

    /* JADX INFO: renamed from: b */
    public j5f m154177b() {
        j5f j5fVar = this.f133392c;
        if (j5fVar != null) {
            return j5fVar;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public exc0 m154178c(stc0 stc0Var, k9j0 k9j0Var, j5f j5fVar) throws IOException {
        if (this.f133393d >= this.f133390a.size()) {
            shg0.m184191a();
            return null;
        }
        this.f133399j++;
        j5f j5fVar2 = this.f133392c;
        if (j5fVar2 != null && !j5fVar2.m139846c().m101351w(stc0Var.m185881k())) {
            r2j.m177608a("network interceptor ", this.f133390a.get(this.f133393d - 1), " must retain the same host and port");
            return null;
        }
        if (this.f133392c != null && this.f133399j > 1) {
            r2j.m177608a("network interceptor ", this.f133390a.get(this.f133393d - 1), " must call proceed() exactly once");
            return null;
        }
        mec0 mec0Var = new mec0(this.f133390a, k9j0Var, j5fVar, this.f133393d + 1, stc0Var, this.f133395f, this.f133396g, this.f133397h, this.f133398i);
        axm axmVar = this.f133390a.get(this.f133393d);
        exc0 exc0VarIntercept = axmVar.intercept(mec0Var);
        if (j5fVar != null && this.f133393d + 1 < this.f133390a.size() && mec0Var.f133399j != 1) {
            xjw.m209754a("network interceptor ", axmVar, " must call proceed() exactly once");
            return null;
        }
        if (exc0VarIntercept == null) {
            mxk.m156912a("interceptor ", axmVar, " returned null");
            return null;
        }
        if (exc0VarIntercept.m118606k() != null) {
            return exc0VarIntercept;
        }
        xjw.m209754a("interceptor ", axmVar, " returned a response with no body");
        return null;
    }

    @Override // p149l.axm.InterfaceC15754a
    public int connectTimeoutMillis() {
        return this.f133396g;
    }

    @Override // p149l.axm.InterfaceC15754a
    public wv5 connection() {
        j5f j5fVar = this.f133392c;
        if (j5fVar != null) {
            return j5fVar.m139846c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public k9j0 m154179d() {
        return this.f133391b;
    }

    @Override // p149l.axm.InterfaceC15754a
    public int readTimeoutMillis() {
        return this.f133397h;
    }

    @Override // p149l.axm.InterfaceC15754a
    public stc0 request() {
        return this.f133394e;
    }

    @Override // p149l.axm.InterfaceC15754a
    public int writeTimeoutMillis() {
        return this.f133398i;
    }
}
