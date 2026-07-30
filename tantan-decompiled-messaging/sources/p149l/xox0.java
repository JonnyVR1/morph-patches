package p149l;

import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;

/* JADX INFO: loaded from: classes6.dex */
public final class xox0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzon f193886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f193887b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clx0 f193888c;

    public xox0(clx0 clx0Var, zzon zzonVar, zzo zzoVar) {
        this.f193886a = zzonVar;
        this.f193887b = zzoVar;
        this.f193888c = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f193888c.f81477a.m15310u0();
        Object objM15359F = this.f193886a.m15359F();
        clx0 clx0Var = this.f193888c;
        if (objM15359F == null) {
            clx0Var.f81477a.m15255A(this.f193886a.zza, this.f193887b);
        } else {
            clx0Var.f81477a.m15307t(this.f193886a, this.f193887b);
        }
    }
}
