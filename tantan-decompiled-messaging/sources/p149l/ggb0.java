package p149l;

import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ggb0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final String f102484a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final String f102485b;

    /* JADX INFO: renamed from: c */
    @NonNull
    private final String f102486c;

    /* JADX INFO: renamed from: d */
    @NonNull
    private final String f102487d;

    public ggb0(String str, String str2, String str3, String str4) {
        this.f102487d = str;
        this.f102486c = str2;
        this.f102484a = str3;
        this.f102485b = str4;
    }

    /* JADX INFO: renamed from: a */
    public static ggb0 m125955a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("ctProviderClassName");
            String string2 = jSONObject.getString("messagingSDKClassName");
            return new ggb0(jSONObject.getString("type"), jSONObject.getString("tokenPrefKey"), string, string2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m125956b() {
        return this.f102484a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m125957c() {
        return this.f102485b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m125958d() {
        return this.f102486c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m125959e() {
        return this.f102487d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggb0)) {
            return false;
        }
        ggb0 ggb0Var = (ggb0) obj;
        return Objects.equals(this.f102484a, ggb0Var.f102484a) && Objects.equals(this.f102485b, ggb0Var.f102485b) && Objects.equals(this.f102486c, ggb0Var.f102486c) && Objects.equals(this.f102487d, ggb0Var.f102487d);
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m125960f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ctProviderClassName", this.f102484a);
            jSONObject.put("messagingSDKClassName", this.f102485b);
            jSONObject.put("tokenPrefKey", this.f102486c);
            jSONObject.put("type", this.f102487d);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        return Objects.hash(this.f102484a, this.f102485b, this.f102486c, this.f102487d);
    }

    @NonNull
    public String toString() {
        return " [PushType:" + this.f102487d + "] ";
    }
}
