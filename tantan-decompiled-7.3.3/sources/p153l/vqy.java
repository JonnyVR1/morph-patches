package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/vqy;", "Ll/gzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", Merchandise.TYPE, "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vqy implements gzl<C8928d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public vqy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m202460b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m202461c(String str, Merchandise merchandise) {
        merchandise.getClass();
        str.getClass();
        boolean z = false;
        boolean zM94374J = C15493d.m94374J(str, "-", false, 2, null);
        int i = merchandise.quantity;
        if (!zM94374J) {
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
    @Override // p153l.gzl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8928d> mo99809a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        vqy vqyVar = this;
        ProductCategory productCategory = vqyVar.type.productCategory();
        boolean zM199778d = v5b0.m199778d(merchandises);
        boolean zM199777c = v5b0.m199777c(merchandises);
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.tqy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vqy.m202460b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM189822m = tab0.m189811h().m189822m(productCategory);
        List<String> listM189831v = tab0.m189811h().m189831v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (final String str : listM189831v) {
            Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.uqy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vqy.m202461c(str, (Merchandise) obj);
                }
            });
            if (merchandise2 != null) {
                C8928d c8928dM202462d = vqyVar.m202462d(merchandise2, d, zM199778d, zM199777c);
                strM189822m.getClass();
                boolean z = false;
                boolean zM94374J = C15493d.m94374J(strM189822m, "-", false, 2, null);
                int i = merchandise2.quantity;
                if (zM94374J) {
                    if (!TextUtils.equals(strM189822m, "-" + i + "w")) {
                        if (TextUtils.equals("-" + merchandise2.quantity, strM189822m) && merchandise2.noneRenewable() && merchandise2.monthType()) {
                            z = true;
                        }
                    } else if (merchandise2.noneRenewable() && merchandise2.weekly()) {
                        z = true;
                    }
                } else {
                    if (!TextUtils.equals(strM189822m, i + "w") ? !(!TextUtils.equals(String.valueOf(merchandise2.quantity), strM189822m) || !merchandise2.autoRenewable() || !merchandise2.monthType()) : !(!merchandise2.autoRenewable() || !merchandise2.weekly())) {
                        z = true;
                    }
                }
                c8928dM202462d.m54723v(z);
                arrayList.add(c8928dM202462d);
            }
            vqyVar = this;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final C8928d m202462d(Merchandise merchandise, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        C8928d.a aVar = new C8928d.a(merchandise);
        aVar.m54738K(baseUnitPrice);
        aVar.m54744Q(containsPromotion);
        aVar.m54743P(containsNewPromotion);
        aVar.m54757c0(true);
        ProductCategory productCategory = aVar.m54784s().category;
        productCategory.getClass();
        Iterator<hzl<C8928d.a>> it = nry.m164539a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo106190a(this.context, this.type, aVar);
        }
        if (merchandise.autoRenewable()) {
            C8928d c8928dM54702a = C8928d.m54702a(null, aVar, true);
            c8928dM54702a.getClass();
            c8928dM54702a.m54720s(v5b0.m199788n(merchandise));
            return c8928dM54702a;
        }
        C8928d c8928dM54702a2 = C8928d.m54702a(aVar, null, false);
        c8928dM54702a2.getClass();
        c8928dM54702a2.m54721t(v5b0.m199788n(merchandise));
        return c8928dM54702a2;
    }
}
