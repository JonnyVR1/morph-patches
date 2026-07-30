package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class wug0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f190864a;

    public wug0(wyg0 wyg0Var) {
        this.f190864a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        bfg0 bfg0Var = this.f190864a.f191652m;
        if (bfg0Var != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "onGameLoadCompleted");
            SudLogger.m222811d(dhg0.f88494F, "onGameLoadCompleted");
            iug0 iug0Var = bfg0Var.f76491b.f88523w;
            iug0Var.f116937h = true;
            iug0Var.f116939j.stop();
            iug0Var.f116940k.stop();
            iug0Var.f116941l.stop();
            iug0Var.m142189a();
            ukg0 ukg0Var = iug0Var.f116930a;
            if (ukg0Var != null) {
                ukg0Var.f179396e = 0;
            }
            if (ukg0Var != null) {
                ukg0Var.f179397f = "success";
            }
            iug0Var.m142196h();
            bfg0Var.f76491b.m115799a();
            dhg0 dhg0Var = bfg0Var.f76491b;
            if (!dhg0Var.f88510j) {
                dhg0Var.f88510j = true;
                dhg0Var.m115800b(3, 0, 100, false);
            }
        }
        gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
