package p153l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class wl8 extends i5e {

    /* JADX INFO: renamed from: j */
    public xkl0 f189663j;

    public wl8(zl50 zl50Var, Context context) {
        super(zl50Var, context);
        this.f189663j = new xkl0(context);
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: a */
    public boolean mo138695a() {
        return this.f189663j.m211407e();
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: b */
    public boolean mo138696b(MotionEvent motionEvent) {
        this.f189663j.m211403a(motionEvent);
        return super.mo138696b(motionEvent);
    }

    @Override // p153l.i5e
    /* JADX INFO: renamed from: c */
    public void mo138697c(boolean z) {
        super.mo138697c(z);
        this.f189663j.m211405c();
    }
}
