package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class ijj {

    /* JADX INFO: renamed from: e */
    public static String f115229e = "<######>";

    /* JADX INFO: renamed from: f */
    public static volatile ijj f115230f;

    /* JADX INFO: renamed from: a */
    public C22507a<Double> f115231a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<Integer> f115232b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public wyd0 f115233c = new wyd0("gp_svip_current_merchandise_sku" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: d */
    public wyd0 f115234d = new wyd0("gp_svip_update_merchandise_sku" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static ijj m140191c() {
        if (f115230f == null) {
            synchronized (ijj.class) {
                try {
                    if (f115230f == null) {
                        f115230f = new ijj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f115230f;
    }

    /* JADX INFO: renamed from: a */
    public String m140192a(PurchaseType purchaseType) {
        return purchaseType == null ? "" : m140193b(purchaseType.name());
    }

    /* JADX INFO: renamed from: b */
    public String m140193b(String str) {
        String str2 = this.f115233c.get();
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] strArrSplit = str2.split(f115229e);
        if (strArrSplit == null || strArrSplit.length != 1) {
            return (TextUtils.equals(strArrSplit[1], str) || TextUtils.equals(str, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.name())) ? strArrSplit[0] : "";
        }
        return strArrSplit[0];
    }

    /* JADX INFO: renamed from: d */
    public void m140194d() {
        f115230f = null;
    }
}
