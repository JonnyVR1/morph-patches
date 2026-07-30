package com.p051p1.mobile.putong.core.newui.home.card.expanded;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardClipBgView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedOpAnimView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedSuperlikeSendView;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;
import p153l.atl;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dox;
import p153l.en4;
import p153l.fqj0;
import p153l.gra;
import p153l.ik4;
import p153l.inf;
import p153l.kcg0;
import p153l.mhk0;
import p153l.pf60;
import p153l.pn4;
import p153l.psd0;
import p153l.q7m;
import p153l.qa00;
import p153l.qcj;
import p153l.qmj0;
import p153l.u7m;
import p153l.uih0;
import p153l.vo0;
import p153l.wj90;
import p153l.x20;
import p153l.y20;
import p153l.zsl;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedCardRoot extends UserProfileExpandedCardBaseRoot implements u7m, pn4, zsl {

    /* JADX INFO: renamed from: C */
    public ExpandedCardClipBgView f23041C;

    /* JADX INFO: renamed from: D */
    public UserProfileExpandedCard f23042D;

    /* JADX INFO: renamed from: E */
    public VText f23043E;

    /* JADX INFO: renamed from: E0 */
    public Animator f23044E0;

    /* JADX INFO: renamed from: F */
    public VFrame f23045F;

    /* JADX INFO: renamed from: F0 */
    public kcg0 f23046F0;

    /* JADX INFO: renamed from: G */
    public ExpandedOpAnimView f23047G;

    /* JADX INFO: renamed from: G0 */
    public CoreSuggested.UserInfo f23048G0;

    /* JADX INFO: renamed from: H */
    public VFrame f23049H;

    /* JADX INFO: renamed from: H0 */
    public User f23050H0;

    /* JADX INFO: renamed from: I */
    public ExpandedOpAnimView f23051I;

    /* JADX INFO: renamed from: I0 */
    public boolean f23052I0;

    /* JADX INFO: renamed from: J */
    public ExpandedOpAnimView f23053J;

    /* JADX INFO: renamed from: J0 */
    public int f23054J0;

    /* JADX INFO: renamed from: K */
    public ExpandedOpAnimView f23055K;

    /* JADX INFO: renamed from: L */
    public ExpandedOpAnimView f23056L;

    /* JADX INFO: renamed from: M */
    public View f23057M;

    /* JADX INFO: renamed from: N */
    public SimpleDraweeView f23058N;

    /* JADX INFO: renamed from: O */
    public ViewStub f23059O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f23060P;

    /* JADX INFO: renamed from: Q */
    public View f23061Q;

    /* JADX INFO: renamed from: R */
    public ViewStub f23062R;

    /* JADX INFO: renamed from: S */
    public ViewStub f23063S;

    /* JADX INFO: renamed from: T */
    public int f23064T;

    /* JADX INFO: renamed from: U */
    public String f23065U;

    /* JADX INFO: renamed from: V */
    public atl f23066V;

    /* JADX INFO: renamed from: W */
    public int f23067W;

    /* JADX INFO: renamed from: k0 */
    public ExpandedSuperlikeSendView f23068k0;

    /* JADX INFO: renamed from: p0 */
    public SwipeGuideRightView f23069p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a */
    public class C8097a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f23070a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorSet f23071b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(C8097a.this.f23070a, "scaleX", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(C8097a.this.f23070a, "scaleY", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat2.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
                C8097a.this.f23071b.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                C8097a.this.f23071b.start();
            }
        }

        public C8097a(View view, AnimatorSet animatorSet) {
            this.f23070a = view;
            this.f23071b = animatorSet;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            this.f23071b.cancel();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            UserProfileExpandedCardRoot.this.f23047G.postDelayed(new a(), 167L);
        }
    }

    public UserProfileExpandedCardRoot(@NonNull Context context) {
        super(context);
        this.f23068k0 = null;
        this.f23048G0 = null;
        this.f23052I0 = false;
        this.f23054J0 = -1;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m38954W0(View view) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m38963f1(View view) {
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: A0 */
    public void mo38925A0(View view) {
        super.mo38925A0(view);
        this.f23034u = 1.0f;
        this.f23052I0 = true;
        m38948S0();
        invalidate();
        this.f23042D.mo38925A0(view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot, p153l.atl
    /* JADX INFO: renamed from: B */
    public void mo38399B(int i, int i2, int i3, String str, int i4) {
        super.mo38399B(i, i2, i3, str, i4);
        this.f23067W = i;
        if (NullChecker.m82486a(this.f23066V) && !this.f23052I0) {
            this.f23066V.mo38399B(i, i2 + this.f23042D.getFixPaddingBottom(), i3, str, i4);
        }
        if (this.f23036w) {
            this.f23041C.m39232b(i, i4 + ExpandedCardStyleHelper.m39093o().m39104q());
        }
        bnl0.m105590x0(getContext());
        bnl0.m105511F0();
        qa00.m175859d(98.0f);
        NavigationBarAdmobHelper.INSTANCE.m37153k();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: B0 */
    public boolean mo37806B0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, q7m q7mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (uih0.m196214m0()) {
            if (uih0.m196232y0(userInfo.f20214id)) {
                uih0.m196223s0().m196266j1(viewTreeObserverOnGlobalLayoutListenerC8017b, this, userInfo, i);
                return true;
            }
            psd0.m173633z(this.f23046F0);
            if (NullChecker.m82486a(this.f23044E0) && this.f23044E0.isRunning()) {
                this.f23044E0.end();
                getRootView().setRotation(0.0f);
                getRootView().setTranslationX(0.0f);
                getRootView().setPivotX(getWidth() / 2);
                getRootView().setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f23069p0;
            if (NullChecker.m82486a(swipeGuideRightView) && bnl0.m105529O0(swipeGuideRightView)) {
                bnl0.m105524M(swipeGuideRightView, false);
            }
            uih0.m196223s0().m196262f1();
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38239U5(false);
        }
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: C */
    public void mo37809C() {
        this.f23042D.mo37809C();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: D */
    public boolean mo37812D(String str) {
        return this.f23042D.mo37812D(str);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: D0 */
    public void mo38964D0(View view, SwipeState swipeState, boolean z) {
        if (!this.f23036w) {
            if (swipeState == SwipeState.START_MOVING) {
                m38941J0(true);
                return;
            } else {
                if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
                    m38941J0(false);
                    return;
                }
                return;
            }
        }
        if (swipeState == SwipeState.START_TOUCH) {
            this.f23012A = 0.0f;
            return;
        }
        if (swipeState == SwipeState.START_MOVING) {
            if (this.f23054J0 == 0 && ExpandedCardStyleHelper.m39093o().m39106s()) {
                this.f23038y.m141122i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                return;
            } else {
                this.f23038y.m141122i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                return;
            }
        }
        if (swipeState == SwipeState.START_BACK) {
            if (this.f23054J0 == 0 && ExpandedCardStyleHelper.m39093o().m39106s()) {
                this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
                return;
            } else {
                this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_CARD, true);
                return;
            }
        }
        if (swipeState == SwipeState.FINISH_OUT) {
            m38987y1(view, swipeState, z);
            this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else if (swipeState == SwipeState.FINISH_BACK) {
            if (this.f23054J0 == 0 && ExpandedCardStyleHelper.m39093o().m39106s()) {
                this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
            } else {
                this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_CARD, true);
            }
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: F */
    public boolean mo38919F() {
        return this.f23042D.mo38919F();
    }

    @Override // p153l.u7m
    /* JADX INFO: renamed from: H */
    public View mo38926H() {
        return this.f23042D.mo38926H();
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: K */
    public void mo38965K(View view) {
        super.mo38965K(view);
        this.f23052I0 = false;
        this.f23034u = 0.0f;
        m38948S0();
        invalidate();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: R */
    public boolean mo38920R() {
        return this.f23042D.mo38920R();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: T */
    public void mo37855T(User user, CoreSuggested.UserInfo userInfo, int i) {
        m38983v1(userInfo, i);
        this.f23054J0 = i;
        if (TextUtils.equals(this.f23065U, user.f56859id)) {
            this.f23064T++;
        } else {
            this.f23064T = 1;
        }
        m38947R0(i, user);
        this.f23065U = user.f56859id;
        this.f23048G0 = userInfo;
        this.f23050H0 = user;
        this.f23042D.f23098s = m38969i1(user, userInfo, i);
        this.f23043E.setText("rc: " + this.f23064T);
        this.f23042D.mo37855T(user, userInfo, i);
        CoreSuggested.UserInfo userInfo2 = this.f23048G0;
        if (userInfo2.renderFrom == CardInfoRenderFrom.CARD) {
            m38984w1(i, userInfo2.f20214id);
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: U */
    public void mo37857U() {
        this.f23042D.mo37857U();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: Y */
    public PictureView mo37867Y() {
        if (this.f23042D.getGuidePictureView() != null) {
            return this.f23042D.getGuidePictureView();
        }
        return null;
    }

    @Override // p153l.u7m
    /* JADX INFO: renamed from: c */
    public boolean mo38927c() {
        return this.f23042D.mo38927c();
    }

    @Override // p153l.atl
    /* JADX INFO: renamed from: c0 */
    public void mo38400c0(int i, int i2, int i3, int i4, View view) {
        super.mo38400c0(i, i2, i3, i4, view);
        if (!NullChecker.m82486a(this.f23066V) || this.f23052I0) {
            return;
        }
        this.f23066V.mo38400c0(i, i2, i3, i4, view);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m38971k1(z, f3, cardProgressAction);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: e0 */
    public boolean mo37886e0() {
        return this.f23042D.mo37886e0();
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: f0 */
    public void mo38966f0(int i, float f, float f2, boolean z, String str) {
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
                setAlpha(Math.min(1.0f, Math.max(vo0.f184950H, 1.2f * f)));
            }
        }
        if (this.f23054J0 != 0) {
            inf infVar = this.f23038y;
            infVar.m141115b(f, ExpandedCardClipStatus.EXPANDED_CARD, infVar.m141119f(ExpandedCardClipStatus.SWIPE_CLIP), 1.0f, "swipe other size");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m38967g1(View view) {
        mhk0.m158421a(this, view);
    }

    @Override // p153l.q7m
    public ik4 getCardData() {
        return this.f23042D.getCardData();
    }

    @Override // p153l.xql
    public ik4 getCardDataProxy() {
        return this.f23042D.getCardDataProxy();
    }

    @Override // p153l.q7m, p153l.rql
    public View getCardView() {
        return this.f23042D;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public BaseExpandedView getCardViewInner() {
        return this.f23042D;
    }

    public View getCardViewProxy() {
        return this.f23042D.getCardViewProxy();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public SimpleDraweeView getClipAvatarView() {
        return this.f23058N;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public UserProfileExpandedCard getExpandedCard() {
        return this.f23042D;
    }

    @Override // p153l.xql
    public CoreMomentInfo getMomentInfoProxy() {
        return this.f23042D.getMomentInfoProxy();
    }

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    @Override // p153l.xql
    public int getShowPictureIndexProxy() {
        return this.f23042D.getShowPictureIndexProxy();
    }

    @Override // p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f23042D.getUserInfoProxy();
    }

    @Override // p153l.xql
    public User getUserProxy() {
        return this.f23042D.getUserProxy();
    }

    @Override // p153l.q7m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m38968h1() {
        this.f23042D.m38930q1();
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m38969i1(User user, CoreSuggested.UserInfo userInfo, int i) {
        return i == 0 && user != null && userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && wj90.m206619b(user, this.f23048G0);
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: j0 */
    public void mo37901j0(SwipeDirection swipeDirection) {
        this.f23042D.mo37901j0(swipeDirection);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m38970j1() {
        if (gra.m131746s2()) {
            setOnClickListener(null);
            ExpandedOpAnimView expandedOpAnimView = this.f23047G;
            if (expandedOpAnimView != null) {
                expandedOpAnimView.m39347j();
                this.f23047G.setAnimListener(null);
                this.f23047G.removeCallbacks(null);
            }
            ExpandedOpAnimView expandedOpAnimView2 = this.f23056L;
            if (expandedOpAnimView2 != null) {
                expandedOpAnimView2.m39347j();
                this.f23056L.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView3 = this.f23055K;
            if (expandedOpAnimView3 != null) {
                expandedOpAnimView3.m39347j();
                this.f23055K.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView4 = this.f23053J;
            if (expandedOpAnimView4 != null) {
                expandedOpAnimView4.m39347j();
                this.f23053J.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView5 = this.f23051I;
            if (expandedOpAnimView5 != null) {
                expandedOpAnimView5.m39347j();
                this.f23051I.setAnimListener(null);
            }
        }
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: k */
    public void mo37904k(boolean z) {
        this.f23066V = null;
        this.f23042D.mo37904k(z);
        this.f23052I0 = false;
        m38946Q0();
        if (!z) {
            m38938G0();
            m38970j1();
        }
        if (NullChecker.m82486a(this.f23068k0)) {
            bnl0.m105524M(this.f23068k0, false);
            this.f23068k0.m39349b();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m38971k1(boolean z, float f, CardProgressAction cardProgressAction) {
        CoreSuggested.UserInfo userInfo = this.f23048G0;
        if (userInfo == null || userInfo.isUndo || uih0.m196232y0(userInfo.f20214id)) {
            return;
        }
        if (!z) {
            if (getUserProxy().isFemale()) {
                this.f23051I.setVisibility(0);
                this.f23051I.setPressed(true);
                this.f23051I.m39346i();
                this.f23053J.setVisibility(4);
                this.f23053J.setPressed(false);
            } else {
                this.f23053J.setVisibility(0);
                this.f23053J.setPressed(true);
                this.f23053J.m39346i();
                this.f23051I.setVisibility(4);
                this.f23051I.setPressed(false);
            }
            this.f23056L.setVisibility(4);
            this.f23055K.setVisibility(4);
            this.f23056L.setPressed(false);
            this.f23055K.setPressed(false);
            this.f23045F.setVisibility(0);
            this.f23047G.setVisibility(0);
            this.f23047G.setPressed(true);
            if (!this.f23047G.m39343f()) {
                VFrame vFrame = this.f23049H;
                vFrame.setScaleX(0.0f);
                vFrame.setScaleY(0.0f);
                this.f23047G.setAnimListener(new C8097a(vFrame, new AnimatorSet()));
            }
            this.f23047G.m39346i();
            return;
        }
        if (f > 0.0f) {
            Math.min(1.0f, f * 2.0f);
            this.f23056L.setVisibility(0);
            this.f23055K.setVisibility(4);
            this.f23056L.setPressed(true);
            this.f23056L.m39346i();
            this.f23055K.m39347j();
            this.f23055K.setPressed(false);
        } else if (f < 0.0f) {
            Math.max(-1.0f, f * 2.0f);
            this.f23056L.setVisibility(4);
            this.f23055K.setVisibility(0);
            this.f23056L.setPressed(false);
            this.f23055K.setPressed(true);
            this.f23055K.m39346i();
            this.f23056L.m39347j();
        } else {
            this.f23056L.setVisibility(4);
            this.f23055K.setVisibility(4);
            this.f23056L.setPressed(false);
            this.f23055K.setPressed(false);
            this.f23056L.m39347j();
            this.f23055K.m39347j();
        }
        this.f23045F.setVisibility(4);
        this.f23047G.m39347j();
        this.f23047G.setPressed(false);
        this.f23051I.m39347j();
        this.f23051I.setPressed(false);
        this.f23053J.m39347j();
        this.f23053J.setPressed(false);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: l0 */
    public void mo38972l0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        m38942L0(i, cardProgressAction, z, f, f2);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m38973l1() {
        return false;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: m */
    public void mo37911m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        mo37855T(user, userInfo, i);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m38974m1() {
        Act act = (Act) bnl0.m105508E(this);
        if (act == null) {
            return;
        }
        uih0.m196223s0().m196259b1(act, this);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m38975n1(Pair pair) {
        m38988z1();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m38976o1(int i, Boolean bool) {
        int iM175859d = 0;
        if (i == 0) {
            if (bool.booleanValue()) {
                iM175859d = (int) ((1.0f - ExpandedCardStyleHelper.m39093o().m39105r()) * qa00.m175859d(50.0f));
            }
        } else if (bool.booleanValue()) {
            iM175859d = qa00.m175859d(50.0f);
        }
        bnl0.m105540X(this.f23042D, iM175859d);
        this.f23041C.setExtTop(iM175859d);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38967g1(this);
        bnl0.m105509E0(this.f23061Q, new View.OnClickListener() { // from class: l.zgk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileExpandedCardRoot.m38963f1(view);
            }
        });
        bnl0.m105537U(this.f23061Q, qa00.m175859d(58.0f));
        this.f23042D.m39023b1(qa00.m175859d(8.0f), qa00.m175859d(10.0f), qa00.m175859d(8.0f), qa00.m175859d(98.0f));
        this.f23042D.m39018X(this);
        this.f23042D.m38928o1(this);
        this.f23042D.setBlockScroll(true);
        bnl0.m105550d0(this.f23060P, qa00.m175859d(8.0f));
        bnl0.m105552e0(this.f23060P, qa00.m175859d(8.0f));
        bnl0.m105554f0(this.f23060P, qa00.m175859d(10.0f));
        bnl0.m105548c0(this.f23060P, qa00.m175859d(30.0f));
        this.f23056L.m39344g(en4.m121426h());
        this.f23055K.m39344g(en4.m121425g());
        this.f23047G.m39344g("https://auto.tancdn.com/v1/raw/95aca228-d59c-4db5-9287-99764d67ddaa14.pdf");
        this.f23053J.m39344g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f23051I.m39344g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f23041C.setBackgroundResource(dbc0.f87047h8);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.dhk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88539a.m38974m1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m38977p1(Integer num) {
        mo38964D0(this, SwipeState.START_MOVING, false);
        mo38964D0(this, SwipeState.START_BACK, false);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: q0 */
    public boolean mo37925q0() {
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m38978q1(String str, Boolean bool) {
        this.f23042D.f23004B = new pf60<>(str, bool);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: r */
    public void mo37928r() {
        this.f23042D.mo37928r();
        m38946Q0();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m38979r1(View view) {
        ExpandedCardStyleHelper.m39093o().m39096g(this.f23050H0, this.f23048G0);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m38980s1(ExpandedCardStyleHelper.C8102b c8102b) {
        if (c8102b.f23160a == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            m38940I0();
            this.f23042D.setBlockScroll(false);
            bnl0.m105540X(this.f23056L, qa00.m175859d(60.0f));
            bnl0.m105540X(this.f23055K, qa00.m175859d(60.0f));
            bnl0.m105524M(this.f23061Q, false);
            return;
        }
        m38939H0();
        this.f23042D.setBlockScroll(true);
        if (c8102b.f23166g) {
            CoreSuggested.UserInfo userInfo = c8102b.f23163d;
            UserProfileExpandedCard userProfileExpandedCard = this.f23042D;
            if (userInfo != null) {
                userProfileExpandedCard.m39029f0(ExpandedCardStyleHelper.f23149h);
            } else {
                userProfileExpandedCard.m39029f0(ExpandedCardStyleHelper.f23149h);
            }
        }
        bnl0.m105540X(this.f23056L, qa00.m175859d(10.0f));
        bnl0.m105540X(this.f23055K, qa00.m175859d(10.0f));
        bnl0.m105524M(this.f23061Q, true);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setCardViewBackgroundResource(@DrawableRes int i) {
        this.f23042D.setBackgroundResource(i);
    }

    @Override // p153l.q7m
    public void setExpandedScrollListener(atl atlVar) {
        this.f23052I0 = false;
        this.f23066V = atlVar;
    }

    @Override // p153l.q7m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC8014d interfaceC8014d) {
    }

    public void setTwoFingerHelper(qmj0 qmj0Var) {
        UserProfileExpandedCard userProfileExpandedCard = this.f23042D;
        if (userProfileExpandedCard != null) {
            userProfileExpandedCard.setTwoFingerHelper(qmj0Var);
        }
    }

    @Override // p153l.q7m
    public /* bridge */ /* synthetic */ void setUndoClickAction(x20 x20Var) {
        super.setUndoClickAction(x20Var);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: t */
    public ViewStub mo37935t() {
        return this.f23063S;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m38981t1(Pair pair) {
        bnl0.m105540X(this.f23042D, (int) (qa00.f156289B * Math.max(0.0f, ((Float) pair.second).floatValue() - ((Float) pair.first).floatValue())));
        this.f23042D.m38931r1(((Float) pair.first).floatValue());
    }

    /* JADX INFO: renamed from: u1 */
    public void m38982u1() {
        if (getRootView().getWidth() <= 0 || getRootView().getHeight() <= 0) {
            return;
        }
        getRootView().measure(dox.m117364b(getRootView().getWidth()), dox.m117364b(getRootView().getHeight()));
        getRootView().layout(getRootView().getLeft(), getRootView().getTop(), getRootView().getLeft() + getRootView().getWidth(), getRootView().getTop() + getRootView().getHeight());
    }

    /* JADX INFO: renamed from: v1 */
    public final void m38983v1(CoreSuggested.UserInfo userInfo, int i) {
        bnl0.m105525M0(this.f23055K, false);
        bnl0.m105525M0(this.f23056L, false);
        bnl0.m105525M0(this.f23045F, false);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        View view = this.f23057M;
        if (cardInfoRenderFrom != cardInfoRenderFrom2) {
            bnl0.m105524M(view, false);
            return;
        }
        bnl0.m105524M(view, false);
        View view2 = this.f23057M;
        if (i != 0) {
            view2.setAlpha(1.0f);
        } else {
            view2.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m38984w1(final int i, final String str) {
        m38943M0((Act) bnl0.m105508E(this), NavigationBarAdmobHelper.INSTANCE.m37154l()).subscribe(psd0.m173596G(new y20() { // from class: l.ehk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94047a.m38977p1((Integer) obj);
            }
        }));
        this.f23042D.f23004B = null;
        m38943M0((Act) bnl0.m105508E(this), CoreModule.m30934Q().mo68440ao(str)).subscribe(psd0.m173597H(new y20() { // from class: l.ghk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104129a.m38978q1(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.hhk0
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
        if (i == 0) {
            this.f23042D.setBlockScroll(!ExpandedCardStyleHelper.m39093o().m39106s());
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ihk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114979a.m38979r1(view);
                }
            });
            m38943M0((Act) bnl0.m105508E(this), ExpandedCardStyleHelper.m39093o().m39112y()).subscribe(psd0.m173596G(new y20() { // from class: l.jhk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120981a.m38980s1((ExpandedCardStyleHelper.C8102b) obj);
                }
            }));
            m38943M0((Act) bnl0.m105508E(this), ExpandedCardStyleHelper.m39093o().m39109v(str)).subscribe(psd0.m173596G(new y20() { // from class: l.khk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126881a.m38981t1((Pair) obj);
                }
            }));
            m38943M0((Act) bnl0.m105508E(this), ExpandedCardStyleHelper.m39093o().m39112y().map(new qcj() { // from class: l.lhk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    ExpandedCardStyleHelper.C8102b c8102b = (ExpandedCardStyleHelper.C8102b) obj;
                    return Pair.create(Boolean.valueOf(c8102b.m39118e()), Boolean.valueOf(c8102b.m39119f()));
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ahk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71372a.m38975n1((Pair) obj);
                }
            }));
            int iM39103p = (int) (qa00.f156289B * ExpandedCardStyleHelper.m39093o().m39103p());
            bnl0.m105540X(this.f23042D, iM39103p);
            this.f23041C.setExtTop(iM39103p);
            m38988z1();
            if (this.f23042D.getScrollH() > 0 && !ExpandedCardStyleHelper.m39093o().m39106s()) {
                this.f23042D.m39029f0(ExpandedCardStyleHelper.f23149h);
            }
        } else {
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bhk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileExpandedCardRoot.m38954W0(view);
                }
            });
            int iM175859d = ExpandedCardStyleHelper.m39093o().m39107t() ? qa00.m175859d(50.0f) : 0;
            bnl0.m105540X(this.f23042D, iM175859d);
            this.f23041C.setExtTop(iM175859d);
            this.f23042D.m38931r1(0.0f);
            if (this.f23042D.getScrollH() > 0) {
                this.f23042D.m39029f0(ExpandedCardStyleHelper.f23149h);
            }
        }
        m38943M0((Act) bnl0.m105508E(this), ExpandedCardStyleHelper.m39093o().m39112y().map(new qcj() { // from class: l.chk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpandedCardStyleHelper.C8102b) obj).m39119f());
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.fhk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99080a.m38976o1(i, (Boolean) obj);
            }
        }));
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: x */
    public void mo38985x(SwipeDirection swipeDirection, CardSwipeOutState cardSwipeOutState, boolean z) {
        if (z && cardSwipeOutState == CardSwipeOutState.PASS && swipeDirection == SwipeDirection.UP) {
            this.f23056L.setVisibility(4);
            this.f23055K.setVisibility(4);
            this.f23045F.setVisibility(0);
            this.f23047G.setVisibility(0);
            this.f23047G.m39346i();
        }
        if (cardSwipeOutState == CardSwipeOutState.PASS) {
            m38968h1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m38986x1() {
        if (this.f23036w && gra.m131606N3() && this.f23054J0 == 0) {
            mo38964D0(this, SwipeState.START_MOVING, false);
            mo38964D0(this, SwipeState.START_BACK, false);
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: y */
    public boolean mo37950y() {
        return this.f23042D.mo37950y();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m38987y1(View view, SwipeState swipeState, boolean z) {
        if (gra.m131654Z2() && CoreModule.f18264c.f20446z2.m31253r3() && swipeState == SwipeState.FINISH_OUT && getTranslationX() > 0.0f) {
            float rotation = ((float) (((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * 1.0f;
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            double width = (getWidth() / 2) - pivotX;
            double d = rotation;
            double height = (getHeight() / 2) - pivotY;
            CoreModule.f18264c.f20446z2.m31232A3(this.f23050H0, (((int) (((Math.cos(d) * width) - (Math.sin(d) * height)) + ((double) pivotX))) - qa00.m175859d(30.0f)) + getTranslationX(), (((int) (((width * Math.sin(d)) + (Math.cos(d) * height)) + ((double) pivotY))) - qa00.m175859d(30.0f)) + getTranslationY());
        }
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: z */
    public boolean mo37953z() {
        return this.f23042D.mo37953z();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m38988z1() {
        int iM39117d = ExpandedCardStyleHelper.m39093o().m39102n().m39117d();
        int iM39116c = ExpandedCardStyleHelper.m39093o().m39102n().m39116c();
        bnl0.m105540X(this.f23056L, iM39117d);
        bnl0.m105540X(this.f23055K, iM39117d);
        bnl0.m105540X(this.f23045F, iM39117d);
        bnl0.m105537U(this.f23045F, iM39116c);
        bnl0.m105537U(this.f23056L, iM39116c);
        bnl0.m105537U(this.f23055K, qa00.m175859d(50.0f));
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23068k0 = null;
        this.f23048G0 = null;
        this.f23052I0 = false;
        this.f23054J0 = -1;
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23068k0 = null;
        this.f23048G0 = null;
        this.f23052I0 = false;
        this.f23054J0 = -1;
    }

    @Override // p153l.q7m
    public void setUsHomeCardAnimHelper(fqj0 fqj0Var) {
    }
}
