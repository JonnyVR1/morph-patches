package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class c0t0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ezs0 f79297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxs0 f79298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d0t0 f79299c;

    public c0t0(d0t0 d0t0Var, ezs0 ezs0Var, jxs0 jxs0Var) {
        this.f79297a = ezs0Var;
        this.f79298b = jxs0Var;
        this.f79299c = d0t0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            this.f79297a.mo113349f(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
