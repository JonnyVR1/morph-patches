package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class eyx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f93832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f93833b;

    public eyx0(C2458g c2458g, AtomicReference atomicReference) {
        this.f93832a = atomicReference;
        this.f93833b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f93832a) {
            try {
                try {
                    this.f93832a.set(Integer.valueOf(this.f93833b.mo15085a().m192651q(this.f93833b.mo15094j().m15106z(), q8s0.f153248Q)));
                    this.f93832a.notify();
                } catch (Throwable th) {
                    this.f93832a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
