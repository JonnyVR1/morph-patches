package com.p046p1.mobile.putong.core.newui.intltribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.a5m;
import p149l.aol;
import p149l.ax2;
import p149l.chj0;
import p149l.e30;
import p149l.ehj0;
import p149l.em4;
import p149l.ez30;
import p149l.id50;
import p149l.jj4;
import p149l.mol;
import p149l.pip;
import p149l.pol0;
import p149l.qm4;
import p149l.qol0;
import p149l.rol0;
import p149l.vdp;
import p149l.wsf0;
import p149l.zh90;
import p149l.znl;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileCardStackIntlTribeSlideOpt extends BifrostLayout implements wsf0<View, ez30>, qm4 {

    /* JADX INFO: renamed from: f */
    public zh90 f24348f;

    /* JADX INFO: renamed from: g */
    public ax2 f24349g;

    /* JADX INFO: renamed from: h */
    public id50 f24350h;

    /* JADX INFO: renamed from: i */
    public VSwipeStack.InterfaceC4767c f24351i;

    /* JADX INFO: renamed from: j */
    public qol0 f24352j;

    /* JADX INFO: renamed from: k */
    public e30<mol> f24353k;

    /* JADX INFO: renamed from: l */
    public chj0 f24354l;

    /* JADX INFO: renamed from: m */
    public pip f24355m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$a */
    public class C8080a implements em4 {
        public C8080a() {
        }

        @Override // p149l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo38823a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8082c.f24358a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo111028a = VSwipeStack.OnCardSwipeResult.back;
            if (NullChecker.m81303a(ProfileCardStackIntlTribeSlideOpt.this.f24350h)) {
                KeyEvent.Callback callback = pol0Var.f150530a;
                if (callback instanceof a5m) {
                    try {
                        onCardSwipeResultMo111028a = ProfileCardStackIntlTribeSlideOpt.this.f24350h.mo111028a((a5m) callback, swipeDirection, z);
                    } catch (Exception e) {
                        CrashHelper.m81296c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackIntlTribeSlideOpt.this.f24349g.mo104260b(), e));
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
                        onCardSwipeResultMo111028a = ProfileCardStackIntlTribeSlideOpt.this.f24350h.mo111028a(new rol0((CoreSuggested.UserInfo) pol0Var.f150532c, (VirtualCard) callback), swipeDirection, false);
                    } catch (Exception e2) {
                        onCardSwipeResultMo111028a = VSwipeStack.OnCardSwipeResult.pass;
                        CrashHelper.m81296c(new RuntimeException("划卡异常：" + e2.toString() + Constants.SEPARATOR_COMMA + ProfileCardStackIntlTribeSlideOpt.this.f24349g.mo104260b(), e2));
                    }
                }
                int i2 = C8082c.f24359b[onCardSwipeResultMo111028a.ordinal()];
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
    public class ViewOnClickListenerC8081b implements View.OnClickListener {
        public ViewOnClickListenerC8081b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(ProfileCardStackIntlTribeSlideOpt.this.f24353k) && (view instanceof mol)) {
                ProfileCardStackIntlTribeSlideOpt.this.f24353k.call((mol) view);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt$c */
    public static /* synthetic */ class C8082c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24358a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24359b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24360c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f24360c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24360c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24360c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f24359b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24359b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24359b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f24358a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24358a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24358a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, qol0 qol0Var, pip pipVar) {
        super(context);
        this.f24353k = null;
        this.f24352j = qol0Var;
        this.f24355m = pipVar;
        m39528B();
    }

    /* JADX INFO: renamed from: B */
    private void m39528B() {
        vdp vdpVar = new vdp(getContext());
        this.f24349g = vdpVar;
        vdpVar.m220542l0(this);
        this.f24349g.m220540k0(new C8080a());
    }

    /* JADX INFO: renamed from: C */
    private void m39529C(SwipeDirection swipeDirection, boolean z) {
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f24354l)) {
            this.f24354l.m106897j(mo38809d(), swipeDirection);
            return;
        }
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8082c.f24360c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24349g.mo99351A0(cardOperation, z);
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: A */
    public void mo38801A(SwipeDirection swipeDirection) {
        m39529C(swipeDirection, false);
    }

    @Override // p149l.nti0
    /* JADX INFO: renamed from: a */
    public void mo38806a() {
        if (NullChecker.m81303a(mo38809d()) && (mo38809d() instanceof NewNewProfileCard)) {
            ((NewNewProfileCard) mo38809d()).mo36868a();
        }
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: c */
    public boolean mo38808c(boolean z) {
        return this.f23324b;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: d */
    public View mo38809d() {
        pol0 pol0VarM220509G = this.f24349g.m220509G();
        if (NullChecker.m81303a(pol0VarM220509G)) {
            return pol0VarM220509G.f150530a;
        }
        this.f24349g.m220523Y("get top ");
        return null;
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        VSwipeStack.InterfaceC4767c interfaceC4767c = this.f24351i;
        if (interfaceC4767c != null) {
            boolean z = f3 == 0.0f;
            if (f3 == 0.0f) {
                f3 = fMin;
            }
            interfaceC4767c.mo35197b(z, f3, cardProgressAction);
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
        this.f24350h = id50Var;
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
        this.f24353k = e30Var;
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
        int i = C8082c.f24360c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f24349g.m211310B0(view, cardOperation, f, z);
    }

    @Override // p149l.wsf0
    @Nullable
    /* JADX INFO: renamed from: l */
    public jj4 mo38815l() {
        pol0 pol0VarM220556w = this.f24349g.m220556w();
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
        this.f24351i = interfaceC4767c;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: r */
    public void mo38820r(SwipeDirection swipeDirection, boolean z) {
        m39529C(swipeDirection, true);
    }

    @Override // p149l.wsf0
    public void setAdapter(ez30 ez30Var) {
        zh90 zh90Var = new zh90(this, ez30Var, this.f24352j, this.f24355m);
        this.f24348f = zh90Var;
        zh90Var.m218789z(new ViewOnClickListenerC8081b());
        this.f24349g.m220536i0(this.f24348f);
        setRenderManager(this.f24349g);
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
        this.f24354l = chj0Var;
    }

    @Override // p149l.wsf0
    /* JADX INFO: renamed from: y */
    public void mo38822y() {
        if (!IntlCountryCodeController.m28126v()) {
            m38797w();
            return;
        }
        View viewMo38809d = mo38809d();
        if (NullChecker.m81303a(this.f24354l) && NullChecker.m81303a(viewMo38809d)) {
            this.f24354l.m106898k(viewMo38809d);
        }
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24353k = null;
        m39528B();
    }

    public ProfileCardStackIntlTribeSlideOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24353k = null;
        m39528B();
    }

    @Override // p149l.wsf0
    public void setUsHomeExpandCardAnimHelper(ehj0 ehj0Var) {
    }
}
