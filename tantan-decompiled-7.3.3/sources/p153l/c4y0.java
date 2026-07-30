package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class c4y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f79743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f79744b;

    public c4y0(C2481g c2481g, AtomicReference atomicReference) {
        this.f79743a = atomicReference;
        this.f79744b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f79743a) {
            try {
                try {
                    this.f79743a.set(Boolean.valueOf(this.f79744b.mo15139a().m98424G(this.f79744b.mo15148j().m15160z())));
                    this.f79743a.notify();
                } catch (Throwable th) {
                    this.f79743a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
