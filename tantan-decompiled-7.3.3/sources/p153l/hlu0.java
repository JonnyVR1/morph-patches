package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class hlu0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f110537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ilu0 f110538b;

    public hlu0(ilu0 ilu0Var, View view) {
        this.f110537a = view;
        this.f110538b = ilu0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168246b5)).booleanValue()) {
            bxy0.m106933q().m120274v(th, "omid native display exp");
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f110538b.m140688L(this.f110537a, (hfw0) obj);
    }
}
