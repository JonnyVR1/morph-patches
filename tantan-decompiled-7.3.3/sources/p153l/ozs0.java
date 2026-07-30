package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ozs0 implements t7y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yys0 f149951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxs0 f149952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d0t0 f149953c;

    public ozs0(d0t0 d0t0Var, yys0 yys0Var, jxs0 jxs0Var) {
        this.f149951a = yys0Var;
        this.f149952b = jxs0Var;
        this.f149953c = d0t0Var;
    }

    @Override // p153l.t7y
    /* JADX INFO: renamed from: a */
    public final void mo95420a(b70 b70Var) {
        try {
            this.f149951a.mo144728f(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
