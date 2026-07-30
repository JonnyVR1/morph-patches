package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GreetingBatchPostBody;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cf40 extends jq2<hf40> {
    public cf40(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m12544h0(Bundle bundle) {
        ((hf40) ((jq2) this).viewModel).m15628p(CoreModule.c.V1.h3());
    }

    /* JADX INFO: renamed from: Z */
    public void m12545Z() {
        super.Z();
        creates(new e30() { // from class: l.ze40
            public final void call(Object obj) {
                this.f23624a.m12544h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m12546i0(roj0 roj0Var) {
        CoreModule.c.r0.J6();
        act().finish();
    }

    /* JADX INFO: renamed from: j0 */
    public void m12547j0(GreetingBatchPostBody greetingBatchPostBody) {
        act().duringCreated(CoreModule.c.V1.g3(greetingBatchPostBody)).subscribe(mkd0.H(new e30() { // from class: l.af40
            public final void call(Object obj) {
                this.f9460a.m12546i0((roj0) obj);
            }
        }, new e30() { // from class: l.bf40
            public final void call(Object obj) {
                osi0.g("网络异常");
            }
        }));
    }

    public void destroy() {
    }
}
