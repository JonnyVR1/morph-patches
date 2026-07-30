package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.data.SchemeKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, m87232d2 = {"Ll/o1n;", "", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;", "promos", "", "a", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;)Z", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "c", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;)Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", SchemeKey.promotion, "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "", "e", "()Ljava/lang/String;", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "b", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface o1n {
    /* JADX INFO: renamed from: a */
    default boolean mo162263a(@NotNull CoreIntlAffiliatePromotions promos) {
        promos.getClass();
        return promos.m30185M3(mo162264b());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab mo162264b();

    @Nullable
    /* JADX INFO: renamed from: c */
    default IapAffiliatePromotion mo162265c(@NotNull CoreIntlAffiliatePromotions promos) {
        promos.getClass();
        return promos.m30170D3(mo162264b());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    default IapAffiliatePromotionDisplaySlot mo162266d(@NotNull CoreIntlAffiliatePromotions promos, @NotNull IapAffiliatePromotion promotion) {
        promos.getClass();
        promotion.getClass();
        return promos.m30175G3(promotion, mo162264b());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo162267e();
}
