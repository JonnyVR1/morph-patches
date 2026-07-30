package p153l;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bzv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f79178a;

    public bzv0(Context context) {
        this.f79178a = z4t0.m218612c(context);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m107258a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f79178a);
        } catch (JSONException unused) {
            d2v0.m113737k("Failed putting version constants.");
        }
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 46;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168421ob)).booleanValue() ? pvw0.m173981h(new vuv0() { // from class: l.qxv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
            }
        }) : pvw0.m173981h(new vuv0() { // from class: l.azv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                this.f74193a.m107258a((JSONObject) obj);
            }
        });
    }
}
