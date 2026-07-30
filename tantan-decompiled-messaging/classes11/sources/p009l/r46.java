package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r46 extends jq2<w46> {
    public r46(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m21399g0(Bundle bundle) {
        ((w46) ((jq2) this).viewModel).m23874c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m21400h0(j760 j760Var) {
        Object obj;
        Object obj2 = j760Var.a;
        if (obj2 == null || (obj = j760Var.b) == null) {
            return;
        }
        ((w46) ((jq2) this).viewModel).m23873b(((q860) obj2).f19068a, ((List) obj).size() > 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m21401a0() {
        super.a0();
        creates(new e30() { // from class: l.o46
            public final void call(Object obj) {
                this.f17827a.m21399g0((Bundle) obj);
            }
        });
        ((jq2) this).lifecycleProviderImpl.duringCreated(mkd0.r(CoreModule.c.f0.vn(), CoreModule.c.f0.qo(), new x9j() { // from class: l.p46
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((q860) obj, (List) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.q46
            public final void call(Object obj) {
                this.f19011a.m21400h0((j760) obj);
            }
        }));
    }

    public void destroy() {
    }
}
