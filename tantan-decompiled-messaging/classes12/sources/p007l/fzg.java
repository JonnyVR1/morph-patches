package p007l;

import android.content.Context;
import android.view.MotionEvent;
import l.sd50;
import l.u3e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fzg extends u3e {

    /* JADX INFO: renamed from: j */
    public sbl0 f8280j;

    public fzg(sd50 sd50Var, Context context) {
        super(sd50Var, context);
        this.f8280j = new sbl0(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m10338a() {
        return this.f8280j.m14122e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m10339b(MotionEvent motionEvent) {
        this.f8280j.m14118a(motionEvent);
        return super.b(motionEvent);
    }

    /* JADX INFO: renamed from: c */
    public void m10340c(boolean z) {
        super.c(z);
        this.f8280j.m14120c();
    }
}
