package p003l;

import l.njg0;
import l.y6g0;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class peg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f6386a;

    public peg0(oqg0 oqg0Var) {
        this.f6386a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6838a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f6386a.f6206c.get();
        if (iSudFSMMG != null) {
            SudLogger.m10036i(oqg0.f6203n, "onExpireCode");
            LogUtils.file("SudFSMMGStateHandlerImpl", "onExpireCode");
            iSudFSMMG.onExpireCode(y6g0Var, str4);
        }
    }
}
