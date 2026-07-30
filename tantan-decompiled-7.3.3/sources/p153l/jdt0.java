package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class jdt0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xct0 f120361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vct0 f120362b;

    public jdt0(kdt0 kdt0Var, xct0 xct0Var, vct0 vct0Var) {
        this.f120361a = xct0Var;
        this.f120362b = vct0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        this.f120362b.zza();
    }

    @Override // p153l.lvw0
    public final void zzb(@Nullable Object obj) {
        this.f120361a.zza(obj);
    }
}
