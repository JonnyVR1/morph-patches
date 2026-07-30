package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class dxq0 implements z1r0, d2r0 {

    /* JADX INFO: renamed from: a */
    private Context f91102a;

    public dxq0(Context context) {
        this.f91102a = context;
    }

    @Override // p153l.z1r0
    /* JADX INFO: renamed from: a */
    public void mo87535a(w0r0 w0r0Var) {
        if (w0r0Var != null && w0r0Var.m204320a() == 0 && "PING".equals(w0r0Var.m204322c())) {
            kxq0.m151855h(this.f91102a);
        } else {
            kxq0.m151848a(this.f91102a);
        }
    }

    @Override // p153l.z1r0
    /* JADX INFO: renamed from: a */
    public void mo87534a(g2r0 g2r0Var) {
        kxq0.m151848a(this.f91102a);
    }

    @Override // p153l.d2r0
    /* JADX INFO: renamed from: a */
    public boolean mo87539a(g2r0 g2r0Var) {
        return true;
    }
}
