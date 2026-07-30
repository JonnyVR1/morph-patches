package p003l;

import l.njg0;
import l.tjg0;
import l.y6g0;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class m8g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f5566a;

    public m8g0(oqg0 oqg0Var) {
        this.f5566a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6323a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        tjg0 tjg0Var = new tjg0();
        tjg0Var.a = "getGameViewInfo";
        tjg0Var.b = System.currentTimeMillis();
        this.f5566a.m6727b(tjg0Var);
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f5566a.f6206c.get();
        if (iSudFSMMG != null) {
            SudLogger.m10036i(oqg0.f6203n, "onGetGameViewInfo");
            LogUtils.file("SudFSMMGStateHandlerImpl", "onGetGameViewInfo");
            iSudFSMMG.onGetGameViewInfo(new ppg0(this.f5566a, y6g0Var, tjg0Var), str4);
        }
    }
}
