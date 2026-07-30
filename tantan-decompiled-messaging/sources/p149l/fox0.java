package p149l;

import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class fox0 implements Callable<zzaj> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f98646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clx0 f98647b;

    public fox0(clx0 clx0Var, zzo zzoVar) {
        this.f98646a = zzoVar;
        this.f98647b = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaj call() throws Exception {
        this.f98647b.f81477a.m15310u0();
        return new zzaj(this.f98647b.f81477a.m15282c(this.f98646a.zza));
    }
}
