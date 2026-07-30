package p153l;

import android.os.Bundle;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordChangeAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class eh60 extends ar2<nh60> {

    /* JADX INFO: renamed from: a */
    public VerifyData f94004a;

    /* JADX INFO: renamed from: b */
    public ForgetPasswordData f94005b;

    /* JADX INFO: renamed from: c */
    public boolean f94006c;

    public eh60(PasswordChangeAct passwordChangeAct) {
        super(passwordChangeAct);
        this.f94004a = new VerifyData();
        this.f94005b = new ForgetPasswordData();
        this.f94006c = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m120842l0() {
        PhoneNumber phoneNumber = CoreModule.m30930K().me_().settings.phoneNumber;
        String str = phoneNumber.number;
        int i = phoneNumber.countryCode;
        ForgetPasswordData forgetPasswordData = this.f94005b;
        forgetPasswordData.countryCode = i;
        forgetPasswordData.mobileNumber = str;
        this.f94004a.language = q8g0.m175820y();
        VerifyData verifyData = this.f94004a;
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.action = VerifyReason.get(VerifyReason.forgot_password);
        this.f94004a.codeLength = 4;
        ((nh60) this.viewModel).m163058F(Marker.ANY_NON_NULL_MARKER + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m120843q0(Bundle bundle) {
        ((nh60) this.viewModel).m163066r();
        m120842l0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.zg60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204275a.m120843q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m120844j0() {
        act().progress(R$string.f28619R0);
        this.f94005b.code = ((nh60) this.viewModel).m163064p();
        this.f94005b.new_ = ((nh60) this.viewModel).m163067s();
        CoreModule.f18264c.f20369a0.m188264p3(this.f94005b).subscribe(psd0.m173597H(new y20() { // from class: l.ah60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71325a.m120846m0((uxj0) obj);
            }
        }, new y20() { // from class: l.bh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76734a.m120847n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m120845k0() {
        this.f94006c = true;
        ((nh60) this.viewModel).m163059G();
        act().progress(R$string.f28619R0);
        CoreModule.m30929H().send(this.f94004a).subscribe(psd0.m173600K(new y20() { // from class: l.ch60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81767a.m120848o0((uxj0) obj);
            }
        }, new y20() { // from class: l.dh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88422a.m120849p0((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m120846m0(uxj0 uxj0Var) {
        ((nh60) this.viewModel).m163061l();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m120847n0(Throwable th) {
        ((nh60) this.viewModel).m163063n(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m120848o0(uxj0 uxj0Var) {
        ((nh60) this.viewModel).m163057E();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m120849p0(Throwable th) {
        ((nh60) this.viewModel).m163065q(th);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
