package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.mmutil.log.Log4Android;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class shp0 {

    /* JADX INFO: renamed from: a */
    private float f164622a = -1.0f;

    /* JADX INFO: renamed from: b */
    private boolean f164623b = false;

    /* JADX INFO: renamed from: a */
    public void m184262a(boolean z) {
        this.f164623b = z;
    }

    /* JADX INFO: renamed from: b */
    public void m184263b(float f) {
        this.f164622a = f;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, Float.valueOf(this.f164622a));
            jSONObject.put("is_plugged", this.f164623b);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log4Android.m18417f().m18422e(e);
            return "";
        }
    }
}
