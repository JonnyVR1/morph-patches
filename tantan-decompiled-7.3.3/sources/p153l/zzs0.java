package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bzs0 f206737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxs0 f206738b;

    public zzs0(d0t0 d0t0Var, bzs0 bzs0Var, jxs0 jxs0Var) {
        this.f206737a = bzs0Var;
        this.f206738b = jxs0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            this.f206737a.mo107256f(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
