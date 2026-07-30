package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class b0l extends bzm {

    /* JADX INFO: renamed from: b */
    public String f74279b;

    public b0l(String str) {
        this.f74279b = str;
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        ur4Var.mo196642a(ur4Var.mo196644c());
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        String str;
        if (ur4Var.call() instanceof w6s) {
            str = "connect";
        } else if (ur4Var.call() instanceof mwr) {
            str = "auth";
        } else if (ur4Var.call() instanceof gzq) {
            str = "ping";
        } else {
            str = ur4Var.call() instanceof b10 ? "ack" : "normal";
        }
        myt mytVar = (myt) ur4Var.mo196643b().m186798p().mo122439a();
        mytVar.mo127321i(str);
        mytVar.m160807l(ur4Var.mo196644c().m215135a() == null ? 0 : ur4Var.mo196644c().m215135a().length);
        mytVar.m160809n(this.f74279b);
        yc60 yc60VarMo196644c = ur4Var.mo196644c();
        yc60VarMo196644c.m215139e(mytVar);
        ur4Var.mo196642a(yc60VarMo196644c);
    }
}
