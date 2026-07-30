package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, m88121d2 = {"Ll/b790;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", ResourceDirection.f39656v, "()Z", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/lang/String;", "a", "", "b", "()V", "m", "h", "r", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "getPrivilegeEnhancedPromotionBannerView", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "setPrivilegeEnhancedPromotionBannerView", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;)V", "privilegeEnhancedPromotionBannerView", "Ll/pf60;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/pf60;", "merchandiseCouponPair", "Ll/lib0;", "f", "Ll/lib0;", "getPurchaseTrackBase", "()Ll/lib0;", "setPurchaseTrackBase", "(Ll/lib0;)V", "purchaseTrackBase", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class b790 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pf60<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public lib0 purchaseTrackBase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b790(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final String m102818s() {
        return MonetizationPromotionsId.lowPriceFirstTime12MSVIP;
    }

    /* JADX INFO: renamed from: t */
    public static final void m102819t(b790 b790Var, PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView) {
        lib0 lib0Var;
        i4g0.m138520r(b790Var.mo102822r(), b790Var.m214188f());
        Merchandise merchandise = privilegeEnhancedPromotionBannerView.f29347J;
        if (merchandise == null || (lib0Var = b790Var.purchaseTrackBase) == null) {
            return;
        }
        merchandise.getClass();
        PayMethod payMethod = privilegeEnhancedPromotionBannerView.f29351N;
        payMethod.getClass();
        lib0Var.m154345w(merchandise, payMethod, false, CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3() && TEnum.equals(privilegeEnhancedPromotionBannerView.f29351N, "alipay"));
    }

    /* JADX INFO: renamed from: u */
    public static final void m102820u(b790 b790Var, View view) {
        Coupon coupon;
        i4g0.m138523u("e_privileges_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("banner_style", "countdown"));
        i4g0.m138520r(b790Var.mo96815h(), b790Var.m214188f());
        if (!s7a.m184991t()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            b790Var.m214193o(strMo34342Ie);
            return;
        }
        String strMo34342Ie2 = CoreModule.m30933P().m143405a().mo34342Ie();
        int iMo34592sk = CoreModule.m30933P().m143405a().mo34592sk(strMo34342Ie2);
        pf60<Merchandise, Coupon> pf60Var = b790Var.merchandiseCouponPair;
        if (pf60Var != null && (coupon = pf60Var.f152157b) != null) {
            CoreModule.m30933P().m143405a().mo34412Sn(b790Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo34592sk, true, coupon.f56859id);
        } else {
            strMo34342Ie2.getClass();
            b790Var.m214193o(strMo34342Ie2);
        }
    }

    /* JADX INFO: renamed from: v */
    private final boolean m102821v() {
        return !joa.m146357G3() && efh0.m120692j().m120700n();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (!m102821v()) {
            return false;
        }
        pf60<Merchandise, Coupon> pf60VarM128617f = g2f.m128610a().m128617f(m102818s());
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
        return "e_privilege_banner_promosvip12m";
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
        Merchandise merchandise;
        super.mo96817m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(m102818s());
        final PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            pf60<Merchandise, Coupon> pf60Var = this.merchandiseCouponPair;
            if (pf60Var != null && (merchandise = pf60Var.f152156a) != null) {
                ProductCategory productCategory = merchandise.category;
                productCategory.getClass();
                beb0 beb0Var = new beb0(productCategory, PurchaseTrackPageType.none, "p_navigation,privilege_button");
                this.purchaseTrackBase = beb0Var;
                beb0Var.m154339p(OMSDialogPositon.p_navigation_view);
            }
            privilegeEnhancedPromotionBannerView.setPurchaseTrack(this.purchaseTrackBase);
            privilegeEnhancedPromotionBannerView.m45564m(new x20() { // from class: l.z690
                @Override // p153l.x20
                public final void call() {
                    b790.m102819t(this.f203130a, privilegeEnhancedPromotionBannerView);
                }
            });
            privilegeEnhancedPromotionBannerView.m45560J(this.merchandiseCouponPair, monetizationPromotionsId);
            bnl0.m105509E0(privilegeEnhancedPromotionBannerView.f29358a, new View.OnClickListener() { // from class: l.a790
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b790.m102820u(this.f68801a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo102822r() {
        return "e_privilege_button_promosvip12m";
    }
}
