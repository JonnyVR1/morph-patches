package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ryx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f161593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f161594b;

    public ryx0(C2458g c2458g, AtomicReference atomicReference) {
        this.f161593a = atomicReference;
        this.f161594b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f161593a) {
            try {
                try {
                    this.f161593a.set(Double.valueOf(this.f161594b.mo15085a().m192643i(this.f161594b.mo15094j().m15106z(), q8s0.f153250R)));
                    this.f161593a.notify();
                } catch (Throwable th) {
                    this.f161593a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
