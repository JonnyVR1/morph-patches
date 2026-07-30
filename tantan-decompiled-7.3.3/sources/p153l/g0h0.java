package p153l;

import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class g0h0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f101656a;

    public g0h0(wyg0 wyg0Var) {
        this.f101656a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        try {
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f101656a.f191642c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameLog(str4);
            }
            gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
