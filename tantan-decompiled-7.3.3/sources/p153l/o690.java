package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/o690;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "w", "()Z", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "privilegeEnhancedPromotionBannerView", "Ll/pf60;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/pf60;", "merchandiseCouponPair", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class o690 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pf60<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o690(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m166205s() {
        return MonetizationPromotionsId.giftDurationSVIP;
    }

    /* JADX INFO: renamed from: t */
    public static final void m166206t(PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.f29347J;
        if (merchandise != null) {
            if (NullChecker.m82486a(privilegeEnhancedPromotionBannerView.f29348K) && privilegeEnhancedPromotionBannerView.f29348K.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                o1j0.m165651y("优惠券已过期");
            } else if (NullChecker.m82486a(privilegeEnhancedPromotionBannerView.getAct())) {
                s5b0.m184641i0(privilegeEnhancedPromotionBannerView.getAct(), new y20() { // from class: l.n690
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o690.m166207u((Boolean) obj);
                    }
                }, merchandise, "p_promotion,svip6m_privilege");
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m166208v(o690 o690Var, View view) {
        Coupon coupon;
        if (!s7a.m184991t()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            o690Var.m214193o(strMo34342Ie);
            return;
        }
        String strMo34342Ie2 = CoreModule.m30933P().m143405a().mo34342Ie();
        int iMo34592sk = CoreModule.m30933P().m143405a().mo34592sk(strMo34342Ie2);
        pf60<Merchandise, Coupon> pf60Var = o690Var.merchandiseCouponPair;
        if (pf60Var != null && (coupon = pf60Var.f152157b) != null) {
            CoreModule.m30933P().m143405a().mo34412Sn(o690Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo34592sk, true, coupon.f56859id);
        } else {
            strMo34342Ie2.getClass();
            o690Var.m214193o(strMo34342Ie2);
        }
    }

    /* JADX INFO: renamed from: w */
    private final boolean m166209w() {
        return s7a.m184977f() && !joa.m146357G3() && deh0.m115414d().m115417g();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (!m166209w()) {
            return false;
        }
        pf60<Merchandise, Coupon> pf60VarM128617f = g2f.m128610a().m128617f(m166205s());
        this.merchandiseCouponPair = pf60VarM128617f;
        return NullChecker.m82486a(pf60VarM128617f);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this.privilegeEnhancedPromotionBannerView = (PrivilegeEnhancedPromotionBannerView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ENHANCED_PROMOTION_BANNER_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEnhancedPromotionBannerView, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_promo_double11svip6m";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (hidden) {
            if (privilegeEnhancedPromotionBannerView != null) {
                privilegeEnhancedPromotionBannerView.m45557E();
            }
        } else if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m45558F();
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m166205s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m45564m(new x20() { // from class: l.l690
                @Override // p153l.x20
                public final void call() {
                    o690.m166206t(privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.m45560J(this.merchandiseCouponPair, monetizationPromotionsId);
            bnl0.m105509E0(privilegeEnhancedPromotionBannerView.f29358a, new View.OnClickListener() { // from class: l.m690
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o690.m166208v(this.f134979a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m166207u(Boolean bool) {
    }
}
