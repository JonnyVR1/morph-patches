package p153l;

import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xhg0 implements elg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GameInfo f194364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dng0 f194365b;

    public xhg0(dng0 dng0Var, GameInfo gameInfo) {
        this.f194365b = dng0Var;
        this.f194364a = gameInfo;
    }

    @Override // p153l.elg0
    /* JADX INFO: renamed from: a */
    public final void mo121147a(String str) {
        this.f194365b.m117063a(-1, str);
    }

    @Override // p153l.elg0
    /* JADX INFO: renamed from: b */
    public final void mo121148b(String str) {
        if (this.f194365b.f89801c) {
            LogUtils.file("SudGamePkgPreloadTask", "isCoreInstalled isInstalled=true");
            String str2 = dng0.f89798i;
            SudLogger.m222811d(str2, "isCoreInstalled isInstalled=true");
            LogUtils.file("SudGamePkgPreloadTask", "preload core is installed");
            SudLogger.m222811d(str2, "preload core is installed");
            this.f194365b.m117064b(this.f194364a);
        }
    }
}
