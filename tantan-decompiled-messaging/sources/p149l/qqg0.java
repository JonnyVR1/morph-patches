package p149l;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class qqg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f155887a;

    /* JADX INFO: renamed from: b */
    public final Handler f155888b;

    public qqg0(ReferenceQueue referenceQueue, Handler handler) {
        this.f155887a = referenceQueue;
        this.f155888b = handler;
        setDaemon(true);
        setName("SudPicasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                dbg0 dbg0Var = (dbg0) this.f155887a.remove(1000L);
                Message messageObtainMessage = this.f155888b.obtainMessage();
                if (dbg0Var != null) {
                    messageObtainMessage.what = 3;
                    messageObtainMessage.obj = dbg0Var.f85315a;
                    this.f155888b.sendMessage(messageObtainMessage);
                } else {
                    messageObtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                this.f155888b.post(new rpg0(e));
                return;
            }
        }
    }
}
