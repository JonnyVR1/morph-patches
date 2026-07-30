package p153l;

import tech.sud.gip.core.view.SudGameViewLifecycleListener;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zjg0 implements SudGameViewLifecycleListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dhg0 f204668a;

    public zjg0(dhg0 dhg0Var) {
        this.f204668a = dhg0Var;
    }

    @Override // tech.sud.gip.core.view.SudGameViewLifecycleListener
    public final void onAttachedToWindow() {
        iug0 iug0Var = this.f204668a.f88523w;
        iug0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "gameViewOnAttachedToWindow");
        iug0Var.f116946q = true;
        iug0Var.m142193e(false);
    }

    @Override // tech.sud.gip.core.view.SudGameViewLifecycleListener
    public final void onDetachedFromWindow() {
        iug0 iug0Var = this.f204668a.f88523w;
        iug0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "gameViewOnDetachedFromWindow");
        iug0Var.f116946q = false;
        iug0Var.m142193e(false);
    }
}
