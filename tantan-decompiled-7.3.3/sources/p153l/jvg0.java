package p153l;

import android.widget.FrameLayout;
import tech.sud.runtime.p141a.C22517c;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class jvg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f122801a;

    public jvg0(pgg0 pgg0Var) {
        this.f122801a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        yxg0 yxg0Var = this.f122801a.f152264a;
        if (yxg0Var != null) {
            FrameLayout frameLayout = str.equals("true") ? this.f122801a.f152273j : null;
            C22517c c22517c = yxg0Var.f201971c;
            if (c22517c == null) {
                return;
            }
            c22517c.mo222829a(frameLayout);
        }
    }
}
