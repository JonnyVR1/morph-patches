package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/vhy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "c", "b", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vhy implements owl<C8765d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    public vhy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    @Override // p149l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8765d> mo111958a(@NotNull List<? extends Merchandise> merchandises) {
        List<C8765d> listM198483b;
        List<C8765d> listM198484c;
        merchandises.getClass();
        boolean zM181483d = rxa0.m181483d(merchandises);
        boolean zM181482c = rxa0.m181482c(merchandises);
        ArrayList arrayList = new ArrayList();
        if (sab0.m182887e(this.type) && (listM198484c = m198484c(merchandises)) != null) {
            return listM198484c;
        }
        if (sab0.m182885c(this.type) && (listM198483b = m198483b(merchandises)) != null) {
            return listM198483b;
        }
        int size = merchandises.size();
        int i = 0;
        while (i < size) {
            Merchandise merchandise = merchandises.get(i);
            C8765d.a aVar = new C8765d.a(merchandise);
            m198485d(aVar);
            aVar.m53561Q(zM181483d);
            aVar.m53560P(zM181482c);
            C8765d c8765d = new C8765d();
            if (merchandise.autoRenewable()) {
                c8765d.m53533o(aVar);
            } else {
                c8765d.m53539u(aVar);
            }
            boolean z = ((int) ((float) Math.floor((double) (((float) merchandises.size()) / 2.0f)))) == i;
            c8765d.m53540v(z);
            c8765d.m53541w(z);
            c8765d.m53523e();
            arrayList.add(c8765d);
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<C8765d> m198483b(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM181483d = rxa0.m181483d(merchandises);
        boolean zM181482c = rxa0.m181482c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iM167145n = p2b0.m167133h().m167145n(productCategory);
        List<String> listM167153v = p2b0.m167133h().m167153v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM167153v) {
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
            C8765d.a aVar = new C8765d.a(merchandise2);
            m198485d(aVar);
            aVar.m53561Q(zM181483d);
            aVar.m53560P(zM181482c);
            C8765d c8765d = new C8765d();
            if (merchandise2.autoRenewable()) {
                c8765d.m53533o(aVar);
            } else {
                c8765d.m53539u(aVar);
            }
            boolean z = iM167145n == i;
            c8765d.m53540v(z);
            c8765d.m53541w(z);
            arrayList.add(c8765d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<C8765d> m198484c(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM181483d = rxa0.m181483d(merchandises);
        boolean zM181482c = rxa0.m181482c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iM167146o = p2b0.m167133h().m167146o(productCategory);
        List<String> listM167153v = p2b0.m167133h().m167153v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listM167153v) {
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
            C8765d.a aVar = new C8765d.a(merchandise);
            m198485d(aVar);
            aVar.m53561Q(zM181483d);
            aVar.m53560P(zM181482c);
            C8765d c8765d = new C8765d();
            if (merchandise.autoRenewable()) {
                c8765d.m53533o(aVar);
            } else {
                c8765d.m53539u(aVar);
            }
            boolean zEquals = TextUtils.equals(String.valueOf(iM167146o), str);
            c8765d.m53540v(zEquals);
            c8765d.m53541w(zEquals);
            arrayList.add(c8765d);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m198485d(C8765d.a detail) {
        ProductCategory productCategory = detail.m53601s().category;
        productCategory.getClass();
        Iterator<pwl<C8765d.a>> it = qiy.m174923a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo116746a(this.context, this.type, detail);
        }
    }
}
