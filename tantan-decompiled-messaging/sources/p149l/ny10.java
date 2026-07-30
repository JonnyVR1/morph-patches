package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class ny10 extends hx10<oy10> {
    public ny10(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        lifecycle().filter(new w9j() { // from class: l.ky10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).filter(new w9j() { // from class: l.ly10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!wn90.m204606U(CoreModule.f17545c.f19639e0.m169527p9()));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.my10
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169371B7();
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
