package p153l;

import com.google.android.gms.measurement.internal.C2476b;
import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class g8y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2476b f102726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f102727b;

    public g8y0(C2481g c2481g, C2476b c2476b) {
        this.f102726a = c2476b;
        this.f102727b = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM98526u = this.f102727b.mo15142d().m98526u(this.f102726a);
        C2481g c2481g = this.f102727b;
        if (!zM98526u) {
            c2481g.zzj().m114561D().m153301b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f102726a.m15126a()));
            return;
        }
        c2481g.zzj().m114562E().m153301b("Setting DMA consent(FE)", this.f102726a);
        boolean zM134559d0 = this.f102727b.mo15152n().m134559d0();
        C2481g c2481g2 = this.f102727b;
        if (zM134559d0) {
            c2481g2.mo15152n().m134554Y();
        } else {
            c2481g2.mo15152n().m134544O(false);
        }
    }
}
