package p153l;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class wet0 implements Runnable {
    public wet0(yet0 yet0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
