package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class sss0 {

    /* JADX INFO: renamed from: a */
    public HandlerThread f166241a = null;

    /* JADX INFO: renamed from: b */
    public Handler f166242b = null;

    /* JADX INFO: renamed from: c */
    public int f166243c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f166244d = new Object();

    /* JADX INFO: renamed from: a */
    public final Handler m185772a() {
        return this.f166242b;
    }

    /* JADX INFO: renamed from: b */
    public final Looper m185773b() {
        Looper looper;
        synchronized (this.f166244d) {
            try {
                int i = this.f166243c;
                HandlerThread handlerThread = this.f166241a;
                if (i != 0) {
                    Preconditions.checkNotNull(handlerThread, "Invalid state: handlerThread should already been initialized.");
                } else if (handlerThread == null) {
                    xsu0.m210834k("Starting the looper thread.");
                    HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                    this.f166241a = handlerThread2;
                    handlerThread2.start();
                    this.f166242b = new obw0(this.f166241a.getLooper());
                    xsu0.m210834k("Looper thread started.");
                } else {
                    xsu0.m210834k("Resuming the looper thread");
                    this.f166244d.notifyAll();
                }
                this.f166243c++;
                looper = this.f166241a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
