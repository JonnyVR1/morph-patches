package p009l;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.p2b0;
import l.sab0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001a\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ll/diy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "", "quantity", "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", "e", "(Ljava/util/List;Ljava/lang/String;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class diy implements owl<d> {

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
    public static Boolean m13348b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m13349c(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m13350d(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: f */
    private final void m13351f(d.a detail) {
        ProductCategory productCategory = detail.s().category;
        productCategory.getClass();
        Iterator<pwl<d.a>> it = qiy.m21016a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo13950a(this.context, this.type, detail);
        }
    }

    @Override // p009l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<d> mo13352a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        ProductCategory productCategory = this.type.productCategory();
        boolean zM21867d = rxa0.m21867d(merchandises);
        boolean zM21866c = rxa0.m21866c(merchandises);
        Merchandise merchandise = sab0.i(this.type) ? merchandises.isEmpty() ? null : merchandises.get(0) : (Merchandise) vwb.r(merchandises, new w9j() { // from class: l.aiy
            public final Object call(Object obj) {
                return diy.m13348b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : 0.0d;
        String strM = p2b0.h().m(productCategory);
        List<String> listV = p2b0.h().v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listV) {
            str.getClass();
            diy diyVar = this;
            List<? extends Merchandise> list = merchandises;
            d dVarM13353e = diyVar.m13353e(list, str, d, zM21867d, zM21866c);
            if (dVarM13353e != null) {
                dVarM13353e.v(TextUtils.equals(strM.toString(), str));
                arrayList.add(dVarM13353e);
            }
            this = diyVar;
            merchandises = list;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final d m13353e(List<? extends Merchandise> merchandises, final String quantity, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        d.a aVar;
        d.a aVar2;
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.biy
            public final Object call(Object obj) {
                return diy.m13349c(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.a(merchandise)) {
            aVar = new d.a(merchandise);
            aVar.K(baseUnitPrice);
            aVar.Q(containsPromotion);
            aVar.P(containsNewPromotion);
            m13351f(aVar);
        } else {
            aVar = null;
        }
        Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.ciy
            public final Object call(Object obj) {
                return diy.m13350d(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.a(merchandise2)) {
            aVar2 = new d.a(merchandise2);
            aVar2.K(baseUnitPrice);
            aVar2.Q(containsPromotion);
            aVar2.P(containsNewPromotion);
            m13351f(aVar2);
        } else {
            aVar2 = null;
        }
        if (sab0.i(this.type) && NullChecker.a(aVar)) {
            d dVarA = d.a(aVar, aVar2, true);
            dVarA.s(rxa0.m21877n(merchandise2));
            dVarA.t(rxa0.m21877n(merchandise));
            return dVarA;
        }
        if (!NullChecker.a(aVar) || !NullChecker.a(aVar2)) {
            return null;
        }
        d dVarA2 = d.a(aVar, aVar2, true);
        dVarA2.s(rxa0.m21877n(merchandise2));
        dVarA2.t(rxa0.m21877n(merchandise));
        return dVarA2;
    }
}
