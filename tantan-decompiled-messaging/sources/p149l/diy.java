package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001a\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/diy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "", FirebaseAnalytics.Param.QUANTITY, "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", "e", "(Ljava/util/List;Ljava/lang/String;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class diy implements owl<C8765d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public diy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m111954b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m111955c(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m111956d(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: f */
    private final void m111957f(C8765d.a detail) {
        ProductCategory productCategory = detail.m53601s().category;
        productCategory.getClass();
        Iterator<pwl<C8765d.a>> it = qiy.m174923a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo116746a(this.context, this.type, detail);
        }
    }

    @Override // p149l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8765d> mo111958a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        ProductCategory productCategory = this.type.productCategory();
        boolean zM181483d = rxa0.m181483d(merchandises);
        boolean zM181482c = rxa0.m181482c(merchandises);
        Merchandise merchandise = sab0.m182891i(this.type) ? merchandises.isEmpty() ? null : merchandises.get(0) : (Merchandise) vwb.m200346r(merchandises, new w9j() { // from class: l.aiy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return diy.m111954b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM167144m = p2b0.m167133h().m167144m(productCategory);
        List<String> listM167153v = p2b0.m167133h().m167153v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM167153v) {
            str.getClass();
            diy diyVar = this;
            List<? extends Merchandise> list = merchandises;
            C8765d c8765dM111959e = diyVar.m111959e(list, str, d, zM181483d, zM181482c);
            if (c8765dM111959e != null) {
                c8765dM111959e.m53540v(TextUtils.equals(strM167144m.toString(), str));
                arrayList.add(c8765dM111959e);
            }
            this = diyVar;
            merchandises = list;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final C8765d m111959e(List<? extends Merchandise> merchandises, final String quantity, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        C8765d.a aVar;
        C8765d.a aVar2;
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.biy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return diy.m111955c(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            aVar = new C8765d.a(merchandise);
            aVar.m53555K(baseUnitPrice);
            aVar.m53561Q(containsPromotion);
            aVar.m53560P(containsNewPromotion);
            m111957f(aVar);
        } else {
            aVar = null;
        }
        Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ciy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return diy.m111956d(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.m81303a(merchandise2)) {
            aVar2 = new C8765d.a(merchandise2);
            aVar2.m53555K(baseUnitPrice);
            aVar2.m53561Q(containsPromotion);
            aVar2.m53560P(containsNewPromotion);
            m111957f(aVar2);
        } else {
            aVar2 = null;
        }
        if (sab0.m182891i(this.type) && NullChecker.m81303a(aVar)) {
            C8765d c8765dM53519a = C8765d.m53519a(aVar, aVar2, true);
            c8765dM53519a.m53537s(rxa0.m181493n(merchandise2));
            c8765dM53519a.m53538t(rxa0.m181493n(merchandise));
            return c8765dM53519a;
        }
        if (!NullChecker.m81303a(aVar) || !NullChecker.m81303a(aVar2)) {
            return null;
        }
        C8765d c8765dM53519a2 = C8765d.m53519a(aVar, aVar2, true);
        c8765dM53519a2.m53537s(rxa0.m181493n(merchandise2));
        c8765dM53519a2.m53538t(rxa0.m181493n(merchandise));
        return c8765dM53519a2;
    }
}
