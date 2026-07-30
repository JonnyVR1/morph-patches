package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class y5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f197605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f197606b;

    public y5y0(C2481g c2481g, long j) {
        this.f197605a = j;
        this.f197606b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f197606b.m15230G0(this.f197605a);
        this.f197606b.mo15152n().m134533B(new AtomicReference<>());
    }
}
