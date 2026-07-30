package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qgg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ img0 f154333a;

    public qgg0(img0 img0Var) {
        this.f154333a = img0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SudLogger.m221565d(this.f154333a.f113927a, "delayGetGateTokenTask run");
        LogUtils.file("SudGIPWebSocket", "delayGetGateTokenTask run");
        this.f154333a.m137076a();
    }
}
