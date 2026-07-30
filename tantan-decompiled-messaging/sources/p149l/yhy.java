package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/yhy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", Merchandise.TYPE, "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class yhy implements owl<C8765d> {

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
    public static Boolean m214876b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m214877c(String str, Merchandise merchandise) {
        merchandise.getClass();
        str.getClass();
        boolean z = false;
        boolean zM93483J = C15386d.m93483J(str, "-", false, 2, null);
        int i = merchandise.quantity;
        if (!zM93483J) {
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
    @Override // p149l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8765d> mo111958a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        yhy yhyVar = this;
        ProductCategory productCategory = yhyVar.type.productCategory();
        boolean zM181483d = rxa0.m181483d(merchandises);
        boolean zM181482c = rxa0.m181482c(merchandises);
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.why
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yhy.m214876b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM167144m = p2b0.m167133h().m167144m(productCategory);
        List<String> listM167153v = p2b0.m167133h().m167153v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (final String str : listM167153v) {
            Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.xhy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return yhy.m214877c(str, (Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                C8765d c8765dM214878d = yhyVar.m214878d(merchandise2, d, zM181483d, zM181482c);
                strM167144m.getClass();
                boolean z = false;
                boolean zM93483J = C15386d.m93483J(strM167144m, "-", false, 2, null);
                int i = merchandise2.quantity;
                if (zM93483J) {
                    if (!TextUtils.equals(strM167144m, "-" + i + "w")) {
                        if (TextUtils.equals("-" + merchandise2.quantity, strM167144m) && merchandise2.noneRenewable() && merchandise2.monthType()) {
                            z = true;
                        }
                    } else if (merchandise2.noneRenewable() && merchandise2.weekly()) {
                        z = true;
                    }
                } else {
                    if (!TextUtils.equals(strM167144m, i + "w") ? !(!TextUtils.equals(String.valueOf(merchandise2.quantity), strM167144m) || !merchandise2.autoRenewable() || !merchandise2.monthType()) : !(!merchandise2.autoRenewable() || !merchandise2.weekly())) {
                        z = true;
                    }
                }
                c8765dM214878d.m53540v(z);
                arrayList.add(c8765dM214878d);
            }
            yhyVar = this;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final C8765d m214878d(Merchandise merchandise, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        C8765d.a aVar = new C8765d.a(merchandise);
        aVar.m53555K(baseUnitPrice);
        aVar.m53561Q(containsPromotion);
        aVar.m53560P(containsNewPromotion);
        aVar.m53574c0(true);
        ProductCategory productCategory = aVar.m53601s().category;
        productCategory.getClass();
        Iterator<pwl<C8765d.a>> it = qiy.m174923a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo116746a(this.context, this.type, aVar);
        }
        if (merchandise.autoRenewable()) {
            C8765d c8765dM53519a = C8765d.m53519a(null, aVar, true);
            c8765dM53519a.getClass();
            c8765dM53519a.m53537s(rxa0.m181493n(merchandise));
            return c8765dM53519a;
        }
        C8765d c8765dM53519a2 = C8765d.m53519a(aVar, null, false);
        c8765dM53519a2.getClass();
        c8765dM53519a2.m53538t(rxa0.m181493n(merchandise));
        return c8765dM53519a2;
    }
}
