package p009l;

import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ll/o1n;", "", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;", "promos", "", "a", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;)Z", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "c", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;)Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "promotion", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "d", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "", "e", "()Ljava/lang/String;", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "b", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o1n {
    /* JADX INFO: renamed from: a */
    default boolean mo19599a(@NotNull CoreIntlAffiliatePromotions promos) {
        promos.getClass();
        return promos.M3(mo19600b());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab mo19600b();

    @Nullable
    /* JADX INFO: renamed from: c */
    default IapAffiliatePromotion mo19601c(@NotNull CoreIntlAffiliatePromotions promos) {
        promos.getClass();
        return promos.D3(mo19600b());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    default IapAffiliatePromotionDisplaySlot mo19602d(@NotNull CoreIntlAffiliatePromotions promos, @NotNull IapAffiliatePromotion promotion) {
        promos.getClass();
        promotion.getClass();
        return promos.G3(promotion, mo19600b());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo19603e();
}
