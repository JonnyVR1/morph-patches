package p153l;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class onw0 extends dnw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f148234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rnw0 f148235c;

    public onw0(rnw0 rnw0Var, IBinder iBinder) {
        this.f148234b = iBinder;
        this.f148235c = rnw0Var;
    }

    @Override // p153l.dnw0
    /* JADX INFO: renamed from: a */
    public final void mo117085a() {
        this.f148235c.f164132a.f169787m = rlw0.m182034o8(this.f148234b);
        snw0.m187019q(this.f148235c.f164132a);
        this.f148235c.f164132a.f169781g = false;
        Iterator it = this.f148235c.f164132a.f169778d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f148235c.f164132a.f169778d.clear();
    }
}
