package p153l;

import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public class qk60 implements g2m {

    /* JADX INFO: renamed from: b */
    public static qk60 f158099b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<g2m> f158100a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static qk60 m176925b() {
        if (f158099b == null) {
            synchronized (qk60.class) {
                try {
                    if (f158099b == null) {
                        f158099b = new qk60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f158099b;
    }

    /* JADX INFO: renamed from: c */
    public static void m176926c() {
        if (NullChecker.m82486a(f158099b)) {
            f158099b.f158100a.clear();
        }
        f158099b = null;
    }

    @Override // p153l.g2m
    /* JADX INFO: renamed from: a */
    public boolean mo128635a(peb0 peb0Var, PurchaseType purchaseType, PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (jyb.m147479J(this.f158100a)) {
            return false;
        }
        Iterator<g2m> it = this.f158100a.iterator();
        while (it.hasNext()) {
            if (it.next().mo128635a(peb0Var, purchaseType, paymentResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
