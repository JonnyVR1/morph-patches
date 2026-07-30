package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class nzs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vys0 f144471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxs0 f144472b;

    public nzs0(d0t0 d0t0Var, vys0 vys0Var, jxs0 jxs0Var) {
        this.f144471a = vys0Var;
        this.f144472b = jxs0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            this.f144471a.mo120569f(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
