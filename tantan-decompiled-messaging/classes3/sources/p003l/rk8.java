package p003l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rk8 extends u3e {

    /* JADX INFO: renamed from: j */
    public tbl0 f6974j;

    public rk8(sd50 sd50Var, Context context) {
        super(sd50Var, context);
        this.f6974j = new tbl0(context);
    }

    @Override // p003l.u3e
    /* JADX INFO: renamed from: a */
    public boolean mo7343a() {
        return this.f6974j.m7735e();
    }

    @Override // p003l.u3e
    /* JADX INFO: renamed from: b */
    public boolean mo7344b(MotionEvent motionEvent) {
        this.f6974j.m7731a(motionEvent);
        return super.mo7344b(motionEvent);
    }

    @Override // p003l.u3e
    /* JADX INFO: renamed from: c */
    public void mo7345c(boolean z) {
        super.mo7345c(z);
        this.f6974j.m7733c();
    }
}
