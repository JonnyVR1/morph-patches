package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class q5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f155772a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f155773b;

    public q5y0(C2481g c2481g, AtomicReference atomicReference) {
        this.f155772a = atomicReference;
        this.f155773b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f155772a) {
            try {
                try {
                    this.f155772a.set(this.f155773b.mo15139a().m98420A(this.f155773b.mo15148j().m15160z()));
                    this.f155772a.notify();
                } catch (Throwable th) {
                    this.f155772a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
