package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class iyx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f115514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f115515b;

    public iyx0(C2458g c2458g, AtomicReference atomicReference) {
        this.f115514a = atomicReference;
        this.f115515b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f115514a) {
            try {
                try {
                    this.f115514a.set(Long.valueOf(this.f115515b.mo15085a().m192655u(this.f115515b.mo15094j().m15106z(), q8s0.f153246P)));
                    this.f115514a.notify();
                } catch (Throwable th) {
                    this.f115514a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
