package com.p000p1.mobile.putong.core.newui.poi.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p009l.ax2;
import p009l.ca80;
import p009l.em4;
import p009l.pol0;
import p009l.qm4;
import p009l.qqh;
import p009l.yw2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PoiTraceCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public ax2 f5145f;

    /* JADX INFO: renamed from: g */
    public qqh f5146g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack$a */
    public class C0377a implements em4 {
        public C0377a() {
        }

        @Override // p009l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo2819a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM21169m;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C0378b.f5148a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultM21169m = PoiTraceCardStack.this.f5146g.m21169m(pol0Var.f18800a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.c(new RuntimeException("划卡异常：" + e.toString() + "," + PoiTraceCardStack.this.f5145f.mo12313b(), e));
                onCardSwipeResultM21169m = onCardSwipeResult2;
            }
            int i2 = C0378b.f5149b[onCardSwipeResultM21169m.ordinal()];
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
    public static /* synthetic */ class C0378b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5148a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5149b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f5150c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f5150c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5150c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5150c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f5149b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5149b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5149b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f5148a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5148a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5148a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public PoiTraceCardStack(Context context, qqh qqhVar) {
        super(context);
        this.f5146g = qqhVar;
        m7349D();
    }

    /* JADX INFO: renamed from: D */
    private void m7349D() {
        setAllowUpSwipe(true);
        ca80 ca80Var = new ca80(getContext());
        this.f5145f = ca80Var;
        ca80Var.m26024l0(this);
        this.f5145f.m26022k0(new C0377a());
    }

    /* JADX INFO: renamed from: E */
    private void m7350E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0378b.f5150c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f5145f.mo11678A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m7351A(SwipeDirection swipeDirection) {
        m7350E(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m7352d() {
        pol0 pol0VarM25991G = this.f5145f.m25991G();
        if (NullChecker.a(pol0VarM25991G)) {
            return pol0VarM25991G.f18800a;
        }
        this.f5145f.m26005Y("get top null");
        return null;
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f5145f.m26031p().mo11924f() == 1) {
            this.f5146g.m21170n(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m7353r(SwipeDirection swipeDirection, boolean z) {
        m7350E(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        ax2 ax2Var = this.f5145f;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m26018i0(yw2Var);
        setRenderManager(this.f5145f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f2102b = z;
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7349D();
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7349D();
    }
}
