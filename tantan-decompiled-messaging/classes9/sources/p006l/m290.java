package p006l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.e190;
import l.e30;
import l.e51;
import l.eqh0;
import l.j760;
import l.mep0;
import l.n6a;
import l.svq;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Ll/m290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", "C", "(Z)V", "E", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", "y", "Lcom/tantan/library/svga/SVGAnimationView;", "G", "(Lcom/tantan/library/svga/SVGAnimationView;Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "recoverOdiamondBottomView", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "rootFrameLayout", "g", "Lcom/tantan/library/svga/SVGAnimationView;", "shimmerSVGAView", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Lcom/p1/mobile/putong/core/data/Merchandise;", "i", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class m290 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView recoverOdiamondBottomView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public FrameLayout rootFrameLayout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView shimmerSVGAView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Runnable backgroundShimmerRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: l.m290$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/m290$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1002b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f16766b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f16767c;

        public C1002b(SVGAnimationView sVGAnimationView, boolean z) {
            this.f16766b = sVGAnimationView;
            this.f16767c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m19114a(m290 m290Var, boolean z) {
            m290Var.m19100E(z);
        }

        public void onFinished() {
            if (m290.this.backgroundShimmerRunnable == null) {
                final m290 m290Var = m290.this;
                final boolean z = this.f16767c;
                m290Var.backgroundShimmerRunnable = new Runnable() { // from class: l.n290
                    @Override // java.lang.Runnable
                    public final void run() {
                        m290.C1002b.m19114a(m290Var, z);
                    }
                };
            }
            e51.J(m290.this.backgroundShimmerRunnable);
            e51.H(this.f16766b.getContext(), m290.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m290(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m19096A(m290 m290Var, View view) {
        zvf0.r(m290Var.mo11695h(), m290Var.m11751f());
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        m290Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: B */
    public static final void m19097B(m290 m290Var, View view) {
        zvf0.r(m290Var.m19113y(), m290Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "diamond"), vwb.Y("discount_type", "diamond_rebuy"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        m290Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: C */
    private final void m19098C(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, (Object) null);
                xdl0.M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                xdl0.Q0(privilegeEntranceSingleTextWithIconBgView, new e30() { // from class: l.g290
                    public final void call(Object obj) {
                        m290.m19099D(this.f13031a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC0495a5.m11748l(this, getPrivilegeEntranceInfo().c(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m19099D(m290 m290Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC0495a5.m11748l(m290Var, m290Var.getPrivilegeEntranceInfo().c(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m19100E(final boolean hidden) {
        final SVGAnimationView sVGAnimationView = this.shimmerSVGAView;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, (Object) null);
                xdl0.M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.Q0(sVGAnimationView, new e30() { // from class: l.h290
                    public final void call(Object obj) {
                        m290.m19101F(this.f13645a, sVGAnimationView, hidden, (int[]) obj);
                    }
                });
            } else {
                m19112G(sVGAnimationView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m19101F(m290 m290Var, SVGAnimationView sVGAnimationView, boolean z, int[] iArr) {
        m290Var.m19112G(sVGAnimationView, z);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m19104r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: z */
    public static final void m19111z(m290 m290Var, View view) {
        zvf0.r(m290Var.mo11695h(), m290Var.m11751f());
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        m290Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: G */
    public final void m19112G(SVGAnimationView sVGAnimationView, boolean z) {
        e51.J(this.backgroundShimmerRunnable);
        m11754k(getPrivilegeEntranceInfo().c(), sVGAnimationView, "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C1002b(sVGAnimationView, z));
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        this.merchandise = (Merchandise) vwb.r(CoreModule.f1534c.f3643j0.m2507D5(ProductCategory.get("oDiamond")), new w9j() { // from class: l.l290
            public final Object call(Object obj) {
                return m290.m19104r((Merchandise) obj);
            }
        });
        return xma.m27368Y3() && xma.m27367X3() && !zb90.i() && xma.m27379e4() && NullChecker.a(this.merchandise);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        if (this.rootFrameLayout == null) {
            this.rootFrameLayout = new FrameLayout(getPrivilegeEntranceInfo().a());
        }
        FrameLayout frameLayout = this.rootFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        int iC = svq.c(5);
        this.privilegeEntranceSingleTextWithIconBgView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, svq.c(47));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        FrameLayout frameLayout2 = this.rootFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView((View) this.privilegeEntranceSingleTextWithIconBgView, (ViewGroup.LayoutParams) layoutParams);
        }
        this.recoverOdiamondBottomView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        layoutParams2.topMargin = (iC * 2) + svq.c(47);
        FrameLayout frameLayout3 = this.rootFrameLayout;
        if (frameLayout3 != null) {
            frameLayout3.addView((View) this.recoverOdiamondBottomView, (ViewGroup.LayoutParams) layoutParams2);
        }
        if (g6a.m15592o()) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().a(), (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
            this.shimmerSVGAView = sVGAnimationView;
            sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            SVGAnimationView sVGAnimationView2 = this.shimmerSVGAView;
            if (sVGAnimationView2 != null) {
                mep0.d1(sVGAnimationView2, t100.i);
            }
            FrameLayout frameLayout4 = this.rootFrameLayout;
            if (frameLayout4 != null) {
                frameLayout4.addView((View) this.shimmerSVGAView, (ViewGroup.LayoutParams) layoutParams3);
            }
        }
        FrameLayout frameLayout5 = this.rootFrameLayout;
        if (frameLayout5 != null) {
            getPrivilegeEntranceInfo().c().addView(frameLayout5);
        }
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_odrecovery";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            if (this.shimmerSVGAView != null) {
                m19100E(hidden);
            } else {
                m19098C(hidden);
            }
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (g6a.m15592o()) {
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(0);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.u5);
                ConstraintLayout.a layoutParams = privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().getLayoutParams();
                ConstraintLayout.a aVar = layoutParams instanceof ConstraintLayout.a ? layoutParams : null;
                if (aVar != null) {
                    aVar.d = 0;
                    aVar.e = -1;
                }
                xdl0.V(privilegeEntranceSingleTextWithIconBgView.get_privilege_icon(), t100.D);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.A5);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.s0(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.t5);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.i290
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m290.m19111z(this.f14208a, view);
                    }
                });
                m19100E(false);
            } else {
                m19098C(false);
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.n3);
                privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.x4);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.d6);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.U9);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.s0(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#CCEDD7A3"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.n4);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.j290
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m290.m19096A(this.f14964a, view);
                    }
                });
            }
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.recoverOdiamondBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), vwb.Y("discount_type", "diamond_rebuy"), vwb.Y("productType", "diamond"), vwb.Y("membership_status", "diamond_invalid")});
            if (g6a.m15592o()) {
                xdl0.M(privilegeEntrancePromotionBottomView.get_divider(), true);
                privilegeEntrancePromotionBottomView.get_divider().setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33CE9C5F"), Color.parseColor("#33FECF95"), Color.parseColor("#33CE9C5F")}));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.Q));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.q5);
                privilegeEntrancePromotionBottomView.setBackground(null);
            } else {
                privilegeEntrancePromotionBottomView.setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(d3c0.p4));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#BBEDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.l4);
            }
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            NumberFormat numberFormatB = getPrivilegeEntranceInfo().b();
            Merchandise merchandise2 = this.merchandise;
            merchandise2.getClass();
            vText.setText(String.format("恢复黑金会员仅需%s元", Arrays.copyOf(new Object[]{numberFormatB.format(merchandise2.defaultStockKeepUnit.prices.price)}, 1)));
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时");
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(d3c0.Fa));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            NumberFormat numberFormatB2 = getPrivilegeEntranceInfo().b();
            Merchandise merchandise3 = this.merchandise;
            merchandise3.getClass();
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{numberFormatB2.format(merchandise3.quantity)}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.c(3));
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.k290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m290.m19097B(this.f15561a, view);
                }
            });
        }
        getPrivilegeEntranceInfo().c().setBackground(g6a.m15592o() ? new e190(true) : getPrivilegeEntranceInfo().a().drawable(d3c0.q4));
        mep0.d1(getPrivilegeEntranceInfo().c(), t100.i);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public String m19113y() {
        return "e_privilege_button_odrecovery";
    }
}
