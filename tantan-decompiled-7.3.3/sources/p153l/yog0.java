package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class yog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qug0 f200977a;

    public yog0(qug0 qug0Var) {
        this.f200977a = qug0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SudLogger.m222811d(this.f200977a.f159573a, "delayGetGateTokenTask run");
        LogUtils.file("SudGIPWebSocket", "delayGetGateTokenTask run");
        this.f200977a.m178149a();
    }
}
