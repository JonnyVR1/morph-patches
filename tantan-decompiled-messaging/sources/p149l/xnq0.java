package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class xnq0 implements tsq0, xsq0 {

    /* JADX INFO: renamed from: a */
    private Context f193725a;

    public xnq0(Context context) {
        this.f193725a = context;
    }

    @Override // p149l.tsq0
    /* JADX INFO: renamed from: a */
    public void mo86364a(qrq0 qrq0Var) {
        if (qrq0Var != null && qrq0Var.m176083a() == 0 && "PING".equals(qrq0Var.m176085c())) {
            eoq0.m117507h(this.f193725a);
        } else {
            eoq0.m117500a(this.f193725a);
        }
    }

    @Override // p149l.tsq0
    /* JADX INFO: renamed from: a */
    public void mo86363a(atq0 atq0Var) {
        eoq0.m117500a(this.f193725a);
    }

    @Override // p149l.xsq0
    /* JADX INFO: renamed from: a */
    public boolean mo86368a(atq0 atq0Var) {
        return true;
    }
}
