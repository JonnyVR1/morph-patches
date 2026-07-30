package p149l;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vpv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f182528a;

    public vpv0(Context context) {
        this.f182528a = tvs0.m190783c(context);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m199386a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f182528a);
        } catch (JSONException unused) {
            xsu0.m210834k("Failed putting version constants.");
        }
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 46;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132350ob)).booleanValue() ? jmw0.m142235h(new plv0() { // from class: l.kov0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
            }
        }) : jmw0.m142235h(new plv0() { // from class: l.upv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                this.f177678a.m199386a((JSONObject) obj);
            }
        });
    }
}
