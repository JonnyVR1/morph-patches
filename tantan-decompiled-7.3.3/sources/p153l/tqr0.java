package p153l;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.internal.consent_sdk.zzdb;
import com.google.android.ump.ConsentInformation;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class tqr0 {

    /* JADX INFO: renamed from: d */
    public static final zzdb f175770d = zzdb.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a */
    public final Application f175771a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f175772b;

    /* JADX INFO: renamed from: c */
    public final Set f175773c;

    public tqr0(Application application) {
        this.f175771a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f175772b = sharedPreferences;
        this.f175773c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    /* JADX INFO: renamed from: a */
    public final int m192351a() {
        return this.f175772b.getInt("consent_status", 0);
    }

    /* JADX INFO: renamed from: b */
    public final Map m192352b() {
        String string;
        Set<String> stringSet = this.f175772b.getStringSet("stored_info", zzdb.zzi());
        if (stringSet.isEmpty()) {
            stringSet = f175770d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f175771a;
            iit0 iit0VarM176969a = qkt0.m176969a(application, str);
            if (iit0VarM176969a == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str));
            } else {
                Object obj = application.getSharedPreferences(iit0VarM176969a.f115136a, 0).getAll().get(iit0VarM176969a.f115137b);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final Set m192353c() {
        return this.f175773c;
    }

    /* JADX INFO: renamed from: d */
    public final void m192354d() {
        this.f175772b.edit().putStringSet("written_values", this.f175773c).apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m192355e(int i) {
        this.f175772b.edit().putInt("consent_status", i).apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m192356f(boolean z) {
        this.f175772b.edit().putBoolean("is_pub_misconfigured", z).apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m192357g(ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) {
        this.f175772b.edit().putString("privacy_options_requirement_status", privacyOptionsRequirementStatus.name()).apply();
    }

    /* JADX INFO: renamed from: h */
    public final void m192358h(Set set) {
        this.f175772b.edit().putStringSet("stored_info", set).apply();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m192359i() {
        return this.f175772b.getBoolean("is_pub_misconfigured", false);
    }
}
