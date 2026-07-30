package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.C8885a;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p6a0 implements iam<g6a0> {

    /* JADX INFO: renamed from: a */
    public VFrame f150754a;

    /* JADX INFO: renamed from: b */
    public VFrame f150755b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f150756c;

    /* JADX INFO: renamed from: d */
    public ProfileCustomBar f150757d;

    /* JADX INFO: renamed from: e */
    public UserProfileExpandedCard f150758e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f150759f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f150760g;

    /* JADX INFO: renamed from: i */
    public final ProfileListFragExpandedImpl f150762i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8886b f150763j;

    /* JADX INFO: renamed from: k */
    public g6a0 f150764k;

    /* JADX INFO: renamed from: m */
    public zq90 f150766m;

    /* JADX INFO: renamed from: n */
    public lza0 f150767n;

    /* JADX INFO: renamed from: o */
    public qmj0 f150768o;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC8886b> f150761h = new ArrayList();

    /* JADX INFO: renamed from: l */
    public lp90 f150765l = null;

    /* JADX INFO: renamed from: l.p6a0$a */
    public class C19304a implements atl {
        public C19304a() {
        }

        @Override // p153l.atl
        /* JADX INFO: renamed from: c0 */
        public void mo38400c0(int i, int i2, int i3, int i4, View view) {
            if (i > 0) {
                p6a0.this.f150757d.m54131f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                p6a0.this.f150757d.m54131f(0.0f);
                return;
            }
            int iM175859d = qa00.m175859d(44.0f);
            p6a0 p6a0Var = p6a0.this;
            if (i3 > iM175859d) {
                p6a0Var.f150757d.m54131f(1.0f);
            } else {
                p6a0Var.f150757d.m54131f(0.0f);
            }
        }
    }

    public p6a0(ProfileListFragExpandedImpl profileListFragExpandedImpl, zq90 zq90Var, lza0 lza0Var, qmj0 qmj0Var) {
        this.f150762i = profileListFragExpandedImpl;
        this.f150766m = zq90Var;
        this.f150767n = lza0Var;
        this.f150768o = qmj0Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m170740e() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m170741f() {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m170744A() {
        this.f150764k.m129202t1().m53890N();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m170745B() {
        ml70.m158856b().m158858d(getAct());
        this.f150762i.startActivity(ProfileAct.m51922q2(getAct(), this.f150766m.f205579d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m170746C() {
        p6d0.m170847d0().f150817j.add(this.f150766m.f205579d);
        p6d0.m170847d0().m170856l0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150762i.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m170747E() {
        z5h0.m218664H(((ogf) this.f150765l).f147239m);
        p6d0.m170847d0().f150817j.add(this.f150766m.f205579d);
        p6d0.m170847d0().m170856l0();
    }

    /* JADX INFO: renamed from: F */
    public final void m170748F() {
        bnl0.m105546b0(this.f150755b, new pcj() { // from class: l.o6a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return p6a0.m170740e();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m170749G(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f150762i.setHasOptionsMenu(true);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: H */
    public void m170750H() {
        this.f150757d.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f150757d;
        zq90 zq90Var = this.f150766m;
        profileCustomBar.m54137l(zq90Var.f205576a, zq90Var.f205577b, zq90Var.m220959L(), getAct() instanceof NewUI1ContainerActivity, true);
    }

    /* JADX INFO: renamed from: I */
    public void m170751I() {
        m170769w();
    }

    /* JADX INFO: renamed from: J */
    public void m170752J() {
        if (this.f150766m.f205576a != null) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
            zq90 zq90Var = this.f150766m;
            userInfo.userState = zq90Var.f205581f;
            userInfo.f20214id = zq90Var.f205579d;
            userInfo.profileContext = zq90Var;
            userInfo.idealInfo = zq90Var.f205585j;
            userInfo.from = zq90Var.f205577b;
            userInfo.liveRoomInfo = zq90Var.f205578c;
            this.f150758e.mo37855T(zq90Var.f205576a, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m170753K() {
        if (m170756N()) {
            this.f150757d.m54140o();
            this.f150757d.m54139n();
            lza0 lza0Var = this.f150767n;
            boolean z = this.f150766m.f205580e.f205596f;
            TextView textView = new TextView(getContext());
            VText vText = this.f150757d.f35005k;
            Act act = getAct();
            zq90 zq90Var = this.f150766m;
            lza0Var.m156414f(z, textView, vText, act, zq90Var.f205579d, zq90Var.f205577b, false, null);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m170754L(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            bnl0.m105525M0(this.f150759f, false);
            bpe0.m105814f().m105816c(this.f150766m.f205579d, this.f150759f.m56974u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            m170763p(ProfileButton.ProfileButtonType.SuperLike).m53575a().callOnClick();
            return;
        }
        ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f150766m.f205579d, z5h0.m218675j().f203055m);
        bnl0.m105525M0(this.f150759f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f150759f;
        if (NullChecker.m82486a(this.f150766m.f205576a)) {
            zIsFemale = this.f150766m.f205576a.isFemale();
        } else if (NullChecker.m82486a(this.f150764k.m129206v2()) && !this.f150764k.m129206v2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.m56971r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: M */
    public void m170755M() {
        this.f150756c.setVisibility(4);
        this.f150758e.setVisibility(0);
    }

    /* JADX INFO: renamed from: N */
    public boolean m170756N() {
        if (!this.f150766m.f205580e.f205599i && (!CoreModule.m30934Q().mo68438a().mo134409a() || !this.f150766m.f205580e.f205600j)) {
            if (CoreModule.m30932N().mo61490Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f150766m.f205577b) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f150766m.f205577b) && !"photo_album_feed_from_like".equals(this.f150766m.f205577b) && !"from_recommend_like".equals(this.f150766m.f205577b) && !"photo_album_feed_from_emotion".equals(this.f150766m.f205577b) && !"from_portrait_like_list".equals(this.f150766m.f205577b) && !"form_my_pet".equals(this.f150766m.f205577b) && !"chat_group".equals(this.f150766m.f205577b) && !"chat_group_anonymity".equals(this.f150766m.f205577b) && !"group_notification".equals(this.f150766m.f205577b) && !"group_notification_anonymity".equals(this.f150766m.f205577b) && !"moment_visitor".equals(this.f150766m.f205577b) && !"from_mew_tags".equals(this.f150766m.f205577b) && !"from_literature_third".equals(this.f150766m.f205577b) && !"photo_album_feed_from_discover_discussion".equals(this.f150766m.f205577b) && !"photo_album_feed_from_activity".equals(this.f150766m.f205577b) && !"photo_album_feed_viewers".equals(this.f150766m.f205577b) && !"photo_album_feed_from_discover_dating".equals(this.f150766m.f205577b) && !"photo_album_feed_from_activity_tab_one".equals(this.f150766m.f205577b) && !"photo_album_feed_from_activity_tab_two".equals(this.f150766m.f205577b) && !"photo_album_feed_from_search_result".equals(this.f150766m.f205577b) && !"photo_album_feed_from_poi_aggregation".equals(this.f150766m.f205577b)) {
                return false;
            }
        }
        return !this.f150766m.m220958K();
    }

    /* JADX INFO: renamed from: O */
    public void m170757O() {
        this.f150758e.setVisibility(4);
        this.f150756c.setVisibility(0);
    }

    /* JADX INFO: renamed from: P */
    public LayoutDesc.ComboType m170758P(int i) {
        if (NullChecker.m82486a(this.f150763j)) {
            return this.f150763j.mo53579b(i);
        }
        return null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM170759k = m170759k(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM170759k;
    }

    /* JADX INFO: renamed from: k */
    public View m170759k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q6a0.m175544b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(g6a0 g6a0Var) {
        this.f150764k = g6a0Var;
    }

    /* JADX INFO: renamed from: m */
    public int m170761m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC8886b m170762n(zq90 zq90Var) {
        for (InterfaceC8886b interfaceC8886b : this.f150761h) {
            if (interfaceC8886b.mo53578a(zq90Var)) {
                this.f150763j = interfaceC8886b;
                tu2.m192703a("[core][profile]", "init Button Strategy : ".concat(interfaceC8886b.getClass().getSimpleName()));
                return this.f150763j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final ProfileButton m170763p(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f150765l.mo112044e(profileButtonType);
    }

    /* JADX INFO: renamed from: q */
    public final void m170764q() {
        if (TextUtils.equals(this.f150766m.f205577b, "from_auto_scroll_to_question")) {
            l51.m152889I(this.f150762i, new Runnable() { // from class: l.h6a0
                @Override // java.lang.Runnable
                public final void run() {
                    p6a0.m170741f();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m170765r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f150766m.m220958K()) {
            getAct().setTitle(this.f150762i.m21603x4(R$string.f19867zi));
        }
        this.f150758e.setTwoFingerHelper(this.f150768o);
        m170768v();
        m170767u();
        m170748F();
        m170770x();
        m170769w();
        m170764q();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f150766m.m220959L() && this.f150766m.f205580e.f205601k == null) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m170766s() {
        this.f150761h.add(new v7l(this.f150766m));
        this.f150761h.add(new gfm0(this.f150766m));
        this.f150761h.add(new im5(this.f150766m));
    }

    /* JADX INFO: renamed from: u */
    public final void m170767u() {
        m170766s();
        this.f150763j = m170762n(this.f150766m);
        lp90 lp90VarM53577a = new C8885a(getContext()).m53577a(this.f150763j);
        this.f150765l = lp90VarM53577a;
        tu2.m192703a("[core][profile]", "generate button layout : ".concat(lp90VarM53577a.getClass().getSimpleName()));
        this.f150760g.addView(this.f150765l.m155169k(), new FrameLayout.LayoutParams(-1, qa00.m175859d(164.0f)));
        this.f150763j.mo53581d(this.f150765l);
        this.f150764k.f102408b.onNext(uxj0.f181467a);
        lp90 lp90Var = this.f150765l;
        if (lp90Var instanceof tu40) {
            ((tu40) lp90Var).m192733r(this.f150766m);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m170768v() {
        Act act = getAct();
        Objects.requireNonNull(act);
        if (NullChecker.m82486a(act.getSupportActionBar())) {
            getAct().getSupportActionBar().mo102186m();
        }
        CoreBusinessModule.m30906m0().mo122548h(this.f150757d);
        if (gra.m131601M3()) {
            this.f150757d.f35006l.setImageDrawable(getAct().drawable(dbc0.f86655V6));
            this.f150757d.f34998d.setImageResource(dbc0.f86072D);
        }
        this.f150757d.setBackCallBack(new x20() { // from class: l.k6a0
            @Override // p153l.x20
            public final void call() {
                this.f124164a.m170771y();
            }
        });
        if (this.f150766m.m220958K()) {
            this.f150757d.setEditCallBack(new x20() { // from class: l.n6a0
                @Override // p153l.x20
                public final void call() {
                    this.f140438a.m170745B();
                }
            });
        } else {
            boolean zM154375a = lik0.m154375a();
            ProfileCustomBar profileCustomBar = this.f150757d;
            if (zM154375a) {
                profileCustomBar.setMoreCallBack(new x20() { // from class: l.m6a0
                    @Override // p153l.x20
                    public final void call() {
                        this.f134981a.m170744A();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new x20() { // from class: l.l6a0
                    @Override // p153l.x20
                    public final void call() {
                        this.f130243a.m170772z();
                    }
                });
            }
        }
        bnl0.m105524M(this.f150757d.f35008n, false);
        this.f150757d.m54132g(1.0f);
        this.f150757d.m54131f(0.0f);
        this.f150758e.m39018X(new C19304a());
        if (NullChecker.m82486a(this.f150757d) && (this.f150766m.m220987o() || TextUtils.equals("share_profile", this.f150766m.f205577b))) {
            ((VImage) this.f150757d.findViewById(adc0.f70153U8)).setImageResource(dbc0.f86706Wp);
        }
        m170753K();
    }

    /* JADX INFO: renamed from: w */
    public final void m170769w() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
        zq90 zq90Var = this.f150766m;
        userInfo.f20214id = zq90Var.f205579d;
        userInfo.userState = zq90Var.f205581f;
        userInfo.profileContext = zq90Var;
        userInfo.idealInfo = zq90Var.f205585j;
        userInfo.from = zq90Var.f205577b;
        userInfo.liveRoomInfo = zq90Var.f205578c;
        this.f150758e.setContentPadding(qa00.m175859d(110.0f));
        UserProfileExpandedCard userProfileExpandedCard = this.f150758e;
        int i = qa00.f156323j;
        userProfileExpandedCard.m39023b1(i, qa00.f156321h, i, qa00.m175859d(110.0f));
        User user = this.f150766m.f205576a;
        if (user != null) {
            this.f150758e.mo37855T(user, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m170770x() {
        if (spl0.m187375a0()) {
            if ((this.f150766m.m220987o() || this.f150766m.m220953F()) && !CoreModule.f18264c.f20381e0.m116549c8() && !CoreModule.f18264c.f20381e0.m116593na().isJailed() && a5i0.m96175v0() > 0 && !p6d0.m170847d0().f150817j.contains(this.f150766m.f205579d) && p6d0.m170847d0().m170851f0()) {
                lp90 lp90Var = this.f150765l;
                if (lp90Var instanceof tu40) {
                    l51.m152888H(getAct(), new Runnable() { // from class: l.i6a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f113153a.m170746C();
                        }
                    }, 1000L);
                } else if (lp90Var instanceof ogf) {
                    ((ogf) lp90Var).f147241o.setText(String.valueOf(a5i0.m96175v0()));
                    l51.m152888H(getAct(), new Runnable() { // from class: l.j6a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f118536a.m170747E();
                        }
                    }, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m170771y() {
        pza0.m174356h("button");
        this.f150764k.m129210y2();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m170772z() {
        this.f150764k.m129202t1().m53891O();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
