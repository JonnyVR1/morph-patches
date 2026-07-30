package p153l;

import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class ugg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f178892a;

    public ugg0(wyg0 wyg0Var) {
        this.f178892a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        bsg0 bsg0Var = new bsg0();
        bsg0Var.f78154a = "getGameViewInfo";
        bsg0Var.f78155b = System.currentTimeMillis();
        this.f178892a.m208617b(bsg0Var);
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f178892a.f191642c.get();
        if (iSudFSMMG != null) {
            SudLogger.m222815i(wyg0.f191639n, "onGetGameViewInfo");
            LogUtils.file("SudFSMMGStateHandlerImpl", "onGetGameViewInfo");
            iSudFSMMG.onGetGameViewInfo(new xxg0(this.f178892a, gfg0Var, bsg0Var), str4);
        }
    }
}
