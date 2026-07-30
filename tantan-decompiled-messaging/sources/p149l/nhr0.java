package p149l;

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
public final class nhr0 {

    /* JADX INFO: renamed from: d */
    public static final zzdb f139025d = zzdb.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a */
    public final Application f139026a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f139027b;

    /* JADX INFO: renamed from: c */
    public final Set f139028c;

    public nhr0(Application application) {
        this.f139026a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f139027b = sharedPreferences;
        this.f139028c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    /* JADX INFO: renamed from: a */
    public final int m159446a() {
        return this.f139027b.getInt("consent_status", 0);
    }

    /* JADX INFO: renamed from: b */
    public final Map m159447b() {
        String string;
        Set<String> stringSet = this.f139027b.getStringSet("stored_info", zzdb.zzi());
        if (stringSet.isEmpty()) {
            stringSet = f139025d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f139026a;
            c9t0 c9t0VarM145322a = kbt0.m145322a(application, str);
            if (c9t0VarM145322a == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str));
            } else {
                Object obj = application.getSharedPreferences(c9t0VarM145322a.f79969a, 0).getAll().get(c9t0VarM145322a.f79970b);
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
    public final Set m159448c() {
        return this.f139028c;
    }

    /* JADX INFO: renamed from: d */
    public final void m159449d() {
        this.f139027b.edit().putStringSet("written_values", this.f139028c).apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m159450e(int i) {
        this.f139027b.edit().putInt("consent_status", i).apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m159451f(boolean z) {
        this.f139027b.edit().putBoolean("is_pub_misconfigured", z).apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m159452g(ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) {
        this.f139027b.edit().putString("privacy_options_requirement_status", privacyOptionsRequirementStatus.name()).apply();
    }

    /* JADX INFO: renamed from: h */
    public final void m159453h(Set set) {
        this.f139027b.edit().putStringSet("stored_info", set).apply();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m159454i() {
        return this.f139027b.getBoolean("is_pub_misconfigured", false);
    }
}
