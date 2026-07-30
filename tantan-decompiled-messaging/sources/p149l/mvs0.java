package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mvs0 {

    /* JADX INFO: renamed from: a */
    public final List f135975a;

    /* JADX INFO: renamed from: b */
    public final String f135976b;

    /* JADX INFO: renamed from: c */
    public final String f135977c;

    /* JADX INFO: renamed from: d */
    public final String f135978d;

    /* JADX INFO: renamed from: e */
    public final boolean f135979e;

    /* JADX INFO: renamed from: f */
    public final boolean f135980f;

    /* JADX INFO: renamed from: g */
    public final String f135981g;

    /* JADX INFO: renamed from: h */
    public final String f135982h;

    /* JADX INFO: renamed from: i */
    public final String f135983i;

    /* JADX INFO: renamed from: j */
    public final int f135984j;

    /* JADX INFO: renamed from: k */
    public final JSONObject f135985k;

    /* JADX INFO: renamed from: l */
    public final String f135986l;

    /* JADX INFO: renamed from: m */
    public final String f135987m;

    public mvs0(JSONObject jSONObject) {
        this.f135983i = jSONObject.optString("url");
        this.f135976b = jSONObject.optString("base_uri");
        this.f135977c = jSONObject.optString("post_parameters");
        this.f135979e = m156593j(jSONObject.optString("drt_include"));
        this.f135980f = m156593j(jSONObject.optString("cookies_include", "true"));
        this.f135981g = jSONObject.optString("request_id");
        this.f135978d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f135975a = strOptString == null ? null : Arrays.asList(strOptString.split(Constants.SEPARATOR_COMMA));
        this.f135984j = jSONObject.optInt(BLiveRightItem.PERIOD_VALID, 0) == 1 ? -2 : 1;
        this.f135982h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f135985k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f135986l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f135987m = jSONObject.optString("pool_key");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m156593j(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final int m156594a() {
        return this.f135984j;
    }

    /* JADX INFO: renamed from: b */
    public final String m156595b() {
        return this.f135976b;
    }

    /* JADX INFO: renamed from: c */
    public final String m156596c() {
        return this.f135987m;
    }

    /* JADX INFO: renamed from: d */
    public final String m156597d() {
        return this.f135977c;
    }

    /* JADX INFO: renamed from: e */
    public final String m156598e() {
        return this.f135983i;
    }

    /* JADX INFO: renamed from: f */
    public final List m156599f() {
        return this.f135975a;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m156600g() {
        return this.f135985k;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m156601h() {
        return this.f135980f;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m156602i() {
        return this.f135979e;
    }
}
