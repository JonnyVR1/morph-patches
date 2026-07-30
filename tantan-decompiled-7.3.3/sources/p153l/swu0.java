package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class swu0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f171007a;

    /* JADX INFO: renamed from: b */
    public final ibt0 f171008b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f171009c;

    /* JADX INFO: renamed from: d */
    public final String f171010d;

    /* JADX INFO: renamed from: e */
    public final String f171011e;

    public swu0(cxu0 cxu0Var, ibt0 ibt0Var, o7w0 o7w0Var, String str, String str2) {
        ConcurrentHashMap concurrentHashMapM128025c = cxu0Var.m128025c();
        this.f171007a = concurrentHashMapM128025c;
        this.f171008b = ibt0Var;
        this.f171009c = o7w0Var;
        this.f171010d = str;
        this.f171011e = str2;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168235a7)).booleanValue()) {
            int iM178754e = qyv0.m178754e(o7w0Var);
            int i = iM178754e - 1;
            if (i == 0) {
                concurrentHashMapM128025c.put("scar", "false");
                return;
            }
            if (i == 1) {
                concurrentHashMapM128025c.put("se", "query_g");
            } else if (i == 2) {
                concurrentHashMapM128025c.put("se", "r_adinfo");
            } else if (i != 3) {
                concurrentHashMapM128025c.put("se", "r_both");
            } else {
                concurrentHashMapM128025c.put("se", "r_adstring");
            }
            concurrentHashMapM128025c.put("scar", "true");
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168553z7)).booleanValue()) {
                concurrentHashMapM128025c.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
            }
            if (iM178754e == 2) {
                concurrentHashMapM128025c.put("rid", str);
            }
            m188366d("ragent", o7w0Var.f145318d.zzp);
            m188366d("rtype", qyv0.m178750a(qyv0.m178751b(o7w0Var.f145318d)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map m188363a() {
        return this.f171007a;
    }

    /* JADX INFO: renamed from: b */
    public final void m188364b(b7w0 b7w0Var) {
        if (!b7w0Var.f75343b.f68853a.isEmpty()) {
            switch (((q6w0) b7w0Var.f75343b.f68853a.get(0)).f155875b) {
                case 1:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.f171007a.put("as", true != this.f171008b.m139412m() ? "0" : "1");
                    break;
                default:
                    this.f171007a.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        m188366d("gqi", b7w0Var.f75343b.f68854b.f172368b);
    }

    /* JADX INFO: renamed from: c */
    public final void m188365c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f171007a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f171007a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m188366d(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f171007a.put(str, str2);
    }
}
