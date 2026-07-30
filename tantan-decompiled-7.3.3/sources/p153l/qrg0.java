package p153l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qrg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iug0 f159121a;

    public qrg0(iug0 iug0Var) {
        this.f159121a = iug0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("LoadGameStatsManager", "onPauseMG");
        iug0 iug0Var = this.f159121a;
        iug0Var.f116936g = true;
        iug0Var.m142193e(false);
    }
}
