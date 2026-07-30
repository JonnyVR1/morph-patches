package p153l;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fqv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f100340a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f100341b;

    public fqv0(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f100340a = jSONObject;
        this.f100341b = jSONObject2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        JSONObject jSONObject = this.f100340a;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f100341b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
