package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class wnq0 implements tsq0, xsq0 {

    /* JADX INFO: renamed from: a */
    private Context f187336a;

    public wnq0(Context context) {
        this.f187336a = context;
    }

    @Override // p149l.tsq0
    /* JADX INFO: renamed from: a */
    public void mo86364a(qrq0 qrq0Var) {
        if (qrq0Var != null && qrq0Var.m176083a() == 0 && "PING".equals(qrq0Var.m176085c())) {
            eoq0.m117508i(this.f187336a);
        } else {
            eoq0.m117504e(this.f187336a);
        }
    }

    @Override // p149l.tsq0
    /* JADX INFO: renamed from: a */
    public void mo86363a(atq0 atq0Var) {
        eoq0.m117504e(this.f187336a);
    }

    @Override // p149l.xsq0
    /* JADX INFO: renamed from: a */
    public boolean mo86368a(atq0 atq0Var) {
        return true;
    }
}
