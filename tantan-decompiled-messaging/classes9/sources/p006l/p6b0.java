package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.m6c0;
import l.q6b0;
import l.sab0;
import l.svq;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Ll/p6b0;", "Ll/t6b0;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "k0", "()V", "Landroid/view/View;", "view", "q0", "(Landroid/view/View;)V", "G", "Lcom/p1/mobile/android/app/Act;", "H", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "I", "Ljava/lang/String;", "J", "Ll/j5b0;", "Landroid/widget/FrameLayout;", "K", "Landroid/widget/FrameLayout;", "s0", "()Landroid/widget/FrameLayout;", "set_guide_svip_root", "(Landroid/widget/FrameLayout;)V", "_guide_svip_root", "Lv/VLinear;", "L", "Lv/VLinear;", "get_guide_svip_title", "()Lv/VLinear;", "set_guide_svip_title", "(Lv/VLinear;)V", "_guide_svip_title", "Landroid/widget/TextView;", "M", "Landroid/widget/TextView;", "t0", "()Landroid/widget/TextView;", "set_guide_svip_subtitle", "(Landroid/widget/TextView;)V", "_guide_svip_subtitle", "Lv/VText;", "N", "Lv/VText;", "r0", "()Lv/VText;", "set_guide_svip_button", "(Lv/VText;)V", "_guide_svip_button", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p6b0 extends t6b0 {

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
    public FrameLayout _guide_svip_root;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VLinear _guide_svip_title;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView _guide_svip_subtitle;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VText _guide_svip_button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m21043p0(final p6b0 p6b0Var, View view) {
        e30<Integer> e30VarM19677p = p6b0Var.m19677p();
        if (e30VarM19677p != null) {
            e30VarM19677p.call(0);
        }
        zvf0.r("e_purchase_boost_svip_guide", "p_purchase_page");
        e51.H(p6b0Var.act, new Runnable() { // from class: l.o6b0
            @Override // java.lang.Runnable
            public final void run() {
                p6b0.m21044u0(this.f18032a);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m21044u0(p6b0 p6b0Var) {
        c.D0(p6b0Var.act, sab0.c(p6b0Var.purchaseType) ? "p_accelerate_pop,svip_guide" : "p_purchase_page,e_purchase_boost_svip_guide,click", Privilege.see_who_likes_me, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4088, (Object) null);
    }

    @Override // p006l.t6b0
    /* JADX INFO: renamed from: k0 */
    public void mo21045k0() {
        View viewInflate = this.act.inflater().inflate(m6c0.P1, (ViewGroup) m24486Z(), false);
        viewInflate.getClass();
        m21046q0(viewInflate);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -2);
        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = svq.c(20);
        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = svq.c(20);
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = svq.c(16);
        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = svq.c(20);
        m24486Z().addView(viewInflate, (ViewGroup.LayoutParams) aVar);
        m21047r0().setTypeface(eqh0.c(3), 1);
        if (sab0.c(this.purchaseType)) {
            xdl0.M(m21049t0(), false);
            xdl0.C0(m21048s0(), t100.d(56.0f));
        } else {
            xdl0.C0(m21048s0(), t100.d(76.0f));
        }
        xdl0.E0(m21047r0(), new View.OnClickListener() { // from class: l.n6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p6b0.m21043p0(this.f17508a, view);
            }
        });
        zvf0.x("e_purchase_boost_svip_guide", "p_purchase_page");
    }

    /* JADX INFO: renamed from: q0 */
    public final void m21046q0(View view) {
        q6b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m21047r0() {
        VText vText = this._guide_svip_button;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_guide_svip_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final FrameLayout m21048s0() {
        FrameLayout frameLayout = this._guide_svip_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_guide_svip_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final TextView m21049t0() {
        TextView textView = this._guide_svip_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_guide_svip_subtitle");
        return null;
    }
}
