package p149l;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zgv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f203099a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f203100b;

    public zgv0(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f203099a = jSONObject;
        this.f203100b = jSONObject2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        JSONObject jSONObject = this.f203099a;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f203100b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
