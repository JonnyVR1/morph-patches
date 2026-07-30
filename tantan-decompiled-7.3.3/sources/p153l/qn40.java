package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GreetingBatchPostBody;

/* JADX INFO: loaded from: classes11.dex */
public class qn40 extends ar2<vn40> {
    public qn40(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m177207h0(Bundle bundle) {
        ((vn40) this.viewModel).m201912p(CoreModule.f18264c.f20356V1.m170552h3());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.nn40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142758a.m177207h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m177208i0(uxj0 uxj0Var) {
        CoreModule.f18264c.f20420r0.m35095J6();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: j0 */
    public void m177209j0(GreetingBatchPostBody greetingBatchPostBody) {
        act().duringCreated(CoreModule.f18264c.f20356V1.m170551g3(greetingBatchPostBody)).subscribe(psd0.m173597H(new y20() { // from class: l.on40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148068a.m177208i0((uxj0) obj);
            }
        }, new y20() { // from class: l.pn40
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网络异常");
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
