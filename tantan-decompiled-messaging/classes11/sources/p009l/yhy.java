package p009l;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.p2b0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ll/yhy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "merchandise", "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", "d", "(Lcom/p1/mobile/putong/core/data/Merchandise;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yhy implements owl<d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public yhy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m25373b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m25374c(String str, Merchandise merchandise) {
        merchandise.getClass();
        str.getClass();
        boolean z = false;
        boolean zJ = kotlin.text.d.J(str, "-", false, 2, (Object) null);
        int i = merchandise.quantity;
        if (!zJ) {
            if (TextUtils.equals(str, i + "w") && merchandise.autoRenewable() && merchandise.weekly()) {
                return Boolean.TRUE;
            }
            if (TextUtils.equals(str, String.valueOf(merchandise.quantity)) && merchandise.autoRenewable() && merchandise.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (TextUtils.equals(str, "-" + i + "w") && merchandise.noneRenewable() && merchandise.weekly()) {
            return Boolean.TRUE;
        }
        if (TextUtils.equals(str, "-" + merchandise.quantity) && merchandise.noneRenewable() && merchandise.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    @Override // p009l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<d> mo13352a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        yhy yhyVar = this;
        ProductCategory productCategory = yhyVar.type.productCategory();
        boolean zM21867d = rxa0.m21867d(merchandises);
        boolean zM21866c = rxa0.m21866c(merchandises);
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.why
            public final Object call(Object obj) {
                return yhy.m25373b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : 0.0d;
        String strM = p2b0.h().m(productCategory);
        List<String> listV = p2b0.h().v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (final String str : listV) {
            Merchandise merchandise2 = (Merchandise) vwb.r(list, new w9j() { // from class: l.xhy
                public final Object call(Object obj) {
                    return yhy.m25374c(str, (Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                d dVarM25375d = yhyVar.m25375d(merchandise2, d, zM21867d, zM21866c);
                strM.getClass();
                boolean z = false;
                boolean zJ = kotlin.text.d.J(strM, "-", false, 2, (Object) null);
                int i = merchandise2.quantity;
                if (zJ) {
                    if (!TextUtils.equals(strM, "-" + i + "w")) {
                        if (TextUtils.equals("-" + merchandise2.quantity, strM) && merchandise2.noneRenewable() && merchandise2.monthType()) {
                            z = true;
                        }
                    } else if (merchandise2.noneRenewable() && merchandise2.weekly()) {
                        z = true;
                    }
                } else {
                    if (!TextUtils.equals(strM, i + "w") ? !(!TextUtils.equals(String.valueOf(merchandise2.quantity), strM) || !merchandise2.autoRenewable() || !merchandise2.monthType()) : !(!merchandise2.autoRenewable() || !merchandise2.weekly())) {
                        z = true;
                    }
                }
                dVarM25375d.v(z);
                arrayList.add(dVarM25375d);
            }
            yhyVar = this;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final d m25375d(Merchandise merchandise, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        d.a aVar = new d.a(merchandise);
        aVar.K(baseUnitPrice);
        aVar.Q(containsPromotion);
        aVar.P(containsNewPromotion);
        aVar.c0(true);
        ProductCategory productCategory = aVar.s().category;
        productCategory.getClass();
        Iterator<pwl<d.a>> it = qiy.m21016a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo13950a(this.context, this.type, aVar);
        }
        if (merchandise.autoRenewable()) {
            d dVarA = d.a((d.a) null, aVar, true);
            dVarA.getClass();
            dVarA.s(rxa0.m21877n(merchandise));
            return dVarA;
        }
        d dVarA2 = d.a(aVar, (d.a) null, false);
        dVarA2.getClass();
        dVarA2.t(rxa0.m21877n(merchandise));
        return dVarA2;
    }
}
