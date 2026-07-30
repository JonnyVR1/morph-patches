package p153l;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ylu0 extends zlu0 {

    /* JADX INFO: renamed from: b */
    public final JSONObject f200585b;

    /* JADX INFO: renamed from: c */
    public final boolean f200586c;

    /* JADX INFO: renamed from: d */
    public final boolean f200587d;

    /* JADX INFO: renamed from: e */
    public final boolean f200588e;

    /* JADX INFO: renamed from: f */
    public final boolean f200589f;

    /* JADX INFO: renamed from: g */
    public final String f200590g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final JSONObject f200591h;

    public ylu0(q6w0 q6w0Var, JSONObject jSONObject) {
        super(q6w0Var);
        this.f200585b = v0t0.m198935g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f200586c = v0t0.m198939k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f200587d = v0t0.m198939k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f200588e = v0t0.m198939k(false, jSONObject, "enable_omid");
        this.f200590g = v0t0.m198930b("", jSONObject, "watermark_overlay_png_base64");
        this.f200589f = jSONObject.optJSONObject("overlay") != null;
        this.f200591h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168208Y4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: a */
    public final r7w0 mo216633a() {
        JSONObject jSONObject = this.f200591h;
        return jSONObject != null ? new r7w0(jSONObject) : this.f205009a.f155869W;
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: b */
    public final String mo216634b() {
        return this.f200590g;
    }

    @Override // p153l.zlu0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final JSONObject mo216635c() {
        JSONObject jSONObject = this.f200585b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f205009a.f155847A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: d */
    public final boolean mo216636d() {
        return this.f200588e;
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: e */
    public final boolean mo216637e() {
        return this.f200586c;
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: f */
    public final boolean mo216638f() {
        return this.f200587d;
    }

    @Override // p153l.zlu0
    /* JADX INFO: renamed from: g */
    public final boolean mo216639g() {
        return this.f200589f;
    }
}
