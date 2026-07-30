package p009l;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.DraweeView;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p000p1.mobile.putong.core.newui.intltribe.IntlTribeSlideFrag;
import com.p000p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p000p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt;
import com.p000p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.RadarRipple;
import com.p1.mobile.putong.core.ui.main.LocationPermissionView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.helpers.ProfileCreateData;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Objects;
import l.abi;
import l.cwf0;
import l.d30;
import l.dbl0;
import l.dd80;
import l.e30;
import l.e51;
import l.ezc0;
import l.f6c0;
import l.fap;
import l.j760;
import l.mah0;
import l.mkd0;
import l.n3b0;
import l.nkp;
import l.o6j0;
import l.ool0;
import l.qib0;
import l.qip;
import l.qol0;
import l.roj0;
import l.rxg0;
import l.s4e;
import l.s7m;
import l.u4c0;
import l.u59;
import l.upa;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xck0;
import l.xdl0;
import l.xij0;
import l.zbc0;
import l.zvf0;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VFrame_Squared;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pip implements s7m<hhp> {

    /* JADX INFO: renamed from: A */
    public Act f18649A;

    /* JADX INFO: renamed from: B */
    public hhp f18650B;

    /* JADX INFO: renamed from: C */
    public wsf0 f18651C;

    /* JADX INFO: renamed from: D */
    public ProfileCardStackIntlTribeSlideOpt f18652D;

    /* JADX INFO: renamed from: E */
    public IntlTribeSlideFrag f18653E;

    /* JADX INFO: renamed from: F */
    public ez30 f18655F;

    /* JADX INFO: renamed from: G */
    public int f18657G;

    /* JADX INFO: renamed from: G0 */
    public ViewOnTouchListenerC1114e f18658G0;

    /* JADX INFO: renamed from: H0 */
    public ViewOnTouchListenerC1114e f18660H0;

    /* JADX INFO: renamed from: J0 */
    public dd80 f18664J0;

    /* JADX INFO: renamed from: L */
    public boolean f18666L;

    /* JADX INFO: renamed from: M */
    public boolean f18667M;

    /* JADX INFO: renamed from: N */
    public boolean f18668N;

    /* JADX INFO: renamed from: O */
    public boolean f18669O;

    /* JADX INFO: renamed from: T */
    public String f18674T;

    /* JADX INFO: renamed from: U */
    public String f18675U;

    /* JADX INFO: renamed from: V */
    public String f18676V;

    /* JADX INFO: renamed from: W */
    public String f18677W;

    /* JADX INFO: renamed from: X */
    public String f18678X;

    /* JADX INFO: renamed from: Y */
    public e30 f18679Y;

    /* JADX INFO: renamed from: Z */
    public chj0 f18680Z;

    /* JADX INFO: renamed from: a */
    public FrameLayout f18681a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f18682b;

    /* JADX INFO: renamed from: c */
    public IntlTribeSlideEmptyCardView f18683c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f18684d;

    /* JADX INFO: renamed from: e */
    public VFrame_Squared f18685e;

    /* JADX INFO: renamed from: f */
    public RadarRipple f18686f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f18687g;

    /* JADX INFO: renamed from: h */
    public VRelative f18688h;

    /* JADX INFO: renamed from: i */
    public VImage f18689i;

    /* JADX INFO: renamed from: j */
    public VImage f18690j;

    /* JADX INFO: renamed from: k */
    public VLinear f18691k;

    /* JADX INFO: renamed from: k0 */
    public osl f18692k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f18693l;

    /* JADX INFO: renamed from: m */
    public VText f18694m;

    /* JADX INFO: renamed from: n */
    public LocationPermissionView f18695n;

    /* JADX INFO: renamed from: o */
    public VFrame f18696o;

    /* JADX INFO: renamed from: p */
    public VFrame f18697p;

    /* JADX INFO: renamed from: p0 */
    public Animator f18698p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f18699q;

    /* JADX INFO: renamed from: r */
    public View f18700r;

    /* JADX INFO: renamed from: s */
    public VText f18701s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f18702t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f18703u;

    /* JADX INFO: renamed from: v */
    public GradientBgButton f18704v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f18705w;

    /* JADX INFO: renamed from: x */
    public GradientBgButton f18706x;

    /* JADX INFO: renamed from: y */
    public GradientBgButton f18707y;

    /* JADX INFO: renamed from: z */
    public SuperLikeComboAnimView f18708z;

    /* JADX INFO: renamed from: H */
    public boolean f18659H = true;

    /* JADX INFO: renamed from: I */
    public boolean f18661I = false;

    /* JADX INFO: renamed from: J */
    public boolean f18663J = false;

    /* JADX INFO: renamed from: K */
    public a<Boolean> f18665K = a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: P */
    public View f18670P = null;

    /* JADX INFO: renamed from: Q */
    public long f18671Q = -1;

    /* JADX INFO: renamed from: R */
    public String f18672R = "empty";

    /* JADX INFO: renamed from: S */
    public String f18673S = "@@";

    /* JADX INFO: renamed from: E0 */
    public Runnable f18654E0 = new RunnableC1111b();

    /* JADX INFO: renamed from: F0 */
    public u0l f18656F0 = new C1112c();

    /* JADX INFO: renamed from: I0 */
    public final Runnable f18662I0 = new Runnable() { // from class: l.php
        @Override // java.lang.Runnable
        public final void run() {
            pip.m20342j();
        }
    };

    /* JADX INFO: renamed from: l.pip$a */
    public class C1110a implements com.p1.mobile.putong.core.ui.a.d {

        /* JADX INFO: renamed from: a */
        public String f18709a;

        public C1110a() {
        }

        /* JADX INFO: renamed from: a */
        public void m20437a() {
            e51.J(pip.this.f18662I0);
        }

        public void release() {
            if (TextUtils.isEmpty(this.f18709a)) {
                return;
            }
            e51.H(pip.this.f18649A, pip.this.f18662I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pip$b */
    public class RunnableC1111b implements Runnable {
        public RunnableC1111b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pip.this.f18683c.m3613o();
            if (NullChecker.a(pip.this.f18698p0)) {
                pip.this.f18698p0.end();
            }
        }
    }

    /* JADX INFO: renamed from: l.pip$c */
    public class C1112c extends u0l {
        public C1112c() {
        }

        @Override // p009l.u0l, java.lang.Runnable
        public void run() {
            xdl0.M0(pip.this.m20405g0(), true);
            xdl0.M0(pip.this.m20399b0(), false);
            pip.this.m20322M1(true);
            pip.this.m20319L1(false);
            pip.this.f18698p0.start();
            View viewFindViewWithTag = pip.this.m20412l0().findViewWithTag(pip.this.m20416n0().getRealView().getTag() + "child");
            if (NullChecker.a(viewFindViewWithTag)) {
                pip.this.m20412l0().removeView(viewFindViewWithTag);
            }
            pip.this.m20329T(false);
            if (IntlCountryCodeController.v()) {
                xdl0.M(pip.this.m20422q0(), false);
                xdl0.M(pip.this.m20428t0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.pip$d */
    public class C1113d implements CardOperationButton.InterfaceC0213b {

        /* JADX INFO: renamed from: a */
        public String f18713a;

        public C1113d() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: a */
        public void mo1370a() {
            e51.J(pip.this.f18662I0);
            this.f18713a = pip.this.m20365C1(-1);
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: b */
        public void mo1371b() {
            if (TextUtils.isEmpty(this.f18713a)) {
                return;
            }
            e51.H(pip.this.f18649A, pip.this.f18662I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pip$e */
    public static class ViewOnTouchListenerC1114e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f18715c = zbc0.a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f18716a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.a f18717b;

        public ViewOnTouchListenerC1114e() {
            VLinear.a aVar = new VLinear.a();
            this.f18717b = aVar;
            aVar.c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f18716a <= f18715c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f18716a + 1;
                    this.f18716a = i;
                    if (i > f18715c) {
                        j760 j760VarB = this.f18717b.b();
                        y.Q = ((Boolean) j760VarB.a).booleanValue();
                        y.R = ((Boolean) j760VarB.b).booleanValue();
                    }
                }
                this.f18717b.a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m13742c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m13742c(false);
            }
            return false;
        }
    }

    public pip(Act act, IntlTribeSlideFrag intlTribeSlideFrag) {
        this.f18649A = act;
        this.f18653E = intlTribeSlideFrag;
    }

    /* JADX INFO: renamed from: A0 */
    private void m20303A0() {
        if (u59.H()) {
            this.f18692k0 = m20355w0(f6c0.c4);
        } else {
            this.f18692k0 = m20355w0(f6c0.Y3);
        }
        if (IntlCountryCodeController.v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f18692k0.getButtonRootLayout();
        buttonRootLayout.setId(u4c0.q5);
        this.f18697p.addView(buttonRootLayout, this.f18692k0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: H1 */
    private void m20310H1() {
        m20312I1(false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m20312I1(boolean z) {
        o6j0.c("e_superlikeButton", this.f18649A.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", (!NullChecker.a(m20414m0().mo2809j()) || m20414m0().mo2809j().isVirtualCard()) ? "0" : m20414m0().mo2809j().id), o6j0.a.i("is_privileged", !n3b0.t()), o6j0.a.h("showfrom_superlike", "home")});
        if (m20414m0() != null) {
            m20330V(m20414m0(), "superlike");
        }
        if (m20381Q1()) {
            return;
        }
        this.f18650B.m15795F2(true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m20315K0(View view) {
        m20310H1();
    }

    /* JADX INFO: renamed from: K1 */
    private void m20316K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : "left";
        }
        long jM18550o = this.f18671Q > 0 ? mqi0.m18550o() - this.f18671Q : -1L;
        this.f18671Q = mqi0.m18550o();
        o6j0.c("e_card_click_interval", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("current_operation", str2), o6j0.a.g("operation_interval", jM18550o), o6j0.a.h("last_operation", this.f18672R)});
        this.f18672R = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m20318L0(View view) {
        m20310H1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m20319L1(boolean z) {
        HomeStatisticsHelper.m638C(this.f18653E.getUserVisibleHint() && !this.f18653E.isHidden());
        if (z) {
            HomeStatisticsHelper.m664u();
        } else {
            HomeStatisticsHelper.m663t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m20321M0(View view) {
        m20378O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m20322M1(boolean z) {
        HomeStatisticsHelper.m638C(this.f18653E.getUserVisibleHint() && !this.f18653E.isHidden());
        if (z) {
            HomeStatisticsHelper.m666w();
        } else {
            HomeStatisticsHelper.m665v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m20326P1() {
        if (((Boolean) this.f18665K.e()).booleanValue()) {
            m20404f0().getRealView().setOnTouchListener(null);
            m20400c0().getRealView().setOnTouchListener(null);
            m20404f0().getRealView().setClickable(false);
            m20400c0().getRealView().setClickable(false);
            m20424r0().getRealView().setClickable(false);
            m20416n0().getRealView().setClickable(false);
            return;
        }
        m20404f0().getRealView().setOnTouchListener(this.f18658G0);
        m20400c0().getRealView().setOnTouchListener(this.f18660H0);
        m20404f0().getRealView().setClickable(true);
        m20400c0().getRealView().setClickable(true);
        m20424r0().getRealView().setClickable(true);
        m20416n0().getRealView().setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m20328R0() {
        if (!CoreModule.K().q7()) {
            CoreModule.K().Ug(this.f18649A, "p_intl_tribe_empty_state_view,e_intl_tribe_empty_state_location_click,click");
            return;
        }
        CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
        Act act = this.f18649A;
        m20369F1(coreBusinessServiceA.aj(act, act.pageId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m20329T(boolean z) {
        View immediatelyMatch = this.f18692k0.getImmediatelyMatch();
        if (z) {
            m20404f0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m20418o0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m20424r0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m20400c0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (u59.F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            rxg0.j().b.onNext(roj0.a);
            return;
        }
        m20404f0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m20418o0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m20424r0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m20400c0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        if (!u59.F() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
    }

    /* JADX INFO: renamed from: V */
    private void m20330V(wsf0 wsf0Var, String str) {
        m20316K1(str);
        wsf0Var.m19514h(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20335e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m20336e1(wsf0 wsf0Var, View view) {
        m20375J1(wsf0Var.mo2805d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m20338f1(wsf0 wsf0Var, View view) {
        o6j0.c("e_intl_tribe_card_like_click", this.f18649A.pageId(), new o6j0.a[]{o6j0.a.h("receiver_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), o6j0.a.h("intl_tribe_source_name", this.f18675U), o6j0.a.h("intl_get_see_source", "tribe")});
        m20330V(wsf0Var, "like");
        wsf0Var.mo2797A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m20339g1(wsf0 wsf0Var, View view) {
        if (NullChecker.a(m20414m0().mo2805d()) && NullChecker.a(m20414m0().mo2814o())) {
            NullChecker.a(m20414m0().mo2809j());
        }
        wsf0Var.mo2797A(SwipeDirection.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m20340h1(wsf0 wsf0Var, View view) {
        o6j0.c("e_intl_tribe_card_dislike_click", this.f18649A.pageId(), new o6j0.a[]{o6j0.a.h("receiver_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), o6j0.a.h("intl_tribe_source_name", this.f18675U), o6j0.a.h("intl_get_see_source", "tribe")});
        m20330V(wsf0Var, "dislike");
        m20414m0().mo2797A(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m20342j() {
        d.l().k("bubble_superlike_bubble");
        rxg0.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m20343j1(View view) {
        m20378O1();
    }

    /* JADX INFO: renamed from: t1 */
    private void m20351t1(boolean z) {
        if (z) {
            act().removeCallbacks(this.f18654E0);
            this.f18683c.setVisibility(8);
            this.f18683c.m3606h();
        } else {
            act().removeCallbacks(this.f18654E0);
            if (this.f18650B.m15791D1()) {
                this.f18650B.m15822m2();
            } else {
                act().postDelayed(this.f18654E0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m20354w(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    private osl m20355w0(int i) {
        osl oslVar = (osl) LayoutInflater.from(act()).inflate(i, (ViewGroup) this.f18697p, false);
        if (oslVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) oslVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return oslVar;
    }

    /* JADX INFO: renamed from: x0 */
    private void m20357x0() {
        xdl0.E0(this.f18692k0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.whp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22129a.m20377O0(view);
            }
        });
        this.f18692k0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
        this.f18692k0.getDislikeBtn().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
        this.f18692k0.getDislikeBtn().setPressedStateLayerBackground(this.f18649A.drawable(this.f18692k0.getDislikePressBg()));
        this.f18692k0.getLikeBtn().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
        this.f18692k0.getLikeBtn().setPressedStateLayerBackground(this.f18649A.drawable(this.f18692k0.getLikePressBg()));
    }

    /* JADX INFO: renamed from: y0 */
    private void m20359y0() {
        xdl0.M(this.f18703u, true);
        xdl0.E0(this.f18703u, new View.OnClickListener() { // from class: l.vhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21588a.m20380Q0(view);
            }
        });
        if (u59.I()) {
            xdl0.M(this.f18707y, true);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m20361A1() {
        if (m20414m0() != null && (m20414m0().mo2805d() instanceof d5m)) {
            d5m d5mVar = (d5m) m20414m0().mo2805d();
            if (!d5mVar.mo914y() || d5mVar.mo847f() || d5mVar.mo793N()) {
                return false;
            }
            return ((NullChecker.a(d5mVar.getCardData().m17130d()) && mah0.y0(((DbObject) d5mVar.getCardData().m17130d()).id)) || mah0.s0().z0()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m20362B0(boolean z, boolean z2) {
        this.f18665K.onNext(Boolean.valueOf(z));
        this.f18650B.f14119s = z2;
        View immediatelyMatch = this.f18692k0.getImmediatelyMatch();
        if (z) {
            m20404f0().getRealView().setScaleX(0.0f);
            m20404f0().getRealView().setScaleY(0.0f);
            m20400c0().getRealView().setScaleX(0.0f);
            m20400c0().getRealView().setScaleY(0.0f);
            m20418o0().setScaleX(0.0f);
            m20418o0().setScaleY(0.0f);
            m20424r0().getRealView().setScaleX(0.0f);
            m20424r0().getRealView().setScaleY(0.0f);
            if (u59.F() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(0.0f);
                immediatelyMatch.setScaleY(0.0f);
            }
        } else {
            m20404f0().getRealView().setScaleX(1.0f);
            m20404f0().getRealView().setScaleY(1.0f);
            m20400c0().getRealView().setScaleX(1.0f);
            m20400c0().getRealView().setScaleY(1.0f);
            m20418o0().setScaleX(1.0f);
            m20418o0().setScaleY(1.0f);
            m20424r0().getRealView().setScaleX(1.0f);
            m20424r0().getRealView().setScaleY(1.0f);
            if (u59.F() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(1.0f);
                immediatelyMatch.setScaleY(1.0f);
            }
        }
        m20326P1();
        m20407i0().setRadarColor(this.f18657G);
        this.f18698p0 = xij0.b0(m20407i0(), m20406h0());
        xdl0.M0(m20405g0(), z);
        xdl0.M0(m20399b0(), !z);
        m20322M1(z);
        m20319L1(!z);
        if (IntlCountryCodeController.v()) {
            xdl0.M(m20422q0(), !z);
            xdl0.M(m20428t0(), !z);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m20363B1() {
        if (IntlCountryCodeController.v()) {
            m20422q0().setVisibility(0);
        } else {
            m20395Z().setVisibility(0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20364C0() {
        return this.f18649A;
    }

    /* JADX INFO: renamed from: C1 */
    public String m20365C1(int i) {
        GradientBgButton gradientBgButtonM20418o0 = IntlCountryCodeController.v() ? this.f18704v : m20418o0();
        if (IntlCountryCodeController.v()) {
            if (NullChecker.a(gradientBgButtonM20418o0) && NullChecker.a(m20418o0()) && xdl0.O0(gradientBgButtonM20418o0) && m20418o0().getScaleY() == 1.0f && !m20420p0().c()) {
                return rxg0.j().K(this.f18653E, IntlCountryCodeController.v() ? this.f18704v : m20418o0(), i);
            }
            return null;
        }
        if (CoreModule.c.o3() == null || !m20372H0() || CoreModule.c.o3().superLikeLimit.remainToday() == 0) {
            return null;
        }
        boolean zC = m20420p0().c();
        osl oslVar = this.f18692k0;
        if (zC) {
            oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.c.o3().superLikeLimit.remainToday()));
            return "bubble_superlike_bubble";
        }
        oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.c.o3().superLikeLimit.remainToday()));
        rxg0.G(this.f18649A, m20420p0(), this.f18692k0.getSuperLikeRemaining());
        return "bubble_superlike_bubble";
    }

    /* JADX INFO: renamed from: D0 */
    public void m20366D0(Bundle bundle) {
        this.f18674T = bundle.getString("groupCategory");
        this.f18675U = bundle.getString("subType");
        this.f18676V = bundle.getString("title");
        this.f18677W = bundle.getString("icon");
        this.f18678X = bundle.getString("bigCoverUrl");
        m20367E0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m20367E0() {
        this.f18694m.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.Z(new View[]{this.f18688h});
        xdl0.Z(new View[]{this.f18693l});
        xdl0.E0(this.f18689i, new View.OnClickListener() { // from class: l.ihp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14642a.m20385T0(view);
            }
        });
        xdl0.M(this.f18690j, TextUtils.equals(this.f18675U, "night-free"));
        xdl0.E0(this.f18690j, new View.OnClickListener() { // from class: l.mip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16959a.m20398a1(view);
            }
        });
        if (!TextUtils.isEmpty(this.f18678X)) {
            qib0.G.L0(this.f18682b, this.f18678X);
        }
        if (!TextUtils.isEmpty(this.f18677W)) {
            qib0.G.L0(this.f18693l, this.f18677W);
        }
        this.f18694m.setText(this.f18676V);
        final wsf0 wsf0VarM20414m0 = m20414m0();
        m20435z0();
        if (IntlCountryCodeController.v() && NullChecker.a(this.f18700r)) {
            this.f18700r.setOnClickListener(new View.OnClickListener() { // from class: l.nip
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17488a.m20402d1(wsf0VarM20414m0, view);
                }
            });
            this.f18701s.setOnClickListener(new View.OnClickListener() { // from class: l.oip
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18069a.m20336e1(wsf0VarM20414m0, view);
                }
            });
            xdl0.M0(this.f18702t, true);
            xdl0.C0(m20395Z(), 0);
            xdl0.M0(this.f18699q, true);
            chj0 chj0Var = new chj0(act(), wsf0VarM20414m0, this.f18696o);
            this.f18680Z = chj0Var;
            wsf0VarM20414m0.setUsHomeCardAnimHelper(chj0Var);
            xdl0.E0(this.f18705w, new View.OnClickListener() { // from class: l.jhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15172a.m20338f1(wsf0VarM20414m0, view);
                }
            });
            xdl0.E0(this.f18704v, new View.OnClickListener() { // from class: l.khp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15691a.m20339g1(wsf0VarM20414m0, view);
                }
            });
            xdl0.E0(this.f18706x, new View.OnClickListener() { // from class: l.lhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16165a.m20340h1(wsf0VarM20414m0, view);
                }
            });
            xdl0.E0(this.f18707y, new View.OnClickListener() { // from class: l.mhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16925a.m20343j1(view);
                }
            });
            this.f18704v.setLongPressingListener(new C1110a());
        }
        if (!vdj.c() && IntlCountryCodeController.o()) {
            m20391X();
            if (nkp.e()) {
                m20393Y();
            }
        } else {
            m20393Y();
        }
        this.f18657G = act().color(w0c0.I);
        ez30 ez30Var = new ez30(this.f18650B, this);
        this.f18655F = ez30Var;
        wsf0VarM20414m0.setAdapter(ez30Var);
        m20404f0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.nhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17475a.m20411k1(wsf0VarM20414m0, view);
            }
        });
        m20400c0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.ohp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18053a.m20387U0(wsf0VarM20414m0, view);
            }
        });
        View realView = m20404f0().getRealView();
        ViewOnTouchListenerC1114e viewOnTouchListenerC1114e = new ViewOnTouchListenerC1114e();
        this.f18658G0 = viewOnTouchListenerC1114e;
        realView.setOnTouchListener(viewOnTouchListenerC1114e);
        View realView2 = m20400c0().getRealView();
        ViewOnTouchListenerC1114e viewOnTouchListenerC1114e2 = new ViewOnTouchListenerC1114e();
        this.f18660H0 = viewOnTouchListenerC1114e2;
        realView2.setOnTouchListener(viewOnTouchListenerC1114e2);
        this.f18679Y = xck0.a(500, new e30() { // from class: l.thp
            public final void call(Object obj) {
                this.f20702a.m20388V0(wsf0VarM20414m0, (mol) obj);
            }
        });
        wsf0VarM20414m0.mo2808i(new e30() { // from class: l.eip
            public final void call(Object obj) {
                this.f12581a.m20390W0(obj);
            }
        });
        wsf0VarM20414m0.mo2815p(new VSwipeStack.c() { // from class: l.iip
            /* JADX INFO: renamed from: b */
            public final void m16575b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f14651a.m20392X0(wsf0VarM20414m0, z, f, cardProgressAction);
            }
        });
        final hhp hhpVar = this.f18650B;
        Objects.requireNonNull(hhpVar);
        wsf0VarM20414m0.mo2807g(new id50() { // from class: l.jip
            @Override // p009l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo13174a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return hhpVar.m15826o2(molVar, swipeDirection, z);
            }
        });
        xij0.Z(m20406h0(), new d30() { // from class: l.kip
            public final void call() {
                this.f15719a.m20394Y0();
            }
        });
        wsf0VarM20414m0.setAllowUpSwipe(true);
        m20424r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.lip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16180a.m20396Z0(view);
            }
        });
        this.f18695n.d(this.f18653E, 256);
        xdl0.Z(new View[]{this.f18696o});
        if (upa.C2()) {
            if (this.f18692k0.getUndo() != null) {
                this.f18692k0.getUndo().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
            }
            this.f18692k0.getDislikeBtn().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
            this.f18692k0.getLikeBtn().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
            this.f18692k0.getSuperLike().setNormalStateLayerBackground(this.f18649A.drawable(this.f18692k0.getOperationBtnBg()));
        }
        if (u59.H()) {
            m20357x0();
        } else if (u59.I()) {
            m20359y0();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m20368E1(@NonNull Act act) {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_intl_tribe_exit_intercept_pop", s4e.class.getName());
        cwf0VarM16062c.p(new j760[]{vwb.Y("intl_tribe_exit_name", this.f18675U)});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(act.getString(R.string.Ga));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#4D000000")), 0, act.getString(R.string.Ga).length(), 17);
        this.f18664J0 = new dd80.a(act).S(x2c0.Dc).p0(true).d0(x2c0.Q).i0(x2c0.Cc).y0(act.getString(R.string.Ja)).t0(act.getString(R.string.Ia)).c0(act.getString(R.string.Ha), new Runnable() { // from class: l.aip
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.c("e_intl_tribe_exit_wait_click", "p_intl_tribe_exit_intercept_pop", new o6j0.a[0]);
            }
        }).h0(spannableStringBuilder, new Runnable() { // from class: l.bip
            @Override // java.lang.Runnable
            public final void run() {
                this.f10122a.m20415m1();
            }
        }).P(true).M(true).n0(new DialogInterface.OnDismissListener() { // from class: l.cip
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).r0();
        i0e.m16065f(cwf0VarM16062c);
    }

    /* JADX INFO: renamed from: F1 */
    public void m20369F1(Intent intent) {
        this.f18653E.startActivity(intent);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m20370G0() {
        return this.f18669O;
    }

    /* JADX INFO: renamed from: G1 */
    public void m20371G1(String str, int i) {
        if (m20414m0() == null || m20414m0().mo2805d() == null || m20414m0().mo2814o() == null || m20414m0().mo2814o().m17130d() == null) {
            return;
        }
        User userM17130d = m20414m0().mo2814o().m17130d();
        sbp.m22052i(((DbObject) userM17130d).id);
        Intent intentZ2 = ProfileAct.z2(act(), ((DbObject) userM17130d).id, str, true, false, false);
        if (TextUtils.equals(((DbObject) userM17130d).id, (CharSequence) CoreModule.c.f0.J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentZ2.putExtra("profile_create_data", (Serializable) profileCreateData);
        }
        this.f18653E.startActivityForResult(intentZ2, 114);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m20372H0() {
        return this.f18659H;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m20373I0() {
        return this.f18661I;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m20374J0() {
        return ((Boolean) this.f18665K.e()).booleanValue();
    }

    /* JADX INFO: renamed from: J1 */
    public void m20375J1(View view) {
        zvf0.u("e_intl_tribe_card_profile_entranc_click", this.f18649A.pageId(), new j760[]{j760.a("intl_tribe_source_name", this.f18675U)});
        e30 e30Var = this.f18679Y;
        if (e30Var != null) {
            e30Var.call(view);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m20376N0() {
        if (NullChecker.a(m20414m0()) && NullChecker.a(m20414m0().mo2814o()) && NullChecker.a(m20414m0().mo2814o().m17130d())) {
            CoreModule.c.m0.E8(((DbObject) m20414m0().mo2814o().m17130d()).id);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m20377O0(View view) {
        com.p1.mobile.putong.core.ui.match.a.w().p(this.f18649A, m20397a0(this.f18653E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.hip
            public final void call() {
                this.f14133a.m20376N0();
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public void m20378O1() {
        String strPageId = this.f18649A.pageId();
        o6j0.a aVarH = o6j0.a.h("intl_tribe_source_name", this.f18675U);
        User user = CoreModule.c.o0.U;
        o6j0.c("e_intl_tribe_card_regret_click", strPageId, new o6j0.a[]{aVarH, o6j0.a.h("receiver_user_id", user == null ? "NA" : ((DbObject) user).id)});
        if (m20381Q1()) {
            return;
        }
        if (!ezc0.m0() || !CoreModule.K().me_().isNewUserIn24H() || !ezc0.i0().h0()) {
            this.f18650B.m15793E2(false);
        } else {
            ezc0.i0().k0();
            ezc0.i0().r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m20379P0() {
        if (NullChecker.a(m20414m0()) && NullChecker.a(m20414m0().mo2814o()) && NullChecker.a(m20414m0().mo2814o().m17130d())) {
            CoreModule.c.m0.E8(((DbObject) m20414m0().mo2814o().m17130d()).id);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m20380Q0(View view) {
        com.p1.mobile.putong.core.ui.match.a.w().p(this.f18649A, m20397a0(this.f18653E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.dip
            public final void call() {
                this.f11850a.m20379P0();
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m20381Q1() {
        return m20414m0().mo2805d() == null;
    }

    /* JADX INFO: renamed from: R */
    public View m20382R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qip.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct act() {
        return this.f18649A;
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m20385T0(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m20408i1(hhp hhpVar) {
        this.f18650B = hhpVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m20387U0(wsf0 wsf0Var, View view) {
        o6j0.c("e_intl_tribe_card_dislike_click", this.f18649A.pageId(), new o6j0.a[]{o6j0.a.h("receiver_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), o6j0.a.h("intl_tribe_source_name", this.f18675U), o6j0.a.h("intl_get_see_source", "tribe")});
        m20330V(wsf0Var, "dislike");
        if (m20381Q1()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m20388V0(wsf0 wsf0Var, mol molVar) {
        if (NullChecker.a(m20414m0().mo2805d())) {
            if ((mah0.m0() && NullChecker.a(m20414m0().mo2809j()) && NullChecker.a(m20414m0().mo2814o().m17130d()) && (mah0.y0(((DbObject) m20414m0().mo2814o().m17130d()).id) || m20414m0().mo2809j() == null)) || m20414m0().m19515q() || m20414m0().m19513f()) {
                return;
            }
            if (wsf0Var.mo2812m()) {
                wsf0Var.mo2813n();
                return;
            }
            d5m d5mVar = m20414m0().mo2805d() instanceof d5m ? (d5m) m20414m0().mo2805d() : null;
            if (NullChecker.a(d5mVar) && CoreModule.N().M8()) {
                NewNewProfileCard.m743Y1();
            }
            if (NullChecker.a(d5mVar)) {
                d5mVar.mo762C();
            }
            boolean z = false;
            int i = (d5mVar == null || !d5mVar.mo799P()) ? 1 : 0;
            boolean zIsUserLikeMe = (NullChecker.a(d5mVar) && NullChecker.a(d5mVar.getCardData()) && NullChecker.a(d5mVar.getCardData().m17131e())) ? d5mVar.getCardData().m17131e().isUserLikeMe() : false;
            String str = zIsUserLikeMe ? "upper_right" : "null";
            if (NullChecker.a(d5mVar) && d5mVar.mo765D("female_like_flag_lower_left")) {
                str = "lower_left";
                zIsUserLikeMe = true;
            }
            CoreSuggested.UserInfo userInfoMo2809j = m20414m0().mo2809j();
            CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
            String strPageId = this.f18649A.pageId();
            o6j0.a aVarF = o6j0.a.f("IsWhiteBlock", i);
            o6j0.a aVarH = o6j0.a.h("moments_user_id", NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0");
            o6j0.a aVarI = o6j0.a.i("show_he_liked", zIsUserLikeMe);
            o6j0.a aVarH2 = o6j0.a.h("show_he_liked_position", str);
            o6j0.a aVarI2 = o6j0.a.i("is_first_picture", this.f18650B.m15787B1(NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0") && molVar.getShowPictureIndexProxy() == 0);
            o6j0.a aVarH3 = o6j0.a.h("swipe_scene", "default");
            if (NullChecker.a(userInfoMo2809j) && userInfoMo2809j.isThemeCard) {
                z = true;
            }
            o6j0.c("e_card", strPageId, new o6j0.a[]{aVarF, aVarH, aVarI, aVarH2, aVarI2, aVarH3, o6j0.a.i("theme_card_ornot", z), o6j0.a.h("is_moment_card", molVar.mo917z() ? "1" : "0"), o6j0.a.h("moment_id", momentInfoProxy != null ? ((CopyObject) momentInfoProxy).id : "0")});
            zvf0.u("e_intl_tribe_card_profile_entranc_click", this.f18649A.pageId(), new j760[]{j760.a("intl_tribe_source_name", this.f18675U)});
            abi.y(true);
            m20371G1("home_moment_theme_card", act().color(w0c0.O1));
        }
    }

    /* JADX INFO: renamed from: W */
    public nsl m20389W(boolean z, boolean z2) {
        if (z) {
            return z2 ? m20416n0() : m20404f0();
        }
        return m20400c0();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m20390W0(Object obj) {
        this.f18679Y.call(obj);
    }

    /* JADX INFO: renamed from: X */
    public void m20391X() {
        m20414m0().setAllowUpSwipe(false);
        xdl0.M(m20418o0(), false);
        m20436z1(false, true);
        if (IntlCountryCodeController.v()) {
            xdl0.M(this.f18704v, false);
            xdl0.M(this.f18707y, false);
            m20436z1(false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m20392X0(wsf0 wsf0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo2805d = wsf0Var.mo2805d();
        if (NullChecker.a(callbackMo2805d)) {
            d5m d5mVar = callbackMo2805d instanceof d5m ? (d5m) callbackMo2805d : null;
            if (d5mVar == null || !d5mVar.mo1891R()) {
                if (d5mVar != null && d5mVar.mo1890F()) {
                    if (this.f18666L) {
                        m20400c0().mo2337j(-f);
                    }
                    if (this.f18667M) {
                        m20404f0().mo2337j(f);
                    }
                    if (this.f18668N) {
                        m20416n0().mo2337j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m20416n0().reset();
                    m20404f0().reset();
                    m20400c0().mo2337j(-f);
                    this.f18666L = true;
                    this.f18667M = false;
                    this.f18668N = false;
                    return;
                }
                if (z) {
                    m20416n0().reset();
                    m20400c0().reset();
                    m20404f0().mo2337j(f);
                    this.f18667M = true;
                    this.f18666L = false;
                    this.f18668N = false;
                    return;
                }
                m20404f0().reset();
                m20400c0().reset();
                m20416n0().mo2337j(f);
                this.f18666L = false;
                this.f18667M = false;
                this.f18668N = true;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m20393Y() {
        m20414m0().setAllowUpSwipe(true);
        if (IntlCountryCodeController.v()) {
            xdl0.M(this.f18704v, true);
            xdl0.M(this.f18707y, true);
            m20436z1(true, false);
        }
        if (fap.y()) {
            this.f18659H = true;
        }
        m20418o0().setVisibility(0);
        m20436z1(true, false);
        m20418o0().setOnClickListener(new View.OnClickListener() { // from class: l.xhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22615a.m20315K0(view);
            }
        });
        m20416n0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.yhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23070a.m20318L0(view);
            }
        });
        m20416n0().setOnLongPressListener(new C1113d());
        m20424r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.zhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23684a.m20321M0(view);
            }
        });
        xdl0.k0(m20395Z());
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m20394Y0() {
        this.f18650B.m15830r2();
    }

    /* JADX INFO: renamed from: Z */
    public View m20395Z() {
        return this.f18692k0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m20396Z0(View view) {
        m20378O1();
    }

    /* JADX INFO: renamed from: a0 */
    public final User m20397a0(IntlTribeSlideFrag intlTribeSlideFrag) {
        CoreSuggested.UserInfo userInfoMo2809j = intlTribeSlideFrag.f3116C.m20414m0().mo2809j();
        if (NullChecker.a(userInfoMo2809j)) {
            return userInfoMo2809j.getRenderUser();
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m20398a1(View view) {
        o6j0.c("e_intl_tribe_exit_btn", this.f18649A.pageId(), new o6j0.a[0]);
        m20368E1(this.f18649A);
    }

    /* JADX INFO: renamed from: b0 */
    public View m20399b0() {
        return this.f18697p;
    }

    /* JADX INFO: renamed from: c0 */
    public nsl m20400c0() {
        return this.f18692k0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: d0 */
    public DraweeView m20401d0() {
        return this.f18683c.f3140b;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m20402d1(wsf0 wsf0Var, View view) {
        m20375J1(wsf0Var.mo2805d());
    }

    /* JADX INFO: renamed from: e0 */
    public IntlTribeSlideFrag m20403e0() {
        return this.f18653E;
    }

    /* JADX INFO: renamed from: f0 */
    public nsl m20404f0() {
        return this.f18692k0.getLikeBtn();
    }

    /* JADX INFO: renamed from: g0 */
    public RelativeLayout m20405g0() {
        return this.f18684d;
    }

    /* JADX INFO: renamed from: h0 */
    public VDraweeView m20406h0() {
        return this.f18687g;
    }

    /* JADX INFO: renamed from: i0 */
    public RadarRipple m20407i0() {
        return this.f18686f;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM20382R = m20382R(layoutInflater, viewGroup);
        ProfileCardStackIntlTribeSlideOpt profileCardStackIntlTribeSlideOpt = new ProfileCardStackIntlTribeSlideOpt((Context) act(), new qol0() { // from class: l.qhp
            /* JADX INFO: renamed from: d2 */
            public final ool0 m21014d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f19286a.m20429u0(virtualCardType, userInfo);
            }
        }, this);
        this.f18652D = profileCardStackIntlTribeSlideOpt;
        profileCardStackIntlTribeSlideOpt.setClipChildren(false);
        this.f18652D.setClipToPadding(false);
        this.f18697p.addView(this.f18652D, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f18651C = this.f18652D;
        m20303A0();
        xdl0.E0(this.f18692k0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.rhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pip.m20354w(view);
            }
        });
        return viewM20382R;
    }

    /* JADX INFO: renamed from: j0 */
    public LocationPermissionView m20409j0() {
        return this.f18695n;
    }

    /* JADX INFO: renamed from: k0 */
    public hhp m20410k0() {
        return this.f18650B;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m20411k1(wsf0 wsf0Var, View view) {
        o6j0.c("e_intl_tribe_card_like_click", this.f18649A.pageId(), new o6j0.a[]{o6j0.a.h("receiver_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), o6j0.a.h("intl_tribe_source_name", this.f18675U), o6j0.a.h("intl_get_see_source", "tribe")});
        m20330V(wsf0Var, "like");
        if (m20381Q1()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: l0 */
    public FrameLayout m20412l0() {
        return this.f18681a;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m20413l1(Envelope envelope) {
        this.f18649A.finish();
    }

    /* JADX INFO: renamed from: m0 */
    public wsf0 m20414m0() {
        return this.f18651C;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m20415m1() {
        o6j0.c("e_intl_tribe_exit_leave_click", "p_intl_tribe_exit_intercept_pop", new o6j0.a[0]);
        m20425r1(this.f18674T, this.f18675U);
    }

    /* JADX INFO: renamed from: n0 */
    public nsl m20416n0() {
        return this.f18692k0.getSuperLike();
    }

    /* JADX INFO: renamed from: n1 */
    public void m20417n1(boolean z) {
        this.f18669O = z;
        if (z && NullChecker.a(act())) {
            m20433w1();
            dbl0.a(act().getWindow().getDecorView(), false);
        }
        if (this.f18669O && NullChecker.a(m20414m0()) && NullChecker.a(m20414m0().mo2805d()) && (m20414m0().mo2805d() instanceof d5m)) {
            ((d5m) m20414m0().mo2805d()).mo762C();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public View m20418o0() {
        return this.f18692k0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: o1 */
    public void m20419o1() {
        if (NullChecker.a(m20414m0())) {
            m20414m0().mo2802a();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public VFrame_FlipContainer m20420p0() {
        return this.f18692k0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: p1 */
    public void m20421p1() {
        if (((Boolean) this.f18665K.e()).booleanValue()) {
            this.f18698p0.start();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public LinearLayout m20422q0() {
        return this.f18702t;
    }

    /* JADX INFO: renamed from: q1 */
    public void m20423q1() {
        abi.y(true);
        this.f18698p0.cancel();
    }

    /* JADX INFO: renamed from: r0 */
    public nsl m20424r0() {
        return this.f18692k0.getUndo();
    }

    /* JADX INFO: renamed from: r1 */
    public void m20425r1(String str, String str2) {
        this.f18649A.duringCreated(CoreModule.c.n1.H3("quit", str, str2)).subscribe(mkd0.H(new e30() { // from class: l.fip
            public final void call(Object obj) {
                this.f13036a.m20413l1((Envelope) obj);
            }
        }, new e30() { // from class: l.gip
            public final void call(Object obj) {
                pip.m20335e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public View m20426s0() {
        return this.f18692k0.getUndoLayout();
    }

    /* JADX INFO: renamed from: s1 */
    public void m20427s1() {
        this.f18655F = null;
        this.f18665K.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t0 */
    public ConstraintLayout m20428t0() {
        return this.f18699q;
    }

    /* JADX INFO: renamed from: u0 */
    public ool0 m20429u0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public void m20430u1(boolean z, boolean z2) {
        m20432v1(z, z2, false);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m20384S0() {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: v1 */
    public void m20432v1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f18650B.f14105e = "";
        }
        m20351t1(z2);
        if (((Boolean) this.f18665K.e()).booleanValue() && !z) {
            e51.J(this.f18656F0);
            xdl0.M0(m20399b0(), true);
            m20319L1(true);
            this.f18698p0.cancel();
            if (NullChecker.a(m20405g0())) {
                xdl0.M0(m20405g0(), false);
                m20322M1(false);
            }
            m20329T(true);
            if (IntlCountryCodeController.v()) {
                xdl0.M(m20422q0(), true);
                xdl0.M(m20428t0(), true);
                xdl0.M(m20395Z(), false);
            }
        } else if (((Boolean) this.f18665K.e()).booleanValue() || !z) {
            ((Boolean) this.f18665K.e()).booleanValue();
        } else {
            this.f18656F0.m22715a(z2, false, false);
            if (z3) {
                e51.H(act(), this.f18656F0, zo0.f23777f);
            } else {
                this.f18656F0.run();
            }
        }
        this.f18665K.onNext(Boolean.valueOf(z));
        this.f18650B.f14119s = z2;
        m20326P1();
    }

    /* JADX INFO: renamed from: w1 */
    public void m20433w1() {
        if (NullChecker.a(m20414m0()) && NullChecker.a(m20414m0().mo2805d()) && (m20414m0().mo2805d() instanceof d5m)) {
            ((d5m) m20414m0().mo2805d()).mo883p(true, false);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m20434y1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.a(this.f18680Z)) {
            this.f18680Z.m12562i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m20435z0() {
        this.f18683c.m3609k(new d30() { // from class: l.shp
            public final void call() {
                this.f20270a.m20328R0();
            }
        }, new d30() { // from class: l.uhp
            public final void call() {
                this.f21197a.m20384S0();
            }
        }, this.f18650B);
    }

    /* JADX INFO: renamed from: z1 */
    public void m20436z1(boolean z, boolean z2) {
        this.f18661I = z;
        if (m20373I0()) {
            if (z2) {
                xdl0.M(m20424r0().getRealView(), z);
                xdl0.M(m20426s0(), z);
                return;
            } else {
                xdl0.M0(m20424r0().getRealView(), z);
                xdl0.M0(m20426s0(), z);
                return;
            }
        }
        if (z2) {
            xdl0.M(m20424r0().getRealView(), false);
            xdl0.M(m20426s0(), false);
        } else {
            xdl0.M0(m20424r0().getRealView(), false);
            xdl0.M0(m20426s0(), false);
        }
    }

    public void destroy() {
    }
}
