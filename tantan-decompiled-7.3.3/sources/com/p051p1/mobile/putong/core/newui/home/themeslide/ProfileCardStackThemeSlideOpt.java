package com.p051p1.mobile.putong.core.newui.home.themeslide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.dn4;
import p153l.dui0;
import p153l.f1g0;
import p153l.fqj0;
import p153l.hqj0;
import p153l.ik4;
import p153l.kq90;
import p153l.kql;
import p153l.lql;
import p153l.pl50;
import p153l.pn4;
import p153l.px2;
import p153l.q7m;
import p153l.txl0;
import p153l.uxl0;
import p153l.v740;
import p153l.vxl0;
import p153l.xql;
import p153l.y20;
import p153l.yfl;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileCardStackThemeSlideOpt extends BifrostLayout implements f1g0<View, v740>, pn4 {

    /* JADX INFO: renamed from: f */
    public kq90 f24086f;

    /* JADX INFO: renamed from: g */
    public px2 f24087g;

    /* JADX INFO: renamed from: h */
    public pl50 f24088h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.InterfaceC4918c f24089i;

    /* JADX INFO: renamed from: j */
    public uxl0 f24090j;

    /* JADX INFO: renamed from: k */
    public y20<xql> f24091k;

    /* JADX INFO: renamed from: l */
    public fqj0 f24092l;

    /* JADX INFO: renamed from: m */
    public yfl f24093m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt$a */
    public class C8185a implements dn4 {
        public C8185a() {
        }

        @Override // p153l.dn4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8187c.f24096a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.m82486a(ProfileCardStackThemeSlideOpt.this.f24088h)) {
                KeyEvent.Callback callback = txl0Var.f176568a;
                if (callback instanceof q7m) {
                    try {
                        onCardSwipeResultMo145869a = ProfileCardStackThemeSlideOpt.this.f24088h.mo145869a((q7m) callback, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackThemeSlideOpt.this.f24087g.mo140727b(), e));
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
                        onCardSwipeResultMo145869a = ProfileCardStackThemeSlideOpt.this.f24088h.mo145869a(new vxl0((CoreSuggested.UserInfo) txl0Var.f176570c, (VirtualCard) callback), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e2.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackThemeSlideOpt.this.f24087g.mo140727b(), e2));
                    }
                }
                int i2 = C8187c.f24097b[onCardSwipeResultMo145869a.ordinal()];
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt$b */
    public class ViewOnClickListenerC8186b implements View.OnClickListener {
        public ViewOnClickListenerC8186b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(ProfileCardStackThemeSlideOpt.this.f24091k) && (view instanceof xql)) {
                ProfileCardStackThemeSlideOpt.this.f24091k.call((xql) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt$c */
    public static /* synthetic */ class C8187c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24096a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24097b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24098c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f24098c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24098c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24098c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f24097b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24097b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24097b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f24096a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24096a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24096a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackThemeSlideOpt(Context context, uxl0 uxl0Var, yfl yflVar) {
        super(context);
        this.f24091k = null;
        this.f24090j = uxl0Var;
        this.f24093m = yflVar;
        m39831B();
    }

    /* JADX INFO: renamed from: B */
    private void m39831B() {
        dui0 dui0Var = new dui0(getContext());
        this.f24087g = dui0Var;
        dui0Var.m169656l0(this);
        this.f24087g.m169654k0(new C8185a());
    }

    /* JADX INFO: renamed from: C */
    private void m39832C(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f24092l)) {
            this.f24092l.m126772j(mo39812d(), swipeDirection);
            return;
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8187c.f24098c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24087g.mo160614A0(cardOperation, z);
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: A */
    public void mo39804A(SwipeDirection swipeDirection) {
        m39832C(swipeDirection, false);
    }

    @Override // p153l.r2j0
    /* JADX INFO: renamed from: a */
    public void mo39809a() {
        if (NullChecker.m82486a(mo39812d()) && (mo39812d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) mo39812d()).mo37871a();
        }
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: c */
    public boolean mo39811c(boolean z) {
        return this.f24066b;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: d */
    public View mo39812d() {
        txl0 txl0VarM169622G = this.f24087g.m169622G();
        if (NullChecker.m82486a(txl0VarM169622G)) {
            return txl0VarM169622G.f176568a;
        }
        this.f24087g.m169636Y("get top ");
        return null;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.InterfaceC4918c interfaceC4918c = this.f24089i;
        if (interfaceC4918c != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            interfaceC4918c.mo36200b(z, f3, cardProgressAction);
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
        this.f24088h = pl50Var;
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
        this.f24091k = y20Var;
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
        int i = C8187c.f24098c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24087g.m160615B0(view, cardOperation, f, z);
    }

    @Override // p153l.f1g0
    @Nullable
    /* JADX INFO: renamed from: l */
    public ik4 mo39818l() {
        txl0 txl0VarM169670w = this.f24087g.m169670w();
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
        this.f24089i = interfaceC4918c;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: r */
    public void mo39823r(SwipeDirection swipeDirection, boolean z) {
        m39832C(swipeDirection, true);
    }

    @Override // p153l.f1g0
    public void setAdapter(v740 v740Var) {
        kq90 kq90Var = new kq90(this, v740Var, this.f24090j, this.f24093m);
        this.f24086f = kq90Var;
        kq90Var.m150856z(new ViewOnClickListenerC8186b());
        this.f24087g.m169650i0(this.f24086f);
        setRenderManager(this.f24087g);
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
        this.f24092l = fqj0Var;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: y */
    public void mo39825y() {
        if (!IntlCountryCodeController.m29125v()) {
            m39800w();
            return;
        }
        View viewMo39812d = mo39812d();
        if (NullChecker.m82486a(this.f24092l) && NullChecker.m82486a(viewMo39812d)) {
            this.f24092l.m126773k(viewMo39812d);
        }
    }

    public ProfileCardStackThemeSlideOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24091k = null;
        m39831B();
    }

    public ProfileCardStackThemeSlideOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24091k = null;
        m39831B();
    }

    @Override // p153l.f1g0
    public void setUsHomeExpandCardAnimHelper(hqj0 hqj0Var) {
    }
}
