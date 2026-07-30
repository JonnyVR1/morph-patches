package p007l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.VerifyData;
import l.e30;
import l.roj0;
import l.ura;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class da60 extends jq2<ga60> {

    /* JADX INFO: renamed from: a */
    public VerifyData f2516a;

    public da60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m8871l0(Bundle bundle) {
        ((ga60) this.viewModel).m9197r();
        ((ga60) this.viewModel).m9196j().subscribe(mkd0.m9874G(new e30() { // from class: l.z960
            public final void call(Object obj) {
                this.f5501a.m8874k0((CharSequence) obj);
            }
        }));
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.y960
            public final void call(Object obj) {
                this.f5397a.m8871l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m8873j0(VerifyData verifyData) {
        this.f2516a = verifyData;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m8874k0(CharSequence charSequence) {
        ((ga60) this.viewModel).m9195e(charSequence.toString().length() >= CoreModule.H().N9());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m8875m0() {
        ((ga60) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8876n0(roj0 roj0Var) {
        CoreModule.H().il("user.reset_password.signin");
        ((ga60) this.viewModel).act().progressDismiss();
        lsi0.m9819A(it6.m9423b(R.string.e3, R.string.f3), false);
        ((ga60) this.viewModel).act().startActivity(ura.e().d().th(act()));
        ((ga60) this.viewModel).act().lambda$debugItems$19();
        yij0.S(((ga60) this.viewModel).act());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m8877o0(Throwable th) {
        ((ga60) this.viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: p0 */
    public void m8878p0(String str) {
        ((ga60) this.viewModel).act().progress(R.string.R0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f2516a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        CoreModule.H().Em(forgetPasswordData, new Runnable() { // from class: l.aa60
            @Override // java.lang.Runnable
            public final void run() {
                this.f1843a.m8875m0();
            }
        }).subscribe(mkd0.m9875H(new e30() { // from class: l.ba60
            public final void call(Object obj) {
                this.f2294a.m8876n0((roj0) obj);
            }
        }, new e30() { // from class: l.ca60
            public final void call(Object obj) {
                this.f2460a.m8877o0((Throwable) obj);
            }
        }));
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
