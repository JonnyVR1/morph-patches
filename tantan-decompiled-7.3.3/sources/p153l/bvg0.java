package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class bvg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f78592a;

    public bvg0(pgg0 pgg0Var) {
        this.f78592a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        iog0 iog0Var;
        if (ysg0.f201404a != null) {
            LogUtils.file(3, "WXGame", "触发了：GameViewOnSurfaceCreated");
            if (mzg0.f139508m) {
                SudLogger.m222819w("WXGame", "触发了：GameViewOnSurfaceCreated");
            }
        }
        qkg0 qkg0Var = this.f78592a.f152271h;
        if (qkg0Var == null || (iog0Var = qkg0Var.f158136a.f139517i) == null) {
            return;
        }
        iug0 iug0Var = (iug0) iog0Var;
        LogUtils.file("LoadGameStatsManager", "gameViewOnSurfaceCreated");
        iug0Var.f116947r = true;
        iug0Var.m142193e(false);
    }
}
