package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.core.util.view.RoundTextView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class r1a0 extends f6l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f160785f;

    /* JADX INFO: renamed from: g */
    public RoundFrameLayout f160786g;

    /* JADX INFO: renamed from: h */
    public RoundTextView f160787h;

    /* JADX INFO: renamed from: i */
    public String f160788i = "";

    /* JADX INFO: renamed from: l.r1a0$a */
    public class C19724a implements y20 {
        public C19724a() {
        }

        @Override // p153l.y20
        public void call(Object obj) {
            bnl0.m105524M(r1a0.this.f160785f, true);
            if (r1a0.this.m116953n()) {
                sfj0.m185601h("e_clone_profile_info_ads", "p_suggest_users_home_view", new sfj0.C20032a[0]);
            }
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (!m179388E(user)) {
            bnl0.m105524M(this.f160785f, false);
            return;
        }
        if (TextUtils.equals(this.f160788i, user.f56859id)) {
            return;
        }
        bnl0.m105524M(this.f160785f, false);
        o2n o2nVarM165740j = u2n.m194285l().m194294j(10).m165740j("profileUserId", user.f56859id);
        if (o2nVarM165740j instanceof xn90) {
            xn90 xn90Var = (xn90) o2nVarM165740j;
            xn90Var.m212132u(new C19724a());
            xn90Var.mo125406h(m124283w(), this.f160786g);
        }
        this.f160788i = user.f56859id;
    }

    /* JADX INFO: renamed from: D */
    public final void m179387D(View view) {
        s1a0.m184020a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public boolean m179388E(User user) {
        return d79.m114682i() && NullChecker.m82486a(u2n.m194285l().m194294j(2)) && !CoreModule.m30930K().me_().isFemale() && !CoreModule.m30930K().me_().isVIP() && NullChecker.m82486a(user) && user.isFemale() && tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.m30930K().me_().createdTime, d79.m114684j()) && !m124284x(user);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m179387D(view);
        this.f160787h.setRadius(6.0f);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: q */
    public void mo39157q(boolean z) {
        super.mo39157q(z);
        if (z && bnl0.m105529O0(this.f160785f)) {
            sfj0.m185601h("e_clone_profile_info_ads", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
    }
}
