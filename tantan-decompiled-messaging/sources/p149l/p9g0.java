package p149l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class p9g0 implements wcg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GameInfo f147766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ veg0 f147767b;

    public p9g0(veg0 veg0Var, GameInfo gameInfo) {
        this.f147767b = veg0Var;
        this.f147766a = gameInfo;
    }

    @Override // p149l.wcg0
    /* JADX INFO: renamed from: a */
    public final void mo146944a(String str) {
        this.f147767b.m198181a(-1, str);
    }

    @Override // p149l.wcg0
    /* JADX INFO: renamed from: b */
    public final void mo146945b(String str) {
        if (this.f147767b.f181190c) {
            LogUtils.file("SudGamePkgPreloadTask", "isCoreInstalled isInstalled=true");
            String str2 = veg0.f181187i;
            SudLogger.m221565d(str2, "isCoreInstalled isInstalled=true");
            LogUtils.file("SudGamePkgPreloadTask", "preload core is installed");
            SudLogger.m221565d(str2, "preload core is installed");
            this.f147767b.m198182b(this.f147766a);
        }
    }
}
