package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/i9b0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class i9b0 {

    @NotNull
    public static final i9b0 INSTANCE = new i9b0();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m139092a(@Nullable PurchaseType currentPurchaseType) {
        ProductCategory productCategory;
        String string = (currentPurchaseType == null || (productCategory = currentPurchaseType.productCategory()) == null) ? null : productCategory.toString();
        if (string != null) {
            switch (string.hashCode()) {
                case -1204773696:
                    if (string.equals(ProductCategory.tttDiamond)) {
                        x95.m209787n(x95.INSTANCE, "Top Up Page (TANTAN DIAMONDS)", null, 2, null);
                        break;
                    }
                    break;
                case -863315575:
                    if (string.equals(ProductCategory.tttVip)) {
                        x95.m209787n(x95.INSTANCE, "Subscription Page (VIP)", null, 2, null);
                        break;
                    }
                    break;
                case -435036897:
                    if (string.equals(ProductCategory.tttUltraPremium)) {
                        x95.m209787n(x95.INSTANCE, "Subscription Page (ULTRA PREMIUM)", null, 2, null);
                        break;
                    }
                    break;
                case 219393643:
                    if (string.equals(ProductCategory.tttSvipGoogleplay)) {
                        x95.m209787n(x95.INSTANCE, "Subscription Page (PREMIUM)", null, 2, null);
                        break;
                    }
                    break;
                case 449746854:
                    if (string.equals(ProductCategory.tttSeeWhoLikedMe)) {
                        x95.m209787n(x95.INSTANCE, "Subscription Page (SEE)", null, 2, null);
                        break;
                    }
                    break;
            }
        }
    }
}
