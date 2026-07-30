package p153l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes.dex */
public final class shg0 implements ISudListenerGetMGInfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dng0 f168707a;

    public shg0(dng0 dng0Var) {
        this.f168707a = dng0Var;
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onFailure(int i, String str) {
        SudLogger.m222813e(dng0.f89798i, "preload getMGInfo failure retCode=" + i + " retMsg=" + str);
        this.f168707a.m117063a(i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onSuccess(GameInfo gameInfo) {
        dng0 dng0Var = this.f168707a;
        if (dng0Var.f89801c) {
            if (gameInfo == null) {
                dng0Var.m117063a(-10100, "gameInfo is null");
                return;
            }
            if (1 != gameInfo.engine) {
                dng0Var.m117063a(-10100, "This sdk not support engine=" + gameInfo.engine + " of game runtime.");
                return;
            }
            SudLogger.m222811d(dng0.f89798i, "preload getMGInfo success " + gameInfo.toString());
            dng0 dng0Var2 = this.f168707a;
            glg0 glg0Var = dng0Var2.f89802d;
            int i = gameInfo.engine;
            xhg0 xhg0Var = new xhg0(dng0Var2, gameInfo);
            if (1 == i) {
                glg0Var.f104849a.m192040b(i, xhg0Var);
                return;
            }
            if (5 == i) {
                glg0Var.f104850b.m192040b(i, xhg0Var);
                return;
            }
            glg0Var.getClass();
            xhg0Var.mo121147a("不支持engine=" + i);
        }
    }
}
