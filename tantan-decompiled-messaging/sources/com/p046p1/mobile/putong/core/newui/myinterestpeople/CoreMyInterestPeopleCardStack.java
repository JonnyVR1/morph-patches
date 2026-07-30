package com.p046p1.mobile.putong.core.newui.myinterestpeople;

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
import p149l.g1a;
import p149l.pol0;
import p149l.qm4;
import p149l.yw2;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestPeopleCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public ax2 f26039f;

    /* JADX INFO: renamed from: g */
    public g1a f26040g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack$a */
    public class C8186a implements em4 {
        public C8186a() {
        }

        @Override // p149l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo38823a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo42633d;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8187b.f26042a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultMo42633d = CoreMyInterestPeopleCardStack.this.f26040g.mo42633d(pol0Var.f150530a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.m81296c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + CoreMyInterestPeopleCardStack.this.f26039f.mo104260b(), e));
                onCardSwipeResultMo42633d = onCardSwipeResult2;
            }
            int i2 = C8187b.f26043b[onCardSwipeResultMo42633d.ordinal()];
            if (i2 == 1) {
                return CardSwipeOutState.BACK;
            }
            if (i2 != 2) {
                return i2 != 3 ? CardSwipeOutState.BACK : CardSwipeOutState.STAY;
            }
            return CardSwipeOutState.PASS;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack$b */
    public static /* synthetic */ class C8187b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26042a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26043b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f26044c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f26044c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26044c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26044c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f26043b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26043b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26043b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f26042a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26042a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26042a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public CoreMyInterestPeopleCardStack(Context context, g1a g1aVar) {
        super(context);
        this.f26040g = g1aVar;
        m42612B();
    }

    /* JADX INFO: renamed from: B */
    private void m42612B() {
        setAllowUpSwipe(true);
        ca80 ca80Var = new ca80(getContext());
        this.f26039f = ca80Var;
        ca80Var.m220542l0(this);
        this.f26039f.m220540k0(new C8186a());
    }

    /* JADX INFO: renamed from: C */
    private void m42613C(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8187b.f26044c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f26039f.mo99351A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m42614A(SwipeDirection swipeDirection) {
        m42613C(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m42615d() {
        pol0 pol0VarM220509G = this.f26039f.m220509G();
        if (NullChecker.m81303a(pol0VarM220509G)) {
            return pol0VarM220509G.f150530a;
        }
        this.f26039f.m220523Y("get top null");
        return null;
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f26039f.m220549p().mo100899f() == 1) {
            this.f26040g.mo42647u0(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m42616r(SwipeDirection swipeDirection, boolean z) {
        m42613C(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        ax2 ax2Var = this.f26039f;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m220536i0(yw2Var);
        setRenderManager(this.f26039f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f23324b = z;
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m42612B();
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42612B();
    }
}
