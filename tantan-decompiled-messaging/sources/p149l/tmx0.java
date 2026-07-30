package p149l;

import com.google.android.gms.measurement.internal.zzae;

/* JADX INFO: loaded from: classes6.dex */
public final class tmx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzae f171197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clx0 f171198b;

    public tmx0(clx0 clx0Var, zzae zzaeVar) {
        this.f171197a = zzaeVar;
        this.f171198b = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f171198b.f81477a.m15310u0();
        Object objM15359F = this.f171197a.zzc.m15359F();
        clx0 clx0Var = this.f171198b;
        if (objM15359F == null) {
            clx0Var.f81477a.m15298o(this.f171197a);
        } else {
            clx0Var.f81477a.m15269R(this.f171197a);
        }
    }
}
