package p006l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import java.util.List;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class u1n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c m24898a(ProductCategory productCategory, IapAffiliatePromotion iapAffiliatePromotion, List list) {
        return !vwb.J(list) ? c.just(list) : CoreModule.f1534c.f3643j0.m2505C5(productCategory, iapAffiliatePromotion.productId);
    }

    /* JADX INFO: renamed from: b */
    public static c<List<Merchandise>> m24899b(@Nullable final IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return c.just(vwb.f0(new Merchandise[0]));
        }
        final ProductCategory productCategoryM24900c = m24900c(iapAffiliatePromotion.productType);
        return (productCategoryM24900c == null || TextUtils.isEmpty(iapAffiliatePromotion.productId)) ? c.just(vwb.f0(new Merchandise[0])) : CoreModule.f1534c.f3643j0.m2503B5(productCategoryM24900c, iapAffiliatePromotion.productId).switchMap(new w9j() { // from class: l.t1n
            public final Object call(Object obj) {
                return u1n.m24898a(productCategoryM24900c, iapAffiliatePromotion, (List) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ProductCategory m24900c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        if ("svip".equalsIgnoreCase(strTrim)) {
            return ura.m25555e().m25559d().m5634Hg() ? ProductCategory.get("tttSvipGoogleplay") : ProductCategory.get("svip");
        }
        return ProductCategory.get(strTrim);
    }
}
