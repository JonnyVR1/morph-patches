package p153l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class fhg0 implements ISudListenerGetMGInfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gmg0 f99049a;

    public fhg0(gmg0 gmg0Var) {
        this.f99049a = gmg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m125552a(boolean z, String str, boolean z2) {
        SudLogger.m222811d(gmg0.f104976g, "isGameInstalled isInstalled=" + z);
        if (z2 && nkg0.f142458a && utg0.f180951f == 4) {
            this.f99049a.f104980d.isInstalled = false;
        } else {
            GameInfo gameInfo = this.f99049a.f104980d;
            gameInfo.gamePath = str;
            gameInfo.isInstalled = z;
        }
        this.f99049a.f104977a.m159698a(1);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onFailure(int i, String str) {
        LogUtils.file("SudGameLoadingStageGetMGInfo", "getMGInfo failure retCode=" + i + " retMsg=" + str);
        SudLogger.m222813e(gmg0.f104976g, "getMGInfo failure retCode=" + i + " retMsg=" + str);
        gmg0 gmg0Var = this.f99049a;
        if (gmg0Var.f104981e) {
            return;
        }
        gmg0Var.f104977a.m159699b(1, i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerGetMGInfo
    public final void onSuccess(GameInfo gameInfo) {
        SudLogger.m222811d(gmg0.f104976g, "getMGInfo success " + gameInfo.toString());
        gmg0 gmg0Var = this.f99049a;
        gmg0Var.f104980d = gameInfo;
        if (gmg0Var.f104981e) {
            return;
        }
        int i = gameInfo.engine;
        if (1 != i) {
            this.f99049a.f104977a.m159699b(1, -10100, String.format("This sdk not support engine=%d unityFrameworkType=%d of game runtime.", Integer.valueOf(i), Integer.valueOf(this.f99049a.f104980d.unityFrameworkType)));
            return;
        }
        cmg0 cmg0Var = gmg0Var.f104979c;
        long j = gameInfo.mgId;
        String str = gameInfo.version;
        uog0 uog0Var = new uog0() { // from class: l.wgg0
            @Override // p153l.uog0
            /* JADX INFO: renamed from: a */
            public final void mo105395a(boolean z, String str2, boolean z2) {
                this.f188973a.m125552a(z, str2, z2);
            }
        };
        if (1 == i) {
            cmg0Var.f82590a.m202120d(i, j, str, uog0Var);
        } else if (5 == i) {
            cmg0Var.f82591b.m202120d(i, j, str, uog0Var);
        } else {
            cmg0Var.getClass();
        }
    }
}
