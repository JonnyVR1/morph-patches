package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, m87232d2 = {"Ll/xy80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", ResourceDirection.f38808v, "()Z", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "r", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "getPrivilegeEnhancedPromotionBannerView", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "setPrivilegeEnhancedPromotionBannerView", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;)V", "privilegeEnhancedPromotionBannerView", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/j760;", "merchandiseCouponPair", "Ll/hab0;", "f", "Ll/hab0;", "getPurchaseTrackBase", "()Ll/hab0;", "setPurchaseTrackBase", "(Ll/hab0;)V", "purchaseTrackBase", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class xy80 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public j760<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrackBase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m211738s() {
        return MonetizationPromotionsId.lowPriceFirstTime12MSVIP;
    }

    /* JADX INFO: renamed from: t */
    public static final void m211739t(xy80 xy80Var, PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        hab0 hab0Var;
        zvf0.m220396r(xy80Var.mo211742r(), xy80Var.m94952f());
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.f28499J;
        if (merchandise == null || (hab0Var = xy80Var.purchaseTrackBase) == null) {
            return;
        }
        merchandise.getClass();
        PayMethod payMethod = privilegeEnhancedPromotionBannerView.f28503N;
        payMethod.getClass();
        hab0Var.m130123w(merchandise, payMethod, false, CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3() && TEnum.equals(privilegeEnhancedPromotionBannerView.f28503N, "alipay"));
    }

    /* JADX INFO: renamed from: u */
    public static final void m211740u(xy80 xy80Var, View view) {
        Coupon coupon;
        zvf0.m220399u("e_privileges_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("banner_style", "countdown"));
        zvf0.m220396r(xy80Var.mo94542h(), xy80Var.m94952f());
        if (!g6a.m124571t()) {
            String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
            strMo33339Ie.getClass();
            xy80Var.m94957o(strMo33339Ie);
            return;
        }
        String strMo33339Ie2 = CoreModule.m29935P().m94651a().mo33339Ie();
        int iMo33589sk = CoreModule.m29935P().m94651a().mo33589sk(strMo33339Ie2);
        j760<Merchandise, Coupon> j760Var = xy80Var.merchandiseCouponPair;
        if (j760Var != null && (coupon = j760Var.f116565b) != null) {
            CoreModule.m29935P().m94651a().mo33409Sn(xy80Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo33589sk, true, coupon.f56011id);
        } else {
            strMo33339Ie2.getClass();
            xy80Var.m94957o(strMo33339Ie2);
        }
    }

    /* JADX INFO: renamed from: v */
    private final boolean m211741v() {
        return !xma.m210043F3() && w6h0.m201818j().m201826n();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (!m211741v()) {
            return false;
        }
        j760<Merchandise, Coupon> j760VarM99836f = b1f.m99829a().m99836f(m211738s());
        this.merchandiseCouponPair = j760VarM99836f;
        return NullChecker.m81303a(j760VarM99836f);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this.privilegeEnhancedPromotionBannerView = (PrivilegeEnhancedPromotionBannerView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ENHANCED_PROMOTION_BANNER_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEnhancedPromotionBannerView, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_promosvip12m";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (hidden) {
            if (privilegeEnhancedPromotionBannerView != null) {
                privilegeEnhancedPromotionBannerView.m44374E();
            }
        } else if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m44375F();
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        Merchandise merchandise;
        super.mo94544m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m211738s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            j760<Merchandise, Coupon> j760Var = this.merchandiseCouponPair;
            if (j760Var != null && (merchandise = j760Var.f116564a) != null) {
                ProductCategory productCategory = merchandise.category;
                productCategory.getClass();
                x5b0 x5b0Var = new x5b0(productCategory, PurchaseTrackPageType.none, "p_navigation,privilege_button");
                this.purchaseTrackBase = x5b0Var;
                x5b0Var.m130117p(OMSDialogPositon.p_navigation_view);
            }
            privilegeEnhancedPromotionBannerView.setPurchaseTrack(this.purchaseTrackBase);
            privilegeEnhancedPromotionBannerView.m44381m(new d30() { // from class: l.vy80
                @Override // p149l.d30
                public final void call() {
                    xy80.m211739t(this.f183504a, privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.m44377J(this.merchandiseCouponPair, monetizationPromotionsId);
            xdl0.m208329E0(privilegeEnhancedPromotionBannerView.f28510a, new View.OnClickListener() { // from class: l.wy80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xy80.m211740u(this.f188550a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo211742r() {
        return "e_privilege_button_promosvip12m";
    }
}
