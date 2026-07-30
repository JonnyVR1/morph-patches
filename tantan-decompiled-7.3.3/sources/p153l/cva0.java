package p153l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class cva0 implements iam<bva0> {

    /* JADX INFO: renamed from: a */
    public TextView f83958a;

    /* JADX INFO: renamed from: b */
    public TextView f83959b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopActionLayout f83960c;

    /* JADX INFO: renamed from: d */
    public Act f83961d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopVerificationFrag f83962e;

    public cva0(Act act, ProfileLoopVerificationFrag profileLoopVerificationFrag) {
        this.f83961d = act;
        this.f83962e = profileLoopVerificationFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m112782r() {
        this.f83960c.m54153m();
        this.f83960c.m54152l(this.f83962e);
        this.f83960c.m54151k();
        this.f83960c.f35012c.setText("立即认证，获得特权");
        if (this.f83962e.act() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) this.f83962e.act()).m52692b2().m52731W0(this.f83962e);
            ((ProfileInfoLoopEditAct) this.f83962e.act()).m52692b2().m52732X0(true);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83961d;
    }

    /* JADX INFO: renamed from: a */
    public View m112783a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dva0.m118271b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public boolean m112785c() {
        i4g0.m138520r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
            return true;
        }
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
            return true;
        }
        nae0.m162083m(this.f83961d, Uri.parse("tantan://verification/avatar"));
        return false;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM112783a = m112783a(layoutInflater, viewGroup);
        m112782r();
        return viewM112783a;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bva0 bva0Var) {
    }
}
