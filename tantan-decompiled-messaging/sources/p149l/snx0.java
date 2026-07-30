package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class snx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f165524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clx0 f165525b;

    public snx0(clx0 clx0Var, zzo zzoVar) {
        this.f165524a = zzoVar;
        this.f165525b = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f165525b.f81477a.m15310u0();
        C2461j c2461j = this.f165525b.f81477a;
        zzo zzoVar = this.f165524a;
        c2461j.zzl().mo15092h();
        c2461j.m15312v0();
        Preconditions.checkNotEmpty(zzoVar.zza);
        c2461j.m15294j0(zzoVar);
        c2461j.m15291h0(zzoVar);
    }
}
