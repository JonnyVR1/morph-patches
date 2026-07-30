package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hns0 {

    /* JADX INFO: renamed from: a */
    public final String f108682a;

    /* JADX INFO: renamed from: b */
    public final String f108683b;

    /* JADX INFO: renamed from: c */
    public final List f108684c;

    /* JADX INFO: renamed from: d */
    public final String f108685d;

    /* JADX INFO: renamed from: e */
    public final String f108686e;

    /* JADX INFO: renamed from: f */
    public final List f108687f;

    /* JADX INFO: renamed from: g */
    public final List f108688g;

    /* JADX INFO: renamed from: h */
    public final List f108689h;

    /* JADX INFO: renamed from: i */
    public final List f108690i;

    /* JADX INFO: renamed from: j */
    public final List f108691j;

    /* JADX INFO: renamed from: k */
    public final String f108692k;

    /* JADX INFO: renamed from: l */
    public final List f108693l;

    /* JADX INFO: renamed from: m */
    public final List f108694m;

    /* JADX INFO: renamed from: n */
    public final List f108695n;

    /* JADX INFO: renamed from: o */
    public final String f108696o;

    /* JADX INFO: renamed from: p */
    public final String f108697p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final String f108698q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final String f108699r;

    /* JADX INFO: renamed from: s */
    public final String f108700s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final List f108701t;

    /* JADX INFO: renamed from: u */
    public final String f108702u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final String f108703v;

    public hns0(JSONObject jSONObject) throws JSONException {
        List listM142389a;
        this.f108683b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f108684c = Collections.unmodifiableList(arrayList);
        this.f108685d = jSONObject.optString("allocation_id", null);
        vny0.m199071i();
        this.f108687f = jns0.m142389a(jSONObject, "clickurl");
        vny0.m199071i();
        this.f108688g = jns0.m142389a(jSONObject, "imp_urls");
        vny0.m199071i();
        this.f108689h = jns0.m142389a(jSONObject, "downloaded_imp_urls");
        vny0.m199071i();
        this.f108691j = jns0.m142389a(jSONObject, "fill_urls");
        vny0.m199071i();
        this.f108693l = jns0.m142389a(jSONObject, "video_start_urls");
        vny0.m199071i();
        this.f108695n = jns0.m142389a(jSONObject, "video_complete_urls");
        vny0.m199071i();
        this.f108694m = jns0.m142389a(jSONObject, "video_reward_urls");
        this.f108696o = jSONObject.optString(FirebaseAnalytics.Param.TRANSACTION_ID);
        this.f108697p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            vny0.m199071i();
            listM142389a = jns0.m142389a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listM142389a = null;
        }
        this.f108690i = listM142389a;
        this.f108682a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f108692k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f108686e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f108698q = jSONObject.optString("html_template", null);
        this.f108699r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f108700s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        vny0.m199071i();
        this.f108701t = jns0.m142389a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f108702u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f108703v = jSONObject.optString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
