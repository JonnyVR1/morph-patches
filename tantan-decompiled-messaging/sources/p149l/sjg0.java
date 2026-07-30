package p149l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class sjg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cjp0 f164836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gmg0 f164837b;

    public sjg0(gmg0 gmg0Var, cjp0 cjp0Var) {
        this.f164837b = gmg0Var;
        this.f164836a = cjp0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m184492a(Exception exc) {
        this.f164837b.f103466b.mo101634c(new RuntimeException("doubao error code:-1  msg:" + exc));
        this.f164837b.f103475k.m155681b();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f164837b.m126975i(this.f164836a);
        } catch (Exception e) {
            LogUtils.file("DoubaoAsrAsyncClient", "发送数据发生异常：" + LogUtils.getErrorInfo(e));
            ThreadUtils.postUITask(new Runnable() { // from class: l.vhg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181503a.m184492a(e);
                }
            });
        } finally {
            LogUtils.file("DoubaoAsrAsyncClient", "发送语音数据的线程已经停止");
        }
    }
}
