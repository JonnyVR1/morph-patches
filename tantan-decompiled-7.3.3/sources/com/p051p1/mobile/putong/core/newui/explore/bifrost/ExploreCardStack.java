package com.p051p1.mobile.putong.core.newui.explore.bifrost;

import android.content.Context;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.tantanapp.common.utils.CrashHelper;
import p153l.cpf;
import p153l.dn4;
import p153l.nx2;
import p153l.pn4;
import p153l.txl0;
import p153l.w9l;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardStack extends BifrostLayout implements pn4 {

    /* JADX INFO: renamed from: f */
    public cpf f22135f;

    /* JADX INFO: renamed from: g */
    public w9l f22136g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack$a */
    public static /* synthetic */ class C7994a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22137a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f22138b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f22139c;

        static {
            int[] iArr = new int[VSwipeStack.OnCardSwipeResult.values().length];
            f22139c = iArr;
            try {
                iArr[VSwipeStack.OnCardSwipeResult.back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22139c[VSwipeStack.OnCardSwipeResult.pass.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22139c[VSwipeStack.OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardOperation.values().length];
            f22138b = iArr2;
            try {
                iArr2[CardOperation.SWIPE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22138b[CardOperation.SWIPE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22138b[CardOperation.SWIPE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SwipeDirection.values().length];
            f22137a = iArr3;
            try {
                iArr3[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22137a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22137a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ExploreCardStack(Context context, w9l w9lVar) {
        super(context);
        this.f22136g = w9lVar;
        m37365C();
    }

    /* JADX INFO: renamed from: C */
    private void m37365C() {
        setAllowUpSwipe(false);
        cpf cpfVar = new cpf(getContext());
        this.f22135f = cpfVar;
        cpfVar.m169656l0(this);
        this.f22135f.m169654k0(new dn4() { // from class: l.kpf
            @Override // p153l.dn4
            /* JADX INFO: renamed from: a */
            public final CardSwipeOutState mo39826a(txl0 txl0Var, CardOperation cardOperation, boolean z) {
                return this.f127885a.m37366D(txl0Var, cardOperation, z);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ CardSwipeOutState m37366D(txl0 txl0Var, CardOperation cardOperation, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultM205591s;
        SwipeDirection swipeDirection = SwipeDirection.LEFT;
        int i = C7994a.f22138b[cardOperation.ordinal()];
        if (i == 1) {
            swipeDirection = SwipeDirection.UP;
        } else if (i != 2 && i == 3) {
            swipeDirection = SwipeDirection.RIGHT;
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        try {
            onCardSwipeResultM205591s = this.f22136g.m205591s(txl0Var.f176568a, swipeDirection, z);
        } catch (Exception e) {
            VSwipeStack.OnCardSwipeResult onCardSwipeResult2 = VSwipeStack.OnCardSwipeResult.pass;
            CrashHelper.m82479c(new RuntimeException("划卡异常：" + e.toString() + Constants.SEPARATOR_COMMA + this.f22135f.mo140727b(), e));
            onCardSwipeResultM205591s = onCardSwipeResult2;
        }
        int i2 = C7994a.f22139c[onCardSwipeResultM205591s.ordinal()];
        if (i2 == 1) {
            return CardSwipeOutState.BACK;
        }
        if (i2 != 2) {
            return i2 != 3 ? CardSwipeOutState.BACK : CardSwipeOutState.STAY;
        }
        return CardSwipeOutState.PASS;
    }

    /* JADX INFO: renamed from: E */
    public final void m37367E(SwipeDirection swipeDirection, boolean z) {
        CardOperation cardOperation = CardOperation.SWIPE_UP;
        int i = C7994a.f22137a[swipeDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cardOperation = CardOperation.SWIPE_RIGHT;
            } else if (i == 3) {
                cardOperation = CardOperation.SWIPE_LEFT;
            }
        }
        this.f22135f.mo160614A0(cardOperation, z);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        w9l w9lVar = this.f22136g;
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        w9lVar.m205581e(z, f3);
    }

    /* JADX INFO: renamed from: r */
    public void m37369r(SwipeDirection swipeDirection, boolean z) {
        m37367E(swipeDirection, z);
    }

    public void setAdapter(nx2 nx2Var) {
        cpf cpfVar = this.f22135f;
        if (cpfVar == null) {
            return;
        }
        cpfVar.m169650i0(nx2Var);
        setRenderManager(this.f22135f);
    }

    public void setAllowUpSwipe(boolean z) {
        this.f24066b = z;
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37365C();
    }

    public ExploreCardStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m37365C();
    }
}
