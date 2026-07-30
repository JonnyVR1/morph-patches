package p153l;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class px2 extends mx2 {

    /* JADX INFO: renamed from: l.px2$a */
    public static /* synthetic */ class C19460a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154461a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f154461a = iArr;
            try {
                iArr[CardOperation.SWIPE_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f154461a[CardOperation.SWIPE_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f154461a[CardOperation.SWIPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public px2(Context context) {
        super(context);
    }

    @Override // p153l.mx2, p153l.qx2
    /* JADX INFO: renamed from: A0 */
    public boolean mo160614A0(CardOperation cardOperation, boolean z) {
        return (IntlCountryCodeController.m29125v() && pf7.m172093h()) ? m174102D0(cardOperation, z) : super.mo160614A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m174102D0(CardOperation cardOperation, boolean z) {
        txl0 txl0VarM169622G = m169622G();
        if (txl0VarM169622G == null) {
            return false;
        }
        if (cardOperation == CardOperation.SWIPE_UP && !this.f149592b.f24066b) {
            return false;
        }
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        this.f149599i.m202046a(txl0VarM169622G.f176578k);
        View view = txl0VarM169622G.f176568a;
        this.f149596f.m195495e();
        this.f149599i.m202047b();
        this.f149595e.mo165055j(view);
        if (this.f149599i.m202053h(txl0VarM169622G.f176578k) && z && !vo0.f184978y) {
            if (BifrostLayout.f24063d) {
                cardOperation.name();
            }
            return false;
        }
        txl0VarM169622G.f176577j = VirtualState.PRE_OUT;
        int measuredHeight = view.getMeasuredHeight();
        nh4 nh4Var = new nh4(txl0VarM169622G.f176578k, txl0VarM169622G);
        nh4Var.f141910d = 500L;
        nh4Var.f141908b = CardAnimType.ANIM_OUT;
        nh4Var.f141914h = cardOperation;
        nh4Var.f141915i = z ? vo0.f184978y : true;
        nh4Var.m163026a(txl0VarM169622G.f176578k);
        nh4Var.m163027b(VirtualState.RENDING);
        nh4Var.f141911e = -1;
        mo0 mo0Var = new mo0();
        nh4Var.f141912f = mo0Var;
        mo0Var.m159223e(view);
        mo0Var.f137758f = 1.0f;
        mo0Var.f137760h = 0.0f;
        mo0Var.f137756d = 0.0f;
        mo0Var.f137762j = 0.0f;
        mo0Var.f137764l = 1.0f;
        int i = C19460a.f154461a[cardOperation.ordinal()];
        if (i == 1 || i == 2 || i != 3) {
            mo0Var.f137754b = -measuredHeight;
        } else {
            mo0Var.f137754b = measuredHeight;
        }
        nh4Var.m163041p(new PathInterpolator(vo0.f184969p, 0.0f, 1.0f, 1.0f));
        this.f149594d.mo164121f(nh4Var);
        this.f149599i.m202049d(nh4Var);
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p153l.ox2
    @NonNull
    /* JADX INFO: renamed from: f */
    public qn2 mo111754f() {
        return IntlCountryCodeController.m29125v() ? new iqj0() : new yrn();
    }

    @Override // p153l.ox2
    @NonNull
    /* JADX INFO: renamed from: h */
    public udj0 mo169647h() {
        return IntlCountryCodeController.m29125v() ? new jqj0(this) : super.mo169647h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    @Override // p153l.qx2
    /* JADX INFO: renamed from: r0 */
    public int mo174103r0(jk4 jk4Var, List<nh4> list, txl0 txl0Var) {
        CardOperation cardOperation;
        if (!IntlCountryCodeController.m29125v()) {
            return super.mo174103r0(jk4Var, list, txl0Var);
        }
        int preBackOperation = jk4Var.getPreBackOperation();
        if (preBackOperation < 0) {
            cardOperation = null;
        } else if (preBackOperation == 0) {
            cardOperation = CardOperation.SWIPE_LEFT;
        } else if (preBackOperation == 1) {
            cardOperation = CardOperation.SWIPE_RIGHT;
        } else if (preBackOperation != 2) {
            cardOperation = null;
        } else {
            cardOperation = CardOperation.SWIPE_UP;
        }
        jk4Var.resetPreAction();
        if (cardOperation == null || txl0Var.f176572e != 0) {
            return 0;
        }
        if (BifrostLayout.f24063d) {
            cardOperation.name();
        }
        nh4 nh4Var = new nh4(txl0Var.f176578k, txl0Var);
        nh4Var.f141908b = CardAnimType.ANIM_INSERT;
        nh4Var.f141910d = vo0.f184963j;
        mo0 mo0Var = new mo0();
        mo0Var.m159220b();
        int i = C19460a.f154461a[cardOperation.ordinal()];
        if (i == 1 || i == 2) {
            mo0Var.f137755c = 0.0f;
            mo0Var.f137753a = -this.f149592b.getHeight();
            mo0Var.f137757e = 1.0f;
            mo0Var.f137759g = 0.0f;
            mo0Var.f137761i = 0.0f;
        } else if (i == 3) {
            mo0Var.f137755c = 0.0f;
            mo0Var.f137753a = this.f149592b.getHeight();
            mo0Var.f137757e = 1.0f;
            mo0Var.f137759g = 0.0f;
            mo0Var.f137761i = 0.0f;
        }
        txl0Var.f176576i = cardOperation;
        nh4Var.m163026a(txl0Var.f176578k);
        nh4Var.f141912f = mo0Var;
        list.add(nh4Var);
        return -1;
    }
}
