package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class y1t0 {

    /* JADX INFO: renamed from: a */
    public HandlerThread f197130a = null;

    /* JADX INFO: renamed from: b */
    public Handler f197131b = null;

    /* JADX INFO: renamed from: c */
    public int f197132c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f197133d = new Object();

    /* JADX INFO: renamed from: a */
    public final Handler m213966a() {
        return this.f197131b;
    }

    /* JADX INFO: renamed from: b */
    public final Looper m213967b() {
        Looper looper;
        synchronized (this.f197133d) {
            try {
                int i = this.f197132c;
                HandlerThread handlerThread = this.f197130a;
                if (i != 0) {
                    Preconditions.checkNotNull(handlerThread, "Invalid state: handlerThread should already been initialized.");
                } else if (handlerThread == null) {
                    d2v0.m113737k("Starting the looper thread.");
                    HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                    this.f197130a = handlerThread2;
                    handlerThread2.start();
                    this.f197131b = new ukw0(this.f197130a.getLooper());
                    d2v0.m113737k("Looper thread started.");
                } else {
                    d2v0.m113737k("Resuming the looper thread");
                    this.f197133d.notifyAll();
                }
                this.f197132c++;
                looper = this.f197130a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
