package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.p051p1.mobile.putong.data.User;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nyx0 implements grw0 {

    /* JADX INFO: renamed from: b */
    public boolean f144374b;

    /* JADX INFO: renamed from: d */
    public hpr f144376d;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SharedPreferences f144378f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public SharedPreferences.Editor f144379g;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f144381i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f144382j;

    /* JADX INFO: renamed from: a */
    public final Object f144373a = new Object();

    /* JADX INFO: renamed from: c */
    public final List f144375c = new ArrayList();

    /* JADX INFO: renamed from: e */
    @Nullable
    public f8s0 f144377e = null;

    /* JADX INFO: renamed from: h */
    public boolean f144380h = true;

    /* JADX INFO: renamed from: k */
    public boolean f144383k = true;

    /* JADX INFO: renamed from: l */
    public String f144384l = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: m */
    public String f144385m = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: n */
    public String f144386n = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: o */
    public int f144387o = -1;

    /* JADX INFO: renamed from: p */
    public yat0 f144388p = new yat0("", 0);

    /* JADX INFO: renamed from: q */
    public long f144389q = 0;

    /* JADX INFO: renamed from: r */
    public long f144390r = 0;

    /* JADX INFO: renamed from: s */
    public int f144391s = -1;

    /* JADX INFO: renamed from: t */
    public int f144392t = 0;

    /* JADX INFO: renamed from: u */
    public Set f144393u = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: v */
    public JSONObject f144394v = new JSONObject();

    /* JADX INFO: renamed from: w */
    public boolean f144395w = true;

    /* JADX INFO: renamed from: x */
    public boolean f144396x = true;

    /* JADX INFO: renamed from: y */
    public String f144397y = null;

    /* JADX INFO: renamed from: z */
    public String f144398z = "";

    /* JADX INFO: renamed from: A */
    public boolean f144368A = false;

    /* JADX INFO: renamed from: B */
    public String f144369B = "";

    /* JADX INFO: renamed from: C */
    public int f144370C = -1;

    /* JADX INFO: renamed from: D */
    public int f144371D = -1;

    /* JADX INFO: renamed from: E */
    public long f144372E = 0;

    @Override // p153l.grw0
    /* JADX INFO: renamed from: a */
    public final void mo131891a(boolean z) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
            m165362y();
            synchronized (this.f144373a) {
                try {
                    if (this.f144368A == z) {
                        return;
                    }
                    this.f144368A = z;
                    SharedPreferences.Editor editor = this.f144379g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f144379g.apply();
                    }
                    m165363z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    @Override // p153l.grw0
    /* JADX INFO: renamed from: b */
    public final void mo131892b(@NonNull String str, @NonNull String str2) {
        boolean zEquals;
        SharedPreferences.Editor editor;
        m165362y();
        synchronized (this.f144373a) {
            int iHashCode = str.hashCode();
            if (iHashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    this.f144386n = str2;
                    if (this.f144379g != null) {
                        zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                        editor = this.f144379g;
                        if (zEquals) {
                            editor.remove(str);
                        } else {
                            editor.putString(str, str2);
                        }
                        this.f144379g.apply();
                    }
                    m165363z();
                }
            }
            if (iHashCode == 83641339) {
                if (str.equals("IABTCF_gdprApplies")) {
                    this.f144384l = str2;
                    if (this.f144379g != null) {
                        zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                        editor = this.f144379g;
                        if (zEquals) {
                            editor.remove(str);
                        } else {
                            editor.putString(str, str2);
                        }
                        this.f144379g.apply();
                    }
                    m165363z();
                }
            }
            if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                this.f144385m = str2;
                if (this.f144379g != null) {
                    zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                    editor = this.f144379g;
                    if (zEquals) {
                        editor.remove(str);
                    } else {
                        editor.putString(str, str2);
                    }
                    this.f144379g.apply();
                }
                m165363z();
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: c */
    public final void mo131893c(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
            m165362y();
            synchronized (this.f144373a) {
                try {
                    if (this.f144369B.equals(str)) {
                        return;
                    }
                    this.f144369B = str;
                    SharedPreferences.Editor editor = this.f144379g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f144379g.apply();
                    }
                    m165363z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: d */
    public final void mo131894d(int i) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144391s == i) {
                    return;
                }
                this.f144391s = i;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: e */
    public final void mo131895e(int i) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144371D == i) {
                    return;
                }
                this.f144371D = i;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: f */
    public final boolean mo131896f() {
        boolean z;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168486u0)).booleanValue()) {
            return false;
        }
        m165362y();
        synchronized (this.f144373a) {
            z = this.f144383k;
        }
        return z;
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: g */
    public final void mo131897g(boolean z) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (z == this.f144383k) {
                    return;
                }
                this.f144383k = z;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: h */
    public final boolean mo131898h() {
        boolean z;
        m165362y();
        synchronized (this.f144373a) {
            z = this.f144368A;
        }
        return z;
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: i */
    public final void mo131899i(String str) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (TextUtils.equals(this.f144397y, str)) {
                    return;
                }
                this.f144397y = str;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: j */
    public final void mo131900j(boolean z) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) jas0.m144075c().m176505a(sgs0.f168189W9)).longValue();
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.f144379g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: k */
    public final void mo131901k(final Context context) {
        synchronized (this.f144373a) {
            try {
                if (this.f144378f != null) {
                    return;
                }
                final String str = "admob";
                this.f144376d = oct0.f146733a.mo155970a(new Runnable(context, str) { // from class: l.qtx0

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Context f159495b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f159496c = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f159494a.m165361x(this.f159495b, this.f159496c);
                    }
                });
                this.f144374b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: l */
    public final void mo131902l(long j) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144372E == j) {
                    return;
                }
                this.f144372E = j;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: m */
    public final void mo131903m(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue()) {
            m165362y();
            synchronized (this.f144373a) {
                try {
                    if (this.f144398z.equals(str)) {
                        return;
                    }
                    this.f144398z = str;
                    SharedPreferences.Editor editor = this.f144379g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f144379g.apply();
                    }
                    m165363z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: n */
    public final boolean mo131904n() {
        m165362y();
        synchronized (this.f144373a) {
            try {
                SharedPreferences sharedPreferences = this.f144378f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f144378f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f144383k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: o */
    public final void mo131905o(String str, String str2, boolean z) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f144394v.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    jSONObject.put("timestamp_ms", bxy0.m106918b().currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f144394v.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    dct0.m115299h("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f144394v.toString());
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: p */
    public final void mo131906p(Runnable runnable) {
        this.f144375c.add(runnable);
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: q */
    public final void mo131907q(long j) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144389q == j) {
                    return;
                }
                this.f144389q = j;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: r */
    public final void mo131908r(boolean z) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144395w == z) {
                    return;
                }
                this.f144395w = z;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: s */
    public final void mo131909s(@Nullable String str) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (str.equals(this.f144381i)) {
                    return;
                }
                this.f144381i = str;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: t */
    public final void mo131910t(String str) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
                if (str != null && !str.equals(this.f144388p.m214925c())) {
                    this.f144388p = new yat0(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.f144379g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f144379g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f144379g.apply();
                    }
                    m165363z();
                    Iterator it = this.f144375c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f144388p.m214929g(jCurrentTimeMillis);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: u */
    public final void mo131911u(boolean z) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144396x == z) {
                    return;
                }
                this.f144396x = z;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    @Nullable
    /* JADX INFO: renamed from: v */
    public final String mo131912v(@NonNull String str) {
        m165362y();
        synchronized (this.f144373a) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        return this.f144385m;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    return this.f144384l;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                return this.f144386n;
            }
            return null;
        }
    }

    @Override // p153l.grw0
    /* JADX INFO: renamed from: w */
    public final void mo131913w(@Nullable String str) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (str.equals(this.f144382j)) {
                    return;
                }
                this.f144382j = str;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m165361x(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f144373a) {
            try {
                this.f144378f = sharedPreferences;
                this.f144379g = editorEdit;
                if (PlatformVersion.isAtLeastM()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                this.f144380h = this.f144378f.getBoolean("use_https", this.f144380h);
                this.f144395w = this.f144378f.getBoolean("content_url_opted_out", this.f144395w);
                this.f144381i = this.f144378f.getString("content_url_hashes", this.f144381i);
                this.f144383k = this.f144378f.getBoolean("gad_idless", this.f144383k);
                this.f144396x = this.f144378f.getBoolean("content_vertical_opted_out", this.f144396x);
                this.f144382j = this.f144378f.getString("content_vertical_hashes", this.f144382j);
                this.f144392t = this.f144378f.getInt("version_code", this.f144392t);
                this.f144388p = new yat0(this.f144378f.getString("app_settings_json", this.f144388p.m214925c()), this.f144378f.getLong("app_settings_last_update_ms", this.f144388p.m214923a()));
                this.f144389q = this.f144378f.getLong("app_last_background_time_ms", this.f144389q);
                this.f144391s = this.f144378f.getInt("request_in_session_count", this.f144391s);
                this.f144390r = this.f144378f.getLong("first_ad_req_time_ms", this.f144390r);
                this.f144393u = this.f144378f.getStringSet("never_pool_slots", this.f144393u);
                this.f144397y = this.f144378f.getString("display_cutout", this.f144397y);
                this.f144370C = this.f144378f.getInt("app_measurement_npa", this.f144370C);
                this.f144371D = this.f144378f.getInt("sd_app_measure_npa", this.f144371D);
                this.f144372E = this.f144378f.getLong("sd_app_measure_npa_ts", this.f144372E);
                this.f144398z = this.f144378f.getString("inspector_info", this.f144398z);
                this.f144368A = this.f144378f.getBoolean("linked_device", this.f144368A);
                this.f144369B = this.f144378f.getString("linked_ad_unit", this.f144369B);
                this.f144384l = this.f144378f.getString("IABTCF_gdprApplies", this.f144384l);
                this.f144386n = this.f144378f.getString("IABTCF_PurposeConsents", this.f144386n);
                this.f144385m = this.f144378f.getString("IABTCF_TCString", this.f144385m);
                this.f144387o = this.f144378f.getInt("gad_has_consent_for_cookies", this.f144387o);
                try {
                    this.f144394v = new JSONObject(this.f144378f.getString("native_advanced_settings", WeJson.EMPTY_MAP));
                } catch (JSONException e) {
                    dct0.m115299h("Could not convert native advanced settings to json object", e);
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m165362y() {
        hpr hprVar = this.f144376d;
        if (hprVar == null || hprVar.isDone()) {
            return;
        }
        try {
            this.f144376d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            dct0.m115299h("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            dct0.m115296e("Fail to initialize AdSharedPreferenceManager.", e2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m165363z() {
        oct0.f146733a.execute(new Runnable() { // from class: l.qix0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157896a.zzg();
            }
        });
    }

    @Override // p153l.grw0
    public final void zzD(long j) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144390r == j) {
                    return;
                }
                this.f144390r = j;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    public final void zzE(int i) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                this.f144387o = i;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    public final boolean zzN() {
        boolean z;
        m165362y();
        synchronized (this.f144373a) {
            z = this.f144395w;
        }
        return z;
    }

    @Override // p153l.grw0
    public final boolean zzO() {
        boolean z;
        m165362y();
        synchronized (this.f144373a) {
            z = this.f144396x;
        }
        return z;
    }

    @Override // p153l.grw0
    public final int zza() {
        int i;
        m165362y();
        synchronized (this.f144373a) {
            i = this.f144392t;
        }
        return i;
    }

    @Override // p153l.grw0
    public final int zzb() {
        int i;
        m165362y();
        synchronized (this.f144373a) {
            i = this.f144387o;
        }
        return i;
    }

    @Override // p153l.grw0
    public final int zzc() {
        int i;
        m165362y();
        synchronized (this.f144373a) {
            i = this.f144391s;
        }
        return i;
    }

    @Override // p153l.grw0
    public final long zzd() {
        long j;
        m165362y();
        synchronized (this.f144373a) {
            j = this.f144389q;
        }
        return j;
    }

    @Override // p153l.grw0
    public final long zze() {
        long j;
        m165362y();
        synchronized (this.f144373a) {
            j = this.f144390r;
        }
        return j;
    }

    @Override // p153l.grw0
    public final long zzf() {
        long j;
        m165362y();
        synchronized (this.f144373a) {
            j = this.f144372E;
        }
        return j;
    }

    @Override // p153l.grw0
    @Nullable
    public final f8s0 zzg() {
        if (!this.f144374b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) qis0.f157864b.m149974e()).booleanValue()) {
            return null;
        }
        synchronized (this.f144373a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f144377e == null) {
                    this.f144377e = new f8s0();
                }
                this.f144377e.m124558e();
                dct0.m115297f("start fetching content...");
                return this.f144377e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    public final yat0 zzh() {
        yat0 yat0Var;
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168291eb)).booleanValue() && this.f144388p.m214932j()) {
                    Iterator it = this.f144375c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                yat0Var = this.f144388p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yat0Var;
    }

    @Override // p153l.grw0
    public final yat0 zzi() {
        yat0 yat0Var;
        synchronized (this.f144373a) {
            yat0Var = this.f144388p;
        }
        return yat0Var;
    }

    @Override // p153l.grw0
    @Nullable
    public final String zzj() {
        String str;
        m165362y();
        synchronized (this.f144373a) {
            str = this.f144381i;
        }
        return str;
    }

    @Override // p153l.grw0
    @Nullable
    public final String zzk() {
        String str;
        m165362y();
        synchronized (this.f144373a) {
            str = this.f144382j;
        }
        return str;
    }

    @Override // p153l.grw0
    public final String zzl() {
        String str;
        m165362y();
        synchronized (this.f144373a) {
            str = this.f144369B;
        }
        return str;
    }

    @Override // p153l.grw0
    public final String zzm() {
        String str;
        m165362y();
        synchronized (this.f144373a) {
            str = this.f144397y;
        }
        return str;
    }

    @Override // p153l.grw0
    public final String zzo() {
        String str;
        m165362y();
        synchronized (this.f144373a) {
            str = this.f144398z;
        }
        return str;
    }

    @Override // p153l.grw0
    public final JSONObject zzp() {
        JSONObject jSONObject;
        m165362y();
        synchronized (this.f144373a) {
            jSONObject = this.f144394v;
        }
        return jSONObject;
    }

    @Override // p153l.grw0
    public final void zzs() {
        m165362y();
        synchronized (this.f144373a) {
            try {
                this.f144394v = new JSONObject();
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grw0
    public final void zzv(int i) {
        m165362y();
        synchronized (this.f144373a) {
            try {
                if (this.f144392t == i) {
                    return;
                }
                this.f144392t = i;
                SharedPreferences.Editor editor = this.f144379g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f144379g.apply();
                }
                m165363z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
