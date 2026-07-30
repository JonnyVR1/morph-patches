package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public final class u1n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22306c m191424a(ProductCategory productCategory, IapAffiliatePromotion iapAffiliatePromotion, List list) {
        return !vwb.m200296J(list) ? C22306c.just(list) : CoreModule.f17545c.f19654j0.m30577C5(productCategory, iapAffiliatePromotion.productId);
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<List<Merchandise>> m191425b(@Nullable final IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return C22306c.just(vwb.m200324f0(new Merchandise[0]));
        }
        final ProductCategory productCategoryM191426c = m191426c(iapAffiliatePromotion.productType);
        return (productCategoryM191426c == null || TextUtils.isEmpty(iapAffiliatePromotion.productId)) ? C22306c.just(vwb.m200324f0(new Merchandise[0])) : CoreModule.f17545c.f19654j0.m30575B5(productCategoryM191426c, iapAffiliatePromotion.productId).switchMap(new w9j() { // from class: l.t1n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u1n.m191424a(productCategoryM191426c, iapAffiliatePromotion, (List) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ProductCategory m191426c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        if ("svip".equalsIgnoreCase(strTrim)) {
            return ura.m195053e().m195057d().mo33697Hg() ? ProductCategory.get(ProductCategory.tttSvipGoogleplay) : ProductCategory.get("svip");
        }
        return ProductCategory.get(strTrim);
    }
}
