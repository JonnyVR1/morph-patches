package p149l;

import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class egg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gmg0 f90943a;

    public egg0(gmg0 gmg0Var) {
        this.f90943a = gmg0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        gmg0 gmg0Var = this.f90943a;
        gmg0Var.f103475k.m155684e(gmg0Var.f103466b);
        LogUtils.file("DoubaoAsrAsyncClient", "接收数据的线程已经停止");
    }
}
