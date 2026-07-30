package p153l;

import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zwg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f206347a;

    public zwg0(wyg0 wyg0Var) {
        this.f206347a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f206347a.f191642c.get();
        if (iSudFSMMG != null) {
            LogUtils.file("SudFSMMGStateHandlerImpl", "onGameStarted");
            SudLogger.m222815i(wyg0.f191639n, "onGameStarted");
            iSudFSMMG.onGameStarted();
        }
        gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
