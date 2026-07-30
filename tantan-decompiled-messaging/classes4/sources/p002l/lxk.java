package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lxk extends bxm {

    /* JADX INFO: renamed from: b */
    public String f15116b;

    public lxk(String str) {
        this.f15116b = str;
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        vq4Var.mo18693a(vq4Var.mo18695c());
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        String str;
        if (vq4Var.call() instanceof v4s) {
            str = "connect";
        } else if (vq4Var.call() instanceof lur) {
            str = "auth";
        } else if (vq4Var.call() instanceof gxq) {
            str = "ping";
        } else {
            str = vq4Var.call() instanceof h10 ? "ack" : "normal";
        }
        lwt lwtVar = (lwt) vq4Var.mo18694b().m17160p().mo18304a();
        lwtVar.mo17499i(str);
        lwtVar.m17502l(vq4Var.mo18695c().m22193a() == null ? 0 : vq4Var.mo18695c().m22193a().length);
        lwtVar.m17504n(this.f15116b);
        s460 s460VarMo18695c = vq4Var.mo18695c();
        s460VarMo18695c.m22197e(lwtVar);
        vq4Var.mo18693a(s460VarMo18695c);
    }
}
