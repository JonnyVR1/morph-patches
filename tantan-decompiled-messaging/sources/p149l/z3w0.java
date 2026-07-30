package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class z3w0 implements p3w0 {

    /* JADX INFO: renamed from: a */
    public final d4w0 f201419a;

    /* JADX INFO: renamed from: b */
    public final b4w0 f201420b;

    /* JADX INFO: renamed from: c */
    public final m3w0 f201421c;

    public z3w0(m3w0 m3w0Var, d4w0 d4w0Var, b4w0 b4w0Var) {
        this.f201421c = m3w0Var;
        this.f201419a = d4w0Var;
        this.f201420b = b4w0Var;
    }

    @Override // p149l.p3w0
    /* JADX INFO: renamed from: a */
    public final void mo124429a(o3w0 o3w0Var) {
        this.f201421c.m152954b(mo124430b(o3w0Var));
    }

    @Override // p149l.p3w0
    /* JADX INFO: renamed from: b */
    public final String mo124430b(o3w0 o3w0Var) {
        b4w0 b4w0Var = this.f201420b;
        Map mapM162498j = o3w0Var.m162498j();
        b4w0Var.m100277a(mapM162498j);
        return this.f201419a.m109998a(mapM162498j);
    }
}
