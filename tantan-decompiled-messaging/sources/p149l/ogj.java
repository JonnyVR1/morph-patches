package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class ogj {

    /* JADX INFO: renamed from: e */
    public static String f143862e = "<######>";

    /* JADX INFO: renamed from: f */
    public static volatile ogj f143863f;

    /* JADX INFO: renamed from: a */
    public C22392a<Double> f143864a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<Integer> f143865b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public uqd0 f143866c = new uqd0("gp_svip_current_merchandise_sku" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: d */
    public uqd0 f143867d = new uqd0("gp_svip_update_merchandise_sku" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static ogj m164200c() {
        if (f143863f == null) {
            synchronized (ogj.class) {
                try {
                    if (f143863f == null) {
                        f143863f = new ogj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143863f;
    }

    /* JADX INFO: renamed from: a */
    public String m164201a(PurchaseType purchaseType) {
        return purchaseType == null ? "" : m164202b(purchaseType.name());
    }

    /* JADX INFO: renamed from: b */
    public String m164202b(String str) {
        String str2 = this.f143866c.get();
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] strArrSplit = str2.split(f143862e);
        if (strArrSplit == null || strArrSplit.length != 1) {
            return (TextUtils.equals(strArrSplit[1], str) || TextUtils.equals(str, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.name())) ? strArrSplit[0] : "";
        }
        return strArrSplit[0];
    }

    /* JADX INFO: renamed from: d */
    public void m164203d() {
        f143863f = null;
    }
}
