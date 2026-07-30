package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.data.Device;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class pzv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f154981a;

    public pzv0(Bundle bundle) {
        this.f154981a = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f154981a != null) {
            try {
                v0t0.m198934f(v0t0.m198934f(jSONObject, Device.TYPE), "play_store").put("parental_controls", k6s0.m148569b().m167055j(this.f154981a));
            } catch (JSONException unused) {
                d2v0.m113737k("Failed putting parental controls bundle.");
            }
        }
    }
}
