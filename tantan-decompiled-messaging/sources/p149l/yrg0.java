package p149l;

import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class yrg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f199668a;

    public yrg0(oqg0 oqg0Var) {
        this.f199668a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f199668a.f145140c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameLog(str4);
            }
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
