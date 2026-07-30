package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public final class u3n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22421c m194374a(ProductCategory productCategory, IapAffiliatePromotion iapAffiliatePromotion, List list) {
        return !jyb.m147479J(list) ? C22421c.just(list) : CoreModule.f18264c.f20396j0.m31580C5(productCategory, iapAffiliatePromotion.productId);
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<List<Merchandise>> m194375b(@Nullable final IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return C22421c.just(jyb.m147507f0(new Merchandise[0]));
        }
        final ProductCategory productCategoryM194376c = m194376c(iapAffiliatePromotion.productType);
        return (productCategoryM194376c == null || TextUtils.isEmpty(iapAffiliatePromotion.productId)) ? C22421c.just(jyb.m147507f0(new Merchandise[0])) : CoreModule.f18264c.f20396j0.m31578B5(productCategoryM194376c, iapAffiliatePromotion.productId).switchMap(new qcj() { // from class: l.t3n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u3n.m194374a(productCategoryM194376c, iapAffiliatePromotion, (List) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ProductCategory m194376c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        if ("svip".equalsIgnoreCase(strTrim)) {
            return gta.m132210e().m132214d().mo34700Hg() ? ProductCategory.get(ProductCategory.tttSvipGoogleplay) : ProductCategory.get("svip");
        }
        return ProductCategory.get(strTrim);
    }
}
