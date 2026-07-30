package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s4t0 {

    /* JADX INFO: renamed from: a */
    public final List f166276a;

    /* JADX INFO: renamed from: b */
    public final String f166277b;

    /* JADX INFO: renamed from: c */
    public final String f166278c;

    /* JADX INFO: renamed from: d */
    public final String f166279d;

    /* JADX INFO: renamed from: e */
    public final boolean f166280e;

    /* JADX INFO: renamed from: f */
    public final boolean f166281f;

    /* JADX INFO: renamed from: g */
    public final String f166282g;

    /* JADX INFO: renamed from: h */
    public final String f166283h;

    /* JADX INFO: renamed from: i */
    public final String f166284i;

    /* JADX INFO: renamed from: j */
    public final int f166285j;

    /* JADX INFO: renamed from: k */
    public final JSONObject f166286k;

    /* JADX INFO: renamed from: l */
    public final String f166287l;

    /* JADX INFO: renamed from: m */
    public final String f166288m;

    public s4t0(JSONObject jSONObject) {
        this.f166284i = jSONObject.optString("url");
        this.f166277b = jSONObject.optString("base_uri");
        this.f166278c = jSONObject.optString("post_parameters");
        this.f166280e = m184588j(jSONObject.optString("drt_include"));
        this.f166281f = m184588j(jSONObject.optString("cookies_include", "true"));
        this.f166282g = jSONObject.optString("request_id");
        this.f166279d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f166276a = strOptString == null ? null : Arrays.asList(strOptString.split(Constants.SEPARATOR_COMMA));
        this.f166285j = jSONObject.optInt(BLiveRightItem.PERIOD_VALID, 0) == 1 ? -2 : 1;
        this.f166283h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f166286k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f166287l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f166288m = jSONObject.optString("pool_key");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m184588j(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final int m184589a() {
        return this.f166285j;
    }

    /* JADX INFO: renamed from: b */
    public final String m184590b() {
        return this.f166277b;
    }

    /* JADX INFO: renamed from: c */
    public final String m184591c() {
        return this.f166288m;
    }

    /* JADX INFO: renamed from: d */
    public final String m184592d() {
        return this.f166278c;
    }

    /* JADX INFO: renamed from: e */
    public final String m184593e() {
        return this.f166284i;
    }

    /* JADX INFO: renamed from: f */
    public final List m184594f() {
        return this.f166276a;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m184595g() {
        return this.f166286k;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m184596h() {
        return this.f166281f;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m184597i() {
        return this.f166280e;
    }
}
