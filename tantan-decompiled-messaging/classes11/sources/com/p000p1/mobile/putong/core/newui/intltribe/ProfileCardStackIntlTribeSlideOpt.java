package com.p000p1.mobile.putong.core.newui.intltribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.qol0;
import p009l.a5m;
import p009l.aol;
import p009l.ax2;
import p009l.chj0;
import p009l.ehj0;
import p009l.em4;
import p009l.ez30;
import p009l.id50;
import p009l.jj4;
import p009l.mol;
import p009l.pip;
import p009l.pol0;
import p009l.qm4;
import p009l.rol0;
import p009l.vdp;
import p009l.wsf0;
import p009l.zh90;
import p009l.znl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileCardStackIntlTribeSlideOpt extends BifrostLayout implements wsf0<View, ez30>, qm4 {

    /* JADX INFO: renamed from: f */
    public zh90 f3126f;

    /* JADX INFO: renamed from: g */
    public ax2 f3127g;

    /* JADX INFO: renamed from: h */
    public id50 f3128h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.c f3129i;

    /* JADX INFO: renamed from: j */
    public qol0 f3130j;

    /* JADX INFO: renamed from: k */
    public e30<mol> f3131k;

    /* JADX INFO: renamed from: l */
    public chj0 f3132l;

    /* JADX INFO: renamed from: m */
    public pip f3133m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$a */
    public class C0244a implements em4 {
        public C0244a() {
        }

        @Override // p009l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo2819a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C0246c.f3136a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo13174a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.a(ProfileCardStackIntlTribeSlideOpt.this.f3128h)) {
                VirtualCard virtualCard = pol0Var.f18800a;
                if (virtualCard instanceof a5m) {
                    try {
                        onCardSwipeResultMo13174a = ProfileCardStackIntlTribeSlideOpt.this.f3128h.mo13174a((a5m) virtualCard, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.c(new RuntimeException("划卡异常：" + e.toString() + "," + ProfileCardStackIntlTribeSlideOpt.this.f3127g.mo12313b(), e));
                    }
                } else if (virtualCard instanceof VirtualCard) {
                    Object obj = pol0Var.f18802c;
                    if (obj instanceof CoreSuggested.UserInfo) {
                        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                        if (!userInfo.isVirtualCard()) {
                            CrashHelper.c(new RuntimeException("错误的卡片类型：" + userInfo.id));
                        }
                    }
                    try {
                        onCardSwipeResultMo13174a = ProfileCardStackIntlTribeSlideOpt.this.f3128h.mo13174a(new rol0((CoreSuggested.UserInfo) pol0Var.f18802c, virtualCard), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo13174a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.c(new RuntimeException("划卡异常：" + e2.toString() + "," + ProfileCardStackIntlTribeSlideOpt.this.f3127g.mo12313b(), e2));
                    }
                }
                int i2 = C0246c.f3137b[onCardSwipeResultMo13174a.ordinal()];
                if (i2 == 1) {
                    return CardSwipeOutState.BACK;
                }
                if (i2 == 2) {
                    return CardSwipeOutState.PASS;
                }
                if (i2 == 3) {
                    return CardSwipeOutState.STAY;
                }
            }
            return CardSwipeOutState.BACK;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$b */
    public class ViewOnClickListenerC0245b implements View.OnClickListener {
        public ViewOnClickListenerC0245b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(ProfileCardStackIntlTribeSlideOpt.this.f3131k) && (view instanceof mol)) {
                ProfileCardStackIntlTribeSlideOpt.this.f3131k.call((mol) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$c */
    public static /* synthetic */ class C0246c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3136a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3137b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f3138c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f3138c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3138c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3138c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f3137b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3137b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3137b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f3136a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3136a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3136a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, qol0 qol0Var, pip pipVar) {
        super(context);
        this.f3131k = null;
        this.f3130j = qol0Var;
        this.f3133m = pipVar;
        m3597B();
    }

    /* JADX INFO: renamed from: B */
    private void m3597B() {
        vdp vdpVar = new vdp(getContext());
        this.f3127g = vdpVar;
        vdpVar.m26024l0(this);
        this.f3127g.m26022k0(new C0244a());
    }

    /* JADX INFO: renamed from: C */
    private void m3598C(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.v() && NullChecker.a(this.f3132l)) {
            this.f3132l.m12563j(mo2805d(), swipeDirection);
            return;
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0246c.f3138c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f3127g.mo11678A0(cardOperation, z);
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: A */
    public void mo2797A(SwipeDirection swipeDirection) {
        m3598C(swipeDirection, false);
    }

    @Override // p009l.nti0
    /* JADX INFO: renamed from: a */
    public void mo2802a() {
        if (NullChecker.a(mo2805d()) && (mo2805d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) mo2805d()).mo829a();
        }
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: c */
    public boolean mo2804c(boolean z) {
        return this.f2102b;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: d */
    public View mo2805d() {
        pol0 pol0VarM25991G = this.f3127g.m25991G();
        if (NullChecker.a(pol0VarM25991G)) {
            return pol0VarM25991G.f18800a;
        }
        this.f3127g.m26005Y("get top ");
        return null;
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.c cVar = this.f3129i;
        if (cVar != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            cVar.b(z, f3, cardProgressAction);
        }
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: e */
    public void mo2806e(float f) {
        setAlpha(f);
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: g */
    public void mo2807g(id50 id50Var) {
        this.f3128h = id50Var;
    }

    @Override // p009l.wsf0
    public int getMeasuredHeightProxy() {
        return getMeasuredHeight();
    }

    @Override // p009l.wsf0
    public int getMeasuredWidthProxy() {
        return getMeasuredWidth();
    }

    public View getRenderView() {
        return this;
    }

    @Override // p009l.wsf0
    public chj0 getUsHomeCardAnimHelper() {
        return null;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: i */
    public void mo2808i(e30<mol> e30Var) {
        this.f3131k = e30Var;
    }

    @Override // p009l.wsf0
    @Nullable
    /* JADX INFO: renamed from: j */
    public CoreSuggested.UserInfo mo2809j() {
        KeyEvent.Callback callbackMo2805d = mo2805d();
        if (callbackMo2805d instanceof aol) {
            return ((aol) callbackMo2805d).getUserInfoProxy();
        }
        return null;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: k */
    public void mo2810k(View view, SwipeDirection swipeDirection, float f, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0246c.f3138c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f3127g.m25030B0(view, cardOperation, f, z);
    }

    @Override // p009l.wsf0
    @Nullable
    /* JADX INFO: renamed from: l */
    public jj4 mo2811l() {
        pol0 pol0VarM26038w = this.f3127g.m26038w();
        KeyEvent.Callback callback = NullChecker.a(pol0VarM26038w) ? pol0VarM26038w.f18800a : null;
        if (callback instanceof znl) {
            return ((znl) callback).getCardData();
        }
        return null;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: m */
    public boolean mo2812m() {
        return mo2805d() instanceof VirtualCard;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: n */
    public void mo2813n() {
        if (mo2812m()) {
            VirtualCard virtualCardMo2805d = mo2805d();
            virtualCardMo2805d.H0(virtualCardMo2805d.getContentView());
        }
    }

    @Override // p009l.wsf0
    @Nullable
    /* JADX INFO: renamed from: o */
    public jj4 mo2814o() {
        KeyEvent.Callback callbackMo2805d = mo2805d();
        if (callbackMo2805d instanceof znl) {
            return ((znl) callbackMo2805d).getCardData();
        }
        return null;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: p */
    public void mo2815p(VSwipeStack.c cVar) {
        this.f3129i = cVar;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: r */
    public void mo2816r(SwipeDirection swipeDirection, boolean z) {
        m3598C(swipeDirection, true);
    }

    @Override // p009l.wsf0
    public void setAdapter(ez30 ez30Var) {
        zh90 zh90Var = new zh90(this, ez30Var, this.f3130j, this.f3133m);
        this.f3126f = zh90Var;
        zh90Var.m25783z(new ViewOnClickListenerC0245b());
        this.f3127g.m26018i0(this.f3126f);
        setRenderManager(this.f3127g);
    }

    @Override // p009l.wsf0
    public void setAllowUpSwipe(boolean z) {
        this.f2102b = z;
    }

    @Override // p009l.nti0
    public /* bridge */ /* synthetic */ void setSuperLikeBtnVisible(boolean z) {
        super.setSuperLikeBtnVisible(z);
    }

    @Override // p009l.wsf0
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
        this.f3132l = chj0Var;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: y */
    public void mo2818y() {
        if (!IntlCountryCodeController.v()) {
            m2793w();
            return;
        }
        View viewMo2805d = mo2805d();
        if (NullChecker.a(this.f3132l) && NullChecker.a(viewMo2805d)) {
            this.f3132l.m12564k(viewMo2805d);
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3131k = null;
        m3597B();
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3131k = null;
        m3597B();
    }

    @Override // p009l.wsf0
    public void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var) {
    }
}
