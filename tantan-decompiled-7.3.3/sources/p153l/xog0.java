package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class xog0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f195573a;

    public xog0(wyg0 wyg0Var) {
        this.f195573a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        if (this.f195573a.f191652m != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadStarted");
            SudLogger.m222811d(dhg0.f88494F, "onGameLoadStarted");
        }
        gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
