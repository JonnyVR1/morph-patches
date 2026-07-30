package p153l;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rkw {

    /* JADX INFO: renamed from: a */
    public String f163651a;

    /* JADX INFO: renamed from: b */
    public String f163652b;

    /* JADX INFO: renamed from: c */
    public int f163653c;

    /* JADX INFO: renamed from: d */
    public String f163654d;

    /* JADX INFO: renamed from: a */
    public static rkw m181883a(JSONObject jSONObject) {
        rkw rkwVar = new rkw();
        rkwVar.f163651a = jSONObject.optString("text");
        rkwVar.f163652b = jSONObject.optString("icon");
        rkwVar.f163653c = jSONObject.optInt("action", 0);
        rkwVar.f163654d = jSONObject.optString("callback");
        return rkwVar;
    }
}
