package p149l;

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
public final class mcg0 {

    /* JADX INFO: renamed from: a */
    public String f133111a;

    /* JADX INFO: renamed from: b */
    public String f133112b;

    /* JADX INFO: renamed from: k */
    public Boolean f133121k;

    /* JADX INFO: renamed from: l */
    public Boolean f133122l;

    /* JADX INFO: renamed from: m */
    public Integer f133123m;

    /* JADX INFO: renamed from: n */
    public tog0 f133124n;

    /* JADX INFO: renamed from: o */
    public Long f133125o;

    /* JADX INFO: renamed from: p */
    public Integer f133126p;

    /* JADX INFO: renamed from: q */
    public Long f133127q;

    /* JADX INFO: renamed from: r */
    public Integer f133128r;

    /* JADX INFO: renamed from: s */
    public Long f133129s;

    /* JADX INFO: renamed from: t */
    public Long f133130t;

    /* JADX INFO: renamed from: u */
    public Long f133131u;

    /* JADX INFO: renamed from: d */
    public String f133114d = "";

    /* JADX INFO: renamed from: e */
    public int f133115e = 0;

    /* JADX INFO: renamed from: f */
    public String f133116f = "success";

    /* JADX INFO: renamed from: g */
    public String f133117g = "";

    /* JADX INFO: renamed from: j */
    public final HashMap f133120j = new HashMap();

    /* JADX INFO: renamed from: h */
    public final long f133118h = System.currentTimeMillis();

    /* JADX INFO: renamed from: i */
    public final long f133119i = System.nanoTime() / 1000000;

    /* JADX INFO: renamed from: c */
    public String f133113c = yog0.m215499b(UUID.randomUUID().toString());

    public mcg0(String str) {
        this.f133111a = str;
        this.f133112b = xlg0.m209888a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m154000a(JSONObject jSONObject) throws JSONException {
        Application app = Utils.getApp();
        if (app == null) {
            jSONObject.put("proxy", "");
            return;
        }
        jSONObject.put("net_type", nrg0.m160737a(app));
        StringBuilder sb = new StringBuilder();
        boolean zM160739c = nrg0.m160739c(app);
        boolean zM160738b = nrg0.m160738b(app);
        if (zM160739c) {
            sb.append("proxy");
        }
        if (zM160738b) {
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
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, mlg0.f134432g);
            jSONObject.put("mg_id", this.f133117g);
            jSONObject.put("is_test_env", mlg0.f134428c);
            jSONObject.put("env_type", mlg0.f134431f);
            jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "1.6.7.1286");
            jSONObject.put("sdk_version_alias", "v1.6.7.1286-static");
            jSONObject.put("et_is_dynamic", false);
            jSONObject.put("sud_is_dynamic", false);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f133111a);
            jSONObject.put("event_id", this.f133112b);
            jSONObject.put("trace_id", mlg0.f134435j);
            String str = this.f133117g;
            String str2 = xlg0.f193417a;
            if (TextUtils.isEmpty(str) || (obj = (String) xlg0.f193420d.get(str)) == null) {
                obj = "";
            }
            jSONObject.put("span_id", obj);
            jSONObject.put("request_id", this.f133113c);
            jSONObject.put("user_id", xlg0.f193417a);
            jSONObject.put("platform", 2);
            jSONObject.put("bundle_id", mlg0.m155145d());
            jSONObject.put("start_timestamp", this.f133118h);
            jSONObject.put("end_timestamp", System.currentTimeMillis());
            long jNanoTime = (System.nanoTime() / 1000000) - this.f133119i;
            Long l2 = this.f133125o;
            long jLongValue = 0;
            long jLongValue2 = jNanoTime - (l2 == null ? 0L : l2.longValue());
            Long l3 = this.f133131u;
            if (l3 != null) {
                jLongValue = l3.longValue();
            }
            jSONObject.put("cost_time", jLongValue2 - jLongValue);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : this.f133120j.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject2.put("ret_msg", this.f133116f);
            jSONObject2.put("ret_code", this.f133115e);
            jSONObject2.put("resp", this.f133114d);
            jSONObject.put("extras", jSONObject2);
            jSONObject.put("ret_code", this.f133115e);
            jSONObject.put("ret_msg", this.f133116f);
            m154000a(jSONObject);
            jSONObject.put("device_brand", hig0.m131254a());
            jSONObject.put("os_version", hig0.m131257d());
            jSONObject.put("device_id", hig0.m131256c());
            Object obj2 = this.f133121k;
            if (obj2 != null) {
                jSONObject.put("local_pkg", obj2);
            }
            Object obj3 = this.f133122l;
            if (obj3 != null) {
                jSONObject.put("local_core", obj3);
            }
            if (this.f133124n != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dns", this.f133124n.f171366a);
                jSONObject3.put("secure_connect", this.f133124n.f171368c);
                jSONObject3.put("connect", this.f133124n.f171367b);
                jSONObject3.put(SocialConstants.TYPE_REQUEST, this.f133124n.f171369d);
                jSONObject3.put("response", this.f133124n.f171370e);
                jSONObject3.put("chain_reuse", this.f133124n.f171372g);
                jSONObject3.put("server_response", this.f133124n.f171371f);
                jSONObject2.put("cost_time_detail", jSONObject3);
            }
            Object obj4 = this.f133123m;
            if (obj4 != null) {
                jSONObject.put("timeout_code", obj4);
            }
            Object obj5 = this.f133125o;
            if (obj5 != null) {
                jSONObject.put("pause_cost_time", obj5);
            }
            Object obj6 = this.f133126p;
            if (obj6 != null) {
                jSONObject.put("last_percent", obj6);
            }
            Object obj7 = this.f133127q;
            if (obj7 != null) {
                jSONObject.put("last_wait_timestamp", obj7);
            }
            Object obj8 = this.f133128r;
            if (obj8 != null) {
                jSONObject.put("is_background", obj8);
            }
            Object obj9 = this.f133129s;
            if (obj9 != null) {
                jSONObject.put("total_space", obj9);
            }
            Object obj10 = this.f133130t;
            if (obj10 != null) {
                jSONObject.put("free_space", obj10);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
