package com.p046p1.mobile.putong.core.newui.home.opt.view;

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
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7943c;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.a5m;
import p149l.aol;
import p149l.ax2;
import p149l.b5m;
import p149l.chj0;
import p149l.d5m;
import p149l.e30;
import p149l.ehj0;
import p149l.em4;
import p149l.erw;
import p149l.fnf;
import p149l.id50;
import p149l.jj4;
import p149l.mol;
import p149l.pol0;
import p149l.qm4;
import p149l.qol0;
import p149l.roj0;
import p149l.rol0;
import p149l.sh90;
import p149l.t100;
import p149l.upa;
import p149l.wsf0;
import p149l.znl;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileCardStackOpt extends BifrostLayout implements wsf0<View, C7943c>, qm4 {

    /* JADX INFO: renamed from: f */
    public sh90 f23325f;

    /* JADX INFO: renamed from: g */
    public ax2 f23326g;

    /* JADX INFO: renamed from: h */
    public id50 f23327h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.InterfaceC4767c f23328i;

    /* JADX INFO: renamed from: j */
    public qol0 f23329j;

    /* JADX INFO: renamed from: k */
    public e30<mol> f23330k;

    /* JADX INFO: renamed from: l */
    public chj0 f23331l;

    /* JADX INFO: renamed from: m */
    public ehj0 f23332m;

    /* JADX INFO: renamed from: n */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f23333n;

    /* JADX INFO: renamed from: o */
    public Paint f23334o;

    /* JADX INFO: renamed from: p */
    public int f23335p;

    /* JADX INFO: renamed from: q */
    public PorterDuffXfermode f23336q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$a */
    public class C8031a implements em4 {
        public C8031a() {
        }

        @Override // p149l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo38823a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8033c.f23339a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo111028a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.m81303a(ProfileCardStackOpt.this.f23327h)) {
                KeyEvent.Callback callback = pol0Var.f150530a;
                if (callback instanceof a5m) {
                    try {
                        onCardSwipeResultMo111028a = ProfileCardStackOpt.this.f23327h.mo111028a((a5m) callback, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.m81296c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackOpt.this.f23326g.mo104260b(), e));
                    }
                } else if (callback instanceof VirtualCard) {
                    Object obj = pol0Var.f150532c;
                    if (obj instanceof CoreSuggested.UserInfo) {
                        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                        if (!userInfo.isVirtualCard()) {
                            CrashHelper.m81296c(new RuntimeException("错误的卡片类型：" + userInfo.f19472id));
                        }
                    }
                    try {
                        onCardSwipeResultMo111028a = ProfileCardStackOpt.this.f23327h.mo111028a(new rol0((CoreSuggested.UserInfo) pol0Var.f150532c, (VirtualCard) callback), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo111028a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.m81296c(new RuntimeException("划卡异常：" + e2.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackOpt.this.f23326g.mo104260b(), e2));
                    }
                }
                int i2 = C8033c.f23340b[onCardSwipeResultMo111028a.ordinal()];
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
    public class ViewOnClickListenerC8032b implements View.OnClickListener {
        public ViewOnClickListenerC8032b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(ProfileCardStackOpt.this.f23330k) && (view instanceof mol)) {
                ProfileCardStackOpt.this.f23330k.call((mol) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt$c */
    public static /* synthetic */ class C8033c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23339a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f23340b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f23341c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f23341c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23341c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23341c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f23340b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23340b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23340b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f23339a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23339a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23339a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackOpt(Context context, qol0 qol0Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        super(context);
        this.f23330k = null;
        this.f23335p = 0;
        this.f23336q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23329j = qol0Var;
        this.f23333n = viewTreeObserverOnGlobalLayoutListenerC7866b;
        m38799C();
    }

    /* JADX INFO: renamed from: C */
    private void m38799C() {
        Paint paint = new Paint();
        this.f23334o = paint;
        paint.setAntiAlias(true);
        if (upa.m194675N3()) {
            this.f23326g = new fnf(getContext());
        } else {
            this.f23326g = new erw(getContext());
        }
        this.f23326g.m220542l0(this);
        this.f23326g.m220540k0(new C8031a());
    }

    /* JADX INFO: renamed from: F */
    private void m38800F(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.m28126v()) {
            if (upa.m194675N3()) {
                if (NullChecker.m81303a(this.f23332m)) {
                    this.f23332m.m116474e(mo38809d(), swipeDirection);
                }
            } else if (NullChecker.m81303a(this.f23331l)) {
                this.f23331l.m106897j(mo38809d(), swipeDirection);
                return;
            }
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8033c.f23341c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f23326g.mo99351A0(cardOperation, z);
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: A */
    public void mo38801A(SwipeDirection swipeDirection) {
        m38800F(swipeDirection, false);
    }

    /* JADX INFO: renamed from: B */
    public void m38802B() {
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f23333n;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC7866b.f21928g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC7866b.f21926f;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
            frameLayout2.setElevation(t100.m186890d(3.0f));
        }
        frameLayout.setClipToOutline(false);
        frameLayout.setElevation(t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: D */
    public C22306c<roj0> m38803D() {
        return this.f23326g.mo104263u0();
    }

    /* JADX INFO: renamed from: E */
    public void m38804E() {
        View viewMo38809d = mo38809d();
        if ((viewMo38809d instanceof UserProfileExpandedCardRoot) && upa.m194675N3()) {
            ((UserProfileExpandedCardRoot) viewMo38809d).m37983x1();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m38805G(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f23333n;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b == null) {
            return;
        }
        FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC7866b.f21928g;
        FrameLayout frameLayout2 = viewTreeObserverOnGlobalLayoutListenerC7866b.f21926f;
        if (frameLayout == null) {
            return;
        }
        boolean z2 = frameLayout2 != null && frameLayout2.getVisibility() == 0;
        if (z) {
            frameLayout.setElevation(0.0f);
            if (z2) {
                frameLayout2.setElevation(t100.m186890d(10.0f));
                return;
            }
            return;
        }
        if (z2) {
            m38802B();
        } else {
            frameLayout.setElevation(0.0f);
        }
    }

    @Override // p149l.nti0
    /* JADX INFO: renamed from: a */
    public void mo38806a() {
        if (NullChecker.m81303a(mo38809d()) && (mo38809d() instanceof b5m)) {
            ((b5m) mo38809d()).mo36868a();
        }
    }

    @Override // p149l.nti0
    /* JADX INFO: renamed from: b */
    public boolean mo38807b() {
        if (mo38809d() instanceof d5m) {
            return ((d5m) mo38809d()).mo36872b();
        }
        return false;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: c */
    public boolean mo38808c(boolean z) {
        return this.f23324b;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: d */
    public View mo38809d() {
        pol0 pol0VarM220509G = this.f23326g.m220509G();
        if (NullChecker.m81303a(pol0VarM220509G)) {
            return pol0VarM220509G.f150530a;
        }
        this.f23326g.m220523Y("get top ");
        return null;
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.InterfaceC4767c interfaceC4767c = this.f23328i;
        if (interfaceC4767c != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            interfaceC4767c.mo35197b(z, f3, cardProgressAction);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        boolean z = this.f23335p > 0;
        if (z) {
            iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.dispatchDraw(canvas2);
        if (z) {
            this.f23334o.setXfermode(this.f23336q);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f23335p, this.f23334o);
            canvas2.restoreToCount(iSaveLayer);
        }
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: e */
    public void mo38810e(float f) {
        setAlpha(f);
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: g */
    public void mo38811g(id50 id50Var) {
        this.f23327h = id50Var;
    }

    @Override // p149l.wsf0
    public int getMeasuredHeightProxy() {
        return getMeasuredHeight();
    }

    @Override // p149l.wsf0
    public int getMeasuredWidthProxy() {
        return getMeasuredWidth();
    }

    public View getRenderView() {
        return this;
    }

    @Override // p149l.wsf0
    public chj0 getUsHomeCardAnimHelper() {
        return null;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: i */
    public void mo38812i(e30<mol> e30Var) {
        this.f23330k = e30Var;
    }

    @Override // p149l.wsf0
    @Nullable
    /* JADX INFO: renamed from: j */
    public CoreSuggested.UserInfo mo38813j() {
        KeyEvent.Callback callbackMo38809d = mo38809d();
        if (callbackMo38809d instanceof aol) {
            return ((aol) callbackMo38809d).getUserInfoProxy();
        }
        return null;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: k */
    public void mo38814k(View view, SwipeDirection swipeDirection, float f, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8033c.f23341c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f23326g.m211310B0(view, cardOperation, f, z);
    }

    @Override // p149l.wsf0
    @Nullable
    /* JADX INFO: renamed from: l */
    public jj4 mo38815l() {
        pol0 pol0VarM220556w = this.f23326g.m220556w();
        KeyEvent.Callback callback = NullChecker.m81303a(pol0VarM220556w) ? pol0VarM220556w.f150530a : null;
        if (callback instanceof znl) {
            return ((znl) callback).getCardData();
        }
        return null;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: m */
    public boolean mo38816m() {
        return mo38809d() instanceof VirtualCard;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: n */
    public void mo38817n() {
        if (mo38816m()) {
            VirtualCard virtualCard = (VirtualCard) mo38809d();
            virtualCard.m46082H0(virtualCard.getContentView());
        }
    }

    @Override // p149l.wsf0
    @Nullable
    /* JADX INFO: renamed from: o */
    public jj4 mo38818o() {
        KeyEvent.Callback callbackMo38809d = mo38809d();
        if (callbackMo38809d instanceof znl) {
            return ((znl) callbackMo38809d).getCardData();
        }
        return null;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: p */
    public void mo38819p(VSwipeStack.InterfaceC4767c interfaceC4767c) {
        this.f23328i = interfaceC4767c;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: r */
    public void mo38820r(SwipeDirection swipeDirection, boolean z) {
        m38800F(swipeDirection, true);
    }

    @Override // p149l.wsf0
    public void setAdapter(C7943c c7943c) {
        sh90 sh90Var = new sh90(this, c7943c, this.f23329j, this.f23333n);
        this.f23325f = sh90Var;
        sh90Var.m184170A(new ViewOnClickListenerC8032b());
        this.f23326g.m220536i0(this.f23325f);
        setRenderManager(this.f23326g);
    }

    @Override // p149l.wsf0
    public void setAllowUpSwipe(boolean z) {
        this.f23324b = z;
    }

    @Override // p149l.nti0
    public /* bridge */ /* synthetic */ void setSuperLikeBtnVisible(boolean z) {
        super.setSuperLikeBtnVisible(z);
    }

    @Override // p149l.wsf0
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
        this.f23331l = chj0Var;
    }

    @Override // p149l.wsf0
    public void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var) {
        this.f23332m = ehj0Var;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout
    /* JADX INFO: renamed from: v */
    public boolean mo38796v(boolean z) {
        return mo38808c(z);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: v0 */
    public void mo38821v0(float f, float f2, CardProgressAction cardProgressAction) {
        VSwipeStack.InterfaceC4767c interfaceC4767c = this.f23328i;
        if (interfaceC4767c != null) {
            interfaceC4767c.m35196a(f, f2, cardProgressAction);
        }
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: y */
    public void mo38822y() {
        if (upa.m194675N3() || !IntlCountryCodeController.m28126v()) {
            m38797w();
            return;
        }
        View viewMo38809d = mo38809d();
        if (NullChecker.m81303a(this.f23331l) && NullChecker.m81303a(viewMo38809d)) {
            this.f23331l.m106898k(viewMo38809d);
        }
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23330k = null;
        this.f23335p = 0;
        this.f23336q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m38799C();
    }

    public ProfileCardStackOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23330k = null;
        this.f23335p = 0;
        this.f23336q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m38799C();
    }
}
