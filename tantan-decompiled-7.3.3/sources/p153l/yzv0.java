package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yzv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ yzv0 f202230a = new yzv0();

    @Override // p153l.wuv0
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173981h(new vuv0() { // from class: l.zzv0
            @Override // p153l.vuv0
            /* JADX INFO: renamed from: a */
            public final void mo99378a(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
