package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;

/* JADX INFO: loaded from: classes6.dex */
public final class ady0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f70743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f70744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzon f70745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hcy0 f70746d;

    public ady0(hcy0 hcy0Var, zzo zzoVar, boolean z, zzon zzonVar) {
        this.f70743a = zzoVar;
        this.f70744b = z;
        this.f70745c = zzonVar;
        this.f70746d = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isw0 isw0Var = this.f70746d.f108759d;
        if (isw0Var == null) {
            this.f70746d.zzj().m114558A().m153300a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f70743a);
        this.f70746d.m134542K(isw0Var, this.f70744b ? null : this.f70745c, this.f70743a);
        this.f70746d.m134527g0();
    }
}
