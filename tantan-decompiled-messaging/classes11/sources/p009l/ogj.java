package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.uqd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ogj {

    /* JADX INFO: renamed from: e */
    public static String f18027e = "<######>";

    /* JADX INFO: renamed from: f */
    public static volatile ogj f18028f;

    /* JADX INFO: renamed from: a */
    public a<Double> f18029a = a.b();

    /* JADX INFO: renamed from: b */
    public a<Integer> f18030b = a.b();

    /* JADX INFO: renamed from: c */
    public uqd0 f18031c = new uqd0("gp_svip_current_merchandise_sku" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: d */
    public uqd0 f18032d = new uqd0("gp_svip_update_merchandise_sku" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static ogj m19756c() {
        if (f18028f == null) {
            synchronized (ogj.class) {
                try {
                    if (f18028f == null) {
                        f18028f = new ogj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18028f;
    }

    /* JADX INFO: renamed from: a */
    public String m19757a(PurchaseType purchaseType) {
        return purchaseType == null ? "" : m19758b(purchaseType.name());
    }

    /* JADX INFO: renamed from: b */
    public String m19758b(String str) {
        String str2 = (String) this.f18031c.get();
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] strArrSplit = str2.split(f18027e);
        if (strArrSplit == null || strArrSplit.length != 1) {
            return (TextUtils.equals(strArrSplit[1], str) || TextUtils.equals(str, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.name())) ? strArrSplit[0] : "";
        }
        return strArrSplit[0];
    }

    /* JADX INFO: renamed from: d */
    public void m19759d() {
        f18028f = null;
    }
}
