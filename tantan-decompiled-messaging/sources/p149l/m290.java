package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m87232d2 = {"Ll/m290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", b2s.C_ZONE, "(Z)V", "E", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", BaseSei.f13931Y, "Lcom/tantan/library/svga/SVGAnimationView;", "G", "(Lcom/tantan/library/svga/SVGAnimationView;Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "recoverOdiamondBottomView", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "rootFrameLayout", "g", "Lcom/tantan/library/svga/SVGAnimationView;", "shimmerSVGAView", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Lcom/p1/mobile/putong/core/data/Merchandise;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class m290 extends AbstractC15528a5 {

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
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/m290$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18369b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f130910b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f130911c;

        public C18369b(SVGAnimationView sVGAnimationView, boolean z) {
            this.f130910b = sVGAnimationView;
            this.f130911c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m152684a(m290 m290Var, boolean z) {
            m290Var.m152670E(z);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            if (m290.this.backgroundShimmerRunnable == null) {
                final m290 m290Var = m290.this;
                final boolean z = this.f130911c;
                m290Var.backgroundShimmerRunnable = new Runnable() { // from class: l.n290
                    @Override // java.lang.Runnable
                    public final void run() {
                        m290.C18369b.m152684a(m290Var, z);
                    }
                };
            }
            e51.m114745J(m290.this.backgroundShimmerRunnable);
            e51.m114743H(this.f130910b.getContext(), m290.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m290(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m152666A(m290 m290Var, View view) {
        zvf0.m220396r(m290Var.mo94542h(), m290Var.m94952f());
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        m290Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: B */
    public static final void m152667B(m290 m290Var, View view) {
        zvf0.m220396r(m290Var.m152683y(), m290Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("productType", "diamond"), vwb.m200311Y("discount_type", "diamond_rebuy"), vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        m290Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: C */
    private final void m152668C(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, null);
                xdl0.m208344M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                xdl0.m208353Q0(privilegeEntranceSingleTextWithIconBgView, new e30() { // from class: l.g290
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m290.m152669D(this.f100247a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m152669D(m290 m290Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC15528a5.m94949l(m290Var, m290Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m152670E(final boolean hidden) {
        final SVGAnimationView sVGAnimationView = this.shimmerSVGAView;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                xdl0.m208344M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.m208353Q0(sVGAnimationView, new e30() { // from class: l.h290
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m290.m152671F(this.f105501a, sVGAnimationView, hidden, (int[]) obj);
                    }
                });
            } else {
                m152682G(sVGAnimationView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m152671F(m290 m290Var, SVGAnimationView sVGAnimationView, boolean z, int[] iArr) {
        m290Var.m152682G(sVGAnimationView, z);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m152674r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: z */
    public static final void m152681z(m290 m290Var, View view) {
        zvf0.m220396r(m290Var.mo94542h(), m290Var.m94952f());
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        m290Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: G */
    public final void m152682G(SVGAnimationView sVGAnimationView, boolean z) {
        e51.m114745J(this.backgroundShimmerRunnable);
        m94955k(getPrivilegeEntranceInfo().getRoot(), sVGAnimationView, "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C18369b(sVGAnimationView, z));
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        this.merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("oDiamond")), new w9j() { // from class: l.l290
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return m290.m152674r((Merchandise) obj);
            }
        });
        return xma.m210060Y3() && xma.m210059X3() && !zb90.m217832i() && xma.m210071e4() && NullChecker.m81303a(this.merchandise);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        if (this.rootFrameLayout == null) {
            this.rootFrameLayout = new FrameLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        }
        FrameLayout frameLayout = this.rootFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        int iM186103c = svq.m186103c(5);
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, svq.m186103c(47));
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        FrameLayout frameLayout2 = this.rootFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.privilegeEntranceSingleTextWithIconBgView, layoutParams);
        }
        this.recoverOdiamondBottomView = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        layoutParams2.topMargin = (iM186103c * 2) + svq.m186103c(47);
        FrameLayout frameLayout3 = this.rootFrameLayout;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.recoverOdiamondBottomView, layoutParams2);
        }
        if (g6a.m124566o()) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null, 0, 0, 14, null);
            this.shimmerSVGAView = sVGAnimationView;
            sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            SVGAnimationView sVGAnimationView2 = this.shimmerSVGAView;
            if (sVGAnimationView2 != null) {
                mep0.m154302d1(sVGAnimationView2, t100.f167260i);
            }
            FrameLayout frameLayout4 = this.rootFrameLayout;
            if (frameLayout4 != null) {
                frameLayout4.addView(this.shimmerSVGAView, layoutParams3);
            }
        }
        FrameLayout frameLayout5 = this.rootFrameLayout;
        if (frameLayout5 != null) {
            getPrivilegeEntranceInfo().getRoot().addView(frameLayout5);
        }
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_odrecovery";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            if (this.shimmerSVGAView != null) {
                m152670E(hidden);
            } else {
                m152668C(hidden);
            }
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (g6a.m124566o()) {
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(0);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f84127u5);
                ViewGroup.LayoutParams layoutParams = privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().getLayoutParams();
                ConstraintLayout.C0220a c0220a = layoutParams instanceof ConstraintLayout.C0220a ? (ConstraintLayout.C0220a) layoutParams : null;
                if (c0220a != null) {
                    c0220a.f1243d = 0;
                    c0220a.f1245e = -1;
                }
                xdl0.m208358V(privilegeEntranceSingleTextWithIconBgView.get_privilege_icon(), t100.f167229D);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f83493A5);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.m158031s0(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84113t5);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.i290
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m290.m152681z(this.f110543a, view);
                    }
                });
                m152670E(false);
            } else {
                m152668C(false);
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f84027n3);
                privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f84168x4);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83890d6);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f83773U9);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.m158031s0(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#CCEDD7A3"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84028n4);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.j290
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m290.m152666A(this.f115897a, view);
                    }
                });
            }
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.recoverOdiamondBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandise;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), vwb.m200311Y("discount_type", "diamond_rebuy"), vwb.m200311Y("productType", "diamond"), vwb.m200311Y("membership_status", "diamond_invalid"));
            if (g6a.m124566o()) {
                xdl0.m208344M(privilegeEntrancePromotionBottomView.get_divider(), true);
                privilegeEntrancePromotionBottomView.get_divider().setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33CE9C5F"), Color.parseColor("#33FECF95"), Color.parseColor("#33CE9C5F")}));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72527Q));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72520J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f84071q5);
                privilegeEntrancePromotionBottomView.setBackground(null);
            } else {
                privilegeEntrancePromotionBottomView.setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(d3c0.f84056p4));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#BBEDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f84000l4);
            }
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise2 = this.merchandise;
            merchandise2.getClass();
            vText.setText(String.format("恢复黑金会员仅需%s元", Arrays.copyOf(new Object[]{numberFormat.format(merchandise2.defaultStockKeepUnit.prices.price)}, 1)));
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时");
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(d3c0.f83568Fa));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            NumberFormat numberFormat2 = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise3 = this.merchandise;
            merchandise3.getClass();
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{numberFormat2.format(merchandise3.quantity)}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.m117752c(3));
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.k290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m290.m152667B(this.f120701a, view);
                }
            });
        }
        getPrivilegeEntranceInfo().getRoot().setBackground(g6a.m124566o() ? new e190(true) : getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f84070q4));
        mep0.m154302d1(getPrivilegeEntranceInfo().getRoot(), t100.f167260i);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public String m152683y() {
        return "e_privilege_button_odrecovery";
    }
}
