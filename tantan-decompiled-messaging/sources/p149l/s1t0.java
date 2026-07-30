package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s1t0 {

    /* JADX INFO: renamed from: d */
    public String f161939d;

    /* JADX INFO: renamed from: e */
    public String f161940e;

    /* JADX INFO: renamed from: f */
    public long f161941f;

    /* JADX INFO: renamed from: g */
    public JSONObject f161942g;

    /* JADX INFO: renamed from: h */
    public boolean f161943h;

    /* JADX INFO: renamed from: j */
    public boolean f161945j;

    /* JADX INFO: renamed from: a */
    public final List f161936a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f161937b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Map f161938c = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List f161944i = new ArrayList();

    public s1t0(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f161939d = "";
        this.f161943h = false;
        this.f161945j = false;
        this.f161940e = str;
        this.f161941f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f161942g = new JSONObject(str);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132207db)).booleanValue() && m182051j()) {
                return;
            }
            if (this.f161942g.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.f161943h = false;
                x2t0.m206869g("App settings could not be fetched successfully.");
                return;
            }
            this.f161943h = true;
            this.f161939d = this.f161942g.optString(Constants.JumpUrlConstants.URL_KEY_APPID);
            JSONArray jSONArrayOptJSONArray2 = this.f161942g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f161937b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f161938c.put(strOptString2, new ins0(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f161942g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.f161936a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132091U6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f161942g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.f161944i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132358p6)).booleanValue() || (jSONObjectOptJSONObject = this.f161942g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f161945j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            x2t0.m206870h("Exception occurred while processing app setting json", e);
            vny0.m199079q().m212290w(e, "AppSettings.parseAppSettingsJson");
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m182042a() {
        return this.f161941f;
    }

    /* JADX INFO: renamed from: b */
    public final String m182043b() {
        return this.f161939d;
    }

    /* JADX INFO: renamed from: c */
    public final String m182044c() {
        return this.f161940e;
    }

    /* JADX INFO: renamed from: d */
    public final List m182045d() {
        return this.f161944i;
    }

    /* JADX INFO: renamed from: e */
    public final Map m182046e() {
        return this.f161938c;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m182047f() {
        return this.f161942g;
    }

    /* JADX INFO: renamed from: g */
    public final void m182048g(long j) {
        this.f161941f = j;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m182049h() {
        return this.f161945j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m182050i() {
        return this.f161943h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m182051j() {
        if (!TextUtils.isEmpty(this.f161940e) && this.f161942g != null) {
            x6s0 x6s0Var = m7s0.f132246gb;
            long jLongValue = ((Long) d1s0.m109677c().m144697a(x6s0Var)).longValue();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132233fb)).booleanValue() && !TextUtils.isEmpty(this.f161940e)) {
                jLongValue = this.f161942g.optLong("cache_ttl_sec", ((Long) d1s0.m109677c().m144697a(x6s0Var)).longValue());
            }
            long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
            if (jLongValue >= 0) {
                long j = this.f161941f;
                if (j > jCurrentTimeMillis || (jCurrentTimeMillis - j) / 1000 > jLongValue) {
                    this.f161936a.clear();
                    this.f161937b.clear();
                    this.f161938c.clear();
                    this.f161939d = "";
                    this.f161940e = "";
                    this.f161942g = null;
                    this.f161943h = false;
                    this.f161944i.clear();
                    this.f161945j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
