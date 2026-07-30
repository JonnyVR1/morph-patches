package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b70 {

    /* JADX INFO: renamed from: a */
    public final int f75238a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f75239b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final String f75240c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final b70 f75241d;

    public b70(int i, @NonNull String str, @NonNull String str2, @Nullable b70 b70Var) {
        this.f75238a = i;
        this.f75239b = str;
        this.f75240c = str2;
        this.f75241d = b70Var;
    }

    /* JADX INFO: renamed from: a */
    public int m102802a() {
        return this.f75238a;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m102803b() {
        return this.f75240c;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m102804c() {
        return this.f75239b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final zze m102805d() {
        zze zzeVar;
        b70 b70Var = this.f75241d;
        if (b70Var == null) {
            zzeVar = null;
        } else {
            zzeVar = new zze(b70Var.f75238a, b70Var.f75239b, b70Var.f75240c, null, null);
        }
        return new zze(this.f75238a, this.f75239b, this.f75240c, zzeVar, null);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public JSONObject mo102806e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f75238a);
        jSONObject.put("Message", this.f75239b);
        jSONObject.put("Domain", this.f75240c);
        b70 b70Var = this.f75241d;
        if (b70Var == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", b70Var.mo102806e());
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return mo102806e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public b70(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, null);
    }
}
