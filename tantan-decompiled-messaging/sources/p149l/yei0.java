package p149l;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes13.dex */
public class yei0 extends Thread {

    /* JADX INFO: renamed from: a */
    public String f197691a;

    /* JADX INFO: renamed from: b */
    public BlockingQueue<Runnable> f197692b = new LinkedBlockingQueue();

    public yei0(String str) {
        this.f197691a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m214349a(Runnable runnable) {
        this.f197692b.add(runnable);
    }

    /* JADX INFO: Infinite loop detected, blocks: 18, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                try {
                    this.f197692b.take().run();
                } catch (Throwable th) {
                    try {
                        nt2.m160831v("[beatles]", "TaskDispatcher threadName:" + this.f197691a + " e name:" + th.getClass().getName() + " msg:" + th.getMessage() + " stacktrace:" + jsb.m143009b(th));
                    } catch (Throwable th2) {
                        nt2.m160831v("[beatles]", "TaskDispatcher threadName:" + this.f197691a + "ignored name:" + th2.getClass().getName() + " msg:" + th2.getMessage());
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
