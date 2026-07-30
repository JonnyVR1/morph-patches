package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class o7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f145337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f145338b;

    public o7y0(C2481g c2481g, AtomicReference atomicReference) {
        this.f145337a = atomicReference;
        this.f145338b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f145337a) {
            try {
                try {
                    this.f145337a.set(Long.valueOf(this.f145338b.mo15139a().m98447u(this.f145338b.mo15148j().m15160z(), whs0.f189222P)));
                    this.f145337a.notify();
                } catch (Throwable th) {
                    this.f145337a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
