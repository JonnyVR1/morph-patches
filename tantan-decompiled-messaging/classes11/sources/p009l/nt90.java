package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.p1.mobile.putong.core.util.view.RoundTextView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.o6j0;
import l.ot90;
import l.qqi0;
import l.tf90;
import l.u59;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nt90 extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f17725f;

    /* JADX INFO: renamed from: g */
    public RoundFrameLayout f17726g;

    /* JADX INFO: renamed from: h */
    public RoundTextView f17727h;

    /* JADX INFO: renamed from: i */
    public String f17728i = "";

    /* JADX INFO: renamed from: l.nt90$a */
    public class C1059a implements e30 {
        public C1059a() {
        }

        public void call(Object obj) {
            xdl0.M(nt90.this.f17725f, true);
            if (nt90.this.m24922n()) {
                o6j0.h("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.a[0]);
            }
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!m19512E(user)) {
            xdl0.M(this.f17725f, false);
            return;
        }
        if (TextUtils.equals(this.f17728i, ((DbObject) user).id)) {
            return;
        }
        xdl0.M(this.f17725f, false);
        tf90 tf90VarJ = u0n.m22726l().m22735j(10).j("profileUserId", ((DbObject) user).id);
        if (tf90VarJ instanceof tf90) {
            tf90 tf90Var = tf90VarJ;
            tf90Var.u(new C1059a());
            tf90Var.h(m20098w(), this.f17726g);
        }
        this.f17728i = ((DbObject) user).id;
    }

    /* JADX INFO: renamed from: D */
    public final void m19511D(View view) {
        ot90.a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public boolean m19512E(User user) {
        return u59.i() && NullChecker.a(u0n.m22726l().m22735j(2)) && !CoreModule.K().me_().isFemale() && !CoreModule.K().me_().isVIP() && NullChecker.a(user) && user.isFemale() && qqi0.h(mqi0.m18550o(), (long) CoreModule.K().me_().createdTime, u59.j()) && !m20099x(user);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m19511D(view);
        this.f17727h.setRadius(6.0f);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: q */
    public void mo2128q(boolean z) {
        super.mo2128q(z);
        if (z && xdl0.O0(this.f17725f)) {
            o6j0.h("e_clone_profile_info_ads", "p_suggest_users_home_view", new o6j0.a[0]);
        }
    }
}
