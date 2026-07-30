package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/ky80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "w", "()Z", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "privilegeEnhancedPromotionBannerView", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/j760;", "merchandiseCouponPair", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class ky80 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public j760<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m147836s() {
        return MonetizationPromotionsId.giftDurationSVIP;
    }

    /* JADX INFO: renamed from: t */
    public static final void m147837t(PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.f28499J;
        if (merchandise != null) {
            if (NullChecker.m81303a(privilegeEnhancedPromotionBannerView.f28500K) && privilegeEnhancedPromotionBannerView.f28500K.endTime - mqi0.m155944o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                lsi0.m151595y("优惠券已过期");
            } else if (NullChecker.m81303a(privilegeEnhancedPromotionBannerView.getAct())) {
                oxa0.m166516i0(privilegeEnhancedPromotionBannerView.getAct(), new e30() { // from class: l.jy80
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ky80.m147838u((Boolean) obj);
                    }
                }, merchandise, "p_promotion,svip6m_privilege");
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m147839v(ky80 ky80Var, View view) {
        Coupon coupon;
        if (!g6a.m124571t()) {
            String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
            strMo33339Ie.getClass();
            ky80Var.m94957o(strMo33339Ie);
            return;
        }
        String strMo33339Ie2 = CoreModule.m29935P().m94651a().mo33339Ie();
        int iMo33589sk = CoreModule.m29935P().m94651a().mo33589sk(strMo33339Ie2);
        j760<Merchandise, Coupon> j760Var = ky80Var.merchandiseCouponPair;
        if (j760Var != null && (coupon = j760Var.f116565b) != null) {
            CoreModule.m29935P().m94651a().mo33409Sn(ky80Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo33589sk, true, coupon.f56011id);
        } else {
            strMo33339Ie2.getClass();
            ky80Var.m94957o(strMo33339Ie2);
        }
    }

    /* JADX INFO: renamed from: w */
    private final boolean m147840w() {
        return g6a.m124557f() && !xma.m210043F3() && v5h0.m197114d().m197117g();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (!m147840w()) {
            return false;
        }
        j760<Merchandise, Coupon> j760VarM99836f = b1f.m99829a().m99836f(m147836s());
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
        return "e_privilege_banner_promo_double11svip6m";
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
        super.mo94544m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m147836s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m44381m(new d30() { // from class: l.hy80
                @Override // p149l.d30
                public final void call() {
                    ky80.m147837t(privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.m44377J(this.merchandiseCouponPair, monetizationPromotionsId);
            xdl0.m208329E0(privilegeEnhancedPromotionBannerView.f28510a, new View.OnClickListener() { // from class: l.iy80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ky80.m147839v(this.f115436a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m147838u(Boolean bool) {
    }
}
