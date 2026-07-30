package p153l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class asg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hsp0 f73114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oug0 f73115b;

    public asg0(oug0 oug0Var, hsp0 hsp0Var) {
        this.f73115b = oug0Var;
        this.f73114a = hsp0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m99907a(Exception exc) {
        this.f73115b.f149151b.mo122355c(new RuntimeException("doubao error code:-1  msg:" + exc));
        this.f73115b.f149160k.m198352b();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f73115b.m169299i(this.f73114a);
        } catch (Exception e) {
            LogUtils.file("DoubaoAsrAsyncClient", "发送数据发生异常：" + LogUtils.getErrorInfo(e));
            ThreadUtils.postUITask(new Runnable() { // from class: l.dqg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90242a.m99907a(e);
                }
            });
        } finally {
            LogUtils.file("DoubaoAsrAsyncClient", "发送语音数据的线程已经停止");
        }
    }
}
