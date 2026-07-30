package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import l.b1f;
import l.d30;
import l.j760;
import l.vwb;
import l.w6h0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Ll/xy80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "v", "()Z", "", "s", "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "r", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "getPrivilegeEnhancedPromotionBannerView", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "setPrivilegeEnhancedPromotionBannerView", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;)V", "privilegeEnhancedPromotionBannerView", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/j760;", "merchandiseCouponPair", "Ll/hab0;", "f", "Ll/hab0;", "getPurchaseTrackBase", "()Ll/hab0;", "setPurchaseTrackBase", "(Ll/hab0;)V", "purchaseTrackBase", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class xy80 extends AbstractC0495a5 {

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
    public xy80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m27666s() {
        return "lowPriceFirstTime12MSVIP";
    }

    /* JADX INFO: renamed from: t */
    public static final void m27667t(xy80 xy80Var, PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        hab0 hab0Var;
        zvf0.r(xy80Var.mo27670r(), xy80Var.m11751f());
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.J;
        if (merchandise == null || (hab0Var = xy80Var.purchaseTrackBase) == null) {
            return;
        }
        merchandise.getClass();
        PayMethod payMethod = privilegeEnhancedPromotionBannerView.N;
        payMethod.getClass();
        hab0Var.m16130w(merchandise, payMethod, false, CoreModule.m1854P().m11706a().m5362U() && CoreModule.f1534c.f3580O0.m2007n3() && TEnum.equals(privilegeEnhancedPromotionBannerView.N, "alipay"));
    }

    /* JADX INFO: renamed from: u */
    public static final void m27668u(xy80 xy80Var, View view) {
        Coupon coupon;
        zvf0.u("e_privileges_banner", "p_navigation_view", new j760[]{vwb.Y("banner_style", "countdown")});
        zvf0.r(xy80Var.mo11695h(), xy80Var.m11751f());
        if (!g6a.m15597t()) {
            String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
            strM5276Ie.getClass();
            xy80Var.m11756o(strM5276Ie);
            return;
        }
        String strM5276Ie2 = CoreModule.m1854P().m11706a().m5276Ie();
        int iM5526sk = CoreModule.m1854P().m11706a().m5526sk(strM5276Ie2);
        j760<Merchandise, Coupon> j760Var = xy80Var.merchandiseCouponPair;
        if (j760Var != null && (coupon = (Coupon) j760Var.b) != null) {
            CoreModule.m1854P().m11706a().m5346Sn(xy80Var.getPrivilegeEntranceInfo().a(), "p_privilege,navigation_banner", iM5526sk, true, ((DbObject) coupon).id);
        } else {
            strM5276Ie2.getClass();
            xy80Var.m11756o(strM5276Ie2);
        }
    }

    /* JADX INFO: renamed from: v */
    private final boolean m27669v() {
        return !xma.m27351F3() && w6h0.j().n();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (!m27669v()) {
            return false;
        }
        j760<Merchandise, Coupon> j760VarF = b1f.a().f(m27666s());
        this.merchandiseCouponPair = j760VarF;
        return NullChecker.a(j760VarF);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        this.privilegeEnhancedPromotionBannerView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.ENHANCED_PROMOTION_BANNER_VIEW);
        getPrivilegeEntranceInfo().c().addView((View) this.privilegeEnhancedPromotionBannerView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_promosvip12m";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (hidden) {
            if (privilegeEnhancedPromotionBannerView != null) {
                privilegeEnhancedPromotionBannerView.E();
            }
        } else if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.F();
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        Merchandise merchandise;
        super.mo11697m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m27666s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            j760<Merchandise, Coupon> j760Var = this.merchandiseCouponPair;
            if (j760Var != null && (merchandise = (Merchandise) j760Var.a) != null) {
                ProductCategory productCategory = merchandise.category;
                productCategory.getClass();
                x5b0 x5b0Var = new x5b0(productCategory, PurchaseTrackPageType.none, "p_navigation,privilege_button");
                this.purchaseTrackBase = x5b0Var;
                x5b0Var.m16124p("p_navigation_view");
            }
            privilegeEnhancedPromotionBannerView.setPurchaseTrack(this.purchaseTrackBase);
            privilegeEnhancedPromotionBannerView.m(new d30() { // from class: l.vy80
                public final void call() {
                    xy80.m27667t(this.f24535a, privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.J(this.merchandiseCouponPair, monetizationPromotionsId);
            xdl0.E0(privilegeEnhancedPromotionBannerView.a, new View.OnClickListener() { // from class: l.wy80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xy80.m27668u(this.f25496a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo27670r() {
        return "e_privilege_button_promosvip12m";
    }
}
