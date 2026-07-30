package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class syg0 implements elg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f0h0 f171253a;

    public syg0(f0h0 f0h0Var) {
        this.f171253a = f0h0Var;
    }

    @Override // p153l.elg0
    /* JADX INFO: renamed from: a */
    public final void mo121147a(String str) {
        LogUtils.file("SudGameLoadingStageLoadCore", "isCoreInstalled error:" + str);
        f0h0 f0h0Var = this.f171253a;
        if (f0h0Var.f96686e) {
            return;
        }
        f0h0Var.f96682a.m159699b(2, -1, str);
    }

    @Override // p153l.elg0
    /* JADX INFO: renamed from: b */
    public final void mo121148b(String str) {
        LogUtils.file("SudGameLoadingStageLoadCore", "isCoreInstalled isInstalled=true  abi:".concat(str));
        SudLogger.m222811d(f0h0.f96681f, "isCoreInstalled isInstalled=true  abi:".concat(str));
        f0h0 f0h0Var = this.f171253a;
        if (f0h0Var.f96686e) {
            return;
        }
        f0h0Var.f96684c.etCorePath = "";
        f0h0Var.f96682a.m159698a(2);
    }
}
