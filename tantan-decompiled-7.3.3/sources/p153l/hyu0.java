package p153l;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hyu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Long f112163a;

    /* JADX INFO: renamed from: b */
    public final String f112164b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f112165c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Integer f112166d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f112167e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Integer f112168f;

    public /* synthetic */ hyu0(String str, gyu0 gyu0Var) {
        this.f112164b = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ String m137775a(hyu0 hyu0Var) {
        String str = (String) jas0.m144075c().m176505a(sgs0.f168021I9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", hyu0Var.f112163a);
            jSONObject.put("eventCategory", hyu0Var.f112164b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, hyu0Var.f112165c);
            jSONObject.putOpt("errorCode", hyu0Var.f112166d);
            jSONObject.putOpt("rewardType", hyu0Var.f112167e);
            jSONObject.putOpt("rewardAmount", hyu0Var.f112168f);
        } catch (JSONException unused) {
            dct0.m115298g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
