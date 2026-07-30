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
import kotlin.jvm.internal.SourceDebugExtension;
import l.p2b0;
import l.sab0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll/vhy;", "Ll/owl;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a", "(Ljava/util/List;)Ljava/util/List;", "c", "b", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "d", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class vhy implements owl<d> {

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

    @Override // p009l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<d> mo13352a(@NotNull List<? extends Merchandise> merchandises) {
        List<d> listM23375b;
        List<d> listM23376c;
        merchandises.getClass();
        boolean zM21867d = rxa0.m21867d(merchandises);
        boolean zM21866c = rxa0.m21866c(merchandises);
        ArrayList arrayList = new ArrayList();
        if (sab0.e(this.type) && (listM23376c = m23376c(merchandises)) != null) {
            return listM23376c;
        }
        if (sab0.c(this.type) && (listM23375b = m23375b(merchandises)) != null) {
            return listM23375b;
        }
        int size = merchandises.size();
        int i = 0;
        while (i < size) {
            Merchandise merchandise = merchandises.get(i);
            d.a aVar = new d.a(merchandise);
            m23377d(aVar);
            aVar.Q(zM21867d);
            aVar.P(zM21866c);
            d dVar = new d();
            if (merchandise.autoRenewable()) {
                dVar.o(aVar);
            } else {
                dVar.u(aVar);
            }
            boolean z = ((int) ((float) Math.floor((double) (((float) merchandises.size()) / 2.0f)))) == i;
            dVar.v(z);
            dVar.w(z);
            dVar.e();
            arrayList.add(dVar);
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<d> m23375b(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM21867d = rxa0.m21867d(merchandises);
        boolean zM21866c = rxa0.m21866c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iN = p2b0.h().n(productCategory);
        List<String> listV = p2b0.h().v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listV) {
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
            d.a aVar = new d.a(merchandise2);
            m23377d(aVar);
            aVar.Q(zM21867d);
            aVar.P(zM21866c);
            d dVar = new d();
            if (merchandise2.autoRenewable()) {
                dVar.o(aVar);
            } else {
                dVar.u(aVar);
            }
            boolean z = iN == i;
            dVar.v(z);
            dVar.w(z);
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<d> m23376c(List<? extends Merchandise> merchandises) {
        Object next;
        boolean zM21867d = rxa0.m21867d(merchandises);
        boolean zM21866c = rxa0.m21866c(merchandises);
        ProductCategory productCategory = this.type.productCategory();
        int iO = p2b0.h().o(productCategory);
        List<String> listV = p2b0.h().v(productCategory);
        ArrayList arrayList = new ArrayList();
        for (String str : listV) {
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
            d.a aVar = new d.a(merchandise);
            m23377d(aVar);
            aVar.Q(zM21867d);
            aVar.P(zM21866c);
            d dVar = new d();
            if (merchandise.autoRenewable()) {
                dVar.o(aVar);
            } else {
                dVar.u(aVar);
            }
            boolean zEquals = TextUtils.equals(String.valueOf(iO), str);
            dVar.v(zEquals);
            dVar.w(zEquals);
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m23377d(d.a detail) {
        ProductCategory productCategory = detail.s().category;
        productCategory.getClass();
        Iterator<pwl<d.a>> it = qiy.m21016a(productCategory).iterator();
        while (it.hasNext()) {
            it.next().mo13950a(this.context, this.type, detail);
        }
    }
}
