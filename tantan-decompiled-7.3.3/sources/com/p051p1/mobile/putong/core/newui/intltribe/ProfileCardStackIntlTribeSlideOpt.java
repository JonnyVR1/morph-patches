package com.p051p1.mobile.putong.core.newui.intltribe;

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
import p153l.dq90;
import p153l.f1g0;
import p153l.fqj0;
import p153l.hqj0;
import p153l.ik4;
import p153l.kql;
import p153l.lql;
import p153l.pkp;
import p153l.pl50;
import p153l.pn4;
import p153l.px2;
import p153l.q7m;
import p153l.s740;
import p153l.txl0;
import p153l.uxl0;
import p153l.vfp;
import p153l.vxl0;
import p153l.xql;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileCardStackIntlTribeSlideOpt extends BifrostLayout implements f1g0<View, s740>, pn4 {

    /* JADX INFO: renamed from: f */
    public dq90 f25090f;

    /* JADX INFO: renamed from: g */
    public px2 f25091g;

    /* JADX INFO: renamed from: h */
    public pl50 f25092h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.InterfaceC4918c f25093i;

    /* JADX INFO: renamed from: j */
    public uxl0 f25094j;

    /* JADX INFO: renamed from: k */
    public y20<xql> f25095k;

    /* JADX INFO: renamed from: l */
    public fqj0 f25096l;

    /* JADX INFO: renamed from: m */
    public pkp f25097m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$a */
    public class C8231a implements dn4 {
        public C8231a() {
        }

        @Override // p153l.dn4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8233c.f25100a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.m82486a(ProfileCardStackIntlTribeSlideOpt.this.f25092h)) {
                KeyEvent.Callback callback = txl0Var.f176568a;
                if (callback instanceof q7m) {
                    try {
                        onCardSwipeResultMo145869a = ProfileCardStackIntlTribeSlideOpt.this.f25092h.mo145869a((q7m) callback, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackIntlTribeSlideOpt.this.f25091g.mo140727b(), e));
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
                        onCardSwipeResultMo145869a = ProfileCardStackIntlTribeSlideOpt.this.f25092h.mo145869a(new vxl0((CoreSuggested.UserInfo) txl0Var.f176570c, (VirtualCard) callback), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo145869a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.m82479c(new RuntimeException("划卡异常：" + e2.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackIntlTribeSlideOpt.this.f25091g.mo140727b(), e2));
                    }
                }
                int i2 = C8233c.f25101b[onCardSwipeResultMo145869a.ordinal()];
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
    public class ViewOnClickListenerC8232b implements View.OnClickListener {
        public ViewOnClickListenerC8232b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(ProfileCardStackIntlTribeSlideOpt.this.f25095k) && (view instanceof xql)) {
                ProfileCardStackIntlTribeSlideOpt.this.f25095k.call((xql) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$c */
    public static /* synthetic */ class C8233c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25100a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f25101b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f25102c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f25102c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25102c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25102c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f25101b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25101b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25101b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f25100a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25100a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25100a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, uxl0 uxl0Var, pkp pkpVar) {
        super(context);
        this.f25095k = null;
        this.f25094j = uxl0Var;
        this.f25097m = pkpVar;
        m40531B();
    }

    /* JADX INFO: renamed from: B */
    private void m40531B() {
        vfp vfpVar = new vfp(getContext());
        this.f25091g = vfpVar;
        vfpVar.m169656l0(this);
        this.f25091g.m169654k0(new C8231a());
    }

    /* JADX INFO: renamed from: C */
    private void m40532C(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f25096l)) {
            this.f25096l.m126772j(mo39812d(), swipeDirection);
            return;
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8233c.f25102c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f25091g.mo160614A0(cardOperation, z);
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: A */
    public void mo39804A(SwipeDirection swipeDirection) {
        m40532C(swipeDirection, false);
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
        txl0 txl0VarM169622G = this.f25091g.m169622G();
        if (NullChecker.m82486a(txl0VarM169622G)) {
            return txl0VarM169622G.f176568a;
        }
        this.f25091g.m169636Y("get top ");
        return null;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.InterfaceC4918c interfaceC4918c = this.f25093i;
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
        this.f25092h = pl50Var;
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
        this.f25095k = y20Var;
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
        int i = C8233c.f25102c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f25091g.m160615B0(view, cardOperation, f, z);
    }

    @Override // p153l.f1g0
    @Nullable
    /* JADX INFO: renamed from: l */
    public ik4 mo39818l() {
        txl0 txl0VarM169670w = this.f25091g.m169670w();
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
        this.f25093i = interfaceC4918c;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: r */
    public void mo39823r(SwipeDirection swipeDirection, boolean z) {
        m40532C(swipeDirection, true);
    }

    @Override // p153l.f1g0
    public void setAdapter(s740 s740Var) {
        dq90 dq90Var = new dq90(this, s740Var, this.f25094j, this.f25097m);
        this.f25090f = dq90Var;
        dq90Var.m117510z(new ViewOnClickListenerC8232b());
        this.f25091g.m169650i0(this.f25090f);
        setRenderManager(this.f25091g);
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
        this.f25096l = fqj0Var;
    }

    @Override // p153l.f1g0
    /* JADX INFO: renamed from: y */
    public void mo39825y() {
        if (!IntlCountryCodeController.m29125v()) {
            m39800w();
            return;
        }
        View viewMo39812d = mo39812d();
        if (NullChecker.m82486a(this.f25096l) && NullChecker.m82486a(viewMo39812d)) {
            this.f25096l.m126773k(viewMo39812d);
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25095k = null;
        m40531B();
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25095k = null;
        m40531B();
    }

    @Override // p153l.f1g0
    public void setUsHomeExpandCardAnimHelper(hqj0 hqj0Var) {
    }
}
