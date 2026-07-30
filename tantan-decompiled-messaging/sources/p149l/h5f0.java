package p149l;

import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public class h5f0 implements f3m {

    /* JADX INFO: renamed from: b */
    public static h5f0 f105945b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<f3m> f105946a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static h5f0 m129397b() {
        if (f105945b == null) {
            synchronized (h5f0.class) {
                try {
                    if (f105945b == null) {
                        f105945b = new h5f0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f105945b;
    }

    @Override // p149l.f3m
    /* JADX INFO: renamed from: a */
    public boolean mo119261a(f5f0 f5f0Var, PurchaseType purchaseType, PaymentApi.SignResultStatus signResultStatus) {
        if (vwb.m200296J(this.f105946a)) {
            return false;
        }
        Iterator<f3m> it = this.f105946a.iterator();
        while (it.hasNext()) {
            if (it.next().mo119261a(f5f0Var, purchaseType, signResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
