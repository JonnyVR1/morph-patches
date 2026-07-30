package p009l;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import java.util.List;
import l.le7;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ax2 extends xw2 {

    /* JADX INFO: renamed from: l.ax2$a */
    public static /* synthetic */ class C0769a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9722a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f9722a = iArr;
            try {
                iArr[CardOperation.SWIPE_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9722a[CardOperation.SWIPE_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9722a[CardOperation.SWIPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ax2(Context context) {
        super(context);
    }

    @Override // p009l.xw2, p009l.bx2
    /* JADX INFO: renamed from: A0 */
    public boolean mo11678A0(CardOperation cardOperation, boolean z) {
        return (IntlCountryCodeController.v() && le7.h()) ? m11679D0(cardOperation, z) : super.mo11678A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m11679D0(CardOperation cardOperation, boolean z) {
        pol0 pol0VarM25991G = m25991G();
        if (pol0VarM25991G == null) {
            return false;
        }
        if (cardOperation == CardOperation.SWIPE_UP && !this.f23928b.f2102b) {
            return false;
        }
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        this.f23935i.m25879a(pol0VarM25991G.f18810k);
        View view = pol0VarM25991G.f18800a;
        this.f23932f.m20806e();
        this.f23935i.m25880b();
        this.f23931e.mo22190j(view);
        if (this.f23935i.m25886h(pol0VarM25991G.f18810k) && z && !zo0.f23796y) {
            if (BifrostLayout.f2099d) {
                cardOperation.name();
            }
            return false;
        }
        pol0VarM25991G.f18809j = VirtualState.PRE_OUT;
        int measuredHeight = view.getMeasuredHeight();
        og4 og4Var = new og4(pol0VarM25991G.f18810k, pol0VarM25991G);
        og4Var.f18009d = 500L;
        og4Var.f18007b = CardAnimType.ANIM_OUT;
        og4Var.f18013h = cardOperation;
        og4Var.f18014i = z ? zo0.f23796y : true;
        og4Var.m19739a(pol0VarM25991G.f18810k);
        og4Var.m19740b(VirtualState.RENDING);
        og4Var.f18010e = -1;
        qo0 qo0Var = new qo0();
        og4Var.f18011f = qo0Var;
        qo0Var.m21119e(view);
        qo0Var.f19400f = 1.0f;
        qo0Var.f19402h = 0.0f;
        qo0Var.f19398d = 0.0f;
        qo0Var.f19404j = 0.0f;
        qo0Var.f19406l = 1.0f;
        int i = C0769a.f9722a[cardOperation.ordinal()];
        if (i == 1 || i == 2 || i != 3) {
            qo0Var.f19396b = -measuredHeight;
        } else {
            qo0Var.f19396b = measuredHeight;
        }
        og4Var.m19754p(new PathInterpolator(zo0.f23787p, 0.0f, 1.0f, 1.0f));
        this.f23930d.mo14557f(og4Var);
        this.f23935i.m25882d(og4Var);
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p009l.zw2
    @NonNull
    /* JADX INFO: renamed from: f */
    public jn2 mo11680f() {
        return IntlCountryCodeController.v() ? new fhj0() : new ypn();
    }

    @Override // p009l.zw2
    @NonNull
    /* JADX INFO: renamed from: h */
    public q4j0 mo11681h() {
        return IntlCountryCodeController.v() ? new ghj0(this) : super.mo11681h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    @Override // p009l.bx2
    /* JADX INFO: renamed from: r0 */
    public int mo11682r0(kj4 kj4Var, List<og4> list, pol0 pol0Var) {
        CardOperation cardOperation;
        if (!IntlCountryCodeController.v()) {
            return super.mo11682r0(kj4Var, list, pol0Var);
        }
        int preBackOperation = kj4Var.getPreBackOperation();
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
        kj4Var.resetPreAction();
        if (cardOperation == null || pol0Var.f18804e != 0) {
            return 0;
        }
        if (BifrostLayout.f2099d) {
            cardOperation.name();
        }
        og4 og4Var = new og4(pol0Var.f18810k, pol0Var);
        og4Var.f18007b = CardAnimType.ANIM_INSERT;
        og4Var.f18009d = zo0.f23781j;
        qo0 qo0Var = new qo0();
        qo0Var.m21116b();
        int i = C0769a.f9722a[cardOperation.ordinal()];
        if (i == 1 || i == 2) {
            qo0Var.f19397c = 0.0f;
            qo0Var.f19395a = -this.f23928b.getHeight();
            qo0Var.f19399e = 1.0f;
            qo0Var.f19401g = 0.0f;
            qo0Var.f19403i = 0.0f;
        } else if (i == 3) {
            qo0Var.f19397c = 0.0f;
            qo0Var.f19395a = this.f23928b.getHeight();
            qo0Var.f19399e = 1.0f;
            qo0Var.f19401g = 0.0f;
            qo0Var.f19403i = 0.0f;
        }
        pol0Var.f18808i = cardOperation;
        og4Var.m19739a(pol0Var.f18810k);
        og4Var.f18011f = qo0Var;
        list.add(og4Var);
        return -1;
    }
}
