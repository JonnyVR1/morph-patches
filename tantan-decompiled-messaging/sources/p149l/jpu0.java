package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class jpu0 implements xou0 {

    /* JADX INFO: renamed from: a */
    public final long f119229a;

    /* JADX INFO: renamed from: b */
    public final ycv0 f119230b;

    public jpu0(long j, Context context, cpu0 cpu0Var, xbt0 xbt0Var, String str) {
        this.f119229a = j;
        gvv0 gvv0VarMo135814y = xbt0Var.mo135814y();
        gvv0VarMo135814y.zzc(context);
        gvv0VarMo135814y.mo126002a(new zzq());
        gvv0VarMo135814y.zzb(str);
        ycv0 ycv0VarZza = gvv0VarMo135814y.zzd().zza();
        this.f119230b = ycv0VarZza;
        ycv0VarZza.mo137603x2(new ipu0(this, cpu0Var));
    }

    @Override // p149l.xou0
    /* JADX INFO: renamed from: a */
    public final void mo142759a(zzl zzlVar) {
        this.f119230b.mo137591f2(zzlVar);
    }

    @Override // p149l.xou0
    public final void zza() {
        this.f119230b.mo137593g();
    }

    @Override // p149l.xou0
    public final void zzc() {
        this.f119230b.mo137585P7(s050.m181848Y2(null));
    }
}
