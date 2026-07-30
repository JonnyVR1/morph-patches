package p153l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class mog0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oug0 f137825a;

    public mog0(oug0 oug0Var) {
        this.f137825a = oug0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        oug0 oug0Var = this.f137825a;
        oug0Var.f149160k.m198355e(oug0Var.f149151b);
        LogUtils.file("DoubaoAsrAsyncClient", "接收数据的线程已经停止");
    }
}
