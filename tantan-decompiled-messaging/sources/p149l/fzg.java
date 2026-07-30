package p149l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes12.dex */
public class fzg extends u3e {

    /* JADX INFO: renamed from: j */
    public sbl0 f99963j;

    public fzg(sd50 sd50Var, Context context) {
        super(sd50Var, context);
        this.f99963j = new sbl0(context);
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: a */
    public boolean mo123845a() {
        return this.f99963j.m183232e();
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: b */
    public boolean mo123846b(MotionEvent motionEvent) {
        this.f99963j.m183228a(motionEvent);
        return super.mo123846b(motionEvent);
    }

    @Override // p149l.u3e
    /* JADX INFO: renamed from: c */
    public void mo123847c(boolean z) {
        super.mo123847c(z);
        this.f99963j.m183230c();
    }
}
