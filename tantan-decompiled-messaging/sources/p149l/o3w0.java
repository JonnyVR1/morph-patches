package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o3w0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f141713a;

    /* JADX INFO: renamed from: b */
    public final y3w0 f141714b;

    public o3w0() {
        HashMap map = new HashMap();
        this.f141713a = map;
        this.f141714b = new y3w0(vny0.m199064b());
        map.put("new_csi", "1");
    }

    /* JADX INFO: renamed from: b */
    public static o3w0 m162489b(String str) {
        o3w0 o3w0Var = new o3w0();
        o3w0Var.f141713a.put("action", str);
        return o3w0Var;
    }

    /* JADX INFO: renamed from: c */
    public static o3w0 m162490c(String str) {
        o3w0 o3w0Var = new o3w0();
        o3w0Var.f141713a.put("request_id", str);
        return o3w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final o3w0 m162491a(@NonNull String str, @NonNull String str2) {
        this.f141713a.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final o3w0 m162492d(@NonNull String str) {
        this.f141714b.m212858b(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final o3w0 m162493e(@NonNull String str, @NonNull String str2) {
        this.f141714b.m212859c(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final o3w0 m162494f(kxv0 kxv0Var) {
        this.f141713a.put("aai", kxv0Var.f125227x);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final o3w0 m162495g(nxv0 nxv0Var) {
        if (!TextUtils.isEmpty(nxv0Var.f141055b)) {
            this.f141713a.put("gqi", nxv0Var.f141055b);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final o3w0 m162496h(vxv0 vxv0Var, @Nullable c2t0 c2t0Var) {
        uxv0 uxv0Var = vxv0Var.f183478b;
        m162495g(uxv0Var.f178773b);
        if (!uxv0Var.f178772a.isEmpty()) {
            switch (((kxv0) uxv0Var.f178772a.get(0)).f125185b) {
                case 1:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    return this;
                case 3:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    return this;
                case 4:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    return this;
                case 5:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    return this;
                case 6:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (c2t0Var != null) {
                        this.f141713a.put("as", true != c2t0Var.m104932m() ? "0" : "1");
                        return this;
                    }
                    break;
                default:
                    this.f141713a.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final o3w0 m162497i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f141713a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f141713a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final Map m162498j() {
        HashMap map = new HashMap(this.f141713a);
        for (x3w0 x3w0Var : this.f141714b.m212857a()) {
            map.put(x3w0Var.f190923a, x3w0Var.f190924b);
        }
        return map;
    }
}
