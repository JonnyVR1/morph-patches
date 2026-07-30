package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/sqy;", "Ll/gzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "c", "b", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sqy implements gzl<C8928d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public sqy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    @Override // p153l.gzl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8928d> mo99809a(@NotNull List<? extends Merchandise> merchandises) {
        List<C8928d> listM187577b;
        List<C8928d> listM187578c;
        merchandises.getClass();
        boolean zM199778d = v5b0.m199778d(merchandises);
        boolean zM199777c = v5b0.m199777c(merchandises);
        ArrayList arrayList = new ArrayList();
        if (wib0.m206561e(this.type) && (listM187578c = m187578c(merchandises)) != null) {
            return listM187578c;
        }
        if (wib0.m206559c(this.type) && (listM187577b = m187577b(merchandises)) != null) {
            return listM187577b;
        }
        int size = merchandises.size();
        int i = 0;
        while (i < size) {
            Merchandise merchandise = merchandises.get(i);
            C8928d.a aVar = new C8928d.a(merchandise);
            m187579d(aVar);
            aVar.m54744Q(zM199778d);
            aVar.m54743P(zM199777c);
            C8928d c8928d = new C8928d();
            if (merchandise.autoRenewable()) {
                c8928d.m54716o(aVar);
            } else {
                c8928d.m54722u(aVar);
            }
            boolean z = ((int) ((float) Math.floor((double) (((float) merchandises.size()) / 2.0f)))) == i;
            c8928d.m54723v(z);
            c8928d.m54724w(z);
            c8928d.m54706e();
            arrayList.add(c8928d);
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<C8928d> m187577b(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM199778d = v5b0.m199778d(merchandises);
        boolean zM199777c = v5b0.m199777c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iM189823n = tab0.m189811h().m189823n(productCategory);
        List<String> listM189831v = tab0.m189811h().m189831v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM189831v) {
            str.getClass();
            int i = Integer.parseInt(str);
            Iterator<T> it = merchandises.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Merchandise merchandise = (Merchandise) next;
                if (merchandise.quantity == i && merchandise.monthType()) {
                    break;
                }
            }
            Merchandise merchandise2 = (Merchandise) next;
            if (merchandise2 == null) {
                return null;
            }
            C8928d.a aVar = new C8928d.a(merchandise2);
            m187579d(aVar);
            aVar.m54744Q(zM199778d);
            aVar.m54743P(zM199777c);
            C8928d c8928d = new C8928d();
            if (merchandise2.autoRenewable()) {
                c8928d.m54716o(aVar);
            } else {
                c8928d.m54722u(aVar);
            }
            boolean z = iM189823n == i;
            c8928d.m54723v(z);
            c8928d.m54724w(z);
            arrayList.add(c8928d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<C8928d> m187578c(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM199778d = v5b0.m199778d(merchandises);
        boolean zM199777c = v5b0.m199777c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iM189824o = tab0.m189811h().m189824o(productCategory);
        List<String> listM189831v = tab0.m189811h().m189831v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM189831v) {
            Iterator<T> it = merchandises.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!TextUtils.equals(String.valueOf(((Merchandise) next).quantity), str));
            Merchandise merchandise = (Merchandise) next;
            if (merchandise == null) {
                return null;
            }
            C8928d.a aVar = new C8928d.a(merchandise);
            m187579d(aVar);
            aVar.m54744Q(zM199778d);
            aVar.m54743P(zM199777c);
            C8928d c8928d = new C8928d();
            if (merchandise.autoRenewable()) {
                c8928d.m54716o(aVar);
            } else {
                c8928d.m54722u(aVar);
            }
            boolean zEquals = TextUtils.equals(String.valueOf(iM189824o), str);
            c8928d.m54723v(zEquals);
            c8928d.m54724w(zEquals);
            arrayList.add(c8928d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m187579d(C8928d.a detail) {
        ProductCategory productCategory = detail.m54784s().category;
        productCategory.getClass();
        Iterator<hzl<C8928d.a>> it = nry.m164539a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo106190a(this.context, this.type, detail);
        }
    }
}
