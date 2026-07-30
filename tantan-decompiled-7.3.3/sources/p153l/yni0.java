package p153l;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public class yni0 extends Thread {

    /* JADX INFO: renamed from: a */
    public String f200889a;

    /* JADX INFO: renamed from: b */
    public BlockingQueue<Runnable> f200890b = new LinkedBlockingQueue();

    public yni0(String str) {
        this.f200889a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m216870a(Runnable runnable) {
        this.f200890b.add(runnable);
    }

    /* JADX INFO: Infinite loop detected, blocks: 18, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                try {
                    this.f200890b.take().run();
                } catch (Throwable th) {
                    try {
                        du2.m118062v("[beatles]", "TaskDispatcher threadName:" + this.f200889a + " e name:" + th.getClass().getName() + " msg:" + th.getMessage() + " stacktrace:" + xtb.m213048b(th));
                    } catch (Throwable th2) {
                        du2.m118062v("[beatles]", "TaskDispatcher threadName:" + this.f200889a + "ignored name:" + th2.getClass().getName() + " msg:" + th2.getMessage());
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
