package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001a\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/ary;", "Ll/gzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "", FirebaseAnalytics.Param.QUANTITY, "", "baseUnitPrice", "", "containsPromotion", "containsNewPromotion", "e", "(Ljava/util/List;Ljava/lang/String;DZZ)Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class ary implements gzl<C8928d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public ary(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m99805b(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m99806c(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m99807d(String str, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TextUtils.equals(String.valueOf(merchandise.quantity), str) && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: f */
    private final void m99808f(C8928d.a detail) {
        ProductCategory productCategory = detail.m54784s().category;
        productCategory.getClass();
        Iterator<hzl<C8928d.a>> it = nry.m164539a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo106190a(this.context, this.type, detail);
        }
    }

    @Override // p153l.gzl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8928d> mo99809a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        ProductCategory productCategory = this.type.productCategory();
        boolean zM199778d = v5b0.m199778d(merchandises);
        boolean zM199777c = v5b0.m199777c(merchandises);
        Merchandise merchandise = wib0.m206565i(this.type) ? merchandises.isEmpty() ? null : merchandises.get(0) : (Merchandise) jyb.m147529r(merchandises, new qcj() { // from class: l.xqy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ary.m99805b((Merchandise) obj);
            }
        });
        double d = merchandise != null ? merchandise.defaultStockKeepUnit.prices.unitPrice : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String strM189822m = tab0.m189811h().m189822m(productCategory);
        List<String> listM189831v = tab0.m189811h().m189831v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM189831v) {
            str.getClass();
            ary aryVar = this;
            List<? extends Merchandise> list = merchandises;
            C8928d c8928dM99810e = aryVar.m99810e(list, str, d, zM199778d, zM199777c);
            if (c8928dM99810e != null) {
                c8928dM99810e.m54723v(TextUtils.equals(strM189822m.toString(), str));
                arrayList.add(c8928dM99810e);
            }
            this = aryVar;
            merchandises = list;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final C8928d m99810e(List<? extends Merchandise> merchandises, final String quantity, double baseUnitPrice, boolean containsPromotion, boolean containsNewPromotion) {
        C8928d.a aVar;
        C8928d.a aVar2;
        List<? extends Merchandise> list = merchandises;
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.yqy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ary.m99806c(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            aVar = new C8928d.a(merchandise);
            aVar.m54738K(baseUnitPrice);
            aVar.m54744Q(containsPromotion);
            aVar.m54743P(containsNewPromotion);
            m99808f(aVar);
        } else {
            aVar = null;
        }
        Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.zqy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ary.m99807d(quantity, (Merchandise) obj);
            }
        });
        if (NullChecker.m82486a(merchandise2)) {
            aVar2 = new C8928d.a(merchandise2);
            aVar2.m54738K(baseUnitPrice);
            aVar2.m54744Q(containsPromotion);
            aVar2.m54743P(containsNewPromotion);
            m99808f(aVar2);
        } else {
            aVar2 = null;
        }
        if (wib0.m206565i(this.type) && NullChecker.m82486a(aVar)) {
            C8928d c8928dM54702a = C8928d.m54702a(aVar, aVar2, true);
            c8928dM54702a.m54720s(v5b0.m199788n(merchandise2));
            c8928dM54702a.m54721t(v5b0.m199788n(merchandise));
            return c8928dM54702a;
        }
        if (!NullChecker.m82486a(aVar) || !NullChecker.m82486a(aVar2)) {
            return null;
        }
        C8928d c8928dM54702a2 = C8928d.m54702a(aVar, aVar2, true);
        c8928dM54702a2.m54720s(v5b0.m199788n(merchandise2));
        c8928dM54702a2.m54721t(v5b0.m199788n(merchandise));
        return c8928dM54702a2;
    }
}
