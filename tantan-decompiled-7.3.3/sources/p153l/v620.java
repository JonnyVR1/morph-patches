package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class v620 extends p520<w620> {
    public v620(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        lifecycle().filter(new qcj() { // from class: l.s620
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).filter(new qcj() { // from class: l.t620
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!aw90.m100566U(CoreModule.f18264c.f20381e0.m116600p9()));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.u620
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116444B7();
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
