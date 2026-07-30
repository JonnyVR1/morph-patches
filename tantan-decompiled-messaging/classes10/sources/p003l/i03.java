package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.growth.agealert.birthdayverify.BirthdayVerifyAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.mkd0;
import l.roj0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i03 extends jq2<k03> {

    /* JADX INFO: renamed from: a */
    public BirthdayVerifyAct f4978a;

    public i03(BirthdayVerifyAct birthdayVerifyAct) {
        super(birthdayVerifyAct);
        this.f4978a = birthdayVerifyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m7116i0(Bundle bundle) {
        this.f4978a.setSwipeBackEnable(false);
        this.f4978a.setTitle("信息确认", true);
        if (NullChecker.a(this.f4978a.getSupportActionBar())) {
            this.f4978a.getSupportActionBar().w(false);
        }
        ((k03) ((jq2) this).viewModel).m7477e();
    }

    /* JADX INFO: renamed from: a0 */
    public void m7117a0() {
        super.a0();
        creates(new e30() { // from class: l.e03
            public final void call(Object obj) {
                this.f4243a.m7116i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m7118j0(roj0 roj0Var) {
        this.f4978a.finish();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m7119k0() {
        this.f4978a.finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m7120l0(Throwable th) {
        if (NullChecker.a(this.f4978a)) {
            this.f4978a.progressDismiss();
            if (yij0.H(th)) {
                return;
            }
            this.f4978a.dialog().D(R.string.nl).t0(R.string.Q, new Runnable() { // from class: l.h03
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4781a.m7119k0();
                }
            }).k0(R.string.c).z0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m7121m0(User user) {
        User userSubtract = user.subtract(CoreModule.c.e0.p9());
        boolean zA = NullChecker.a(userSubtract);
        BirthdayVerifyAct birthdayVerifyAct = this.f4978a;
        if (!zA) {
            birthdayVerifyAct.finish();
        } else {
            birthdayVerifyAct.progress(R.string.J5);
            CoreModule.c.e0.u9(userSubtract).subscribe(mkd0.H(new e30() { // from class: l.f03
                public final void call(Object obj) {
                    this.f4372a.m7118j0((roj0) obj);
                }
            }, new e30() { // from class: l.g03
                public final void call(Object obj) {
                    this.f4533a.m7120l0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
