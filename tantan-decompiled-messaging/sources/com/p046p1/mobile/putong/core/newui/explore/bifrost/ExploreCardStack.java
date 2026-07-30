package com.p046p1.mobile.putong.core.newui.explore.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.tantanapp.common.utils.CrashHelper;
import p149l.em4;
import p149l.g7l;
import p149l.pol0;
import p149l.qm4;
import p149l.vnf;
import p149l.yw2;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public vnf f21393f;

    /* JADX INFO: renamed from: g */
    public g7l f21394g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack$a */
    public static /* synthetic */ class C7843a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21395a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f21396b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f21397c;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f21397c = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21397c[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21397c[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardOperation.values().length];
            f21396b = iArr2;
            try {
                iArr2[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21396b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21396b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SwipeDirection.values().length];
            f21395a = iArr3;
            try {
                iArr3[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21395a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21395a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ExploreCardStack(Context context, g7l g7lVar) {
        super(context);
        this.f21394g = g7lVar;
        m36362C();
    }

    /* JADX INFO: renamed from: C */
    private void m36362C() {
        setAllowUpSwipe(false);
        vnf vnfVar = new vnf(getContext());
        this.f21393f = vnfVar;
        vnfVar.m220542l0(this);
        this.f21393f.m220540k0(new em4() { // from class: l.dof
            @Override // p149l.em4
            /* JADX INFO: renamed from: a */
            public final CardSwipeOutState mo38823a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
                return this.f87165a.m36363D(pol0Var, cardOperation, z);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ CardSwipeOutState m36363D(pol0 pol0Var, CardOperation cardOperation, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultM124710s;
        SwipeDirection swipeDirection = SwipeDirection.LEFT;
        int i = C7843a.f21396b[cardOperation.ordinal()];
        if (i == 1) {
            swipeDirection = SwipeDirection.UP;
        } else if (i != 2 && i == 3) {
            swipeDirection = SwipeDirection.RIGHT;
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        try {
            onCardSwipeResultM124710s = this.f21394g.m124710s(pol0Var.f150530a, swipeDirection, z);
        } catch (Exception e) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
            CrashHelper.m81296c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + this.f21393f.mo104260b(), e));
            onCardSwipeResultM124710s = onCardSwipeResult2;
        }
        int i2 = C7843a.f21397c[onCardSwipeResultM124710s.ordinal()];
        if (i2 == 1) {
            return CardSwipeOutState.BACK;
        }
        if (i2 != 2) {
            return i2 != 3 ? CardSwipeOutState.BACK : CardSwipeOutState.STAY;
        }
        return CardSwipeOutState.PASS;
    }

    /* JADX INFO: renamed from: E */
    public final void m36364E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C7843a.f21395a[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f21393f.mo99351A0(cardOperation, z);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        g7l g7lVar = this.f21394g;
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        g7lVar.m124700e(z, f3);
    }

    /* JADX INFO: renamed from: r */
    public void m36366r(SwipeDirection swipeDirection, boolean z) {
        m36364E(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        vnf vnfVar = this.f21393f;
        if (vnfVar == null) {
            return;
        }
        vnfVar.m220536i0(yw2Var);
        setRenderManager(this.f21393f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f23324b = z;
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36362C();
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36362C();
    }
}
