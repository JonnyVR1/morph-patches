package p002l;

import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.Map;
import kotlin.Metadata;
import l.w85;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/e1b0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e1b0 {

    @NotNull
    public static final e1b0 INSTANCE = new e1b0();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m12105a(@Nullable PurchaseType currentPurchaseType) {
        ProductCategory productCategory;
        String string = (currentPurchaseType == null || (productCategory = currentPurchaseType.productCategory()) == null) ? null : productCategory.toString();
        if (string != null) {
            switch (string.hashCode()) {
                case -1204773696:
                    if (string.equals("tttDiamond")) {
                        w85.n(w85.INSTANCE, "Top Up Page (TANTAN DIAMONDS)", (Map) null, 2, (Object) null);
                        break;
                    }
                    break;
                case -863315575:
                    if (string.equals("tttVip")) {
                        w85.n(w85.INSTANCE, "Subscription Page (VIP)", (Map) null, 2, (Object) null);
                        break;
                    }
                    break;
                case -435036897:
                    if (string.equals("tttUltraPremium")) {
                        w85.n(w85.INSTANCE, "Subscription Page (ULTRA PREMIUM)", (Map) null, 2, (Object) null);
                        break;
                    }
                    break;
                case 219393643:
                    if (string.equals("tttSvipGoogleplay")) {
                        w85.n(w85.INSTANCE, "Subscription Page (PREMIUM)", (Map) null, 2, (Object) null);
                        break;
                    }
                    break;
                case 449746854:
                    if (string.equals("tttSeeWhoLikedMe")) {
                        w85.n(w85.INSTANCE, "Subscription Page (SEE)", (Map) null, 2, (Object) null);
                        break;
                    }
                    break;
            }
        }
    }
}
