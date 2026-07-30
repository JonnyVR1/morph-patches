package p153l;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r7w0 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f161648a;

    public r7w0(JSONObject jSONObject) {
        this.f161648a = jSONObject;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m180165a() {
        if (m180166b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m180166b() {
        int iOptInt = this.f161648a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
