package p153l;

import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kob0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final String f127709a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final String f127710b;

    /* JADX INFO: renamed from: c */
    @NonNull
    private final String f127711c;

    /* JADX INFO: renamed from: d */
    @NonNull
    private final String f127712d;

    public kob0(String str, String str2, String str3, String str4) {
        this.f127712d = str;
        this.f127711c = str2;
        this.f127709a = str3;
        this.f127710b = str4;
    }

    /* JADX INFO: renamed from: a */
    public static kob0 m150589a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("ctProviderClassName");
            String string2 = jSONObject.getString("messagingSDKClassName");
            return new kob0(jSONObject.getString("type"), jSONObject.getString("tokenPrefKey"), string, string2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m150590b() {
        return this.f127709a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m150591c() {
        return this.f127710b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m150592d() {
        return this.f127711c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m150593e() {
        return this.f127712d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kob0)) {
            return false;
        }
        kob0 kob0Var = (kob0) obj;
        return Objects.equals(this.f127709a, kob0Var.f127709a) && Objects.equals(this.f127710b, kob0Var.f127710b) && Objects.equals(this.f127711c, kob0Var.f127711c) && Objects.equals(this.f127712d, kob0Var.f127712d);
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m150594f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ctProviderClassName", this.f127709a);
            jSONObject.put("messagingSDKClassName", this.f127710b);
            jSONObject.put("tokenPrefKey", this.f127711c);
            jSONObject.put("type", this.f127712d);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        return Objects.hash(this.f127709a, this.f127710b, this.f127711c, this.f127712d);
    }

    @NonNull
    public String toString() {
        return " [PushType:" + this.f127712d + "] ";
    }
}
