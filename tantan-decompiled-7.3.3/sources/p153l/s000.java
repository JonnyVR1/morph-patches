package p153l;

import android.view.MotionEvent;
import com.p051p1.mobile.android.app.C4470c;

/* JADX INFO: loaded from: classes4.dex */
public class s000 extends j3z<h100> {

    /* JADX INFO: renamed from: b */
    public boolean f165649b;

    public s000(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m183869i0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m183869i0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.r000
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160564a.m183870j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m183870j0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i || c4470c == C4470c.f16271m || c4470c != C4470c.f16268j) {
            return;
        }
        m143372e0().mo50158l().m110949a3();
    }

    /* JADX INFO: renamed from: k0 */
    public void m183871k0(MotionEvent motionEvent) {
        m143374g0().m133253Y(motionEvent);
    }

    /* JADX INFO: renamed from: l0 */
    public void m183872l0(boolean z) {
        this.f165649b = z;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
