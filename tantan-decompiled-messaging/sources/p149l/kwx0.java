package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class kwx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f125037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f125038b;

    public kwx0(C2458g c2458g, AtomicReference atomicReference) {
        this.f125037a = atomicReference;
        this.f125038b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f125037a) {
            try {
                try {
                    this.f125037a.set(this.f125038b.mo15085a().m192628A(this.f125038b.mo15094j().m15106z()));
                    this.f125037a.notify();
                } catch (Throwable th) {
                    this.f125037a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
