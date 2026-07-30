package p153l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u6w0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f177809a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f177810b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f177811c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f177812d;

    public u6w0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectM198936h = v0t0.m198936h(jsonReader);
        this.f177812d = jSONObjectM198936h;
        this.f177809a = jSONObjectM198936h.optString("ad_html", null);
        this.f177810b = jSONObjectM198936h.optString("ad_base_url", null);
        this.f177811c = jSONObjectM198936h.optJSONObject("ad_json");
    }
}
