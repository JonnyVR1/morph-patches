package p002l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.j2e0;
import l.osi0;
import l.s7m;
import l.zma0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yma0 implements s7m<xma0> {

    /* JADX INFO: renamed from: a */
    public TextView f22974a;

    /* JADX INFO: renamed from: b */
    public TextView f22975b;

    /* JADX INFO: renamed from: c */
    public ProfileLoopActionLayout f22976c;

    /* JADX INFO: renamed from: d */
    public Act f22977d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopVerificationFrag f22978e;

    public yma0(Act act, ProfileLoopVerificationFrag profileLoopVerificationFrag) {
        this.f22977d = act;
        this.f22978e = profileLoopVerificationFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m26803r() {
        this.f22976c.m3528m();
        this.f22976c.m3527l(this.f22978e);
        this.f22976c.m3526k();
        this.f22976c.f1986c.setText("立即认证，获得特权");
        if (this.f22978e.act() instanceof ProfileInfoLoopEditAct) {
            this.f22978e.act().m1991a2().m2030W0(this.f22978e);
            this.f22978e.act().m1991a2().m2031X0(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m26804C0() {
        return this.f22977d;
    }

    /* JADX INFO: renamed from: a */
    public View m26805a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zma0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public boolean m26807c() {
        zvf0.r("e_go_verify", "p_avatar_verify");
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
            return true;
        }
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
            return true;
        }
        j2e0.m(this.f22977d, Uri.parse("tantan://verification/avatar"));
        return false;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM26805a = m26805a(layoutInflater, viewGroup);
        m26803r();
        return viewM26805a;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m26808i1(xma0 xma0Var) {
    }
}
