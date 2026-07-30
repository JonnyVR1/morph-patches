package p007l;

import android.os.Bundle;
import com.p003p1.mobile.putong.core.p006ui.account.PasswordChangeAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import l.e30;
import l.i0g0;
import l.qy;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class z860 extends jq2<i960> {

    /* JADX INFO: renamed from: a */
    public VerifyData f5491a;

    /* JADX INFO: renamed from: b */
    public ForgetPasswordData f5492b;

    /* JADX INFO: renamed from: c */
    public boolean f5493c;

    /* JADX WARN: Multi-variable type inference failed */
    public z860(PasswordChangeAct passwordChangeAct) {
        super(passwordChangeAct);
        this.f5491a = new VerifyData();
        this.f5492b = new ForgetPasswordData();
        this.f5493c = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m11980l0() {
        PhoneNumber phoneNumber = CoreModule.K().me_().settings.phoneNumber;
        String str = phoneNumber.number;
        int i = phoneNumber.countryCode;
        ForgetPasswordData forgetPasswordData = this.f5492b;
        forgetPasswordData.countryCode = i;
        forgetPasswordData.mobileNumber = str;
        this.f5491a.language = i0g0.y();
        VerifyData verifyData = this.f5491a;
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.action = VerifyReason.get("forgot-password");
        this.f5491a.codeLength = 4;
        ((i960) this.viewModel).m9374F("+" + i + " " + qy.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m11981q0(Bundle bundle) {
        ((i960) this.viewModel).m9382r();
        m11980l0();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.u860
            public final void call(Object obj) {
                this.f4869a.m11981q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m11982j0() {
        act().progress(R.string.R0);
        this.f5492b.code = ((i960) this.viewModel).m9380p();
        this.f5492b.new_ = ((i960) this.viewModel).m9383s();
        CoreModule.c.a0.p3(this.f5492b).subscribe(mkd0.m9875H(new e30() { // from class: l.v860
            public final void call(Object obj) {
                this.f4960a.m11984m0((roj0) obj);
            }
        }, new e30() { // from class: l.w860
            public final void call(Object obj) {
                this.f5014a.m11985n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m11983k0() {
        this.f5493c = true;
        ((i960) this.viewModel).m9375G();
        act().progress(R.string.R0);
        CoreModule.H().send(this.f5491a).subscribe(mkd0.m9878K(new e30() { // from class: l.x860
            public final void call(Object obj) {
                this.f5089a.m11986o0((roj0) obj);
            }
        }, new e30() { // from class: l.y860
            public final void call(Object obj) {
                this.f5379a.m11987p0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m11984m0(roj0 roj0Var) {
        ((i960) this.viewModel).m9377l();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m11985n0(Throwable th) {
        ((i960) this.viewModel).m9379n(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m11986o0(roj0 roj0Var) {
        ((i960) this.viewModel).m9373E();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11987p0(Throwable th) {
        ((i960) this.viewModel).m9381q(th);
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
