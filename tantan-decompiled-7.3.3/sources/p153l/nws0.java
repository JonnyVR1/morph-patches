package p153l;

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
public final class nws0 {

    /* JADX INFO: renamed from: a */
    public final String f144009a;

    /* JADX INFO: renamed from: b */
    public final String f144010b;

    /* JADX INFO: renamed from: c */
    public final List f144011c;

    /* JADX INFO: renamed from: d */
    public final String f144012d;

    /* JADX INFO: renamed from: e */
    public final String f144013e;

    /* JADX INFO: renamed from: f */
    public final List f144014f;

    /* JADX INFO: renamed from: g */
    public final List f144015g;

    /* JADX INFO: renamed from: h */
    public final List f144016h;

    /* JADX INFO: renamed from: i */
    public final List f144017i;

    /* JADX INFO: renamed from: j */
    public final List f144018j;

    /* JADX INFO: renamed from: k */
    public final String f144019k;

    /* JADX INFO: renamed from: l */
    public final List f144020l;

    /* JADX INFO: renamed from: m */
    public final List f144021m;

    /* JADX INFO: renamed from: n */
    public final List f144022n;

    /* JADX INFO: renamed from: o */
    public final String f144023o;

    /* JADX INFO: renamed from: p */
    public final String f144024p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final String f144025q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final String f144026r;

    /* JADX INFO: renamed from: s */
    public final String f144027s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public final List f144028t;

    /* JADX INFO: renamed from: u */
    public final String f144029u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final String f144030v;

    public nws0(JSONObject jSONObject) throws JSONException {
        List listM174090a;
        this.f144010b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f144011c = Collections.unmodifiableList(arrayList);
        this.f144012d = jSONObject.optString("allocation_id", null);
        bxy0.m106925i();
        this.f144014f = pws0.m174090a(jSONObject, "clickurl");
        bxy0.m106925i();
        this.f144015g = pws0.m174090a(jSONObject, "imp_urls");
        bxy0.m106925i();
        this.f144016h = pws0.m174090a(jSONObject, "downloaded_imp_urls");
        bxy0.m106925i();
        this.f144018j = pws0.m174090a(jSONObject, "fill_urls");
        bxy0.m106925i();
        this.f144020l = pws0.m174090a(jSONObject, "video_start_urls");
        bxy0.m106925i();
        this.f144022n = pws0.m174090a(jSONObject, "video_complete_urls");
        bxy0.m106925i();
        this.f144021m = pws0.m174090a(jSONObject, "video_reward_urls");
        this.f144023o = jSONObject.optString(FirebaseAnalytics.Param.TRANSACTION_ID);
        this.f144024p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            bxy0.m106925i();
            listM174090a = pws0.m174090a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listM174090a = null;
        }
        this.f144017i = listM174090a;
        this.f144009a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f144019k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f144013e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f144025q = jSONObject.optString("html_template", null);
        this.f144026r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f144027s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        bxy0.m106925i();
        this.f144028t = pws0.m174090a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f144029u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f144030v = jSONObject.optString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
