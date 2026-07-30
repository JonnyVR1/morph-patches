package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ucw0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f178468a;

    /* JADX INFO: renamed from: b */
    public final edw0 f178469b;

    public ucw0() {
        HashMap map = new HashMap();
        this.f178468a = map;
        this.f178469b = new edw0(bxy0.m106918b());
        map.put("new_csi", "1");
    }

    /* JADX INFO: renamed from: b */
    public static ucw0 m195443b(String str) {
        ucw0 ucw0Var = new ucw0();
        ucw0Var.f178468a.put("action", str);
        return ucw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static ucw0 m195444c(String str) {
        ucw0 ucw0Var = new ucw0();
        ucw0Var.f178468a.put("request_id", str);
        return ucw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ucw0 m195445a(@NonNull String str, @NonNull String str2) {
        this.f178468a.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ucw0 m195446d(@NonNull String str) {
        this.f178469b.m120522b(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final ucw0 m195447e(@NonNull String str, @NonNull String str2) {
        this.f178469b.m120523c(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final ucw0 m195448f(q6w0 q6w0Var) {
        this.f178468a.put("aai", q6w0Var.f155917x);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final ucw0 m195449g(t6w0 t6w0Var) {
        if (!TextUtils.isEmpty(t6w0Var.f172368b)) {
            this.f178468a.put("gqi", t6w0Var.f172368b);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final ucw0 m195450h(b7w0 b7w0Var, @Nullable ibt0 ibt0Var) {
        a7w0 a7w0Var = b7w0Var.f75343b;
        m195449g(a7w0Var.f68854b);
        if (!a7w0Var.f68853a.isEmpty()) {
            switch (((q6w0) a7w0Var.f68853a.get(0)).f155875b) {
                case 1:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    return this;
                case 3:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    return this;
                case 4:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    return this;
                case 5:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    return this;
                case 6:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (ibt0Var != null) {
                        this.f178468a.put("as", true != ibt0Var.m139412m() ? "0" : "1");
                        return this;
                    }
                    break;
                default:
                    this.f178468a.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final ucw0 m195451i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f178468a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f178468a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final Map m195452j() {
        HashMap map = new HashMap(this.f178468a);
        for (ddw0 ddw0Var : this.f178469b.m120521a()) {
            map.put(ddw0Var.f87969a, ddw0Var.f87970b);
        }
        return map;
    }
}
