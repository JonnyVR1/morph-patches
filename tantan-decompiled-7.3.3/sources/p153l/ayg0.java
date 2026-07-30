package p153l;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class ayg0 extends Thread {
    public ayg0(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
