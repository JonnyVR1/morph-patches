package p009l;

import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lc60 implements mzl {

    /* JADX INFO: renamed from: b */
    public static lc60 f16069b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<mzl> f16070a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static lc60 m17810b() {
        if (f16069b == null) {
            synchronized (lc60.class) {
                try {
                    if (f16069b == null) {
                        f16069b = new lc60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16069b;
    }

    /* JADX INFO: renamed from: c */
    public static void m17811c() {
        if (NullChecker.a(f16069b)) {
            f16069b.f16070a.clear();
        }
        f16069b = null;
    }

    @Override // p009l.mzl
    /* JADX INFO: renamed from: a */
    public boolean mo17812a(l6b0 l6b0Var, PurchaseType purchaseType, PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (vwb.J(this.f16070a)) {
            return false;
        }
        Iterator<mzl> it = this.f16070a.iterator();
        while (it.hasNext()) {
            if (it.next().mo17812a(l6b0Var, purchaseType, paymentResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
