package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class lxk extends bxm {

    /* JADX INFO: renamed from: b */
    public String f130421b;

    public lxk(String str) {
        this.f130421b = str;
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        vq4Var.mo159105a(vq4Var.mo159107c());
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
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
        lwt lwtVar = (lwt) vq4Var.mo159106b().m149502p().mo156765a();
        lwtVar.mo152010i(str);
        lwtVar.m152013l(vq4Var.mo159107c().m182208a() == null ? 0 : vq4Var.mo159107c().m182208a().length);
        lwtVar.m152015n(this.f130421b);
        s460 s460VarMo159107c = vq4Var.mo159107c();
        s460VarMo159107c.m182212e(lwtVar);
        vq4Var.mo159105a(s460VarMo159107c);
    }
}
