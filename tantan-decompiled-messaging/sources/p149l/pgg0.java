package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class pgg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f148703a;

    public pgg0(oqg0 oqg0Var) {
        this.f148703a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        if (this.f148703a.f145150m != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadStarted");
            SudLogger.m221565d(v8g0.f180492F, "onGameLoadStarted");
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
