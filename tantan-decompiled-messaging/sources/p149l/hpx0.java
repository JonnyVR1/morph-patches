package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.p046p1.mobile.putong.data.User;
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
public final class hpx0 implements aiw0 {

    /* JADX INFO: renamed from: b */
    public boolean f108993b;

    /* JADX INFO: renamed from: d */
    public gnr f108995d;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SharedPreferences f108997f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public SharedPreferences.Editor f108998g;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f109000i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f109001j;

    /* JADX INFO: renamed from: a */
    public final Object f108992a = new Object();

    /* JADX INFO: renamed from: c */
    public final List f108994c = new ArrayList();

    /* JADX INFO: renamed from: e */
    @Nullable
    public zyr0 f108996e = null;

    /* JADX INFO: renamed from: h */
    public boolean f108999h = true;

    /* JADX INFO: renamed from: k */
    public boolean f109002k = true;

    /* JADX INFO: renamed from: l */
    public String f109003l = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: m */
    public String f109004m = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: n */
    public String f109005n = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: o */
    public int f109006o = -1;

    /* JADX INFO: renamed from: p */
    public s1t0 f109007p = new s1t0("", 0);

    /* JADX INFO: renamed from: q */
    public long f109008q = 0;

    /* JADX INFO: renamed from: r */
    public long f109009r = 0;

    /* JADX INFO: renamed from: s */
    public int f109010s = -1;

    /* JADX INFO: renamed from: t */
    public int f109011t = 0;

    /* JADX INFO: renamed from: u */
    public Set f109012u = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: v */
    public JSONObject f109013v = new JSONObject();

    /* JADX INFO: renamed from: w */
    public boolean f109014w = true;

    /* JADX INFO: renamed from: x */
    public boolean f109015x = true;

    /* JADX INFO: renamed from: y */
    public String f109016y = null;

    /* JADX INFO: renamed from: z */
    public String f109017z = "";

    /* JADX INFO: renamed from: A */
    public boolean f108987A = false;

    /* JADX INFO: renamed from: B */
    public String f108988B = "";

    /* JADX INFO: renamed from: C */
    public int f108989C = -1;

    /* JADX INFO: renamed from: D */
    public int f108990D = -1;

    /* JADX INFO: renamed from: E */
    public long f108991E = 0;

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: a */
    public final void mo96942a(boolean z) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
            m132419y();
            synchronized (this.f108992a) {
                try {
                    if (this.f108987A == z) {
                        return;
                    }
                    this.f108987A = z;
                    SharedPreferences.Editor editor = this.f108998g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f108998g.apply();
                    }
                    m132420z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:4:0x0006, B:14:0x0022, B:25:0x003c, B:27:0x0040, B:30:0x004a, B:32:0x0051, B:31:0x004e, B:33:0x0056, B:34:0x0059, B:36:0x005b, B:20:0x002f, B:24:0x003a), top: B:40:0x0006 }] */
    @Override // p149l.aiw0
    /* JADX INFO: renamed from: b */
    public final void mo96943b(@NonNull String str, @NonNull String str2) {
        boolean zEquals;
        SharedPreferences.Editor editor;
        m132419y();
        synchronized (this.f108992a) {
            int iHashCode = str.hashCode();
            if (iHashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    this.f109005n = str2;
                    if (this.f108998g != null) {
                        zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                        editor = this.f108998g;
                        if (zEquals) {
                            editor.remove(str);
                        } else {
                            editor.putString(str, str2);
                        }
                        this.f108998g.apply();
                    }
                    m132420z();
                }
            }
            if (iHashCode == 83641339) {
                if (str.equals("IABTCF_gdprApplies")) {
                    this.f109003l = str2;
                    if (this.f108998g != null) {
                        zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                        editor = this.f108998g;
                        if (zEquals) {
                            editor.remove(str);
                        } else {
                            editor.putString(str, str2);
                        }
                        this.f108998g.apply();
                    }
                    m132420z();
                }
            }
            if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                this.f109004m = str2;
                if (this.f108998g != null) {
                    zEquals = str2.equals(User.ID_TEAM_ACCOUNT);
                    editor = this.f108998g;
                    if (zEquals) {
                        editor.remove(str);
                    } else {
                        editor.putString(str, str2);
                    }
                    this.f108998g.apply();
                }
                m132420z();
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: c */
    public final void mo96944c(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
            m132419y();
            synchronized (this.f108992a) {
                try {
                    if (this.f108988B.equals(str)) {
                        return;
                    }
                    this.f108988B = str;
                    SharedPreferences.Editor editor = this.f108998g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f108998g.apply();
                    }
                    m132420z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: d */
    public final void mo96945d(int i) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109010s == i) {
                    return;
                }
                this.f109010s = i;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: e */
    public final void mo96946e(int i) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f108990D == i) {
                    return;
                }
                this.f108990D = i;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: f */
    public final boolean mo96947f() {
        boolean z;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132415u0)).booleanValue()) {
            return false;
        }
        m132419y();
        synchronized (this.f108992a) {
            z = this.f109002k;
        }
        return z;
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: g */
    public final void mo96948g(boolean z) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (z == this.f109002k) {
                    return;
                }
                this.f109002k = z;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: h */
    public final boolean mo96949h() {
        boolean z;
        m132419y();
        synchronized (this.f108992a) {
            z = this.f108987A;
        }
        return z;
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: i */
    public final void mo96950i(String str) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (TextUtils.equals(this.f109016y, str)) {
                    return;
                }
                this.f109016y = str;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: j */
    public final void mo96951j(boolean z) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) d1s0.m109677c().m144697a(m7s0.f132118W9)).longValue();
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.f108998g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: k */
    public final void mo96952k(final Context context) {
        synchronized (this.f108992a) {
            try {
                if (this.f108997f != null) {
                    return;
                }
                final String str = "admob";
                this.f108995d = i3t0.f111372a.mo122103a(new Runnable(context, str) { // from class: l.kkx0

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Context f123606b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f123607c = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123605a.m132418x(this.f123606b, this.f123607c);
                    }
                });
                this.f108993b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: l */
    public final void mo96953l(long j) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f108991E == j) {
                    return;
                }
                this.f108991E = j;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: m */
    public final void mo96954m(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue()) {
            m132419y();
            synchronized (this.f108992a) {
                try {
                    if (this.f109017z.equals(str)) {
                        return;
                    }
                    this.f109017z = str;
                    SharedPreferences.Editor editor = this.f108998g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f108998g.apply();
                    }
                    m132420z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: n */
    public final boolean mo96955n() {
        m132419y();
        synchronized (this.f108992a) {
            try {
                SharedPreferences sharedPreferences = this.f108997f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f108997f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f109002k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: o */
    public final void mo96956o(String str, String str2, boolean z) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f109013v.optJSONArray(str);
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
                    jSONObject.put("timestamp_ms", vny0.m199064b().currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f109013v.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    x2t0.m206870h("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f109013v.toString());
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: p */
    public final void mo96957p(Runnable runnable) {
        this.f108994c.add(runnable);
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: q */
    public final void mo96958q(long j) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109008q == j) {
                    return;
                }
                this.f109008q = j;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: r */
    public final void mo96959r(boolean z) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109014w == z) {
                    return;
                }
                this.f109014w = z;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: s */
    public final void mo96960s(@Nullable String str) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (str.equals(this.f109000i)) {
                    return;
                }
                this.f109000i = str;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: t */
    public final void mo96961t(String str) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
                if (str != null && !str.equals(this.f109007p.m182044c())) {
                    this.f109007p = new s1t0(str, jCurrentTimeMillis);
                    SharedPreferences.Editor editor = this.f108998g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f108998g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                        this.f108998g.apply();
                    }
                    m132420z();
                    Iterator it = this.f108994c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f109007p.m182048g(jCurrentTimeMillis);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: u */
    public final void mo96962u(boolean z) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109015x == z) {
                    return;
                }
                this.f109015x = z;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    @Nullable
    /* JADX INFO: renamed from: v */
    public final String mo96963v(@NonNull String str) {
        m132419y();
        synchronized (this.f108992a) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        return this.f109004m;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    return this.f109003l;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                return this.f109005n;
            }
            return null;
        }
    }

    @Override // p149l.aiw0
    /* JADX INFO: renamed from: w */
    public final void mo96964w(@Nullable String str) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (str.equals(this.f109001j)) {
                    return;
                }
                this.f109001j = str;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m132418x(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f108992a) {
            try {
                this.f108997f = sharedPreferences;
                this.f108998g = editorEdit;
                if (PlatformVersion.isAtLeastM()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                this.f108999h = this.f108997f.getBoolean("use_https", this.f108999h);
                this.f109014w = this.f108997f.getBoolean("content_url_opted_out", this.f109014w);
                this.f109000i = this.f108997f.getString("content_url_hashes", this.f109000i);
                this.f109002k = this.f108997f.getBoolean("gad_idless", this.f109002k);
                this.f109015x = this.f108997f.getBoolean("content_vertical_opted_out", this.f109015x);
                this.f109001j = this.f108997f.getString("content_vertical_hashes", this.f109001j);
                this.f109011t = this.f108997f.getInt("version_code", this.f109011t);
                this.f109007p = new s1t0(this.f108997f.getString("app_settings_json", this.f109007p.m182044c()), this.f108997f.getLong("app_settings_last_update_ms", this.f109007p.m182042a()));
                this.f109008q = this.f108997f.getLong("app_last_background_time_ms", this.f109008q);
                this.f109010s = this.f108997f.getInt("request_in_session_count", this.f109010s);
                this.f109009r = this.f108997f.getLong("first_ad_req_time_ms", this.f109009r);
                this.f109012u = this.f108997f.getStringSet("never_pool_slots", this.f109012u);
                this.f109016y = this.f108997f.getString("display_cutout", this.f109016y);
                this.f108989C = this.f108997f.getInt("app_measurement_npa", this.f108989C);
                this.f108990D = this.f108997f.getInt("sd_app_measure_npa", this.f108990D);
                this.f108991E = this.f108997f.getLong("sd_app_measure_npa_ts", this.f108991E);
                this.f109017z = this.f108997f.getString("inspector_info", this.f109017z);
                this.f108987A = this.f108997f.getBoolean("linked_device", this.f108987A);
                this.f108988B = this.f108997f.getString("linked_ad_unit", this.f108988B);
                this.f109003l = this.f108997f.getString("IABTCF_gdprApplies", this.f109003l);
                this.f109005n = this.f108997f.getString("IABTCF_PurposeConsents", this.f109005n);
                this.f109004m = this.f108997f.getString("IABTCF_TCString", this.f109004m);
                this.f109006o = this.f108997f.getInt("gad_has_consent_for_cookies", this.f109006o);
                try {
                    this.f109013v = new JSONObject(this.f108997f.getString("native_advanced_settings", WeJson.EMPTY_MAP));
                } catch (JSONException e) {
                    x2t0.m206870h("Could not convert native advanced settings to json object", e);
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m132419y() {
        gnr gnrVar = this.f108995d;
        if (gnrVar == null || gnrVar.isDone()) {
            return;
        }
        try {
            this.f108995d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            x2t0.m206870h("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            x2t0.m206867e("Fail to initialize AdSharedPreferenceManager.", e2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m132420z() {
        i3t0.f111372a.execute(new Runnable() { // from class: l.k9x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122079a.zzg();
            }
        });
    }

    @Override // p149l.aiw0
    public final void zzD(long j) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109009r == j) {
                    return;
                }
                this.f109009r = j;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    public final void zzE(int i) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                this.f109006o = i;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    public final boolean zzN() {
        boolean z;
        m132419y();
        synchronized (this.f108992a) {
            z = this.f109014w;
        }
        return z;
    }

    @Override // p149l.aiw0
    public final boolean zzO() {
        boolean z;
        m132419y();
        synchronized (this.f108992a) {
            z = this.f109015x;
        }
        return z;
    }

    @Override // p149l.aiw0
    public final int zza() {
        int i;
        m132419y();
        synchronized (this.f108992a) {
            i = this.f109011t;
        }
        return i;
    }

    @Override // p149l.aiw0
    public final int zzb() {
        int i;
        m132419y();
        synchronized (this.f108992a) {
            i = this.f109006o;
        }
        return i;
    }

    @Override // p149l.aiw0
    public final int zzc() {
        int i;
        m132419y();
        synchronized (this.f108992a) {
            i = this.f109010s;
        }
        return i;
    }

    @Override // p149l.aiw0
    public final long zzd() {
        long j;
        m132419y();
        synchronized (this.f108992a) {
            j = this.f109008q;
        }
        return j;
    }

    @Override // p149l.aiw0
    public final long zze() {
        long j;
        m132419y();
        synchronized (this.f108992a) {
            j = this.f109009r;
        }
        return j;
    }

    @Override // p149l.aiw0
    public final long zzf() {
        long j;
        m132419y();
        synchronized (this.f108992a) {
            j = this.f108991E;
        }
        return j;
    }

    @Override // p149l.aiw0
    @Nullable
    public final zyr0 zzg() {
        if (!this.f108993b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) k9s0.f122065b.m115379e()).booleanValue()) {
            return null;
        }
        synchronized (this.f108992a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f108996e == null) {
                    this.f108996e = new zyr0();
                }
                this.f108996e.m220941e();
                x2t0.m206868f("start fetching content...");
                return this.f108996e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    public final s1t0 zzh() {
        s1t0 s1t0Var;
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132220eb)).booleanValue() && this.f109007p.m182051j()) {
                    Iterator it = this.f108994c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                s1t0Var = this.f109007p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1t0Var;
    }

    @Override // p149l.aiw0
    public final s1t0 zzi() {
        s1t0 s1t0Var;
        synchronized (this.f108992a) {
            s1t0Var = this.f109007p;
        }
        return s1t0Var;
    }

    @Override // p149l.aiw0
    @Nullable
    public final String zzj() {
        String str;
        m132419y();
        synchronized (this.f108992a) {
            str = this.f109000i;
        }
        return str;
    }

    @Override // p149l.aiw0
    @Nullable
    public final String zzk() {
        String str;
        m132419y();
        synchronized (this.f108992a) {
            str = this.f109001j;
        }
        return str;
    }

    @Override // p149l.aiw0
    public final String zzl() {
        String str;
        m132419y();
        synchronized (this.f108992a) {
            str = this.f108988B;
        }
        return str;
    }

    @Override // p149l.aiw0
    public final String zzm() {
        String str;
        m132419y();
        synchronized (this.f108992a) {
            str = this.f109016y;
        }
        return str;
    }

    @Override // p149l.aiw0
    public final String zzo() {
        String str;
        m132419y();
        synchronized (this.f108992a) {
            str = this.f109017z;
        }
        return str;
    }

    @Override // p149l.aiw0
    public final JSONObject zzp() {
        JSONObject jSONObject;
        m132419y();
        synchronized (this.f108992a) {
            jSONObject = this.f109013v;
        }
        return jSONObject;
    }

    @Override // p149l.aiw0
    public final void zzs() {
        m132419y();
        synchronized (this.f108992a) {
            try {
                this.f109013v = new JSONObject();
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.aiw0
    public final void zzv(int i) {
        m132419y();
        synchronized (this.f108992a) {
            try {
                if (this.f109011t == i) {
                    return;
                }
                this.f109011t = i;
                SharedPreferences.Editor editor = this.f108998g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f108998g.apply();
                }
                m132420z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
