package p003l;

import l.njg0;
import l.y6g0;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class yrg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f9125a;

    public yrg0(oqg0 oqg0Var) {
        this.f9125a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m9226a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f9125a.f6206c.get();
            if (iSudFSMMG != null) {
                iSudFSMMG.onGameLog(str4);
            }
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
