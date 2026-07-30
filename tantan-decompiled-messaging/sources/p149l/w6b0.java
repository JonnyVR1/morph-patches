package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001f¨\u00060"}, m87232d2 = {"Ll/w6b0;", "Ll/t6b0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "k0", "()V", "Ll/e30;", "onNegativeClick", "r0", "(Ll/e30;)V", "", "show", "s0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "p0", "(Landroid/view/View;)V", "G", "Lcom/p1/mobile/android/app/Act;", "H", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "I", "Ljava/lang/String;", "J", "Ll/j5b0;", "Landroid/widget/TextView;", "K", "Landroid/widget/TextView;", "q0", "()Landroid/widget/TextView;", "set_negative", "(Landroid/widget/TextView;)V", "_negative", "L", "Ll/e30;", "", "M", "pageState", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w6b0 extends t6b0 {

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
    public final j5b0 mediator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView _negative;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public e30<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int pageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m201736o0(w6b0 w6b0Var, View view) {
        e30<PurchaseType> e30Var = w6b0Var.onNegativeClick;
        if (e30Var != null) {
            e30Var.call(w6b0Var.purchaseType);
        }
        e30<Integer> e30VarM157950p = w6b0Var.m157950p();
        if (e30VarM157950p != null) {
            e30VarM157950p.call(0);
        }
    }

    @Override // p149l.t6b0
    /* JADX INFO: renamed from: k0 */
    public void mo167658k0() {
        View viewInflate = this.act.inflater().inflate(m6c0.f131523Q1, (ViewGroup) m187365Z(), false);
        viewInflate.getClass();
        m201737p0(viewInflate);
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-1, -2);
        ((ViewGroup.MarginLayoutParams) c0220a).leftMargin = svq.m186103c(20);
        ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = svq.m186103c(20);
        ((ViewGroup.MarginLayoutParams) c0220a).topMargin = svq.m186103c(16);
        ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = svq.m186103c(20);
        m187365Z().addView(viewInflate, c0220a);
        m201738q0().setText("不，谢谢");
        m201738q0().setTextColor(sab0.m182891i(this.purchaseType) ? Color.parseColor("#E8CA8A") : Color.parseColor("#d9d9d9"));
        xdl0.m208329E0(m201738q0(), new View.OnClickListener() { // from class: l.v6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w6b0.m201736o0(this.f180176a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m201737p0(View view) {
        x6b0.m207173a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final TextView m201738q0() {
        TextView textView = this._negative;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_negative");
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m201739r0(@Nullable e30<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m201740s0(boolean show) {
        if (!show) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && g6a.m124571t()) {
            m157945V();
        }
        this.pageState = 1;
    }
}
