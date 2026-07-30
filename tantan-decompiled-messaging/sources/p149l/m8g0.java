package p149l;

import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class m8g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f132574a;

    public m8g0(oqg0 oqg0Var) {
        this.f132574a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        tjg0 tjg0Var = new tjg0();
        tjg0Var.f170720a = "getGameViewInfo";
        tjg0Var.f170721b = System.currentTimeMillis();
        this.f132574a.m165428b(tjg0Var);
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f132574a.f145140c.get();
        if (iSudFSMMG != null) {
            SudLogger.m221569i(oqg0.f145137n, "onGetGameViewInfo");
            LogUtils.file("SudFSMMGStateHandlerImpl", "onGetGameViewInfo");
            iSudFSMMG.onGetGameViewInfo(new ppg0(this.f132574a, y6g0Var, tjg0Var), str4);
        }
    }
}
