package com.p000p1.mobile.putong.core.newui.home.opt.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.C0107c;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
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
import l.roj0;
import l.t100;
import l.upa;
import p009l.a5m;
import p009l.aol;
import p009l.ax2;
import p009l.b5m;
import p009l.chj0;
import p009l.d5m;
import p009l.ehj0;
import p009l.em4;
import p009l.erw;
import p009l.fnf;
import p009l.id50;
import p009l.jj4;
import p009l.mol;
import p009l.pol0;
import p009l.qm4;
import p009l.rol0;
import p009l.sh90;
import p009l.wsf0;
import p009l.znl;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileCardStackOpt extends BifrostLayout implements wsf0<View, C0107c>, qm4 {

    /* JADX INFO: renamed from: f */
    public sh90 f2103f;

    /* JADX INFO: renamed from: g */
    public ax2 f2104g;

    /* JADX INFO: renamed from: h */
    public id50 f2105h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.c f2106i;

    /* JADX INFO: renamed from: j */
    public qol0 f2107j;

    /* JADX INFO: renamed from: k */
    public e30<mol> f2108k;

    /* JADX INFO: renamed from: l */
    public chj0 f2109l;

    /* JADX INFO: renamed from: m */
    public ehj0 f2110m;

    /* JADX INFO: renamed from: n */
    public ViewTreeObserverOnGlobalLayoutListenerC0030b f2111n;

    /* JADX INFO: renamed from: o */
    public Paint f2112o;

    /* JADX INFO: renamed from: p */
    public int f2113p;

    /* JADX INFO: renamed from: q */
    public PorterDuffXfermode f2114q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$a */
    public class C0195a implements em4 {
        public C0195a() {
        }

        @Override // p009l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo2819a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C0197c.f2117a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo13174a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.a(ProfileCardStackOpt.this.f2105h)) {
                VirtualCard virtualCard = pol0Var.f18800a;
                if (virtualCard instanceof a5m) {
                    try {
                        onCardSwipeResultMo13174a = ProfileCardStackOpt.this.f2105h.mo13174a((a5m) virtualCard, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.c(new RuntimeException("划卡异常：" + e.toString() + "," + ProfileCardStackOpt.this.f2104g.mo12313b(), e));
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
                        onCardSwipeResultMo13174a = ProfileCardStackOpt.this.f2105h.mo13174a(new rol0((CoreSuggested.UserInfo) pol0Var.f18802c, virtualCard), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo13174a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.c(new RuntimeException("划卡异常：" + e2.toString() + "," + ProfileCardStackOpt.this.f2104g.mo12313b(), e2));
                    }
                }
                int i2 = C0197c.f2118b[onCardSwipeResultMo13174a.ordinal()];
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$b */
    public class ViewOnClickListenerC0196b implements View.OnClickListener {
        public ViewOnClickListenerC0196b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(ProfileCardStackOpt.this.f2108k) && (view instanceof mol)) {
                ProfileCardStackOpt.this.f2108k.call((mol) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$c */
    public static /* synthetic */ class C0197c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2117a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f2118b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f2119c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f2119c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2119c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2119c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f2118b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2118b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2118b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f2117a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2117a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2117a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackOpt(Context context, qol0 qol0Var, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
        super(context);
        this.f2108k = null;
        this.f2113p = 0;
        this.f2114q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f2107j = qol0Var;
        this.f2111n = viewTreeObserverOnGlobalLayoutListenerC0030b;
        m2795C();
    }

    /* JADX INFO: renamed from: C */
    private void m2795C() {
        Paint paint = new Paint();
        this.f2112o = paint;
        paint.setAntiAlias(true);
        if (upa.N3()) {
            this.f2104g = new fnf(getContext());
        } else {
            this.f2104g = new erw(getContext());
        }
        this.f2104g.m26024l0(this);
        this.f2104g.m26022k0(new C0195a());
    }

    /* JADX INFO: renamed from: F */
    private void m2796F(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.v()) {
            if (upa.N3()) {
                if (NullChecker.a(this.f2110m)) {
                    this.f2110m.m13949e(mo2805d(), swipeDirection);
                }
            } else if (NullChecker.a(this.f2109l)) {
                this.f2109l.m12563j(mo2805d(), swipeDirection);
                return;
            }
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0197c.f2119c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f2104g.mo11678A0(cardOperation, z);
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: A */
    public void mo2797A(SwipeDirection swipeDirection) {
        m2796F(swipeDirection, false);
    }

    /* JADX INFO: renamed from: B */
    public void m2798B() {
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = this.f2111n;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC0030b.f706g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC0030b.f704f;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
            frameLayout2.setElevation(t100.d(3.0f));
        }
        frameLayout.setClipToOutline(false);
        frameLayout.setElevation(t100.d(6.0f));
    }

    /* JADX INFO: renamed from: D */
    public c<roj0> m2799D() {
        return this.f2104g.mo12316u0();
    }

    /* JADX INFO: renamed from: E */
    public void m2800E() {
        View viewMo2805d = mo2805d();
        if ((viewMo2805d instanceof UserProfileExpandedCardRoot) && upa.N3()) {
            ((UserProfileExpandedCardRoot) viewMo2805d).m1957x1();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m2801G(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = this.f2111n;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC0030b.f706g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC0030b.f704f;
        if (frameLayout == null) {
            return;
        }
        boolean z2 = frameLayout2 != null && frameLayout2.getVisibility() == 0;
        if (z) {
            frameLayout.setElevation(0.0f);
            if (z2) {
                frameLayout2.setElevation(t100.d(10.0f));
                return;
            }
            return;
        }
        if (z2) {
            m2798B();
        } else {
            frameLayout.setElevation(0.0f);
        }
    }

    @Override // p009l.nti0
    /* JADX INFO: renamed from: a */
    public void mo2802a() {
        if (NullChecker.a(mo2805d()) && (mo2805d() instanceof b5m)) {
            ((b5m) mo2805d()).mo829a();
        }
    }

    @Override // p009l.nti0
    /* JADX INFO: renamed from: b */
    public boolean mo2803b() {
        if (mo2805d() instanceof d5m) {
            return ((d5m) mo2805d()).mo833b();
        }
        return false;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: c */
    public boolean mo2804c(boolean z) {
        return this.f2102b;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: d */
    public View mo2805d() {
        pol0 pol0VarM25991G = this.f2104g.m25991G();
        if (NullChecker.a(pol0VarM25991G)) {
            return pol0VarM25991G.f18800a;
        }
        this.f2104g.m26005Y("get top ");
        return null;
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.c cVar = this.f2106i;
        if (cVar != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            cVar.b(z, f3, cardProgressAction);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        boolean z = this.f2113p > 0;
        if (z) {
            iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.dispatchDraw(canvas2);
        if (z) {
            this.f2112o.setXfermode(this.f2114q);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f2113p, this.f2112o);
            canvas2.restoreToCount(iSaveLayer);
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
        this.f2105h = id50Var;
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
        this.f2108k = e30Var;
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
        int i = C0197c.f2119c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f2104g.m25030B0(view, cardOperation, f, z);
    }

    @Override // p009l.wsf0
    @Nullable
    /* JADX INFO: renamed from: l */
    public jj4 mo2811l() {
        pol0 pol0VarM26038w = this.f2104g.m26038w();
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
        this.f2106i = cVar;
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: r */
    public void mo2816r(SwipeDirection swipeDirection, boolean z) {
        m2796F(swipeDirection, true);
    }

    @Override // p009l.wsf0
    public void setAdapter(C0107c c0107c) {
        sh90 sh90Var = new sh90(this, c0107c, this.f2107j, this.f2111n);
        this.f2103f = sh90Var;
        sh90Var.m22189A(new ViewOnClickListenerC0196b());
        this.f2104g.m26018i0(this.f2103f);
        setRenderManager(this.f2104g);
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
        this.f2109l = chj0Var;
    }

    @Override // p009l.wsf0
    public void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var) {
        this.f2110m = ehj0Var;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout
    /* JADX INFO: renamed from: v */
    public boolean mo2792v(boolean z) {
        return mo2804c(z);
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: v0 */
    public void mo2817v0(float f, float f2, CardProgressAction cardProgressAction) {
        VSwipeStack.c cVar = this.f2106i;
        if (cVar != null) {
            cVar.a(f, f2, cardProgressAction);
        }
    }

    @Override // p009l.wsf0
    /* JADX INFO: renamed from: y */
    public void mo2818y() {
        if (upa.N3() || !IntlCountryCodeController.v()) {
            m2793w();
            return;
        }
        View viewMo2805d = mo2805d();
        if (NullChecker.a(this.f2109l) && NullChecker.a(viewMo2805d)) {
            this.f2109l.m12564k(viewMo2805d);
        }
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2108k = null;
        this.f2113p = 0;
        this.f2114q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m2795C();
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2108k = null;
        this.f2113p = 0;
        this.f2114q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m2795C();
    }
}
