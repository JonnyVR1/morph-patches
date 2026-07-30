package p153l;

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
public final class yat0 {

    /* JADX INFO: renamed from: d */
    public String f198244d;

    /* JADX INFO: renamed from: e */
    public String f198245e;

    /* JADX INFO: renamed from: f */
    public long f198246f;

    /* JADX INFO: renamed from: g */
    public JSONObject f198247g;

    /* JADX INFO: renamed from: h */
    public boolean f198248h;

    /* JADX INFO: renamed from: j */
    public boolean f198250j;

    /* JADX INFO: renamed from: a */
    public final List f198241a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f198242b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Map f198243c = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List f198249i = new ArrayList();

    public yat0(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f198244d = "";
        this.f198248h = false;
        this.f198250j = false;
        this.f198245e = str;
        this.f198246f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f198247g = new JSONObject(str);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168278db)).booleanValue() && m214932j()) {
                return;
            }
            if (this.f198247g.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.f198248h = false;
                dct0.m115298g("App settings could not be fetched successfully.");
                return;
            }
            this.f198248h = true;
            this.f198244d = this.f198247g.optString(Constants.JumpUrlConstants.URL_KEY_APPID);
            JSONArray jSONArrayOptJSONArray2 = this.f198247g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f198242b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f198243c.put(strOptString2, new ows0(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f198247g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.f198241a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168162U6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f198247g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.f198249i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168429p6)).booleanValue() || (jSONObjectOptJSONObject = this.f198247g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f198250j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            dct0.m115299h("Exception occurred while processing app setting json", e);
            bxy0.m106933q().m120275w(e, "AppSettings.parseAppSettingsJson");
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m214923a() {
        return this.f198246f;
    }

    /* JADX INFO: renamed from: b */
    public final String m214924b() {
        return this.f198244d;
    }

    /* JADX INFO: renamed from: c */
    public final String m214925c() {
        return this.f198245e;
    }

    /* JADX INFO: renamed from: d */
    public final List m214926d() {
        return this.f198249i;
    }

    /* JADX INFO: renamed from: e */
    public final Map m214927e() {
        return this.f198243c;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m214928f() {
        return this.f198247g;
    }

    /* JADX INFO: renamed from: g */
    public final void m214929g(long j) {
        this.f198246f = j;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m214930h() {
        return this.f198250j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m214931i() {
        return this.f198248h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m214932j() {
        if (!TextUtils.isEmpty(this.f198245e) && this.f198247g != null) {
            dgs0 dgs0Var = sgs0.f168317gb;
            long jLongValue = ((Long) jas0.m144075c().m176505a(dgs0Var)).longValue();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168304fb)).booleanValue() && !TextUtils.isEmpty(this.f198245e)) {
                jLongValue = this.f198247g.optLong("cache_ttl_sec", ((Long) jas0.m144075c().m176505a(dgs0Var)).longValue());
            }
            long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
            if (jLongValue >= 0) {
                long j = this.f198246f;
                if (j > jCurrentTimeMillis || (jCurrentTimeMillis - j) / 1000 > jLongValue) {
                    this.f198241a.clear();
                    this.f198242b.clear();
                    this.f198243c.clear();
                    this.f198244d = "";
                    this.f198245e = "";
                    this.f198247g = null;
                    this.f198248h = false;
                    this.f198249i.clear();
                    this.f198250j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
