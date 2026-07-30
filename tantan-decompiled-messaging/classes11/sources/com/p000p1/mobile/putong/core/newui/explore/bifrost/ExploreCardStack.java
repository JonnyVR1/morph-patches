package com.p000p1.mobile.putong.core.newui.explore.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.CrashHelper;
import p009l.em4;
import p009l.g7l;
import p009l.pol0;
import p009l.qm4;
import p009l.vnf;
import p009l.yw2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExploreCardStack extends BifrostLayout implements qm4 {

    /* JADX INFO: renamed from: f */
    public vnf f171f;

    /* JADX INFO: renamed from: g */
    public g7l f172g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack$a */
    public static /* synthetic */ class C0007a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f173a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f174b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f175c;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f175c = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f175c[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f175c[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardOperation.values().length];
            f174b = iArr2;
            try {
                iArr2[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f174b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f174b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SwipeDirection.values().length];
            f173a = iArr3;
            try {
                iArr3[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f173a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f173a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ExploreCardStack(Context context, g7l g7lVar) {
        super(context);
        this.f172g = g7lVar;
        m291C();
    }

    /* JADX INFO: renamed from: C */
    private void m291C() {
        setAllowUpSwipe(false);
        vnf vnfVar = new vnf(getContext());
        this.f171f = vnfVar;
        vnfVar.m26024l0(this);
        this.f171f.m26022k0(new em4() { // from class: l.dof
            @Override // p009l.em4
            /* JADX INFO: renamed from: a */
            public final CardSwipeOutState mo2819a(pol0 pol0Var, CardOperation cardOperation, boolean z) {
                return this.f11926a.m292D(pol0Var, cardOperation, z);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ CardSwipeOutState m292D(pol0 pol0Var, CardOperation cardOperation, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultM14815s;
        SwipeDirection swipeDirection = SwipeDirection.LEFT;
        int i = C0007a.f174b[cardOperation.ordinal()];
        if (i == 1) {
            swipeDirection = SwipeDirection.UP;
        } else if (i != 2 && i == 3) {
            swipeDirection = SwipeDirection.RIGHT;
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        try {
            onCardSwipeResultM14815s = this.f172g.m14815s(pol0Var.f18800a, swipeDirection, z);
        } catch (Exception e) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
            CrashHelper.c(new RuntimeException("划卡异常：" + e.toString() + "," + this.f171f.mo12313b(), e));
            onCardSwipeResultM14815s = onCardSwipeResult2;
        }
        int i2 = C0007a.f175c[onCardSwipeResultM14815s.ordinal()];
        if (i2 == 1) {
            return CardSwipeOutState.BACK;
        }
        if (i2 != 2) {
            return i2 != 3 ? CardSwipeOutState.BACK : CardSwipeOutState.STAY;
        }
        return CardSwipeOutState.PASS;
    }

    /* JADX INFO: renamed from: E */
    public final void m293E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C0007a.f173a[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f171f.mo11678A0(cardOperation, z);
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        g7l g7lVar = this.f172g;
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        g7lVar.m14804e(z, f3);
    }

    /* JADX INFO: renamed from: r */
    public void m295r(SwipeDirection swipeDirection, boolean z) {
        m293E(swipeDirection, z);
    }

    public void setAdapter(yw2 yw2Var) {
        vnf vnfVar = this.f171f;
        if (vnfVar == null) {
            return;
        }
        vnfVar.m26018i0(yw2Var);
        setRenderManager(this.f171f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f2102b = z;
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m291C();
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m291C();
    }
}
