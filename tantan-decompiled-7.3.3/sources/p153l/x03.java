package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class x03 extends ar2<z03> {

    /* JADX INFO: renamed from: a */
    public BirthdayVerifyAct f191865a;

    public x03(BirthdayVerifyAct birthdayVerifyAct) {
        super(birthdayVerifyAct);
        this.f191865a = birthdayVerifyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m208808i0(Bundle bundle) {
        this.f191865a.setSwipeBackEnable(false);
        this.f191865a.setTitle("信息确认", true);
        if (NullChecker.m82486a(this.f191865a.getSupportActionBar())) {
            this.f191865a.getSupportActionBar().mo102196w(false);
        }
        ((z03) this.viewModel).m218105e();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.t03
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171444a.m208808i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m208809j0(uxj0 uxj0Var) {
        this.f191865a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m208810k0() {
        this.f191865a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m208811l0(Throwable th) {
        if (NullChecker.m82486a(this.f191865a)) {
            this.f191865a.progressDismiss();
            if (bsj0.m106250H(th)) {
                return;
            }
            this.f191865a.dialog().m21499D(R$string.f18586Jl).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.w03
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186537a.m208810k0();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m208812m0(User user) {
        User userSubtract = user.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        boolean zM82486a = NullChecker.m82486a(userSubtract);
        BirthdayVerifyAct birthdayVerifyAct = this.f191865a;
        if (!zM82486a) {
            birthdayVerifyAct.lambda$debugItems$19();
        } else {
            birthdayVerifyAct.progress(R$string.f18632L5);
            CoreModule.f18264c.f20381e0.m116620u9(userSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.u03
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176844a.m208809j0((uxj0) obj);
                }
            }, new y20() { // from class: l.v03
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181834a.m208811l0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
