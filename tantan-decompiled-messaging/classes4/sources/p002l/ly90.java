package p002l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.C0147a;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileCustomBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.du2;
import l.e51;
import l.f9k0;
import l.lra0;
import l.mdj0;
import l.my90;
import l.myc0;
import l.ogl0;
import l.oql;
import l.roj0;
import l.rxg0;
import l.s7m;
import l.swh0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v9j;
import l.wge0;
import l.x2c0;
import l.xdl0;
import v.VFrame;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ly90 implements s7m<cy90> {

    /* JADX INFO: renamed from: a */
    public VFrame f15121a;

    /* JADX INFO: renamed from: b */
    public VFrame f15122b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f15123c;

    /* JADX INFO: renamed from: d */
    public ProfileCustomBar f15124d;

    /* JADX INFO: renamed from: e */
    public UserProfileExpandedCard f15125e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f15126f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f15127g;

    /* JADX INFO: renamed from: i */
    public final ProfileListFragExpandedImpl f15129i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0148b f15130j;

    /* JADX INFO: renamed from: k */
    public cy90 f15131k;

    /* JADX INFO: renamed from: m */
    public vi90 f15133m;

    /* JADX INFO: renamed from: n */
    public hra0 f15134n;

    /* JADX INFO: renamed from: o */
    public mdj0 f15135o;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC0148b> f15128h = new ArrayList();

    /* JADX INFO: renamed from: l */
    public hh90 f15132l = null;

    /* JADX INFO: renamed from: l.ly90$a */
    public class C0671a implements oql {
        public C0671a() {
        }

        /* JADX INFO: renamed from: c0 */
        public void m17548c0(int i, int i2, int i3, int i4, View view) {
            if (i > 0) {
                ly90.this.f15124d.m3506f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                ly90.this.f15124d.m3506f(0.0f);
                return;
            }
            int iD = t100.d(44.0f);
            ly90 ly90Var = ly90.this;
            if (i3 > iD) {
                ly90Var.f15124d.m3506f(1.0f);
            } else {
                ly90Var.f15124d.m3506f(0.0f);
            }
        }
    }

    public ly90(ProfileListFragExpandedImpl profileListFragExpandedImpl, vi90 vi90Var, hra0 hra0Var, mdj0 mdj0Var) {
        this.f15129i = profileListFragExpandedImpl;
        this.f15133m = vi90Var;
        this.f15134n = hra0Var;
        this.f15135o = mdj0Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m17513e() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m17514f() {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m17517A() {
        this.f15131k.m11516t1().m3258N();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m17518B() {
        gd70.m13725b().m13727d(act());
        this.f15129i.startActivity(ProfileAct.m1176p2(act(), this.f15133m.f21140d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m17519C() {
        myc0.d0().j.add(this.f15133m.f21140d);
        myc0.d0().l0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17520C0() {
        return this.f15129i.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m17521E() {
        rxg0.H(((iff) this.f15132l).f13205m);
        myc0.d0().j.add(this.f15133m.f21140d);
        myc0.d0().l0();
    }

    /* JADX INFO: renamed from: F */
    public final void m17522F() {
        xdl0.b0(this.f15122b, new v9j() { // from class: l.ky90
            public final Object call() {
                return ly90.m17513e();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m17523G(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f15129i.setHasOptionsMenu(true);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: H */
    public void m17524H() {
        this.f15124d.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f15124d;
        vi90 vi90Var = this.f15133m;
        profileCustomBar.m3512l(vi90Var.f21137a, vi90Var.f21138b, vi90Var.m23964L(), act() instanceof NewUI1ContainerActivity, true);
    }

    /* JADX INFO: renamed from: I */
    public void m17525I() {
        m17544w();
    }

    /* JADX INFO: renamed from: J */
    public void m17526J() {
        if (this.f15133m.f21137a != null) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
            vi90 vi90Var = this.f15133m;
            userInfo.userState = vi90Var.f21142f;
            userInfo.id = vi90Var.f21140d;
            userInfo.profileContext = vi90Var;
            userInfo.idealInfo = vi90Var.f21146j;
            userInfo.from = vi90Var.f21138b;
            userInfo.liveRoomInfo = vi90Var.f21139c;
            this.f15125e.T(vi90Var.f21137a, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m17527K() {
        if (m17530N()) {
            this.f15124d.m3515o();
            this.f15124d.m3514n();
            hra0 hra0Var = this.f15134n;
            boolean z = this.f15133m.f21141e.f21157f;
            TextView textView = new TextView(m17520C0());
            VText vText = this.f15124d.f1979k;
            Act act = act();
            vi90 vi90Var = this.f15133m;
            hra0Var.m14742f(z, textView, vText, act, vi90Var.f21140d, vi90Var.f21138b, false, null);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m17528L(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) act().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.M0(this.f15126f, false);
            wge0.f().c(this.f15133m.f21140d, this.f15126f.u(), false, "p_suggest_user_profile_info_view");
            m17538p(ProfileButton.ProfileButtonType.SuperLike).m2926a().callOnClick();
            return;
        }
        ((ViewGroup) act().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f15133m.f21140d, rxg0.j().m);
        xdl0.M0(this.f15126f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f15126f;
        if (NullChecker.a(this.f15133m.f21137a)) {
            zIsFemale = this.f15133m.f21137a.isFemale();
        } else if (NullChecker.a(this.f15131k.m11520v2()) && !this.f15131k.m11520v2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: M */
    public void m17529M() {
        this.f15123c.setVisibility(4);
        this.f15125e.setVisibility(0);
    }

    /* JADX INFO: renamed from: N */
    public boolean m17530N() {
        if (!this.f15133m.f21141e.f21160i && (!CoreModule.Q().a().a() || !this.f15133m.f21141e.f21161j)) {
            if (CoreModule.N().Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f15133m.f21138b) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f15133m.f21138b) && !"photo_album_feed_from_like".equals(this.f15133m.f21138b) && !"from_recommend_like".equals(this.f15133m.f21138b) && !"photo_album_feed_from_emotion".equals(this.f15133m.f21138b) && !"from_portrait_like_list".equals(this.f15133m.f21138b) && !"form_my_pet".equals(this.f15133m.f21138b) && !"chat_group".equals(this.f15133m.f21138b) && !"chat_group_anonymity".equals(this.f15133m.f21138b) && !"group_notification".equals(this.f15133m.f21138b) && !"group_notification_anonymity".equals(this.f15133m.f21138b) && !"moment_visitor".equals(this.f15133m.f21138b) && !"from_mew_tags".equals(this.f15133m.f21138b) && !"from_literature_third".equals(this.f15133m.f21138b) && !"photo_album_feed_from_discover_discussion".equals(this.f15133m.f21138b) && !"photo_album_feed_from_activity".equals(this.f15133m.f21138b) && !"photo_album_feed_viewers".equals(this.f15133m.f21138b) && !"photo_album_feed_from_discover_dating".equals(this.f15133m.f21138b) && !"photo_album_feed_from_activity_tab_one".equals(this.f15133m.f21138b) && !"photo_album_feed_from_activity_tab_two".equals(this.f15133m.f21138b) && !"photo_album_feed_from_search_result".equals(this.f15133m.f21138b) && !"photo_album_feed_from_poi_aggregation".equals(this.f15133m.f21138b)) {
                return false;
            }
        }
        return !this.f15133m.m23963K();
    }

    /* JADX INFO: renamed from: O */
    public void m17531O() {
        this.f15125e.setVisibility(4);
        this.f15123c.setVisibility(0);
    }

    /* JADX INFO: renamed from: P */
    public LayoutDesc.ComboType m17532P(int i) {
        if (NullChecker.a(this.f15130j)) {
            return this.f15130j.mo2930b(i);
        }
        return null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM17534k = m17534k(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM17534k;
    }

    /* JADX INFO: renamed from: k */
    public View m17534k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return my90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m17533i1(cy90 cy90Var) {
        this.f15131k = cy90Var;
    }

    /* JADX INFO: renamed from: m */
    public int m17536m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC0148b m17537n(vi90 vi90Var) {
        for (InterfaceC0148b interfaceC0148b : this.f15128h) {
            if (interfaceC0148b.mo2929a(vi90Var)) {
                this.f15130j = interfaceC0148b;
                du2.a("[core][profile]", "init Button Strategy : ".concat(interfaceC0148b.getClass().getSimpleName()));
                return this.f15130j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final ProfileButton m17538p(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f15132l.mo12175e(profileButtonType);
    }

    /* JADX INFO: renamed from: q */
    public final void m17539q() {
        if (TextUtils.equals(this.f15133m.f21138b, "from_auto_scroll_to_question")) {
            e51.I(this.f15129i, new Runnable() { // from class: l.dy90
                @Override // java.lang.Runnable
                public final void run() {
                    ly90.m17514f();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m17540r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f15133m.m23963K()) {
            act().setTitle(this.f15129i.x4(R.string.ei));
        }
        this.f15125e.setTwoFingerHelper(this.f15135o);
        m17543v();
        m17542u();
        m17522F();
        m17545x();
        m17544w();
        m17539q();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f15133m.m23964L() && this.f15133m.f21141e.f21162k == null) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m17541s() {
        this.f15128h.add(new f5l(this.f15133m));
        this.f15128h.add(new c6m0(this.f15133m));
        this.f15128h.add(new fl5(this.f15133m));
    }

    /* JADX INFO: renamed from: u */
    public final void m17542u() {
        m17541s();
        this.f15130j = m17537n(this.f15133m);
        hh90 hh90VarM2928a = new C0147a(m17520C0()).m2928a(this.f15130j);
        this.f15132l = hh90VarM2928a;
        du2.a("[core][profile]", "generate button layout : ".concat(hh90VarM2928a.getClass().getSimpleName()));
        this.f15127g.addView(this.f15132l.m14370k(), new FrameLayout.LayoutParams(-1, t100.d(164.0f)));
        this.f15130j.mo2932d(this.f15132l);
        this.f15131k.f8978b.onNext(roj0.a);
        hh90 hh90Var = this.f15132l;
        if (hh90Var instanceof fm40) {
            ((fm40) hh90Var).m13309r(this.f15133m);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m17543v() {
        Act act = act();
        Objects.requireNonNull(act);
        if (NullChecker.a(act.getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        CoreBusinessModule.m0().h(this.f15124d);
        if (upa.M3()) {
            this.f15124d.f1980l.setImageDrawable(act().drawable(x2c0.U6));
            this.f15124d.f1972d.setImageResource(x2c0.C);
        }
        this.f15124d.setBackCallBack(new d30() { // from class: l.gy90
            public final void call() {
                this.f11680a.m17546y();
            }
        });
        if (this.f15133m.m23963K()) {
            this.f15124d.setEditCallBack(new d30() { // from class: l.jy90
                public final void call() {
                    this.f14133a.m17518B();
                }
            });
        } else {
            boolean zA = f9k0.a();
            ProfileCustomBar profileCustomBar = this.f15124d;
            if (zA) {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.iy90
                    public final void call() {
                        this.f13478a.m17517A();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.hy90
                    public final void call() {
                        this.f12360a.m17547z();
                    }
                });
            }
        }
        xdl0.M(this.f15124d.f1982n, false);
        this.f15124d.m3507g(1.0f);
        this.f15124d.m3506f(0.0f);
        this.f15125e.X(new C0671a());
        if (NullChecker.a(this.f15124d) && (this.f15133m.m23992o() || TextUtils.equals("share_profile", this.f15133m.f21138b))) {
            this.f15124d.findViewById(u4c0.S8).setImageResource(x2c0.ip);
        }
        m17527K();
    }

    /* JADX INFO: renamed from: w */
    public final void m17544w() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
        vi90 vi90Var = this.f15133m;
        userInfo.id = vi90Var.f21140d;
        userInfo.userState = vi90Var.f21142f;
        userInfo.profileContext = vi90Var;
        userInfo.idealInfo = vi90Var.f21146j;
        userInfo.from = vi90Var.f21138b;
        userInfo.liveRoomInfo = vi90Var.f21139c;
        this.f15125e.setContentPadding(t100.d(110.0f));
        UserProfileExpandedCard userProfileExpandedCard = this.f15125e;
        int i = t100.j;
        userProfileExpandedCard.b1(i, t100.h, i, t100.d(110.0f));
        User user = this.f15133m.f21137a;
        if (user != null) {
            this.f15125e.T(user, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m17545x() {
        if (ogl0.a0()) {
            if ((this.f15133m.m23992o() || this.f15133m.m23958F()) && !CoreModule.c.e0.c8() && !CoreModule.c.e0.na().isJailed() && swh0.v0() > 0 && !myc0.d0().j.contains(this.f15133m.f21140d) && myc0.d0().f0()) {
                hh90 hh90Var = this.f15132l;
                if (hh90Var instanceof fm40) {
                    e51.H(act(), new Runnable() { // from class: l.ey90
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10047a.m17519C();
                        }
                    }, 1000L);
                } else if (hh90Var instanceof iff) {
                    ((iff) hh90Var).f13207o.setText(String.valueOf(swh0.v0()));
                    e51.H(act(), new Runnable() { // from class: l.fy90
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10683a.m17521E();
                        }
                    }, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m17546y() {
        lra0.h("button");
        this.f15131k.m11524y2();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m17547z() {
        this.f15131k.m11516t1().m3259O();
    }

    public void destroy() {
    }
}
