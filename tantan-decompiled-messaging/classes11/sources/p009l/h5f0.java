package p009l;

import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h5f0 implements f3m {

    /* JADX INFO: renamed from: b */
    public static h5f0 f13868b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<f3m> f13869a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static h5f0 m15404b() {
        if (f13868b == null) {
            synchronized (h5f0.class) {
                try {
                    if (f13868b == null) {
                        f13868b = new h5f0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13868b;
    }

    @Override // p009l.f3m
    /* JADX INFO: renamed from: a */
    public boolean mo14201a(f5f0 f5f0Var, PurchaseType purchaseType, PaymentApi.SignResultStatus signResultStatus) {
        if (vwb.J(this.f13869a)) {
            return false;
        }
        Iterator<f3m> it = this.f13869a.iterator();
        while (it.hasNext()) {
            if (it.next().mo14201a(f5f0Var, purchaseType, signResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
