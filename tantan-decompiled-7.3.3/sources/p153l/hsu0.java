package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public final class hsu0 implements rqs0 {

    /* JADX INFO: renamed from: a */
    public final d8u0 f111477a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzcag f111478b;

    /* JADX INFO: renamed from: c */
    public final String f111479c;

    /* JADX INFO: renamed from: d */
    public final String f111480d;

    public hsu0(d8u0 d8u0Var, q6w0 q6w0Var) {
        this.f111477a = d8u0Var;
        this.f111478b = q6w0Var.f155897m;
        this.f111479c = q6w0Var.f155893k;
        this.f111480d = q6w0Var.f155895l;
    }

    @Override // p153l.rqs0
    /* JADX INFO: renamed from: f0 */
    public final void mo137038f0(zzcag zzcagVar) {
        int i;
        String str;
        zzcag zzcagVar2 = this.f111478b;
        if (zzcagVar2 != null) {
            zzcagVar = zzcagVar2;
        }
        if (zzcagVar != null) {
            str = zzcagVar.zza;
            i = zzcagVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.f111477a.m114924w0(new c5t0(str, i), this.f111479c, this.f111480d);
    }

    @Override // p153l.rqs0
    public final void zzb() {
        this.f111477a.zze();
    }

    @Override // p153l.rqs0
    public final void zzc() {
        this.f111477a.zzf();
    }
}
