package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class omg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f144649a;

    public omg0(oqg0 oqg0Var) {
        this.f144649a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f144649a.f145150m;
        if (t6g0Var != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadCompleted");
            SudLogger.m221565d(v8g0.f180492F, "onGameLoadCompleted");
            amg0 amg0Var = t6g0Var.f168615b.f180521w;
            amg0Var.f70607h = true;
            amg0Var.f70609j.stop();
            amg0Var.f70610k.stop();
            amg0Var.f70611l.stop();
            amg0Var.m97554a();
            mcg0 mcg0Var = amg0Var.f70600a;
            if (mcg0Var != null) {
                mcg0Var.f133115e = 0;
            }
            if (mcg0Var != null) {
                mcg0Var.f133116f = "success";
            }
            amg0Var.m97561h();
            t6g0Var.f168615b.m197440a();
            v8g0 v8g0Var = t6g0Var.f168615b;
            if (!v8g0Var.f180508j) {
                v8g0Var.f180508j = true;
                v8g0Var.m197441b(3, 0, 100, false);
            }
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
