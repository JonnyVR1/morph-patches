package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, m88121d2 = {"Ll/teb0;", "Ll/xeb0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "", "k0", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "q0", "(Landroid/view/View;)V", "G", "Lcom/p1/mobile/android/app/Act;", "H", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "I", "Ljava/lang/String;", "J", "Ll/ndb0;", "Landroid/widget/FrameLayout;", "K", "Landroid/widget/FrameLayout;", "s0", "()Landroid/widget/FrameLayout;", "set_guide_svip_root", "(Landroid/widget/FrameLayout;)V", "_guide_svip_root", "Lv/VLinear;", "L", "Lv/VLinear;", "get_guide_svip_title", "()Lv/VLinear;", "set_guide_svip_title", "(Lv/VLinear;)V", "_guide_svip_title", "Landroid/widget/TextView;", "M", "Landroid/widget/TextView;", "t0", "()Landroid/widget/TextView;", "set_guide_svip_subtitle", "(Landroid/widget/TextView;)V", "_guide_svip_subtitle", "Lv/VText;", "N", "Lv/VText;", "r0", "()Lv/VText;", "set_guide_svip_button", "(Lv/VText;)V", "_guide_svip_button", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class teb0 extends xeb0 {

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
    public FrameLayout _guide_svip_root;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VLinear _guide_svip_title;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView _guide_svip_subtitle;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VText _guide_svip_button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m190686p0(final teb0 teb0Var, View view) {
        y20<Integer> y20VarM152872p = teb0Var.m152872p();
        if (y20VarM152872p != null) {
            y20VarM152872p.call(0);
        }
        i4g0.m138520r("e_purchase_boost_svip_guide", "p_purchase_page");
        l51.m152888H(teb0Var.act, new Runnable() { // from class: l.seb0
            @Override // java.lang.Runnable
            public final void run() {
                teb0.m190687u0(this.f167495a);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m190687u0(teb0 teb0Var) {
        C8927c.m54567D0(teb0Var.act, wib0.m206559c(teb0Var.purchaseType) ? "p_accelerate_pop,svip_guide" : "p_purchase_page,e_purchase_boost_svip_guide,click", Privilege.see_who_likes_me, null, null, 0, null, null, null, null, false, false, 4088, null);
    }

    @Override // p153l.xeb0
    /* JADX INFO: renamed from: k0 */
    public void mo97329k0() {
        View viewInflate = this.act.inflater().inflate(rec0.f162479P1, (ViewGroup) m210661Z(), false);
        viewInflate.getClass();
        m190688q0(viewInflate);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, -2);
        ((ViewGroup.MarginLayoutParams) c0221a).leftMargin = txq.m193530c(20);
        ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = txq.m193530c(20);
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = txq.m193530c(16);
        ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = txq.m193530c(20);
        m210661Z().addView(viewInflate, c0221a);
        m190689r0().setTypeface(lyh0.m156283c(3), 1);
        if (wib0.m206559c(this.purchaseType)) {
            bnl0.m105524M(m190691t0(), false);
            bnl0.m105505C0(m190690s0(), qa00.m175859d(56.0f));
        } else {
            bnl0.m105505C0(m190690s0(), qa00.m175859d(76.0f));
        }
        bnl0.m105509E0(m190689r0(), new View.OnClickListener() { // from class: l.reb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                teb0.m190686p0(this.f162414a, view);
            }
        });
        i4g0.m138526x("e_purchase_boost_svip_guide", "p_purchase_page");
    }

    /* JADX INFO: renamed from: q0 */
    public final void m190688q0(View view) {
        ueb0.m195746a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final VText m190689r0() {
        VText vText = this._guide_svip_button;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_guide_svip_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final FrameLayout m190690s0() {
        FrameLayout frameLayout = this._guide_svip_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_guide_svip_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public final TextView m190691t0() {
        TextView textView = this._guide_svip_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_guide_svip_subtitle");
        return null;
    }
}
