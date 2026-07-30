package p153l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes13.dex */
public class u0h extends i5e {

    /* JADX INFO: renamed from: j */
    public wkl0 f176884j;

    public u0h(zl50 zl50Var, Context context) {
        super(zl50Var, context);
        this.f176884j = new wkl0(context);
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: a */
    public boolean mo138695a() {
        return this.f176884j.m206847e();
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: b */
    public boolean mo138696b(MotionEvent motionEvent) {
        this.f176884j.m206843a(motionEvent);
        return super.mo138696b(motionEvent);
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: c */
    public void mo138697c(boolean z) {
        super.mo138697c(z);
        this.f176884j.m206845c();
    }
}
