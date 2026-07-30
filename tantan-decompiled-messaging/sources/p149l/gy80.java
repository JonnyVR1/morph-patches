package p149l;

import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Ll/gy80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "q", "()Ljava/lang/String;", "r", "", "b", "()V", "m", "hidden", "j", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "p", "()Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;", "setPrivilegeEnhancedPromotionBannerView", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEnhancedPromotionBannerView;)V", "privilegeEnhancedPromotionBannerView", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "e", "Ll/j760;", "merchandiseCouponPair", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class gy80 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public j760<Merchandise, Coupon> merchandiseCouponPair;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public final boolean mo94540a() {
        if (!mo118902r()) {
            return false;
        }
        j760<Merchandise, Coupon> j760VarM99836f = b1f.m99829a().m99836f(mo118901q());
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
    @CallSuper
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        MonetizationPromotionsId monetizationPromotionsId = MonetizationPromotionsId.get(mo118901q());
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = this.privilegeEnhancedPromotionBannerView;
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m44377J(this.merchandiseCouponPair, monetizationPromotionsId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final PrivilegeEnhancedPromotionBannerView getPrivilegeEnhancedPromotionBannerView() {
        return this.privilegeEnhancedPromotionBannerView;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public abstract String mo118901q();

    /* JADX INFO: renamed from: r */
    public abstract boolean mo118902r();
}
