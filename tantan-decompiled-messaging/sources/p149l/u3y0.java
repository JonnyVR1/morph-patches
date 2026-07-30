package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;

/* JADX INFO: loaded from: classes6.dex */
public final class u3y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f173671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f173672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzon f173673c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b3y0 f173674d;

    public u3y0(b3y0 b3y0Var, zzo zzoVar, boolean z, zzon zzonVar) {
        this.f173671a = zzoVar;
        this.f173672b = z;
        this.f173673c = zzonVar;
        this.f173674d = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjw0 cjw0Var = this.f173674d.f73268d;
        if (cjw0Var == null) {
            this.f173674d.zzj().m211412A().m123936a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f173671a);
        this.f173674d.m100142K(cjw0Var, this.f173672b ? null : this.f173673c, this.f173671a);
        this.f173674d.m100127g0();
    }
}
