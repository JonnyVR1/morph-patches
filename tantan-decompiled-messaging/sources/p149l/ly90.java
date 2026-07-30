package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.C8722a;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ly90 implements s7m<cy90> {

    /* JADX INFO: renamed from: a */
    public VFrame f130500a;

    /* JADX INFO: renamed from: b */
    public VFrame f130501b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f130502c;

    /* JADX INFO: renamed from: d */
    public ProfileCustomBar f130503d;

    /* JADX INFO: renamed from: e */
    public UserProfileExpandedCard f130504e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f130505f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f130506g;

    /* JADX INFO: renamed from: i */
    public final ProfileListFragExpandedImpl f130508i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8723b f130509j;

    /* JADX INFO: renamed from: k */
    public cy90 f130510k;

    /* JADX INFO: renamed from: m */
    public vi90 f130512m;

    /* JADX INFO: renamed from: n */
    public hra0 f130513n;

    /* JADX INFO: renamed from: o */
    public mdj0 f130514o;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC8723b> f130507h = new ArrayList();

    /* JADX INFO: renamed from: l */
    public hh90 f130511l = null;

    /* JADX INFO: renamed from: l.ly90$a */
    public class C18351a implements oql {
        public C18351a() {
        }

        @Override // p149l.oql
        /* JADX INFO: renamed from: c0 */
        public void mo37397c0(int i, int i2, int i3, int i4, View view) {
            if (i > 0) {
                ly90.this.f130503d.m52948f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                ly90.this.f130503d.m52948f(0.0f);
                return;
            }
            int iM186890d = t100.m186890d(44.0f);
            ly90 ly90Var = ly90.this;
            if (i3 > iM186890d) {
                ly90Var.f130503d.m52948f(1.0f);
            } else {
                ly90Var.f130503d.m52948f(0.0f);
            }
        }
    }

    public ly90(ProfileListFragExpandedImpl profileListFragExpandedImpl, vi90 vi90Var, hra0 hra0Var, mdj0 mdj0Var) {
        this.f130508i = profileListFragExpandedImpl;
        this.f130512m = vi90Var;
        this.f130513n = hra0Var;
        this.f130514o = mdj0Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m152124e() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m152125f() {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m152128A() {
        this.f130510k.m109239t1().m52707N();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m152129B() {
        gd70.m125540b().m125542d(getAct());
        this.f130508i.startActivity(ProfileAct.m50738p2(getAct(), this.f130512m.f181564d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m152130C() {
        myc0.m157001d0().f136285j.add(this.f130512m.f181564d);
        myc0.m157001d0().m157010l0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f130508i.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m152131E() {
        rxg0.m181561H(((iff) this.f130511l).f112999m);
        myc0.m157001d0().f136285j.add(this.f130512m.f181564d);
        myc0.m157001d0().m157010l0();
    }

    /* JADX INFO: renamed from: F */
    public final void m152132F() {
        xdl0.m208366b0(this.f130501b, new v9j() { // from class: l.ky90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ly90.m152124e();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m152133G(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f130508i.setHasOptionsMenu(true);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: H */
    public void m152134H() {
        this.f130503d.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f130503d;
        vi90 vi90Var = this.f130512m;
        profileCustomBar.m52954l(vi90Var.f181561a, vi90Var.f181562b, vi90Var.m198511L(), getAct() instanceof NewUI1ContainerActivity, true);
    }

    /* JADX INFO: renamed from: I */
    public void m152135I() {
        m152153w();
    }

    /* JADX INFO: renamed from: J */
    public void m152136J() {
        if (this.f130512m.f181561a != null) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
            vi90 vi90Var = this.f130512m;
            userInfo.userState = vi90Var.f181566f;
            userInfo.f19472id = vi90Var.f181564d;
            userInfo.profileContext = vi90Var;
            userInfo.idealInfo = vi90Var.f181570j;
            userInfo.from = vi90Var.f181562b;
            userInfo.liveRoomInfo = vi90Var.f181563c;
            this.f130504e.mo36852T(vi90Var.f181561a, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m152137K() {
        if (m152140N()) {
            this.f130503d.m52957o();
            this.f130503d.m52956n();
            hra0 hra0Var = this.f130513n;
            boolean z = this.f130512m.f181565e.f181581f;
            TextView textView = new TextView(getContext());
            VText vText = this.f130503d.f34157k;
            Act act = getAct();
            vi90 vi90Var = this.f130512m;
            hra0Var.m132658f(z, textView, vText, act, vi90Var.f181564d, vi90Var.f181562b, false, null);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m152138L(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.m208345M0(this.f130505f, false);
            wge0.m203034f().m203036c(this.f130512m.f181564d, this.f130505f.m55791u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            m152147p(ProfileButton.ProfileButtonType.SuperLike).m52392a().callOnClick();
            return;
        }
        ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f130512m.f181564d, rxg0.m181572j().f161468m);
        xdl0.m208345M0(this.f130505f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f130505f;
        if (NullChecker.m81303a(this.f130512m.f181561a)) {
            zIsFemale = this.f130512m.f181561a.isFemale();
        } else if (NullChecker.m81303a(this.f130510k.m109243v2()) && !this.f130510k.m109243v2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.m55788r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: M */
    public void m152139M() {
        this.f130502c.setVisibility(4);
        this.f130504e.setVisibility(0);
    }

    /* JADX INFO: renamed from: N */
    public boolean m152140N() {
        if (!this.f130512m.f181565e.f181584i && (!CoreModule.m29936Q().mo67255a().mo124834a() || !this.f130512m.f181565e.f181585j)) {
            if (CoreModule.m29934N().mo60306Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f130512m.f181562b) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f130512m.f181562b) && !"photo_album_feed_from_like".equals(this.f130512m.f181562b) && !"from_recommend_like".equals(this.f130512m.f181562b) && !"photo_album_feed_from_emotion".equals(this.f130512m.f181562b) && !"from_portrait_like_list".equals(this.f130512m.f181562b) && !"form_my_pet".equals(this.f130512m.f181562b) && !"chat_group".equals(this.f130512m.f181562b) && !"chat_group_anonymity".equals(this.f130512m.f181562b) && !"group_notification".equals(this.f130512m.f181562b) && !"group_notification_anonymity".equals(this.f130512m.f181562b) && !"moment_visitor".equals(this.f130512m.f181562b) && !"from_mew_tags".equals(this.f130512m.f181562b) && !"from_literature_third".equals(this.f130512m.f181562b) && !"photo_album_feed_from_discover_discussion".equals(this.f130512m.f181562b) && !"photo_album_feed_from_activity".equals(this.f130512m.f181562b) && !"photo_album_feed_viewers".equals(this.f130512m.f181562b) && !"photo_album_feed_from_discover_dating".equals(this.f130512m.f181562b) && !"photo_album_feed_from_activity_tab_one".equals(this.f130512m.f181562b) && !"photo_album_feed_from_activity_tab_two".equals(this.f130512m.f181562b) && !"photo_album_feed_from_search_result".equals(this.f130512m.f181562b) && !"photo_album_feed_from_poi_aggregation".equals(this.f130512m.f181562b)) {
                return false;
            }
        }
        return !this.f130512m.m198510K();
    }

    /* JADX INFO: renamed from: O */
    public void m152141O() {
        this.f130504e.setVisibility(4);
        this.f130502c.setVisibility(0);
    }

    /* JADX INFO: renamed from: P */
    public LayoutDesc.ComboType m152142P(int i) {
        if (NullChecker.m81303a(this.f130509j)) {
            return this.f130509j.mo52396b(i);
        }
        return null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM152143k = m152143k(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM152143k;
    }

    /* JADX INFO: renamed from: k */
    public View m152143k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return my90.m156998b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cy90 cy90Var) {
        this.f130510k = cy90Var;
    }

    /* JADX INFO: renamed from: m */
    public int m152145m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC8723b m152146n(vi90 vi90Var) {
        for (InterfaceC8723b interfaceC8723b : this.f130507h) {
            if (interfaceC8723b.mo52395a(vi90Var)) {
                this.f130509j = interfaceC8723b;
                du2.m113670a("[core][profile]", "init Button Strategy : ".concat(interfaceC8723b.getClass().getSimpleName()));
                return this.f130509j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final ProfileButton m152147p(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f130511l.mo114662e(profileButtonType);
    }

    /* JADX INFO: renamed from: q */
    public final void m152148q() {
        if (TextUtils.equals(this.f130512m.f181562b, "from_auto_scroll_to_question")) {
            e51.m114744I(this.f130508i, new Runnable() { // from class: l.dy90
                @Override // java.lang.Runnable
                public final void run() {
                    ly90.m152125f();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m152149r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f130512m.m198510K()) {
            getAct().setTitle(this.f130508i.m20604x4(R$string.f18488ei));
        }
        this.f130504e.setTwoFingerHelper(this.f130514o);
        m152152v();
        m152151u();
        m152132F();
        m152154x();
        m152153w();
        m152148q();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f130512m.m198511L() && this.f130512m.f181565e.f181586k == null) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m152150s() {
        this.f130507h.add(new f5l(this.f130512m));
        this.f130507h.add(new c6m0(this.f130512m));
        this.f130507h.add(new fl5(this.f130512m));
    }

    /* JADX INFO: renamed from: u */
    public final void m152151u() {
        m152150s();
        this.f130509j = m152146n(this.f130512m);
        hh90 hh90VarM52394a = new C8722a(getContext()).m52394a(this.f130509j);
        this.f130511l = hh90VarM52394a;
        du2.m113670a("[core][profile]", "generate button layout : ".concat(hh90VarM52394a.getClass().getSimpleName()));
        this.f130506g.addView(this.f130511l.m130944k(), new FrameLayout.LayoutParams(-1, t100.m186890d(164.0f)));
        this.f130509j.mo52398d(this.f130511l);
        this.f130510k.f82936b.onNext(roj0.f160388a);
        hh90 hh90Var = this.f130511l;
        if (hh90Var instanceof fm40) {
            ((fm40) hh90Var).m122160r(this.f130512m);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m152152v() {
        Act act = getAct();
        Objects.requireNonNull(act);
        if (NullChecker.m81303a(act.getSupportActionBar())) {
            getAct().getSupportActionBar().mo134126m();
        }
        CoreBusinessModule.m29908m0().mo190521h(this.f130503d);
        if (upa.m194670M3()) {
            this.f130503d.f34158l.setImageDrawable(getAct().drawable(x2c0.f189786U6));
            this.f130503d.f34150d.setImageResource(x2c0.f189217C);
        }
        this.f130503d.setBackCallBack(new d30() { // from class: l.gy90
            @Override // p149l.d30
            public final void call() {
                this.f104978a.m152155y();
            }
        });
        if (this.f130512m.m198510K()) {
            this.f130503d.setEditCallBack(new d30() { // from class: l.jy90
                @Override // p149l.d30
                public final void call() {
                    this.f120291a.m152129B();
                }
            });
        } else {
            boolean zM120088a = f9k0.m120088a();
            ProfileCustomBar profileCustomBar = this.f130503d;
            if (zM120088a) {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.iy90
                    @Override // p149l.d30
                    public final void call() {
                        this.f115437a.m152128A();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.hy90
                    @Override // p149l.d30
                    public final void call() {
                        this.f110040a.m152156z();
                    }
                });
            }
        }
        xdl0.m208344M(this.f130503d.f34160n, false);
        this.f130503d.m52949g(1.0f);
        this.f130503d.m52948f(0.0f);
        this.f130504e.m38015X(new C18351a());
        if (NullChecker.m81303a(this.f130503d) && (this.f130512m.m198539o() || TextUtils.equals("share_profile", this.f130512m.f181562b))) {
            ((VImage) this.f130503d.findViewById(u4c0.f174031S8)).setImageResource(x2c0.f190245ip);
        }
        m152137K();
    }

    /* JADX INFO: renamed from: w */
    public final void m152153w() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE;
        vi90 vi90Var = this.f130512m;
        userInfo.f19472id = vi90Var.f181564d;
        userInfo.userState = vi90Var.f181566f;
        userInfo.profileContext = vi90Var;
        userInfo.idealInfo = vi90Var.f181570j;
        userInfo.from = vi90Var.f181562b;
        userInfo.liveRoomInfo = vi90Var.f181563c;
        this.f130504e.setContentPadding(t100.m186890d(110.0f));
        UserProfileExpandedCard userProfileExpandedCard = this.f130504e;
        int i = t100.f167261j;
        userProfileExpandedCard.m38020b1(i, t100.f167259h, i, t100.m186890d(110.0f));
        User user = this.f130512m.f181561a;
        if (user != null) {
            this.f130504e.mo36852T(user, userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m152154x() {
        if (ogl0.m164248a0()) {
            if ((this.f130512m.m198539o() || this.f130512m.m198505F()) && !CoreModule.f17545c.f19639e0.m169476c8() && !CoreModule.f17545c.f19639e0.m169520na().isJailed() && swh0.m186270v0() > 0 && !myc0.m157001d0().f136285j.contains(this.f130512m.f181564d) && myc0.m157001d0().m157005f0()) {
                hh90 hh90Var = this.f130511l;
                if (hh90Var instanceof fm40) {
                    e51.m114743H(getAct(), new Runnable() { // from class: l.ey90
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f93732a.m152130C();
                        }
                    }, 1000L);
                } else if (hh90Var instanceof iff) {
                    ((iff) hh90Var).f113001o.setText(String.valueOf(swh0.m186270v0()));
                    e51.m114743H(getAct(), new Runnable() { // from class: l.fy90
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f99845a.m152131E();
                        }
                    }, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m152155y() {
        lra0.m151149h("button");
        this.f130510k.m109247y2();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m152156z() {
        this.f130510k.m109239t1().m52708O();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
