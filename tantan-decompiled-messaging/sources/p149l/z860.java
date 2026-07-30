package p149l;

import android.os.Bundle;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordChangeAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public class z860 extends jq2<i960> {

    /* JADX INFO: renamed from: a */
    public VerifyData f202105a;

    /* JADX INFO: renamed from: b */
    public ForgetPasswordData f202106b;

    /* JADX INFO: renamed from: c */
    public boolean f202107c;

    public z860(PasswordChangeAct passwordChangeAct) {
        super(passwordChangeAct);
        this.f202105a = new VerifyData();
        this.f202106b = new ForgetPasswordData();
        this.f202107c = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m217585l0() {
        PhoneNumber phoneNumber = CoreModule.m29932K().me_().settings.phoneNumber;
        String str = phoneNumber.number;
        int i = phoneNumber.countryCode;
        ForgetPasswordData forgetPasswordData = this.f202106b;
        forgetPasswordData.countryCode = i;
        forgetPasswordData.mobileNumber = str;
        this.f202105a.language = i0g0.m133885y();
        VerifyData verifyData = this.f202105a;
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.action = VerifyReason.get(VerifyReason.forgot_password);
        this.f202105a.codeLength = 4;
        ((i960) this.viewModel).m135033F(Marker.ANY_NON_NULL_MARKER + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m217586q0(Bundle bundle) {
        ((i960) this.viewModel).m135041r();
        m217585l0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.u860
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175100a.m217586q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m217587j0() {
        act().progress(R$string.f27771R0);
        this.f202106b.code = ((i960) this.viewModel).m135039p();
        this.f202106b.new_ = ((i960) this.viewModel).m135042s();
        CoreModule.f17545c.f19627a0.m171568p3(this.f202106b).subscribe(mkd0.m154956H(new e30() { // from class: l.v860
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180452a.m217589m0((roj0) obj);
            }
        }, new e30() { // from class: l.w860
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185163a.m217590n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m217588k0() {
        this.f202107c = true;
        ((i960) this.viewModel).m135034G();
        act().progress(R$string.f27771R0);
        CoreModule.m29931H().send(this.f202105a).subscribe(mkd0.m154959K(new e30() { // from class: l.x860
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191441a.m217591o0((roj0) obj);
            }
        }, new e30() { // from class: l.y860
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196780a.m217592p0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m217589m0(roj0 roj0Var) {
        ((i960) this.viewModel).m135036l();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m217590n0(Throwable th) {
        ((i960) this.viewModel).m135038n(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m217591o0(roj0 roj0Var) {
        ((i960) this.viewModel).m135032E();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m217592p0(Throwable th) {
        ((i960) this.viewModel).m135040q(th);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
