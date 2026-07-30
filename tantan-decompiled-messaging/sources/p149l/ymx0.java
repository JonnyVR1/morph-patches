package p149l;

import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ymx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzae f199126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f199127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clx0 f199128c;

    public ymx0(clx0 clx0Var, zzae zzaeVar, zzo zzoVar) {
        this.f199126a = zzaeVar;
        this.f199127b = zzoVar;
        this.f199128c = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f199128c.f81477a.m15310u0();
        Object objM15359F = this.f199126a.zzc.m15359F();
        clx0 clx0Var = this.f199128c;
        if (objM15359F == null) {
            clx0Var.f81477a.m15300p(this.f199126a, this.f199127b);
        } else {
            clx0Var.f81477a.m15270S(this.f199126a, this.f199127b);
        }
    }
}
