package p153l;

import android.app.Application;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class ukg0 {

    /* JADX INFO: renamed from: a */
    public String f179392a;

    /* JADX INFO: renamed from: b */
    public String f179393b;

    /* JADX INFO: renamed from: k */
    public Boolean f179402k;

    /* JADX INFO: renamed from: l */
    public Boolean f179403l;

    /* JADX INFO: renamed from: m */
    public Integer f179404m;

    /* JADX INFO: renamed from: n */
    public bxg0 f179405n;

    /* JADX INFO: renamed from: o */
    public Long f179406o;

    /* JADX INFO: renamed from: p */
    public Integer f179407p;

    /* JADX INFO: renamed from: q */
    public Long f179408q;

    /* JADX INFO: renamed from: r */
    public Integer f179409r;

    /* JADX INFO: renamed from: s */
    public Long f179410s;

    /* JADX INFO: renamed from: t */
    public Long f179411t;

    /* JADX INFO: renamed from: u */
    public Long f179412u;

    /* JADX INFO: renamed from: d */
    public String f179395d = "";

    /* JADX INFO: renamed from: e */
    public int f179396e = 0;

    /* JADX INFO: renamed from: f */
    public String f179397f = "success";

    /* JADX INFO: renamed from: g */
    public String f179398g = "";

    /* JADX INFO: renamed from: j */
    public final HashMap f179401j = new HashMap();

    /* JADX INFO: renamed from: h */
    public final long f179399h = System.currentTimeMillis();

    /* JADX INFO: renamed from: i */
    public final long f179400i = System.nanoTime() / 1000000;

    /* JADX INFO: renamed from: c */
    public String f179394c = gxg0.m132863b(UUID.randomUUID().toString());

    public ukg0(String str) {
        this.f179392a = str;
        this.f179393b = fug0.m127462a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m196487a(JSONObject jSONObject) throws JSONException {
        Application app = Utils.getApp();
        if (app == null) {
            jSONObject.put("proxy", "");
            return;
        }
        jSONObject.put("net_type", vzg0.m204092a(app));
        StringBuilder sb = new StringBuilder();
        boolean zM204094c = vzg0.m204094c(app);
        boolean zM204093b = vzg0.m204093b(app);
        if (zM204094c) {
            sb.append("proxy");
        }
        if (zM204093b) {
            if (sb.length() > 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append("vpn");
        }
        jSONObject.put("proxy", sb.toString());
    }

    public final String toString() {
        Object obj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "SudMGP");
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, utg0.f180952g);
            jSONObject.put("mg_id", this.f179398g);
            jSONObject.put("is_test_env", utg0.f180948c);
            jSONObject.put("env_type", utg0.f180951f);
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put("sdk_version_alias", "v1.6.7.1286-static");
            jSONObject.put("et_is_dynamic", false);
            jSONObject.put("sud_is_dynamic", false);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f179392a);
            jSONObject.put("event_id", this.f179393b);
            jSONObject.put("trace_id", utg0.f180955j);
            String str = this.f179398g;
            String str2 = fug0.f100911a;
            if (TextUtils.isEmpty(str) || (obj = (String) fug0.f100914d.get(str)) == null) {
                obj = "";
            }
            jSONObject.put("span_id", obj);
            jSONObject.put("request_id", this.f179394c);
            jSONObject.put("user_id", fug0.f100911a);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", utg0.m198036d());
            jSONObject.put("start_timestamp", this.f179399h);
            jSONObject.put("end_timestamp", System.currentTimeMillis());
            long jNanoTime = (System.nanoTime() / 1000000) - this.f179400i;
            Long l2 = this.f179406o;
            long jLongValue = 0;
            long jLongValue2 = jNanoTime - (l2 == null ? 0L : l2.longValue());
            Long l3 = this.f179412u;
            if (l3 != null) {
                jLongValue = l3.longValue();
            }
            jSONObject.put("cost_time", jLongValue2 - jLongValue);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : this.f179401j.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject2.put("ret_msg", this.f179397f);
            jSONObject2.put("ret_code", this.f179396e);
            jSONObject2.put("resp", this.f179395d);
            jSONObject.put("extras", jSONObject2);
            jSONObject.put("ret_code", this.f179396e);
            jSONObject.put("ret_msg", this.f179397f);
            m196487a(jSONObject);
            jSONObject.put("device_brand", pqg0.m173348a());
            jSONObject.put("os_version", pqg0.m173351d());
            jSONObject.put("device_id", pqg0.m173350c());
            Object obj2 = this.f179402k;
            if (obj2 != null) {
                jSONObject.put("local_pkg", obj2);
            }
            Object obj3 = this.f179403l;
            if (obj3 != null) {
                jSONObject.put("local_core", obj3);
            }
            if (this.f179405n != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dns", this.f179405n.f78868a);
                jSONObject3.put("secure_connect", this.f179405n.f78870c);
                jSONObject3.put("connect", this.f179405n.f78869b);
                jSONObject3.put(SocialConstants.TYPE_REQUEST, this.f179405n.f78871d);
                jSONObject3.put("response", this.f179405n.f78872e);
                jSONObject3.put("chain_reuse", this.f179405n.f78874g);
                jSONObject3.put("server_response", this.f179405n.f78873f);
                jSONObject2.put("cost_time_detail", jSONObject3);
            }
            Object obj4 = this.f179404m;
            if (obj4 != null) {
                jSONObject.put("timeout_code", obj4);
            }
            Object obj5 = this.f179406o;
            if (obj5 != null) {
                jSONObject.put("pause_cost_time", obj5);
            }
            Object obj6 = this.f179407p;
            if (obj6 != null) {
                jSONObject.put("last_percent", obj6);
            }
            Object obj7 = this.f179408q;
            if (obj7 != null) {
                jSONObject.put("last_wait_timestamp", obj7);
            }
            Object obj8 = this.f179409r;
            if (obj8 != null) {
                jSONObject.put("is_background", obj8);
            }
            Object obj9 = this.f179410s;
            if (obj9 != null) {
                jSONObject.put("total_space", obj9);
            }
            Object obj10 = this.f179411t;
            if (obj10 != null) {
                jSONObject.put("free_space", obj10);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
