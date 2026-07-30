package com.p051p1.mobile.putong.core.newui.myinterestpeople;

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
import p153l.ii80;
import p153l.nx2;
import p153l.pn4;
import p153l.px2;
import p153l.r2a;
import p153l.txl0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestPeopleCardStack extends BifrostLayout implements pn4 {

    /* JADX INFO: renamed from: f */
    public px2 f26781f;

    /* JADX INFO: renamed from: g */
    public r2a f26782g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack$a */
    public class C8337a implements dn4 {
        public C8337a() {
        }

        @Override // p153l.dn4
        /* JADX INFO: renamed from: a */
        public CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultMo43644d;
            SwipeDirection swipeDirection = SwipeDirection.LEFT;
            int i = C8338b.f26784a[cardOperation.ordinal()];
            if (i == 1) {
                swipeDirection = SwipeDirection.UP;
            } else if (i != 2 && i == 3) {
                swipeDirection = SwipeDirection.RIGHT;
            }
            VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
            try {
                onCardSwipeResultMo43644d = CoreMyInterestPeopleCardStack.this.f26782g.mo43644d(txl0Var.f176568a, swipeDirection, z);
            } catch (Exception e) {
                VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
                CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + CoreMyInterestPeopleCardStack.this.f26781f.mo140727b(), e));
                onCardSwipeResultMo43644d = onCardSwipeResult2;
            }
            int i2 = C8338b.f26785b[onCardSwipeResultMo43644d.ordinal()];
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
    public static /* synthetic */ class C8338b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26784a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26785b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f26786c;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f26786c = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26786c[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26786c[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f26785b = iArr2;
            try {
                iArr2[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26785b[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26785b[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[CardOperation.values().length];
            f26784a = iArr3;
            try {
                iArr3[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26784a[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26784a[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public CoreMyInterestPeopleCardStack(Context context, r2a r2aVar) {
        super(context);
        this.f26782g = r2aVar;
        m43623B();
    }

    /* JADX INFO: renamed from: B */
    private void m43623B() {
        setAllowUpSwipe(true);
        ii80 ii80Var = new ii80(getContext());
        this.f26781f = ii80Var;
        ii80Var.m169656l0(this);
        this.f26781f.m169654k0(new C8337a());
    }

    /* JADX INFO: renamed from: C */
    private void m43624C(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C8338b.f26786c[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f26781f.mo160614A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: A */
    public void m43625A(SwipeDirection swipeDirection) {
        m43624C(swipeDirection, false);
    }

    /* JADX INFO: renamed from: d */
    public View m43626d() {
        txl0 txl0VarM169622G = this.f26781f.m169622G();
        if (NullChecker.m82486a(txl0VarM169622G)) {
            return txl0VarM169622G.f176568a;
        }
        this.f26781f.m169636Y("get top null");
        return null;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (this.f26781f.m169663p().mo105831f() == 1) {
            this.f26782g.mo43659v0(f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m43627r(SwipeDirection swipeDirection, boolean z) {
        m43624C(swipeDirection, z);
    }

    public void setAdapter(nx2 nx2Var) {
        px2 px2Var = this.f26781f;
        if (px2Var == null) {
            return;
        }
        px2Var.m169650i0(nx2Var);
        setRenderManager(this.f26781f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f24066b = z;
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43623B();
    }

    public CoreMyInterestPeopleCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43623B();
    }
}
