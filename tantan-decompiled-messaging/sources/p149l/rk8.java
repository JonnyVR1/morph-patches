package p149l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class rk8 extends u3e {

    /* JADX INFO: renamed from: j */
    public tbl0 f159783j;

    public rk8(sd50 sd50Var, Context context) {
        super(sd50Var, context);
        this.f159783j = new tbl0(context);
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: a */
    public boolean mo123845a() {
        return this.f159783j.m187882e();
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: b */
    public boolean mo123846b(MotionEvent motionEvent) {
        this.f159783j.m187878a(motionEvent);
        return super.mo123846b(motionEvent);
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: c */
    public void mo123847c(boolean z) {
        super.mo123847c(z);
        this.f159783j.m187880c();
    }
}
