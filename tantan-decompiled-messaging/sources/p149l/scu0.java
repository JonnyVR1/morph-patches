package p149l;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class scu0 extends tcu0 {

    /* JADX INFO: renamed from: b */
    public final JSONObject f163770b;

    /* JADX INFO: renamed from: c */
    public final boolean f163771c;

    /* JADX INFO: renamed from: d */
    public final boolean f163772d;

    /* JADX INFO: renamed from: e */
    public final boolean f163773e;

    /* JADX INFO: renamed from: f */
    public final boolean f163774f;

    /* JADX INFO: renamed from: g */
    public final String f163775g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final JSONObject f163776h;

    public scu0(kxv0 kxv0Var, JSONObject jSONObject) {
        super(kxv0Var);
        this.f163770b = prs0.m171066g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f163771c = prs0.m171070k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f163772d = prs0.m171070k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f163773e = prs0.m171070k(false, jSONObject, "enable_omid");
        this.f163775g = prs0.m171061b("", jSONObject, "watermark_overlay_png_base64");
        this.f163774f = jSONObject.optJSONObject("overlay") != null;
        this.f163776h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132137Y4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: a */
    public final lyv0 mo183423a() {
        JSONObject jSONObject = this.f163776h;
        return jSONObject != null ? new lyv0(jSONObject) : this.f169477a.f125179W;
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: b */
    public final String mo183424b() {
        return this.f163775g;
    }

    @Override // p149l.tcu0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final JSONObject mo183425c() {
        JSONObject jSONObject = this.f163770b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f169477a.f125157A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: d */
    public final boolean mo183426d() {
        return this.f163773e;
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: e */
    public final boolean mo183427e() {
        return this.f163771c;
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: f */
    public final boolean mo183428f() {
        return this.f163772d;
    }

    @Override // p149l.tcu0
    /* JADX INFO: renamed from: g */
    public final boolean mo183429g() {
        return this.f163774f;
    }
}
