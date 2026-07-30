package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class x7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f192766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f192767b;

    public x7y0(C2481g c2481g, AtomicReference atomicReference) {
        this.f192766a = atomicReference;
        this.f192767b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f192766a) {
            try {
                try {
                    this.f192766a.set(Double.valueOf(this.f192767b.mo15139a().m98435i(this.f192767b.mo15148j().m15160z(), whs0.f189226R)));
                    this.f192766a.notify();
                } catch (Throwable th) {
                    this.f192766a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
