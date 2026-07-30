package p149l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class yma0 implements s7m<xma0> {

    /* JADX INFO: renamed from: a */
    public TextView f198970a;

    /* JADX INFO: renamed from: b */
    public TextView f198971b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopActionLayout f198972c;

    /* JADX INFO: renamed from: d */
    public Act f198973d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopVerificationFrag f198974e;

    public yma0(Act act, ProfileLoopVerificationFrag profileLoopVerificationFrag) {
        this.f198973d = act;
        this.f198974e = profileLoopVerificationFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m215340r() {
        this.f198972c.m52970m();
        this.f198972c.m52969l(this.f198974e);
        this.f198972c.m52968k();
        this.f198972c.f34164c.setText("立即认证，获得特权");
        if (this.f198974e.act() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) this.f198974e.act()).m51509a2().m51548W0(this.f198974e);
            ((ProfileInfoLoopEditAct) this.f198974e.act()).m51509a2().m51549X0(true);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f198973d;
    }

    /* JADX INFO: renamed from: a */
    public View m215341a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zma0.m219319b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public boolean m215343c() {
        zvf0.m220396r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
            return true;
        }
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
            return true;
        }
        j2e0.m139446m(this.f198973d, Uri.parse("tantan://verification/avatar"));
        return false;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM215341a = m215341a(layoutInflater, viewGroup);
        m215340r();
        return viewM215341a;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xma0 xma0Var) {
    }
}
