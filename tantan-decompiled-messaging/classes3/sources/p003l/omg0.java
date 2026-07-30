package p003l;

import l.amg0;
import l.mcg0;
import l.njg0;
import l.t6g0;
import l.v8g0;
import l.y6g0;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class omg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f6185a;

    public omg0(oqg0 oqg0Var) {
        this.f6185a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6723a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f6185a.f6216m;
        if (t6g0Var != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadCompleted");
            SudLogger.m10032d(v8g0.F, "onGameLoadCompleted");
            amg0 amg0Var = t6g0Var.b.w;
            amg0Var.h = true;
            amg0Var.j.stop();
            amg0Var.k.stop();
            amg0Var.l.stop();
            amg0Var.a();
            mcg0 mcg0Var = amg0Var.a;
            if (mcg0Var != null) {
                mcg0Var.e = 0;
            }
            if (mcg0Var != null) {
                mcg0Var.f = "success";
            }
            amg0Var.h();
            t6g0Var.b.a();
            v8g0 v8g0Var = t6g0Var.b;
            if (!v8g0Var.j) {
                v8g0Var.j = true;
                v8g0Var.b(3, 0, 100, false);
            }
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
