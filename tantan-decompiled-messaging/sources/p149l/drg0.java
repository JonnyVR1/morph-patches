package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class drg0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f87611a;

    public drg0(h8g0 h8g0Var) {
        this.f87611a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        agg0 agg0Var;
        if (qkg0.f155121a != null) {
            LogUtils.file(3, "WXGame", "触发了：GameViewOnSurfaceDestroyed");
            if (erg0.f92916m) {
                SudLogger.m221573w("WXGame", "触发了：GameViewOnSurfaceDestroyed");
            }
        }
        icg0 icg0Var = this.f87611a.f106417h;
        if (icg0Var == null || (agg0Var = icg0Var.f112462a.f92925i) == null) {
            return;
        }
        amg0 amg0Var = (amg0) agg0Var;
        LogUtils.file("LoadGameStatsManager", "gameViewOnSurfaceDestroyed");
        amg0Var.f70617r = false;
        amg0Var.m97558e(false);
    }
}
