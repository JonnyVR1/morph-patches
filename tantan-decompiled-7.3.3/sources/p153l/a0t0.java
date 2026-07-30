package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class a0t0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sys0 f67748a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxs0 f67749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d0t0 f67750c;

    public a0t0(d0t0 d0t0Var, sys0 sys0Var, jxs0 jxs0Var) {
        this.f67748a = sys0Var;
        this.f67749b = jxs0Var;
        this.f67750c = d0t0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            this.f67748a.mo157999f(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
