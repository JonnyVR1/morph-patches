package p149l;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bpu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Long f76676a;

    /* JADX INFO: renamed from: b */
    public final String f76677b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f76678c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Integer f76679d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f76680e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Integer f76681f;

    public /* synthetic */ bpu0(String str, apu0 apu0Var) {
        this.f76677b = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ String m103088a(bpu0 bpu0Var) {
        String str = (String) d1s0.m109677c().m144697a(m7s0.f131950I9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", bpu0Var.f76676a);
            jSONObject.put("eventCategory", bpu0Var.f76677b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, bpu0Var.f76678c);
            jSONObject.putOpt("errorCode", bpu0Var.f76679d);
            jSONObject.putOpt("rewardType", bpu0Var.f76680e);
            jSONObject.putOpt("rewardAmount", bpu0Var.f76681f);
        } catch (JSONException unused) {
            x2t0.m206869g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
