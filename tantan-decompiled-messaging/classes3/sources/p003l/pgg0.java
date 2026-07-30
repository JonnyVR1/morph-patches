package p003l;

import l.njg0;
import l.v8g0;
import l.y6g0;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class pgg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f6406a;

    public pgg0(oqg0 oqg0Var) {
        this.f6406a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6857a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        if (this.f6406a.f6216m != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadStarted");
            SudLogger.m10032d(v8g0.F, "onGameLoadStarted");
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
