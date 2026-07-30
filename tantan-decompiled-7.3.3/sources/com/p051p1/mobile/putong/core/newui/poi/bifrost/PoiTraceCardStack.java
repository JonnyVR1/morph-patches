package com.p051p1.mobile.putong.core.newui.poi.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.dn4;
import p153l.fsh;
import p153l.ii80;
import p153l.nx2;
import p153l.pn4;
import p153l.px2;
import p153l.txl0;

/* JADX INFO: loaded from: classes11.dex */
public class PoiTraceCardStack extends BifrostLayout implements pn4 {

    /* JADX INFO: renamed from: f */
    public px2 f27109f;

    /* JADX INFO: renamed from: g */
    public fsh f27110g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack$a */
    public class C8364a implements dn4 {
        public C8364a() {
        }

        @Override // p153l.dn4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM127188m;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8365b.f27112a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultM127188m = PoiTraceCardStack.this.f27110g.m127188m(txl0Var.f176568a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + PoiTraceCardStack.this.f27109f.mo140727b(), e));
                onCardSwipeResultM127188m = onCardSwipeResult2;
            }
            int i2 = C8365b.f27113b[onCardSwipeResultM127188m.ordinal()];
            if (i2 == 1) {
                return CardSwipeOutState.BACK;
            }
            if (i2 != 2) {
                return i2 != 3 ? CardSwipeOutState.BACK : CardSwipeOutState.STAY;
            }
            return CardSwipeOutState.PASS;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack$b */
    public static /* synthetic */ class C8365b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27112a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f27113b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f27114c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f27114c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27114c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27114c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f27113b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27113b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27113b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f27112a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27112a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27112a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public PoiTraceCardStack(Context context, fsh fshVar) {
        super(context);
        this.f27110g = fshVar;
        m44145D();
    }

    /* JADX INFO: renamed from: D */
    private void m44145D() {
        setAllowUpSwipe(true);
        ii80 ii80Var = new ii80(getContext());
        this.f27109f = ii80Var;
        ii80Var.m169656l0(this);
        this.f27109f.m169654k0(new C8364a());
    }

    /* JADX INFO: renamed from: E */
    private void m44146E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8365b.f27114c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f27109f.mo160614A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m44147A(SwipeDirection swipeDirection) {
        m44146E(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m44148d() {
        txl0 txl0VarM169622G = this.f27109f.m169622G();
        if (NullChecker.m82486a(txl0VarM169622G)) {
            return txl0VarM169622G.f176568a;
        }
        this.f27109f.m169636Y("get top null");
        return null;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f27109f.m169663p().mo105831f() == 1) {
            this.f27110g.m127189n(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m44149r(SwipeDirection swipeDirection, boolean z) {
        m44146E(swipeDirection, z);
    }

    public void setAdapter(nx2 nx2Var) {
        px2 px2Var = this.f27109f;
        if (px2Var == null) {
            return;
        }
        px2Var.m169650i0(nx2Var);
        setRenderManager(this.f27109f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f24066b = z;
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44145D();
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44145D();
    }
}
