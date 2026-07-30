package p153l;

import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Ll/k690;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "q", "()Ljava/lang/String;", "r", "", "b", "()V", "m", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "p", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "setPrivilegeEnhancedPromotionBannerView", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;)V", "privilegeEnhancedPromotionBannerView", "Ll/pf60;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/pf60;", "merchandiseCouponPair", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class k690 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pf60<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k690(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public final boolean mo96813a() {
        if (!mo138924r()) {
            return false;
        }
        pf60<Merchandise, Coupon> pf60VarM128617f = g2f.m128610a().m128617f(mo138923q());
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
    @CallSuper
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(mo138923q());
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m45560J(this.merchandiseCouponPair, monetizationPromotionsId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final PrivilegeEnhancedPromotionBannerView getPrivilegeEnhancedPromotionBannerView() {
        return this.privilegeEnhancedPromotionBannerView;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public abstract String mo138923q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo138924r();
}
