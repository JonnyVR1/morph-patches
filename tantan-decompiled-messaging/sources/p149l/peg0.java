package p149l;

import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class peg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f148435a;

    public peg0(oqg0 oqg0Var) {
        this.f148435a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f148435a.f145140c.get();
        if (iSudFSMMG != null) {
            SudLogger.m221569i(oqg0.f145137n, "onExpireCode");
            LogUtils.file("SudFSMMGStateHandlerImpl", "onExpireCode");
            iSudFSMMG.onExpireCode(y6g0Var, str4);
        }
    }
}
