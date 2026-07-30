package p149l;

import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public class lc60 implements mzl {

    /* JADX INFO: renamed from: b */
    public static lc60 f127380b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<mzl> f127381a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static lc60 m149282b() {
        if (f127380b == null) {
            synchronized (lc60.class) {
                try {
                    if (f127380b == null) {
                        f127380b = new lc60();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f127380b;
    }

    /* JADX INFO: renamed from: c */
    public static void m149283c() {
        if (NullChecker.m81303a(f127380b)) {
            f127380b.f127381a.clear();
        }
        f127380b = null;
    }

    @Override // p149l.mzl
    /* JADX INFO: renamed from: a */
    public boolean mo149284a(l6b0 l6b0Var, PurchaseType purchaseType, PaymentApi.PaymentResultStatus paymentResultStatus) {
        if (vwb.m200296J(this.f127381a)) {
            return false;
        }
        Iterator<mzl> it = this.f127381a.iterator();
        while (it.hasNext()) {
            if (it.next().mo149284a(l6b0Var, purchaseType, paymentResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
