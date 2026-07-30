package p149l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class x8g0 implements ISudListenerGetMGInfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ydg0 f191511a;

    public x8g0(ydg0 ydg0Var) {
        this.f191511a = ydg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m207394a(boolean z, String str, boolean z2) {
        SudLogger.m221565d(ydg0.f197562g, "isGameInstalled isInstalled=" + z);
        if (z2 && fcg0.f96796a && mlg0.f134431f == 4) {
            this.f191511a.f197566d.isInstalled = false;
        } else {
            GameInfo gameInfo = this.f191511a.f197566d;
            gameInfo.gamePath = str;
            gameInfo.isInstalled = z;
        }
        this.f191511a.f197563a.m116841a(1);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onFailure(int i, String str) {
        LogUtils.file("SudGameLoadingStageGetMGInfo", "getMGInfo failure retCode=" + i + " retMsg=" + str);
        SudLogger.m221567e(ydg0.f197562g, "getMGInfo failure retCode=" + i + " retMsg=" + str);
        ydg0 ydg0Var = this.f191511a;
        if (ydg0Var.f197567e) {
            return;
        }
        ydg0Var.f197563a.m116842b(1, i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onSuccess(GameInfo gameInfo) {
        SudLogger.m221565d(ydg0.f197562g, "getMGInfo success " + gameInfo.toString());
        ydg0 ydg0Var = this.f191511a;
        ydg0Var.f197566d = gameInfo;
        if (ydg0Var.f197567e) {
            return;
        }
        int i = gameInfo.engine;
        if (1 != i) {
            this.f191511a.f197563a.m116842b(1, -10100, String.format("This sdk not support engine=%d unityFrameworkType=%d of game runtime.", Integer.valueOf(i), Integer.valueOf(this.f191511a.f197566d.unityFrameworkType)));
            return;
        }
        udg0 udg0Var = ydg0Var.f197565c;
        long j = gameInfo.mgId;
        String str = gameInfo.version;
        mgg0 mgg0Var = new mgg0() { // from class: l.o8g0
            @Override // p149l.mgg0
            /* JADX INFO: renamed from: a */
            public final void mo154544a(boolean z, String str2, boolean z2) {
                this.f142629a.m207394a(z, str2, z2);
            }
        };
        if (1 == i) {
            udg0Var.f175919a.m159331d(i, j, str, mgg0Var);
        } else if (5 == i) {
            udg0Var.f175920b.m159331d(i, j, str, mgg0Var);
        } else {
            udg0Var.getClass();
        }
    }
}
