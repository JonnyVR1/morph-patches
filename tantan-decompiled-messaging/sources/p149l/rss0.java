package p149l;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class rss0 {

    /* JADX INFO: renamed from: a */
    public final boolean f160891a;

    /* JADX INFO: renamed from: b */
    public final String f160892b;

    public rss0(boolean z, String str) {
        this.f160891a = z;
        this.f160892b = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static rss0 m180718a(JSONObject jSONObject) {
        return new rss0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
