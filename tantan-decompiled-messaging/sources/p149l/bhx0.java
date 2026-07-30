package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bhx0 {

    /* JADX INFO: renamed from: a */
    public final List f75683a;

    /* JADX INFO: renamed from: b */
    public final List f75684b;

    public /* synthetic */ bhx0(int i, int i2, ahx0 ahx0Var) {
        this.f75683a = lgx0.m149801c(i);
        this.f75684b = lgx0.m149801c(i2);
    }

    /* JADX INFO: renamed from: a */
    public final bhx0 m101949a(xgx0 xgx0Var) {
        this.f75684b.add(xgx0Var);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bhx0 m101950b(xgx0 xgx0Var) {
        this.f75683a.add(xgx0Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final chx0 m101951c() {
        return new chx0(this.f75683a, this.f75684b, null);
    }
}
