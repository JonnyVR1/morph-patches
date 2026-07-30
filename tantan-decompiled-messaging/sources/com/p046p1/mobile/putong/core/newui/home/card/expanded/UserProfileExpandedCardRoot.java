package com.p046p1.mobile.putong.core.newui.home.card.expanded;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardClipBgView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedOpAnimView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedSuperlikeSendView;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;
import p149l.a5m;
import p149l.c4g0;
import p149l.chj0;
import p149l.cmf;
import p149l.d30;
import p149l.e30;
import p149l.e5m;
import p149l.ffx;
import p149l.fm4;
import p149l.g8k0;
import p149l.j760;
import p149l.jj4;
import p149l.mah0;
import p149l.mdj0;
import p149l.mkd0;
import p149l.nql;
import p149l.oql;
import p149l.qm4;
import p149l.sb90;
import p149l.t100;
import p149l.upa;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zo0;

/* JADX INFO: loaded from: classes11.dex */
public class UserProfileExpandedCardRoot extends UserProfileExpandedCardBaseRoot implements e5m, qm4, nql {

    /* JADX INFO: renamed from: C */
    public ExpandedCardClipBgView f22299C;

    /* JADX INFO: renamed from: D */
    public UserProfileExpandedCard f22300D;

    /* JADX INFO: renamed from: E */
    public VText f22301E;

    /* JADX INFO: renamed from: E0 */
    public Animator f22302E0;

    /* JADX INFO: renamed from: F */
    public VFrame f22303F;

    /* JADX INFO: renamed from: F0 */
    public c4g0 f22304F0;

    /* JADX INFO: renamed from: G */
    public ExpandedOpAnimView f22305G;

    /* JADX INFO: renamed from: G0 */
    public CoreSuggested.UserInfo f22306G0;

    /* JADX INFO: renamed from: H */
    public VFrame f22307H;

    /* JADX INFO: renamed from: H0 */
    public User f22308H0;

    /* JADX INFO: renamed from: I */
    public ExpandedOpAnimView f22309I;

    /* JADX INFO: renamed from: I0 */
    public boolean f22310I0;

    /* JADX INFO: renamed from: J */
    public ExpandedOpAnimView f22311J;

    /* JADX INFO: renamed from: J0 */
    public int f22312J0;

    /* JADX INFO: renamed from: K */
    public ExpandedOpAnimView f22313K;

    /* JADX INFO: renamed from: L */
    public ExpandedOpAnimView f22314L;

    /* JADX INFO: renamed from: M */
    public View f22315M;

    /* JADX INFO: renamed from: N */
    public SimpleDraweeView f22316N;

    /* JADX INFO: renamed from: O */
    public ViewStub f22317O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f22318P;

    /* JADX INFO: renamed from: Q */
    public View f22319Q;

    /* JADX INFO: renamed from: R */
    public ViewStub f22320R;

    /* JADX INFO: renamed from: S */
    public ViewStub f22321S;

    /* JADX INFO: renamed from: T */
    public int f22322T;

    /* JADX INFO: renamed from: U */
    public String f22323U;

    /* JADX INFO: renamed from: V */
    public oql f22324V;

    /* JADX INFO: renamed from: W */
    public int f22325W;

    /* JADX INFO: renamed from: k0 */
    public ExpandedSuperlikeSendView f22326k0;

    /* JADX INFO: renamed from: p0 */
    public SwipeGuideRightView f22327p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a */
    public class C7946a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f22328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorSet f22329b;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(C7946a.this.f22328a, "scaleX", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(C7946a.this.f22328a, "scaleY", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat2.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
                C7946a.this.f22329b.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                C7946a.this.f22329b.start();
            }
        }

        public C7946a(View view, AnimatorSet animatorSet) {
            this.f22328a = view;
            this.f22329b = animatorSet;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            this.f22329b.cancel();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            UserProfileExpandedCardRoot.this.f22305G.postDelayed(new a(), 167L);
        }
    }

    public UserProfileExpandedCardRoot(@NonNull Context context) {
        super(context);
        this.f22326k0 = null;
        this.f22306G0 = null;
        this.f22310I0 = false;
        this.f22312J0 = -1;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m37951W0(View view) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m37960f1(View view) {
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: A0 */
    public void mo37922A0(View view) {
        super.mo37922A0(view);
        this.f22292u = 1.0f;
        this.f22310I0 = true;
        m37945S0();
        invalidate();
        this.f22300D.mo37922A0(view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot, p149l.oql
    /* JADX INFO: renamed from: B */
    public void mo37396B(int i, int i2, int i3, String str, int i4) {
        super.mo37396B(i, i2, i3, str, i4);
        this.f22325W = i;
        if (NullChecker.m81303a(this.f22324V) && !this.f22310I0) {
            this.f22324V.mo37396B(i, i2 + this.f22300D.getFixPaddingBottom(), i3, str, i4);
        }
        if (this.f22294w) {
            this.f22299C.m38229b(i, i4 + ExpandedCardStyleHelper.m38090o().m38101q());
        }
        xdl0.m208410x0(getContext());
        xdl0.m208331F0();
        t100.m186890d(98.0f);
        NavigationBarAdmobHelper.INSTANCE.m36150k();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo36803B0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (mah0.m153720m0()) {
            if (mah0.m153738y0(userInfo.f19472id)) {
                mah0.m153729s0().m153772j1(viewTreeObserverOnGlobalLayoutListenerC7866b, this, userInfo, i);
                return true;
            }
            mkd0.m154992z(this.f22304F0);
            if (NullChecker.m81303a(this.f22302E0) && this.f22302E0.isRunning()) {
                this.f22302E0.end();
                getRootView().setRotation(0.0f);
                getRootView().setTranslationX(0.0f);
                getRootView().setPivotX(getWidth() / 2);
                getRootView().setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f22327p0;
            if (NullChecker.m81303a(swipeGuideRightView) && xdl0.m208349O0(swipeGuideRightView)) {
                xdl0.m208344M(swipeGuideRightView, false);
            }
            mah0.m153729s0().m153768f1();
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37236U5(false);
        }
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: C */
    public void mo36806C() {
        this.f22300D.mo36806C();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo36809D(String str) {
        return this.f22300D.mo36809D(str);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: D0 */
    public void mo37961D0(View view, SwipeState swipeState, boolean z) {
        if (!this.f22294w) {
            if (swipeState == SwipeState.START_MOVING) {
                m37938J0(true);
                return;
            } else {
                if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
                    m37938J0(false);
                    return;
                }
                return;
            }
        }
        if (swipeState == SwipeState.START_TOUCH) {
            this.f22270A = 0.0f;
            return;
        }
        if (swipeState == SwipeState.START_MOVING) {
            if (this.f22312J0 == 0 && ExpandedCardStyleHelper.m38090o().m38103s()) {
                this.f22296y.m107624i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                return;
            } else {
                this.f22296y.m107624i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                return;
            }
        }
        if (swipeState == SwipeState.START_BACK) {
            if (this.f22312J0 == 0 && ExpandedCardStyleHelper.m38090o().m38103s()) {
                this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
                return;
            } else {
                this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_CARD, true);
                return;
            }
        }
        if (swipeState == SwipeState.FINISH_OUT) {
            m37984y1(view, swipeState, z);
            this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else if (swipeState == SwipeState.FINISH_BACK) {
            if (this.f22312J0 == 0 && ExpandedCardStyleHelper.m38090o().m38103s()) {
                this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
            } else {
                this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_CARD, true);
            }
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: F */
    public boolean mo37916F() {
        return this.f22300D.mo37916F();
    }

    @Override // p149l.e5m
    /* JADX INFO: renamed from: H */
    public View mo37923H() {
        return this.f22300D.mo37923H();
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: K */
    public void mo37962K(View view) {
        super.mo37962K(view);
        this.f22310I0 = false;
        this.f22292u = 0.0f;
        m37945S0();
        invalidate();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: R */
    public boolean mo37917R() {
        return this.f22300D.mo37917R();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: T */
    public void mo36852T(User user, CoreSuggested.UserInfo userInfo, int i) {
        m37980v1(userInfo, i);
        this.f22312J0 = i;
        if (TextUtils.equals(this.f22323U, user.f56011id)) {
            this.f22322T++;
        } else {
            this.f22322T = 1;
        }
        m37944R0(i, user);
        this.f22323U = user.f56011id;
        this.f22306G0 = userInfo;
        this.f22308H0 = user;
        this.f22300D.f22356s = m37966i1(user, userInfo, i);
        this.f22301E.setText("rc: " + this.f22322T);
        this.f22300D.mo36852T(user, userInfo, i);
        CoreSuggested.UserInfo userInfo2 = this.f22306G0;
        if (userInfo2.renderFrom == CardInfoRenderFrom.CARD) {
            m37981w1(i, userInfo2.f19472id);
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: U */
    public void mo36854U() {
        this.f22300D.mo36854U();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo36864Y() {
        if (this.f22300D.getGuidePictureView() != null) {
            return this.f22300D.getGuidePictureView();
        }
        return null;
    }

    @Override // p149l.e5m
    /* JADX INFO: renamed from: c */
    public boolean mo37924c() {
        return this.f22300D.mo37924c();
    }

    @Override // p149l.oql
    /* JADX INFO: renamed from: c0 */
    public void mo37397c0(int i, int i2, int i3, int i4, View view) {
        super.mo37397c0(i, i2, i3, i4, view);
        if (!NullChecker.m81303a(this.f22324V) || this.f22310I0) {
            return;
        }
        this.f22324V.mo37397c0(i, i2, i3, i4, view);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m37968k1(z, f3, cardProgressAction);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo36883e0() {
        return this.f22300D.mo36883e0();
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: f0 */
    public void mo37963f0(int i, float f, float f2, boolean z, String str) {
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
                setAlpha(Math.min(1.0f, Math.max(zo0.f204044H, 1.2f * f)));
            }
        }
        if (this.f22312J0 != 0) {
            cmf cmfVar = this.f22296y;
            cmfVar.m107617b(f, ExpandedCardClipStatus.EXPANDED_CARD, cmfVar.m107621f(ExpandedCardClipStatus.SWIPE_CLIP), 1.0f, "swipe other size");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m37964g1(View view) {
        g8k0.m124757a(this, view);
    }

    @Override // p149l.a5m
    public jj4 getCardData() {
        return this.f22300D.getCardData();
    }

    @Override // p149l.mol
    public jj4 getCardDataProxy() {
        return this.f22300D.getCardDataProxy();
    }

    @Override // p149l.a5m, p149l.gol
    public View getCardView() {
        return this.f22300D;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public BaseExpandedView getCardViewInner() {
        return this.f22300D;
    }

    public View getCardViewProxy() {
        return this.f22300D.getCardViewProxy();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public SimpleDraweeView getClipAvatarView() {
        return this.f22316N;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot
    public UserProfileExpandedCard getExpandedCard() {
        return this.f22300D;
    }

    @Override // p149l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return this.f22300D.getMomentInfoProxy();
    }

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    @Override // p149l.mol
    public int getShowPictureIndexProxy() {
        return this.f22300D.getShowPictureIndexProxy();
    }

    @Override // p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f22300D.getUserInfoProxy();
    }

    @Override // p149l.mol
    public User getUserProxy() {
        return this.f22300D.getUserProxy();
    }

    @Override // p149l.a5m
    @Deprecated
    public /* bridge */ /* synthetic */ VirtualCard getVirtualCard() {
        return super.getVirtualCard();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m37965h1() {
        this.f22300D.m37927q1();
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m37966i1(User user, CoreSuggested.UserInfo userInfo, int i) {
        return i == 0 && user != null && userInfo != null && userInfo.renderFrom == CardInfoRenderFrom.CARD && sb90.m183206b(user, this.f22306G0);
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo36898j0(SwipeDirection swipeDirection) {
        this.f22300D.mo36898j0(swipeDirection);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m37967j1() {
        if (upa.m194815s2()) {
            setOnClickListener(null);
            ExpandedOpAnimView expandedOpAnimView = this.f22305G;
            if (expandedOpAnimView != null) {
                expandedOpAnimView.m38344j();
                this.f22305G.setAnimListener(null);
                this.f22305G.removeCallbacks(null);
            }
            ExpandedOpAnimView expandedOpAnimView2 = this.f22314L;
            if (expandedOpAnimView2 != null) {
                expandedOpAnimView2.m38344j();
                this.f22314L.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView3 = this.f22313K;
            if (expandedOpAnimView3 != null) {
                expandedOpAnimView3.m38344j();
                this.f22313K.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView4 = this.f22311J;
            if (expandedOpAnimView4 != null) {
                expandedOpAnimView4.m38344j();
                this.f22311J.setAnimListener(null);
            }
            ExpandedOpAnimView expandedOpAnimView5 = this.f22309I;
            if (expandedOpAnimView5 != null) {
                expandedOpAnimView5.m38344j();
                this.f22309I.setAnimListener(null);
            }
        }
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: k */
    public void mo36901k(boolean z) {
        this.f22324V = null;
        this.f22300D.mo36901k(z);
        this.f22310I0 = false;
        m37943Q0();
        if (!z) {
            m37935G0();
            m37967j1();
        }
        if (NullChecker.m81303a(this.f22326k0)) {
            xdl0.m208344M(this.f22326k0, false);
            this.f22326k0.m38346b();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m37968k1(boolean z, float f, CardProgressAction cardProgressAction) {
        CoreSuggested.UserInfo userInfo = this.f22306G0;
        if (userInfo == null || userInfo.isUndo || mah0.m153738y0(userInfo.f19472id)) {
            return;
        }
        if (!z) {
            if (getUserProxy().isFemale()) {
                this.f22309I.setVisibility(0);
                this.f22309I.setPressed(true);
                this.f22309I.m38343i();
                this.f22311J.setVisibility(4);
                this.f22311J.setPressed(false);
            } else {
                this.f22311J.setVisibility(0);
                this.f22311J.setPressed(true);
                this.f22311J.m38343i();
                this.f22309I.setVisibility(4);
                this.f22309I.setPressed(false);
            }
            this.f22314L.setVisibility(4);
            this.f22313K.setVisibility(4);
            this.f22314L.setPressed(false);
            this.f22313K.setPressed(false);
            this.f22303F.setVisibility(0);
            this.f22305G.setVisibility(0);
            this.f22305G.setPressed(true);
            if (!this.f22305G.m38340f()) {
                VFrame vFrame = this.f22307H;
                vFrame.setScaleX(0.0f);
                vFrame.setScaleY(0.0f);
                this.f22305G.setAnimListener(new C7946a(vFrame, new AnimatorSet()));
            }
            this.f22305G.m38343i();
            return;
        }
        if (f > 0.0f) {
            Math.min(1.0f, f * 2.0f);
            this.f22314L.setVisibility(0);
            this.f22313K.setVisibility(4);
            this.f22314L.setPressed(true);
            this.f22314L.m38343i();
            this.f22313K.m38344j();
            this.f22313K.setPressed(false);
        } else if (f < 0.0f) {
            Math.max(-1.0f, f * 2.0f);
            this.f22314L.setVisibility(4);
            this.f22313K.setVisibility(0);
            this.f22314L.setPressed(false);
            this.f22313K.setPressed(true);
            this.f22313K.m38343i();
            this.f22314L.m38344j();
        } else {
            this.f22314L.setVisibility(4);
            this.f22313K.setVisibility(4);
            this.f22314L.setPressed(false);
            this.f22313K.setPressed(false);
            this.f22314L.m38344j();
            this.f22313K.m38344j();
        }
        this.f22303F.setVisibility(4);
        this.f22305G.m38344j();
        this.f22305G.setPressed(false);
        this.f22309I.m38344j();
        this.f22309I.setPressed(false);
        this.f22311J.m38344j();
        this.f22311J.setPressed(false);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: l0 */
    public void mo37969l0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        m37939L0(i, cardProgressAction, z, f, f2);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m37970l1() {
        return false;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: m */
    public void mo36908m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        mo36852T(user, userInfo, i);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m37971m1() {
        Act act = (Act) xdl0.m208328E(this);
        if (act == null) {
            return;
        }
        mah0.m153729s0().m153765b1(act, this);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m37972n1(Pair pair) {
        m37985z1();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m37973o1(int i, Boolean bool) {
        int iM186890d = 0;
        if (i == 0) {
            if (bool.booleanValue()) {
                iM186890d = (int) ((1.0f - ExpandedCardStyleHelper.m38090o().m38102r()) * t100.m186890d(50.0f));
            }
        } else if (bool.booleanValue()) {
            iM186890d = t100.m186890d(50.0f);
        }
        xdl0.m208360X(this.f22300D, iM186890d);
        this.f22299C.setExtTop(iM186890d);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37964g1(this);
        xdl0.m208329E0(this.f22319Q, new View.OnClickListener() { // from class: l.t7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileExpandedCardRoot.m37960f1(view);
            }
        });
        xdl0.m208357U(this.f22319Q, t100.m186890d(58.0f));
        this.f22300D.m38020b1(t100.m186890d(8.0f), t100.m186890d(10.0f), t100.m186890d(8.0f), t100.m186890d(98.0f));
        this.f22300D.m38015X(this);
        this.f22300D.m37925o1(this);
        this.f22300D.setBlockScroll(true);
        xdl0.m208370d0(this.f22318P, t100.m186890d(8.0f));
        xdl0.m208372e0(this.f22318P, t100.m186890d(8.0f));
        xdl0.m208374f0(this.f22318P, t100.m186890d(10.0f));
        xdl0.m208368c0(this.f22318P, t100.m186890d(30.0f));
        this.f22314L.m38341g(fm4.m122151h());
        this.f22313K.m38341g(fm4.m122150g());
        this.f22305G.m38341g("https://auto.tancdn.com/v1/raw/95aca228-d59c-4db5-9287-99764d67ddaa14.pdf");
        this.f22311J.m38341g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f22309I.m38341g("https://fe-static.tancdn.com/v1/raw/834a7aa4-a1b3-402f-b2f3-a78ab30f50c0.svga");
        this.f22299C.setBackgroundResource(x2c0.f190165g8);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.x7k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191367a.m37971m1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m37974p1(Integer num) {
        mo37961D0(this, SwipeState.START_MOVING, false);
        mo37961D0(this, SwipeState.START_BACK, false);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo36922q0() {
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m37975q1(String str, Boolean bool) {
        this.f22300D.f22262B = new j760<>(str, bool);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: r */
    public void mo36925r() {
        this.f22300D.mo36925r();
        m37943Q0();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m37976r1(View view) {
        ExpandedCardStyleHelper.m38090o().m38093g(this.f22308H0, this.f22306G0);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m37977s1(ExpandedCardStyleHelper.C7951b c7951b) {
        if (c7951b.f22418a == ExpandedCardStyleHelper.ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            m37937I0();
            this.f22300D.setBlockScroll(false);
            xdl0.m208360X(this.f22314L, t100.m186890d(60.0f));
            xdl0.m208360X(this.f22313K, t100.m186890d(60.0f));
            xdl0.m208344M(this.f22319Q, false);
            return;
        }
        m37936H0();
        this.f22300D.setBlockScroll(true);
        if (c7951b.f22424g) {
            CoreSuggested.UserInfo userInfo = c7951b.f22421d;
            UserProfileExpandedCard userProfileExpandedCard = this.f22300D;
            if (userInfo != null) {
                userProfileExpandedCard.m38026f0(ExpandedCardStyleHelper.f22407h);
            } else {
                userProfileExpandedCard.m38026f0(ExpandedCardStyleHelper.f22407h);
            }
        }
        xdl0.m208360X(this.f22314L, t100.m186890d(10.0f));
        xdl0.m208360X(this.f22313K, t100.m186890d(10.0f));
        xdl0.m208344M(this.f22319Q, true);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setCardViewBackgroundResource(@DrawableRes int i) {
        this.f22300D.setBackgroundResource(i);
    }

    @Override // p149l.a5m
    public void setExpandedScrollListener(oql oqlVar) {
        this.f22310I0 = false;
        this.f22324V = oqlVar;
    }

    @Override // p149l.a5m
    public void setPageHelper(@NonNull NewNewProfileCard.InterfaceC7863d interfaceC7863d) {
    }

    public void setTwoFingerHelper(mdj0 mdj0Var) {
        UserProfileExpandedCard userProfileExpandedCard = this.f22300D;
        if (userProfileExpandedCard != null) {
            userProfileExpandedCard.setTwoFingerHelper(mdj0Var);
        }
    }

    @Override // p149l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo36932t() {
        return this.f22321S;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m37978t1(Pair pair) {
        xdl0.m208360X(this.f22300D, (int) (t100.f167227B * Math.max(0.0f, ((Float) pair.second).floatValue() - ((Float) pair.first).floatValue())));
        this.f22300D.m37928r1(((Float) pair.first).floatValue());
    }

    /* JADX INFO: renamed from: u1 */
    public void m37979u1() {
        if (getRootView().getWidth() <= 0 || getRootView().getHeight() <= 0) {
            return;
        }
        getRootView().measure(ffx.m121199b(getRootView().getWidth()), ffx.m121199b(getRootView().getHeight()));
        getRootView().layout(getRootView().getLeft(), getRootView().getTop(), getRootView().getLeft() + getRootView().getWidth(), getRootView().getTop() + getRootView().getHeight());
    }

    /* JADX INFO: renamed from: v1 */
    public final void m37980v1(CoreSuggested.UserInfo userInfo, int i) {
        xdl0.m208345M0(this.f22313K, false);
        xdl0.m208345M0(this.f22314L, false);
        xdl0.m208345M0(this.f22303F, false);
        CardInfoRenderFrom cardInfoRenderFrom = userInfo.renderFrom;
        CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
        View view = this.f22315M;
        if (cardInfoRenderFrom != cardInfoRenderFrom2) {
            xdl0.m208344M(view, false);
            return;
        }
        xdl0.m208344M(view, false);
        View view2 = this.f22315M;
        if (i != 0) {
            view2.setAlpha(1.0f);
        } else {
            view2.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m37981w1(final int i, final String str) {
        m37940M0((Act) xdl0.m208328E(this), NavigationBarAdmobHelper.INSTANCE.m36151l()).subscribe(mkd0.m154955G(new e30() { // from class: l.y7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196713a.m37974p1((Integer) obj);
            }
        }));
        this.f22300D.f22262B = null;
        m37940M0((Act) xdl0.m208328E(this), CoreModule.m29936Q().mo67257ao(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.a8k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68051a.m37975q1(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.b8k0
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
        if (i == 0) {
            this.f22300D.setBlockScroll(!ExpandedCardStyleHelper.m38090o().m38103s());
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.c8k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79772a.m37976r1(view);
                }
            });
            m37940M0((Act) xdl0.m208328E(this), ExpandedCardStyleHelper.m38090o().m38109y()).subscribe(mkd0.m154955G(new e30() { // from class: l.d8k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84875a.m37977s1((ExpandedCardStyleHelper.C7951b) obj);
                }
            }));
            m37940M0((Act) xdl0.m208328E(this), ExpandedCardStyleHelper.m38090o().m38106v(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.e8k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89833a.m37978t1((Pair) obj);
                }
            }));
            m37940M0((Act) xdl0.m208328E(this), ExpandedCardStyleHelper.m38090o().m38109y().map(new w9j() { // from class: l.f8k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    ExpandedCardStyleHelper.C7951b c7951b = (ExpandedCardStyleHelper.C7951b) obj;
                    return Pair.create(Boolean.valueOf(c7951b.m38115e()), Boolean.valueOf(c7951b.m38116f()));
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.u7k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175022a.m37972n1((Pair) obj);
                }
            }));
            int iM38100p = (int) (t100.f167227B * ExpandedCardStyleHelper.m38090o().m38100p());
            xdl0.m208360X(this.f22300D, iM38100p);
            this.f22299C.setExtTop(iM38100p);
            m37985z1();
            if (this.f22300D.getScrollH() > 0 && !ExpandedCardStyleHelper.m38090o().m38103s()) {
                this.f22300D.m38026f0(ExpandedCardStyleHelper.f22407h);
            }
        } else {
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.v7k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserProfileExpandedCardRoot.m37951W0(view);
                }
            });
            int iM186890d = ExpandedCardStyleHelper.m38090o().m38104t() ? t100.m186890d(50.0f) : 0;
            xdl0.m208360X(this.f22300D, iM186890d);
            this.f22299C.setExtTop(iM186890d);
            this.f22300D.m37928r1(0.0f);
            if (this.f22300D.getScrollH() > 0) {
                this.f22300D.m38026f0(ExpandedCardStyleHelper.f22407h);
            }
        }
        m37940M0((Act) xdl0.m208328E(this), ExpandedCardStyleHelper.m38090o().m38109y().map(new w9j() { // from class: l.w7k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpandedCardStyleHelper.C7951b) obj).m38116f());
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.z7k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202038a.m37973o1(i, (Boolean) obj);
            }
        }));
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: x */
    public void mo37982x(SwipeDirection swipeDirection, CardSwipeOutState cardSwipeOutState, boolean z) {
        if (z && cardSwipeOutState == CardSwipeOutState.PASS && swipeDirection == SwipeDirection.UP) {
            this.f22314L.setVisibility(4);
            this.f22313K.setVisibility(4);
            this.f22303F.setVisibility(0);
            this.f22305G.setVisibility(0);
            this.f22305G.m38343i();
        }
        if (cardSwipeOutState == CardSwipeOutState.PASS) {
            m37965h1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m37983x1() {
        if (this.f22294w && upa.m194675N3() && this.f22312J0 == 0) {
            mo37961D0(this, SwipeState.START_MOVING, false);
            mo37961D0(this, SwipeState.START_BACK, false);
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo36947y() {
        return this.f22300D.mo36947y();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m37984y1(View view, SwipeState swipeState, boolean z) {
        if (upa.m194723Z2() && CoreModule.f17545c.f19704z2.m30255r3() && swipeState == SwipeState.FINISH_OUT && getTranslationX() > 0.0f) {
            float rotation = ((float) (((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * 1.0f;
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            double width = (getWidth() / 2) - pivotX;
            double d = rotation;
            double height = (getHeight() / 2) - pivotY;
            CoreModule.f17545c.f19704z2.m30234A3(this.f22308H0, (((int) (((Math.cos(d) * width) - (Math.sin(d) * height)) + ((double) pivotX))) - t100.m186890d(30.0f)) + getTranslationX(), (((int) (((width * Math.sin(d)) + (Math.cos(d) * height)) + ((double) pivotY))) - t100.m186890d(30.0f)) + getTranslationY());
        }
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo36950z() {
        return this.f22300D.mo36950z();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m37985z1() {
        int iM38114d = ExpandedCardStyleHelper.m38090o().m38099n().m38114d();
        int iM38113c = ExpandedCardStyleHelper.m38090o().m38099n().m38113c();
        xdl0.m208360X(this.f22314L, iM38114d);
        xdl0.m208360X(this.f22313K, iM38114d);
        xdl0.m208360X(this.f22303F, iM38114d);
        xdl0.m208357U(this.f22303F, iM38113c);
        xdl0.m208357U(this.f22314L, iM38113c);
        xdl0.m208357U(this.f22313K, t100.m186890d(50.0f));
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22326k0 = null;
        this.f22306G0 = null;
        this.f22310I0 = false;
        this.f22312J0 = -1;
    }

    public UserProfileExpandedCardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22326k0 = null;
        this.f22306G0 = null;
        this.f22310I0 = false;
        this.f22312J0 = -1;
    }

    @Override // p149l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
    }
}
