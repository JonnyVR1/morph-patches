package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001f¨\u00060"}, m88121d2 = {"Ll/afb0;", "Ll/xeb0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "", "k0", "()V", "Ll/y20;", "onNegativeClick", "r0", "(Ll/y20;)V", "", "show", "s0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "p0", "(Landroid/view/View;)V", "G", "Lcom/p1/mobile/android/app/Act;", "H", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "I", "Ljava/lang/String;", "J", "Ll/ndb0;", "Landroid/widget/TextView;", "K", "Landroid/widget/TextView;", "q0", "()Landroid/widget/TextView;", "set_negative", "(Landroid/widget/TextView;)V", "_negative", "L", "Ll/y20;", "", "M", "pageState", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class afb0 extends xeb0 {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final ndb0 mediator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView _negative;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int pageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m97328o0(afb0 afb0Var, View view) {
        y20<PurchaseType> y20Var = afb0Var.onNegativeClick;
        if (y20Var != null) {
            y20Var.call(afb0Var.purchaseType);
        }
        y20<Integer> y20VarM152872p = afb0Var.m152872p();
        if (y20VarM152872p != null) {
            y20VarM152872p.call(0);
        }
    }

    @Override // p153l.xeb0
    /* JADX INFO: renamed from: k0 */
    public void mo97329k0() {
        View viewInflate = this.act.inflater().inflate(rec0.f162483Q1, (ViewGroup) m210661Z(), false);
        viewInflate.getClass();
        m97330p0(viewInflate);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, -2);
        ((ViewGroup.MarginLayoutParams) c0221a).leftMargin = txq.m193530c(20);
        ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = txq.m193530c(20);
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = txq.m193530c(16);
        ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = txq.m193530c(20);
        m210661Z().addView(viewInflate, c0221a);
        m97331q0().setText("不，谢谢");
        m97331q0().setTextColor(wib0.m206565i(this.purchaseType) ? Color.parseColor("#E8CA8A") : Color.parseColor("#d9d9d9"));
        bnl0.m105509E0(m97331q0(), new View.OnClickListener() { // from class: l.zeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                afb0.m97328o0(this.f203989a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m97330p0(View view) {
        bfb0.m103881a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final TextView m97331q0() {
        TextView textView = this._negative;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_negative");
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m97332r0(@Nullable y20<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m97333s0(boolean show) {
        if (!show) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && s7a.m184991t()) {
            m152866V();
        }
        this.pageState = 1;
    }
}
