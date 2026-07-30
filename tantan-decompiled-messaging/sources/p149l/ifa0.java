package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ifa0 extends jq2<nfa0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f112968a;

    /* JADX INFO: renamed from: b */
    public String f112969b;

    /* JADX INFO: renamed from: c */
    public String f112970c;

    public ifa0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m135888k0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((nfa0) this.viewModel).m159168m().getSerializable("loop_input_type");
        this.f112968a = loopInputType;
        ((nfa0) this.viewModel).m159177z(loopInputType, this.f112969b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m135889l0(roj0 roj0Var) {
        if (!NullChecker.m81303a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        zvf0.m220371D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", vwb.m200311Y("tantanx_pet_photo_final_saveresult", "yes"));
        CoreModule.f17545c.f19639e0.m169395H7();
        act().m66873d2();
        osi0.m165783g("上传成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m135890m0() {
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m135891n0(Throwable th) {
        zvf0.m220371D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", vwb.m200311Y("tantanx_pet_photo_final_saveresult", "no"));
        if (!NullChecker.m81303a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        if (yij0.m214930H(th)) {
            return;
        }
        act().dialog().m20500D(R$string.f27831c3).m20556t0(R$string.f27863i, new Runnable() { // from class: l.hfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107464a.m135890m0();
            }
        }).m20541k0(R$string.f27815a).m20568z0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Bundle extras = act().getIntent().getExtras();
        this.f112970c = extras.getString("explore_ext_data");
        this.f112969b = extras.getString("loop_edit_from", "");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.efa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90815a.m135888k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public String m135892i0() {
        return this.f112970c;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m135893j0(boolean z) {
        if (((nfa0) this.viewModel).m159166k() <= 0) {
            return ((nfa0) this.viewModel).m159171q();
        }
        act().m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m135894o0(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.m81303a(userSubtract)) {
            act().m66873d2();
        } else {
            act().progress(R$string.f27771R0);
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.ffa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97197a.m135889l0((roj0) obj);
                }
            }, new e30() { // from class: l.gfa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f102353a.m135891n0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
