package p153l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class fog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iug0 f100056a;

    public fog0(iug0 iug0Var) {
        this.f100056a = iug0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("LoadGameStatsManager", "onResumeMG");
        iug0 iug0Var = this.f100056a;
        iug0Var.f116936g = false;
        iug0Var.m142193e(false);
    }
}
