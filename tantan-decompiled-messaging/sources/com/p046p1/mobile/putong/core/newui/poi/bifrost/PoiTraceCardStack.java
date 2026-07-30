package com.p046p1.mobile.putong.core.newui.poi.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.ax2;
import p149l.ca80;
import p149l.em4;
import p149l.pol0;
import p149l.qm4;
import p149l.qqh;
import p149l.yw2;

/* JADX INFO: loaded from: classes11.dex */
public class PoiTraceCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public ax2 f26367f;

    /* JADX INFO: renamed from: g */
    public qqh f26368g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack$a */
    public class C8213a implements em4 {
        public C8213a() {
        }

        @Override // p149l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo38823a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM175917m;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8214b.f26370a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultM175917m = PoiTraceCardStack.this.f26368g.m175917m(pol0Var.f150530a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.m81296c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + PoiTraceCardStack.this.f26367f.mo104260b(), e));
                onCardSwipeResultM175917m = onCardSwipeResult2;
            }
            int i2 = C8214b.f26371b[onCardSwipeResultM175917m.ordinal()];
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
    public static /* synthetic */ class C8214b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26370a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26371b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f26372c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f26372c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26372c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26372c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f26371b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26371b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26371b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f26370a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26370a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26370a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public PoiTraceCardStack(Context context, qqh qqhVar) {
        super(context);
        this.f26368g = qqhVar;
        m43134D();
    }

    /* JADX INFO: renamed from: D */
    private void m43134D() {
        setAllowUpSwipe(true);
        ca80 ca80Var = new ca80(getContext());
        this.f26367f = ca80Var;
        ca80Var.m220542l0(this);
        this.f26367f.m220540k0(new C8213a());
    }

    /* JADX INFO: renamed from: E */
    private void m43135E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8214b.f26372c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f26367f.mo99351A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m43136A(SwipeDirection swipeDirection) {
        m43135E(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m43137d() {
        pol0 pol0VarM220509G = this.f26367f.m220509G();
        if (NullChecker.m81303a(pol0VarM220509G)) {
            return pol0VarM220509G.f150530a;
        }
        this.f26367f.m220523Y("get top null");
        return null;
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f26367f.m220549p().mo100899f() == 1) {
            this.f26368g.m175918n(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m43138r(SwipeDirection swipeDirection, boolean z) {
        m43135E(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        ax2 ax2Var = this.f26367f;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m220536i0(yw2Var);
        setRenderManager(this.f26367f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f23324b = z;
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43134D();
    }

    public PoiTraceCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43134D();
    }
}
