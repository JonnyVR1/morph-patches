package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class exv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final String f96353a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final int f96354b;

    public exv0(@Nullable String str, int i) {
        this.f96353a = str;
        this.f96354b = i;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f96353a) || this.f96354b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectM198934f = v0t0.m198934f(jSONObject, "pii");
            jSONObjectM198934f.put("pvid", this.f96353a);
            jSONObjectM198934f.put("pvid_s", this.f96354b);
        } catch (JSONException e) {
            d2v0.m113738l("Failed putting gms core app set ID info.", e);
        }
    }
}
