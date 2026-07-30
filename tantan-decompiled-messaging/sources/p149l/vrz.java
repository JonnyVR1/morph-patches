package p149l;

import android.view.MotionEvent;
import com.p046p1.mobile.android.app.C4319c;

/* JADX INFO: loaded from: classes4.dex */
public class vrz extends muy<ksz> {

    /* JADX INFO: renamed from: b */
    public boolean f182793b;

    public vrz(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m199791i0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m199791i0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.urz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177934a.m199792j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m199792j0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i || c4319c == C4319c.f15552m || c4319c != C4319c.f15549j) {
            return;
        }
        m156455e0().mo48974l().m120743a3();
    }

    /* JADX INFO: renamed from: k0 */
    public void m199793k0(MotionEvent motionEvent) {
        m156457g0().m147182Y(motionEvent);
    }

    /* JADX INFO: renamed from: l0 */
    public void m199794l0(boolean z) {
        this.f182793b = z;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
