package p149l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oxv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f146253a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f146254b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f146255c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f146256d;

    public oxv0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectM171067h = prs0.m171067h(jsonReader);
        this.f146256d = jSONObjectM171067h;
        this.f146253a = jSONObjectM171067h.optString("ad_html", null);
        this.f146254b = jSONObjectM171067h.optString("ad_base_url", null);
        this.f146255c = jSONObjectM171067h.optJSONObject("ad_json");
    }
}
