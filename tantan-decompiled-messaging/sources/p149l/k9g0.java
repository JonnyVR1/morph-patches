package p149l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes.dex */
public final class k9g0 implements ISudListenerGetMGInfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ veg0 f122010a;

    public k9g0(veg0 veg0Var) {
        this.f122010a = veg0Var;
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onFailure(int i, String str) {
        SudLogger.m221567e(veg0.f181187i, "preload getMGInfo failure retCode=" + i + " retMsg=" + str);
        this.f122010a.m198181a(i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onSuccess(GameInfo gameInfo) {
        veg0 veg0Var = this.f122010a;
        if (veg0Var.f181190c) {
            if (gameInfo == null) {
                veg0Var.m198181a(-10100, "gameInfo is null");
                return;
            }
            if (1 != gameInfo.engine) {
                veg0Var.m198181a(-10100, "This sdk not support engine=" + gameInfo.engine + " of game runtime.");
                return;
            }
            SudLogger.m221565d(veg0.f181187i, "preload getMGInfo success " + gameInfo.toString());
            veg0 veg0Var2 = this.f122010a;
            ycg0 ycg0Var = veg0Var2.f181191d;
            int i = gameInfo.engine;
            p9g0 p9g0Var = new p9g0(veg0Var2, gameInfo);
            if (1 == i) {
                ycg0Var.f197449a.m149778b(i, p9g0Var);
                return;
            }
            if (5 == i) {
                ycg0Var.f197450b.m149778b(i, p9g0Var);
                return;
            }
            ycg0Var.getClass();
            p9g0Var.mo146944a("不支持engine=" + i);
        }
    }
}
