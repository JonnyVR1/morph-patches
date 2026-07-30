package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GreetingBatchPostBody;

/* JADX INFO: loaded from: classes11.dex */
public class cf40 extends jq2<hf40> {
    public cf40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m106482h0(Bundle bundle) {
        ((hf40) this.viewModel).m130746p(CoreModule.f17545c.f19614V1.m109898h3());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.ze40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202778a.m106482h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m106483i0(roj0 roj0Var) {
        CoreModule.f17545c.f19678r0.m34092J6();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: j0 */
    public void m106484j0(GreetingBatchPostBody greetingBatchPostBody) {
        act().duringCreated(CoreModule.f17545c.f19614V1.m109897g3(greetingBatchPostBody)).subscribe(mkd0.m154956H(new e30() { // from class: l.af40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69148a.m106483i0((roj0) obj);
            }
        }, new e30() { // from class: l.bf40
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网络异常");
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
