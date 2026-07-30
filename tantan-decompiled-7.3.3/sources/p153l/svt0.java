package p153l;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class svt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f170872a;

    public svt0(kqx0 kqx0Var) {
        this.f170872a = kqx0Var;
    }

    @Override // p153l.kqx0
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((b0u0) this.f170872a).m101357a().f155847A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
