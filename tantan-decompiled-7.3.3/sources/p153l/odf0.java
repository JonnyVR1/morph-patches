package p153l;

import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public class odf0 implements w5m {

    /* JADX INFO: renamed from: b */
    public static odf0 f146902b;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<w5m> f146903a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public static odf0 m167295b() {
        if (f146902b == null) {
            synchronized (odf0.class) {
                try {
                    if (f146902b == null) {
                        f146902b = new odf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146902b;
    }

    @Override // p153l.w5m
    /* JADX INFO: renamed from: a */
    public boolean mo167296a(mdf0 mdf0Var, PurchaseType purchaseType, PaymentApi.SignResultStatus signResultStatus) {
        if (jyb.m147479J(this.f146903a)) {
            return false;
        }
        Iterator<w5m> it = this.f146903a.iterator();
        while (it.hasNext()) {
            if (it.next().mo167296a(mdf0Var, purchaseType, signResultStatus)) {
                return true;
            }
        }
        return false;
    }
}
