package p149l;

import tech.sud.gip.core.view.SudGameViewLifecycleListener;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class rbg0 implements SudGameViewLifecycleListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v8g0 f158609a;

    public rbg0(v8g0 v8g0Var) {
        this.f158609a = v8g0Var;
    }

    @Override // tech.sud.gip.core.view.SudGameViewLifecycleListener
    public final void onAttachedToWindow() {
        amg0 amg0Var = this.f158609a.f180521w;
        amg0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "gameViewOnAttachedToWindow");
        amg0Var.f70616q = true;
        amg0Var.m97558e(false);
    }

    @Override // tech.sud.gip.core.view.SudGameViewLifecycleListener
    public final void onDetachedFromWindow() {
        amg0 amg0Var = this.f158609a.f180521w;
        amg0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "gameViewOnDetachedFromWindow");
        amg0Var.f70616q = false;
        amg0Var.m97558e(false);
    }
}
