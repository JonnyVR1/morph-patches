package p149l;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ax2 extends xw2 {

    /* JADX INFO: renamed from: l.ax2$a */
    public static /* synthetic */ class C15744a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72101a;

        static {
            int[] iArr = new int[CardOperation.values().length];
            f72101a = iArr;
            try {
                iArr[CardOperation.SWIPE_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72101a[CardOperation.SWIPE_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72101a[CardOperation.SWIPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ax2(Context context) {
        super(context);
    }

    @Override // p149l.xw2, p149l.bx2
    /* JADX INFO: renamed from: A0 */
    public boolean mo99351A0(CardOperation cardOperation, boolean z) {
        return (IntlCountryCodeController.m28126v() && le7.m149486h()) ? m99352D0(cardOperation, z) : super.mo99351A0(cardOperation, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m99352D0(CardOperation cardOperation, boolean z) {
        pol0 pol0VarM220509G = m220509G();
        if (pol0VarM220509G == null) {
            return false;
        }
        if (cardOperation == CardOperation.SWIPE_UP && !this.f205091b.f23324b) {
            return false;
        }
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        this.f205098i.m219535a(pol0VarM220509G.f150540k);
        View view = pol0VarM220509G.f150530a;
        this.f205095f.m172940e();
        this.f205098i.m219536b();
        this.f205094e.mo184171j(view);
        if (this.f205098i.m219542h(pol0VarM220509G.f150540k) && z && !zo0.f204072y) {
            if (BifrostLayout.f23321d) {
                cardOperation.name();
            }
            return false;
        }
        pol0VarM220509G.f150539j = VirtualState.PRE_OUT;
        int measuredHeight = view.getMeasuredHeight();
        og4 og4Var = new og4(pol0VarM220509G.f150540k, pol0VarM220509G);
        og4Var.f143804d = 500L;
        og4Var.f143802b = CardAnimType.ANIM_OUT;
        og4Var.f143808h = cardOperation;
        og4Var.f143809i = z ? zo0.f204072y : true;
        og4Var.m164160a(pol0VarM220509G.f150540k);
        og4Var.m164161b(VirtualState.RENDING);
        og4Var.f143805e = -1;
        qo0 qo0Var = new qo0();
        og4Var.f143806f = qo0Var;
        qo0Var.m175720e(view);
        qo0Var.f155523f = 1.0f;
        qo0Var.f155525h = 0.0f;
        qo0Var.f155521d = 0.0f;
        qo0Var.f155527j = 0.0f;
        qo0Var.f155529l = 1.0f;
        int i = C15744a.f72101a[cardOperation.ordinal()];
        if (i == 1 || i == 2 || i != 3) {
            qo0Var.f155519b = -measuredHeight;
        } else {
            qo0Var.f155519b = measuredHeight;
        }
        og4Var.m164175p(new PathInterpolator(zo0.f204063p, 0.0f, 1.0f, 1.0f));
        this.f205093d.mo122786f(og4Var);
        this.f205098i.m219538d(og4Var);
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        return true;
    }

    @Override // p149l.zw2
    @NonNull
    /* JADX INFO: renamed from: f */
    public jn2 mo99353f() {
        return IntlCountryCodeController.m28126v() ? new fhj0() : new ypn();
    }

    @Override // p149l.zw2
    @NonNull
    /* JADX INFO: renamed from: h */
    public q4j0 mo99354h() {
        return IntlCountryCodeController.m28126v() ? new ghj0(this) : super.mo99354h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    @Override // p149l.bx2
    /* JADX INFO: renamed from: r0 */
    public int mo99355r0(kj4 kj4Var, List<og4> list, pol0 pol0Var) {
        CardOperation cardOperation;
        if (!IntlCountryCodeController.m28126v()) {
            return super.mo99355r0(kj4Var, list, pol0Var);
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
        if (cardOperation == null || pol0Var.f150534e != 0) {
            return 0;
        }
        if (BifrostLayout.f23321d) {
            cardOperation.name();
        }
        og4 og4Var = new og4(pol0Var.f150540k, pol0Var);
        og4Var.f143802b = CardAnimType.ANIM_INSERT;
        og4Var.f143804d = zo0.f204057j;
        qo0 qo0Var = new qo0();
        qo0Var.m175717b();
        int i = C15744a.f72101a[cardOperation.ordinal()];
        if (i == 1 || i == 2) {
            qo0Var.f155520c = 0.0f;
            qo0Var.f155518a = -this.f205091b.getHeight();
            qo0Var.f155522e = 1.0f;
            qo0Var.f155524g = 0.0f;
            qo0Var.f155526i = 0.0f;
        } else if (i == 3) {
            qo0Var.f155520c = 0.0f;
            qo0Var.f155518a = this.f205091b.getHeight();
            qo0Var.f155522e = 1.0f;
            qo0Var.f155524g = 0.0f;
            qo0Var.f155526i = 0.0f;
        }
        pol0Var.f150538i = cardOperation;
        og4Var.m164160a(pol0Var.f150540k);
        og4Var.f143806f = qo0Var;
        list.add(og4Var);
        return -1;
    }
}
