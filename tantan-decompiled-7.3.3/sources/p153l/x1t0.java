package p153l;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x1t0 {

    /* JADX INFO: renamed from: a */
    public final boolean f192094a;

    /* JADX INFO: renamed from: b */
    public final String f192095b;

    public x1t0(boolean z, String str) {
        this.f192094a = z;
        this.f192095b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static x1t0 m209104a(JSONObject jSONObject) {
        return new x1t0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
