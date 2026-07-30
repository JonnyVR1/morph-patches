package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class wux0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f188171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f188172b;

    public wux0(C2458g c2458g, AtomicReference atomicReference) {
        this.f188171a = atomicReference;
        this.f188172b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f188171a) {
            try {
                try {
                    this.f188171a.set(Boolean.valueOf(this.f188172b.mo15085a().m192632G(this.f188172b.mo15094j().m15106z())));
                    this.f188171a.notify();
                } catch (Throwable th) {
                    this.f188171a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
