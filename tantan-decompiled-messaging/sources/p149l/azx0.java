package p149l;

import com.google.android.gms.measurement.internal.C2453b;
import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class azx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2453b f72391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f72392b;

    public azx0(C2458g c2458g, C2453b c2453b) {
        this.f72391a = c2453b;
        this.f72392b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM192709u = this.f72392b.mo15088d().m192709u(this.f72391a);
        C2458g c2458g = this.f72392b;
        if (!zM192709u) {
            c2458g.zzj().m211415D().m123937b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f72391a.m15072a()));
            return;
        }
        c2458g.zzj().m211416E().m123937b("Setting DMA consent(FE)", this.f72391a);
        boolean zM100159d0 = this.f72392b.mo15098n().m100159d0();
        C2458g c2458g2 = this.f72392b;
        if (zM100159d0) {
            c2458g2.mo15098n().m100154Y();
        } else {
            c2458g2.mo15098n().m100144O(false);
        }
    }
}
