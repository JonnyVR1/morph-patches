package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class gmx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f103551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clx0 f103552b;

    public gmx0(clx0 clx0Var, zzo zzoVar) {
        this.f103551a = zzoVar;
        this.f103552b = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103552b.f81477a.m15310u0();
        C2461j c2461j = this.f103552b.f81477a;
        zzo zzoVar = this.f103551a;
        c2461j.zzl().mo15092h();
        c2461j.m15312v0();
        Preconditions.checkNotEmpty(zzoVar.zza);
        c2461j.m15292i(zzoVar);
    }
}
