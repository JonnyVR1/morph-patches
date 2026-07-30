package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class kqg0 implements wcg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xrg0 f124267a;

    public kqg0(xrg0 xrg0Var) {
        this.f124267a = xrg0Var;
    }

    @Override // p149l.wcg0
    /* JADX INFO: renamed from: a */
    public final void mo146944a(String str) {
        LogUtils.file("SudGameLoadingStageLoadCore", "isCoreInstalled error:" + str);
        xrg0 xrg0Var = this.f124267a;
        if (xrg0Var.f194143e) {
            return;
        }
        xrg0Var.f194139a.m116842b(2, -1, str);
    }

    @Override // p149l.wcg0
    /* JADX INFO: renamed from: b */
    public final void mo146945b(String str) {
        LogUtils.file("SudGameLoadingStageLoadCore", "isCoreInstalled isInstalled=true  abi:".concat(str));
        SudLogger.m221565d(xrg0.f194138f, "isCoreInstalled isInstalled=true  abi:".concat(str));
        xrg0 xrg0Var = this.f124267a;
        if (xrg0Var.f194143e) {
            return;
        }
        xrg0Var.f194141c.etCorePath = "";
        xrg0Var.f194139a.m116841a(2);
    }
}
