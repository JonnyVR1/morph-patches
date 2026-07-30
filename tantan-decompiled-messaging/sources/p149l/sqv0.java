package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sqv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ sqv0 f166025a = new sqv0();

    @Override // p149l.qlv0
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142235h(new plv0() { // from class: l.tqv0
            @Override // p149l.plv0
            /* JADX INFO: renamed from: a */
            public final void mo96132a(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
