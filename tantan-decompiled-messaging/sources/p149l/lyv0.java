package p149l;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lyv0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f130610a;

    public lyv0(JSONObject jSONObject) {
        this.f130610a = jSONObject;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m152299a() {
        if (m152300b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m152300b() {
        int iOptInt = this.f130610a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
