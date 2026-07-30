package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class r46 extends jq2<w46> {
    public r46(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m177775g0(Bundle bundle) {
        ((w46) this.viewModel).m201464c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m177776h0(j760 j760Var) {
        S s;
        F f = j760Var.f116564a;
        if (f == 0 || (s = j760Var.f116565b) == 0) {
            return;
        }
        ((w46) this.viewModel).m201463b(((q860) f).f153135a, ((List) s).size() > 0);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.o46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141746a.m177775g0((Bundle) obj);
            }
        });
        this.lifecycleProviderImpl.duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33164vn(), CoreModule.f17545c.f19642f0.m33100qo(), new x9j() { // from class: l.p46
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((q860) obj, (List) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.q46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152545a.m177776h0((j760) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
