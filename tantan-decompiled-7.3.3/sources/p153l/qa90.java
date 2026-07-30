package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m88121d2 = {"Ll/qa90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", c4s.C_ZONE, "(Z)V", "E", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", BaseSei.f14625Y, "Lcom/tantan/library/svga/SVGAnimationView;", "G", "(Lcom/tantan/library/svga/SVGAnimationView;Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "recoverOdiamondBottomView", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "rootFrameLayout", "g", "Lcom/tantan/library/svga/SVGAnimationView;", "shimmerSVGAView", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Lcom/p1/mobile/putong/core/data/Merchandise;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qa90 extends AbstractC21509y4 {

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

    /* JADX INFO: renamed from: l.qa90$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/qa90$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19543b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SVGAnimationView f156364b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f156365c;

        public C19543b(SVGAnimationView sVGAnimationView, boolean z) {
            this.f156364b = sVGAnimationView;
            this.f156365c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m175917a(qa90 qa90Var, boolean z) {
            qa90Var.m175903E(z);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            if (qa90.this.backgroundShimmerRunnable == null) {
                final qa90 qa90Var = qa90.this;
                final boolean z = this.f156365c;
                qa90Var.backgroundShimmerRunnable = new Runnable() { // from class: l.ra90
                    @Override // java.lang.Runnable
                    public final void run() {
                        qa90.C19543b.m175917a(qa90Var, z);
                    }
                };
            }
            l51.m152890J(qa90.this.backgroundShimmerRunnable);
            l51.m152888H(this.f156364b.getContext(), qa90.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m175899A(qa90 qa90Var, View view) {
        i4g0.m138520r(qa90Var.mo96815h(), qa90Var.m214188f());
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        qa90Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: B */
    public static final void m175900B(qa90 qa90Var, View view) {
        i4g0.m138520r(qa90Var.m175916y(), qa90Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("productType", "diamond"), jyb.m147494Y("discount_type", "diamond_rebuy"), jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        qa90Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: C */
    private final void m175901C(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, null);
                bnl0.m105524M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                bnl0.m105533Q0(privilegeEntranceSingleTextWithIconBgView, new y20() { // from class: l.ka90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qa90.m175902D(this.f124640a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m175902D(qa90 qa90Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC21509y4.m214185l(qa90Var, qa90Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m175903E(final boolean hidden) {
        final SVGAnimationView sVGAnimationView = this.shimmerSVGAView;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                bnl0.m105524M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                bnl0.m105533Q0(sVGAnimationView, new y20() { // from class: l.la90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        qa90.m175904F(this.f130665a, sVGAnimationView, hidden, (int[]) obj);
                    }
                });
            } else {
                m175915G(sVGAnimationView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m175904F(qa90 qa90Var, SVGAnimationView sVGAnimationView, boolean z, int[] iArr) {
        qa90Var.m175915G(sVGAnimationView, z);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m175907r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: z */
    public static final void m175914z(qa90 qa90Var, View view) {
        i4g0.m138520r(qa90Var.mo96815h(), qa90Var.m214188f());
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        qa90Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: G */
    public final void m175915G(SVGAnimationView sVGAnimationView, boolean z) {
        l51.m152890J(this.backgroundShimmerRunnable);
        m214191k(getPrivilegeEntranceInfo().getRoot(), sVGAnimationView, "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C19543b(sVGAnimationView, z));
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        this.merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("oDiamond")), new qcj() { // from class: l.pa90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qa90.m175907r((Merchandise) obj);
            }
        });
        return joa.m146374Z3() && joa.m146373Y3() && !dk90.m116230i() && joa.m146386f4() && NullChecker.m82486a(this.merchandise);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        if (this.rootFrameLayout == null) {
            this.rootFrameLayout = new FrameLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        }
        FrameLayout frameLayout = this.rootFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        int iM193530c = txq.m193530c(5);
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, txq.m193530c(47));
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        FrameLayout frameLayout2 = this.rootFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.privilegeEntranceSingleTextWithIconBgView, layoutParams);
        }
        this.recoverOdiamondBottomView = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        layoutParams2.topMargin = (iM193530c * 2) + txq.m193530c(47);
        FrameLayout frameLayout3 = this.rootFrameLayout;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.recoverOdiamondBottomView, layoutParams2);
        }
        if (s7a.m184986o()) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null, 0, 0, 14, null);
            this.shimmerSVGAView = sVGAnimationView;
            sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            SVGAnimationView sVGAnimationView2 = this.shimmerSVGAView;
            if (sVGAnimationView2 != null) {
                qnp0.m177261d1(sVGAnimationView2, qa00.f156322i);
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

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_odrecovery";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            if (this.shimmerSVGAView != null) {
                m175903E(hidden);
            } else {
                m175901C(hidden);
            }
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (s7a.m184986o()) {
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(0);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119782u5);
                ViewGroup.LayoutParams layoutParams = privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().getLayoutParams();
                ConstraintLayout.C0221a c0221a = layoutParams instanceof ConstraintLayout.C0221a ? (ConstraintLayout.C0221a) layoutParams : null;
                if (c0221a != null) {
                    c0221a.f1243d = 0;
                    c0221a.f1245e = -1;
                }
                bnl0.m105538V(privilegeEntranceSingleTextWithIconBgView.get_privilege_icon(), qa00.f156291D);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119148A5);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(z7a.m218876s0(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119768t5);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.ma90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qa90.m175914z(this.f135492a, view);
                    }
                });
                m175903E(false);
            } else {
                m175901C(false);
                privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119682n3);
                privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119823x4);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119545d6);
                privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119428U9);
                privilegeEntranceSingleTextWithIconBgView.get_desc().setText(z7a.m218876s0(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("oDiamond"))));
                privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#CCEDD7A3"));
                privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119683n4);
                privilegeEntranceSingleTextWithIconBgView.get_go().clearColorFilter();
                bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.na90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qa90.m175899A(this.f140994a, view);
                    }
                });
            }
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.recoverOdiamondBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandise;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), jyb.m147494Y("discount_type", "diamond_rebuy"), jyb.m147494Y("productType", "diamond"), jyb.m147494Y("membership_status", "diamond_invalid"));
            if (s7a.m184986o()) {
                bnl0.m105524M(privilegeEntrancePromotionBottomView.get_divider(), true);
                privilegeEntrancePromotionBottomView.get_divider().setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33CE9C5F"), Color.parseColor("#33FECF95"), Color.parseColor("#33CE9C5F")}));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108340J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119726q5);
                privilegeEntrancePromotionBottomView.setBackground(null);
            } else {
                privilegeEntrancePromotionBottomView.setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(jbc0.f119711p4));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#BBEDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119655l4);
            }
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise2 = this.merchandise;
            merchandise2.getClass();
            vText.setText(String.format("恢复黑金会员仅需%s元", Arrays.copyOf(new Object[]{numberFormat.format(merchandise2.defaultStockKeepUnit.prices.price)}, 1)));
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时");
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(privilegeEntrancePromotionBottomView.getResources().getDrawable(jbc0.f119223Fa));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            NumberFormat numberFormat2 = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise3 = this.merchandise;
            merchandise3.getClass();
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{numberFormat2.format(merchandise3.quantity)}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.oa90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qa90.m175900B(this.f145672a, view);
                }
            });
        }
        getPrivilegeEntranceInfo().getRoot().setBackground(s7a.m184986o() ? new i990(true) : getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119725q4));
        qnp0.m177261d1(getPrivilegeEntranceInfo().getRoot(), qa00.f156322i);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public String m175916y() {
        return "e_privilege_button_odrecovery";
    }
}
