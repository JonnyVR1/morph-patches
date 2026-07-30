package p153l;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class yyg0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f202106a;

    /* JADX INFO: renamed from: b */
    public final Handler f202107b;

    public yyg0(ReferenceQueue referenceQueue, Handler handler) {
        this.f202106a = referenceQueue;
        this.f202107b = handler;
        setDaemon(true);
        setName("SudPicasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ljg0 ljg0Var = (ljg0) this.f202106a.remove(1000L);
                Message messageObtainMessage = this.f202107b.obtainMessage();
                if (ljg0Var != null) {
                    messageObtainMessage.what = 3;
                    messageObtainMessage.obj = ljg0Var.f132331a;
                    this.f202107b.sendMessage(messageObtainMessage);
                } else {
                    messageObtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                this.f202107b.post(new zxg0(e));
                return;
            }
        }
    }
}
