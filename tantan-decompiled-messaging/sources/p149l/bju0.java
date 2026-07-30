package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public final class bju0 implements lhs0 {

    /* JADX INFO: renamed from: a */
    public final xyt0 f75937a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzcag f75938b;

    /* JADX INFO: renamed from: c */
    public final String f75939c;

    /* JADX INFO: renamed from: d */
    public final String f75940d;

    public bju0(xyt0 xyt0Var, kxv0 kxv0Var) {
        this.f75937a = xyt0Var;
        this.f75938b = kxv0Var.f125207m;
        this.f75939c = kxv0Var.f125203k;
        this.f75940d = kxv0Var.f125205l;
    }

    @Override // p149l.lhs0
    /* JADX INFO: renamed from: f0 */
    public final void mo102230f0(zzcag zzcagVar) {
        int i;
        String str;
        zzcag zzcagVar2 = this.f75938b;
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
        this.f75937a.m211878w0(new wvs0(str, i), this.f75939c, this.f75940d);
    }

    @Override // p149l.lhs0
    public final void zzb() {
        this.f75937a.zze();
    }

    @Override // p149l.lhs0
    public final void zzc() {
        this.f75937a.zzf();
    }
}
