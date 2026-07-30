package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import l.b1f;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.oxa0;
import l.v5h0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/ky80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "w", "()Z", "", "s", "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "privilegeEnhancedPromotionBannerView", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/j760;", "merchandiseCouponPair", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ky80 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public j760<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m18367s() {
        return "giftDurationSVIP";
    }

    /* JADX INFO: renamed from: t */
    public static final void m18368t(PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.J;
        if (merchandise != null) {
            if (NullChecker.a(privilegeEnhancedPromotionBannerView.K) && privilegeEnhancedPromotionBannerView.K.endTime - mqi0.o() <= 0.0d) {
                lsi0.y("优惠券已过期");
            } else if (NullChecker.a(privilegeEnhancedPromotionBannerView.getAct())) {
                oxa0.i0(privilegeEnhancedPromotionBannerView.getAct(), new e30() { // from class: l.jy80
                    public final void call(Object obj) {
                        ky80.m18369u((Boolean) obj);
                    }
                }, merchandise, "p_promotion,svip6m_privilege");
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m18370v(ky80 ky80Var, View view) {
        Coupon coupon;
        if (!g6a.m15597t()) {
            String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
            strM5276Ie.getClass();
            ky80Var.m11756o(strM5276Ie);
            return;
        }
        String strM5276Ie2 = CoreModule.m1854P().m11706a().m5276Ie();
        int iM5526sk = CoreModule.m1854P().m11706a().m5526sk(strM5276Ie2);
        j760<Merchandise, Coupon> j760Var = ky80Var.merchandiseCouponPair;
        if (j760Var != null && (coupon = (Coupon) j760Var.b) != null) {
            CoreModule.m1854P().m11706a().m5346Sn(ky80Var.getPrivilegeEntranceInfo().a(), "p_privilege,navigation_banner", iM5526sk, true, ((DbObject) coupon).id);
        } else {
            strM5276Ie2.getClass();
            ky80Var.m11756o(strM5276Ie2);
        }
    }

    /* JADX INFO: renamed from: w */
    private final boolean m18371w() {
        return g6a.m15583f() && !xma.m27351F3() && v5h0.d().g();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (!m18371w()) {
            return false;
        }
        j760<Merchandise, Coupon> j760VarF = b1f.a().f(m18367s());
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
        return "e_privilege_banner_promo_double11svip6m";
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
        super.mo11697m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m18367s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m(new d30() { // from class: l.hy80
                public final void call() {
                    ky80.m18368t(privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.J(this.merchandiseCouponPair, monetizationPromotionsId);
            xdl0.E0(privilegeEnhancedPromotionBannerView.a, new View.OnClickListener() { // from class: l.iy80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ky80.m18370v(this.f14875a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m18369u(Boolean bool) {
    }
}
