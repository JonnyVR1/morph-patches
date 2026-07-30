package com.p000p1.mobile.putong.core.newui.home.card.expanded;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardClipBgView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedOpAnimView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedSuperlikeSendView;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p000p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffx;
import l.g8k0;
import l.hfw;
import l.j760;
import l.mah0;
import l.mkd0;
import l.sb90;
import l.t100;
import l.upa;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p009l.a5m;
import p009l.chj0;
import p009l.cmf;
import p009l.e5m;
import p009l.fm4;
import p009l.jj4;
import p009l.mdj0;
import p009l.nql;
import p009l.oql;
import p009l.qm4;
import p009l.zo0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserProfileExpandedCardRoot extends UserProfileExpandedCardBaseRoot implements e5m, qm4, nql {

    /* JADX INFO: renamed from: C */
    public ExpandedCardClipBgView f1077C;

    /* JADX INFO: renamed from: D */
    public UserProfileExpandedCard f1078D;

    /* JADX INFO: renamed from: E */
    public VText f1079E;

    /* JADX INFO: renamed from: E0 */
    public Animator f1080E0;

    /* JADX INFO: renamed from: F */
    public VFrame f1081F;

    /* JADX INFO: renamed from: F0 */
    public c4g0 f1082F0;

    /* JADX INFO: renamed from: G */
    public ExpandedOpAnimView f1083G;

    /* JADX INFO: renamed from: G0 */
    public CoreSuggested.UserInfo f1084G0;

    /* JADX INFO: renamed from: H */
    public VFrame f1085H;

    /* JADX INFO: renamed from: H0 */
    public User f1086H0;

    /* JADX INFO: renamed from: I */
    public ExpandedOpAnimView f1087I;

    /* JADX INFO: renamed from: I0 */
    public boolean f1088I0;

    /* JADX INFO: renamed from: J */
    public ExpandedOpAnimView f1089J;

    /* JADX INFO: renamed from: J0 */
    public int f1090J0;

    /* JADX INFO: renamed from: K */
    public ExpandedOpAnimView f1091K;

    /* JADX INFO: renamed from: L */
    public ExpandedOpAnimView f1092L;

    /* JADX INFO: renamed from: M */
    public View f1093M;

    /* JADX INFO: renamed from: N */
    public SimpleDraweeView f1094N;

    /* JADX INFO: renamed from: O */
    public ViewStub f1095O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f1096P;

    /* JADX INFO: renamed from: Q */
    public View f1097Q;

    /* JADX INFO: renamed from: R */
    public ViewStub f1098R;

    /* JADX INFO: renamed from: S */
    public ViewStub f1099S;

    /* JADX INFO: renamed from: T */
    public int f1100T;

    /* JADX INFO: renamed from: U */
    public String f1101U;

    /* JADX INFO: renamed from: V */
    public oql f1102V;

    /* JADX INFO: renamed from: W */
    public int f1103W;

    /* JADX INFO: renamed from: k0 */
    public ExpandedSuperlikeSendView f1104k0;

    /* JADX INFO: renamed from: p0 */
    public SwipeGuideRightView f1105p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a */
    public class C0110a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1106a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorSet f1107b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(C0110a.this.f1106a, "scaleX", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(C0110a.this.f1106a, "scaleY", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat2.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
                C0110a.this.f1107b.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                C0110a.this.f1107b.start();
            }
        }

        public C0110a(View view, AnimatorSet animatorSet) {
            this.f1106a = view;
            this.f1107b = animatorSet;
        }

        public void onFinished() {
            super.onFinished();
            this.f1107b.cancel();
        }

        public void onStart() {
            super.onStart();
            UserProfileExpandedCardRoot.this.f1083G.postDelayed(new a(), 167L);
        }
    }

    public UserProfileExpandedCardRoot(@NonNull Context context) {
        super(context);
        this.f1104k0 = null;
        this.f1084G0 = null;
        this.f1088I0 = false;
        this.f1090J0 = -1;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m1925W0(View view) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m1934f1(View view) {
    }

    @Override // p009l.iol
    /* JADX INFO: renamed from: A0 */
    public void mo1896A0(View view) {
        super.mo1896A0(view);
        this.f1070u = 1.0f;
        this.f1088I0 = true;
        m1919S0();
        invalidate();
        this.f1078D.mo1896A0(view);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot, p009l.oql
    /* JADX INFO: renamed from: B */
    public void mo1365B(int i, int i2, int i3, String str, int i4) {
        super.mo1365B(i, i2, i3, str, i4);
        this.f1103W = i;
        if (NullChecker.a(this.f1102V) && !this.f1088I0) {
            this.f1102V.mo1365B(i, i2 + this.f1078D.getFixPaddingBottom(), i3, str, i4);
        }
        if (this.f1072w) {
            this.f1077C.m2207b(i, i4 + ExpandedCardStyleHelper.m2064o().m2075q());
        }
        xdl0.x0(getContext());
        xdl0.F0();
        t100.d(98.0f);
        NavigationBarAdmobHelper.INSTANCE.m47k();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo759B0(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (mah0.m0()) {
            if (mah0.y0(userInfo.id)) {
                mah0.s0().j1(viewTreeObserverOnGlobalLayoutListenerC0030b, this, userInfo, i);
                return true;
            }
            mkd0.z(this.f1082F0);
            if (NullChecker.a(this.f1080E0) && this.f1080E0.isRunning()) {
                this.f1080E0.end();
                getRootView().setRotation(0.0f);
                getRootView().setTranslationX(0.0f);
                getRootView().setPivotX(getWidth() / 2);
                getRootView().setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f1105p0;
            if (NullChecker.a(swipeGuideRightView) && xdl0.O0(swipeGuideRightView)) {
                xdl0.M(swipeGuideRightView, false);
            }
            mah0.s0().f1();
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1204U5(false);
        }
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: C */
    public void mo762C() {
        this.f1078D.mo762C();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo765D(String str) {
        return this.f1078D.mo765D(str);
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: D0 */
    public void mo1935D0(View view, SwipeState swipeState, boolean z) {
        if (!this.f1072w) {
            if (swipeState == SwipeState.START_MOVING) {
                m1912J0(true);
                return;
            } else {
                if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
                    m1912J0(false);
                    return;
                }
                return;
            }
        }
        if (swipeState == SwipeState.START_TOUCH) {
            this.f1048A = 0.0f;
            return;
        }
        if (swipeState == SwipeState.START_MOVING) {
            if (this.f1090J0 == 0 && ExpandedCardStyleHelper.m2064o().m2077s()) {
                this.f1074y.m12714i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                return;
            } else {
                this.f1074y.m12714i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                return;
            }
        }
        if (swipeState == SwipeState.START_BACK) {
            if (this.f1090J0 == 0 && ExpandedCardStyleHelper.m2064o().m2077s()) {
                this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
                return;
            } else {
                this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_CARD, true);
                return;
            }
        }
        if (swipeState == SwipeState.FINISH_OUT) {
            m1958y1(view, swipeState, z);
            this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else if (swipeState == SwipeState.FINISH_BACK) {
            if (this.f1090J0 == 0 && ExpandedCardStyleHelper.m2064o().m2077s()) {
                this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
            } else {
                this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_CARD, true);
            }
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: F */
    public boolean mo1890F() {
        return this.f1078D.mo1890F();
    }

    @Override // p009l.e5m
    /* JADX INFO: renamed from: H */
    public View mo1897H() {
        return this.f1078D.mo1897H();
    }

    @Override // p009l.iol
    /* JADX INFO: renamed from: K */
    public void mo1936K(View view) {
        super.mo1936K(view);
        this.f1088I0 = false;
        this.f1070u = 0.0f;
        m1919S0();
        invalidate();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: R */
    public boolean mo1891R() {
        return this.f1078D.mo1891R();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: T */
    public void mo810T(User user, CoreSuggested.UserInfo userInfo, int i) {
        m1954v1(userInfo, i);
        this.f1090J0 = i;
        if (TextUtils.equals(this.f1101U, ((DbObject) user).id)) {
            this.f1100T++;
        } else {
            this.f1100T = 1;
        }
        m1918R0(i, user);
        this.f1101U = ((DbObject) user).id;
        this.f1084G0 = userInfo;
        this.f1086H0 = user;
        this.f1078D.f1134s = m1940i1(user, userInfo, i);
        this.f1079E.setText("rc: " + this.f1100T);
        this.f1078D.mo810T(user, userInfo, i);
        CoreSuggested.UserInfo userInfo2 = this.f1084G0;
        if (userInfo2.renderFrom == CardInfoRenderFrom.CARD) {
            m1955w1(i, userInfo2.id);
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: U */
    public void mo812U() {
        this.f1078D.mo812U();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo824Y() {
        if (this.f1078D.getGuidePictureView() != null) {
            return this.f1078D.getGuidePictureView();
        }
        return null;
    }

    @Override // p009l.e5m
    /* JADX INFO: renamed from: c */
    public boolean mo1898c() {
        return this.f1078D.mo1898c();
    }

    @Override // p009l.oql
    /* JADX INFO: renamed from: c0 */
    public void mo1366c0(int i, int i2, int i3, int i4, View view) {
        super.mo1366c0(i, i2, i3, i4, view);
        if (!NullChecker.a(this.f1102V) || this.f1088I0) {
            return;
        }
        this.f1102V.mo1366c0(i, i2, i3, i4, view);
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m1942k1(z, f3, cardProgressAction);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo844e0() {
        return this.f1078D.mo844e0();
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: f0 */
    public void mo1937f0(int i, float f, float f2, boolean z, String str) {
        if (i < 1) {
            if (z) {
                return;
            }
            setAlpha(1.0f);
            return;
        }
        if (!z) {
            if (i > 1) {
                setAlpha(0.0f);
            } else {
                setAlpha(Math.min(1.0f, Math.max(zo0.f23768H, 1.2f * f)));
            }
        }
        if (this.f1090J0 != 0) {
            cmf cmfVar = this.f1074y;
            cmfVar.m12707b(f, ExpandedCardClipStatus.EXPANDED_CARD, cmfVar.m12711f(ExpandedCardClipStatus.SWIPE_CLIP), 1.0f, "swipe other size");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m1938g1(View view) {
        g8k0.a(this, view);
    }

    @Override // p009l.a5m
    public jj4 getCardData() {
        return this.f1078D.getCardData();
    }

    @Override // p009l.mol
    public jj4 getCardDataProxy() {
        return this.f1078D.getCardDataProxy();
    }

    @Override // p009l.a5m, p009l.gol
    public View getCardView() {
        return this.f1078D;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public BaseExpandedView getCardViewInner() {
        return this.f1078D;
    }

    public View getCardViewProxy() {
        return this.f1078D.getCardViewProxy();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public SimpleDraweeView getClipAvatarView() {
        return this.f1094N;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public UserProfileExpandedCard getExpandedCard() {
        return this.f1078D;
    }

    @Override // p009l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return this.f1078D.getMomentInfoProxy();
    }

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    @Override // p009l.mol
    public int getShowPictureIndexProxy() {
        return this.f1078D.getShowPictureIndexProxy();
    }

    @Override // p009l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f1078D.getUserInfoProxy();
    }

    @Override // p009l.mol
    public User getUserProxy() {
        return this.f1078D.getUserProxy();
    }

    @Override // p009l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m1939h1() {
        this.f1078D.m1901q1();
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m1940i1(User user, CoreSuggested.UserInfo userInfo, int i) {
        return i == 0 && user != null && userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && sb90.b(user, this.f1084G0);
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo861j0(SwipeDirection swipeDirection) {
        this.f1078D.mo861j0(swipeDirection);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m1941j1() {
        if (upa.s2()) {
            setOnClickListener(null);
            ExpandedOpAnimView expandedOpAnimView = this.f1083G;
            if (expandedOpAnimView != null) {
                expandedOpAnimView.m2322j();
                this.f1083G.setAnimListener((AnimListener) null);
                this.f1083G.removeCallbacks(null);
            }
            ExpandedOpAnimView expandedOpAnimView2 = this.f1092L;
            if (expandedOpAnimView2 != null) {
                expandedOpAnimView2.m2322j();
                this.f1092L.setAnimListener((AnimListener) null);
            }
            ExpandedOpAnimView expandedOpAnimView3 = this.f1091K;
            if (expandedOpAnimView3 != null) {
                expandedOpAnimView3.m2322j();
                this.f1091K.setAnimListener((AnimListener) null);
            }
            ExpandedOpAnimView expandedOpAnimView4 = this.f1089J;
            if (expandedOpAnimView4 != null) {
                expandedOpAnimView4.m2322j();
                this.f1089J.setAnimListener((AnimListener) null);
            }
            ExpandedOpAnimView expandedOpAnimView5 = this.f1087I;
            if (expandedOpAnimView5 != null) {
                expandedOpAnimView5.m2322j();
                this.f1087I.setAnimListener((AnimListener) null);
            }
        }
    }

    @Override // p009l.iol
    /* JADX INFO: renamed from: k */
    public void mo864k(boolean z) {
        this.f1102V = null;
        this.f1078D.mo864k(z);
        this.f1088I0 = false;
        m1917Q0();
        if (!z) {
            m1909G0();
            m1941j1();
        }
        if (NullChecker.a(this.f1104k0)) {
            xdl0.M(this.f1104k0, false);
            this.f1104k0.m2324b();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m1942k1(boolean z, float f, CardProgressAction cardProgressAction) {
        CoreSuggested.UserInfo userInfo = this.f1084G0;
        if (userInfo == null || userInfo.isUndo || mah0.y0(userInfo.id)) {
            return;
        }
        if (!z) {
            if (getUserProxy().isFemale()) {
                this.f1087I.setVisibility(0);
                this.f1087I.setPressed(true);
                this.f1087I.m2321i();
                this.f1089J.setVisibility(4);
                this.f1089J.setPressed(false);
            } else {
                this.f1089J.setVisibility(0);
                this.f1089J.setPressed(true);
                this.f1089J.m2321i();
                this.f1087I.setVisibility(4);
                this.f1087I.setPressed(false);
            }
            this.f1092L.setVisibility(4);
            this.f1091K.setVisibility(4);
            this.f1092L.setPressed(false);
            this.f1091K.setPressed(false);
            this.f1081F.setVisibility(0);
            this.f1083G.setVisibility(0);
            this.f1083G.setPressed(true);
            if (!this.f1083G.m2318f()) {
                VFrame vFrame = this.f1085H;
                vFrame.setScaleX(0.0f);
                vFrame.setScaleY(0.0f);
                this.f1083G.setAnimListener(new C0110a(vFrame, new AnimatorSet()));
            }
            this.f1083G.m2321i();
            return;
        }
        if (f > 0.0f) {
            Math.min(1.0f, f * 2.0f);
            this.f1092L.setVisibility(0);
            this.f1091K.setVisibility(4);
            this.f1092L.setPressed(true);
            this.f1092L.m2321i();
            this.f1091K.m2322j();
            this.f1091K.setPressed(false);
        } else if (f < 0.0f) {
            Math.max(-1.0f, f * 2.0f);
            this.f1092L.setVisibility(4);
            this.f1091K.setVisibility(0);
            this.f1092L.setPressed(false);
            this.f1091K.setPressed(true);
            this.f1091K.m2321i();
            this.f1092L.m2322j();
        } else {
            this.f1092L.setVisibility(4);
            this.f1091K.setVisibility(4);
            this.f1092L.setPressed(false);
            this.f1091K.setPressed(false);
            this.f1092L.m2322j();
            this.f1091K.m2322j();
        }
        this.f1081F.setVisibility(4);
        this.f1083G.m2322j();
        this.f1083G.setPressed(false);
        this.f1087I.m2322j();
        this.f1087I.setPressed(false);
        this.f1089J.m2322j();
        this.f1089J.setPressed(false);
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: l0 */
    public void mo1943l0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        m1913L0(i, cardProgressAction, z, f, f2);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m1944l1() {
        return false;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: m */
    public void mo872m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        mo810T(user, userInfo, i);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m1945m1() {
        Act actE = xdl0.E(this);
        if (actE == null) {
            return;
        }
        mah0.s0().b1(actE, this);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m1946n1(Pair pair) {
        m1959z1();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m1947o1(int i, Boolean bool) {
        int iD = 0;
        if (i == 0) {
            if (bool.booleanValue()) {
                iD = (int) ((1.0f - ExpandedCardStyleHelper.m2064o().m2076r()) * t100.d(50.0f));
            }
        } else if (bool.booleanValue()) {
            iD = t100.d(50.0f);
        }
        xdl0.X(this.f1078D, iD);
        this.f1077C.setExtTop(iD);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1938g1(this);
        xdl0.E0(this.f1097Q, new View.OnClickListener() { // from class: l.t7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileExpandedCardRoot.m1934f1(view);
            }
        });
        xdl0.U(this.f1097Q, t100.d(58.0f));
        this.f1078D.m1994b1(t100.d(8.0f), t100.d(10.0f), t100.d(8.0f), t100.d(98.0f));
        this.f1078D.m1989X(this);
        this.f1078D.m1899o1(this);
        this.f1078D.setBlockScroll(true);
        xdl0.d0(this.f1096P, t100.d(8.0f));
        xdl0.e0(this.f1096P, t100.d(8.0f));
        xdl0.f0(this.f1096P, t100.d(10.0f));
        xdl0.c0(this.f1096P, t100.d(30.0f));
        this.f1092L.m2319g(fm4.m14510h());
        this.f1091K.m2319g(fm4.m14509g());
        this.f1083G.m2319g("https://auto.tancdn.com/v1/raw/95aca228-d59c-4db5-9287-99764d67ddaa14.pdf");
        this.f1089J.m2319g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f1087I.m2319g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f1077C.setBackgroundResource(x2c0.g8);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.x7k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22457a.m1945m1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m1948p1(Integer num) {
        mo1935D0(this, SwipeState.START_MOVING, false);
        mo1935D0(this, SwipeState.START_BACK, false);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo888q0() {
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m1949q1(String str, Boolean bool) {
        this.f1078D.f1040B = new j760<>(str, bool);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: r */
    public void mo891r() {
        this.f1078D.mo891r();
        m1917Q0();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m1950r1(View view) {
        ExpandedCardStyleHelper.m2064o().m2067g(this.f1086H0, this.f1084G0);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m1951s1(ExpandedCardStyleHelper.C0115b c0115b) {
        if (c0115b.f1196a == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            m1911I0();
            this.f1078D.setBlockScroll(false);
            xdl0.X(this.f1092L, t100.d(60.0f));
            xdl0.X(this.f1091K, t100.d(60.0f));
            xdl0.M(this.f1097Q, false);
            return;
        }
        m1910H0();
        this.f1078D.setBlockScroll(true);
        if (c0115b.f1202g) {
            CoreSuggested.UserInfo userInfo = c0115b.f1199d;
            UserProfileExpandedCard userProfileExpandedCard = this.f1078D;
            if (userInfo != null) {
                userProfileExpandedCard.m2000f0(ExpandedCardStyleHelper.f1185h);
            } else {
                userProfileExpandedCard.m2000f0(ExpandedCardStyleHelper.f1185h);
            }
        }
        xdl0.X(this.f1092L, t100.d(10.0f));
        xdl0.X(this.f1091K, t100.d(10.0f));
        xdl0.M(this.f1097Q, true);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setCardViewBackgroundResource(@DrawableRes int i) {
        this.f1078D.setBackgroundResource(i);
    }

    @Override // p009l.a5m
    public void setExpandedScrollListener(oql oqlVar) {
        this.f1088I0 = false;
        this.f1102V = oqlVar;
    }

    @Override // p009l.a5m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC0027d interfaceC0027d) {
    }

    public void setTwoFingerHelper(mdj0 mdj0Var) {
        UserProfileExpandedCard userProfileExpandedCard = this.f1078D;
        if (userProfileExpandedCard != null) {
            userProfileExpandedCard.setTwoFingerHelper(mdj0Var);
        }
    }

    @Override // p009l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo898t() {
        return this.f1099S;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m1952t1(Pair pair) {
        xdl0.X(this.f1078D, (int) (t100.B * Math.max(0.0f, ((Float) pair.second).floatValue() - ((Float) pair.first).floatValue())));
        this.f1078D.m1902r1(((Float) pair.first).floatValue());
    }

    /* JADX INFO: renamed from: u1 */
    public void m1953u1() {
        if (getRootView().getWidth() <= 0 || getRootView().getHeight() <= 0) {
            return;
        }
        getRootView().measure(ffx.b(getRootView().getWidth()), ffx.b(getRootView().getHeight()));
        getRootView().layout(getRootView().getLeft(), getRootView().getTop(), getRootView().getLeft() + getRootView().getWidth(), getRootView().getTop() + getRootView().getHeight());
    }

    /* JADX INFO: renamed from: v1 */
    public final void m1954v1(CoreSuggested.UserInfo userInfo, int i) {
        xdl0.M0(this.f1091K, false);
        xdl0.M0(this.f1092L, false);
        xdl0.M0(this.f1081F, false);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        View view = this.f1093M;
        if (cardInfoRenderFrom != cardInfoRenderFrom2) {
            xdl0.M(view, false);
            return;
        }
        xdl0.M(view, false);
        View view2 = this.f1093M;
        if (i != 0) {
            view2.setAlpha(1.0f);
        } else {
            view2.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m1955w1(final int i, final String str) {
        m1914M0(xdl0.E(this), NavigationBarAdmobHelper.INSTANCE.m48l()).subscribe(mkd0.G(new e30() { // from class: l.y7k0
            public final void call(Object obj) {
                this.f22927a.m1948p1((Integer) obj);
            }
        }));
        this.f1078D.f1040B = null;
        m1914M0(xdl0.E(this), CoreModule.Q().m9042ao(str)).subscribe(mkd0.H(new e30() { // from class: l.a8k0
            public final void call(Object obj) {
                this.f9327a.m1949q1(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.b8k0
            public final void call(Object obj) {
                hfw.a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
        if (i == 0) {
            this.f1078D.setBlockScroll(!ExpandedCardStyleHelper.m2064o().m2077s());
            xdl0.E0(this, new View.OnClickListener() { // from class: l.c8k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10467a.m1950r1(view);
                }
            });
            m1914M0(xdl0.E(this), ExpandedCardStyleHelper.m2064o().m2083y()).subscribe(mkd0.G(new e30() { // from class: l.d8k0
                public final void call(Object obj) {
                    this.f11670a.m1951s1((ExpandedCardStyleHelper.C0115b) obj);
                }
            }));
            m1914M0(xdl0.E(this), ExpandedCardStyleHelper.m2064o().m2080v(str)).subscribe(mkd0.G(new e30() { // from class: l.e8k0
                public final void call(Object obj) {
                    this.f12448a.m1952t1((Pair) obj);
                }
            }));
            m1914M0(xdl0.E(this), ExpandedCardStyleHelper.m2064o().m2083y().map(new w9j() { // from class: l.f8k0
                public final Object call(Object obj) {
                    ExpandedCardStyleHelper.C0115b c0115b = (ExpandedCardStyleHelper.C0115b) obj;
                    return Pair.create(Boolean.valueOf(c0115b.m2089e()), Boolean.valueOf(c0115b.m2090f()));
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.u7k0
                public final void call(Object obj) {
                    this.f21009a.m1946n1((Pair) obj);
                }
            }));
            int iM2074p = (int) (t100.B * ExpandedCardStyleHelper.m2064o().m2074p());
            xdl0.X(this.f1078D, iM2074p);
            this.f1077C.setExtTop(iM2074p);
            m1959z1();
            if (this.f1078D.getScrollH() > 0 && !ExpandedCardStyleHelper.m2064o().m2077s()) {
                this.f1078D.m2000f0(ExpandedCardStyleHelper.f1185h);
            }
        } else {
            xdl0.E0(this, new View.OnClickListener() { // from class: l.v7k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileExpandedCardRoot.m1925W0(view);
                }
            });
            int iD = ExpandedCardStyleHelper.m2064o().m2078t() ? t100.d(50.0f) : 0;
            xdl0.X(this.f1078D, iD);
            this.f1077C.setExtTop(iD);
            this.f1078D.m1902r1(0.0f);
            if (this.f1078D.getScrollH() > 0) {
                this.f1078D.m2000f0(ExpandedCardStyleHelper.f1185h);
            }
        }
        m1914M0(xdl0.E(this), ExpandedCardStyleHelper.m2064o().m2083y().map(new w9j() { // from class: l.w7k0
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpandedCardStyleHelper.C0115b) obj).m2090f());
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.z7k0
            public final void call(Object obj) {
                this.f23507a.m1947o1(i, (Boolean) obj);
            }
        }));
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: x */
    public void mo1956x(SwipeDirection swipeDirection, CardSwipeOutState cardSwipeOutState, boolean z) {
        if (z && cardSwipeOutState == CardSwipeOutState.PASS && swipeDirection == SwipeDirection.UP) {
            this.f1092L.setVisibility(4);
            this.f1091K.setVisibility(4);
            this.f1081F.setVisibility(0);
            this.f1083G.setVisibility(0);
            this.f1083G.m2321i();
        }
        if (cardSwipeOutState == CardSwipeOutState.PASS) {
            m1939h1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m1957x1() {
        if (this.f1072w && upa.N3() && this.f1090J0 == 0) {
            mo1935D0(this, SwipeState.START_MOVING, false);
            mo1935D0(this, SwipeState.START_BACK, false);
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo914y() {
        return this.f1078D.mo914y();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m1958y1(View view, SwipeState swipeState, boolean z) {
        if (upa.Z2() && CoreModule.c.z2.r3() && swipeState == SwipeState.FINISH_OUT && getTranslationX() > 0.0f) {
            float rotation = ((float) (((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * 1.0f;
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            double width = (getWidth() / 2) - pivotX;
            double d = rotation;
            double height = (getHeight() / 2) - pivotY;
            CoreModule.c.z2.A3(this.f1086H0, (((int) (((Math.cos(d) * width) - (Math.sin(d) * height)) + ((double) pivotX))) - t100.d(30.0f)) + getTranslationX(), (((int) (((width * Math.sin(d)) + (Math.cos(d) * height)) + ((double) pivotY))) - t100.d(30.0f)) + getTranslationY());
        }
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo917z() {
        return this.f1078D.mo917z();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m1959z1() {
        int iM2088d = ExpandedCardStyleHelper.m2064o().m2073n().m2088d();
        int iM2087c = ExpandedCardStyleHelper.m2064o().m2073n().m2087c();
        xdl0.X(this.f1092L, iM2088d);
        xdl0.X(this.f1091K, iM2088d);
        xdl0.X(this.f1081F, iM2088d);
        xdl0.U(this.f1081F, iM2087c);
        xdl0.U(this.f1092L, iM2087c);
        xdl0.U(this.f1091K, t100.d(50.0f));
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1104k0 = null;
        this.f1084G0 = null;
        this.f1088I0 = false;
        this.f1090J0 = -1;
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1104k0 = null;
        this.f1084G0 = null;
        this.f1088I0 = false;
        this.f1090J0 = -1;
    }

    @Override // p009l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
    }
}
