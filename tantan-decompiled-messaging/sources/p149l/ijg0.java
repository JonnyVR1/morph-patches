package p149l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ijg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ amg0 f113547a;

    public ijg0(amg0 amg0Var) {
        this.f113547a = amg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("LoadGameStatsManager", "onPauseMG");
        amg0 amg0Var = this.f113547a;
        amg0Var.f70606g = true;
        amg0Var.m97558e(false);
    }
}
