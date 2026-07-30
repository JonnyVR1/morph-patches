package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f70 {

    /* JADX INFO: renamed from: a */
    public final int f96185a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f96186b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final String f96187c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final f70 f96188d;

    public f70(int i, @NonNull String str, @NonNull String str2, @Nullable f70 f70Var) {
        this.f96185a = i;
        this.f96186b = str;
        this.f96187c = str2;
        this.f96188d = f70Var;
    }

    /* JADX INFO: renamed from: a */
    public int m119703a() {
        return this.f96185a;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m119704b() {
        return this.f96187c;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m119705c() {
        return this.f96186b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final zze m119706d() {
        zze zzeVar;
        f70 f70Var = this.f96188d;
        if (f70Var == null) {
            zzeVar = null;
        } else {
            zzeVar = new zze(f70Var.f96185a, f70Var.f96186b, f70Var.f96187c, null, null);
        }
        return new zze(this.f96185a, this.f96186b, this.f96187c, zzeVar, null);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public JSONObject mo119707e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f96185a);
        jSONObject.put("Message", this.f96186b);
        jSONObject.put("Domain", this.f96187c);
        f70 f70Var = this.f96188d;
        if (f70Var == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", f70Var.mo119707e());
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return mo119707e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public f70(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, null);
    }
}
