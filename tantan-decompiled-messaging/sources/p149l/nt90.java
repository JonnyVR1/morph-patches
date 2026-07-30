package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.p046p1.mobile.putong.core.util.view.RoundTextView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class nt90 extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f140446f;

    /* JADX INFO: renamed from: g */
    public RoundFrameLayout f140447g;

    /* JADX INFO: renamed from: h */
    public RoundTextView f140448h;

    /* JADX INFO: renamed from: i */
    public String f140449i = "";

    /* JADX INFO: renamed from: l.nt90$a */
    public class C18770a implements e30 {
        public C18770a() {
        }

        @Override // p149l.e30
        public void call(Object obj) {
            xdl0.m208344M(nt90.this.f140446f, true);
            if (nt90.this.m209784n()) {
                o6j0.m162864h("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.C18854a[0]);
            }
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!m161361E(user)) {
            xdl0.m208344M(this.f140446f, false);
            return;
        }
        if (TextUtils.equals(this.f140449i, user.f56011id)) {
            return;
        }
        xdl0.m208344M(this.f140446f, false);
        o0n o0nVarM162162j = u0n.m191353l().m191362j(10).m162162j("profileUserId", user.f56011id);
        if (o0nVarM162162j instanceof tf90) {
            tf90 tf90Var = (tf90) o0nVarM162162j;
            tf90Var.m188672u(new C18770a());
            tf90Var.mo100438h(m167252w(), this.f140447g);
        }
        this.f140449i = user.f56011id;
    }

    /* JADX INFO: renamed from: D */
    public final void m161360D(View view) {
        ot90.m165929a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public boolean m161361E(User user) {
        return u59.m191832i() && NullChecker.m81303a(u0n.m191353l().m191362j(2)) && !CoreModule.m29932K().me_().isFemale() && !CoreModule.m29932K().me_().isVIP() && NullChecker.m81303a(user) && user.isFemale() && qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.m29932K().me_().createdTime, u59.m191834j()) && !m167253x(user);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m161360D(view);
        this.f140448h.setRadius(6.0f);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: q */
    public void mo38154q(boolean z) {
        super.mo38154q(z);
        if (z && xdl0.m208349O0(this.f140446f)) {
            o6j0.m162864h("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
    }
}
