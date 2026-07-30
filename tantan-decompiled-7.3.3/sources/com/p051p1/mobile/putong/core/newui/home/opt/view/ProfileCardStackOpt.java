package com.p051p1.mobile.putong.core.newui.home.opt.view;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8094c;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.dn4;
import p153l.duw;
import p153l.f1g0;
import p153l.fqj0;
import p153l.gra;
import p153l.hqj0;
import p153l.ik4;
import p153l.kql;
import p153l.lof;
import p153l.lql;
import p153l.pl50;
import p153l.pn4;
import p153l.px2;
import p153l.q7m;
import p153l.qa00;
import p153l.r7m;
import p153l.t7m;
import p153l.txl0;
import p153l.uxj0;
import p153l.uxl0;
import p153l.vxl0;
import p153l.wp90;
import p153l.xql;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileCardStackOpt extends BifrostLayout implements f1g0<View, C8094c>, pn4 {

    /* JADX INFO: renamed from: f */
    public wp90 f24067f;

    /* JADX INFO: renamed from: g */
    public px2 f24068g;

    /* JADX INFO: renamed from: h */
    public pl50 f24069h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.InterfaceC4918c f24070i;

    /* JADX INFO: renamed from: j */
    public uxl0 f24071j;

    /* JADX INFO: renamed from: k */
    public y20<xql> f24072k;

    /* JADX INFO: renamed from: l */
    public fqj0 f24073l;

    /* JADX INFO: renamed from: m */
    public hqj0 f24074m;

    /* JADX INFO: renamed from: n */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f24075n;

    /* JADX INFO: renamed from: o */
    public Paint f24076o;

    /* JADX INFO: renamed from: p */
    public int f24077p;

    /* JADX INFO: renamed from: q */
    public PorterDuffXfermode f24078q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$a */
    public class C8182a implements dn4 {
        public C8182a() {
        }

        @Override // p153l.dn4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8184c.f24081a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.m82486a(ProfileCardStackOpt.this.f24069h)) {
                KeyEvent.Callback callback = txl0Var.f176568a;
                if (callback instanceof q7m) {
                    try {
                        onCardSwipeResultMo145869a = ProfileCardStackOpt.this.f24069h.mo145869a((q7m) callback, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackOpt.this.f24068g.mo140727b(), e));
                    }
                } else if (callback instanceof VirtualCard) {
                    Object obj = txl0Var.f176570c;
                    if (obj instanceof CoreSuggested.UserInfo) {
                        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                        if (!userInfo.isVirtualCard()) {
                            CrashHelper.m82479c(new RuntimeException("错误的卡片类型：" + userInfo.f20214id));
                        }
                    }
                    try {
                        onCardSwipeResultMo145869a = ProfileCardStackOpt.this.f24069h.mo145869a(new vxl0((CoreSuggested.UserInfo) txl0Var.f176570c, (VirtualCard) callback), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e2.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackOpt.this.f24068g.mo140727b(), e2));
                    }
                }
                int i2 = C8184c.f24082b[onCardSwipeResultMo145869a.ordinal()];
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
    public class ViewOnClickListenerC8183b implements View.OnClickListener {
        public ViewOnClickListenerC8183b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(ProfileCardStackOpt.this.f24072k) && (view instanceof xql)) {
                ProfileCardStackOpt.this.f24072k.call((xql) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$c */
    public static /* synthetic */ class C8184c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24081a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24082b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24083c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f24083c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24083c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24083c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f24082b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24082b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24082b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f24081a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24081a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24081a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackOpt(Context context, uxl0 uxl0Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        super(context);
        this.f24072k = null;
        this.f24077p = 0;
        this.f24078q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f24071j = uxl0Var;
        this.f24075n = viewTreeObserverOnGlobalLayoutListenerC8017b;
        m39802C();
    }

    /* JADX INFO: renamed from: C */
    private void m39802C() {
        Paint paint = new Paint();
        this.f24076o = paint;
        paint.setAntiAlias(true);
        if (gra.m131606N3()) {
            this.f24068g = new lof(getContext());
        } else {
            this.f24068g = new duw(getContext());
        }
        this.f24068g.m169656l0(this);
        this.f24068g.m169654k0(new C8182a());
    }

    /* JADX INFO: renamed from: F */
    private void m39803F(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.m29125v()) {
            if (gra.m131606N3()) {
                if (NullChecker.m82486a(this.f24074m)) {
                    this.f24074m.m136631e(mo39812d(), swipeDirection);
                }
            } else if (NullChecker.m82486a(this.f24073l)) {
                this.f24073l.m126772j(mo39812d(), swipeDirection);
                return;
            }
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8184c.f24083c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24068g.mo160614A0(cardOperation, z);
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: A */
    public void mo39804A(SwipeDirection swipeDirection) {
        m39803F(swipeDirection, false);
    }

    /* JADX INFO: renamed from: B */
    public void m39805B() {
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f24075n;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC8017b.f22670g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC8017b.f22668f;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
            frameLayout2.setElevation(qa00.m175859d(3.0f));
        }
        frameLayout.setClipToOutline(false);
        frameLayout.setElevation(qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: D */
    public C22421c<uxj0> m39806D() {
        return this.f24068g.mo160620u0();
    }

    /* JADX INFO: renamed from: E */
    public void m39807E() {
        View viewMo39812d = mo39812d();
        if ((viewMo39812d instanceof UserProfileExpandedCardRoot) && gra.m131606N3()) {
            ((UserProfileExpandedCardRoot) viewMo39812d).m38986x1();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m39808G(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f24075n;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC8017b.f22670g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC8017b.f22668f;
        if (frameLayout == null) {
            return;
        }
        boolean z2 = frameLayout2 != null && frameLayout2.getVisibility() == 0;
        if (z) {
            frameLayout.setElevation(0.0f);
            if (z2) {
                frameLayout2.setElevation(qa00.m175859d(10.0f));
                return;
            }
            return;
        }
        if (z2) {
            m39805B();
        } else {
            frameLayout.setElevation(0.0f);
        }
    }

    @Override // p153l.r2j0
    /* JADX INFO: renamed from: a */
    public void mo39809a() {
        if (NullChecker.m82486a(mo39812d()) && (mo39812d() instanceof r7m)) {
            ((r7m) mo39812d()).mo37871a();
        }
    }

    @Override // p153l.r2j0
    /* JADX INFO: renamed from: b */
    public boolean mo39810b() {
        if (mo39812d() instanceof t7m) {
            return ((t7m) mo39812d()).mo37875b();
        }
        return false;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: c */
    public boolean mo39811c(boolean z) {
        return this.f24066b;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: d */
    public View mo39812d() {
        txl0 txl0VarM169622G = this.f24068g.m169622G();
        if (NullChecker.m82486a(txl0VarM169622G)) {
            return txl0VarM169622G.f176568a;
        }
        this.f24068g.m169636Y("get top ");
        return null;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.InterfaceC4918c interfaceC4918c = this.f24070i;
        if (interfaceC4918c != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            interfaceC4918c.mo36200b(z, f3, cardProgressAction);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        boolean z = this.f24077p > 0;
        if (z) {
            iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.dispatchDraw(canvas2);
        if (z) {
            this.f24076o.setXfermode(this.f24078q);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24077p, this.f24076o);
            canvas2.restoreToCount(iSaveLayer);
        }
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: e */
    public void mo39813e(float f) {
        setAlpha(f);
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: g */
    public void mo39814g(pl50 pl50Var) {
        this.f24069h = pl50Var;
    }

    @Override // p153l.f1g0
    public int getMeasuredHeightProxy() {
        return getMeasuredHeight();
    }

    @Override // p153l.f1g0
    public int getMeasuredWidthProxy() {
        return getMeasuredWidth();
    }

    public View getRenderView() {
        return this;
    }

    @Override // p153l.f1g0
    public fqj0 getUsHomeCardAnimHelper() {
        return null;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: i */
    public void mo39815i(y20<xql> y20Var) {
        this.f24072k = y20Var;
    }

    @Override // p153l.f1g0
    @Nullable
    /* JADX INFO: renamed from: j */
    public CoreSuggested.UserInfo mo39816j() {
        KeyEvent.Callback callbackMo39812d = mo39812d();
        if (callbackMo39812d instanceof lql) {
            return ((lql) callbackMo39812d).getUserInfoProxy();
        }
        return null;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: k */
    public void mo39817k(View view, SwipeDirection swipeDirection, float f, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8184c.f24083c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24068g.m160615B0(view, cardOperation, f, z);
    }

    @Override // p153l.f1g0
    @Nullable
    /* JADX INFO: renamed from: l */
    public ik4 mo39818l() {
        txl0 txl0VarM169670w = this.f24068g.m169670w();
        KeyEvent.Callback callback = NullChecker.m82486a(txl0VarM169670w) ? txl0VarM169670w.f176568a : null;
        if (callback instanceof kql) {
            return ((kql) callback).getCardData();
        }
        return null;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: m */
    public boolean mo39819m() {
        return mo39812d() instanceof VirtualCard;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: n */
    public void mo39820n() {
        if (mo39819m()) {
            VirtualCard virtualCard = (VirtualCard) mo39812d();
            virtualCard.m47265H0(virtualCard.getContentView());
        }
    }

    @Override // p153l.f1g0
    @Nullable
    /* JADX INFO: renamed from: o */
    public ik4 mo39821o() {
        KeyEvent.Callback callbackMo39812d = mo39812d();
        if (callbackMo39812d instanceof kql) {
            return ((kql) callbackMo39812d).getCardData();
        }
        return null;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: p */
    public void mo39822p(VSwipeStack.InterfaceC4918c interfaceC4918c) {
        this.f24070i = interfaceC4918c;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: r */
    public void mo39823r(SwipeDirection swipeDirection, boolean z) {
        m39803F(swipeDirection, true);
    }

    @Override // p153l.f1g0
    public void setAdapter(C8094c c8094c) {
        wp90 wp90Var = new wp90(this, c8094c, this.f24071j, this.f24075n);
        this.f24067f = wp90Var;
        wp90Var.m207425A(new ViewOnClickListenerC8183b());
        this.f24068g.m169650i0(this.f24067f);
        setRenderManager(this.f24068g);
    }

    @Override // p153l.f1g0
    public void setAllowUpSwipe(boolean z) {
        this.f24066b = z;
    }

    @Override // p153l.r2j0
    public /* bridge */ /* synthetic */ void setSuperLikeBtnVisible(boolean z) {
        super.setSuperLikeBtnVisible(z);
    }

    @Override // p153l.f1g0
    public void setUsHomeCardAnimHelper(fqj0 fqj0Var) {
        this.f24073l = fqj0Var;
    }

    @Override // p153l.f1g0
    public void setUsHomeExpandCardAnimHelper(hqj0 hqj0Var) {
        this.f24074m = hqj0Var;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout
    /* JADX INFO: renamed from: v */
    public boolean mo39799v(boolean z) {
        return mo39811c(z);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: v0 */
    public void mo39824v0(float f, float f2, CardProgressAction cardProgressAction) {
        VSwipeStack.InterfaceC4918c interfaceC4918c = this.f24070i;
        if (interfaceC4918c != null) {
            interfaceC4918c.m36199a(f, f2, cardProgressAction);
        }
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: y */
    public void mo39825y() {
        if (gra.m131606N3() || !IntlCountryCodeController.m29125v()) {
            m39800w();
            return;
        }
        View viewMo39812d = mo39812d();
        if (NullChecker.m82486a(this.f24073l) && NullChecker.m82486a(viewMo39812d)) {
            this.f24073l.m126773k(viewMo39812d);
        }
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24072k = null;
        this.f24077p = 0;
        this.f24078q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m39802C();
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24072k = null;
        this.f24077p = 0;
        this.f24078q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m39802C();
    }
}
