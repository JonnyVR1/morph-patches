package p149l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xfg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ amg0 f192687a;

    public xfg0(amg0 amg0Var) {
        this.f192687a = amg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("LoadGameStatsManager", "onResumeMG");
        amg0 amg0Var = this.f192687a;
        amg0Var.f70606g = false;
        amg0Var.m97558e(false);
    }
}
