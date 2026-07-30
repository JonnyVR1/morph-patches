package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.vwb;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ifa0 extends jq2<nfa0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f13193a;

    /* JADX INFO: renamed from: b */
    public String f13194b;

    /* JADX INFO: renamed from: c */
    public String f13195c;

    public ifa0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m15133k0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((nfa0) ((jq2) this).viewModel).m18722m().getSerializable("loop_input_type");
        this.f13193a = loopInputType;
        ((nfa0) ((jq2) this).viewModel).m18731z(loopInputType, this.f13194b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m15134l0(roj0 roj0Var) {
        if (!NullChecker.a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        zvf0.D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", new j760[]{vwb.Y("tantanx_pet_photo_final_saveresult", "yes")});
        CoreModule.c.e0.H7();
        act().finish();
        osi0.g("上传成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m15135m0() {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m15136n0(Throwable th) {
        zvf0.D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", new j760[]{vwb.Y("tantanx_pet_photo_final_saveresult", "no")});
        if (!NullChecker.a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        if (yij0.H(th)) {
            return;
        }
        act().dialog().D(R.string.c3).t0(R.string.i, new Runnable() { // from class: l.hfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12011a.m15135m0();
            }
        }).k0(R.string.a).z0();
    }

    /* JADX INFO: renamed from: Z */
    public void m15137Z() {
        super.Z();
        Bundle extras = act().getIntent().getExtras();
        this.f13195c = extras.getString("explore_ext_data");
        this.f13194b = extras.getString("loop_edit_from", "");
    }

    /* JADX INFO: renamed from: a0 */
    public void m15138a0() {
        super.a0();
        creates(new e30() { // from class: l.efa0
            public final void call(Object obj) {
                this.f9729a.m15133k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public String m15139i0() {
        return this.f13195c;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m15140j0(boolean z) {
        if (((nfa0) ((jq2) this).viewModel).m18720k() <= 0) {
            return ((nfa0) ((jq2) this).viewModel).m18725q();
        }
        act().finish();
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m15141o0(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.a(userSubtract)) {
            act().finish();
        } else {
            act().progress(R.string.R0);
            duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.ffa0
                public final void call(Object obj) {
                    this.f10311a.m15134l0((roj0) obj);
                }
            }, new e30() { // from class: l.gfa0
                public final void call(Object obj) {
                    this.f11397a.m15136n0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
