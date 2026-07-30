package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class mna0 extends ar2<rna0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f137665a;

    /* JADX INFO: renamed from: b */
    public String f137666b;

    /* JADX INFO: renamed from: c */
    public String f137667c;

    public mna0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m159121k0(Bundle bundle) {
        LoopInputType loopInputType = (LoopInputType) ((rna0) this.viewModel).m182140m().getSerializable("loop_input_type");
        this.f137665a = loopInputType;
        ((rna0) this.viewModel).m182149z(loopInputType, this.f137666b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m159122l0(uxj0 uxj0Var) {
        if (!NullChecker.m82486a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        i4g0.m138495D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", jyb.m147494Y("tantanx_pet_photo_final_saveresult", "yes"));
        CoreModule.f18264c.f20381e0.m116468H7();
        act().m68056e2();
        r1j0.m179420g("上传成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m159123m0() {
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m159124n0(Throwable th) {
        i4g0.m138495D("e_pet_photo_save_result", "p_tantanx_pet_photo_normalguide", jyb.m147494Y("tantanx_pet_photo_final_saveresult", "no"));
        if (!NullChecker.m82486a(act()) || act().isFinishing() || act().isDestroyed()) {
            return;
        }
        act().progressDismiss();
        if (bsj0.m106250H(th)) {
            return;
        }
        act().dialog().m21499D(R$string.f28679c3).m21555t0(R$string.f28711i, new Runnable() { // from class: l.lna0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132751a.m159123m0();
            }
        }).m21540k0(R$string.f28663a).m21567z0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Bundle extras = act().getIntent().getExtras();
        this.f137667c = extras.getString("explore_ext_data");
        this.f137666b = extras.getString("loop_edit_from", "");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ina0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115883a.m159121k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public String m159125i0() {
        return this.f137667c;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m159126j0(boolean z) {
        if (((rna0) this.viewModel).m182138k() <= 0) {
            return ((rna0) this.viewModel).m182143q();
        }
        act().m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m159127o0(User user, User user2) {
        User userSubtract = user.subtract(user2);
        if (!NullChecker.m82486a(userSubtract)) {
            act().m68056e2();
        } else {
            act().progress(R$string.f28619R0);
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.jna0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121762a.m159122l0((uxj0) obj);
                }
            }, new y20() { // from class: l.kna0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127570a.m159124n0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
