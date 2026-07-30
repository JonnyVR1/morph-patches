package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class q5t0 implements Runnable {
    public q5t0(s5t0 s5t0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
