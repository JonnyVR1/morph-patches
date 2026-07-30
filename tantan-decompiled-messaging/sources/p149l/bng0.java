package p149l;

import android.widget.FrameLayout;
import tech.sud.runtime.p137a.C22402c;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class bng0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f76402a;

    public bng0(h8g0 h8g0Var) {
        this.f76402a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        qpg0 qpg0Var = this.f76402a.f106410a;
        if (qpg0Var != null) {
            FrameLayout frameLayout = str.equals("true") ? this.f76402a.f106419j : null;
            C22402c c22402c = qpg0Var.f155751c;
            if (c22402c == null) {
                return;
            }
            c22402c.mo221583a(frameLayout);
        }
    }
}
