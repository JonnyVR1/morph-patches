package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class i03 extends jq2<k03> {

    /* JADX INFO: renamed from: a */
    public BirthdayVerifyAct f110256a;

    public i03(BirthdayVerifyAct birthdayVerifyAct) {
        super(birthdayVerifyAct);
        this.f110256a = birthdayVerifyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m133746i0(Bundle bundle) {
        this.f110256a.setSwipeBackEnable(false);
        this.f110256a.setTitle("信息确认", true);
        if (NullChecker.m81303a(this.f110256a.getSupportActionBar())) {
            this.f110256a.getSupportActionBar().mo134136w(false);
        }
        ((k03) this.viewModel).m143987e();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.e03
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88533a.m133746i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m133747j0(roj0 roj0Var) {
        this.f110256a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m133748k0() {
        this.f110256a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m133749l0(Throwable th) {
        if (NullChecker.m81303a(this.f110256a)) {
            this.f110256a.progressDismiss();
            if (yij0.m214930H(th)) {
                return;
            }
            this.f110256a.dialog().m20500D(R$string.f18768nl).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.h03
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105199a.m133748k0();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m133750m0(User user) {
        User userSubtract = user.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        boolean zM81303a = NullChecker.m81303a(userSubtract);
        BirthdayVerifyAct birthdayVerifyAct = this.f110256a;
        if (!zM81303a) {
            birthdayVerifyAct.lambda$debugItems$19();
        } else {
            birthdayVerifyAct.progress(R$string.f17842J5);
            CoreModule.f17545c.f19639e0.m169547u9(userSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.f03
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93955a.m133747j0((roj0) obj);
                }
            }, new e30() { // from class: l.g03
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100020a.m133749l0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
