package com.p000p1.mobile.putong.core.newui.myinterestpeople;

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
import p009l.g1a;
import p009l.pol0;
import p009l.qm4;
import p009l.yw2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreMyInterestPeopleCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public ax2 f4817f;

    /* JADX INFO: renamed from: g */
    public g1a f4818g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack$a */
    public class C0350a implements em4 {
        public C0350a() {
        }

        @Override // p009l.em4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo2819a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo6796d;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C0351b.f4820a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultMo6796d = CoreMyInterestPeopleCardStack.this.f4818g.mo6796d(pol0Var.f18800a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.c(new RuntimeException("划卡异常：" + e.toString() + "," + CoreMyInterestPeopleCardStack.this.f4817f.mo12313b(), e));
                onCardSwipeResultMo6796d = onCardSwipeResult2;
            }
            int i2 = C0351b.f4821b[onCardSwipeResultMo6796d.ordinal()];
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
    public static /* synthetic */ class C0351b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4820a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f4821b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f4822c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f4822c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4822c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4822c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f4821b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4821b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4821b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f4820a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4820a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4820a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public CoreMyInterestPeopleCardStack(Context context, g1a g1aVar) {
        super(context);
        this.f4818g = g1aVar;
        m6775B();
    }

    /* JADX INFO: renamed from: B */
    private void m6775B() {
        setAllowUpSwipe(true);
        ca80 ca80Var = new ca80(getContext());
        this.f4817f = ca80Var;
        ca80Var.m26024l0(this);
        this.f4817f.m26022k0(new C0350a());
    }

    /* JADX INFO: renamed from: C */
    private void m6776C(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0351b.f4822c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f4817f.mo11678A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m6777A(SwipeDirection swipeDirection) {
        m6776C(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m6778d() {
        pol0 pol0VarM25991G = this.f4817f.m25991G();
        if (NullChecker.a(pol0VarM25991G)) {
            return pol0VarM25991G.f18800a;
        }
        this.f4817f.m26005Y("get top null");
        return null;
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f4817f.m26031p().mo11924f() == 1) {
            this.f4818g.mo6810u0(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m6779r(SwipeDirection swipeDirection, boolean z) {
        m6776C(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        ax2 ax2Var = this.f4817f;
        if (ax2Var == null) {
            return;
        }
        ax2Var.m26018i0(yw2Var);
        setRenderManager(this.f4817f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f2102b = z;
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6775B();
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6775B();
    }
}
