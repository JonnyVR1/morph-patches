package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mnu0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f134794a;

    /* JADX INFO: renamed from: b */
    public final c2t0 f134795b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f134796c;

    /* JADX INFO: renamed from: d */
    public final String f134797d;

    /* JADX INFO: renamed from: e */
    public final String f134798e;

    public mnu0(wnu0 wnu0Var, c2t0 c2t0Var, iyv0 iyv0Var, String str, String str2) {
        ConcurrentHashMap concurrentHashMapM219490c = wnu0Var.m219490c();
        this.f134794a = concurrentHashMapM219490c;
        this.f134795b = c2t0Var;
        this.f134796c = iyv0Var;
        this.f134797d = str;
        this.f134798e = str2;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132164a7)).booleanValue()) {
            int iM146891e = kpv0.m146891e(iyv0Var);
            int i = iM146891e - 1;
            if (i == 0) {
                concurrentHashMapM219490c.put("scar", "false");
                return;
            }
            if (i == 1) {
                concurrentHashMapM219490c.put("se", "query_g");
            } else if (i == 2) {
                concurrentHashMapM219490c.put("se", "r_adinfo");
            } else if (i != 3) {
                concurrentHashMapM219490c.put("se", "r_both");
            } else {
                concurrentHashMapM219490c.put("se", "r_adstring");
            }
            concurrentHashMapM219490c.put("scar", "true");
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132482z7)).booleanValue()) {
                concurrentHashMapM219490c.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
            }
            if (iM146891e == 2) {
                concurrentHashMapM219490c.put("rid", str);
            }
            m155569d("ragent", iyv0Var.f115494d.zzp);
            m155569d("rtype", kpv0.m146887a(kpv0.m146888b(iyv0Var.f115494d)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map m155566a() {
        return this.f134794a;
    }

    /* JADX INFO: renamed from: b */
    public final void m155567b(vxv0 vxv0Var) {
        if (!vxv0Var.f183478b.f178772a.isEmpty()) {
            switch (((kxv0) vxv0Var.f183478b.f178772a.get(0)).f125185b) {
                case 1:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.f134794a.put("as", true != this.f134795b.m104932m() ? "0" : "1");
                    break;
                default:
                    this.f134794a.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        m155569d("gqi", vxv0Var.f183478b.f178773b.f141055b);
    }

    /* JADX INFO: renamed from: c */
    public final void m155568c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f134794a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f134794a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m155569d(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f134794a.put(str, str2);
    }
}
